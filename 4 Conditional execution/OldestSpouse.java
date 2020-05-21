public class OldestSpouse {

    public static void main(String[] args) {

        int husbandAge = Integer.parseInt(args[0]);
        int wifeAge = Integer.parseInt(args[1]);

        if(husbandAge > wifeAge)
            System.out.println("The husband is older than the wife");
        else
            System.out.println("The husband is not older than the wife");

    }
}
