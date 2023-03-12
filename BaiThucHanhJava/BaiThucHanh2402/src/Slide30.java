import java.util.Scanner;

public class Slide30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so n: ");
        n = sc.nextInt();
        int tong = 0;
        while (n > 0) {
            tong = tong + n % 10;
            n = n/10 ;
        }         
        System.out.println("Tong la:"+ tong);

    }
    
}
