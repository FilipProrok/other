package pl.itechgroup.bank;

public class Main {

    public enum DniTygodnia {
        PON("PN","Poniedzialek",1),
        WT("WT","Wtorek",2),
        SR("SR","Sroda",3),
        CZW("CZW","Czwartek",4),
        PT("PT","Piatek",5),
        SB("SB","Sobota",6),
        ND("ND","Niedziela",7);

        String code;
        String name;
        int number;

        public DniTygodnia(String code, String name, int number) {
            this.name = name;
            this.code = code;
            this.number = number;
        }
    }

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
        /*
        showOddNumbers();

        for (DniTygodnia dzien:
                DniTygodnia.values()) {
            System.out.println(dzien);
        }

         */

        switch (dzien) {
            case SB:
            case ND:
                System.out.println("Jest weekend");
                break;
            default:
                System.out.println("Niestety musisz jeszcze popracowć");
        }

        switch (dzien.number) {
            case 6:
            case 7:
                System.out.println("Jest weekend");
                break;
            default:
                System.out.println("Niestety musisz jeszcze popracowć");
        }

    }
}
