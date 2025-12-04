//this is a efficient solution using string builder
package Strings;
import java.util.*;
class LicenceFormatting {
    static String licenseKeyFormatting(String s, int k) {
        // Step 1: Remove all dashes and convert to uppercase
        String cleaned = s.replace("-", "").toUpperCase();

        StringBuilder sb = new StringBuilder();

        int count = 0;
        // Step 2: Loop from end to start
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            sb.append(cleaned.charAt(i));
            count++;

            // Step 3: Insert dash after every k chars (except last group)
            if (count == k && i != 0) {
                sb.append('-');
                count = 0;
            }
        }

        // Step 4: Reverse the result to correct order
        return sb.reverse().toString();
    }

    public static void main(String[] args){
        String input = "5F3Z-2e-9-w";
        int k = 4;
        String res=licenseKeyFormatting(input,k);
        System.out.println(res);
    }
}

