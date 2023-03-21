import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) throws Exception {
        //Nhap 2 so bat ki tu ban phim
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap so thu 1:");
       int x = sc.nextInt();
       System.out.println("Nhap so thu 2:");
       int y = sc.nextInt();
       //tinh tong
       int tong = x + y ;
       System.out.print("Tong hai so la: ");
       System.out.println(x + " + " + y + " = " + tong);
       //tinh hieu
       int hieu = x - y ;
       System.out.print("Hieu hai so la:");
       System.out.println(x+ " - " + y + " = " + hieu);
       //tich
       int tich = x * y ;
       System.out.print("Tich hai so la :");
       System.out.println(x + " * " + y + " = " + tich);
       // thuong
       int thuong = x / y ;
       System.out.print("thuong hai so la : ");
       System.err.println( x + " / " + y + " = " + thuong);
       //chia lay du 
       int laydu = x % y ;
       System.out.print("Chia lay du hai so la: ");
       System.out.println(x+ " % " + y + " = " + laydu);
       //so sanh lon hon
       if (x >y ){
        System.out.println( x+ " > " + y);
       } 
       //so sanh nho hon
       if(x < y){
        System.out.println( x +" < " +y );
       }
       //so sanh bang
       if(x == y){
        System.out.println(x + " == " + y);
       }  
       //so sanh khac
       if( x != y){
        System.out.println(x+ " != " + y);
       }
       //so sanh lon hon hoac bang
       if(x >= y){
        System.out.println(x+ " >= " + y);
       }
       //so sanh nho on hoac bang
       if( x <= y){
        System.out.println(x + " <= " + y);
       }
    }
}
