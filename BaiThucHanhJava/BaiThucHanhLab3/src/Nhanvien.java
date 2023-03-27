import java.util.Scanner;

public class Nhanvien {
        String ten;
        int tuoi;
        final float luongcb = 1490000f;
        float hesoluong;
        public void nhaptt() {
             Scanner sc = new Scanner(System.in);
             System.out.println("nhap ho ten :");
             ten = sc.nextLine();
             System.out.println("nhap tuoi : ");
             tuoi = sc.nextInt();
             System.out.println("nhap he so luong :");
             hesoluong = sc.nextFloat();
        }
        public float tongluong() {
             float a = (hesoluong * luongcb);
                return a ;
        }
        public void ttnv()
         {
             System.out.printf("Nhan vien : %s - %d tuoi va co luong : %.2f nghin dong", ten, tuoi, tongluong());
        }
        
    }
    
