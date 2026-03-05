public class A6_CapitalizeWords {


    // Method to Capitalizes the first character of each word in the string
    public static String capitalizeWords(String str){
        StringBuilder sb = new StringBuilder("");
        
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){

            // If a space is found and it's not the last character,
            // capitalize the next character
            if (str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i)); // append space
                i++;         // move to next character
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));  // Append character as it is
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {

        // Create an empty StringBuilder object
        StringBuilder sb = new StringBuilder("");

        // Loop from 'a' to 'z'
        for(char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch); // Add each character to StringBuilder
        }

        // Time complexity: O(26) ≈ O(n)
        // Using String here would be slower due to new object creation
        System.out.println(sb);      
        System.out.println(sb.length()); 


        // Input string to test capitalizeWords method
        String str = "Hi, i am asita";
        System.out.println(capitalizeWords(str));


    }
}