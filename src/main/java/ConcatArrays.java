import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ConcatArrays {
    public static void concatArr() {
        int[] arr1 = {9, 11, 16, 21, 28, 36, 5};
        int[] arr2 = {3, 9, 10, 29, 40, 45, 7};
        int[] arr3 = {2, 5, 12, 14, 24, 39, 33};
        int[] arr4 = {1, 6, 13, 37, 38, 40, 9};
        int[] arr5 = {1, 21, 25, 29, 34, 37, 36};
        int[] result = new int[arr1.length+arr2.length+arr3.length+arr4.length+arr5.length];
        System.arraycopy(arr1,0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        System.arraycopy(arr3, 0, result, arr1.length + arr2.length, arr3.length);
        System.arraycopy(arr4, 0, result, arr1.length + arr2.length + arr3.length, arr4.length);
        System.arraycopy(arr5, 0, result, arr1.length + arr2.length + arr3.length + arr4.length, arr5.length);

        System.out.println(Arrays.toString(result));
    }
}
