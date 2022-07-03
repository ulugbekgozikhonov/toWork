package task1;

public class Main {
    public static void main(String[] args) {

        int[][] robot = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1}};

        for (int i = 0; i < robot.length; i++) {
            for (int j = 0; j < robot.length; j++) {
                if (robot[i][j]==1){
                    System.out.println(findStamp(i, j,robot.length/2));
                    break;
                }
            }
        }
    }

    private static int findStamp(int i, int j,int center) {
        return Math.abs(center-i)+Math.abs(center-j);
    }
}
