public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        return str1.trim() + str2.trim();
    }

    public Integer getIndexOrNull(String str1, char char1) {
        int index = str1.indexOf(char1);
        if (index < 0) {
            return null;
        } else {
            return index;
        }
    }

    public Integer getIndexOrNull(String str1, String str2) {
        int index = str1.indexOf(str2);
        if (index < 0) {
            return null;
        } else {
            return index;
        }
    }

    public String concatSubstring(String str1, int int1, int int2, String str2) {
        return str1.substring(int1, int2).concat(str2);
    }
}