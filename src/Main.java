public class Main {
    public static void main(String[] args) {

        Tringle triangle1 = new Tringle(4, 3, 2);
        Tringle triangle2 = new Tringle(5, 4, 3);


        TringleCalculator traingleCalculator = new TringleCalculator();
        boolean status;
        status = traingleCalculator.isRightTringle(triangle1);
        System.out.println(status);
        status = traingleCalculator.isRightTringle(triangle2);
        System.out.println(status);
    }
}

