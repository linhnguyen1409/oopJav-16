package BT1905;
    import java.util.LinkedList;
    import java.util.Scanner;
   public class Bai2 {
    public static void main(String[] args) {
        int n, number; double sum = 0; int dem = 0;
        double tbc;
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Nhap vao so phan tu cua danh sach : ");
        n = sc.nextInt();

        for(int i = 0; i< n; i++){
            System.out.println("Nhap vao phan tu thu " + i + " : ");
            number = sc.nextInt();
            linkedList.add(number);
        }

        for(int i = 0; i < n; i++){
            if(linkedList.get(i) % 2 == 0){
                sum += linkedList.get(i);
                dem ++;
            }
        }
        tbc = (double) sum / dem;
        System.out.println("Trung binh cong cua cac so chan trong danh sach = " + tbc);
    }
}

