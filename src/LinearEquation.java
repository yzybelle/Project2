public class LinearEquation {
    private int xOne;
    private int xTwo;
    private int yOne;
    private int yTwo;

    public LinearEquation(int xOne, int xTwo, int yOne, int yTwo){
        this.xOne = xOne;
        this.xTwo = xTwo;
        this.yOne = yOne;
        this.yTwo = yTwo;

    }


    public double distance(){
        return Math.sqrt((Math.pow((xTwo-xOne),2))+(Math.pow((yTwo-yOne),2)));
    }


    public double slope(){
        return ((double)yTwo-yOne)/(xTwo-xOne);
    }

    public double yIntercept(){
        return yOne/(slope()*xOne);
    }
    public String equation(){
        return "y = " + (yTwo-yOne)+"\\"+(xTwo-xOne) + "x" + " " + yIntercept();
    }

}

