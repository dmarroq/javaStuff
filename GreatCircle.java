public class GreatCircle {
    public static void main(String[] args) {
        // Longitudes and latitudes
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        // Distances
        double dx = Math.toRadians(x2 - x1);
        double dy = Math.toRadians(y2 - y1);

        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);

        // radius of Earth
        double r = 6371.0;
        // Parenthesis part of H formula
        double d = Math.pow(Math.sin(dx / 2), 2) + Math.pow(Math.sin(dy / 2), 2)
                * Math.cos(x1) * Math.cos(x2);
        // Haversine formula
        // double c = 2 * Math.asin(Math.sqrt(d));
        double h = r * 2 * Math.asin(Math.sqrt(d));

        System.out.println(h + " kilometers");

    }
}
