/*
 * Decompiled with CFR 0.152.
 */
package ax.Y8;

public class a {
    static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] byArray) {
        return ax.Y8.a.b(byArray, 0, byArray.length);
    }

    public static String b(byte[] byArray, int n8, int n9) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i8 = 0; i8 < n9; ++i8) {
            byte by = byArray[n8 + i8];
            if (stringBuilder.length() > 0) {
                stringBuilder.append(' ');
            }
            char[] cArray = a;
            stringBuilder.append(cArray[by >> 4 & 0xF]);
            stringBuilder.append(cArray[by & 0xF]);
        }
        return stringBuilder.toString();
    }
}

