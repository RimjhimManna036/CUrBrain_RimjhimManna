import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {

    public static ArrayList<Integer> digitList(int num) {

        ArrayList<Integer> list = new ArrayList<>();
         if (num < 0) {
           System.out.println("Invalid Input");
         }
       else if (num == 0) {
        list.add(0);
       }else {
            while (num != 0) {
            int digit = num % 10;
            list.add(0, digit);
            num = num / 10;
        }
       }
        return list;
    
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        ArrayList<Integer> list = digitList(num);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.set(i, 0);
            }
        }

        System.out.println(list);

        sc.close();
    }
}