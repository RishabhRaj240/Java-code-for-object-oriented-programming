public class Main {
    public static void main(String[] args) {

//        Account bobsAccount = new Account("12345", 500,
//                "Bob Brown", "myemail@bob.com",
//                "9179692122");

        Account bobsAccount = new Account();
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(1000.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmail("myemail@bob.com");
//        bobsAccount.setCustomerPhone("9179692122");

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(200);

        bobsAccount.withdrawFunds(200);
        bobsAccount.withdrawFunds(50);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);
        bobsAccount.withdrawFunds(54.45);

        Account timsAccount = new Account("Tim",
                "tim@email.com", "12345");
        System.out.println("Account No: " + timsAccount.getNumber() +
                "; name " + timsAccount.getCustomerName());
    }
}