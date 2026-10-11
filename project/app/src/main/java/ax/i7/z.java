/*
 * Decompiled with CFR 0.152.
 */
package ax.i7;

import ax.i7.A;
import ax.m7.y;
import java.io.IOException;

public abstract class z {
    private long a = -1L;
    private String b;
    private String c;
    private y d;

    public abstract void a(String var1, String var2) throws IOException;

    public abstract A b() throws IOException;

    public final String c() {
        return this.b;
    }

    public final long d() {
        return this.a;
    }

    public final String e() {
        return this.c;
    }

    public final y f() {
        return this.d;
    }

    public final void g(String string) throws IOException {
        this.b = string;
    }

    public final void h(long l8) throws IOException {
        this.a = l8;
    }

    public final void i(String string) throws IOException {
        this.c = string;
    }

    public final void j(y y8) throws IOException {
        this.d = y8;
    }

    public void k(int n8, int n9) throws IOException {
    }

    public void l(int n8) throws IOException {
    }
}

