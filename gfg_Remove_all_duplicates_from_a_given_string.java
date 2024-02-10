import java.util.ArrayList;

public class gfg_Remove_all_duplicates_from_a_given_string {
    String removeDuplicates(String str) {
        ArrayList<Character> arr=new ArrayList<>();
        String res="";
        for(char ch: str.toCharArray())
        {
            if(!arr.contains(ch))
            {
                res+= ch;
                arr.add(ch);
            }
        }
    return res;
    }
    public static void main(String[] args) {
        gfg_Remove_all_duplicates_from_a_given_string remover = new gfg_Remove_all_duplicates_from_a_given_string();
        
        // Example usage:
        String input = "geeksforgeeks";
        String result = remover.removeDuplicates(input);
        
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);
    }
}

