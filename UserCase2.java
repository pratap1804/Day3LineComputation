public class LineComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Computation problem");

        int x1=23;
        int y1=74;
        int x2=45;
        int y2=65;

        double length1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("Length of the line is: "+length1+" unit");

        int x3=13;
        int y3=74;
        int x4=35;
        int y4=65;

        double length2 = Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3));
        System.out.println("Length of the line is: "+length2+" unit");

        if (length1 == length2) {
            System.out.println("Lines Are Equal");
        } else {
            System.out.println("Lines Are Not Equal");
        }

        }
    }
}
