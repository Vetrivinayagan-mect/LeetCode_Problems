class Solution {
    public String reformat(String s) {
        if(s.length()==1) return s;
        StringBuilder str = new StringBuilder();
        Stack<Character> letters = new Stack<>();
        Stack<Character> digits = new Stack<>();
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)) letters.push(c);
            else if(Character.isDigit(c)) digits.push(c);
        }
        if(Math.abs(letters.size()-digits.size())>1) return "";
        
        while(!letters.isEmpty()&&!digits.isEmpty()){
            str.append(letters.pop()).append(digits.pop());
        }
        if(!letters.isEmpty()) str.append(letters.pop());
        if(!digits.isEmpty()) str.insert(0,digits.pop());

        return str.toString();
    }
}
