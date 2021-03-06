package week6.day2;

import java.util.Arrays;
import java.util.Collections;

public class MazeGenerator {

    public static final char WALL = '#';
    public static final char PASSAGE = '.';
    public static final int[][] DIRECTIONS = new int[][]{
            {0, -1},
            {1, 0},
            {0, 1},
            {-1, 0},
    };
    private static int size = 25;
    private static char[][] mazeArray = new char[size][size];

    public static void main(String[] args) {

        for (int i = 0; i < mazeArray.length; i++) {
            for (int j = 0; j < mazeArray[i].length; j++) {
                mazeArray[i][j] = WALL;
            }
        }

        printMaze(generateMaze(new int[]{0, 0}));

    }

    public static boolean isGoodPath(char[][] maze, int[] point) {
        if (!isPointInsideMaze(point)) {
            return false;
        }

        int[][] dirs = DIRECTIONS;

        int countPath = 0;
        for (int[] dir : dirs) {
            int[] newPoint = new int[]{(point[0] + dir[0]), (point[1] + dir[1])};
            if (isPointInsideMaze(newPoint)
                    && (maze[newPoint[0]][newPoint[1]]) == PASSAGE) {
                countPath++;
            }
        }

        if (countPath > 1) {
            return false;
        }
        return true;
    }

    private static boolean isPointInsideMaze(int[] point) {
        return point[0] >= 0 && point[0] < size && point[1] >= 0 && point[1] < size;
    }

    public static char[][] generateMaze(int[] point) {

        int[][] dirs = DIRECTIONS;

        Collections.shuffle(Arrays.asList(dirs));

        for (int[] dir : dirs) {
            int[] newPoint = new int[]{
                    (point[0] + dir[0]), (point[1] + dir[1])
            };

            if (isGoodPath(mazeArray, newPoint)) {
                mazeArray[newPoint[0]][newPoint[1]] = PASSAGE;
                generateMaze(newPoint);
            }
        }

        return mazeArray;

    }

    public static void printMaze(char[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}