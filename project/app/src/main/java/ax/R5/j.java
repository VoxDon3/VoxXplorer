/*
 * Decompiled with CFR 0.152.
 */
package ax.R5;

public class j {
    private static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] byArray) {
        int n8 = byArray.length;
        char[] cArray = new char[n8 + n8];
        int n9 = 0;
        for (n8 = 0; n8 < byArray.length; ++n8) {
            byte by = byArray[n8];
            char[] cArray2 = b;
            cArray[n9] = cArray2[(by & 0xFF) >>> 4];
            cArray[n9 + 1] = cArray2[by & 0xF];
            n9 += 2;
        }
        return new String(cArray);
    }

    public static String b(byte[] byArray, boolean bl) {
        int n8 = byArray.length;
        StringBuilder stringBuilder = new StringBuilder(n8 + n8);
        for (int i8 = 0; !(i8 >= n8 || bl && i8 == n8 - 1 && (byArray[i8] & 0xFF) == 0); ++i8) {
            char[] cArray = a;
            stringBuilder.append(cArray[(byArray[i8] & 0xF0) >>> 4]);
            stringBuilder.append(cArray[byArray[i8] & 0xF]);
        }
        return stringBuilder.toString();
    }
}

