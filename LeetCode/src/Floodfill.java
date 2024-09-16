import java.util.Comparator;
import java.util.PriorityQueue;

public class Floodfill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int rows = image.length;
        int cols = image[0].length;
        int oldColor = image[sr][sc];

        if (oldColor == newColor) {
            return image;
        }

        floodfill(image, sr, sc, rows, cols, oldColor, newColor);
        return image;
    }

    public void floodfill(int[][] image, int i, int j, int rows, int cols, int oldColor, int newColor) {

        if ( i< 0 || j < 0 || i >= rows || j >= cols || image[i][j] != oldColor) {
            return;
        }

        image[i][j] = newColor;

        floodfill(image, i - 1, j, rows, cols, oldColor, newColor); // Up
        floodfill(image, i + 1, j, rows, cols, oldColor, newColor); // D
        floodfill(image, i, j - 1, rows, cols, oldColor, newColor); // L
        floodfill(image, i, j + 1, rows, cols, oldColor, newColor); // R
    }


}
