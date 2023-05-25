package BT1905;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        String tenSinhVien, thongTin = null;
        String arrThongTin[];  
        double diemSinhVien;
        LinkedList<String> danhSachSV = new LinkedList<>();
        LinkedList<String> svThiLai = new LinkedList<>();
        LinkedList<String> svDiemCao = new LinkedList<>();
        LinkedList<String> svCanTim = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhap ten sinh vien : ");
            tenSinhVien = sc.nextLine();
            if (!tenSinhVien.isEmpty()) {
                System.out.println("nhap diem sinh vien : ");
                diemSinhVien = Double.parseDouble(sc.nextLine());
                thongTin = tenSinhVien + "\t" + diemSinhVien;
                danhSachSV.add(thongTin);
            }
        } while (!tenSinhVien.isEmpty());
        System.out.println("so sinh vien co trong danh sach = " + (danhSachSV.size()));
        System.out.println("thong tin cua sinh vien vua nhap : ");
        System.out.println("ten sinh vien\t diem");
        Iterator<String> iterator = danhSachSV.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (int i = 0; i < danhSachSV.size(); i++) {
            String sv = danhSachSV.get(i);  
            arrThongTin = sv.split("\t");           
            double point = Double.parseDouble(arrThongTin[1]);
            if (point <= 5) {
                svThiLai.add(sv);
            }
        }      
        if (svThiLai.isEmpty()) {
            System.out.println("khong co sinh vien thi lai!");
        } else {
            System.out.println("so sv thi lai = " + (svThiLai.size()));
            System.out.println("thong tin sv thi lai : ");
            System.out.println("ten sv\t\tdiem");
            iterator = svThiLai.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
        double maxTemp = 0;
        int i = 0;  
        while (i < danhSachSV.size()) {
            arrThongTin = danhSachSV.get(i).split("\t");
            if (Double.parseDouble(arrThongTin[1]) >= maxTemp) {
                maxTemp = Double.parseDouble(arrThongTin[1]);
            }
            i++;
        }
    
         i = 0;
         while (i < danhSachSV.size()) {
            arrThongTin = danhSachSV.get(i).split("\t");
            if (Double.parseDouble(arrThongTin[1]) == maxTemp) {
                svDiemCao.add(danhSachSV.get(i));
            }
            i++;
        }  
        System.out.println("thong tin sv co diem cao nhat : ");
        System.out.println("ten sv  \t diem");
        iterator = svDiemCao.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("nhap ten sv can tim : ");
        String search = sc.nextLine();   
        i = 0;
        while (i < danhSachSV.size()) {
            arrThongTin = danhSachSV.get(i).split("\t"); 
            tenSinhVien = arrThongTin[0]; 
            if (search.equalsIgnoreCase(tenSinhVien)) {
                svCanTim.add(danhSachSV.get(i));
            }    
            i++;  
        }     
        System.out.println("thong tin cua cac sv la " + search + ": ");
        System.out.println("ten sv  \t diem");
        iterator = svCanTim.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

