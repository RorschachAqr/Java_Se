package polymorphicStudy2;

public class AnimalOperator {

    /*
    public void useAnimal(Cat c){
        c.eat();
    }
    public void useAnimal(Dog d){
        d.eat();
    }

     */
    public void useAnimal(Animal a){
        //相当于Animal a = new Cat()/new dog()
        a.eat();
    }
}
