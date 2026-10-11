package com.google.android.gms.measurement.internal;

import java.util.List;

/* loaded from: classes3.dex */
public final class M1<V> {
    private static final Object g = new Object();
    private final String a;
    private final K1<V> b;
    private final V c;
    private final Object d;
    private volatile V e;
    private volatile V f;

    public final V a(V v) {
        List<M1> list;
        synchronized (this.d) {
        }
        if (v != null) {
            return v;
        }
        if (N1.a == null) {
            return this.c;
        }
        synchronized (g) {
            try {
                if (C3628c.a()) {
                    return this.f == null ? this.c : this.f;
                }
                try {
                    list = F.a;
                    for (M1 m1 : list) {
                        if (C3628c.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        V v2 = null;
                        try {
                            K1<V> k1 = m1.b;
                            if (k1 != null) {
                                v2 = k1.a();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (g) {
                            m1.f = v2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                K1<V> k12 = this.b;
                if (k12 == null) {
                    return this.c;
                }
                try {
                    return k12.a();
                } catch (IllegalStateException unused3) {
                    return this.c;
                } catch (SecurityException unused4) {
                    return this.c;
                }
            } finally {
            }
        }
    }

    public final String b() {
        return this.a;
    }

    private M1(String str, V v, V v2, K1<V> k1, boolean z) {
        this.d = new Object();
        this.e = null;
        this.f = null;
        this.a = str;
        this.c = v;
        this.b = k1;
    }
}
