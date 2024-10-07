import java.lang.foreign.AddressLayout;
import java.time.Year;



public class LinearEquation {
    private int xOne;
    private int xTwo;
    private int yOne;
    private int yTwo;
    private double yInt;
    private String signOne;
    private String signTwo;


    public LinearEquation(int xOne, int xTwo, int yOne, int yTwo) {
        this.xOne = xOne;
        this.xTwo = xTwo;
        this.yOne = yOne;
        this.yTwo = yTwo;
    }


    public double distance() {
        return Math.sqrt((Math.pow((xTwo - xOne), 2)) + (Math.pow((yTwo - yOne), 2)));
    }


    public double slope() {
        return ((double) yTwo - yOne) / (xTwo - xOne);
    }


    public double yIntercept() {
        yInt = (double) (yOne - (slope() * xOne));
        yInt = yInt*100;
        yInt = Math.round(yInt);
        yInt = yInt/100;
        return yInt;
    }

    public String equation() {
        String yIntercepp = "";
        String y = "";
        String fraction = Math.abs(yTwo - yOne) + "\\" + Math.abs(xTwo - xOne);
        String wholeNum = String.valueOf((yTwo - yOne) / (xTwo - xOne));
        signOne = "";
        if (yIntercept() < 0 ){
            signTwo = "-";
            yIntercepp = String.valueOf(Math.abs(yInt));

        }
        if (yIntercept() == 0){
            signTwo = "";
            yIntercepp = "";

        }
        if (yIntercept() > 0) {
            signTwo = "+";
            yIntercepp = String.valueOf(yInt);

        }
        if ((yTwo - yOne) / (xTwo - xOne)> 0){
            fraction = Math.abs(yTwo - yOne) + "\\" + Math.abs(xTwo - xOne);

        }
        if ((yTwo - yOne) / (xTwo - xOne)< 0){
            signOne = "-";
            fraction = Math.abs(yTwo - yOne) + "\\" + Math.abs(xTwo - xOne);
            wholeNum =  String.valueOf(Math.abs((yTwo - yOne) / (xTwo - xOne)));

        }
/// (xTwo - xOne) != 1 && (yTwo - yOne) / (xTwo - xOne) != -1 && (yTwo - yOne)
        if ((yTwo - yOne) % (xTwo - xOne) > 0 || (yTwo - yOne) % (xTwo - xOne) < 0 ) {
            return "y = " + signOne + fraction + "x" + signTwo + yIntercepp;
        }// returns a fraction when ytwo - sign one is not diviSABLE
//         && (yTwo - yOne) / (xTwo - xOne) != 1 && (yTwo - yOne) / (xTwo - xOne) != -1
        if ((yTwo - yOne) % (xTwo - xOne) == 0 && (yTwo - yOne) / (xTwo - xOne) != 1 && (yTwo - yOne) / (xTwo - xOne) != -1) {
            return "y = " + signOne + wholeNum + "x" + signTwo + yIntercepp;
        }
        else {
            System.out.println("Check");
            return "";
        }
    }

    public String toString() {
        return "Point 1: (" + xOne + ", " + yOne + ")\n" +
                "Point 2: (" + xTwo + ", " + yTwo + ")\n" +
                "Slope: " + String.format("%.2f", slope()) + "\n" +
                "Y-Intercept: " + String.format("%.2f", yIntercept()) + "\n" +
                "Distance: " + String.format("%.2f", distance()) + "\n" +
                "Equation: " + equation();
    }


    public String calculateY(double x) {
        double y = slope() * x + yIntercept();
        return String.format("(%.2f, %.2f)", x, y);
    }


}
