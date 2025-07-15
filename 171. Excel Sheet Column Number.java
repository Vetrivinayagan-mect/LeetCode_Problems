class Solution {
    public int titleToNumber(String columnTitle) {
        int len = columnTitle.length();
        int sum=0;
        int i=0;
        while(i<len){
            sum = sum * 26 + (columnTitle.charAt(i++) - 'A' + 1);
        }
        return sum;
    }
}
