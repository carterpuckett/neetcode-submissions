public class Solution {
    public bool IsAnagram(string s, string t) {
        if (s.Length != t.Length) {
            return false;
        }

        Dictionary<char, int> sMap = new Dictionary<char, int>();
        Dictionary<char, int> tMap = new Dictionary<char, int>();

        foreach (char letter in s) {
            if (sMap.ContainsKey(letter)) {
                sMap[letter] = sMap[letter] + 1;
            } else {
                sMap[letter] = 1;
            }
            Console.WriteLine(sMap[letter]);
        }
        Console.WriteLine("\n");

        foreach (char letter in t) {
            if (tMap.ContainsKey(letter)) {
                tMap[letter] = tMap[letter] + 1;
            } else {
                tMap[letter] = 1;
            }
            Console.WriteLine(tMap[letter]);
        }
        

        if (sMap.Count == tMap.Count && sMap.All(element => tMap.TryGetValue(element.Key, out int value) && value == element.Value)) {
            return true;
        }

        return false;
    }
}
