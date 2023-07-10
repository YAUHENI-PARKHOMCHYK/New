package lesson11;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class Practic {
    public static void main(String[] args) {

        int [][] matrix = new int[][]{
                {0,1,1,0},
                {1,0,1,1},
                {1,1,0,1},
                {0,1,1,0}
        };
        System.out.println("Ребер между вершинами: " + edge(matrix));
//        System.out.println(way(matrix,1,4));

    }

    public static int edge(int [][] matrix) {
        int edgeSum = 0;
        int y = 0;
        for (int x = 0; x < matrix.length; x++) {
            while ( y<matrix.length) {
                if (matrix[x][y] == 1) {
                    edgeSum++;
                }
                y++;
            }
            y=x+1;
        }
        return edgeSum;
    }

//    public static int way(int topStart, int topEnd){
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(topStart);
//
//        while (!queue.isEmpty()){
//            int currentTop = queue.poll();
//            if(currentTop == topEnd){
//                System.out.println("Путь найден");
//                break;
//            }
//        }
//        int result;
//        int x = topX;
//        int y = topY;
//
//        return result;
//    }
}
