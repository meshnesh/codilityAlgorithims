public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int size = A.length;
        int[] rotated_arr = new int[size];

        for (int i = 0; i < size; i++) {
            rotated_arr[(i + K) % size] = A[i];
        }
        return rotated_arr;
    }

}
