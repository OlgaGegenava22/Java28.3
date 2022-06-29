public class CreditPaymentService {
    public double payment(int loanAmount, int years, double percent) {
        percent = percent / 12 / 100; // ставка по кредиту в месяц
        double coef = percent * Math.pow(1 + percent, years * 12) / (Math.pow(1 + percent,years * 12) - 1); // Расчет коэффициента аннуитета
        double fee = coef * loanAmount; // Расчет ежемесячного платежа
        return fee;
    }
}
