public class CustomerManager {
    private  Customer _customer;
    private ICreditManager _creditManager;
   public CustomerManager(Customer customer,ICreditManager creditManager)
   {
        _customer = customer;
        _creditManager = creditManager;
   }
    public  void save(){
        System.out.println("Müşteri kaydedildi. ");

    }

    public  void delete(){
        System.out.println("Müşteri silindi: " );

    }

    public void  giveCredit(){
       _creditManager.Calculete();
        System.out.println("Kredi verildi");
    }
}
