class SavingsAccount{
    static double annualInterestRate = 0;
    private double SavingsBalance = 0;

    SavingsAccount(double balance){
        SavingsBalance = balance;
    }

    double CalculateMonthlyInterest(){
        double monthlyInterest = (SavingsBalance * annualInterestRate) / 12;
        SavingsBalance += monthlyInterest;
        return SavingsBalance;
    }

    static void ModifyInterestRate(double newInterest){
        annualInterestRate = newInterest;
    }
}
class Saving_Test{
    public static void main(String[] args){
        SavingsAccount s1 = new SavingsAccount(2000);
        SavingsAccount s2 = new SavingsAccount(3000);

        s1.ModifyInterestRate(0.4);
        double a = s1.CalculateMonthlyInterest();
        System.out.println(a);

        s2.ModifyInterestRate(0.5);
        double b = s2.CalculateMonthlyInterest();
        System.out.println(b);
    }
}
