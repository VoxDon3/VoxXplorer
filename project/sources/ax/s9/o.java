package ax.s9;

import ax.Q8.F;
import ax.Q8.q;
import ax.Q8.v;
import ax.Q8.w;
import ax.R8.y;
import ax.i9.C2292d;
import ax.l9.C2484b;
import ax.l9.C2485c;
import ax.n9.C2626c;
import ax.n9.C2629f;
import ax.r9.C3016b;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class o {
    private long a;
    private ax.k9.e b;
    private C3016b c;
    private final Set<v> d;
    private final C2485c e;
    private C2292d f;
    private final C2626c g;
    private final Set<ax.J8.a> h;
    private final boolean i;

    public o(long j, ax.k9.e eVar, C3016b c3016b, Set<v> set, C2292d c2292d, C2484b c2484b, C2626c c2626c, Set<ax.J8.a> set2, Set<w> set3) {
        this.a = j;
        this.b = eVar;
        this.c = c3016b;
        this.d = set;
        C2485c f = c2484b.f();
        this.e = f;
        this.f = c2292d;
        this.g = c2626c;
        this.h = set2;
        this.i = set3.contains(w.SMB2_SHAREFLAG_ENCRYPT_DATA) && f.a().j() && c2484b.r();
    }

    void a() throws ax.c9.e {
        try {
            q qVar = (q) ax.a9.d.a(this.c.H(new y(this.e.a(), this.c.p(), this.a)), this.f.D(), TimeUnit.MILLISECONDS, ax.c9.e.q);
            if (ax.K8.a.j(qVar.c().m())) {
                return;
            }
            throw new F(qVar.c(), "Error closing connection to " + this.b);
        } finally {
            this.g.b(new C2629f(this.c.p(), this.a));
        }
    }

    public C2292d b() {
        return this.f;
    }

    public C2485c c() {
        return this.e;
    }

    public C3016b d() {
        return this.c;
    }

    public String e() {
        return this.b.c();
    }

    public long f() {
        return this.a;
    }

    public String toString() {
        return String.format("TreeConnect[%s](%s)", Long.valueOf(this.a), this.b);
    }
}
