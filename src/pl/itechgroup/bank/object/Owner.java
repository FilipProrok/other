package pl.itechgroup.bank.object;

public class Owner {
    Animal animal = new Animal() {
        @Override
        public void eat() {
            System.out.println("aaa");
        }

        @Override
        protected void hunt() {
            System.out.println("bbb");
        }
    };
}
