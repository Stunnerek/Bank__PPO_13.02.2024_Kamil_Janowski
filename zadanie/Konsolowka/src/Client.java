public class Client extends User {
    int podatek;

    public Client(int id, int pesel, int money, String name, String surname, int age, String adress, int ip, int podatek) {
        super(id, pesel, money, name, surname, age, adress, ip);
        this.podatek = podatek;
    }
}
