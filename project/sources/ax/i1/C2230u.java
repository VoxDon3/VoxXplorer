package ax.i1;

import android.net.Uri;
import androidx.media3.exoplayer.C0618p0;
import ax.P0.C0912v;
import ax.i1.InterfaceC2206C;
import ax.i1.InterfaceC2229t;
import ax.l1.InterfaceC2445D;
import ax.v7.InterfaceC3289b;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ax.i1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2230u implements InterfaceC2206C {
    private final InterfaceC2229t c0;
    private final q0 d0;
    private final byte[] e0;
    private final AtomicBoolean f0;
    private final AtomicReference<Throwable> g0;
    private final ArrayList<b> h0;
    private ax.v7.e<?> i0;
    private final Uri q;

    /* renamed from: ax.i1.u$a */
    class a implements InterfaceC3289b<Object> {
        a() {
        }

        @Override // ax.v7.InterfaceC3289b
        public void a(Object obj) {
            C2230u.this.f0.set(true);
        }

        @Override // ax.v7.InterfaceC3289b
        public void b(Throwable th) {
            C2230u.this.g0.set(th);
        }
    }

    /* renamed from: ax.i1.u$b */
    private final class b implements e0 {
        private int a = 0;

        public b() {
        }

        @Override // ax.i1.e0
        public int a(ax.Y0.O o, ax.V0.i iVar, int i) {
            int i2 = this.a;
            if (i2 == 2) {
                iVar.n(4);
                return -4;
            }
            if ((i & 2) != 0 || i2 == 0) {
                o.b = C2230u.this.d0.c(0).b(0);
                this.a = 1;
                return -5;
            }
            if (!C2230u.this.f0.get()) {
                return -3;
            }
            int length = C2230u.this.e0.length;
            iVar.n(1);
            iVar.g0 = 0L;
            if ((i & 4) == 0) {
                iVar.C(length);
                iVar.e0.put(C2230u.this.e0, 0, length);
            }
            if ((i & 1) == 0) {
                this.a = 2;
            }
            return -4;
        }

        @Override // ax.i1.e0
        public void b() throws IOException {
            Throwable th = (Throwable) C2230u.this.g0.get();
            if (th != null) {
                throw new IOException(th);
            }
        }

        @Override // ax.i1.e0
        public int c(long j) {
            return 0;
        }

        public void d() {
            if (this.a == 2) {
                this.a = 1;
            }
        }

        @Override // ax.i1.e0
        public boolean isReady() {
            return C2230u.this.f0.get();
        }
    }

    public C2230u(Uri uri, String str, InterfaceC2229t interfaceC2229t) {
        this.q = uri;
        C0912v P = new C0912v.b().y0(str).P();
        this.c0 = interfaceC2229t;
        this.d0 = new q0(new ax.P0.P(P));
        this.e0 = uri.toString().getBytes(StandardCharsets.UTF_8);
        this.f0 = new AtomicBoolean();
        this.g0 = new AtomicReference<>();
        this.h0 = new ArrayList<>();
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public boolean a(C0618p0 c0618p0) {
        return !this.f0.get();
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public long b() {
        return this.f0.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public boolean c() {
        return !this.f0.get();
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public long d() {
        return this.f0.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // ax.i1.InterfaceC2206C
    public long g(InterfaceC2445D[] interfaceC2445DArr, boolean[] zArr, e0[] e0VarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < interfaceC2445DArr.length; i++) {
            e0 e0Var = e0VarArr[i];
            if (e0Var != null && (interfaceC2445DArr[i] == null || !zArr[i])) {
                this.h0.remove(e0Var);
                e0VarArr[i] = null;
            }
            if (e0VarArr[i] == null && interfaceC2445DArr[i] != null) {
                b bVar = new b();
                this.h0.add(bVar);
                e0VarArr[i] = bVar;
                zArr2[i] = true;
            }
        }
        return j;
    }

    public void k() {
        ax.v7.e<?> eVar = this.i0;
        if (eVar != null) {
            eVar.cancel(false);
        }
    }

    @Override // ax.i1.InterfaceC2206C
    public long m(long j) {
        for (int i = 0; i < this.h0.size(); i++) {
            this.h0.get(i).d();
        }
        return j;
    }

    @Override // ax.i1.InterfaceC2206C
    public void n(InterfaceC2206C.a aVar, long j) {
        aVar.f(this);
        ax.v7.e<?> a2 = this.c0.a(new InterfaceC2229t.a(this.q));
        this.i0 = a2;
        ax.v7.c.a(a2, new a(), ax.v7.f.a());
    }

    @Override // ax.i1.InterfaceC2206C
    public long s() {
        return -9223372036854775807L;
    }

    @Override // ax.i1.InterfaceC2206C
    public q0 t() {
        return this.d0;
    }

    @Override // ax.i1.InterfaceC2206C
    public void l() {
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public void e(long j) {
    }

    @Override // ax.i1.InterfaceC2206C
    public long q(long j, ax.Y0.Z z) {
        return j;
    }

    @Override // ax.i1.InterfaceC2206C
    public void v(long j, boolean z) {
    }
}
