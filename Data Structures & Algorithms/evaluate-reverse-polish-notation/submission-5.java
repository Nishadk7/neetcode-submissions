class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> t = new Stack<>();
        int a;
        int b;
        for(int i = 0;i<tokens.length;i++){
            
            if (tokens[i].equals("/")){
                a = Integer.parseInt(t.pop());
                b = Integer.parseInt(t.pop());
                int c = b/a;
                String cs = String.valueOf(c);
                t.push(cs);
            }
            else if (tokens[i].equals("*")){                
                a = Integer.parseInt(t.pop());
                b = Integer.parseInt(t.pop());
                int c = a*b;
                String cs = String.valueOf(c);
                t.push(cs);}
            else if (tokens[i].equals("+")){
                a = Integer.parseInt(t.pop());
                b = Integer.parseInt(t.pop());
                int c = a+b;
                String cs = String.valueOf(c);
                t.push(cs);
            }
            else if (tokens[i].equals("-")){
                a = Integer.parseInt(t.pop());
                b = Integer.parseInt(t.pop());
                int c = b-a;
                String cs = String.valueOf(c);
                t.push(cs);
            }
            else{
                t.push(tokens[i]);
            }
            //System.out.println(t.peek());
        }
        return Integer.parseInt(t.pop());
    }
}
