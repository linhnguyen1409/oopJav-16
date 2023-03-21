import java.util.Scanner;

public class Bai3 {
    public static void main(String[]agrs)throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap ten : ");
        String ten = sc.nextLine();
        System.out.println("Nhap nam : ");
        int nam = sc.nextInt();
        int tuoi ;
        tuoi = 2023 - nam ;
        if(tuoi < 16)
        {
            System.out.println("Ban "+ ten + " o do tuoi vi thanh nien");
        } 
         if (tuoi >= 16 || tuoi < 18)
           {
            System.out.println("Ban "+ ten + " o do tuoi truong thanh ");
           }
        if (tuoi > 18) {
            System.out.println(" da gia ");
             }
    }
}
