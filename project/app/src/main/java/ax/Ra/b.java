/*
 * Decompiled with CFR 0.152.
 */
package ax.Ra;

import ax.Ra.a;
import ax.Ra.d;
import ax.Ra.e;
import java.util.Set;

public class b {
    private com.google.gson.a a;
    private d b;
    private final e.g c;

    public b() {
        e.g g8;
        this.c = g8 = new e.g();
        g8.b = true;
        g8.d = false;
        g8.c = false;
    }

    public a a() {
        if (this.a == null) {
            this.a = new com.google.gson.a();
        }
        return new a(this.a.b(), this.b, this.c);
    }

    public b b(Set<String> set) {
        e.g g8 = this.c;
        g8.i = set;
        g8.j = true;
        return this;
    }

    public b c(Set<String> set) {
        e.g g8 = this.c;
        g8.h = set;
        g8.a = true;
        return this;
    }

    public b d(boolean bl) {
        e.g g8 = this.c;
        g8.f = bl;
        if (bl) {
            g8.d = bl;
        }
        return this;
    }

    public b e(boolean bl) {
        this.c.c = bl;
        return this;
    }

    public b f(d d8) {
        this.b = d8;
        return this;
    }

    public b g(com.google.gson.a a8) {
        this.a = a8;
        return this;
    }
}

