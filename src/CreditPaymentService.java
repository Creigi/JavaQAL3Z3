public class CreditPaymentService {
    public double calculate(int years, int sum, double percent) {
        double kAnnuity, monthlyPercent, x, paymentPerMonth;
        int months = years * 12;
        monthlyPercent = percent / 12 / 100;
        x = Math.pow((1 + monthlyPercent), months);
        kAnnuity = monthlyPercent * x / (x - 1);
        paymentPerMonth = Math.round(kAnnuity * sum);
        return paymentPerMonth;
    }
}
