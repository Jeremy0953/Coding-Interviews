public class Solution2 {
    public String replaceSpace (String s) {
        StringBuffer ret = new StringBuffer("");
        for (int i = 0; i<s.length();i++)
        {
            if (s.charAt(i)==' ')
            {
                ret.append("%20");
            }
            else
            {
                ret.append(s.charAt(i));
            }
        }
        return ret.toString();
    }
}
