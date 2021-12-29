import java.util.Arrays;

public class Monotonic {
    public boolean isMonotonic(int[] A) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < A.length-1; i++) {
            if (A[i] < A[i+1]) {
                decreasing = false;
            }
            if (A[i] > A[i + 1]) {
                increasing = false;
            }
        }
        return increasing || decreasing; // you can choose each one against your array
    }


    public static void main(String[] args) {

        int [] A = {0,1,2,3,3,4};

        Monotonic m = new Monotonic();
        System.out.println(m.isMonotonic(A));

        }





    }
