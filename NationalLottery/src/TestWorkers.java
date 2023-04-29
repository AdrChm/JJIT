// Create one of each type of worker,
// and get them to fill the machine of a game.
public class TestWorkers
{
    public static void main(String[] args) throws BallContainerException
    {
        testWorker(new Worker("May Kit Dewitt"),
                new Game("Lott O'Luck Larry", 3, "Slippery's Mile", 2));
        testWorker(new TraineeWorker("Darwin Marbest", 0.75),
                new Game("13th Time Lucky", 5, "Oooz OK Lose", 2));

    } // main

    // Make tge given worker fill the given name,
    // reporting values before and after.
    public static void testWorker(Worker worker, Game game) throws BallContainerException
    {
        System.out.println("-----------------------------------");
        System.out.println("Start with");
        System.out.println(game);

        System.out.println("Balls added by");
        System.out.println(worker);

        worker.fillMachine(game);
        System.out.println(game);
        System.out.println(worker);

    } // testWorker

} // class TestWorkers
