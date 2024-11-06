public class Dog extends Mammal{

    public Dog(){
        this.species = "Woof woof";
    }

    @Override
    public void makeSound(){
        System.out.println("woof woof");
    }
}
