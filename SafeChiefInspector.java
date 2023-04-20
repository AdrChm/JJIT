public class SafeChiefInspector extends Inspector
{
        public SafeChiefInspector(String name)
        {
            super(name);
        } // SafeChiefInspector

        @Override
        public void interrogate(SafeChiefInspector suspect)
        {
            System.out.println("I am Chief Inspector " + getName() + ", who are you? " + suspect);
        } // interrogate

        public String toString()
        {
            return "I am Chief Inspector " + getName() + "!";
        } // toString

        public static void main(String[] args)
        {
            Inspector clouseau = new Inspector("Clouseau");
            ChiefInspector dreyfus = new ChiefInspector("Dreyfus");

            Inspector.makeInspection(clouseau, dreyfus);
            Inspector.makeInspection(dreyfus, clouseau);
            Inspector.makeInspection(dreyfus, dreyfus);
            System.out.println();
            clouseau.interrogate(dreyfus);
            dreyfus.interrogate(clouseau);
            dreyfus.interrogate(dreyfus);
        } // main

} // class ChiefInspector

