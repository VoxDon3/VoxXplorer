/*
 * Decompiled with CFR 0.152.
 */
package ax.x9;

import ax.Y8.b;
import java.util.ArrayList;
import java.util.List;

public class a {
    public static boolean a(String string) {
        return string != null && !string.trim().isEmpty();
    }

    public static String b(List<String> list, char c8) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            if (i8 > 0) {
                stringBuilder.append(c8);
            }
            stringBuilder.append(list.get(i8));
        }
        return stringBuilder.toString();
    }

    public static byte[] c(String string) {
        byte[] byArray = new byte[string.length() + 1];
        System.arraycopy(string.getBytes(b.e), 0, byArray, 0, string.length());
        return byArray;
    }

    public static List<String> d(String string, char c8) {
        int n8;
        ArrayList<String> arrayList = new ArrayList<String>();
        int n9 = 0;
        while ((n8 = string.indexOf(c8, n9)) != -1) {
            arrayList.add(string.substring(n9, n8));
            n9 = n8 + 1;
        }
        arrayList.add(string.substring(n9));
        return arrayList;
    }
}

