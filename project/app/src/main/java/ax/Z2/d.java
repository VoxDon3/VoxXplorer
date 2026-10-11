/*
 * Decompiled with CFR 0.152.
 */
package ax.Z2;

import android.content.Context;
import ax.Q2.f;
import ax.X2.Q;
import ax.Z2.j;
import ax.c3.K;
import ax.t3.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class d {
    private Context a;
    private Map<K, a> b;
    private Map<f, b> c;
    private List<K> d;
    private boolean e;
    private boolean f;
    private boolean g;

    public d(Context context) {
        this.a = context;
        this.u();
    }

    private void a(List<K> list) {
        List<K> list2 = j.F().z();
        if (list2 != null) {
            list.addAll(list2);
            this.c(list2);
        }
    }

    private void b(f object, int n8) {
        if (this.b.get(object = K.a((f)((Object)object), n8)) == null) {
            this.d(((K)object).d(), ((K)object).b(), 1);
            this.d = new ArrayList<K>(this.b.keySet());
        }
    }

    private void c(List<K> object) {
        object = object.iterator();
        boolean bl = false;
        while (object.hasNext()) {
            K k8 = (K)object.next();
            if (this.b.get(k8) != null) continue;
            this.d(k8.d(), k8.b(), 1);
            bl = true;
        }
        if (bl) {
            this.d = new ArrayList<K>(this.b.keySet());
        }
    }

    private void d(f f8, int n8, int n9) {
        this.b.put(K.a(f8, n8), new a(n9));
    }

    private void e(List<K> list, f f8, int n8) {
        list.add(K.a(f8, n8));
    }

    private boolean f(List<K> list) {
        if (!Q.S1()) {
            return false;
        }
        List<K> list2 = j.F().A();
        if (list2 != null) {
            list.addAll(list2);
            this.c(list2);
            return true;
        }
        return false;
    }

    private void g(List<K> list) {
        List<K> list2 = j.F().B();
        if (list2 != null) {
            list.addAll(list2);
            this.c(list2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void h() {
        synchronized (this) {
            Iterator<K> iterator;
            try {
                iterator = this.b.keySet().iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (iterator.hasNext()) {
                a a8;
                K k8 = iterator.next();
                if (ax.Q2.f.a0(k8.d())) {
                    a8 = this.b.get(k8);
                    if (ax.Q2.f.r0(k8, false)) {
                        a8.f = 1;
                        continue;
                    }
                    a8.f = 0;
                    continue;
                }
                if (k8.d() == ax.Q2.f.r0) {
                    a8 = this.b.get(k8);
                    if (this.e) {
                        a8.f = 1;
                        continue;
                    }
                    a8.f = 0;
                    continue;
                }
                if (k8.d() != ax.Q2.f.t0) continue;
                a8 = this.b.get(k8);
                if (this.f) {
                    a8.f = 1;
                    continue;
                }
                a8.f = 0;
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    public List<K> i() {
        var2_1 = new ArrayList<K>();
        this.e(var2_1, ax.Q2.f.o0, 0);
        if (j.F().t0()) {
            this.e(var2_1, ax.Q2.f.p0, 0);
lbl5:
            // 2 sources

            while (true) {
                var1_2 = false;
                break;
            }
        } else if (j.F().r0()) {
            while (true) {
                var1_2 = true;
                break;
            }
        } else {
            if (!j.F().v0()) ** continue;
            this.e(var2_1, ax.Q2.f.p0, 0);
            ** continue;
        }
        if (this.f(var2_1)) {
            if (!j.F().t0()) {
                if (Q.B1()) {
                    var2_1.remove(K.f);
                } else {
                    ax.u3.b.g("MULTI SDCARD USED WHEN SECONDARY STORAGE NOT AVAILABLE");
                }
            }
            var1_2 = false;
        }
        if (ax.t3.j.w(this.a) && j.F().h0()) {
            this.e(var2_1, ax.Q2.f.s0, 0);
            this.g = true;
        } else {
            this.g = false;
        }
        if (ax.t3.j.B(this.a)) {
            this.e(var2_1, ax.Q2.f.t0, 0);
            this.f = true;
        } else {
            this.f = false;
        }
        this.g(var2_1);
        this.a(var2_1);
        this.e(var2_1, ax.Q2.f.q0, 0);
        if (var1_2 && !this.f && !this.g) {
            this.e(var2_1, ax.Q2.f.i1, 0);
        }
        this.e(var2_1, ax.Q2.f.z0, 0);
        this.e(var2_1, ax.Q2.f.A0, 0);
        this.e(var2_1, ax.Q2.f.B0, 0);
        this.e(var2_1, ax.Q2.f.C0, 0);
        this.e(var2_1, ax.Q2.f.V0, 0);
        this.e(var2_1, ax.Q2.f.F0, 0);
        this.e(var2_1, ax.Q2.f.M0, 0);
        this.e(var2_1, ax.Q2.f.G0, 0);
        this.e(var2_1, ax.Q2.f.W0, 0);
        this.e(var2_1, ax.Q2.f.p1, 0);
        if (k.u()) {
            this.e(var2_1, ax.Q2.f.a1, 0);
        }
        return var2_1;
    }

    public int j(K k8) {
        return this.d.indexOf(k8);
    }

    public List<K> k() {
        ArrayList<K> arrayList = new ArrayList<K>();
        this.e(arrayList, ax.Q2.f.z0, 0);
        this.e(arrayList, ax.Q2.f.A0, 0);
        this.e(arrayList, ax.Q2.f.B0, 0);
        this.e(arrayList, ax.Q2.f.C0, 0);
        this.e(arrayList, ax.Q2.f.F0, 0);
        return arrayList;
    }

    public long l(f object, f f8) {
        if ((object = this.c.get(object)) != null) {
            if (f8 == ax.Q2.f.o0) {
                return ((b)object).a;
            }
            if (f8 == ax.Q2.f.p0) {
                return ((b)object).b;
            }
            ax.u3.b.g("INVALID LIBRARY BASE LOCATION");
            return -1L;
        }
        return 0L;
    }

    public int m() {
        return this.d.size();
    }

    public List<K> n() {
        ArrayList<K> arrayList = new ArrayList<K>();
        this.e(arrayList, ax.Q2.f.o0, 0);
        if (j.F().t0()) {
            this.e(arrayList, ax.Q2.f.p0, 0);
        } else if (!j.F().r0() && j.F().v0()) {
            this.e(arrayList, ax.Q2.f.p0, 0);
        }
        this.f(arrayList);
        this.g(arrayList);
        this.a(arrayList);
        if (ax.t3.j.B(this.a)) {
            this.e(arrayList, ax.Q2.f.t0, 0);
            this.f = true;
        } else {
            this.f = false;
        }
        if (ax.t3.j.w(this.a) && j.F().h0()) {
            this.e(arrayList, ax.Q2.f.s0, 0);
        }
        this.e(arrayList, ax.Q2.f.q0, 0);
        this.e(arrayList, ax.Q2.f.V0, 0);
        this.e(arrayList, ax.Q2.f.p1, 0);
        if (k.u()) {
            this.e(arrayList, ax.Q2.f.a1, 0);
        }
        return arrayList;
    }

    public K o(int n8) {
        return this.d.get(n8);
    }

    public List<K> p() {
        ArrayList<K> arrayList = new ArrayList<K>();
        this.e(arrayList, ax.Q2.f.M0, 0);
        this.e(arrayList, ax.Q2.f.G0, 0);
        this.e(arrayList, ax.Q2.f.W0, 0);
        return arrayList;
    }

    public long q(K object) {
        if ((object = this.b.get(object)) != null && (object = ((a)object).e) != null) {
            return (Long)object;
        }
        return 0L;
    }

    public float r(K object) {
        if ((object = this.b.get(object)) != null && (object = ((a)object).b) != null) {
            return ((Float)object).floatValue();
        }
        return 0.0f;
    }

    public boolean s(f f8) {
        return this.c.get((Object)f8) != null;
    }

    public boolean t(K object) {
        return (object = this.b.get(object)) != null && ((a)object).b != null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void u() {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                ArrayList<K> arrayList;
                block6: {
                    try {
                        arrayList = new ArrayList<K>();
                        this.b = arrayList;
                        arrayList = new ArrayList<K>();
                        this.c = arrayList;
                        this.d(ax.Q2.f.o0, 0, 1);
                        this.d(ax.Q2.f.p0, 0, 1);
                        this.d(ax.Q2.f.s0, 0, 0);
                        this.d(ax.Q2.f.q0, 0, 1);
                        this.d(ax.Q2.f.t0, 0, 0);
                        this.d(ax.Q2.f.z0, 0, 0);
                        this.d(ax.Q2.f.A0, 0, 0);
                        this.d(ax.Q2.f.B0, 0, 0);
                        this.d(ax.Q2.f.C0, 0, 0);
                        this.d(ax.Q2.f.V0, 0, 1);
                        this.d(ax.Q2.f.F0, 0, 0);
                        this.b(ax.Q2.f.i1, 0);
                        this.d(ax.Q2.f.M0, 0, 1);
                        this.d(ax.Q2.f.G0, 0, 1);
                        this.d(ax.Q2.f.W0, 0, 0);
                        if (!k.u()) break block6;
                        this.d(ax.Q2.f.a1, 0, 0);
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                if ((arrayList = j.F().A()) != null) {
                    this.c((List<K>)arrayList);
                }
                if ((arrayList = j.F().B()) != null) {
                    this.c(arrayList);
                }
                if ((arrayList = j.F().z()) != null) {
                    this.c(arrayList);
                }
                this.d(ax.Q2.f.p1, 0, 1);
                arrayList = new ArrayList<K>(this.b.keySet());
                this.d = arrayList;
                return;
            }
            throw throwable2;
        }
    }

    public String v(K object, boolean bl) {
        a a8 = this.b.get(object);
        Object object2 = object = "";
        if (a8 != null) {
            if (bl) {
                object2 = a8.d;
                if (object2 != null) {
                    object = object2;
                }
            } else {
                object2 = a8.c;
                if (object2 != null) {
                    object = object2;
                }
            }
            Integer n8 = a8.a;
            object2 = object;
            if (n8 != null) {
                object2 = object;
                if (n8 > 0) {
                    return String.format("%s (%d)", object, a8.a);
                }
            }
        }
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void w(K k8) {
        synchronized (this) {
            this.d(k8.d(), k8.b(), 1);
            this.h();
            return;
        }
    }

    public void x(K object, int n8, long l8, float f8, String string, String string2) {
        if ((object = this.b.get(object)) != null) {
            ((a)object).a = n8;
            ((a)object).e = l8;
            ((a)object).c = string;
            ((a)object).d = string2;
            ((a)object).b = Float.valueOf(f8);
        }
    }

    public void y(f f8, long l8, long l9) {
        this.c.put(f8, new b(l8, l9));
    }

    public boolean z(int n8) {
        return this.b.get((Object)this.o((int)n8)).f == 1;
    }

    public static class a {
        Integer a;
        Float b;
        String c;
        String d;
        Long e;
        int f;

        a(int n8) {
            this.f = n8;
        }
    }

    public static class b {
        long a;
        long b;

        b(long l8, long l9) {
            this.a = l8;
            this.b = l9;
        }
    }
}

