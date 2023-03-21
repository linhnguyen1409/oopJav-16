import java.util.Scanner;

public class Bai5 {
    public static void main (String[]agrs)throws Exception{
        Scanner sc = new Scanner(System.in);
        int tong = 0 ;
       do{
        int n;
        System.out.println("Nhap vao so nguyen: ");
        n = sc.nextInt();
        tong += n ; 
       } while(tong <= 100);
       System.out.print("tong cac so la: "+ tong);
        }
    }
