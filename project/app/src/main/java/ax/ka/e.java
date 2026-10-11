/*
 * Decompiled with CFR 0.152.
 */
package ax.ka;

import ax.Z9.a;
import java.util.ArrayList;
import java.util.Comparator;

public final class e {
    public static Comparator<String> a() {
        return new Comparator<String>(){

            public int a(String string, String string2) {
                return string.substring(0, string.lastIndexOf("_")).compareTo(string2.substring(0, string2.lastIndexOf("_")));
            }
        };
    }

    public static String b(String charSequence, ax.ca.e e8) {
        charSequence = new StringBuilder((String)charSequence);
        ((StringBuilder)charSequence).append("_");
        ((StringBuilder)charSequence).append(e8.b());
        ((StringBuilder)charSequence).append("x");
        ((StringBuilder)charSequence).append(e8.a());
        return ((StringBuilder)charSequence).toString();
    }

    public static void c(String string, a a8) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string2 : a8.a()) {
            if (!string2.startsWith(string)) continue;
            arrayList.add(string2);
        }
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            string = arrayList.get(i8);
            a8.b(string);
        }
    }
}

