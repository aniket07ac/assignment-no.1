import java.util.Scanner;
public class smaller number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        smaller number obj=new smaller number();
        int d = obj.Small(a,b,c);
        System.out.println(+d);
    }

    static int Small(int x, int y, int z) {
        if (x<y && x<z)
        {

            System.out.println("first number smaller");
            return x;
        } else if (y<x && y<z)
        {
            System.out.println("Second Number is smaller");
            return y;
        }
        else if (z<x && z<y);
        {
            System.out.println("Third number is smaller");
            return z;
        }
    }
}