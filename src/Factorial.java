import java.util.Scanner;
public class Factorial {
    public static void main (String [] args){

        Scanner users = new Scanner(System.in) ;


        int user,fixed=1,store =1;
        user = users.nextInt();


        while ( user>=fixed){

            store = store*user;
            user--;
        }
        System.out.println(store);

    }
}
