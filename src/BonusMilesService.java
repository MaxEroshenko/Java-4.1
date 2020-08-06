public class BonusMilesService {
    public int calculate(int cost) {
        int price = 10_000;
        int oneMile = 20;
        int bonus = price / oneMile;
        System.out.println(bonus);

        return cost;

    }
}
