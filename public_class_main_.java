import java.util.Arrays;

public class Main {
    public static void main(String[] args) 
    {
        // Corrected the typo in the String array creation
        String[] ss = new String[]{"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
        
        // Sort the array in ascending order
        Arrays.sort(ss);
        
        // Corrected the escape sequences and added proper formatting
        System.out.println("Ascend\t\tDescend\n");
        
        // Loop through the array and print the names in ascending and descending order
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i] + "\t\t" + ss[ss.length-1-i]);
        }
    }
}

//chatgpt helped me with some typos and bugs