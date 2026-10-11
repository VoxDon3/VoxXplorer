/*
 * Decompiled with CFR 0.152.
 */
package ax.b1;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import ax.P0.D;
import ax.P0.o;
import ax.P0.v;
import ax.S0.a;
import ax.S0.d0;
import ax.S0.u;
import ax.Z0.I1;
import ax.b1.A;
import ax.b1.C;
import ax.b1.E;
import ax.b1.F;
import ax.b1.O;
import ax.b1.S;
import ax.b1.g;
import ax.b1.i;
import ax.b1.j;
import ax.b1.k;
import ax.b1.n;
import ax.b1.u;
import ax.b1.w;
import ax.m1.m;
import ax.r7.j0;
import ax.r7.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class h
implements w {
    private final UUID b;
    private final E.c c;
    private final S d;
    private final HashMap<String, String> e;
    private final boolean f;
    private final int[] g;
    private final boolean h;
    private final g i;
    private final m j;
    private final h k;
    private final long l;
    private final List<ax.b1.g> m;
    private final Set<f> n;
    private final Set<ax.b1.g> o;
    private int p;
    private E q;
    private ax.b1.g r;
    private ax.b1.g s;
    private Looper t;
    private Handler u;
    private int v;
    private byte[] w;
    private I1 x;
    volatile d y;

    private h(UUID uUID, E.c c8, S s8, HashMap<String, String> hashMap, boolean bl, int[] nArray, boolean bl2, m m8, long l8) {
        a.e(uUID);
        a.b(ax.P0.i.b.equals(uUID) ^ true, "Use C.CLEARKEY_UUID instead");
        this.b = uUID;
        this.c = c8;
        this.d = s8;
        this.e = hashMap;
        this.f = bl;
        this.g = nArray;
        this.h = bl2;
        this.j = m8;
        this.i = new g(this);
        this.k = new h(this);
        this.v = 0;
        this.m = new ArrayList<ax.b1.g>();
        this.n = ax.r7.d0.h();
        this.o = ax.r7.d0.h();
        this.l = l8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void A(Looper looper) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                try {
                    Looper looper2 = this.t;
                    if (looper2 == null) {
                        this.t = looper;
                        looper2 = new Handler(looper);
                        this.u = looper2;
                    } else {
                        boolean bl = looper2 == looper;
                        a.g(bl);
                        a.e(this.u);
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                return;
            }
            throw throwable2;
        }
    }

    private n B(int n8, boolean bl) {
        Object object = a.e(this.q);
        if (!(object.n() == 2 && F.d || d0.U0(this.g, n8) == -1 || object.n() == 1)) {
            object = this.r;
            if (object == null) {
                object = this.y(z.<o.b>z(), true, null, bl);
                this.m.add((ax.b1.g)object);
                this.r = object;
            } else {
                ((ax.b1.g)object).c(null);
            }
            return this.r;
        }
        return null;
    }

    private void C(Looper looper) {
        if (this.y == null) {
            this.y = new d(this, looper);
        }
    }

    private void D() {
        if (this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            a.e(this.q).d();
            this.q = null;
        }
    }

    private void E() {
        j0<ax.b1.g> j02 = ax.r7.C.t(this.o).n();
        while (j02.hasNext()) {
            ((n)j02.next()).a(null);
        }
    }

    private void F() {
        j0<f> j02 = ax.r7.C.t(this.n).n();
        while (j02.hasNext()) {
            ((f)j02.next()).d();
        }
    }

    private void H(n n8, u.a a8) {
        n8.a(a8);
        if (this.l != -9223372036854775807L) {
            n8.a(null);
        }
    }

    private void I(boolean bl) {
        if (bl && this.t == null) {
            ax.S0.u.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != a.e(this.t).getThread()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: ");
            stringBuilder.append(Thread.currentThread().getName());
            stringBuilder.append("\nExpected thread: ");
            stringBuilder.append(this.t.getThread().getName());
            ax.S0.u.i("DefaultDrmSessionMgr", stringBuilder.toString(), new IllegalStateException());
        }
    }

    static /* synthetic */ ax.b1.g g(h h8, ax.b1.g g8) {
        h8.s = g8;
        return g8;
    }

    static /* synthetic */ ax.b1.g t(h h8, ax.b1.g g8) {
        h8.r = g8;
        return g8;
    }

    private n u(Looper object, u.a a8, v object2, boolean bl) {
        this.C((Looper)object);
        object = ((v)object2).s;
        if (object == null) {
            return this.B(D.k(((v)object2).o), bl);
        }
        object2 = this.w;
        Object var5_5 = null;
        if (object2 == null) {
            object2 = object = ax.b1.h.z((o)a.e(object), this.b, false);
            if (object.isEmpty()) {
                object = new e(this.b);
                ax.S0.u.d("DefaultDrmSessionMgr", "DRM error", (Throwable)object);
                if (a8 != null) {
                    a8.l((Exception)object);
                }
                return new C(new n.a((Throwable)object, 6003));
            }
        } else {
            object2 = null;
        }
        if (!this.f) {
            object = this.s;
        } else {
            Iterator<ax.b1.g> iterator = this.m.iterator();
            do {
                object = var5_5;
                if (!iterator.hasNext()) break;
                object = iterator.next();
            } while (!j.Objects.equals(((ax.b1.g)object).a, (Object)object2));
        }
        if (object == null) {
            object = this.y((List<o.b>)object2, false, a8, bl);
            if (!this.f) {
                this.s = object;
            }
            this.m.add((ax.b1.g)object);
            return object;
        }
        ((ax.b1.g)object).c(a8);
        return object;
    }

    private static boolean v(n object) {
        if (object.getState() != 1) {
            return false;
        }
        return (object = a.e(object.g()).getCause()) instanceof ResourceBusyException || A.e((Throwable)object);
        {
        }
    }

    private boolean w(o object) {
        if (this.w != null) {
            return true;
        }
        if (ax.b1.h.z((o)object, this.b, true).isEmpty()) {
            if (((o)object).e0 == 1 && ((o)object).e(0).c(ax.P0.i.b)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
                stringBuilder.append(this.b);
                ax.S0.u.h("DefaultDrmSessionMgr", stringBuilder.toString());
            } else {
                return false;
            }
        }
        if ((object = ((o)object).d0) != null && !"cenc".equals(object)) {
            if ("cbcs".equals(object)) {
                return Build.VERSION.SDK_INT >= 25;
            }
            return !"cbc1".equals(object) && !"cens".equals(object);
            {
            }
        }
        return true;
    }

    private ax.b1.g x(List<o.b> object, boolean bl, u.a a8) {
        a.e(this.q);
        boolean bl2 = this.h;
        object = new ax.b1.g(this.b, this.q, this.i, this.k, (List<o.b>)object, this.v, bl2 | bl, bl, this.w, this.e, this.d, a.e(this.t), this.j, a.e(this.x));
        ((ax.b1.g)object).c(a8);
        if (this.l != -9223372036854775807L) {
            ((ax.b1.g)object).c(null);
        }
        return object;
    }

    private ax.b1.g y(List<o.b> list, boolean bl, u.a a8, boolean bl2) {
        ax.b1.g g8;
        ax.b1.g g9 = g8 = this.x(list, bl, a8);
        if (ax.b1.h.v(g8)) {
            g9 = g8;
            if (!this.o.isEmpty()) {
                this.E();
                this.H(g8, a8);
                g9 = this.x(list, bl, a8);
            }
        }
        if (ax.b1.h.v(g9) && bl2 && !this.n.isEmpty()) {
            this.F();
            if (!this.o.isEmpty()) {
                this.E();
            }
            this.H(g9, a8);
            return this.x(list, bl, a8);
        }
        return g9;
    }

    private static List<o.b> z(o o8, UUID uUID, boolean bl) {
        ArrayList<o.b> arrayList = new ArrayList<o.b>(o8.e0);
        for (int i8 = 0; i8 < o8.e0; ++i8) {
            o.b b8 = o8.e(i8);
            if (!b8.c(uUID) && (!ax.P0.i.c.equals(uUID) || !b8.c(ax.P0.i.b)) || b8.f0 == null && !bl) continue;
            arrayList.add(b8);
        }
        return arrayList;
    }

    public void G(int n8, byte[] byArray) {
        a.g(this.m.isEmpty());
        if (n8 == 1 || n8 == 3) {
            a.e(byArray);
        }
        this.v = n8;
        this.w = byArray;
    }

    @Override
    public int a(v v8) {
        block7: {
            int n8;
            block6: {
                o o8;
                block5: {
                    this.I(false);
                    n8 = a.e(this.q).n();
                    o8 = v8.s;
                    if (o8 != null) break block5;
                    int n9 = D.k(v8.o);
                    if (d0.U0(this.g, n9) == -1) {
                        return 0;
                    }
                    break block6;
                }
                if (!this.w(o8)) break block7;
            }
            return n8;
        }
        return 1;
    }

    @Override
    public n b(u.a a8, v v8) {
        boolean bl = false;
        this.I(false);
        if (this.p > 0) {
            bl = true;
        }
        a.g(bl);
        a.i(this.t);
        return this.u(this.t, a8, v8, true);
    }

    @Override
    public void c(Looper looper, I1 i12) {
        this.A(looper);
        this.x = i12;
    }

    @Override
    public final void d() {
        int n8;
        this.I(true);
        this.p = n8 = this.p - 1;
        if (n8 != 0) {
            return;
        }
        if (this.l != -9223372036854775807L) {
            ArrayList<ax.b1.g> arrayList = new ArrayList<ax.b1.g>(this.m);
            for (n8 = 0; n8 < arrayList.size(); ++n8) {
                ((ax.b1.g)arrayList.get(n8)).a(null);
            }
        }
        this.F();
        this.D();
    }

    @Override
    public w.b e(u.a object, v v8) {
        boolean bl = this.p > 0;
        a.g(bl);
        a.i(this.t);
        object = new f(this, (u.a)object);
        ((f)object).c(v8);
        return object;
    }

    @Override
    public final void k() {
        this.I(true);
        int n8 = this.p;
        this.p = n8 + 1;
        if (n8 == 0) {
            if (this.q == null) {
                E e8;
                this.q = e8 = this.c.a(this.b);
                e8.k(new c(this));
                return;
            }
            if (this.l != -9223372036854775807L) {
                for (n8 = 0; n8 < this.m.size(); ++n8) {
                    this.m.get(n8).c(null);
                }
            }
        }
    }

    public static final class b {
        private final HashMap<String, String> a = new HashMap();
        private UUID b = ax.P0.i.d;
        private E.c c = O.d;
        private boolean d;
        private int[] e = new int[0];
        private boolean f = true;
        private m g = new ax.m1.k();
        private long h = 300000L;

        public h a(S s8) {
            return new h(this.b, this.c, s8, this.a, this.d, this.e, this.f, this.g, this.h);
        }

        public b b(m m8) {
            this.g = ax.S0.a.e(m8);
            return this;
        }

        public b c(boolean bl) {
            this.d = bl;
            return this;
        }

        public b d(boolean bl) {
            this.f = bl;
            return this;
        }

        public b e(int ... nArray) {
            int n8 = nArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                boolean bl;
                int n9 = nArray[i8];
                boolean bl2 = bl = true;
                if (n9 != 2) {
                    bl2 = n9 == 1 ? bl : false;
                }
                ax.S0.a.a(bl2);
            }
            this.e = (int[])nArray.clone();
            return this;
        }

        public b f(UUID uUID, E.c c8) {
            this.b = ax.S0.a.e(uUID);
            this.c = ax.S0.a.e(c8);
            return this;
        }
    }

    private class c
    implements E.b {
        final h a;

        private c(h h8) {
            this.a = h8;
        }

        @Override
        public void a(E e8, byte[] byArray, int n8, int n9, byte[] byArray2) {
            ax.S0.a.e(this.a.y).obtainMessage(n8, byArray).sendToTarget();
        }
    }

    @SuppressLint(value={"HandlerLeak"})
    private class d
    extends Handler {
        final h a;

        public d(h h8, Looper looper) {
            this.a = h8;
            super(looper);
        }

        public void handleMessage(Message message) {
            byte[] byArray = (byte[])message.obj;
            if (byArray != null) {
                for (ax.b1.g g8 : this.a.m) {
                    if (!g8.t(byArray)) continue;
                    g8.z(message.what);
                    break;
                }
            }
        }
    }

    public static final class e
    extends Exception {
        private e(UUID uUID) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Media does not support uuid: ");
            stringBuilder.append(uUID);
            super(stringBuilder.toString());
        }
    }

    private class f
    implements w.b {
        private final u.a b;
        private n c;
        private boolean d;
        final h e;

        public f(h h8, u.a a8) {
            this.e = h8;
            this.b = a8;
        }

        public static /* synthetic */ void a(f f8, v v8) {
            if (f8.e.p != 0 && !f8.d) {
                h h8 = f8.e;
                f8.c = h8.u(a.e(h8.t), f8.b, v8, false);
                f8.e.n.add(f8);
            }
        }

        public static /* synthetic */ void b(f f8) {
            if (f8.d) {
                return;
            }
            n n8 = f8.c;
            if (n8 != null) {
                n8.a(f8.b);
            }
            f8.e.n.remove(f8);
            f8.d = true;
        }

        public void c(v v8) {
            a.e(this.e.u).post((Runnable)new j(this, v8));
        }

        @Override
        public void d() {
            d0.j1(a.e(this.e.u), new i(this));
        }
    }

    private class g
    implements g.a {
        private final Set<ax.b1.g> a;
        private ax.b1.g b;
        final h c;

        public g(h h8) {
            this.c = h8;
            this.a = new HashSet<ax.b1.g>();
        }

        @Override
        public void a(Exception exception, boolean bl) {
            this.b = null;
            Object object = z.u(this.a);
            this.a.clear();
            object = ((z)object).n();
            while (object.hasNext()) {
                ((ax.b1.g)object.next()).B(exception, bl);
            }
        }

        @Override
        public void b(ax.b1.g g8) {
            this.a.add(g8);
            if (this.b != null) {
                return;
            }
            this.b = g8;
            g8.F();
        }

        @Override
        public void c() {
            this.b = null;
            Object object = z.u(this.a);
            this.a.clear();
            object = ((z)object).n();
            while (object.hasNext()) {
                ((ax.b1.g)object.next()).A();
            }
        }

        public void d(ax.b1.g g8) {
            this.a.remove(g8);
            if (this.b == g8) {
                this.b = null;
                if (!this.a.isEmpty()) {
                    this.b = g8 = this.a.iterator().next();
                    g8.F();
                }
            }
        }
    }

    private class h
    implements g.b {
        final h a;

        private h(h h8) {
            this.a = h8;
        }

        public static /* synthetic */ void c(ax.b1.g g8) {
            g8.a(null);
        }

        @Override
        public void a(ax.b1.g g8, int n8) {
            if (this.a.l != -9223372036854775807L) {
                this.a.o.remove(g8);
                ax.S0.a.e(this.a.u).removeCallbacksAndMessages((Object)g8);
            }
        }

        @Override
        public void b(ax.b1.g g8, int n8) {
            if (n8 == 1 && this.a.p > 0 && this.a.l != -9223372036854775807L) {
                this.a.o.add(g8);
                ax.S0.a.e(this.a.u).postAtTime((Runnable)new k(g8), (Object)g8, SystemClock.uptimeMillis() + this.a.l);
            } else if (n8 == 0) {
                this.a.m.remove(g8);
                if (this.a.r == g8) {
                    ax.b1.h.t(this.a, null);
                }
                if (this.a.s == g8) {
                    ax.b1.h.g(this.a, null);
                }
                this.a.i.d(g8);
                if (this.a.l != -9223372036854775807L) {
                    ax.S0.a.e(this.a.u).removeCallbacksAndMessages((Object)g8);
                    this.a.o.remove(g8);
                }
            }
            this.a.D();
        }
    }
}

