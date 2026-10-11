/*
 * Decompiled with CFR 0.152.
 */
package ax.v5;

import ax.r5.b;
import ax.r5.d;
import ax.v5.f;
import ax.z5.a;

public final class g
implements b<ax.w5.f> {
    private final ax.ib.a<a> a;

    public g(ax.ib.a<a> a8) {
        this.a = a8;
    }

    public static ax.w5.f a(a a8) {
        return d.d(f.a(a8));
    }

    public static g b(ax.ib.a<a> a8) {
        return new g(a8);
    }

    public ax.w5.f c() {
        return g.a(this.a.get());
    }
}

