import java.util.Scanner;

public class Bai10 {
    public static void main(String[]agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi khong qua 80 ki tu : ");
        String n = sc.nextLine();
        System.out.println(" Nhap ki tu bat ki : ");
        char l = sc.nextLine().charAt(0);
        int dem = 0 ;
        for( int i = 0 ; i < n.length(); i ++)
        {
            if (n.charAt(i) == l)
             {
                dem ++ ;
             }
        }
        System.out.println("So lan xuat hien ki tu " + l + " la : "+dem);
    }
    
}
