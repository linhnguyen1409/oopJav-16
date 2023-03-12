
import java.util.Scanner;

public class slide74 {
    // tính tổng số chẵn của mảng một chiều
    public static void main(String[]agrs) throws Exception{
        int mang ;
        Scanner sc = new Scanner(System.in);
        // nhap mang
        do
        {
            System.out.println("Nhap kich thuoc mang: ");
            mang = sc.nextInt();
        }
         while(mang <= 0);
         int arrN[] = new int[mang];
         System.out.println("Nhap phan tu mang:");
         for(int i = 0 ; i < arrN.length ; i++)
         {
            System.out.printf("N[%d] = " , i);
            arrN[i] = sc.nextInt();
         }
         // tong so chan
         int tong = 0 ;
         for(int i = 0 ; i < arrN.length ; i++)
         {
            if(arrN[i] %2 == 0)
            {
               tong += arrN[i]; 
            }
         }
          // in ra man hinh
         System.out.println("Tong so chan cua mang la : " );
            System.out.printf("%d" , tong);
    }
}
