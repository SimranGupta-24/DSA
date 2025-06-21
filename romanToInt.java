//https://leetcode.com/problems/roman-to-integer/description/

class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        char arr[] = s.toCharArray();
        ans = map.get(arr[arr.length-1]);
        for (int i = arr.length-2;i>=0;i--) {
            if(map.get(arr[i])<map.get(arr[i+1])){
                ans = ans - map.get(arr[i]);
            }else{
                ans = ans + map.get(arr[i]);
            }
        }
        return ans;
    }
}