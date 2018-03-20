package ru.itis;

import java.util.ArrayList;

/**
 * 19.03.2018
 * AlgorithmLee
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class AlgorithmLee {

    private final int block = -2;
    private final int free = -1;
    private int d = 0;
    private Point begin;
    private Point end;
    private boolean check;
    private int[][] grid;

    private boolean checkCoordinates() {
        return begin.getX() >= 0 && begin.getX() < grid.length &&
                begin.getY() >= 0 && begin.getY() < grid[0].length &&
                end.getX() >= 0 && end.getX() < grid.length &&
                end.getY() >= 0 && end.getY() < grid[0].length;
    }

    private boolean canGo() {
        if (!checkCoordinates() || (grid[begin.getX()][begin.getY()] == block) || grid[end.getX()][end.getY()] == block) {
            return false;
        }
        this.check = false;
        while (grid[end.getX()][end.getY()] == free && !check) {
            check = true;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == d)
                        wavePropagation(i, j);
                }
            }
            d++;
        }
        return grid[end.getX()][end.getY()] != free;
    }

    private void wavePropagation(int x, int y) {

        if (x + 1 < grid.length && grid[x + 1][y] == free) {
            grid[x + 1][y] = d + 1;
            check = false;
        }
        if (x + 1 < grid.length && y + 1 < grid[0].length & grid[x + 1][y + 1] == free) {
            grid[x + 1][y + 1] = d + 1;
            check = false;
        }
        if (x + 1 < grid.length && y - 1 >= 0 & grid[x + 1][y - 1] == free) {
            grid[x + 1][y - 1] = d + 1;
            check = false;
        }
        if (y + 1 < grid.length && grid[x][y + 1] == free) {
            grid[x][y + 1] = d + 1;
            check = false;
        }
        if (x - 1 >= 0 && grid[x - 1][y] == free) {
            grid[x - 1][y] = d + 1;
            check = false;
        }
        if (x - 1 >= 0 && y + 1 < grid[0].length && grid[x - 1][y + 1] == free) {
            grid[x - 1][y + 1] = d + 1;
            check = false;
        }
        if (x - 1 >= 0 && y - 1 >= 0 && grid[x - 1][y - 1] == free) {
            grid[x - 1][y - 1] = d + 1;
            check = false;
        }
        if (y - 1 >= 0 && grid[x][y - 1] == free) {
            grid[x][y - 1] = d + 1;
            check = false;
        }

    }

    public AlgorithmLee(int[][] grid, Point start, Point end){
        this.grid = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++)
            System.arraycopy(grid[i], 0, this.grid[i], 0, grid[0].length);
        this.begin = start;
        this.end = end;
    }
    private Point findWay(int x, int y){
        if (x + 1 < grid.length && grid[x + 1][y] == d)
            return new Point(x + 1, y);
        if (x + 1 < grid.length && y + 1 < grid[0].length && grid[x + 1][y + 1] == d)
            return new Point(x + 1, y + 1);
        if (x + 1 < grid.length && y - 1 >= 0 && grid[x + 1][y - 1] == d)
            return new Point(x + 1, y - 1);
        if (y + 1 < grid[0].length && grid[x][y + 1] == d)
            return new Point(x, y + 1);
        if (y - 1 >= 0 && grid[x][y - 1] == d)
            return new Point(x, y - 1);
        if (x - 1 >= 0 && grid[x - 1][y] == d)
            return new Point(x - 1, y);
        if (x - 1 >= 0 && y + 1 < grid[0].length && grid[x - 1][y + 1] == d)
            return new Point(x - 1, y + 1);
        return new Point(x - 1, y - 1);
    }

    public static ArrayList<Point> getWay(int[][] input, Point begin, Point end){
        AlgorithmLee algorithm = new AlgorithmLee(input, begin, end);
        if (!algorithm.canGo())
            throw new IllegalArgumentException();
        ArrayList<Point> answer = new ArrayList<>();
        int currentX = end.getX();
        int currentY = end.getY();
        while(algorithm.d > 0) {
            algorithm.d--;
            Point next = algorithm.findWay(currentX, currentY);
            currentX = next.getX();
            currentY = next.getY();
            answer.add(0, next);
        }
        answer.add(end);
        return answer;
    }


}
