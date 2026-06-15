public class Solution {
    public bool IsPalindrome(string s) {
        List<char> charList = s.ToCharArray().ToList();
        charList.RemoveAll(letter => !(char.IsLetter(letter) || char.IsDigit(letter)));
        for (int i = 0; i < charList.Count; i++) {
            charList[i] = char.ToUpper(charList[i]);
        }

        
        int left = 0;
        int right = charList.Count - 1;

        while (left < right) {
            if (!charList[left].Equals(charList[right])) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
