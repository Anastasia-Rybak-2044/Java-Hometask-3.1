public class Miles {
    public static void main(String[] args) {
        int ticketPrice = 12487;
        int coef = 20;
        int bonusMiles = ticketPrice / coef;
        System.out.println("При покупке билета стоимостью " + ticketPrice + " ₽, количество бонусных миль составляет: " + bonusMiles);
    }
}
