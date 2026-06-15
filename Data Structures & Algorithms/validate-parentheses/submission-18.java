class Solution {
    public boolean isValid(String s) {
        Deque<String> strStack = new ArrayDeque<>();
        String[] openChars = {"(", "[", "{"};
        String[] closeChars = {")", "]", "}"};

        if (s.length() % 2 != 0) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            String letter = String.valueOf(s.charAt(i));
            
            if (Arrays.asList(openChars).contains(letter)) {
                strStack.push(letter);
            } 
            
            if (Arrays.asList(closeChars).contains(letter) && strStack.size() > 0) {
                if (letter.equals(")")){
                    if (!strStack.contains("(")) {
                        return false;
                    }
                    
                    if (strStack.peek().equals("(")) {
                        strStack.pop();
                    }
                }
                if (letter.equals("]")){
                    if (!strStack.contains("[")) {
                        return false;
                    }
                    
                    if (strStack.peek().equals("[")) {
                        strStack.pop();
                    }
                }
                if (letter.equals("}")){
                    if (!strStack.contains("{")) {
                        return false;
                    }
                    
                    if (strStack.peek().equals("{")) {
                        strStack.pop();
                    }
                }
            } else if (Arrays.asList(closeChars).contains(letter) && strStack.size() <= 0) {
                return false;
            }
        }
        System.out.println(strStack.toString());
        return (strStack.size() == 0);
    }
}
