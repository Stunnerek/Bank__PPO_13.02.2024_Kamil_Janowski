public class Main {
    public static void main(String[] args) {
        User Kamil = new Manager(2,2,4,"kamil","janowski",4,"d",444444,"Admin");
        Kamil.init();
        User Piotrus = new Client(3,2123,44,"piotr","goldman",4,"d",4444449,100000);
        User Maciek = new Client(4,213,44,"Maciek","Piotrowski",17,"Dworzec głowny",4444449,100000);
        Maciek.init();
        Piotrus.init();
        int stolen_money = Maciek.stealMoney();
        System.out.println(stolen_money);


        }
    }
