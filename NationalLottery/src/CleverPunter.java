// Representation of a clever person playing the lottery who actually knows
// enough to make some guess and score them against a game.
public class CleverPunter extends MoodyPerson
{
    // The game, which is currently being played.
    private Game currentGame = null;

    // The guess of what balls will come out.
    private int[] currentGuess = null;

    // Constructor is given the person's name.
    public CleverPunter(String name)
    {
        super(name);        
    } // CleverPunter

    @Override
    // Returns the name of the type of Person.
    public String getPersonType()
    {
        return "Clever Punter";
    } // getPersonType

    @Override
    // Returns the Person's name, with the current guess included.
    public String getPersonName()
    {
        String result = super.getPersonName();
        if (currentGuess != null && currentGuess.length != 0)
        {
            result += " (guess " + currentGuess[0];
            for (int index = 1; index < currentGuess.length; index++)
                result += ", " + currentGuess[index];
            result += ") ";
        } // if
        return result;

    } // getPersonName

    @Override
    // Returns the Person's current saying.
    public String getCurrentSaying()
    {
        try{
            if (currentGame == null)
            {
                setHappy(false);
                return "I need a game to play!";
            } // if
            else {
                int noOfMatches = getNoOfMatches();
                int noOfNonMatches = currentGame.getRackNoOfBalls() - noOfMatches;

                // Is happy if and only if there are no non-matches.
                setHappy(noOfNonMatches == 0);

                if (noOfMatches == currentGame.getRackSize())
                    return "Yippee!! I've won the jackpot!";
                else if (noOfNonMatches != 0)
                    return "Doh! " + noOfNonMatches + " not matched";
                else if (noOfMatches == 0) // I.e. the rack is still empty.
                    return "I'm excited!";
                else
                    return noOfMatches + " matched so far!";

            } // else

        } // try
        catch(BallContainerException exception)
        {
            System.err.println(exception.getMessage());
            return null;
        } // catch

    } // getCurrentSaying 

    // Helper method to find out how many of the guesses currently match the
    // game rack. Note: this does not get called if currentGuess is null.
    private int getNoOfMatches() throws BallContainerException
    {
        int noMatchedSoFar = 0;
        for (int oneNumber : currentGuess)
            if(currentGame.rackContains(oneNumber))
                noMatchedSoFar++;
        return noMatchedSoFar;
    } // getNoOfMatches

    // Set the game being currently played.
    public void setGame(Game requiredGame) throws BallContainerException
    {
        currentGame = requiredGame;
        currentGuess = new int[currentGame.getRackSize()];
        // An easy way to obtain a guess is to play a mock game!
        Game mockGame = new Game("", currentGame.getMachineSize(),
                                "", currentGame.getRackSize());
        Worker mockWorker = new Worker("");
        mockWorker.fillMachine(mockGame);
        for (int index = 0; index < currentGame.getRackSize(); index++)
            currentGuess[index] = mockGame.ejectBall().getValue();
    } // setGame

} // class CleverPunter
