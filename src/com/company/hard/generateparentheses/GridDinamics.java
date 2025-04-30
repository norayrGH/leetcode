package com.company.hard.generateparentheses;

import java.util.ArrayList;
import java.util.List;

class GridDinamics {
    public static boolean hasPath(int[][] matrix, int startX, int startY) {
        int endX = matrix.length - 1;
        int endY = matrix[0].length - 1;

        // Check if starting or ending points are invalid
        if (!isValidPoint(matrix, startX, startY) || !isValidPoint(matrix, endX, endY)) {
            return false;
        }

        // If starting point is the same as ending point
        if (startX == endX && startY == endY) {
            return true;
        }

        // Mark the current point as visited
        matrix[startX][startY] = -1;

        // Check in all four directions
// Check in all four directions
        boolean pathExists = hasPath(matrix, startX + 1, startY) ||
            hasPath(matrix, startX - 1, startY) ||
            hasPath(matrix, startX, startY + 1) ||
            hasPath(matrix, startX, startY - 1);


        // If a path is found in any direction
        if (pathExists) {
            return true;
        }

        // If no path found
        return false;
    }

    private static boolean isValidPoint(int[][] matrix, int x, int y) {
        return x >= 0 && x < matrix.length &&
            y >= 0 && y < matrix[0].length &&
            matrix[x][y] != -1; // Ensure the cell is not visited
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 0, 0},
            {0, -1, -1},
            {0, -1, 0}
        };
        System.out.println(hasPath(matrix,0,0));
    }
}