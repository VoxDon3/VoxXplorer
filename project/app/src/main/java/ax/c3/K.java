/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.content.Context;
import android.text.TextUtils;
import ax.Q2.f;
import ax.X2.Q;
import ax.Z2.j;
import java.util.ArrayList;
import java.util.List;

public class K {
    public static final K e = K.a(ax.Q2.f.o0, 0);
    public static final K f = K.a(ax.Q2.f.p0, 0);
    public static final K g = K.a(ax.Q2.f.s0, 0);
    public static final K h = K.a(ax.Q2.f.t0, 0);
    public static final K i = K.a(ax.Q2.f.q0, 0);
    public static final K j = K.a(ax.Q2.f.u0, 0);
    public static final K k = K.a(ax.Q2.f.b1, 0);
    private static String l = "#";
    private static ArrayList<K> m;
    private static ArrayList<K> n;
    private f a;
    private int b;
    private String c;
    private String d;

    private K(f f8, int n8) {
        this.a = f8;
        this.b = n8;
        this.c = f8.r();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static K a(f f8, int n8) {
        synchronized (K.class) {
            Throwable throwable2;
            block7: {
                Object object;
                block6: {
                    try {
                        if (m != null) break block6;
                        object = new ArrayList();
                        m = object;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                object = m;
                int n9 = ((ArrayList)object).size();
                int n10 = 0;
                while (n10 < n9) {
                    int n11;
                    K k8 = ((ArrayList)object).get(n10);
                    n10 = n11 = n10 + 1;
                    if (k8.d() != f8) continue;
                    int n12 = k8.b();
                    n10 = n11;
                    if (n12 != n8) continue;
                    return k8;
                }
                {
                    object = new K(f8, n8);
                    m.add((K)object);
                }
                return object;
            }
            throw throwable2;
        }
    }

    public static List<K> c() {
        if (n == null) {
            n = new ArrayList();
            for (f f8 : ax.Q2.f.B()) {
                n.add(K.a(f8, 0));
            }
        }
        return n;
    }

    public static boolean g(f f8) {
        switch (ax.c3.K$a.a[f8.ordinal()]) {
            default: {
                return false;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
        }
        return true;
    }

    public static K h(String object) {
        String[] stringArray;
        block4: {
            if (object == null) {
                return null;
            }
            try {
                stringArray = object.split(l);
                object = ax.Q2.f.D(stringArray[0]);
                if (object != null) break block4;
                return null;
            }
            catch (Exception exception) {
                return null;
            }
        }
        object = K.a((f)((Object)object), Integer.parseInt(stringArray[1]));
        return object;
    }

    public int b() {
        return this.b;
    }

    public f d() {
        return this.a;
    }

    public String e() {
        if (this.c == null) {
            int n8 = ax.c3.K$a.a[this.a.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 4) {
                        if (n8 != 7) {
                            if (n8 == 8) {
                                String string;
                                this.c = string = ax.Z2.j.F().E();
                                if (string == null) {
                                    this.c = "/storage/emulated/95";
                                }
                            }
                        } else {
                            this.c = ax.Q2.f.q();
                        }
                    } else {
                        this.c = ax.Q2.f.u();
                    }
                } else {
                    this.c = ax.Z2.j.F().T();
                }
            } else {
                this.c = ax.Z2.j.F().O();
            }
        }
        return this.c;
    }

    public boolean equals(Object object) {
        if (!(object instanceof K)) {
            return false;
        }
        f f8 = this.a;
        object = (K)object;
        return f8 == ((K)object).a && this.b == ((K)object).b;
    }

    public String f(Context context) {
        if (this.d == null) {
            if (Q.R1()) {
                Object object = this.a;
                if (object != ax.Q2.f.x0 && object != ax.Q2.f.d1 && object != ax.Q2.f.g1 && object != ax.Q2.f.c1 && object != ax.Q2.f.v0 && object != ax.Q2.f.w0 && object != ax.Q2.f.f1) {
                    if (object == ax.Q2.f.h1 && !TextUtils.isEmpty((CharSequence)(object = ax.Z2.j.F().K(this)))) {
                        this.d = object;
                    }
                } else {
                    object = ax.Z2.j.F().X(this);
                    if (!TextUtils.isEmpty((CharSequence)object)) {
                        this.d = object;
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
        return ((Object)((Object)this.a)).hashCode() + this.b;
    }

    public void i(String string) {
        this.c = string;
    }

    public void j(String string) {
        this.d = string;
    }

    public String k() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a.I());
        stringBuilder.append(l);
        stringBuilder.append(this.b());
        return stringBuilder.toString();
    }

    public String toString() {
        return this.k();
    }
}

