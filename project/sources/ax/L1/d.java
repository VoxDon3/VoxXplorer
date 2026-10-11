package ax.L1;

import android.net.Uri;
import ax.N1.t;
import ax.P0.E;
import ax.S0.C0968a;
import ax.S0.G;
import ax.q1.C2857q;
import ax.q1.C2862w;
import ax.q1.InterfaceC2858s;
import ax.q1.InterfaceC2859t;
import ax.q1.InterfaceC2863x;
import ax.q1.M;
import ax.q1.U;
import ax.q1.r;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class d implements r {
    public static final InterfaceC2863x d = new InterfaceC2863x() { // from class: ax.L1.c
        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x a(t.a aVar) {
            return C2862w.d(this, aVar);
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x b(int i) {
            return C2862w.b(this, i);
        }

        @Override // ax.q1.InterfaceC2863x
        public final r[] c() {
            return d.g();
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x d(boolean z) {
            return C2862w.c(this, z);
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ r[] e(Uri uri, Map map) {
            return C2862w.a(this, uri, map);
        }
    };
    private InterfaceC2859t a;
    private i b;
    private boolean c;

    public static /* synthetic */ r[] g() {
        return new r[]{new d()};
    }

    private static G h(G g) {
        g.b0(0);
        return g;
    }

    private boolean i(InterfaceC2858s interfaceC2858s) throws IOException {
        f fVar = new f();
        if (fVar.a(interfaceC2858s, true) && (fVar.b & 2) == 2) {
            int min = Math.min(fVar.i, 8);
            G g = new G(min);
            interfaceC2858s.p(g.f(), 0, min);
            if (b.p(h(g))) {
                this.b = new b();
            } else if (j.r(h(g))) {
                this.b = new j();
            } else if (h.o(h(g))) {
                this.b = new h();
            }
            return true;
        }
        return false;
    }

    @Override // ax.q1.r
    public void a(InterfaceC2859t interfaceC2859t) {
        this.a = interfaceC2859t;
    }

    @Override // ax.q1.r
    public void b(long j, long j2) {
        i iVar = this.b;
        if (iVar != null) {
            iVar.m(j, j2);
        }
    }

    @Override // ax.q1.r
    public boolean c(InterfaceC2858s interfaceC2858s) throws IOException {
        try {
            return i(interfaceC2858s);
        } catch (E unused) {
            return false;
        }
    }

    @Override // ax.q1.r
    public /* synthetic */ r e() {
        return C2857q.b(this);
    }

    @Override // ax.q1.r
    public int f(InterfaceC2858s interfaceC2858s, M m) throws IOException {
        C0968a.i(this.a);
        if (this.b == null) {
            if (!i(interfaceC2858s)) {
                throw E.a("Failed to determine bitstream type", null);
            }
            interfaceC2858s.m();
        }
        if (!this.c) {
            U u = this.a.u(0, 1);
            this.a.o();
            this.b.d(this.a, u);
            this.c = true;
        }
        return this.b.g(interfaceC2858s, m);
    }

    @Override // ax.q1.r
    public /* synthetic */ List k() {
        return C2857q.a(this);
    }

    @Override // ax.q1.r
    public void d() {
    }
}
