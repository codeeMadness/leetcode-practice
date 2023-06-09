package sorting;

import java.util.*;

public class _2545 {
//    2545. Sort the Students by Their Kth Score
    public static int[][] sortTheStudents(int[][] score, int k) {
        Map<Integer, Integer> sortScore = new TreeMap<>(Comparator.reverseOrder());
        int rows = score.length;
        for(int r = 0; r < rows; r++) {
            sortScore.put(score[r][k], r);
        }
        Collection<Integer> rowsSet = sortScore.values();

        int columns = score[0].length;
        int[][] res = new int[rows][columns];
        int i = 0;
        for(Integer r : rowsSet) {
            int j = 0;
            while (j < columns) {
                res[i][j] = score[r][j];
                j++;
            }
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] score = {{10,6,9,1},{7,5,11,2},{4,8,3,15}};
//        expected [[7,5,11,2],[10,6,9,1],[4,8,3,15]]
        int[][] res = _2545.sortTheStudents(score, 2);

    }
}
