/*
 * Decompiled with CFR 0.152.
 */
package ax.H9;

import ax.D9.b;
import ax.I9.u;
import ax.Qa.a;
import ax.Qa.c;

public class m {
    private String a;
    private u b;

    public m(String string) {
        this.a = string;
    }

    public String b() {
        return this.a;
    }

    b c() {
        u u8 = this.b;
        if (u8 == null) {
            return null;
        }
        return u8.p();
    }

    public u d() {
        return this.b;
    }

    public void e(a a8) {
        if (this.c() == null) {
            a8.run();
            return;
        }
        this.c().c(this.c().d(), a8);
    }

    public void f(c c8, a a8) {
        if (this.c() == null) {
            a8.run();
            return;
        }
        this.c().c(c8, a8);
    }

    public void g(String string) {
        this.a = string;
    }

    public void h(u u8) {
        if (this.b == null) {
            this.b = u8;
        }
    }
}

