public class OddOccurrencesInArray {

    public int solution(int[] A) {
        // write your code in Java SE 8
        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j] && i != j) {
                    A[i] = -1;
                    A[j] = -1;
                    j = A.length;
                }
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] != -1)
                return A[i];
        }

        return 0; // should never happen
    }
}
