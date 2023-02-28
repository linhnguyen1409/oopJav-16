import java.util.Scanner;

public class Slide35 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a, b;
          System.out.println("Nhap so a: ");
          a = sc.nextInt();
          System.out.println("Nhap so b: ");
          b = sc.nextInt();
          int min;
          min = (a > b) ? b : a;
        //   if(a > b){
        //        min = b;
        //   }else{
        //        min = a; 
        //   }
          System.out.println("So nho nhat la : " + min);
     }
}


