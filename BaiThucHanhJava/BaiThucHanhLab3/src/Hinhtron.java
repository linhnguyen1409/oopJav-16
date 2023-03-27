import java.util.Scanner;

public class Hinhtron {
    public float r;
    final float Pi = 3.14f;

    public void nhapbk() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh hinh tron : ");
        r = sc.nextFloat();
    }

    public double tinhdientich() {
        return Pi * Math.pow(r, 2);
    }

    public double tinhchuvi() {
        return r * 2 * Pi;
    }

    public void inthongtin() {
        System.out.printf(" Ban kinh hinh tron la %f \n", r);
        System.out.println("Dien tich hinh tron la : " +tinhdientich());
        System.out.println("Chu vi hinh tron la : " + tinhchuvi());
    }
}