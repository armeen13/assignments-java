import java.util.Scanner;

public class part_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();
        
        if (num == 0) {
            System.out.println("Binary: 0");
            return;
        }

        int[] binary = new int[40]; 
        int index = 0;
        
        while (num > 0) {
            binary[index++] = num % 2; 
            num = num / 2;
        }

        System.out.print("Binary: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
        System.out.println();
    }
}


    