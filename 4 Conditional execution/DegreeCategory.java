public class DegreeCategory {

    public static void main(String[] args) {

        double score = Double.parseDouble(args[0]);

        if(score >= 70)
            System.out.println("Honours, first class");
        else if(score >= 60)
            System.out.println("Honours, second class, division one");
        else if(score >= 50)
            System.out.println("Honours, second class, division two"); 
        else if(score >= 40)
            System.out.println("Honours, third class");   
        else if(score >= 32)
            System.out.println("Pass / ordinary degree");      	
        else
            System.out.println("Fail");

    }
}