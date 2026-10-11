/*
 * Decompiled with CFR 0.152.
 */
package ax.Kc;

import java.io.File;

public class l {
    public static String a(String string) {
        if (string == null) {
            return null;
        }
        int n8 = (string = new File(string).getName()).lastIndexOf(46);
        if (n8 < 0) {
            return string;
        }
        return string.substring(0, n8);
    }
}

