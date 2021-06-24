public class LineComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Computation problem");

        int x1=23;
        int y1=74;
        int x2=45;
        int y2=65;

        double length = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("Length of the line is: "+length+" unit");
    }
}
