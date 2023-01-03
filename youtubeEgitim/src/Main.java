public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());
        customerManager.giveCredit();

        int number1 = 10;
        int number2 = 20;
        number1 = number2;
        number2 = 100;

        System.out.println(number1);

        int[] sayilar1 = {1, 2, 3};
        int[] sayilar2 = {10, 20, 30};

        sayilar1 = sayilar2;
        sayilar2[0] = 1000;
        System.out.println(sayilar1[0]);

    }
}