import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Zero_one_matrix {

        public int[][] updateMatrix(int[][] matrix) {
            int rows = matrix.length, cols = matrix[0].length;

            int[][] Matrix = new int[rows][cols];

            for (int[] row : Matrix) {
                Arrays.fill(row, -1);
            }


            Queue<int[]> queue = new ArrayDeque<>();


            for (int i = 0; i < rows; ++i) {
                for (int j = 0; j < cols; ++j) {

                    if (matrix[i][j] == 0) {
                        queue.offer(new int[] {i, j});
                        Matrix[i][j] = 0;
                    }
                }
            }

            int[] directions = {-1, 0, 1, 0, -1};


            while (!queue.isEmpty()) {
                int[] position = queue.poll();
                int currentRow = position[0], currentCol = position[1];


                for (int k = 0; k < 4; k++) {
                    int newRow = currentRow + directions[k], newCol = currentCol + directions[k + 1];


                    if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && Matrix[newRow][newCol] == -1) {

                        Matrix[newRow][newCol] = Matrix[currentRow][currentCol] + 1;

                        queue.add
                                (new int[] {newRow, newCol});
                    }
                }
            }

            return Matrix;
        }
    }


