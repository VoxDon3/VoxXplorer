/*
 * Decompiled with CFR 0.152.
 */
package ax.u3;

public class e {
    private static String a(String string, String string2) {
        int n8 = Math.min(string.length(), string2.length());
        for (int i8 = 0; i8 < n8; ++i8) {
            if (string.charAt(i8) == string2.charAt(i8)) continue;
            return string.substring(0, i8);
        }
        return string.substring(0, n8);
    }

    private static String b(String string, String string2, String string3) {
        int n8 = string.length() - 1;
        int n9 = string2.length() - 1;
        int n10 = Math.min(string.length() - string3.length(), string2.length() - string3.length());
        int n11 = 0;
        while (string.charAt(n8) == string2.charAt(n9) && ++n11 <= n10) {
            int n12 = n8 - 1;
            int n13 = n9 - 1;
            if (n12 >= 0) {
                n8 = n12;
                n9 = n13;
                if (n13 >= 0) continue;
            }
            if (n12 < 0) {
                return string;
            }
            return string2;
        }
        if (n8 == string.length() - 1) {
            return "";
        }
        return string.substring(n8 + 1);
    }

    public static boolean c(String string, String string2, String string3) {
        if (string.length() == string2.length() && string.equalsIgnoreCase(string2)) {
            return true;
        }
        String string4 = e.a(string, string2);
        if (string4.length() <= 0) {
            return false;
        }
        String string5 = e.b(string, string2, string4);
        string = string.substring(string4.length(), string.length() - string5.length());
        string2 = string2.substring(string4.length(), string2.length() - string5.length());
        return e.d(string, string3) && e.d(string2, string3);
    }

    public static boolean d(String string, String string2) {
        if (string.length() == 0) {
            return true;
        }
        if (string.contains(string2)) {
            return true;
        }
        return string.matches("-[0-9]+| ?\\([0-9]+\\)");
    }
}

