import java.util.Arrays;
import java.util.List;
import org.example.duplicateZeroes;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class TestDuplicateZeroes {
    duplicateZeroes solution = new duplicateZeroes();

    @Test
    public void solution() {
        int[] sample1 = new int[] {1,0,2,3,0,4,5,0};
        int[] expected1 = new int[] {1,0,0,2,3,0,0,4};

        Assertions.assertArrayEquals(expected1, solution.duplicateZero(sample1));

    }

}
