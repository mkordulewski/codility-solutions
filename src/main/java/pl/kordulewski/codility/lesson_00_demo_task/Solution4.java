package pl.kordulewski.codility.lesson_00_demo_task;

import java.util.Arrays;

public class Solution4 implements SolutionInterface {
    public int solution(int[] A) {
        Arrays.sort(A);
        int index = 1;
        while (Arrays.binarySearch(A, index)>=0) {
            index++;
        }
        return index;
    }
}
