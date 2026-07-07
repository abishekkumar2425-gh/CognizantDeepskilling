class Fruits {
    String name;
    String taste;
    String size;

    Fruits(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
        }
    void eat() {
        System.out.println("Fruit Name: " + name);
        System.out.println("Taste: " + taste);
      }
}
class Apple extends Fruits {
    Apple() {
        super("Apple", "Sweet", "Medium");}
    void eat() {
        System.out.println("Apple is sweet in taste.");}
}

class Orange extends Fruits {
    Orange() {
        super("Orange", "Sweet and Sour", "Large");}
    void eat() {
        System.out.println("Orange is sweet and sour in taste.");}

}

public class fruit {
    public static void main(String[] args) {
        Apple ap = new Apple();
        Orange or = new Orange();
        ap.eat();
        or.eat();
    }
}