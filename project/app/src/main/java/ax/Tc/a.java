/*
 * Decompiled with CFR 0.152.
 */
package ax.Tc;

import ax.Sc.i;
import ax.Sc.j;
import ax.Sc.k;

public class a
extends k {
    private final j[] a;
    private j b = null;

    public a(j[] jArray) {
        this.a = jArray;
    }

    @Override
    public i c(String string) {
        j[] jArray = this.b;
        if (jArray != null) {
            return jArray.c(string);
        }
        for (j j8 : this.a) {
            i i8 = j8.c(string);
            if (i8 == null) continue;
            this.b = j8;
            return i8;
        }
        return null;
    }
}

