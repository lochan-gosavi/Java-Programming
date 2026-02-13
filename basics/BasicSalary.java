class BasicSalary{
    public static void main(String[] args){
        int salary = 100;
        int DA = salary * (40 / 100);
        int RA = salary * (20 / 100);
        int grossSal = salary - (DA + RA);
        System.out.println(grossSal);
    }
}