public class Main {
    public static void main(String[] args) {
        CreditPaymentService calculate = new CreditPaymentService();
        int loanAmount = 1_000_000; // Сумма кредита
        int years = 1; // Срок кредита
        double percent = 9.99; // Годовая ставка
        double fee = calculate.payment(loanAmount, years, percent);
        System.out.printf("Ежемесячный платеж составляет: %.0f", calculate.payment(1_000_000, 1, 9.99));
        System.out.println();
        System.out.printf("Ежемесячный платеж составляет: %.0f", calculate.payment(1_000_000, 2, 9.99));
        System.out.println();
        System.out.printf("Ежемесячный платеж составляет: %.0f", calculate.payment(1_000_000, 3, 9.99));
        System.out.println();

        
    }
}
