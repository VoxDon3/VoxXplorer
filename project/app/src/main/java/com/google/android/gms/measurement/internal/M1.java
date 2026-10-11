/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.f6.f;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.K1;
import com.google.android.gms.measurement.internal.N1;
import com.google.android.gms.measurement.internal.c;

public final class M1<V> {
    private static final Object g = new Object();
    private final String a;
    private final K1<V> b;
    private final V c;
    private final Object d = new Object();
    private volatile V e = null;
    private volatile V f = null;

    private M1(String string, V v8, V v9, K1<V> k12, boolean bl) {
        this.a = string;
        this.c = v8;
        this.b = k12;
    }

    /* synthetic */ M1(String string, Object object, Object object2, K1 k12, boolean bl, f f8) {
        this(string, object, object2, k12, bl);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final V a(V var1_1) {
        block27: {
            block25: {
                block26: {
                    block24: {
                        var3_7 = this.d;
                        ** synchronized (var3_7)
lbl3:
                        // 1 sources

                        if (var1_1 /* !! */  != null) {
                            return var1_1 /* !! */ ;
                        }
                        if (N1.a == null) {
                            return this.c;
                        }
                        var3_7 = M1.g;
                        synchronized (var3_7) {
                            try {
                                if (com.google.android.gms.measurement.internal.c.a()) {
                                    var1_1 /* !! */  = this.f == null ? this.c : this.f;
                                }
                                break block24;
                            }
                            catch (Throwable var1_2) {
                                ** break block28
                            }
                            return var1_1 /* !! */ ;
                        }
                    }
                    try lbl-1000:
                    // 2 sources

                    {
                        for (M1 var4_10 : F.G0()) {
                            var2_9 = com.google.android.gms.measurement.internal.c.a();
                            if (var2_9) break block25;
                            var3_7 = null;
                            var6_11 = var4_10.b;
                            var1_1 /* !! */  = var3_7;
                            if (var6_11 != null) {
                                var1_1 /* !! */  = var6_11.a();
                            }
                            break block26;
                        }
                    }
                    catch (SecurityException var1_3) {
                        break block27;
                    }
                    break block27;
                }
lbl33:
                // 2 sources

                while (true) {
                    var3_7 = M1.g;
                    synchronized (var3_7) {
                        var4_10.f = var1_1 /* !! */ ;
                        ** GOTO lbl-1000
                    }
                    break;
                }
lbl-1000:
                // 1 sources

                {
                    throw var1_2;
                }
                catch (IllegalStateException var1_6) {
                    var1_1 /* !! */  = var3_7;
                }
                {
                    ** continue;
                }
            }
            var1_1 /* !! */  = new V("Refreshing flag cache must be done on a worker thread.");
            throw var1_1 /* !! */ ;
        }
        if ((var1_1 /* !! */  = this.b) == null) {
            return this.c;
        }
        try {
            var1_1 /* !! */  = var1_1 /* !! */ .a();
            return var1_1 /* !! */ ;
        }
        catch (IllegalStateException var1_4) {
            return this.c;
        }
        catch (SecurityException var1_5) {
            return this.c;
        }
    }

    public final String b() {
        return this.a;
    }
}

