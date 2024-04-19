package Nullpoint;
public class Q2 {

    public static void main(String[] args) {
    	
        String input = "a2b3c4d5e";
        
        try {
            if (input == null || input.isEmpty()) {
                throw new NullPointerException("Input string is null or empty");
            }
            
            boolean found = false;
            for (int i = 0; i < input.length() - 2; i++) {
                char currentChar = input.charAt(i);
                char nextChar = input.charAt(i + 1);
                char nextNextChar = input.charAt(i + 2);
                
                if (isVowel(currentChar) && !Character.isDigit(nextChar) && Character.isDigit(nextNextChar)) {
                    System.out.println("Numeric character: " + nextNextChar);
                    found = true;
                }
            }
            
            if (!found) {
                System.out.println("No numeric characters found after a vowel and consonant.");
            }
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
    
    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}


