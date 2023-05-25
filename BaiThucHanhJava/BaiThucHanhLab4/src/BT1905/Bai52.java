package BT1905;
    
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Bai52 {
     public static void main(String[] args) {
          Map<String, List<Bai52>> Svm = new HashMap<>();
          Scanner sc = new Scanner(System.in);
          while (true) {
               System.out.println("1. Nhap danh sach n sinh vien");
               System.out.println("2. Hien thi sinh vien theo lop");
               System.out.println("3. Hien thi sinh vien theo msv");
               System.out.println("4. Exit");
               int selector = sc.nextInt();
               switch (selector) {
                    case 1:
                         Bai52.NhapDS(Svm);
                         break;
                    case 2:
                         Bai52.DsSvThuocLop(Svm);
                         break;
                    case 3:
                         Bai52.DsSvThuocMsv(Svm);
                         break;
                    case 4:
                         break;
                    default:
                         System.out.println("Nhap sai du lieu !!!");
                         break;
               }
          }
     }
}