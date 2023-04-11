import java.util.Arrays;

public class classActivity {

    public static int[] createArray (int numElements, int initialValue) {
        int[] newArray = new int[numElements];

        for (int i = 0; i < numElements; i++) {
            newArray[i] = initialValue;
        }

        return newArray;
    }
    public static void main (String[] args) {
        int[] array = createArray(3, 1);

        // test print
        System.out.print(Arrays.toString(array));
    }
}
