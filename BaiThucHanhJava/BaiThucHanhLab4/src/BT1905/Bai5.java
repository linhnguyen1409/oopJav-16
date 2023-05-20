package BT1905;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Bai5 {
     public String msv;
     public String hvt;
     public String lop;

     public static void NhapDS(Map<String, List<Bai5>> svm) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Nhap n sinh vien :");
          int n = sc.nextInt();
          sc.nextLine();
          for (int i = 0; i < n; i++) {
               System.out.println("Nhap sinh vien thu " + (i + 1));
               Bai5 sv = new Bai5();
               System.out.println("Nhap msv :");
               sv.msv = sc.nextLine();
               System.out.println("Nhap hvt :");
               sv.hvt = sc.nextLine();
               System.out.println("Nhap lop :");
               sv.lop = sc.nextLine();
               List<Bai5> newSv = svm.getOrDefault(sv.lop, new ArrayList<>());
               newSv.add(sv);
               svm.put(sv.lop, newSv);
          }
     }
     //Hiển thị những sinh viên thuộc Lớp vừa nhập, sd value là 1 list để tránh việc Overriding
     public static void DsSvThuocLop(Map<String, List<Bai5>> svm) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Nhap ten lop: ");
          String tmpLop = sc.nextLine();

          System.out.println("Danh sach sinh vien thuoc lop " + tmpLop + ":");
          List<Bai5> listSv = svm.get(tmpLop);
          if (listSv != null) {
               for (Bai5 sv : listSv) {
                    System.out.println("Msv: " + sv.msv);
                    System.out.println("hvt: " + sv.hvt);
                    System.out.println("lop: " + sv.lop);
                    System.out.println();
               }
          } else {
               System.out.println("Not Found !");
          }
     }

     public static void DsSvThuocMsv(Map<String, List<Bai5>> svm) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Nhap Ma sinh vien: ");
          String tmpMsv = sc.nextLine();

          boolean found = false;
          for (List<Bai5> lop : svm.values()) {
               for (Bai5 sv : lop) {
                    if (sv.msv.equalsIgnoreCase(tmpMsv)) {
                         System.out.println("hvt: " + sv.hvt);
                         System.out.println("Lop: " + sv.lop);
                         found = true;
                         break;
                    }
               }
               if (found) {
                    break;
               }
          }
          if (!found) {
               System.out.println("Khong tim thay sinh vien !");
          }
     }

}
