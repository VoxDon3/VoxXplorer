/*
 * Decompiled with CFR 0.152.
 */
package ax.h9;

import ax.Z8.a;
import ax.h9.b;
import ax.h9.d;

public class a {
    public static byte[] a(d<?, ?> object) {
        b b8 = ((d)object).b();
        int n8 = b8.S();
        b8.T(((d)object).c().a());
        object = new byte[((d)object).c().c() - ((d)object).c().a()];
        try {
            b8.E((byte[])object);
            b8.T(n8);
            return object;
        }
        catch (a.b b9) {
            throw new ax.k9.d("Cannot read packet bytes from buffer", b9);
        }
    }
}

