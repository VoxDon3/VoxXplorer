/*
 * Decompiled with CFR 0.152.
 */
package ax.Yd;

import ax.Xd.g;
import ax.Yd.b;
import ax.Yd.c;
import ax.Zd.m;
import java.util.ArrayList;
import java.util.List;

public class d
implements c {
    b a;
    List<g> b;
    String c;
    m d;
    String e;
    String f;
    Object[] g;
    long h;
    Throwable i;

    public void a(g g8) {
        if (g8 == null) {
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList<g>(2);
        }
        this.b.add(g8);
    }

    public b b() {
        return this.a;
    }

    public m c() {
        return this.d;
    }

    public void d(Object[] objectArray) {
        this.g = objectArray;
    }

    public void e(b b8) {
        this.a = b8;
    }

    public void f(m m8) {
        this.d = m8;
    }

    public void g(String string) {
        this.c = string;
    }

    public void h(String string) {
        this.f = string;
    }

    public void i(String string) {
        this.e = string;
    }

    public void j(Throwable throwable) {
        this.i = throwable;
    }

    public void k(long l8) {
        this.h = l8;
    }
}

