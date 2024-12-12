package LeetCode;

public class LongestCommonPrefixLength_3043 {
    public static void main(String[] args) {
        int[] arr1 = {1, 10, 100};
        int[] arr2 = {1000};
        String longest_common_prefix = "";
        String temp = "";
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                String str1 = String.valueOf(arr1[i]);
                int length1 = str1.length();
                String str2 = String.valueOf(arr2[j]);
                int length2 = str2.length();
                temp = "";
                int length = (length1 < length2) ? length1 : length2;
                for (int k = 0; k < length; k++) {
                    if (str1.charAt(k) == str2.charAt(k))
                        temp += str1.charAt(k);
                    else
                        break;
                }
                if (longest_common_prefix.length() < temp.length())
                    longest_common_prefix = temp;
            }
        }
        System.out.println("The length of the longest common prefix is: " + longest_common_prefix.length());
    }
}
