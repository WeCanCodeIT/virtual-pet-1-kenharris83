public class VirtualPet{
private String name;
private int energy;
private int hunger;
private int thirst;


public VirtualPet(String name, int energy, int hunger, int thirst) {
    this.name = name;
    this.energy = energy;
    this.hunger = hunger;
    this.thirst = thirst;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getEnergy() {
    return energy;
}

public void setEnergy(int energy) {
    this.energy = energy;
}

public int getHunger() {
    return hunger;
}

public void setHunger(int hunger) {
    this.hunger = hunger;
}

public int getThirst() {
    return thirst;
}

public void setThirst(int thirst) {
    this.thirst = thirst;
}

public void tick(){
    this.hunger -= 1;
    this.thirst -= 1;
    this.energy -= 1;
    }

public void petStats(){
    System.out.println("Name: " +this.name);
    System.out.println("Hunger level: " +this.hunger);
    System.out.println("Thirst level: " +this.thirst);
    System.out.println("Energy level: " +this.energy);
    
}

public void feedPet(){
    this.hunger +=5;
    this.energy +=2;
    this.thirst -=2;
}

public void waterPet(){
    this.hunger -=2;
    this.energy -=1;
    this.thirst +=6;
}

public void playWithPet(){
    this.hunger -=3;
    this.energy -=4;
    this.thirst +=3;
}
}