public class main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        double bonus = service.calculate(5000, true);
        System.out.println(bonus);
    }
}
