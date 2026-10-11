/*
 * Decompiled with CFR 0.152.
 */
package ax.oa;

import ax.sa.a;
import java.io.IOException;

public class f
extends IOException {
    private final a c0;
    private final int q;

    public f(String string, int n8) {
        super(f.a(string, n8));
        this.q = n8;
        this.c0 = a.h(n8);
    }

    private static String a(String string, int n8) {
        Object object = a.h(n8);
        object = object == null ? "" : String.format("(%s)", object);
        return String.format("%s returned error code: 0x%08X %s", string, n8, object);
    }
}

