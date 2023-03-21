import java.util.Scanner;

public class Bai9 {
    public static void main(String[]agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi :");
        String n = sc.nextLine();
        int Demso = 0 ;
        int Demkituhoa = 0 ;
        int Demkituthuong = 0 ;
        for (int i = 0 ; i < n.length() ; i ++)
        {
            char c = n.charAt(i);
            if (Character.isLowerCase(c)){
                Demkituthuong ++ ;
              }
            if (Character.isUpperCase(c)){
                Demkituhoa ++ ;
              }
            if (Character.isDigit(c)){
                Demso ++ ;
              }
        }
        System.out.println("Tong ki tu thuong cua chuoi la :" + Demkituthuong);
        System.out.println("Tong ki tu hoa cua chuoi la :" + Demkituhoa);
        System.out.println("Tong cac so cua chuoi la :" + Demso);
    }
    
}
