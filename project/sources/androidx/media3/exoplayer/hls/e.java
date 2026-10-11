package androidx.media3.exoplayer.hls;

import android.net.Uri;
import androidx.media3.exoplayer.hls.c;
import ax.E1.m;
import ax.P0.C;
import ax.P0.C0906o;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.G;
import ax.S0.M;
import ax.S0.O;
import ax.U0.k;
import ax.Z0.I1;
import ax.d1.f;
import ax.j1.AbstractC2306d;
import ax.m1.g;
import ax.q1.C2851k;
import ax.q1.InterfaceC2858s;
import ax.q7.C2876c;
import ax.r7.AbstractC2991z;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
final class e extends AbstractC2306d {
    private static final AtomicInteger O = new AtomicInteger();
    private final boolean A;
    private final boolean B;
    private final I1 C;
    private final long D;
    private ax.c1.f E;
    private l F;
    private int G;
    private boolean H;
    private volatile boolean I;
    private boolean J;
    private AbstractC2991z<Integer> K;
    private boolean L;
    private long M;
    private boolean N;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;
    private final ax.U0.g p;
    private final ax.U0.k q;
    private final ax.c1.f r;
    private final boolean s;
    private final boolean t;
    private final M u;
    private final ax.c1.e v;
    private final List<C0912v> w;
    private final C0906o x;
    private final ax.E1.h y;
    private final G z;

    private e(ax.c1.e eVar, ax.U0.g gVar, ax.U0.k kVar, C0912v c0912v, boolean z, ax.U0.g gVar2, ax.U0.k kVar2, boolean z2, Uri uri, List<C0912v> list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, M m, long j4, C0906o c0906o, ax.c1.f fVar, ax.E1.h hVar, G g, boolean z6, boolean z7, I1 i1) {
        super(gVar, kVar, c0912v, i, obj, j, j2, j3);
        this.A = z;
        this.o = i2;
        this.M = z3 ? j2 - j : -9223372036854775807L;
        this.l = i3;
        this.q = kVar2;
        this.p = gVar2;
        this.H = kVar2 != null;
        this.B = z2;
        this.m = uri;
        this.s = z5;
        this.u = m;
        this.D = j4;
        this.t = z4;
        this.v = eVar;
        this.w = list;
        this.x = c0906o;
        this.r = fVar;
        this.y = hVar;
        this.z = g;
        this.N = z6;
        this.n = z7;
        this.C = i1;
        this.K = AbstractC2991z.z();
        this.k = O.getAndIncrement();
    }

    private static ax.U0.g h(ax.U0.g gVar, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return gVar;
        }
        C0968a.e(bArr2);
        return new a(gVar, bArr, bArr2);
    }

    public static e j(ax.c1.e eVar, ax.U0.g gVar, C0912v c0912v, long j, ax.d1.f fVar, c.e eVar2, Uri uri, List<C0912v> list, int i, Object obj, boolean z, ax.c1.j jVar, long j2, e eVar3, byte[] bArr, byte[] bArr2, boolean z2, boolean z3, I1 i1, g.a aVar) {
        ax.U0.g gVar2;
        ax.U0.k kVar;
        boolean z4;
        Uri uri2;
        ax.E1.h hVar;
        G g;
        ax.c1.f fVar2;
        f.g gVar3 = eVar2.a;
        ax.U0.k a = new k.b().i(O.d(fVar.a, gVar3.q)).h(gVar3.j0).g(gVar3.k0).b(eVar2.d ? 8 : 0).a();
        boolean z5 = bArr != null;
        ax.U0.g h = h(gVar, bArr, z5 ? l((String) C0968a.e(gVar3.i0)) : null);
        f.C0275f c0275f = gVar3.c0;
        if (c0275f != null) {
            boolean z6 = bArr2 != null;
            byte[] l = z6 ? l((String) C0968a.e(c0275f.i0)) : null;
            kVar = new k.b().i(O.d(fVar.a, c0275f.q)).h(c0275f.j0).g(c0275f.k0).a();
            gVar2 = h(gVar, bArr2, l);
            z4 = z6;
        } else {
            gVar2 = null;
            kVar = null;
            z4 = false;
        }
        long j3 = j + gVar3.f0;
        long j4 = j3 + gVar3.d0;
        int i2 = fVar.j + gVar3.e0;
        if (eVar3 != null) {
            ax.U0.k kVar2 = eVar3.q;
            boolean z7 = kVar == kVar2 || (kVar != null && kVar2 != null && kVar.a.equals(kVar2.a) && kVar.g == eVar3.q.g);
            uri2 = uri;
            boolean z8 = uri2.equals(eVar3.m) && eVar3.J;
            hVar = eVar3.y;
            g = eVar3.z;
            fVar2 = (z7 && z8 && !eVar3.L && eVar3.l == i2) ? eVar3.E : null;
        } else {
            uri2 = uri;
            hVar = new ax.E1.h();
            g = new G(10);
            fVar2 = null;
        }
        return new e(eVar, h, a, c0912v, z5, gVar2, kVar, z4, uri2, list, i, obj, j3, j4, eVar2.b, eVar2.c, !eVar2.d, i2, gVar3.l0, z, jVar.a(i2), j2, gVar3.g0, fVar2, hVar, g, z2, z3, i1);
    }

    private void k(ax.U0.g gVar, ax.U0.k kVar, boolean z, boolean z2) throws IOException {
        ax.U0.k e;
        long position;
        long j;
        if (z) {
            r0 = this.G != 0;
            e = kVar;
        } else {
            e = kVar.e(this.G);
        }
        try {
            C2851k v = v(gVar, e, z2);
            if (r0) {
                v.n(this.G);
            }
            while (!this.I && this.E.b(v)) {
                try {
                    try {
                    } catch (EOFException e2) {
                        if ((this.d.f & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                            throw e2;
                        }
                        this.E.c();
                        position = v.getPosition();
                        j = kVar.g;
                    }
                } catch (Throwable th) {
                    this.G = (int) (v.getPosition() - kVar.g);
                    throw th;
                }
            }
            position = v.getPosition();
            j = kVar.g;
            this.G = (int) (position - j);
        } finally {
            ax.U0.j.a(gVar);
        }
    }

    private static byte[] l(String str) {
        if (C2876c.e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private void s() throws IOException {
        k(this.i, this.b, this.A, true);
    }

    private void t() throws IOException {
        if (this.H) {
            C0968a.e(this.p);
            C0968a.e(this.q);
            k(this.p, this.q, this.B, false);
            this.G = 0;
            this.H = false;
        }
    }

    private long u(InterfaceC2858s interfaceC2858s) throws IOException {
        interfaceC2858s.m();
        try {
            this.z.X(10);
            interfaceC2858s.p(this.z.f(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.z.P() != 4801587) {
            return -9223372036854775807L;
        }
        this.z.c0(3);
        int L = this.z.L();
        int i = L + 10;
        if (i > this.z.b()) {
            byte[] f = this.z.f();
            this.z.X(i);
            System.arraycopy(f, 0, this.z.f(), 0, 10);
        }
        interfaceC2858s.p(this.z.f(), 10, L);
        C e = this.y.e(this.z.f(), L);
        if (e == null) {
            return -9223372036854775807L;
        }
        int e2 = e.e();
        for (int i2 = 0; i2 < e2; i2++) {
            C.a d = e.d(i2);
            if (d instanceof m) {
                m mVar = (m) d;
                if ("com.apple.streaming.transportStreamTimestamp".equals(mVar.b)) {
                    System.arraycopy(mVar.c, 0, this.z.f(), 0, 8);
                    this.z.b0(0);
                    this.z.a0(8);
                    return this.z.F() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    private C2851k v(ax.U0.g gVar, ax.U0.k kVar, boolean z) throws IOException {
        ax.c1.f e;
        long f = gVar.f(kVar);
        if (z) {
            try {
                this.u.j(this.s, this.g, this.D);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e2) {
                throw new IOException(e2);
            }
        }
        C2851k c2851k = new C2851k(gVar, kVar.g, f);
        if (this.E == null) {
            long u = u(c2851k);
            c2851k.m();
            ax.c1.f fVar = this.r;
            if (fVar != null) {
                e = fVar.f();
            } else {
                e = this.v.e(kVar.a, this.d, this.w, this.u, gVar.l(), c2851k, this.C);
                c2851k = c2851k;
            }
            this.E = e;
            if (e.d()) {
                this.F.r0(u != -9223372036854775807L ? this.u.b(u) : this.g);
            } else {
                this.F.r0(0L);
            }
            this.F.d0();
            this.E.a(this.F);
        }
        this.F.o0(this.x);
        return c2851k;
    }

    public static boolean y(e eVar, long j, Uri uri, boolean z, c.e eVar2, long j2) {
        if (eVar == null) {
            return false;
        }
        if (uri.equals(eVar.m) && eVar.J) {
            return false;
        }
        return !z || j2 + eVar2.a.f0 < j;
    }

    @Override // ax.m1.o.e
    public void a() throws IOException {
        ax.c1.f fVar;
        C0968a.e(this.F);
        if (this.E == null && (fVar = this.r) != null && fVar.e()) {
            this.E = this.r;
            this.H = false;
        }
        t();
        if (this.I) {
            return;
        }
        if (!this.t) {
            s();
        }
        this.J = !this.I;
    }

    @Override // ax.m1.o.e
    public void c() {
        this.I = true;
    }

    public void i() {
        this.N = false;
    }

    public int m(int i) {
        C0968a.g(!this.N);
        if (i >= this.K.size()) {
            return 0;
        }
        return this.K.get(i).intValue();
    }

    public long n() {
        long j = this.M;
        if (j != -9223372036854775807L) {
            return this.g + j;
        }
        return -9223372036854775807L;
    }

    public void o(l lVar, AbstractC2991z<Integer> abstractC2991z) {
        this.F = lVar;
        this.K = abstractC2991z;
    }

    public void p() {
        this.L = true;
    }

    public boolean q() {
        return this.J;
    }

    public boolean r() {
        return this.M != -9223372036854775807L;
    }

    public void w(long j) {
        this.M = j;
    }

    public boolean x() {
        return this.N;
    }
}
