import java.util.Scanner;

public class RunnerClass {
    public RunnerClass(int xCoordOne, int xCoordTwo, int yCoordOne, int yCoordTwo) {
    }

    public static void main(String[] args) {
        Scanner coords = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your first coordinates: ");
        String firstCoords = (String) coords.nextLine();
        firstCoords = firstCoords.replace("(","");
        firstCoords = firstCoords.replace(")","");
        int index = firstCoords.indexOf(",");
        int xCoordOne = Integer.parseInt(firstCoords.substring(0,index));
        int yCoordOne = Integer.parseInt(firstCoords.substring((index+1)));



        System.out.println("Enter your second coordinates: ");
        String secondCoords = (String) coords.nextLine();
        secondCoords = secondCoords.replace("(","");
        secondCoords = secondCoords.replace(")","");
        int indexTwo = secondCoords.indexOf(",");
        int xCoordTwo = Integer.parseInt(secondCoords.substring(0,indexTwo));
        int yCoordTwo = Integer.parseInt(secondCoords.substring((indexTwo+1)));

        LinearEquation coordinates = new LinearEquation(xCoordOne,xCoordTwo,yCoordOne,yCoordTwo);

        System.out.println("First Pair: "+"("+xCoordOne+","+yCoordOne+")");
        System.out.println("Second Pair: "+"("+xCoordTwo+","+yCoordTwo+")");
        System.out.println("Slope: "+ coordinates.slope());
//        System.out.println(coordinates.distance());
        System.out.println(coordinates.equation());
    }
}
