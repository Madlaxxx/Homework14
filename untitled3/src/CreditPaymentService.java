public class CreditPaymentService {
    public int calculate(int credit, int month, double percent){
        double p = percent / 12;
        double formula = credit * (p / 1 - (1 + p) - month);
        return (int)formula;
    }
}
