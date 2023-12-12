import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {
        int select;

        Scanner userInput = new Scanner(System.in);
        System.out.println( "Have you decided on a name for your pet?");
        String name = userInput.nextLine();
        
        VirtualPet pet = new VirtualPet(name, 5, 2, 3);

        System.out.println("Since you are now a proud owner of " +name+ ", there are a few things you must know. The pet will need food, water, exercise and lots of love. If you neglect your pet they will surely die and we do not want that.");
        System.out.println("Be sure to check on your pet often.");

        do{
            System.out.println("How will you be taking care of your pet today?");
            System.out.println("1. Feed "+ name +" some food." );
            System.out.println("2. Give "+ name +" some water." );
            System.out.println("3. Play games with "+ name );
            System.out.println("4. Exit" );

            select = Integer.parseInt(userInput.nextLine());

            switch (select) {
                case 1:
                    pet.feedPet();
                    System.out.println(pet.getName()+ " has been fed");
                    System.out.println(pet.getName()+ " has new stats ");
                    System.out.println(pet.getName()+ "energy is: " +pet.getEnergy());
                    System.out.println(pet.getName()+ "hunger is: " +pet.getHunger());
                    System.out.println(pet.getName()+ "energy is: " +pet.getEnergy());
                    break;
                case 2:
                    pet.waterPet();
                    System.out.println("You gave water to " +name);
                    System.out.println(pet.getName()+ " has new stats ");
                    System.out.println(pet.getName()+ "energy is: " +pet.getEnergy());
                    System.out.println(pet.getName()+ "hunger is: " +pet.getHunger());
                    System.out.println(pet.getName()+ "energy is: " +pet.getEnergy());
                case 3:
                    pet.playWithPet();
                    System.out.println("You played with " +name);
                    System.out.println(pet.getName()+ " has new stats ");
                    System.out.println(pet.getName()+ "energy is: " +pet.getEnergy());
                    System.out.println(pet.getName()+ "hunger is: " +pet.getHunger());
                    System.out.println(pet.getName()+ "energy is: " +pet.getEnergy());
                default:
                    break;
            }

            pet.tick();
        }while(select != 4);


    }
    
}
