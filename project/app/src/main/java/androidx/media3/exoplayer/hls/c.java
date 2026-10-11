/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.p0;
import ax.P0.P;
import ax.P0.v;
import ax.S0.O;
import ax.S0.d0;
import ax.U0.g;
import ax.U0.k;
import ax.U0.z;
import ax.Y0.Z;
import ax.Z0.I1;
import ax.c1.j;
import ax.d1.f;
import ax.d1.m;
import ax.l1.D;
import ax.m1.g;
import ax.r7.F;
import ax.u7.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class c {
    private final ax.c1.e a;
    private final g b;
    private final g c;
    private final j d;
    private final Uri[] e;
    private final v[] f;
    private final m g;
    private final P h;
    private final List<v> i;
    private final androidx.media3.exoplayer.hls.b j;
    private final I1 k;
    private final long l;
    private boolean m;
    private byte[] n;
    private IOException o;
    private Uri p;
    private Uri q;
    private boolean r;
    private D s;
    private long t;
    private long u;

    public c(ax.c1.e arrayList, m m8, Uri[] uriArray, v[] vArray, ax.c1.d d8, z z8, j j8, long l8, List<v> list, I1 i12, ax.m1.f f8) {
        this.a = arrayList;
        this.g = m8;
        this.e = uriArray;
        this.f = vArray;
        this.d = j8;
        this.l = l8;
        this.i = list;
        this.k = i12;
        this.u = -9223372036854775807L;
        this.j = new androidx.media3.exoplayer.hls.b(4);
        this.n = d0.f;
        this.t = -9223372036854775807L;
        arrayList = d8.a(1);
        this.b = arrayList;
        if (z8 != null) {
            arrayList.d(z8);
        }
        this.c = d8.a(3);
        this.h = new P(vArray);
        arrayList = new ArrayList<Integer>();
        for (int i8 = 0; i8 < uriArray.length; ++i8) {
            if ((vArray[i8].f & 0x4000) != 0) continue;
            arrayList.add(i8);
        }
        this.s = new d(this.h, ax.u7.f.o(arrayList));
    }

    private static boolean A(boolean bl, ax.d1.f object, long l8, int n8, androidx.media3.exoplayer.hls.e e8, long l9, long l10) {
        if (!bl) {
            return false;
        }
        if (e8 == null) {
            return false;
        }
        if (l8 < ((ax.d1.f)object).k) {
            return true;
        }
        if ((object = androidx.media3.exoplayer.hls.c.h((ax.d1.f)object, l8, n8)) == null) {
            return false;
        }
        return l9 + ((e)object).a.f0 < l10;
    }

    private void B(ax.d1.f f8) {
        long l8 = f8.o ? -9223372036854775807L : f8.e() - this.g.e();
        this.t = l8;
    }

    private void b() {
        int n8 = this.s.l();
        this.g.b(this.e[n8]);
    }

    private static Uri e(ax.d1.f f8, f.g object) {
        if (object != null && (object = ((f.g)object).h0) != null) {
            return O.d(f8.a, (String)object);
        }
        return null;
    }

    private Pair<Long, Integer> g(androidx.media3.exoplayer.hls.e list, boolean bl, ax.d1.f f8, long l8, long l9) {
        int n8 = -1;
        if (list != null && !bl) {
            if (((androidx.media3.exoplayer.hls.e)((Object)list)).q()) {
                l8 = ((androidx.media3.exoplayer.hls.e)((Object)list)).o == -1 ? ((ax.j1.d)((Object)list)).g() : ((ax.j1.d)((Object)list)).j;
                int n9 = ((androidx.media3.exoplayer.hls.e)((Object)list)).o;
                if (n9 != -1) {
                    n8 = n9 + 1;
                }
                return new Pair((Object)l8, (Object)n8);
            }
            return new Pair((Object)((ax.j1.d)((Object)list)).j, (Object)((androidx.media3.exoplayer.hls.e)((Object)list)).o);
        }
        long l10 = f8.u;
        long l11 = l9;
        if (list != null) {
            l11 = this.r ? l9 : ((ax.j1.b)((Object)list)).g;
        }
        if (!f8.o && l11 >= l10 + l8) {
            return new Pair((Object)(f8.k + (long)f8.r.size()), (Object)-1);
        }
        Object object = f8.r;
        bl = this.g.g();
        int n10 = 0;
        bl = !bl || list == null;
        int n11 = d0.f(object, l11 -= l8, true, bl);
        l9 = (long)n11 + f8.k;
        int n12 = n8;
        l8 = l9;
        if (n11 >= 0) {
            list = f8.r.get(n11);
            list = l11 < ((f.g)((Object)list)).f0 + ((f.g)((Object)list)).d0 ? ((f.f)((Object)list)).n0 : f8.s;
            while (true) {
                n12 = n8;
                l8 = l9;
                if (n10 >= list.size()) break;
                object = list.get(n10);
                if (l11 < ((f.g)object).f0 + ((f.g)object).d0) {
                    n12 = n8;
                    l8 = l9;
                    if (!((f.d)object).m0) break;
                    l8 = list == f8.s ? 1L : 0L;
                    l8 = l9 + l8;
                    n12 = n10;
                    break;
                }
                ++n10;
            }
        }
        return new Pair((Object)l8, (Object)n12);
    }

    private static e h(ax.d1.f f8, long l8, int n8) {
        int n9 = (int)(l8 - f8.k);
        if (n9 == f8.r.size()) {
            if (n8 == -1) {
                n8 = 0;
            }
            if (n8 < f8.s.size()) {
                return new e(f8.s.get(n8), l8, n8);
            }
            return null;
        }
        f.f f9 = f8.r.get(n9);
        if (n8 == -1) {
            return new e(f9, l8, -1);
        }
        if (n8 < f9.n0.size()) {
            return new e(f9.n0.get(n8), l8, n8);
        }
        n8 = n9 + 1;
        if (n8 < f8.r.size()) {
            return new e(f8.r.get(n8), l8 + 1L, -1);
        }
        if (!f8.s.isEmpty()) {
            return new e(f8.s.get(0), l8 + 1L, 0);
        }
        return null;
    }

    static List<f.g> k(ax.d1.f object, long l8, int n8) {
        int n9 = (int)(l8 - ((ax.d1.f)object).k);
        if (n9 >= 0 && ((ax.d1.f)object).r.size() >= n9) {
            ArrayList<Object> arrayList = new ArrayList<Object>();
            int n10 = ((ax.d1.f)object).r.size();
            int n11 = 0;
            int n12 = n8;
            if (n9 < n10) {
                List<f.d> list;
                n12 = n9;
                if (n8 != -1) {
                    list = ((ax.d1.f)object).r.get(n9);
                    if (n8 == 0) {
                        arrayList.add(list);
                    } else if (n8 < ((f.f)((Object)list)).n0.size()) {
                        list = ((f.f)((Object)list)).n0;
                        arrayList.addAll(list.subList(n8, list.size()));
                    }
                    n12 = n9 + 1;
                }
                list = ((ax.d1.f)object).r;
                arrayList.addAll(list.subList(n12, list.size()));
                n12 = 0;
            }
            if (((ax.d1.f)object).n != -9223372036854775807L) {
                if (n12 == -1) {
                    n12 = n11;
                }
                if (n12 < ((ax.d1.f)object).s.size()) {
                    object = ((ax.d1.f)object).s;
                    arrayList.addAll(object.subList(n12, object.size()));
                }
            }
            return java.util.DesugarCollections.unmodifiableList(arrayList);
        }
        return ax.r7.z.z();
    }

    private static boolean o(e e8, ax.d1.f f8) {
        f.g g8 = e8.a;
        if (g8 instanceof f.d) {
            return ((f.d)g8).m0 || e8.c == 0 && f8.c;
            {
            }
        }
        return f8.c;
    }

    private ax.j1.b p(Uri object, int n8, boolean bl, g.a object2) {
        if (object == null) {
            return null;
        }
        object2 = this.j.c((Uri)object);
        if (object2 != null) {
            this.j.b((Uri)object, (byte[])object2);
            return null;
        }
        object = new k.b().i((Uri)object).b(1).a();
        return new a(this.c, (k)object, this.f[n8], this.s.n(), this.s.q(), this.n);
    }

    private long w(long l8) {
        long l9 = this.t;
        if (l9 != -9223372036854775807L) {
            return l9 - l8;
        }
        return -9223372036854775807L;
    }

    public ax.j1.e[] a(androidx.media3.exoplayer.hls.e e8, long l8) {
        int n8 = e8 == null ? -1 : this.h.c(e8.d);
        int n9 = this.s.length();
        ax.j1.e[] eArray = new ax.j1.e[n9];
        for (int i8 = 0; i8 < n9; ++i8) {
            int n10 = this.s.j(i8);
            Object object = this.e[n10];
            if (!this.g.a((Uri)object)) {
                eArray[i8] = ax.j1.e.a;
                continue;
            }
            object = this.g.n((Uri)object, false);
            ax.S0.a.e(object);
            long l9 = object.h - this.g.e();
            boolean bl = n10 != n8;
            Pair<Long, Integer> pair = this.g(e8, bl, (ax.d1.f)object, l9, l8);
            long l10 = (Long)pair.first;
            n10 = (Integer)pair.second;
            eArray[i8] = new c(object.a, l9, androidx.media3.exoplayer.hls.c.k((ax.d1.f)object, l10, n10));
        }
        return eArray;
    }

    public long c(long l8, Z z8) {
        Object object;
        int n8 = this.s.d();
        object = n8 < ((Uri[])(object = this.e)).length && n8 != -1 ? this.g.n(object[this.s.l()], true) : null;
        long l9 = l8;
        if (object != null) {
            if (object.r.isEmpty()) {
                l9 = l8;
            } else {
                long l10 = object.h - this.g.e();
                long l11 = l8 - l10;
                n8 = d0.f(object.r, l11, true, true);
                l9 = object.r.get((int)n8).f0;
                l8 = object.c && n8 != object.r.size() - 1 ? object.r.get((int)(n8 + 1)).f0 : l9;
                l9 = z8.a(l11, l9, l8) + l10;
            }
        }
        return l9;
    }

    public int d(androidx.media3.exoplayer.hls.e e8) {
        if (e8.o == -1) {
            return 1;
        }
        Object object = this.e[this.h.c(e8.d)];
        ax.d1.f f8 = ax.S0.a.e(this.g.n((Uri)object, false));
        int n8 = (int)(e8.j - f8.k);
        if (n8 < 0) {
            return 1;
        }
        object = n8 < f8.r.size() ? f8.r.get((int)n8).n0 : f8.s;
        if (e8.o >= object.size()) {
            return 2;
        }
        object = (f.d)object.get(e8.o);
        if (((f.d)object).n0) {
            return 0;
        }
        if (j.Objects.equals((Object)Uri.parse((String)O.c(f8.a, ((f.g)object).q)), (Object)e8.b.a)) {
            return 1;
        }
        return 2;
    }

    public void f(p0 object, long l8, long l9, List<androidx.media3.exoplayer.hls.e> uri, boolean bl, b b8) {
        Uri uri2;
        Uri uri3;
        Object object2;
        boolean bl2;
        int n8;
        long l10;
        androidx.media3.exoplayer.hls.e e8;
        block16: {
            block15: {
                ax.j1.b b9;
                e8 = uri.isEmpty() ? null : F.e(uri);
                int n9 = e8 == null ? -1 : this.h.c(e8.d);
                long l11 = object.a;
                long l12 = l8 - l11;
                long l13 = this.w(l11);
                long l14 = l12;
                l10 = l13;
                if (e8 != null) {
                    l14 = l12;
                    l10 = l13;
                    if (!this.r) {
                        long l15 = e8.d();
                        l14 = l12 = Math.max(0L, l12 - l15);
                        l10 = l13;
                        if (l13 != -9223372036854775807L) {
                            l10 = Math.max(0L, l13 - l15);
                            l14 = l12;
                        }
                    }
                }
                object = this.a(e8, l8);
                this.s.c(l11, l14, l10, (List<? extends ax.j1.d>)uri, (ax.j1.e[])object);
                n8 = this.s.l();
                bl2 = n9 != n8;
                uri = this.e[n8];
                if (!this.g.a(uri)) {
                    b8.c = uri;
                    this.q = uri;
                    return;
                }
                object = this.g.n(uri, true);
                ax.S0.a.e(object);
                this.r = object.c;
                this.B((ax.d1.f)object);
                l10 = object.h - this.g.e();
                object2 = this.g(e8, bl2, (ax.d1.f)object, l10, l8);
                l14 = (Long)object2.first;
                int n10 = (Integer)object2.second;
                if (androidx.media3.exoplayer.hls.c.A(bl2, (ax.d1.f)object, l14, n10, e8, l10, l9)) {
                    uri = this.e[n9];
                    object = this.g.n(uri, true);
                    ax.S0.a.e(object);
                    l10 = object.h - this.g.e();
                    object2 = this.g(e8, false, (ax.d1.f)object, l10, l8);
                    l9 = (Long)object2.first;
                    n10 = (Integer)object2.second;
                    n8 = n9;
                    l14 = l9;
                } else {
                    l10 = l9 = l10;
                }
                if (n8 != n9 && n9 != -1) {
                    object2 = this.e[n9];
                    this.g.b((Uri)object2);
                }
                if (l14 < object.k) {
                    this.o = new ax.i1.b();
                    return;
                }
                object2 = androidx.media3.exoplayer.hls.c.h((ax.d1.f)object, l14, n10);
                if (object2 == null) {
                    if (!object.o) {
                        b8.c = uri;
                        this.q = uri;
                        return;
                    }
                    if (!bl && !object.r.isEmpty()) {
                        object2 = new e(F.e(object.r), object.k + (long)object.r.size() - 1L, -1);
                    } else {
                        b8.b = true;
                        return;
                    }
                }
                this.q = null;
                this.u = SystemClock.elapsedRealtime();
                uri3 = androidx.media3.exoplayer.hls.c.e((ax.d1.f)object, object2.a.c0);
                b8.a = b9 = this.p(uri3, n8, true, null);
                if (b9 != null) break block15;
                uri2 = androidx.media3.exoplayer.hls.c.e((ax.d1.f)object, object2.a);
                b8.a = b9 = this.p(uri2, n8, false, null);
                if (b9 == null && (!(bl = androidx.media3.exoplayer.hls.e.y(e8, l8, uri, bl2 = androidx.media3.exoplayer.hls.c.o(object2, (ax.d1.f)object), object2, l10)) || !object2.d)) break block16;
            }
            return;
        }
        b8.a = androidx.media3.exoplayer.hls.e.j(this.a, this.b, this.f[n8], l10, (ax.d1.f)object, object2, uri, this.i, this.s.n(), this.s.q(), this.m, this.d, this.l, e8, this.j.a(uri2), this.j.a(uri3), bl, bl2, this.k, null);
    }

    public int i(long l8, List<? extends ax.j1.d> list) {
        if (this.o == null && this.s.length() >= 2) {
            return this.s.k(l8, list);
        }
        return list.size();
    }

    public long j(androidx.media3.exoplayer.hls.e e8) {
        boolean bl = e8.o != -1;
        ax.S0.a.g(bl);
        Object object = this.e[this.h.c(e8.d)];
        object = ax.S0.a.e(this.g.n((Uri)object, false));
        int n8 = (int)(e8.j - object.k);
        if (n8 < 0) {
            return 0L;
        }
        object = n8 < object.r.size() ? object.r.get((int)n8).n0 : object.s;
        return ((f.d)object.get((int)e8.o)).d0;
    }

    public P l() {
        return this.h;
    }

    public D m() {
        return this.s;
    }

    public boolean n() {
        return this.r;
    }

    public boolean q(ax.j1.b b8, long l8) {
        D d8 = this.s;
        return d8.o(d8.t(this.h.c(b8.d)), l8);
    }

    public void r() throws IOException {
        IOException iOException = this.o;
        if (iOException == null) {
            iOException = this.p;
            if (iOException != null && iOException.equals(this.q)) {
                this.g.c(this.p);
            }
            return;
        }
        throw iOException;
    }

    public boolean s(Uri uri) {
        return d0.s(this.e, uri);
    }

    public void t(ax.j1.b b8) {
        if (b8 instanceof a) {
            b8 = (a)b8;
            this.n = ((ax.j1.c)b8).h();
            this.j.b(b8.b.a, ax.S0.a.e(((a)b8).j()));
        }
    }

    public boolean u(Uri uri, long l8) {
        int n8;
        block4: {
            Uri[] uriArray;
            for (n8 = 0; n8 < (uriArray = this.e).length; ++n8) {
                if (!uriArray[n8].equals((Object)uri)) {
                    continue;
                }
                break block4;
            }
            n8 = -1;
        }
        if (n8 == -1) {
            return true;
        }
        if ((n8 = this.s.t(n8)) == -1) {
            return true;
        }
        this.p = uri;
        return l8 != -9223372036854775807L && this.s.o(n8, l8) && this.g.i(uri, l8);
    }

    public void v() {
        this.b();
        this.o = null;
    }

    public void x(boolean bl) {
        this.m = bl;
    }

    public void y(D d8) {
        this.b();
        this.s = d8;
    }

    public boolean z(long l8, ax.j1.b b8, List<? extends ax.j1.d> list) {
        if (this.o != null) {
            return false;
        }
        return this.s.e(l8, b8, list);
    }

    private static final class a
    extends ax.j1.c {
        private byte[] l;

        public a(g g8, k k8, v v8, int n8, Object object, byte[] byArray) {
            super(g8, k8, 3, v8, n8, object, byArray);
        }

        @Override
        protected void g(byte[] byArray, int n8) {
            this.l = Arrays.copyOf(byArray, n8);
        }

        public byte[] j() {
            return this.l;
        }
    }

    public static final class b {
        public ax.j1.b a;
        public boolean b;
        public Uri c;

        public b() {
            this.a();
        }

        public void a() {
            this.a = null;
            this.b = false;
            this.c = null;
        }
    }

    static final class c
    extends ax.j1.a {
        private final List<f.g> e;
        private final long f;
        private final String g;

        public c(String string, long l8, List<f.g> list) {
            super(0L, list.size() - 1);
            this.g = string;
            this.f = l8;
            this.e = list;
        }

        @Override
        public long a() {
            this.c();
            return this.f + this.e.get((int)((int)this.d())).f0;
        }

        @Override
        public long b() {
            this.c();
            f.g g8 = this.e.get((int)this.d());
            return this.f + g8.f0 + g8.d0;
        }
    }

    private static final class d
    extends ax.l1.c {
        private int i;

        public d(P p8, int[] nArray) {
            super(p8, nArray);
            this.i = this.v(p8.b(nArray[0]));
        }

        @Override
        public void c(long l8, long l9, long l10, List<? extends ax.j1.d> list, ax.j1.e[] eArray) {
            l8 = SystemClock.elapsedRealtime();
            if (!this.a(this.i, l8)) {
                return;
            }
            for (int i8 = this.b - 1; i8 >= 0; --i8) {
                if (this.a(i8, l8)) continue;
                this.i = i8;
                return;
            }
            throw new IllegalStateException();
        }

        @Override
        public int d() {
            return this.i;
        }

        @Override
        public int n() {
            return 0;
        }

        @Override
        public Object q() {
            return null;
        }
    }

    static final class e {
        public final f.g a;
        public final long b;
        public final int c;
        public final boolean d;

        public e(f.g g8, long l8, int n8) {
            this.a = g8;
            this.b = l8;
            this.c = n8;
            boolean bl = g8 instanceof f.d && ((f.d)g8).n0;
            this.d = bl;
        }
    }
}

