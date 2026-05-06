public class part_c {
    
    // Function to calculate binary and return as String
    public static String convertToBinaryString(int num) {
        if (num == 0) return "0";
        
        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            binary.append(num % 2);
            num = num / 2;
        }
        
        return binary.reverse().toString();
    }

    public static void main(String[] args) {
        String result = convertToBinaryString(26);
        System.out.println("Binary string for 26: " + result);
    }
}
