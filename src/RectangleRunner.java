public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10,20);
        int rect1Area = rect1.calculateArea();
        double rect1volume = rect1.calculateBoxVolume(25);
        System.out.println("This rectangle has an area of " + rect1.calculateArea() + " and a volume of " + rect1.calculateBoxVolume(25));
    }
}
