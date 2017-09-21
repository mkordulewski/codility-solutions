package pl.kordulewski.codility.lesson_00_demo_task;

/**
 * Bez użycia typów zewnętrznych, bez instrukcji importu.
 */
public class Solution6 implements SolutionInterface {
    public int solution(int[] A) {
        int max = 0;
        for (int i = 0; i<A.length;i++) {
            if (max<A[i]) {
                max = A[i];
            }
        }
        int[] aggr = new int[max+1];
        for (int i = 0; i<A.length;i++) {
            if (A[i]>0) {
                aggr[A[i]] = 1;
            }
        }
        for (int i = 1; i<aggr.length;i++) {
            if (aggr[i]==0) {
                return i;
            }
        }
        return max+1;
    }
}
