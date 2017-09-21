package pl.kordulewski.codility.lesson_00_demo_task;

import java.util.Arrays;

public class Solution2 implements SolutionInterface {
    public int solution(int[] A) {
        Arrays.sort(A);
        int index = 0;
        Integer previous = null;
        while (index<A.length) {
            if (previous != null && previous > 0 &&(previous+1) < A[index] ) {
                return previous+1;
            }
            previous = A[index];
            index++;
        }
        if (previous == null || (A.length>=1 && A[A.length-1]<=0)) {
            return 1;
        } else {
            return previous+1;
        }
    }
}
