/*
 * Decompiled with CFR 0.152.
 */
package ax.hb;

import ax.Za.b;
import ax.db.k;

class a
implements k {
    private final b a;

    public a(b b8) {
        this.a = b8;
    }

    @Override
    public void a(k k8) {
        k8 = (a)k8;
        this.a.g(((a)k8).a);
    }

    @Override
    public k b() {
        return new a(this.a.a());
    }

    b c() {
        return this.a;
    }
}

