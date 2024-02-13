public class Manager extends User {
    String position;

    public Manager(int id, int pesel, int money, String name, String surname, int age, String adress, int ip, String position) {
        super(id, pesel, money, name, surname, age, adress, ip);
        this.position = position;
    }
}
