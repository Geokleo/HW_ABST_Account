public class Main {
    public static void main(String[] args) {

        SimpleAccount account_Petya = new SimpleAccount("Petya");
        CreditAccount account_Masha = new CreditAccount("Masha", 1000);

        account_Petya.add(100);
        account_Petya.add(-700); //return false
        account_Petya.add(700);
        account_Petya.pay(200);
        account_Petya.pay(1000); //return false
        System.out.println("На счете у " + account_Petya.getOwner() + " : " + account_Petya.getBalance());

        account_Masha.add(200); //return false
        account_Masha.pay(400);
        account_Masha.pay(1000); //return false
        account_Masha.pay(200);
        account_Masha.add(100);
        System.out.println("На счете у " + account_Masha.getOwner() + " : " + account_Masha.getBalance());

        System.out.println("Переводим деньги...");
        account_Petya.transfer(account_Masha, 700); //return false
        account_Petya.transfer(account_Masha, 600); //return false
        account_Petya.transfer(account_Masha, 500);

        System.out.println("На счете у " + account_Petya.getOwner() + " : " + account_Petya.getBalance());
        System.out.println("На счете у " + account_Masha.getOwner() + " : " + account_Masha.getBalance());
    }
}