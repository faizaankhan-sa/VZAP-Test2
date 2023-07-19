package vzap.Test2Mod2;

public class SketchBook {
    public static void main(String[] args) {

        Circle c1 = new Circle(10);
        Circle c2 = new Circle(20);
        Rectangle r1 = new Rectangle(5,9);
        Rectangle r2 = new Rectangle(4,6);
        Person p1 = new Person("bob", "23 September 1990");
        Person p2 = new Person("tom", "17 August 1996");

        Drawing[] sketches = {c1, c2, r1, r2, p1, p2};

        for (Drawing i:sketches) {
            System.out.println(i.toString());
        }
    }
}