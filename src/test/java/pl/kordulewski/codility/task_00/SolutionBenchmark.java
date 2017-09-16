package pl.kordulewski.codility.task_00;

import com.carrotsearch.junitbenchmarks.AbstractBenchmark;
import com.carrotsearch.junitbenchmarks.BenchmarkOptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionBenchmark extends AbstractBenchmark {
    
    private final int TEST_ARRAY_SIZE = 1000000;

    @Parameterized.Parameters(name="{0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new Solution1() },
                { new Solution2() },
              //{ new Solution3() },  // really slow solution
                { new Solution4() },
              //{ new Solution5() },  // really slow solution
                { new Solution6() },
                { new Solution7() }
        });
    }

    public SolutionBenchmark(SolutionInterface implementation) {
        this.implementation = implementation;
        this.array = prepareArray(TEST_ARRAY_SIZE);
    }
    
    private SolutionInterface implementation;
    private int[] array;

    @Test
    @BenchmarkOptions(benchmarkRounds = 2, warmupRounds = 1)
    public void bigArrayBenchmark() {
        Assert.assertEquals(TEST_ARRAY_SIZE, implementation.solution(array));
    }

    @Test
    @BenchmarkOptions(benchmarkRounds = 2, warmupRounds = 1)
    public void smallArrayBenchmark() {
        int[] array = new int[]{1,100000000};
        Assert.assertEquals(2, implementation.solution(array));
    }
    
    private static int[] prepareArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i<size; i++) {
            array[i] = i;
        }
        return array;
    }
    
}
