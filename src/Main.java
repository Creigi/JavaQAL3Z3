public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println("Ежемесячный платеж: " + service.calculate(1, 1_000_000, 9.99) + "р.");
        System.out.println("Ежемесячный платеж: " + service.calculate(2, 1_000_000, 9.99) + "р.");
        System.out.println("Ежемесячный платеж: " + service.calculate(3, 1_000_000, 9.99) + "р.");
    }
}
