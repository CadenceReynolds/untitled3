public class Mammal extends Animal{

    public Mammal(){
        this.species = "Some generic animal sound.";
    }

    @Override
    public void makeSound(){
        System.out.println("Some mammal sound.");
    }
}
