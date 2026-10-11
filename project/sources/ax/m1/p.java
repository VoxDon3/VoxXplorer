package ax.m1;

import android.net.Uri;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.U0.y;
import ax.i1.C2234y;
import ax.m1.o;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class p<T> implements o.e {
    public final long a = C2234y.a();
    public final ax.U0.k b;
    public final int c;
    private final y d;
    private final a<? extends T> e;
    private volatile T f;

    public interface a<T> {
        T a(Uri uri, InputStream inputStream) throws IOException;
    }

    public p(ax.U0.g gVar, ax.U0.k kVar, int i, a<? extends T> aVar) {
        this.d = new y(gVar);
        this.b = kVar;
        this.c = i;
        this.e = aVar;
    }

    @Override // ax.m1.o.e
    public final void a() throws IOException {
        this.d.t();
        ax.U0.i iVar = new ax.U0.i(this.d, this.b);
        try {
            iVar.b();
            this.f = this.e.a((Uri) C0968a.e(this.d.b()), iVar);
        } finally {
            d0.n(iVar);
        }
    }

    public long b() {
        return this.d.q();
    }

    public Map<String, List<String>> d() {
        return this.d.s();
    }

    public final T e() {
        return this.f;
    }

    public Uri f() {
        return this.d.r();
    }

    @Override // ax.m1.o.e
    public final void c() {
    }
}
