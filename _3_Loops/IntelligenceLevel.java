class IntelligenceLevel{
    public static void main(String args[]){
        double x, y, i = 0;
        for(y = 1; y <= 6; y++){
            for(x = 5.5; x <= 12.5; x = x + 0.5){
                i = 2 + (y + (0.5 * x));
            }
            System.out.println(i);
        }
    }
}