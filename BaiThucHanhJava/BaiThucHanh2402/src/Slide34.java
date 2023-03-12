import java.util.Scanner;

public class Slide34 {
    public static void main(String[] args) {
        //gia pt bac 2 a, b, c, x1, x2, delta
        Scanner sc = new Scanner(System.in);
        double a, b, c, x1, x2, delta;
        System.out.println("nhap a:");
        a = sc.nextInt();
        System.out.println("nhap b:");
        b = sc.nextInt();
        System.out.println("nhap c:");
        c = sc.nextInt();
        //pt bac 2 ax^2 + bx + c = 0
        if(a == 0){
            //phuong trinh bac 1
            if(b == 0){
                if(c == 0){
                    System.out.println("phuong trinh vo so nghiem");
                }else{
                    System.out.println("phuong trinh vo nghiem");
                }
            }else{
                x1 = (-c / b);
                System.out.println("phuong trinh co 1 nghiem " + x1);
            }
        }else{
            delta = Math.pow(b, 2) - 4 * a * c;
            if(delta < 0){
                System.out.println("phuong trinh vo nghiem");
            }else if(delta == 0){
                //b2 - 4 ac = 2^2 - 4 * 1 *1;
                x1 = (- b /(2 * a));
                System.out.println("phuong trinh co nghiem kep :" + x1);
            }else{
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("phuong trinh co nghiem x1 :" + x1);
                System.out.println("phuong trinh co nghiem x2 :" + x2);
            }
        }
    }
}
