/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Gb.l;
import ax.Ob.d;

public final class F {
    public static final byte[] a(String object) {
        l.f(object, "<this>");
        object = ((String)object).getBytes(d.b);
        l.e(object, "this as java.lang.String).getBytes(charset)");
        return object;
    }

    public static final String b(byte[] byArray) {
        l.f(byArray, "<this>");
        return new String(byArray, d.b);
    }
}

