public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f);

        c1.status();

        Caneta c2 = new Caneta("BIC", "Azul", 1.5f);

        c2.status();
    }
}
