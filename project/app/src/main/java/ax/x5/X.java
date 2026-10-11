/*
 * Decompiled with CFR 0.152.
 */
package ax.x5;

import android.content.Context;
import ax.ib.a;
import ax.r5.b;
import ax.x5.W;

public final class X
implements b<W> {
    private final a<Context> a;
    private final a<String> b;
    private final a<Integer> c;

    public X(a<Context> a8, a<String> a9, a<Integer> a10) {
        this.a = a8;
        this.b = a9;
        this.c = a10;
    }

    public static X a(a<Context> a8, a<String> a9, a<Integer> a10) {
        return new X(a8, a9, a10);
    }

    public static W c(Context context, String string, int n8) {
        return new W(context, string, n8);
    }

    public W b() {
        return X.c(this.a.get(), this.b.get(), this.c.get());
    }
}

