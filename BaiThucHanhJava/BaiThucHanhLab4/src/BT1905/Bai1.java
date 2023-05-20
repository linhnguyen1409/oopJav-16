package BT1905;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Bai1 {
     public static void main(String[] args) {
          ArrayList<Integer> numbers = new ArrayList<>();
          Scanner sc= new Scanner(System.in);
          System.out.print("Nhập vào các số nguyên (nhập 0 để kết thúc): ");
          int input = sc.nextInt();
          while (input != 0) {
               numbers.add(input);
               input = sc.nextInt();
          }
          int max = Collections.max(numbers);
          System.out.println("Số nguyên lớn nhất: " + max);
          System.out.print("Nhập vào một số nguyên để xoá: ");
          int deleteNumber = sc.nextInt();
          numbers.removeIf(number -> number == deleteNumber);
          Collections.sort(numbers);
          System.out.println("Dãy số sau khi sắp xếp:");
          for (int number : numbers) {
               System.out.print(number + " ");
          }
     }
}

