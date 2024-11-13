import java.util.Scanner;

public class SpoonerismGenerator {

    public static void main(String[] args) {
        SpoonerismGenerator generator = new SpoonerismGenerator();
        generator.run();
    }

   
    public String getWord(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }

    
    public int vowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                return i; 
            }
        }
        return -1; 
    }

    
    public void run() {
        
        String word1 = getWord("Word 1: ");
        String word2 = getWord("Word 2: ");

        
        int index1 = vowelIndex(word1);
        int index2 = vowelIndex(word2);

        
        if (index1 == -1 || index2 == -1 || index1 == 0 || index2 == 0) {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
        } else {
            
            String firstPart1 = word1.substring(0, index1); 
            String firstPart2 = word2.substring(0, index2); 
            
            String rest1 = word1.substring(index1); 
            String rest2 = word2.substring(index2); 
            
          
            String spoonerizedWord1 = firstPart2 + rest1; 
            String spoonerizedWord2 = firstPart1 + rest2; 
            
           
            System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
        }
    }
}