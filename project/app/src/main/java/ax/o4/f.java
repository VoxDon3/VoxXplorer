/*
 * Decompiled with CFR 0.152.
 */
package ax.o4;

import ax.o4.b;
import ax.o4.e;
import ax.o4.g;

public class f {
    b.r a = null;
    e b = null;
    String c = null;
    g.b d = null;
    String e = null;
    g.b f = null;

    public f() {
    }

    public f(f f8) {
        if (f8 == null) {
            return;
        }
        this.a = f8.a;
        this.b = f8.b;
        this.d = f8.d;
        this.e = f8.e;
        this.f = f8.f;
    }

    public boolean a() {
        b.r r8 = this.a;
        return r8 != null && r8.f() > 0;
    }

    public boolean b() {
        return this.b != null;
    }

    public boolean c() {
        return this.c != null;
    }

    public boolean d() {
        return this.e != null;
    }

    public boolean e() {
        return this.d != null;
    }

    public boolean f() {
        return this.f != null;
    }

    public f g(float f8, float f9, float f10, float f11) {
        this.f = new g.b(f8, f9, f10, f11);
        return this;
    }
}

