package Strings;

class LicenceFormatting1 {
    static String licenseKeyFormatting(String s, int k) {
        // Step 1: Remove dashes and convert to uppercase
        String res = s.replace("-", "").toUpperCase();

        // Step 2: Handle empty case
        if (res.length() == 0) return "";

        String ans = "";
        int count = 0;

        // Step 3: Loop from the end of the string
        for (int i = res.length() - 1; i >= 0; i--) {
            ans = res.charAt(i) + ans;  // add current character at front
            count++;

            // After every k characters, add a dash (if not at the beginning)
            if (count == k && i != 0) {
                ans = "-" + ans;
                count = 0;
            }
        }

        return ans;
    }
    public static void main(String[] args){
        String s = "5F3Z-2e-9-w";
        int k = 4;
        String res=licenseKeyFormatting(s,k);
        System.out.println(res);
    }
}

