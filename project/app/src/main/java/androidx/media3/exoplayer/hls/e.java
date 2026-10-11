/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.hls;

import android.net.Uri;
import androidx.media3.exoplayer.hls.a;
import androidx.media3.exoplayer.hls.c;
import androidx.media3.exoplayer.hls.l;
import ax.E1.h;
import ax.E1.m;
import ax.P0.C;
import ax.P0.o;
import ax.P0.v;
import ax.S0.G;
import ax.S0.M;
import ax.S0.O;
import ax.U0.g;
import ax.U0.k;
import ax.Z0.I1;
import ax.d1.f;
import ax.d1.j;
import ax.j1.d;
import ax.m1.g;
import ax.q1.s;
import ax.q7.c;
import ax.r7.z;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

final class e
extends d {
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
    private z<Integer> K;
    private boolean L;
    private long M;
    private boolean N;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;
    private final g p;
    private final k q;
    private final ax.c1.f r;
    private final boolean s;
    private final boolean t;
    private final M u;
    private final ax.c1.e v;
    private final List<v> w;
    private final o x;
    private final h y;
    private final G z;

    private e(ax.c1.e e8, g g8, k k8, v v8, boolean bl, g g9, k k9, boolean bl2, Uri uri, List<v> list, int n8, Object object, long l8, long l9, long l10, int n9, boolean bl3, int n10, boolean bl4, boolean bl5, M m8, long l11, o o8, ax.c1.f f8, h h8, G g10, boolean bl6, boolean bl7, I1 i12) {
        super(g8, k8, v8, n8, object, l8, l9, l10);
        this.A = bl;
        this.o = n9;
        l8 = bl3 ? l9 - l8 : -9223372036854775807L;
        this.M = l8;
        this.l = n10;
        this.q = k9;
        this.p = g9;
        bl = k9 != null;
        this.H = bl;
        this.B = bl2;
        this.m = uri;
        this.s = bl5;
        this.u = m8;
        this.D = l11;
        this.t = bl4;
        this.v = e8;
        this.w = list;
        this.x = o8;
        this.r = f8;
        this.y = h8;
        this.z = g10;
        this.N = bl6;
        this.n = bl7;
        this.C = i12;
        this.K = ax.r7.z.z();
        this.k = O.getAndIncrement();
    }

    private static g h(g g8, byte[] byArray, byte[] byArray2) {
        if (byArray != null) {
            ax.S0.a.e(byArray2);
            return new a(g8, byArray, byArray2);
        }
        return g8;
    }

    public static e j(ax.c1.e e8, g object, v v8, long l8, f object2, c.e e9, Uri uri, List<v> list, int n8, Object object3, boolean bl, ax.c1.j j8, long l9, e object4, byte[] object5, byte[] object6, boolean bl2, boolean bl3, I1 i12, g.a object7) {
        Object object8;
        boolean bl4;
        f.g g8 = e9.a;
        object7 = new k.b().i(ax.S0.O.d(((j)object2).a, g8.q)).h(g8.j0).g(g8.k0);
        int n9 = e9.d ? 8 : 0;
        k k8 = ((k.b)object7).b(n9).a();
        boolean bl5 = object5 != null;
        object7 = bl5 ? (Object)androidx.media3.exoplayer.hls.e.l(ax.S0.a.e(g8.i0)) : null;
        g g9 = androidx.media3.exoplayer.hls.e.h((g)object, object5, (byte[])object7);
        object7 = g8.c0;
        if (object7 != null) {
            bl4 = object6 != null;
            object5 = bl4 ? androidx.media3.exoplayer.hls.e.l(ax.S0.a.e(((f.g)object7).i0)) : null;
            object8 = ax.S0.O.d(((j)object2).a, ((f.g)object7).q);
            object7 = new k.b().i((Uri)object8).h(((f.g)object7).j0).g(((f.g)object7).k0).a();
            object5 = androidx.media3.exoplayer.hls.e.h((g)object, object6, object5);
            object6 = object7;
        } else {
            object5 = null;
            object6 = null;
            bl4 = false;
        }
        long l10 = l8 + g8.f0;
        l8 = g8.d0;
        int n10 = ((f)object2).j + g8.e0;
        if (object4 != null) {
            object = ((e)object4).q;
            n9 = !(object6 == object || object6 != null && object != null && object6.a.equals((Object)((k)object).a) && object6.g == ((e)object4).q.g) ? 0 : 1;
            boolean bl6 = uri.equals((Object)((e)object4).m) && ((e)object4).J;
            object7 = ((e)object4).y;
            object8 = ((e)object4).z;
            object = n9 != 0 && bl6 && !((e)object4).L && ((e)object4).l == n10 ? ((e)object4).E : null;
            object2 = object;
            object = object8;
            object4 = object7;
        } else {
            object4 = new h();
            object = new G(10);
            object2 = null;
        }
        return new e(e8, g9, k8, v8, bl5, (g)object5, (k)object6, bl4, uri, list, n8, object3, l10, l10 + l8, e9.b, e9.c, e9.d ^ true, n10, g8.l0, bl, j8.a(n10), l9, g8.g0, (ax.c1.f)object2, (h)object4, (G)object, bl2, bl3, i12);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void k(g var1_1, k var2_2, boolean var3_4, boolean var4_5) throws IOException {
        block16: {
            block17: {
                block15: {
                    var6_6 = false;
                    var5_7 = false;
                    if (var3_4) {
                        if (this.G != 0) {
                            var5_7 = true;
                        }
                        var11_8 = var2_2;
                    } else {
                        var11_8 = var2_2.e(this.G);
                        var5_7 = var6_6;
                    }
                    try {
                        var11_8 = this.v(var1_1, (k)var11_8, var4_5);
                        if (!var5_7) break block15;
                        var11_8.n(this.G);
                    }
                    catch (Throwable var2_3) {
                        break block16;
                    }
                }
                try {
                    while (!this.I && (var3_4 = this.E.b((s)var11_8))) {
                    }
                }
                catch (Throwable var12_9) {
                    ** GOTO lbl-1000
                }
                catch (EOFException var12_10) {
                    ** GOTO lbl-1000
                }
                {
                    var7_11 = var11_8.getPosition();
                    var9_12 = var2_2.g;
lbl28:
                    // 2 sources

                    while (true) {
                        this.G = (int)(var7_11 - var9_12);
                        break block17;
                        break;
                    }
                }
lbl-1000:
                // 1 sources

                {
                    if ((this.d.f & 16384) == 0) ** GOTO lbl-1000
                    this.E.c();
                }
                {
                    var7_11 = var11_8.getPosition();
                    var9_12 = var2_2.g;
                    ** continue;
                }
            }
            ax.U0.j.a(var1_1);
            return;
lbl-1000:
            // 1 sources

            {
                throw var12_10;
            }
lbl-1000:
            // 1 sources

            {
                this.G = (int)(var11_8.getPosition() - var2_2.g);
                throw var12_9;
            }
        }
        ax.U0.j.a(var1_1);
        throw var2_3;
    }

    private static byte[] l(String object) {
        Object object2 = object;
        if (ax.q7.c.e((String)object).startsWith("0x")) {
            object2 = ((String)object).substring(2);
        }
        object = new BigInteger((String)object2, 16).toByteArray();
        object2 = new byte[16];
        int n8 = ((Object)object).length > 16 ? ((Object)object).length - 16 : 0;
        System.arraycopy(object, n8, object2, 16 - ((Object)object).length + n8, ((Object)object).length - n8);
        return object2;
    }

    private void s() throws IOException {
        this.k(this.i, this.b, this.A, true);
    }

    private void t() throws IOException {
        if (!this.H) {
            return;
        }
        ax.S0.a.e(this.p);
        ax.S0.a.e(this.q);
        this.k(this.p, this.q, this.B, false);
        this.G = 0;
        this.H = false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private long u(s object) throws IOException {
        int n8;
        int n9;
        block6: {
            byte[] byArray;
            object.m();
            try {
                this.z.X(10);
                object.p(this.z.f(), 0, 10);
                if (this.z.P() != 0x494433) {
                    return -9223372036854775807L;
                }
                this.z.c0(3);
                n9 = this.z.L();
                n8 = n9 + 10;
                if (n8 <= this.z.b()) break block6;
                byArray = this.z.f();
                this.z.X(n8);
            }
            catch (EOFException eOFException) {
                return -9223372036854775807L;
            }
            System.arraycopy(byArray, 0, this.z.f(), 0, 10);
        }
        object.p(this.z.f(), 10, n9);
        object = this.y.e(this.z.f(), n9);
        if (object == null) {
            return -9223372036854775807L;
        }
        n8 = ((C)object).e();
        for (n9 = 0; n9 < n8; ++n9) {
            C.a a8 = ((C)object).d(n9);
            if (!(a8 instanceof m)) continue;
            m m8 = (m)a8;
            if (!"com.apple.streaming.transportStreamTimestamp".equals(m8.b)) continue;
            System.arraycopy(m8.c, 0, this.z.f(), 0, 8);
            this.z.b0(0);
            this.z.a0(8);
            return this.z.F() & 0x1FFFFFFFFL;
        }
        return -9223372036854775807L;
    }

    private ax.q1.k v(g object, k k8, boolean bl) throws IOException {
        long l8 = object.f(k8);
        if (bl) {
            try {
                this.u.j(this.s, this.g, this.D);
            }
            catch (TimeoutException timeoutException) {
                throw new IOException(timeoutException);
            }
            catch (InterruptedException interruptedException) {
                throw new InterruptedIOException();
            }
        }
        ax.q1.k k9 = new ax.q1.k((ax.P0.k)object, k8.g, l8);
        Object object2 = k9;
        if (this.E == null) {
            l8 = this.u(k9);
            k9.m();
            object2 = this.r;
            object = object2 != null ? object2.f() : this.v.e(k8.a, this.d, this.w, this.u, object.l(), k9, this.C);
            this.E = object;
            if (object.d()) {
                object = this.F;
                l8 = l8 != -9223372036854775807L ? this.u.b(l8) : this.g;
                ((l)object).r0(l8);
            } else {
                this.F.r0(0L);
            }
            this.F.d0();
            this.E.a(this.F);
            object2 = k9;
        }
        this.F.o0(this.x);
        return object2;
    }

    public static boolean y(e e8, long l8, Uri uri, boolean bl, c.e e9, long l9) {
        if (e8 == null) {
            return false;
        }
        if (uri.equals((Object)e8.m) && e8.J) {
            return false;
        }
        long l10 = e9.a.f0;
        return !bl || l9 + l10 < l8;
        {
        }
    }

    @Override
    public void a() throws IOException {
        ax.c1.f f8;
        ax.S0.a.e(this.F);
        if (this.E == null && (f8 = this.r) != null && f8.e()) {
            this.E = this.r;
            this.H = false;
        }
        this.t();
        if (!this.I) {
            if (!this.t) {
                this.s();
            }
            this.J = this.I ^ true;
        }
    }

    @Override
    public void c() {
        this.I = true;
    }

    public void i() {
        this.N = false;
    }

    public int m(int n8) {
        ax.S0.a.g(this.N ^ true);
        if (n8 >= this.K.size()) {
            return 0;
        }
        return (Integer)this.K.get(n8);
    }

    public long n() {
        long l8 = this.M;
        long l9 = -9223372036854775807L;
        if (l8 != -9223372036854775807L) {
            l9 = this.g + l8;
        }
        return l9;
    }

    public void o(l l8, z<Integer> z8) {
        this.F = l8;
        this.K = z8;
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

    public void w(long l8) {
        this.M = l8;
    }

    public boolean x() {
        return this.N;
    }
}

