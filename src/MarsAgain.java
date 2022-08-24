public class MarsAgain {
    public static void main(String[] args) throws InterruptedException {

        String ColonyName = "NoIntentionOfColonizing";
        int ShipPopulation = 300;
        double ShipFood = 4000.00;
        boolean Landing = true;

        ShipFood = ShipFood - (ShipPopulation * 0.75);
        ShipFood = ShipFood - (ShipPopulation * 0.75);
        System.out.println(ShipFood);

        ShipFood = (ShipFood * 1.5);
        System.out.println("After finding food, the amount is now " + ShipFood);
        ShipPopulation = ShipPopulation + 5;

        String LandingLocation = "TheOcean";
        if (LandingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }
       Landing = LandingCheck(100);
        new guessingGame();
        new MarsExpedition();
        new FindingLists();
    }
        public static boolean LandingCheck(int Loops) throws InterruptedException
        {
        for (int i=0; i <=Loops; i++)
            if (((i/3) == 0) && (i/5== 0)) {
                System.out.println("Keep Center");
            } else if ((i%5)==0) {
                System.out.println("Right");
            } else if ((i%3) == 0) {
                System.out.println("Left");
            }else
                System.out.println("Calculating");
Thread.sleep(250);
System.out.println("Landed");
        return false;
        }
}
