import java.util.Arrays;

public class MinArrowsBurst {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0) return 0;
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrows = 1;
        int end = points[0][1];
        for(int i = 1; i < points.length; i++) {
            if(points[i][0] > end) {
                arrows++;
                end = points[i][1];
            }
        }
        return arrows;
    }

    public static void main(String[] args) {
        MinArrowsBurst mab = new MinArrowsBurst();
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        System.out.println(mab.findMinArrowShots(points));
    }
}
