import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {

        Scanner users = new Scanner(System.in);

        int firstnum, secondnum, store = 0;

        //first number input
        System.out.print("put your first number : ");
        firstnum = users.nextInt();

        //second number input
        System.out.print("put your last number : ");
        secondnum = users.nextInt();
//
//        while (firstnum < secondnum) {
//            if (firstnum % 2 == 1) {
//                store = store + firstnum;
//            }
//            firstnum++;
//        }
//        System.out.println(store);
//

        for (int i = firstnum; i < secondnum; i++) {
            if (firstnum % 2 == 1) {
                store = store + firstnum;
            }
            firstnum++;
        }
            System.out.println(store);



    }
}
