/*
 * Decompiled with CFR 0.152.
 */
package ax.W8;

import ax.W8.e;
import ax.W8.f;
import ax.W8.g;
import ax.W8.i;
import ax.Xd.d;
import ax.Y8.c;
import ax.Z8.a;
import java.util.EnumSet;

public class b
extends f {
    private static final d j = ax.Xd.f.k(b.class);
    private int a;
    private int b;
    private EnumSet<e> c;
    private byte[] d;
    private i e;
    private int f;
    private int g;
    private String h;
    private g i;

    private void h(a.c c8) throws a.b {
        if (this.f > 0) {
            c8.T(this.g);
            this.i = new g().e(c8);
        }
    }

    private void i(a.c c8) throws a.b {
        if (this.c.contains(ax.W8.e.g0)) {
            this.f = c8.J();
            c8.U(2);
            this.g = c8.P();
            return;
        }
        c8.U(8);
    }

    private void j(a.c c8) throws a.b {
        if (this.a > 0) {
            c8.T(this.b);
            this.h = c8.H(ax.Y8.b.c, this.a / 2);
        }
    }

    private void k(a.c c8) throws a.b {
        this.a = c8.J();
        c8.U(2);
        this.b = c8.P();
    }

    private void l(a.c object) throws a.b {
        if (this.c.contains(ax.W8.e.f0)) {
            this.e = object = new i().b((a.c)object);
            j.s("Windows version = {}", object);
            return;
        }
        ((a)object).U(8);
    }

    public EnumSet<e> b() {
        return this.c;
    }

    public byte[] c() {
        return this.d;
    }

    public g d() {
        return this.i;
    }

    public String e() {
        return this.h;
    }

    public i f() {
        return this.e;
    }

    public void g(a.c c8) throws a.b {
        c8.H(ax.Y8.b.a, 8);
        c8.N();
        this.k(c8);
        this.c = c.a.d(c8.N(), e.class);
        this.d = c8.G(8);
        c8.U(8);
        this.i(c8);
        this.l(c8);
        this.j(c8);
        this.h(c8);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NtlmChallenge{\n  targetName='");
        stringBuilder.append(this.h);
        stringBuilder.append("',\n  negotiateFlags=");
        stringBuilder.append(this.c);
        stringBuilder.append(",\n  serverChallenge=");
        stringBuilder.append(ax.Y8.a.a(this.d));
        stringBuilder.append(",\n  version=");
        stringBuilder.append(this.e);
        stringBuilder.append(",\n  targetInfo=");
        stringBuilder.append(this.i);
        stringBuilder.append("\n");
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

