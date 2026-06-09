class Solution {
    public boolean isValid(String s) {
        List<Character> t = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '('){
                t.add(s.charAt(i));
            }
            else{
                if(t.isEmpty()){return false;}
                else{
                    Character a = t.remove(t.size()-1);
                    if(s.charAt(i) == '}' && a != '{'){return false;}
                    if(s.charAt(i) == ']' && a != '['){return false;}
                    if(s.charAt(i) == ')' && a != '('){return false;}
                }
            }
        }
        return t.size() == 0;
    }
}
