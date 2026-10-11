/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import android.net.Uri;
import ax.J1.f;
import ax.K1.h;
import ax.L1.d;
import ax.N1.t;
import ax.P0.q;
import ax.P0.v;
import ax.S0.M;
import ax.X1.C;
import ax.X1.K;
import ax.X1.e;
import ax.X1.j;
import ax.q1.l;
import ax.q1.m;
import ax.q1.r;
import ax.q1.x;
import ax.r1.b;
import ax.r7.z;
import ax.w1.c;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class n
implements x {
    private static final int[] s = new int[]{5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final a t = new a(new l());
    private static final a u = new a(new m());
    private boolean b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k = 1;
    private int l;
    private z<v> m;
    private int n = 112800;
    private boolean o = true;
    private t.a p = new ax.N1.h();
    private int q;
    private int r;

    public static /* synthetic */ Constructor f() {
        return ax.q1.n.k();
    }

    public static /* synthetic */ Constructor g() {
        return ax.q1.n.l();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void h(int n8, List<r> list) {
        int n9 = 2;
        int n10 = 0;
        switch (n8) {
            default: {
                return;
            }
            case 21: {
                list.add(new ax.t1.a());
                return;
            }
            case 20: {
                n8 = this.h;
                if ((n8 & 2) != 0 || (n8 & 4) != 0) return;
                list.add(new ax.x1.a());
                return;
            }
            case 19: {
                list.add(new ax.u1.a());
                return;
            }
            case 18: {
                list.add(new ax.Z1.a());
                return;
            }
            case 17: {
                list.add(new ax.M1.a());
                return;
            }
            case 16: {
                list.add(new ax.s1.b(1 ^ this.o, this.p));
                return;
            }
            case 15: {
                r r8 = u.a(new Object[0]);
                if (r8 == null) return;
                list.add(r8);
                return;
            }
            case 14: {
                list.add(new ax.y1.a(this.r));
                return;
            }
            case 12: {
                list.add(new ax.Y1.b());
                return;
            }
            case 11: {
                if (this.m == null) {
                    this.m = z.z();
                }
                list.add(new K(this.k, this.o ^ 1, this.p, new M(0L), new j(this.l, this.m), this.n));
                return;
            }
            case 10: {
                list.add(new C());
                return;
            }
            case 9: {
                list.add(new d());
                return;
            }
            case 8: {
                t.a a8 = this.p;
                int n11 = this.i;
                n9 = ax.K1.h.l(this.q);
                n8 = this.o ? 0 : 32;
                list.add(new h(a8, n11 | n9 | n8));
                a8 = this.p;
                n9 = this.h;
                n11 = ax.K1.n.t(this.q);
                n8 = this.o ? n10 : 16;
                list.add(new ax.K1.n(a8, n9 | n11 | n8));
                return;
            }
            case 7: {
                n8 = this.j;
                int n12 = this.b;
                if (!this.c) {
                    n9 = 0;
                }
                list.add(new f(n8 | n12 | n9));
                return;
            }
            case 6: {
                t.a a9 = this.p;
                n8 = this.g;
                if (this.o) {
                    n9 = 0;
                }
                list.add(new ax.I1.e(a9, n9 | n8));
                return;
            }
            case 5: {
                list.add(new c());
                return;
            }
            case 4: {
                r r9 = t.a(this.f);
                if (r9 != null) {
                    list.add(r9);
                    return;
                }
                list.add(new ax.v1.d(this.f));
                return;
            }
            case 3: {
                n8 = this.e;
                int n13 = this.b;
                if (!this.c) {
                    n9 = 0;
                }
                list.add(new b(n8 | n13 | n9));
                return;
            }
            case 2: {
                n8 = this.d;
                int n14 = this.b;
                if (!this.c) {
                    n9 = 0;
                }
                list.add(new ax.X1.h(n8 | n14 | n9));
                return;
            }
            case 1: {
                list.add(new e());
                return;
            }
            case 0: 
        }
        list.add(new ax.X1.b());
    }

    private static Constructor<? extends r> k() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(r.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    private static Constructor<? extends r> l() throws ClassNotFoundException, NoSuchMethodException {
        return ax.X0.e.class.asSubclass(r.class).getConstructor(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public r[] c() {
        synchronized (this) {
            Uri uri = Uri.EMPTY;
            r[] rArray = new HashMap();
            return this.e(uri, (Map<String, List<String>>)rArray);
        }
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public r[] e(Uri rArray, Map<String, List<String>> map) {
        synchronized (this) {
            try {
                int n8;
                int[] nArray = s;
                ArrayList<r> arrayList = new ArrayList<r>(nArray.length);
                int n9 = ax.P0.q.b(map);
                if (n9 != -1) {
                    this.h(n9, arrayList);
                }
                if ((n8 = ax.P0.q.c((Uri)rArray)) != -1 && n8 != n9) {
                    this.h(n8, arrayList);
                }
                int n10 = nArray.length;
                int n11 = 0;
                while (n11 < n10) {
                    int n12 = nArray[n11];
                    if (n12 != n9 && n12 != n8) {
                        this.h(n12, arrayList);
                    }
                    ++n11;
                }
                return arrayList.toArray(new r[0]);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public n i(int n8) {
        synchronized (this) {
            this.q = n8;
            return this;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Deprecated
    public n j(boolean bl) {
        synchronized (this) {
            this.o = bl;
            return this;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public n m(boolean bl) {
        synchronized (this) {
            this.c = bl;
            return this;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public n n(int n8) {
        synchronized (this) {
            this.r = n8;
            return this;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public n o(t.a a8) {
        synchronized (this) {
            this.p = a8;
            return this;
        }
    }

    private static final class ax.q1.n$a {
        private final a a;
        private final AtomicBoolean b;
        private Constructor<? extends r> c;

        public ax.q1.n$a(a a8) {
            this.a = a8;
            this.b = new AtomicBoolean(false);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private Constructor<? extends r> b() {
            AtomicBoolean atomicBoolean = this.b;
            synchronized (atomicBoolean) {
                Throwable throwable2;
                block7: {
                    try {
                        if (this.b.get()) {
                            return this.c;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    try {
                        return this.a.a();
                    }
                    catch (Exception exception) {
                        RuntimeException runtimeException = new RuntimeException("Error instantiating extension", exception);
                        throw runtimeException;
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        this.b.set(true);
                        return this.c;
                    }
                }
                throw throwable2;
            }
        }

        public r a(Object ... object) {
            Constructor<? extends r> constructor = this.b();
            if (constructor == null) {
                return null;
            }
            try {
                object = constructor.newInstance(object);
                return object;
            }
            catch (Exception exception) {
                throw new IllegalStateException("Unexpected error creating extractor", exception);
            }
        }

        public static interface a {
            public Constructor<? extends r> a() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException;
        }
    }
}

