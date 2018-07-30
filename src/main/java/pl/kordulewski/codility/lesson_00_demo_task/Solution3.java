package pl.kordulewski.codility.lesson_00_demo_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Test Score: 55% (free evaluation report)
 */
public class Solution3 implements SolutionInterface {
    public int solution(int[] A) {
        Arrays.sort(A);
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, Arrays.stream(A).boxed().toArray(Integer[]::new));
        int index = 1;
        while (list.contains(index)) {
            index++;
        }
        return index;
    }
}
