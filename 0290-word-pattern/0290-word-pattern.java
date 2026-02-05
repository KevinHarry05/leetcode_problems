class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        String arr[]=s.split(" ");
        if(pattern.length()!=arr.length) return false;
        for(int i=0;i<arr.length;i++)
        {
            char c=pattern.charAt(i);
            String ss=arr[i];
            if(map.containsKey(c))
            {
                if(!map.get(c).equals(ss)) return false;
            }
            else
            {
                if(map.containsValue(ss)) return false;
                map.put(c,ss);
            }
        } 
        return true;   
    }
}