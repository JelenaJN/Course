public class Majas_darbs_2 {

    public static void main(String[] args) {
        int colorRange = 100;
        if ((colorRange >= 380) && (colorRange < 450)) {
            System.out.println("violet");
        } else if ((colorRange >= 450) && (colorRange < 495)) {
            System.out.println("blue");

        } else if ((colorRange >= 495) && (colorRange < 570)) {
            System.out.println("green");

        } else if ((colorRange >= 570) && (colorRange < 590)) {
            System.out.println("yellow");

        } else if ((colorRange >= 590) && (colorRange < 620)) {
            System.out.println("orange");
        } else if ((colorRange >= 620) && (colorRange < 751)) {
            System.out.println("red");
        } else {
            System.out.println("Invisible light");
        }
    }
}
