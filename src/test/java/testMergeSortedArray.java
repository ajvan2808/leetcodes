import org.example.mergeSortedArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testMergeSortedArray {
    mergeSortedArray mergeSortedArr = new mergeSortedArray();

    @Test
    public void solution() {
        int[] sampleArr1 = new int[] {1,2,7,0,0,0};
        int m = 3;
        int[] sampleArr2 = new int[] {2, 5, 6};
        int n = 3;

        int[] expected = new int[] {1, 2, 2, 5, 6, 7};
//        mergeSortedArr.merge(sampleArr1, m, sampleArr2, n);
        Assertions.assertArrayEquals(expected, mergeSortedArr.merge(sampleArr1, m, sampleArr2, n));
    }
}
