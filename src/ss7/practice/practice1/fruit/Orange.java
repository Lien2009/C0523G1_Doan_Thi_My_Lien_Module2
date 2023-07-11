package ss7.practice.practice1.fruit;

public class Orange extends Fruit {
    public String howToEat(){
        return "Orange could be juiced";
    }

    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit:fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
