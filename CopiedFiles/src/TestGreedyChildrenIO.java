import java.io.*;

// Program to test GreedyChildren and IceCreamParlour classes ability
// to save and read data from the file.
public class TestGreedyChildrenIO
{
    // Every time new element is created, it's saved in array to save it later into
    // the output file, using assigned index.
    private static int ELEMENTS_STARTING_SIZE = 100;

    // Number of created children, next array free index.
    private static int childrenCreatedSoFar = 0;
    private static GreedyChild [] children = new GreedyChild[ELEMENTS_STARTING_SIZE];

    // Number of created parlours, next array free index.
    private static int parloursCreatedSoFar = 0;
    private static IceCreamParlour [] parlours = new IceCreamParlour[ELEMENTS_STARTING_SIZE];

    // Private helper method to make a delivery and report it.
    public static void deliver(IceCreamParlour parlour, double amount)
    {
        System.out.println(parlour);
        System.out.println("Accepted delivery of " + amount);
        parlour.acceptDelivery(amount);
        System.out.println("Result: " + parlour);
        System.out.println();
    } // deliver

    // Private helper method to have a child eat at a parlour.
    public static void eat(GreedyChild child, double amount,
                           IceCreamParlour parlour)
    {
        System.out.println(child);
        System.out.println(" is entering " + parlour);
        child.enterParlour(parlour);
        System.out.println(child);
        System.out.println(" is entering " + amount);
        child.tryToEat(amount);
        System.out.println(child);
        System.out.println("Result: " + child);
        System.out.println();
        child.leaveParlour();

    } // eat

    // The main method tells the 'story'.
    public static void main(String [] args) throws IOException
    {


        // Beginning of the story - no need to read the file.
        System.out.println("Greedy children: ");
        GreedyChild child1 = new GreedyChild("Bloated Basil", 20);
        System.out.println(child1);
        System.out.println("Making child with a random capacity less than "
                + GreedyChild.MAXIMUM_RANDOM_STOMACH_SIZE);
        GreedyChild child2 = new GreedyChild("Cautious Cathy");
        System.out.println(child2);
        GreedyChild child3 = new GreedyChild("Lanky Larry", 4);
        System.out.println(child3);
        System.out.println();

        // saving Children
        saveElement(child1);
        saveElement(child2);
        saveElement(child3);

        System.out.println("Ice cream parlours:");
        IceCreamParlour parlour1 = new IceCreamParlour("Glacial Palacial");
        System.out.println(parlour1);
        IceCreamParlour parlour2 = new IceCreamParlour("Nice 'n' Icey");
        System.out.println(parlour2);
        IceCreamParlour parlour3 = new IceCreamParlour("Creamy Creamy Cup");
        System.out.println(parlour3);
        System.out.println();

        // saving Parlours
        saveElement(parlour1);
        saveElement(parlour2);
        saveElement(parlour3);

        System.out.println("Deliveries:");
        System.out.println();
        deliver(parlour1, 50);
        deliver(parlour2, 10);
        deliver(parlour3, 30);
        System.out.println("Eating:");
        System.out.println();
        eat(child1, 15, parlour1);
        eat(child2, 1, parlour1);
        eat(child3, 2, parlour1);
        eat(child1, 8, parlour2);
        eat(child2, 1, parlour2);
        eat(child3, 2, parlour2);
        eat(child1, 10, parlour3);
        eat(child2, 1, parlour3);
        eat(child3, 2, parlour3);

        // End of the first part of the story - data is saved.
        // All children are assumed to leave parlour they are in.
        try
        {
            saveHistory(new DataOutputStream(new FileOutputStream("history.dat")));

        } // try
        catch (IOException exception)
        {
            System.err.println("File already exist " + exception.getMessage());
        } // catch
        // New day comes and our story continues.
        DataInputStream input = null;
        try
        {
            loadHistory(new DataInputStream(new FileInputStream("history.dat")));

            GreedyChild newGuy = new GreedyChild("Bączek");
            IceCreamParlour newParlour = new IceCreamParlour("Zgierz");
            saveElement(newGuy);
            saveElement(newParlour);

            System.out.println("Deliveries:");
            System.out.println();
            for (int parlour = 0; parlour < parloursCreatedSoFar; parlour++)
                deliver(parlours[parlour], parlour * 50 + 50);

            System.out.println("Ok let's go:");
            System.out.println();
            for (int child = 0; child < childrenCreatedSoFar; child++)
                eat(children[child], child * 10 + 10, parlours[child]);

            saveHistory(new DataOutputStream(new FileOutputStream("history.dat")));
            loadHistory(new DataInputStream(new FileInputStream("history.dat")));

            System.out.println("Story ends here:");
            for (int objectIndex = 0; objectIndex < childrenCreatedSoFar + parloursCreatedSoFar; objectIndex++)
            {
                // GreedyChild
                if(objectIndex < childrenCreatedSoFar)
                    System.out.println(children[objectIndex]);
                // IceCreamParlour
                else
                    System.out.println(parlours[objectIndex - childrenCreatedSoFar]);
            } // for

        } // try
        catch (IOException exception)
        {
            System.err.println("File doesn't exist " + exception.getMessage());
        } // catch
    } // main

    // Helper method to keep track of created objects bo be saved later.
    private static void saveElement(Object object)
    {
        if (object instanceof GreedyChild)
        {
            if(childrenCreatedSoFar == children.length)
                throw new IndexOutOfBoundsException("To many children already created.");

            children[childrenCreatedSoFar] = (GreedyChild) object;
            childrenCreatedSoFar++;
        } // if
        // Parlour
        else
        {
            if (parloursCreatedSoFar == parlours.length)
                throw new IndexOutOfBoundsException("To many parlours already created.");

            parlours[parloursCreatedSoFar] = (IceCreamParlour) object;
            parloursCreatedSoFar++;
        } // else

    } // saveElement

    // Saves state of the objects in the output file.
    private static void saveHistory(DataOutputStream output) throws IOException
    {
        // Number of saved objects is first element of the file
        output.writeInt(childrenCreatedSoFar + parloursCreatedSoFar);

        for (int objectIndex = 0; objectIndex < childrenCreatedSoFar + parloursCreatedSoFar; objectIndex++)
        {
            // GreedyChild
            if (objectIndex < childrenCreatedSoFar)
            {
                output.writeByte(0);
                children[objectIndex].saveGreedyChild(output);
            } // if
            // IceCreamParlour
            else
            {
                output.writeByte(1);
                parlours[objectIndex - childrenCreatedSoFar].saveIceCreamParlour(output);
            } // else

        } // for

        output.close();
    } // saveHistory

    // Load objects from the input file.
    private static void loadHistory(DataInputStream input) throws IOException
    {
        // This is necessary, as new load clears current state.
        childrenCreatedSoFar = 0;
        parloursCreatedSoFar = 0;

        // First part of the file is elements number.
        int elementsToRead = input.readInt();

        for (int objectIndex = 0; objectIndex < elementsToRead; objectIndex++)
        {
            // GreedyChild
            if(input.readByte() == 0)
            {
                children[childrenCreatedSoFar] = new GreedyChild(input);
                childrenCreatedSoFar++;
            } // if
            // IceCreamParlour
            else
            {
                parlours[parloursCreatedSoFar] = new IceCreamParlour(input);
                parloursCreatedSoFar++;
            } // else

        } // for
        input.close();
    } // loadHistory

} // class TestGreedyChildrenIO
