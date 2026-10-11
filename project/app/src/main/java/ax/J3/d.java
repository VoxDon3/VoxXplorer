/*
 * Decompiled with CFR 0.152.
 */
package ax.J3;

import android.content.Context;
import ax.J3.c;
import ax.J3.k;
import ax.Q3.b;
import ax.Q3.e;
import ax.Q3.i;
import ax.R3.a;
import ax.R3.g;
import ax.R3.h;
import ax.R3.i;
import ax.S3.a;
import ax.d4.f;
import ax.d4.l;
import java.util.Map;

public final class d {
    private final Map<Class<?>, k<?, ?>> a = new ax.B.a();
    private ax.P3.i b;
    private ax.Q3.d c;
    private b d;
    private h e;
    private a f;
    private a g;
    private a.a h;
    private ax.R3.i i;
    private ax.d4.d j;
    private int k = 4;
    private ax.g4.f l = new ax.g4.f();
    private l.b m;

    public c a(Context context) {
        if (this.f == null) {
            this.f = ax.S3.a.f();
        }
        if (this.g == null) {
            this.g = ax.S3.a.c();
        }
        if (this.i == null) {
            this.i = new i.a(context).i();
        }
        if (this.j == null) {
            this.j = new f();
        }
        if (this.c == null) {
            int n8 = this.i.c();
            this.c = n8 > 0 ? new ax.Q3.k(n8) : new e();
        }
        if (this.d == null) {
            this.d = new i(this.i.b());
        }
        if (this.e == null) {
            this.e = new g(this.i.e());
        }
        if (this.h == null) {
            this.h = new ax.R3.f(context);
        }
        if (this.b == null) {
            this.b = new ax.P3.i(this.e, this.h, this.g, this.f, ax.S3.a.m());
        }
        l l8 = new l(this.m);
        return new c(context, this.b, this.e, this.c, this.d, l8, this.j, this.k, this.l.N(), this.a);
    }

    d b(l.b b8) {
        this.m = b8;
        return this;
    }
}

