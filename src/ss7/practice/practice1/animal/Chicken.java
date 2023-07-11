package ss7.practice.practice1.animal;

import ss7.practice.practice1.edible.Edible;

public class Chicken extends Animal implements Edible {//thừa kế class abstract = extends, interface = implements
    public String makeSound(){//thừa kế phương thức abstarct của lớp cha
        return "Chicken: cluck-cluck!"; //ko có từ abstract
    }
    public String howToEat(){
        return "could be fried";
    }

    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        System.out.println(chicken.makeSound());
        System.out.println(chicken.howToEat());
    }
}
