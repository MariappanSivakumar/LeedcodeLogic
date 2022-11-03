class Solution {
    public boolean checkString(String s) {
        if(s.indexOf('b')!=-1)
        return s.lastIndexOf('a')<s.indexOf('b');
        else return true;
    }
}
