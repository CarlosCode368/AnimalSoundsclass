
//NOUNS people, places things, ideas are classes
//is a relationship aka inheritance
class Animal{
    boolean hadHeart=true;
    String noise;
    Animal(String noise) {
        this.noise = noise;
    }
    void speak(){
        System.out.println(this.noise);

    }
}
class Pet extends Animal {
    String name;

    Pet(String name, String noise){
        super(noise);
    this.name=name;
   }
   void speak(){
       System.out.printf("Hi, my name is '%s'. I go '%s'!!!", this.name, this.noise);
   }
}
class Dog extends Pet{
    Dog(String name){
        super(name,"Woof");
    }
}
class Cat extends Pet{
    Cat(String name){
            super(name,"meow");
        }
    }


public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("squeak");
        Pet p= new Pet("Rocky the pet Rock", "...");
        Dog d = new Dog ("Volga");
        Cat c = new Cat ("Bolik");
        Animal[]zoo={a,d,c,p};
        for(Animal animal: zoo){
            animal.speak();
        }
    }
}