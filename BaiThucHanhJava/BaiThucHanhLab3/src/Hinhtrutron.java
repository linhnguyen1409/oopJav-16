import java.util.Scanner;

public class Hinhtrutron {
        public float r , p ,s , h ;
        public float v ;
        final float Pi = 3.14f ;
    public void nhapsolieu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu cao hinh tru tron : ");
        h = sc.nextFloat();
        System.out.println("Nhap ban kinh hinh tru tron : ");
        r = sc.nextFloat();
    }
    public double tinhdientich() {
        return Pi * Math.pow(r, 2);
    }
    public float tinhchuvi() {
        return r * 2 * Pi;
    }
    public float tinhtt()
    {
       return (Pi * r * r * h);
    }
    public void inketqua()
    {
                System.out.printf("Ban kinh hinh tru tron la %.2f \n",r);
                System.out.printf("Dien tich hinh tru tron la %.2f \n",tinhdientich());
                System.out.printf("Chu vi hinh tru tron la %.2f \n",tinhchuvi());
                System.out.printf("The tich hinh tru tron la %.2f",tinhtt());
    }
        }