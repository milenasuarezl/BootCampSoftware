package code.msuarez.palindrome;

public class Palindrome {

    public boolean isPalindrome(String world) {
        if(world != null) {
            String worldWithoutSpaces = world.replaceAll("\\s", "").toLowerCase();
            String reverseWorld = new StringBuilder(worldWithoutSpaces).reverse().toString();
            if(!worldWithoutSpaces.equals(reverseWorld)) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }
}
