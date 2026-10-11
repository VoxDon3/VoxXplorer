/*
 * Decompiled with CFR 0.152.
 */
package ax.q7;

public final class c {
    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        int n8 = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (n8 != charSequence2.length()) {
            return false;
        }
        for (int i8 = 0; i8 < n8; ++i8) {
            int n9;
            char c8;
            char c9 = charSequence.charAt(i8);
            if (c9 == (c8 = charSequence2.charAt(i8)) || (n9 = c.b(c9)) < 26 && n9 == c.b(c8)) {
                continue;
            }
            return false;
        }
        return true;
    }

    private static int b(char c8) {
        return (char)((c8 | 0x20) - 97);
    }

    public static boolean c(char c8) {
        return c8 >= 'a' && c8 <= 'z';
    }

    public static boolean d(char c8) {
        return c8 >= 'A' && c8 <= 'Z';
    }

    public static String e(String object) {
        int n8 = ((String)object).length();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!c.d(((String)object).charAt(i8))) continue;
            object = ((String)object).toCharArray();
            while (i8 < n8) {
                Object object2 = object[i8];
                if (c.d((char)object2)) {
                    object[i8] = (char)(object2 ^ 0x20);
                }
                ++i8;
            }
            return String.valueOf((char[])object);
        }
        return object;
    }

    public static String f(String object) {
        int n8 = ((String)object).length();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!c.c(((String)object).charAt(i8))) continue;
            object = ((String)object).toCharArray();
            while (i8 < n8) {
                Object object2 = object[i8];
                if (c.c((char)object2)) {
                    object[i8] = (char)(object2 ^ 0x20);
                }
                ++i8;
            }
            return String.valueOf((char[])object);
        }
        return object;
    }
}

