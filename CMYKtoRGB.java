public class CMYKtoRGB {
    public static void main(String[] args) {
        // CMYK: c = cyan, m = magenta, y = yellow, k = black
        double c = Double.parseDouble(args[0]);
        double m = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double k = Double.parseDouble(args[3]);

        // Convert CMYK to RGB
        double w = 1 - k;
        double r = 255 * w * (1 - c);
        double g = 255 * w * (1 - m);
        double b = 255 * w * (1 - y);

        // Convert double to int
        int rInt = (int) Math.round(r);
        int gInt = (int) Math.round(g);
        int bInt = (int) Math.round(b);

        // Print RGB
        System.out.println("red = " + rInt);
        System.out.println("green = " + gInt);
        System.out.println("blue = " + bInt);

    }
}
