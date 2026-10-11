package ax.Yd;

import ax.Xd.g;
import ax.Zd.m;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class d implements c {
    b a;
    List<g> b;
    String c;
    m d;
    String e;
    String f;
    Object[] g;
    long h;
    Throwable i;

    public void a(g gVar) {
        if (gVar == null) {
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList(2);
        }
        this.b.add(gVar);
    }

    public b b() {
        return this.a;
    }

    public m c() {
        return this.d;
    }

    public void d(Object[] objArr) {
        this.g = objArr;
    }

    public void e(b bVar) {
        this.a = bVar;
    }

    public void f(m mVar) {
        this.d = mVar;
    }

    public void g(String str) {
        this.c = str;
    }

    public void h(String str) {
        this.f = str;
    }

    public void i(String str) {
        this.e = str;
    }

    public void j(Throwable th) {
        this.i = th;
    }

    public void k(long j) {
        this.h = j;
    }
}
