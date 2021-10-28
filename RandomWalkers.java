public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double tSteps = 0.0;
        int tCount = 0;
        while (tCount <= trials) {

            int x = 0, y = 0;
            int steps = 0;
            tCount++;
            while (Math.abs(x) < r && Math.abs(y) < r && Math.abs(x) + Math.abs(y) < r) {
                double n = Math.random();
                if (n < 0.25) x--;
                else if (n < 0.50) x++;
                else if (n < 0.75) y--;
                else if (n < 1.00) y++;
                steps++;
            }
            tSteps = tSteps + steps;
        }
        double average = tSteps / tCount;
        System.out.println("average number of steps = " + average);
    }
}
