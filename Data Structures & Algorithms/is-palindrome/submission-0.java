class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }

        String beforeReverse = sb.toString();
        
        return sb.reverse().toString().equalsIgnoreCase(beforeReverse);
    }
}
