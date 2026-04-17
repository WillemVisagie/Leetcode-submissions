class Solution {

    public String encode(List<String> strs) {
        int curLen;
        StringBuilder out = new StringBuilder("");
        for (String str : strs) {
            curLen = str.length();
            out.append(String.valueOf(curLen) + "#");
            out.append(str);
        }
        return out.toString();
    }

    public List<String> decode(String str) {
        int len = 0;
        int i = 0;
        int c;
        ArrayList<String> res = new ArrayList<>();
        StringBuilder cur = new StringBuilder("");
        while (i < str.length()) {
            len = 0;
            while (Character.isDigit(str.charAt(i)) && i < str.length()) {
                len = 10*len + ((int) str.charAt(i) - (int) '0');
                i++;
            }
            i++;
            c = 0;
            cur.setLength(0);
            while (c < len && i < str.length()) {
                cur.append(str.charAt(i));
                i++;
                c++;
            }
            res.add(cur.toString());
        }
        return res;
    }
}
