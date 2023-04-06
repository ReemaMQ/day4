import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        <<< print grade >>>

//        int[] Numbers = {50,60,40,10,38,65,87,56,90,100,66,80,88,40,98};
//
//        for ( int N : Numbers ) {
//            if ( N >= 90 && N <= 100 ) {
//                System.out.println( N +" A ");
//
//        }else if ( N >= 80 && N <= 89) {
//                System.out.println( N + " B ");
//            } else if ( N >=70 && N <= 79) {
//                System.out.println( N + " C");
//
//            } else if ( N >= 60 && N <=69 ) {
//                System.out.println( N + " D ");
//
//            } else {
//                System.out.println( N + " Fail");
//
//
//        }


//        <<< ArrayList >>>

//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Red");
//        colors.add("Black");
//        colors.add("Green");
//        colors.add("Blue");
//        colors.set(1, "white");
//        colors.remove(2);
//
//        System.out.println(colors);



//        <<<print < 50 >>>

//            int[] Number = {50,60,40,10,38,65,87,56,90,100,66,80,88,40,98};
//
//        for (int N : Number) {
//            if ( N <= 50 )
//                System.out.println(N);
//
//        }

//        <<< Names start with (A) >>>

//        String[] Names = {"Shaza","Mohamed","Asmaa","Anfal","Yousra","Amin","Radwa","Yasmeen"};
//
//                for (String N : Names ){
//                    if( N.startsWith("A")){
//                        System.out.println(N);
//                    }


//         <<< Check if the array contains this number >>>

            int[] Number = {4,4,20,10,38,65,87,56,90,100,66,80,88,40,98};

        Scanner S  = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int check = S.nextInt();


        for (int N : Number) {
            if ( N == check){
                System.out.println(  Number.length + " The number in the list ");
                break;


//               <<<>>>>
//        } else {
//
//                System.out.println( "The number not in the list");
//                break;
//            }

        }}




