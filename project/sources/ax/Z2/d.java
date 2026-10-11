package ax.Z2;

import android.content.Context;
import ax.X2.Q;
import ax.c3.K;
import ax.u3.C3184b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class d {
    private Context a;
    private Map<K, a> b;
    private Map<ax.Q2.f, b> c;
    private List<K> d;
    private boolean e;
    private boolean f;
    private boolean g;

    public static class a {
        Integer a;
        Float b;
        String c;
        String d;
        Long e;
        int f;

        a(int i) {
            this.f = i;
        }
    }

    public static class b {
        long a;
        long b;

        b(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    public d(Context context) {
        this.a = context;
        u();
    }

    private void a(List<K> list) {
        List<K> z = j.F().z();
        if (z != null) {
            list.addAll(z);
            c(z);
        }
    }

    private void b(ax.Q2.f fVar, int i) {
        K a2 = K.a(fVar, i);
        if (this.b.get(a2) == null) {
            d(a2.d(), a2.b(), 1);
            this.d = new ArrayList(this.b.keySet());
        }
    }

    private void c(List<K> list) {
        boolean z = false;
        for (K k : list) {
            if (this.b.get(k) == null) {
                d(k.d(), k.b(), 1);
                z = true;
            }
        }
        if (z) {
            this.d = new ArrayList(this.b.keySet());
        }
    }

    private void d(ax.Q2.f fVar, int i, int i2) {
        this.b.put(K.a(fVar, i), new a(i2));
    }

    private void e(List<K> list, ax.Q2.f fVar, int i) {
        list.add(K.a(fVar, i));
    }

    private boolean f(List<K> list) {
        List<K> A;
        if (!Q.S1() || (A = j.F().A()) == null) {
            return false;
        }
        list.addAll(A);
        c(A);
        return true;
    }

    private void g(List<K> list) {
        List<K> B = j.F().B();
        if (B != null) {
            list.addAll(B);
            c(B);
        }
    }

    public synchronized void h() {
        try {
            for (K k : this.b.keySet()) {
                if (ax.Q2.f.a0(k.d())) {
                    a aVar = this.b.get(k);
                    if (ax.Q2.f.r0(k, false)) {
                        aVar.f = 1;
                    } else {
                        aVar.f = 0;
                    }
                } else if (k.d() == ax.Q2.f.r0) {
                    a aVar2 = this.b.get(k);
                    if (this.e) {
                        aVar2.f = 1;
                    } else {
                        aVar2.f = 0;
                    }
                } else if (k.d() == ax.Q2.f.t0) {
                    a aVar3 = this.b.get(k);
                    if (this.f) {
                        aVar3.f = 1;
                    } else {
                        aVar3.f = 0;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<ax.c3.K> i() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ax.Q2.f r1 = ax.Q2.f.o0
            r2 = 0
            r5.e(r0, r1, r2)
            ax.Z2.j r1 = ax.Z2.j.F()
            boolean r1 = r1.t0()
            r3 = 1
            if (r1 == 0) goto L1d
            ax.Q2.f r1 = ax.Q2.f.p0
            r5.e(r0, r1, r2)
        L1b:
            r1 = 0
            goto L39
        L1d:
            ax.Z2.j r1 = ax.Z2.j.F()
            boolean r1 = r1.r0()
            if (r1 == 0) goto L29
        L27:
            r1 = 1
            goto L39
        L29:
            ax.Z2.j r1 = ax.Z2.j.F()
            boolean r1 = r1.v0()
            if (r1 == 0) goto L27
            ax.Q2.f r1 = ax.Q2.f.p0
            r5.e(r0, r1, r2)
            goto L1b
        L39:
            boolean r4 = r5.f(r0)
            if (r4 == 0) goto L5b
            ax.Z2.j r1 = ax.Z2.j.F()
            boolean r1 = r1.t0()
            if (r1 != 0) goto L5a
            boolean r1 = ax.X2.Q.B1()
            if (r1 == 0) goto L55
            ax.c3.K r1 = ax.c3.K.f
            r0.remove(r1)
            goto L5a
        L55:
            java.lang.String r1 = "MULTI SDCARD USED WHEN SECONDARY STORAGE NOT AVAILABLE"
            ax.u3.C3184b.g(r1)
        L5a:
            r1 = 0
        L5b:
            android.content.Context r4 = r5.a
            boolean r4 = ax.t3.j.w(r4)
            if (r4 == 0) goto L75
            ax.Z2.j r4 = ax.Z2.j.F()
            boolean r4 = r4.h0()
            if (r4 == 0) goto L75
            ax.Q2.f r4 = ax.Q2.f.s0
            r5.e(r0, r4, r2)
            r5.g = r3
            goto L77
        L75:
            r5.g = r2
        L77:
            android.content.Context r4 = r5.a
            boolean r4 = ax.t3.j.B(r4)
            if (r4 == 0) goto L87
            ax.Q2.f r4 = ax.Q2.f.t0
            r5.e(r0, r4, r2)
            r5.f = r3
            goto L89
        L87:
            r5.f = r2
        L89:
            r5.g(r0)
            r5.a(r0)
            ax.Q2.f r3 = ax.Q2.f.q0
            r5.e(r0, r3, r2)
            if (r1 == 0) goto La3
            boolean r1 = r5.f
            if (r1 != 0) goto La3
            boolean r1 = r5.g
            if (r1 != 0) goto La3
            ax.Q2.f r1 = ax.Q2.f.i1
            r5.e(r0, r1, r2)
        La3:
            ax.Q2.f r1 = ax.Q2.f.z0
            r5.e(r0, r1, r2)
            ax.Q2.f r1 = ax.Q2.f.A0
            r5.e(r0, r1, r2)
            ax.Q2.f r1 = ax.Q2.f.B0
            r5.e(r0, r1, r2)
            ax.Q2.f r1 = ax.Q2.f.C0
            r5.e(r0, r1, r2)
            ax.Q2.f r1 = ax.Q2.f.V0
            r5.e(r0, r1, r2)
            ax.Q2.f r1 = ax.Q2.f.F0
            r5.e(r0, r1, r2)
            ax.Q2.f r1 = ax.Q2.f.M0
            r5.e(r0, r1, r2)
            ax.Q2.f r1 = ax.Q2.f.G0
            r5.e(r0, r1, r2)
            ax.Q2.f r1 = ax.Q2.f.W0
            r5.e(r0, r1, r2)
            ax.Q2.f r1 = ax.Q2.f.p1
            r5.e(r0, r1, r2)
            boolean r1 = ax.t3.k.u()
            if (r1 == 0) goto Le0
            ax.Q2.f r1 = ax.Q2.f.a1
            r5.e(r0, r1, r2)
        Le0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Z2.d.i():java.util.List");
    }

    public int j(K k) {
        return this.d.indexOf(k);
    }

    public List<K> k() {
        ArrayList arrayList = new ArrayList();
        e(arrayList, ax.Q2.f.z0, 0);
        e(arrayList, ax.Q2.f.A0, 0);
        e(arrayList, ax.Q2.f.B0, 0);
        e(arrayList, ax.Q2.f.C0, 0);
        e(arrayList, ax.Q2.f.F0, 0);
        return arrayList;
    }

    public long l(ax.Q2.f fVar, ax.Q2.f fVar2) {
        b bVar = this.c.get(fVar);
        if (bVar == null) {
            return 0L;
        }
        if (fVar2 == ax.Q2.f.o0) {
            return bVar.a;
        }
        if (fVar2 == ax.Q2.f.p0) {
            return bVar.b;
        }
        C3184b.g("INVALID LIBRARY BASE LOCATION");
        return -1L;
    }

    public int m() {
        return this.d.size();
    }

    public List<K> n() {
        ArrayList arrayList = new ArrayList();
        e(arrayList, ax.Q2.f.o0, 0);
        if (j.F().t0()) {
            e(arrayList, ax.Q2.f.p0, 0);
        } else if (!j.F().r0() && j.F().v0()) {
            e(arrayList, ax.Q2.f.p0, 0);
        }
        f(arrayList);
        g(arrayList);
        a(arrayList);
        if (ax.t3.j.B(this.a)) {
            e(arrayList, ax.Q2.f.t0, 0);
            this.f = true;
        } else {
            this.f = false;
        }
        if (ax.t3.j.w(this.a) && j.F().h0()) {
            e(arrayList, ax.Q2.f.s0, 0);
        }
        e(arrayList, ax.Q2.f.q0, 0);
        e(arrayList, ax.Q2.f.V0, 0);
        e(arrayList, ax.Q2.f.p1, 0);
        if (ax.t3.k.u()) {
            e(arrayList, ax.Q2.f.a1, 0);
        }
        return arrayList;
    }

    public K o(int i) {
        return this.d.get(i);
    }

    public List<K> p() {
        ArrayList arrayList = new ArrayList();
        e(arrayList, ax.Q2.f.M0, 0);
        e(arrayList, ax.Q2.f.G0, 0);
        e(arrayList, ax.Q2.f.W0, 0);
        return arrayList;
    }

    public long q(K k) {
        Long l;
        a aVar = this.b.get(k);
        if (aVar == null || (l = aVar.e) == null) {
            return 0L;
        }
        return l.longValue();
    }

    public float r(K k) {
        Float f;
        a aVar = this.b.get(k);
        if (aVar == null || (f = aVar.b) == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    public boolean s(ax.Q2.f fVar) {
        return this.c.get(fVar) != null;
    }

    public boolean t(K k) {
        a aVar = this.b.get(k);
        return (aVar == null || aVar.b == null) ? false : true;
    }

    public synchronized void u() {
        try {
            this.b = new HashMap();
            this.c = new HashMap();
            d(ax.Q2.f.o0, 0, 1);
            d(ax.Q2.f.p0, 0, 1);
            d(ax.Q2.f.s0, 0, 0);
            d(ax.Q2.f.q0, 0, 1);
            d(ax.Q2.f.t0, 0, 0);
            d(ax.Q2.f.z0, 0, 0);
            d(ax.Q2.f.A0, 0, 0);
            d(ax.Q2.f.B0, 0, 0);
            d(ax.Q2.f.C0, 0, 0);
            d(ax.Q2.f.V0, 0, 1);
            d(ax.Q2.f.F0, 0, 0);
            b(ax.Q2.f.i1, 0);
            d(ax.Q2.f.M0, 0, 1);
            d(ax.Q2.f.G0, 0, 1);
            d(ax.Q2.f.W0, 0, 0);
            if (ax.t3.k.u()) {
                d(ax.Q2.f.a1, 0, 0);
            }
            List<K> A = j.F().A();
            if (A != null) {
                c(A);
            }
            List<K> B = j.F().B();
            if (B != null) {
                c(B);
            }
            List<K> z = j.F().z();
            if (z != null) {
                c(z);
            }
            d(ax.Q2.f.p1, 0, 1);
            this.d = new ArrayList(this.b.keySet());
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        r0 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String v(ax.c3.K r3, boolean r4) {
        /*
            r2 = this;
            java.util.Map<ax.c3.K, ax.Z2.d$a> r0 = r2.b
            java.lang.Object r3 = r0.get(r3)
            ax.Z2.d$a r3 = (ax.Z2.d.a) r3
            java.lang.String r0 = ""
            if (r3 == 0) goto L35
            if (r4 == 0) goto L14
            java.lang.String r4 = r3.d
            if (r4 == 0) goto L19
        L12:
            r0 = r4
            goto L19
        L14:
            java.lang.String r4 = r3.c
            if (r4 == 0) goto L19
            goto L12
        L19:
            java.lang.Integer r4 = r3.a
            if (r4 == 0) goto L35
            int r4 = r4.intValue()
            if (r4 <= 0) goto L35
            java.lang.Integer r3 = r3.a
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r1 = 0
            r4[r1] = r0
            r0 = 1
            r4[r0] = r3
            java.lang.String r3 = "%s (%d)"
            java.lang.String r3 = java.lang.String.format(r3, r4)
            return r3
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Z2.d.v(ax.c3.K, boolean):java.lang.String");
    }

    public synchronized void w(K k) {
        d(k.d(), k.b(), 1);
        h();
    }

    public void x(K k, int i, long j, float f, String str, String str2) {
        a aVar = this.b.get(k);
        if (aVar != null) {
            aVar.a = Integer.valueOf(i);
            aVar.e = Long.valueOf(j);
            aVar.c = str;
            aVar.d = str2;
            aVar.b = Float.valueOf(f);
        }
    }

    public void y(ax.Q2.f fVar, long j, long j2) {
        this.c.put(fVar, new b(j, j2));
    }

    public boolean z(int i) {
        return this.b.get(o(i)).f == 1;
    }
}
