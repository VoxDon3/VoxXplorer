package ax.c3;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class K {
    public static final K e = a(ax.Q2.f.o0, 0);
    public static final K f = a(ax.Q2.f.p0, 0);
    public static final K g = a(ax.Q2.f.s0, 0);
    public static final K h = a(ax.Q2.f.t0, 0);
    public static final K i = a(ax.Q2.f.q0, 0);
    public static final K j = a(ax.Q2.f.u0, 0);
    public static final K k = a(ax.Q2.f.b1, 0);
    private static String l = "#";
    private static ArrayList<K> m;
    private static ArrayList<K> n;
    private ax.Q2.f a;
    private int b;
    private String c;
    private String d;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ax.Q2.f.values().length];
            a = iArr;
            try {
                iArr[ax.Q2.f.o0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ax.Q2.f.p0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ax.Q2.f.t0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ax.Q2.f.q0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ax.Q2.f.u0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ax.Q2.f.b1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ax.Q2.f.r0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ax.Q2.f.s0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private K(ax.Q2.f fVar, int i2) {
        this.a = fVar;
        this.b = i2;
        this.c = fVar.r();
    }

    public static synchronized K a(ax.Q2.f fVar, int i2) {
        synchronized (K.class) {
            try {
                if (m == null) {
                    m = new ArrayList<>();
                }
                ArrayList<K> arrayList = m;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    K k2 = arrayList.get(i3);
                    i3++;
                    K k3 = k2;
                    if (k3.d() == fVar && k3.b() == i2) {
                        return k3;
                    }
                }
                K k4 = new K(fVar, i2);
                m.add(k4);
                return k4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static List<K> c() {
        if (n == null) {
            n = new ArrayList<>();
            Iterator<ax.Q2.f> it = ax.Q2.f.B().iterator();
            while (it.hasNext()) {
                n.add(a(it.next(), 0));
            }
        }
        return n;
    }

    public static boolean g(ax.Q2.f fVar) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    public static K h(String str) {
        if (str == null) {
            return null;
        }
        try {
            String[] split = str.split(l);
            ax.Q2.f D = ax.Q2.f.D(split[0]);
            if (D == null) {
                return null;
            }
            return a(D, Integer.parseInt(split[1]));
        } catch (Exception unused) {
            return null;
        }
    }

    public int b() {
        return this.b;
    }

    public ax.Q2.f d() {
        return this.a;
    }

    public String e() {
        if (this.c == null) {
            int i2 = a.a[this.a.ordinal()];
            if (i2 == 1) {
                this.c = ax.Z2.j.F().O();
            } else if (i2 == 2) {
                this.c = ax.Z2.j.F().T();
            } else if (i2 == 4) {
                this.c = ax.Q2.f.u();
            } else if (i2 == 7) {
                this.c = ax.Q2.f.q();
            } else if (i2 == 8) {
                String E = ax.Z2.j.F().E();
                this.c = E;
                if (E == null) {
                    this.c = "/storage/emulated/95";
                }
            }
        }
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof K)) {
            return false;
        }
        K k2 = (K) obj;
        return this.a == k2.a && this.b == k2.b;
    }

    public String f(Context context) {
        if (this.d == null) {
            if (ax.X2.Q.R1()) {
                ax.Q2.f fVar = this.a;
                if (fVar == ax.Q2.f.x0 || fVar == ax.Q2.f.d1 || fVar == ax.Q2.f.g1 || fVar == ax.Q2.f.c1 || fVar == ax.Q2.f.v0 || fVar == ax.Q2.f.w0 || fVar == ax.Q2.f.f1) {
                    String X = ax.Z2.j.F().X(this);
                    if (!TextUtils.isEmpty(X)) {
                        this.d = X;
                    }
                } else if (fVar == ax.Q2.f.h1) {
                    String K = ax.Z2.j.F().K(this);
                    if (!TextUtils.isEmpty(K)) {
                        this.d = K;
                    }
                }
            }
            if (this.d == null) {
                this.d = this.a.M(context);
            }
        }
        return this.d;
    }

    public int hashCode() {
        return this.a.hashCode() + this.b;
    }

    public void i(String str) {
        this.c = str;
    }

    public void j(String str) {
        this.d = str;
    }

    public String k() {
        return this.a.I() + l + b();
    }

    public String toString() {
        return k();
    }
}
