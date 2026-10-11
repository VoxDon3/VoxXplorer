/*
 * Decompiled with CFR 0.152.
 */
package ax.K7;

import ax.J7.n;
import ax.K7.d;
import ax.K7.f;
import ax.K7.i;
import ax.K7.j;
import ax.K7.k;
import ax.K7.l;
import ax.L7.F;
import ax.O7.g;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

public class m {
    private final f a;
    private final n b;
    private String c;
    private final a d = new a(this, false);
    private final a e = new a(this, true);
    private final j f = new j(128);
    private final AtomicMarkableReference<String> g = new AtomicMarkableReference<Object>(null, false);

    public m(String string, g g8, n n8) {
        this.c = string;
        this.a = new f(g8);
        this.b = n8;
    }

    public static /* synthetic */ Object a(m m8, List list) {
        m8.a.r(m8.c, list);
        return null;
    }

    public static m i(String string, g object, n n8) {
        f f8 = new f((g)object);
        object = new m(string, (g)object, n8);
        ((m)object).d.a.getReference().e(f8.i(string, false));
        ((m)object).e.a.getReference().e(f8.i(string, true));
        ((m)object).g.set(f8.k(string), false);
        ((m)object).f.c(f8.j(string));
        return object;
    }

    public static String j(String string, g g8) {
        return new f(g8).k(string);
    }

    public Map<String, String> e() {
        return this.d.b();
    }

    public Map<String, String> f() {
        return this.e.b();
    }

    public List<F.e.d.e> g() {
        return this.f.a();
    }

    public String h() {
        return this.g.getReference();
    }

    public boolean k(String string, String string2) {
        return this.d.e(string, string2);
    }

    public boolean l(String string, String string2) {
        return this.e.e(string, string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void m(String string) {
        String string2 = this.c;
        synchronized (string2) {
            Throwable throwable2;
            block6: {
                List<i> list;
                Map<String, String> map;
                block5: {
                    try {
                        this.c = string;
                        map = this.d.b();
                        list = this.f.b();
                        if (this.h() == null) break block5;
                        this.a.s(string, this.h());
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                if (!map.isEmpty()) {
                    this.a.p(string, map);
                }
                if (!list.isEmpty()) {
                    this.a.r(string, list);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean n(List<i> object) {
        j j8 = this.f;
        synchronized (j8) {
            Throwable throwable2;
            block4: {
                try {
                    if (!this.f.c((List<i>)object)) {
                        return false;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                List<i> list = this.f.b();
                object = this.b;
                k k8 = new k(this, list);
                ((n)object).h(k8);
                return true;
            }
            throw throwable2;
        }
    }

    private class a {
        final AtomicMarkableReference<d> a;
        private final AtomicReference<Callable<Void>> b;
        private final boolean c;
        final m d;

        public a(m m8, boolean bl) {
            this.d = m8;
            this.b = new AtomicReference<Object>(null);
            this.c = bl;
            int n8 = bl ? 8192 : 1024;
            this.a = new AtomicMarkableReference<d>(new d(64, n8), false);
        }

        public static /* synthetic */ Void a(a a8) {
            a8.b.set(null);
            a8.d();
            return null;
        }

        private void c() {
            l l8 = new l(this);
            if (ax.f1.i.a(this.b, null, l8)) {
                this.d.b.h(l8);
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void d() {
            synchronized (this) {
                try {
                    if (!this.a.isMarked()) return;
                    Map<String, String> map = this.a.getReference().a();
                    AtomicMarkableReference<d> atomicMarkableReference = this.a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                    // MONITOREXIT @DISABLED, blocks:[0, 2] lbl7 : MonitorExitStatement: MONITOREXIT : this
                    if (map == null) return;
                    this.d.a.q(this.d.c, map, this.c);
                    return;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        public Map<String, String> b() {
            return this.a.getReference().a();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public boolean e(String object, String string) {
            synchronized (this) {
                try {
                    if (!this.a.getReference().d((String)object, string)) {
                        return false;
                    }
                    object = this.a;
                    ((AtomicMarkableReference)object).set((d)((AtomicMarkableReference)object).getReference(), true);
                    // MONITOREXIT @DISABLED, blocks:[0, 2] lbl8 : MonitorExitStatement: MONITOREXIT : this
                    this.c();
                    return true;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }
    }
}

