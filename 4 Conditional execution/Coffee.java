public class Coffee
{
    public static void main(String[] args) {

        //4.2.1

        System.out.println(5>4 == 9 < 15);
        System.out.println(5<4 != 9 > 15);

        //4.2.3

        int x = 1;
        int y = 2;
        int z = 3;

        if(x < y)
        	System.out.println("x is less than y");
        else if (y < z)
        	System.out.println("y is less than z");  
        else
        	System.out.println("I belive in  Father Christmas!");  

        //4.4.1 

        int noOfPeopleInviteToTheStreetParty = Integer.parseInt(args[0]);

        if(noOfPeopleInviteToTheStreetParty > 500);
            System.out.println("You many need an entertaiment license!");   


        //4.4.2 

        if(noOfPeopleInviteToTheStreetParty > 100)
            if(noOfPeopleInviteToTheStreetParty > 500)
                System.out.println("You many need an entertaiment license!");  
            else   
                System.out.println("It will be a fairly quiet party.");      	
    }
}