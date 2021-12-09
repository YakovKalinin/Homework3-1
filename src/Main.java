public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(10_000);
        System.out.println("Your reward is " + miles + " miles");

        int miles1 = service.calculate(1_000);
        System.out.println("Your reward is " + miles1 + " miles");

        int milesHi = service.calculate(600_000);
        System.out.println("Your reward is " + milesHi + " miles");
    }
}