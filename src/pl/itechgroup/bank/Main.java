package pl.itechgroup.bank;

public class Main {

    /*
    public static void showOddNumbers(){
        for(int i = 0; i <= 100; i++){
            if( i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    */


    public static void showOddNumbers(){
        int i = 0;
        while (i <= 100){
            if( i % 2 != 0) {
                System.out.println(i);

            }
            i++;
        }
    }

    public static void main(String[] args) {
        showOddNumbers();

    }
}
