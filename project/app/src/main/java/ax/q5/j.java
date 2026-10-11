/*
 * Decompiled with CFR 0.152.
 */
package ax.q5;

import android.content.Context;
import ax.q5.i;
import ax.r5.b;
import ax.z5.a;

public final class j
implements b<i> {
    private final ax.ib.a<Context> a;
    private final ax.ib.a<a> b;
    private final ax.ib.a<a> c;

    public j(ax.ib.a<Context> a8, ax.ib.a<a> a9, ax.ib.a<a> a10) {
        this.a = a8;
        this.b = a9;
        this.c = a10;
    }

    public static j a(ax.ib.a<Context> a8, ax.ib.a<a> a9, ax.ib.a<a> a10) {
        return new j(a8, a9, a10);
    }

    public static i c(Context context, a a8, a a9) {
        return new i(context, a8, a9);
    }

    public i b() {
        return j.c(this.a.get(), this.b.get(), this.c.get());
    }
}

