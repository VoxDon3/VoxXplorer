/*
 * Decompiled with CFR 0.152.
 */
package ax.ya;

import ax.oa.f;
import ax.ra.d;
import ax.ra.e;
import java.io.IOException;

public abstract class a {
    private final ax.za.a a;

    protected a(ax.za.a a8) {
        if (a8 != null) {
            this.a = a8;
            return;
        }
        throw new IllegalArgumentException("Expecting non-null transport");
    }

    protected <R extends e> R a(d<R> d8) throws IOException {
        return this.a.d(d8);
    }

    /*
     * WARNING - void declaration
     */
    protected <R extends e> R b(d<R> object2, String string, ax.sa.a ... aArray) throws IOException {
        String var2_4;
        Object var3_5;
        R r8 = this.a((d<R>)object2);
        if (var3_5 == null) {
            return r8;
        }
        int n8 = ((e)r8).b();
        for (void var1_3 : var3_5) {
            if (var1_3 == null || !var1_3.l(n8)) continue;
            return r8;
        }
        throw new f((String)var2_4, n8);
    }

    protected String c(ax.xa.a a8) {
        return this.d(a8, true);
    }

    protected String d(ax.xa.a a8, boolean bl) {
        if (a8 == null && bl) {
            return null;
        }
        return a8.d();
    }
}

