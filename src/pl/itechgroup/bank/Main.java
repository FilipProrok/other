package pl.itechgroup.bank;

public class Main {

    public static void divide(){
        int n = 0;
        int i = 0;
        while(n < 1000){
            if(i % 10 == 0){
                System.out.println(i);
                n++;
            }
            i++;
        }
    }

    public static void divide_v(){
        int n = 0;
        int i = 0;
        while(true){
            if(i % 10 == 0){
                System.out.println(i);
                n++;
                if(n >= 1000){
                    break;
                }
            }
            i++;
            continue;
        }
    }

    public static void main(String[] args) {
        divide_v();

    }
}
