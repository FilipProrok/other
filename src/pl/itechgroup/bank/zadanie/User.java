package pl.itechgroup.bank.zadanie;

public class User extends Person{

    String login, password;
    int id;

    static int counter = 0;
    final static int YEAR = 2021;
    final String greeting = "Hello!";

    public User(String firstName, String secondName, int age, int id, String login, String password, boolean isBlocked) {
        super(firstName, secondName, age, isBlocked);
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public User(String firstName, String secondName, int age, String login, String password, boolean isBlocked) {
        super(firstName, secondName, age, isBlocked);
        this.id = count();
        this.login = login;
        this.password = password;
    }

    private int count(){
        counter++;
        return counter;
    };

    @Override
    public String getInfo() {
        StringBuilder str = new StringBuilder();

        str.append(super.getInfo());
        str.append(String.format(" ID: %s, Login: %s, Hasło: %s, ",id, login, password));
        str.append(String.format("Year: %d, ",YEAR));
        str.append(String.format("Greeting : %s",this.greeting));

        return str.toString();
    }
}
