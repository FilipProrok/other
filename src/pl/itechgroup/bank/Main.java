package pl.itechgroup.bank;

public class Main {

    public static void main(String[] args) {

        StringBuffer sb  = new StringBuffer("Ala");
        sb.ensureCapacity(100);
        sb.append(" ma kota");
        System.out.println(sb);

    }
}
