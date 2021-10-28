public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String thue = "0";
        String morse = "1";

        for (int i = 0; i < n; i++) {
            String t = thue;
            String m = morse;
            thue += m;
            morse += t;

        }
        //int x = thue.length();
        char[] tArray = thue.toCharArray();
        int m = n;
        for (int j = 0; j < n*n; j++) {

            if (thue.charAt(j) == tArray[0]) {
                System.out.print("+  ");
                }
            else if (thue.charAt(j) == tArray[1]) {
                System.out.print("-  ");
                }
            if (j == m - 1) {
                System.out.println();
                m += n;
                }
            }
        }
    }

