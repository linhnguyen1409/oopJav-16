import java.util.Scanner;

public class Slide47 {
    public static void main(String[]agrs) {
       Scanner sc = new Scanner(System.in);
       int tong = 0; 
       String str = "";
       do{
        int n;
        System.out.println("Nhap vao so nguyen: ");
        n = sc.nextInt();
        tong += n ;  
        str = n + " + " +str;
       } while(tong <= 100);
       System.out.print("tong cac so la:"+ str.substring(0, str.length() - 2) + " = " + tong);
       
        
    }
    
}
