import org.junit.Assert;
import org.junit.Test;

public class BinaryGap {
    @Test
    public void testSolution() {
        Assert.assertEquals(3, new BinaryGap().solution(123456));
    }
    

    private int solution(int N) {
        int firstIndex1 = 0;
//        Look for the first 1
        for (int i = 0; i < 32; i++) {
            if (getNthBit(N, i) == 1) {
                firstIndex1 = i;
                break;
            }
        }

//        every 1 is a beginning of the end of a binary gap

        int currentGap = 0;
        int biggestGap = 0;
//        we check the next bit

        for (int i = firstIndex1; i < 32; i++) {
//            if it's zero'
            if (getNthBit(N, i) == 0) {
                currentGap ++;
            } else {
//                if it's a 1, then it's the end of the most recent binary gap.

//                we check if it's the biggest gap so far.
                if (currentGap > biggestGap) {
                    biggestGap = currentGap;
                }
//               This is the end of the current gap
                currentGap = 0;
            }
        }
        return biggestGap;
    }

    private int getNthBit(int theNumber, int bitPosition) {
        int mask = 1;
        final int theNumberShifted = theNumber >> bitPosition;
        return theNumberShifted & mask;
    }
}
