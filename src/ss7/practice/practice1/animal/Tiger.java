package ss7.practice.practice1.animal;

public class Tiger extends Animal {
    public String makeSound(){
        return "Tiger: roarrrrr!";
    }

    public static void main(String[] args) {
//        Animal tiger = new Tiger();
//        System.out.println(tiger.makeSound());
//        Chicken chicken = new Chicken();
//        System.out.println(chicken.makeSound());
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for(Animal animal : animals){//sd vòng lặp for each in ra phần tử, gọi phương thức cho phần tử
            System.out.println(animal.makeSound());
        }
    }
}
