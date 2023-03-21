import java.util.Scanner;

public class Bai6 {
    public static void main(String[]agrs)throws Exception{
        Scanner sc = new Scanner(System.in);
        long gt = 1 ;
        int x = 1;
        int n;
        do {
            System.out.println("Nhap so nguyen duong bat ky: ");
            n = sc.nextInt();
        }
         while( n <= 0) 
        {
            System.out.println(" Nhap lai n : ");
            n = sc.nextInt();
        }
        while(x <= n)
       {
            gt *= x ;
            x++ ;
        }
        System.out.println(n+ "! = " +gt);
    }
    
}
