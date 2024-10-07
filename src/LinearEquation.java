import java.lang.foreign.AddressLayout;
import java.time.Year;

//public class LinearEquation {
//    private int xOne;
//    private int xTwo;
//    private int yOne;
//    private int yTwo;
//
//    public LinearEquation(int xOne, int xTwo, int yOne, int yTwo){
//        this.xOne = xOne;
//        this.xTwo = xTwo;
//        this.yOne = yOne;
//        this.yTwo = yTwo;
//
//    }
//
////
////    public double distance(){
////       double x = Math.sqrt((Math.pow((xTwo-xOne),2))+(Math.pow((yTwo-yOne),2)));
////       x = Double.parseDouble(Double.toString(x));
////       x
////
////    }
//
//
//    public double slope(){
//        return ((double)yTwo-yOne)/(xTwo-xOne);
//    }
//
//    public double yIntercept(){
//        return yOne/(slope()*xOne);
//    }
//    public String equation(){
//       String sign;
//
//
//       if (yIntercept()<0){
//
//           return sign = "";
//       }
//       if (yIntercept()>0){
//           return sign = "+";/
//       }
//       if (yIntercept()==0){
//
//       }
//
//
//
//        if (((yTwo-yOne)%(xTwo-xOne)) > 0) {{
//           return "y = " + (yTwo - yOne) + "\\" + (xTwo - xOne) + "x" + sign + yIntercept();
//       }
//       if ((yTwo-yOne)%(xTwo-xOne) == 0){
//           return "y = " + (yTwo - yOne) / (xTwo - xOne) + "x" + " + " + yIntercept();
//           }
//    }
//
//}
//

public class LinearEquation {
    private int xOne;
    private int xTwo;
    private int yOne;
    private int yTwo;
    private double yInt;


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
        yInt = (double) (yOne - (slope() * xOne)); // Adjusted formula for y-intercept
        return yInt;
    }


    public String equation() {
        String signOne = "";
        String signTwo = "";
        if (yInt == 0) {
            yInt = Double.parseDouble(Double.toString(yInt));
            signTwo = "";
        }
        if (yInt < 0) {
            signTwo = "-";
            yInt = Math.abs(yIntercept());
        }
        if (yInt > 0) {
            signTwo = "+";
            yInt = yIntercept();
        }


        if ((yTwo - yOne) / (xTwo - xOne) < 0) {
            signOne = "-";
        }


        if ((yTwo - yOne) % (xTwo - xOne) > 0 && (yTwo - yOne) / (xTwo - xOne) != 1 && (yTwo - yOne) / (xTwo - xOne) != -1) {
            return "y = " + signOne + (yTwo - yOne) + "\\" + (xTwo - xOne) + "x" + signTwo + yInt;
        }
        if ((yTwo - yOne) % (xTwo - xOne) == 0 && (yTwo - yOne) / (xTwo - xOne) != 1 && (yTwo - yOne) / (xTwo - xOne) != -1) {
            return "y = " + signOne + (yTwo - yOne) / (xTwo - xOne) + "x" + signTwo + yInt;
        }


        return ""; // Default return to avoid missing returns
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
