public class BonusMilesService {
    public int calculate(int cost) {
        int oneMile = 20;
        int miles = cost / oneMile;
        System.out.println(miles);

        return miles;

    }
}
