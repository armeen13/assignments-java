import java.util.Arrays;

public class part_b {
    
    public static int[] convertToBinaryArray(int num) {
        if (num == 0) return new int[]{0};
        
        int[] tempBinary = new int[40];
        int index = 0;
        while (num > 0) {
            tempBinary[index++] = num % 2;
            num = num / 2;
        }
        
        int[] finalBinary = new int[index];
        for (int i = 0; i < index; i++) {
            finalBinary[i] = tempBinary[index - 1 - i];
        }
        return finalBinary;
    }

    public static void main(String[] args) {
        int[] result = convertToBinaryArray(27);
        System.out.println("Binary array for 27: " + Arrays.toString(result));
    }
}
