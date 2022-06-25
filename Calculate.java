public class Calculate {
    public static void main(String[] args) {
        System.out.println("Area of square: " + Square(5));
        System.out.println("Area of Triangle: " + Triangle(2, 5));
        System.out.println("Area of Rectangle: " + Rectangle(2, 2));
    }

    static int Square(int n) {
        int area = n * n;
        return area;
    }

    static double Triangle(int h, int b) {
        double area = 0.5 * h * b;
        return area;
    }

    static int Rectangle(int l, int b) {
        int area = l * b;
        return area;
    }
}
