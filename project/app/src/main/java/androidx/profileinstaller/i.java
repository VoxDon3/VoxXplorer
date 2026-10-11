/*
 * Decompiled with CFR 0.152.
 */
package androidx.profileinstaller;

import java.util.Arrays;

public class i {
    static final byte[] a = new byte[]{48, 49, 53, 0};
    static final byte[] b = new byte[]{48, 49, 48, 0};
    static final byte[] c = new byte[]{48, 48, 57, 0};
    static final byte[] d = new byte[]{48, 48, 53, 0};
    static final byte[] e = new byte[]{48, 48, 49, 0};
    static final byte[] f = new byte[]{48, 48, 49, 0};
    static final byte[] g = new byte[]{48, 48, 50, 0};

    static String a(byte[] byArray) {
        if (Arrays.equals(byArray, e)) {
            return ":";
        }
        if (Arrays.equals(byArray, d)) {
            return ":";
        }
        return "!";
    }
}

