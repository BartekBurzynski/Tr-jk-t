public class TringleCalculator {

    boolean isRightTringle(Tringle triangle){

        int a = triangle.pierwszyBok;
        int b = triangle.drugiBok;
        int c = triangle.trzeciBok;

        if (a*a == b*b + c*c) {

            return true;
        }
        else if (b*b == a*a + c*c){

            return true;
        }
        else if (c*c == a*a + b*b){

            return true;
        }

        else

            return false;
    }
}
