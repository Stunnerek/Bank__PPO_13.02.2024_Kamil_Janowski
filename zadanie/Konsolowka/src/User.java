import java.util.Scanner;

public  class User {
    int id;
    int pesel;
    int money;
    String name;
    String surname;
    int age;
    String adress;
    int ip;

    public User(int id, int pesel, int money, String name, String surname, int age, String adress, int ip) {
        this.id = id;
        this.pesel = pesel;
        this.money = money;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = adress;
        this.ip = ip;
    }

    /********************************************************************************************************
     * nazwa funkcji:executeuser
     * parametry wejściowe: bezparemetrowa
     * wartość zwracana: brak
     * autor: Kamil Janowski
     */
    public void executeUser(){
        System.out.println("user with id" + this.id + "is executed");
    }
    /********************************************************************************************************
     * nazwa funkcji:init
     * parametry wejściowe: bezparemetrowa
     * wartość zwracana: brak
     * autor: Kamil Janowski
     */
    public void init(){
        System.out.println("hello welcome to best bank in polen");
        System.out.println("what you want to do with user" + this.name +" ?");
        System.out.println("1.Execute User");
        System.out.println("2.Leak his ip adress");
        Scanner number = new Scanner(System.in);
        int choice = Integer.parseInt(number.nextLine());
        if(choice == 1){
            executeUser();
        }
        else if (choice == 2){
            System.out.println("user " + this.name + " has age " + this.age + "and pesel " + this.pesel + "has ip " +this.ip);
        }

    }
    /********************************************************************************************************
     * nazwa funkcji:stealMoney
     * parametry wejściowe: bezparemetrowa
     * wartość zwracana: a(pieniądze użytkownika)
     * autor: Kamil Janowski
     */
    public int stealMoney() {
        System.out.println(this.name + " lost all his money");
        int a = this.money;
        this.money =0 ;
        return a;
    }


}
