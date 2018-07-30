package pl.kordulewski.codility.lesson_00_demo_task;

import java.util.HashMap;
import java.util.Map;

/**
 * Test Score: 100% (free evaluation report)
 */
public class Solution1 implements SolutionInterface {
    public int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : A) {
            if (map.get(new Integer(i))==null) {
                map.put(new Integer(i), 1);
            } else {
                map.put(new Integer(i), map.get(new Integer(i))+1);
            }
        }
        int c = 1;
        while (map.get(new Integer(c)) != null) {
            c++;
        }
        return c;
    }
}
