/*
 * Decompiled with CFR 0.152.
 */
package ax.q5;

import android.content.Context;
import ax.ib.a;
import ax.q5.i;
import ax.q5.k;
import ax.r5.b;

public final class l
implements b<k> {
    private final a<Context> a;
    private final a<i> b;

    public l(a<Context> a8, a<i> a9) {
        this.a = a8;
        this.b = a9;
    }

    public static l a(a<Context> a8, a<i> a9) {
        return new l(a8, a9);
    }

    public static k c(Context context, Object object) {
        return new k(context, (i)object);
    }

    public k b() {
        return l.c(this.a.get(), this.b.get());
    }
}

