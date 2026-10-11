package ax.l1;

import androidx.media3.exoplayer.C0622s;
import androidx.media3.exoplayer.M0;
import androidx.media3.exoplayer.N0;
import ax.P0.C0894c;
import ax.P0.N;
import ax.P0.T;
import ax.S0.C0968a;
import ax.i1.InterfaceC2209F;
import ax.i1.q0;

/* renamed from: ax.l1.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2451J {
    private a a;
    private ax.m1.e b;

    /* renamed from: ax.l1.J$a */
    public interface a {
        void a(M0 m0);

        void b();
    }

    protected final ax.m1.e b() {
        return (ax.m1.e) C0968a.i(this.b);
    }

    public T c() {
        return T.F;
    }

    public N0.a d() {
        return null;
    }

    public void e(a aVar, ax.m1.e eVar) {
        C0968a.g(this.a == null);
        this.a = aVar;
        this.b = eVar;
    }

    protected final void f() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.b();
        }
    }

    protected final void g(M0 m0) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(m0);
        }
    }

    public boolean h() {
        return false;
    }

    public abstract void i(Object obj);

    public void j() {
        this.a = null;
        this.b = null;
    }

    public abstract K k(N0[] n0Arr, q0 q0Var, InterfaceC2209F.b bVar, N n) throws C0622s;

    public void l(C0894c c0894c) {
    }

    public void m(T t) {
    }
}
