/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import ax.B.a;
import ax.M5.p;
import ax.b6.B1;
import ax.b6.E1;
import ax.b6.F6;
import ax.b6.Z1;
import ax.b6.g2;
import ax.b6.h2;
import ax.b6.i2;
import ax.b6.k4;
import ax.b6.m6;
import ax.b6.q3;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.K5;
import com.google.android.gms.measurement.internal.L5;
import com.google.android.gms.measurement.internal.M5;
import com.google.android.gms.measurement.internal.V1;
import com.google.android.gms.measurement.internal.X1;
import com.google.android.gms.measurement.internal.b;
import com.google.android.gms.measurement.internal.d;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.k5;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.q5;
import com.google.android.gms.measurement.internal.x5;
import com.google.android.gms.measurement.internal.y;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class J5
extends k5 {
    private String d;
    private Set<Integer> e;
    private Map<Integer, K5> f;
    private Long g;
    private Long h;

    J5(q5 q52) {
        super(q52);
    }

    private final void B(List<i2> map) {
        if (!map.isEmpty()) {
            a<String, Map<Integer, List<E1>>> a8 = new a<String, Map<Integer, List<E1>>>();
            Iterator<i2> iterator = map.iterator();
            block0: while (iterator.hasNext()) {
                i2 i22 = iterator.next();
                String string = i22.c0();
                Object object = (Map)a8.get((Object)string);
                map = object;
                if (object == null) {
                    map = this.q().M0(this.d, string);
                    a8.put(string, map);
                }
                for (Integer n8 : map.keySet()) {
                    int n9 = n8;
                    if (this.e.contains(n8)) {
                        this.k().K().b("Skipping failed audience ID", n8);
                        continue block0;
                    }
                    Object object2 = map.get(n8).iterator();
                    boolean bl = true;
                    while (object2.hasNext()) {
                        Object object3;
                        E1 e12 = object2.next();
                        bl = this.k().C(2);
                        string = null;
                        if (bl) {
                            object3 = this.k().K();
                            object = e12.R() ? Integer.valueOf(e12.n()) : null;
                            ((X1)object3).d("Evaluating filter. audience, filter, property", n8, object, this.g().g(e12.N()));
                            this.k().K().b("Filter definition", this.o().L(e12));
                        }
                        if (e12.R() && e12.n() <= 256) {
                            object = new d(this, this.d, n9, e12);
                            bl = ((d)object).k(this.g, this.h, i22, this.D(n9, e12.n()));
                            if (bl) {
                                this.y(n8).c((M5)object);
                                continue;
                            }
                            this.e.add(n8);
                            break;
                        }
                        object2 = this.k().L();
                        object3 = V1.v(this.d);
                        object = string;
                        if (e12.R()) {
                            object = e12.n();
                        }
                        ((X1)object2).c("Invalid property filter ID. appId, id", object3, String.valueOf(object));
                        bl = false;
                        break;
                    }
                    if (bl) continue;
                    this.e.add(n8);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private final void C(List<Z1> var1_1, boolean var2_2) {
        if (!var1_1.isEmpty()) {
            var6_3 = false;
            var7_4 = new L5(this, null);
            var8_5 = new a<K, V>();
            var11_6 = var1_1.iterator();
            var1_1 = var8_5;
            block0: while (var11_6.hasNext()) {
                var14_13 = var11_6.next();
                var12_11 = var7_4.a(this.d, (Z1)var14_13);
                if (var12_11 == null) continue;
                var10_10 = this.q();
                var8_5 = this.d;
                var13_12 = var12_11.e0();
                var9_9 = var10_10.G0((String)var8_5, var14_13.e0());
                if (var9_9 == null) {
                    var10_10.k().L().c("Event aggregate wasn't created during raw event logging. appId, event", V1.v((String)var8_5), var10_10.g().c((String)var13_12));
                    var8_5 = new y((String)var8_5, var14_13.e0(), 1L, 1L, 1L, var14_13.b0(), 0L, null, null, null, null);
                } else {
                    var8_5 = new y(var9_9.a, var9_9.b, var9_9.c + 1L, var9_9.d + 1L, var9_9.e + 1L, var9_9.f, var9_9.g, var9_9.h, var9_9.i, var9_9.j, var9_9.k);
                }
                this.q().U((y)var8_5);
                if (m6.a() && this.d().G(null, F.W0) && var2_2) {
                    while (true) {
                        var6_3 = false;
                        continue block0;
                        break;
                    }
                }
                var4_8 = var8_5.c;
                var13_12 = var12_11.e0();
                var10_10 = (Map)var1_1.get(var13_12);
                var9_9 = var10_10;
                if (var10_10 == null) {
                    var9_9 = this.q().K0(this.d, (String)var13_12);
                    var1_1.put(var13_12, var9_9);
                }
                var15_14 = var9_9.keySet().iterator();
                while (true) lbl-1000:
                // 4 sources

                {
                    if (!var15_14.hasNext()) ** continue;
                    var14_13 = (Integer)var15_14.next();
                    var3_7 = var14_13.intValue();
                    if (this.e.contains(var14_13)) {
                        this.k().K().b("Skipping failed audience ID", var14_13);
                        ** continue;
                    }
                    var10_10 = var9_9.get(var14_13).iterator();
                    var6_3 = true;
                    while (var10_10.hasNext()) {
                        var13_12 = var10_10.next();
                        var16_15 = new b(this, this.d, var3_7, (B1)var13_12);
                        var6_3 = var16_15.k(this.g, this.h, var12_11, var4_8, (y)var8_5, this.D(var3_7, var13_12.N()));
                        if (var6_3) {
                            this.y((Integer)var14_13).c(var16_15);
                            continue;
                        }
                        this.e.add((Integer)var14_13);
                        break;
                    }
                    if (var6_3) ** continue;
                    this.e.add((Integer)var14_13);
                }
            }
        }
    }

    private final boolean D(int n8, int n9) {
        K5 k52 = this.f.get(n8);
        if (k52 == null) {
            return false;
        }
        return K5.b(k52).get(n9);
    }

    private final List<ax.b6.X1> E() {
        ArrayList<ax.b6.X1> arrayList = new ArrayList<ax.b6.X1>();
        Object object = this.f.keySet();
        object.removeAll(this.e);
        object = object.iterator();
        while (object.hasNext()) {
            Integer n8 = (Integer)object.next();
            int n9 = n8;
            Object object2 = this.f.get(n8);
            p.l(object2);
            Object object3 = ((K5)object2).a(n9);
            arrayList.add((ax.b6.X1)object3);
            object2 = this.q();
            String string = this.d;
            object3 = ((ax.b6.X1)object3).S();
            ((k5)object2).u();
            ((f3)object2).n();
            p.f(string);
            p.l(object3);
            object3 = ((q3)object3).l();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", string);
            contentValues.put("audience_id", n8);
            contentValues.put("current_results", (byte[])object3);
            try {
                if (((l)object2).B().insertWithOnConflict("audience_filter_values", null, contentValues, 5) != -1L) continue;
                ((f3)object2).k().G().b("Failed to insert filter results (got -1). appId", V1.v(string));
            }
            catch (SQLiteException sQLiteException) {
                ((f3)object2).k().G().c("Error storing filter results. appId", V1.v(string), (Object)sQLiteException);
            }
        }
        return arrayList;
    }

    private final K5 y(Integer n8) {
        if (this.f.containsKey(n8)) {
            return this.f.get(n8);
        }
        K5 k52 = new K5(this, this.d, null);
        this.f.put(n8, k52);
        return k52;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    final List<ax.b6.X1> A(String var1_1, List<Z1> var2_2, List<i2> var3_3, Long var4_4, Long var5_5, boolean var6_7) {
        block39: {
            block37: {
                p.f((String)var1_1);
                p.l(var2_2);
                p.l(var3_3);
                this.d = var1_1;
                this.e = new HashSet<Integer>();
                this.f = new a<Integer, K5>();
                this.g = var4_4;
                this.h = var5_5;
                var1_1 = var2_2.iterator();
                while (var1_1.hasNext()) {
                    if (!"_s".equals(((Z1)var1_1.next()).e0())) continue;
                    var8_8 = 1;
                    break block37;
                }
                var8_8 = 0;
            }
            var7_9 = F6.a() != false && this.d().G(this.d, F.l0) != false ? 1 : 0;
            var9_10 = F6.a() != false && this.d().G(this.d, F.k0) != false;
            if (var8_8 != 0) {
                var1_1 = this.q();
                var4_4 = this.d;
                var1_1.u();
                var1_1.n();
                p.f((String)var4_4);
                var5_5 = new ContentValues();
                var5_5.put("current_session_count", Integer.valueOf(0));
                try {
                    var1_1.B().update("events", (ContentValues)var5_5, "app_id = ?", new String[]{var4_4});
                }
                catch (SQLiteException var5_6) {
                    var1_1.k().G().c("Error resetting session-scoped event counts. appId", V1.v((String)var4_4), (Object)var5_6);
                }
            }
            var13_11 = var1_1 = Collections.EMPTY_MAP;
            if (var9_10) {
                var13_11 = var1_1;
                if (var7_9 != 0) {
                    var13_11 = this.q().U0(this.d);
                }
            }
            if ((var15_12 = this.q().T0(this.d)).isEmpty()) break block39;
            var1_1 = new HashSet<Integer>(var15_12.keySet());
            if (var8_8 != 0) {
                block38: {
                    var4_4 = this.d;
                    var5_5 = this.q().V0(this.d);
                    p.f((String)var4_4);
                    p.l(var15_12);
                    var16_13 = new a<K, V>();
                    var14_14 = var1_1;
                    if (!var15_12.isEmpty()) {
                        var4_4 = var15_12.keySet().iterator();
                        block3: while (true) {
                            var14_14 = var1_1;
                            if (!var4_4.hasNext()) break block38;
                            var14_14 = (Integer)var4_4.next();
                            var14_14.intValue();
                            var17_15 = var15_12.get(var14_14);
                            var18_16 = var5_5.get(var14_14);
                            if (var18_16 == null || var18_16.isEmpty()) break;
                            var19_17 = this.o().P(var17_15.c0(), (List<Integer>)var18_16);
                            if (!var19_17.isEmpty()) {
                                var19_17 = ((g2.a)var17_15.A()).y().z((Iterable<? extends Long>)var19_17);
                                var20_18 = this.o().P(var17_15.e0(), (List<Integer>)var18_16);
                                var19_17.D().E((Iterable<? extends Long>)var20_18);
                                var20_18 = new ArrayList<Object>();
                                for (Object var22_20 : var17_15.b0()) {
                                    if (var18_16.contains(var22_20.n())) continue;
                                    var20_18.add(var22_20);
                                }
                                var19_17.w().x(var20_18);
                                var20_18 = new ArrayList<E>();
                                for (Object var21_19 : var17_15.d0()) {
                                    if (var18_16.contains(var21_19.M())) continue;
                                    var20_18.add(var21_19);
                                }
                                var19_17.B().C(var20_18);
                                var16_13.put(var14_14, (g2)((k4)var19_17.q()));
lbl87:
                                // 2 sources

                                while (true) {
                                    var14_14 = var1_1;
                                    continue block3;
                                    break;
                                }
                            }
                            var14_14 = var1_1;
                        }
                        var16_13.put(var14_14, (List<Integer>)var17_15);
                        ** continue;
                    }
                }
                var4_4 = var16_13;
            } else {
                var4_4 = var15_12;
                var14_14 = var1_1;
            }
            var5_5 = var14_14.iterator();
            var1_1 = var13_11;
            while (var5_5.hasNext()) {
                block40: {
                    var18_16 = (Integer)var5_5.next();
                    var18_16.intValue();
                    var13_11 = (g2)var4_4.get(var18_16);
                    var19_17 = new BitSet();
                    var20_18 = new BitSet();
                    var21_19 = new a<Integer, List<B1>>();
                    var16_13 = var13_11;
                    if (var13_11 != null) {
                        if (var13_11.n() == 0) {
                            var16_13 = var13_11;
                        } else {
                            var14_14 = var13_11.b0().iterator();
                            while (true) {
                                var16_13 = var13_11;
                                if (!var14_14.hasNext()) break;
                                var16_13 = var14_14.next();
                                if (!var16_13.Q()) continue;
                                var8_8 = var16_13.n();
                                var16_13 = var16_13.P() != false ? Long.valueOf(var16_13.M()) : null;
                                var21_19.put(var8_8, var16_13);
                            }
                        }
                    }
                    var22_20 = new a<Integer, Long>();
                    var14_14 = var4_4;
                    var13_11 = var5_5;
                    if (var16_13 != null) {
                        if (var16_13.P() == 0) {
                            var14_14 = var4_4;
                            var13_11 = var5_5;
                        } else {
                            var17_15 = var16_13.d0().iterator();
                            while (true) {
                                var14_14 = var4_4;
                                var13_11 = var5_5;
                                if (!var17_15.hasNext()) break;
                                var13_11 = (h2)var17_15.next();
                                if (!var13_11.R() || var13_11.n() <= 0) continue;
                                var22_20.put(var13_11.M(), var13_11.I(var13_11.n() - 1));
                            }
                        }
                    }
                    var8_8 = var7_9;
                    if (var16_13 == null) break block40;
                    var10_21 = 0;
                    while (true) {
                        var8_8 = var7_9;
                        if (var10_21 >= var16_13.T() << 6) break;
                        if (!x5.f0(var16_13.e0(), var10_21)) ** GOTO lbl-1000
                        this.k().K().c("Filter already evaluated. audience ID, filter ID", var18_16, var10_21);
                        var20_18.set(var10_21);
                        if (x5.f0(var16_13.c0(), var10_21)) {
                            var19_17.set(var10_21);
                        } else lbl-1000:
                        // 2 sources

                        {
                            var21_19.remove(var10_21);
                        }
                        ++var10_21;
                    }
                }
                var5_5 = var15_12.get(var18_16);
                var4_4 = var1_1;
                if (var9_10) {
                    var4_4 = var1_1;
                    if (var8_8 != 0) {
                        var16_13 = var1_1.get(var18_16);
                        var4_4 = var1_1;
                        if (var16_13 != null) {
                            var4_4 = var1_1;
                            if (this.h != null) {
                                if (this.g == null) {
                                    var4_4 = var1_1;
                                } else {
                                    var16_13 = var16_13.iterator();
                                    while (true) {
                                        var4_4 = var1_1;
                                        if (!var16_13.hasNext()) break;
                                        var4_4 = (B1)var16_13.next();
                                        var7_9 = var4_4.N();
                                        var11_22 = this.h / 1000L;
                                        if (var4_4.U()) {
                                            var11_22 = this.g / 1000L;
                                        }
                                        if (var21_19.containsKey(var7_9)) {
                                            var21_19.put(var7_9, var11_22);
                                        }
                                        if (!var22_20.containsKey(var7_9)) continue;
                                        var22_20.put(var7_9, var11_22);
                                    }
                                }
                            }
                        }
                    }
                }
                var1_1 = new K5(this, this.d, (g2)var5_5, (BitSet)var19_17, (BitSet)var20_18, (Map)var21_19, (Map)var22_20, null);
                this.f.put((Integer)var18_16, (K5)var1_1);
                var7_9 = var8_8;
                var1_1 = var4_4;
                var4_4 = var14_14;
                var5_5 = var13_11;
            }
        }
        if (m6.a() && this.d().G(null, F.W0)) {
            this.C(var2_2, var6_7);
            if (var6_7) {
                return new ArrayList<ax.b6.X1>();
            }
            this.B(var3_3);
            return this.E();
        }
        this.C(var2_2, true);
        this.B(var3_3);
        return this.E();
    }

    @Override
    protected final boolean x() {
        return false;
    }

    final List<ax.b6.X1> z(String string, List<Z1> list, List<i2> list2, Long l8, Long l9) {
        return this.A(string, list, list2, l8, l9, false);
    }
}

