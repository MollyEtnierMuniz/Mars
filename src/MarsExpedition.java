import java.util.Scanner;

public class MarsExpedition {
    public static void main(String[] args) {
//        public MarsExpedition(){}
        Scanner input = new Scanner(System.in);
        System.out.println("Expedition prep program starting...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Ready");
        System.out.println("Hello there, what's your name?");
        String name =input.nextLine();
        System.out.println("Hi, "+name+". Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");

        String excited = input.nextLine();
        if (excited.equalsIgnoreCase("Y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        }else{
            System.out.println("To bad you are team leader. You have to go.");
        }
        System.out.println("How many people do you want on your expedition team?");
        int teamSize = input.nextInt();
        input.nextLine();
        if (teamSize>2){
            System.out.println("That's way to many people. We can only send 2 more members.");
            teamSize=2;
        } else if (teamSize<2) {
            System.out.println("That's not enough people. We need you and 2 more members.");
            teamSize=2;
        } else if (teamSize==2) {
            System.out.println("That's a perfect-sized team.");
        }

        System.out.println("You are allowed to bring one weapon with you. You know, just in case. What do you want to bring?");

        String weapon = input.nextLine();
        System.out.println("Nice choice, you'll have "+ weapon+ " at your disposal.");
        System.out.println("You have the choice of 3 vehicles” “nA: A Mars Rover” “nB: A Chevy Silverado” “nC: A Honda Civic”");
        String VehicleChoice = input.nextLine();
        if (VehicleChoice.equalsIgnoreCase("A")){
            VehicleChoice ="a Mars Rover";
        } else if (VehicleChoice.equalsIgnoreCase("B")) {
            VehicleChoice = "a Chevy Silverado";
        } else if (VehicleChoice.equalsIgnoreCase("C")) {
            VehicleChoice = "a Honda Civic";
        }else {
            VehicleChoice = ("your normal solution for ambulation.");
        }
        System.out.println("Your expedition team is now ready, \nLed by"+ name+
                 " with "+teamSize+" teammates.” “\nTo explore the surface of Mars using"+ VehicleChoice+ ".  \nExploration team heads out in \n5… \n4… \n3… \n2… \n1… \nGO GO GO! \n"
        );

    }
}
