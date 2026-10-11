package ax.J3;

import android.content.Context;
import ax.R3.a;
import ax.R3.i;
import ax.d4.l;
import ax.g4.C2117f;
import java.util.Map;

/* loaded from: classes.dex */
public final class d {
    private ax.P3.i b;
    private ax.Q3.d c;
    private ax.Q3.b d;
    private ax.R3.h e;
    private ax.S3.a f;
    private ax.S3.a g;
    private a.InterfaceC0183a h;
    private ax.R3.i i;
    private ax.d4.d j;
    private l.b m;
    private final Map<Class<?>, k<?, ?>> a = new ax.B.a();
    private int k = 4;
    private C2117f l = new C2117f();

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
            this.j = new ax.d4.f();
        }
        if (this.c == null) {
            int c = this.i.c();
            if (c > 0) {
                this.c = new ax.Q3.k(c);
            } else {
                this.c = new ax.Q3.e();
            }
        }
        if (this.d == null) {
            this.d = new ax.Q3.i(this.i.b());
        }
        if (this.e == null) {
            this.e = new ax.R3.g(this.i.e());
        }
        if (this.h == null) {
            this.h = new ax.R3.f(context);
        }
        if (this.b == null) {
            this.b = new ax.P3.i(this.e, this.h, this.g, this.f, ax.S3.a.m());
        }
        return new c(context, this.b, this.e, this.c, this.d, new l(this.m), this.j, this.k, this.l.N(), this.a);
    }

    d b(l.b bVar) {
        this.m = bVar;
        return this;
    }
}
