package pl.kordulewski.codility.lesson_00_demo_task;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest {
    
    @Parameterized.Parameters(name = "{0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new Solution1() },
                { new Solution2() },
                { new Solution3() },
                { new Solution4() },
                { new Solution5() },
                { new Solution6() },
                { new Solution7() }
        });
    }

    public SolutionTest(SolutionInterface implementation) {
        this.implementation = implementation;
    }
    
    private SolutionInterface implementation;
    
    @Test
    public void sampleData() {
        Assert.assertEquals(5, implementation.solution(new int[]{1, 3, 6, 4, 1, 2}));
        Assert.assertEquals(4, implementation.solution(new int[]{1, 2, 3}));
        Assert.assertEquals(1, implementation.solution(new int[]{-1, -3}));
    }

    @Test
    public void emptyArray() {
        Assert.assertEquals(1, implementation.solution(new int[]{}));
    }

    @Test
    public void negativeNumbers() {
        Assert.assertEquals(1, implementation.solution(new int[]{-1}));
        Assert.assertEquals(1, implementation.solution(new int[]{-1, -1, -1, -1}));
    }

    @Test
    public void zeros() {
        Assert.assertEquals(1, implementation.solution(new int[]{0}));
        Assert.assertEquals(1, implementation.solution(new int[]{0, 0, 0, 0}));
    }

    @Test
    public void test1() {
        Assert.assertEquals(1, implementation.solution(new int[]{-1}));
        Assert.assertEquals(1, implementation.solution(new int[]{0}));
        Assert.assertEquals(2, implementation.solution(new int[]{1}));
        Assert.assertEquals(2, implementation.solution(new int[]{-1,1}));
        Assert.assertEquals(2, implementation.solution(new int[]{1,-1}));
        Assert.assertEquals(2, implementation.solution(new int[]{1,1000000}));
    }
    
}
