/*
 * Decompiled with CFR 0.152.
 */
package ax.I;

import ax.H.a;
import ax.H.d;
import ax.H.e;
import ax.H.f;
import ax.H.g;
import ax.H.h;
import ax.H.j;
import ax.I.b;
import ax.I.o;
import java.util.ArrayList;

public class i {
    public static o a(e e8, int n8, ArrayList<o> arrayList, o object) {
        Object object2;
        int n9;
        int n10;
        int n11;
        block15: {
            n11 = n8 == 0 ? e8.I0 : e8.J0;
            n10 = 0;
            if (n11 != -1 && (object == null || n11 != ((o)object).b)) {
                n9 = 0;
                while (true) {
                    object2 = object;
                    if (n9 >= arrayList.size()) break block15;
                    object2 = arrayList.get(n9);
                    if (((o)object2).c() == n11) {
                        if (object != null) {
                            ((o)object).g(n8, (o)object2);
                            arrayList.remove(object);
                        }
                        break block15;
                    }
                    ++n9;
                }
            }
            object2 = object;
            if (n11 != -1) {
                return object;
            }
        }
        object = object2;
        if (object2 == null) {
            object = object2;
            if (e8 instanceof j) {
                n9 = ((j)e8).s1(n8);
                object = object2;
                if (n9 != -1) {
                    n11 = 0;
                    while (true) {
                        object = object2;
                        if (n11 >= arrayList.size() || ((o)(object = arrayList.get(n11))).c() == n9) break;
                        ++n11;
                    }
                }
            }
            object2 = object;
            if (object == null) {
                object2 = new o(n8);
            }
            arrayList.add((o)object2);
            object = object2;
        }
        if (((o)object).a(e8)) {
            if (e8 instanceof h) {
                h h8 = (h)e8;
                object2 = h8.r1();
                n11 = n10;
                if (h8.s1() == 0) {
                    n11 = 1;
                }
                ((d)object2).c(n11, arrayList, (o)object);
            }
            if (n8 == 0) {
                e8.I0 = ((o)object).c();
                e8.O.c(n8, arrayList, (o)object);
                e8.Q.c(n8, arrayList, (o)object);
            } else {
                e8.J0 = ((o)object).c();
                e8.P.c(n8, arrayList, (o)object);
                e8.S.c(n8, arrayList, (o)object);
                e8.R.c(n8, arrayList, (o)object);
            }
            e8.V.c(n8, arrayList, (o)object);
        }
        return object;
    }

    private static o b(ArrayList<o> arrayList, int n8) {
        int n9 = arrayList.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            o o8 = arrayList.get(i8);
            if (n8 != o8.b) continue;
            return o8;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public static boolean c(f var0, b.b var1_1) {
        var19_2 = var0.r1();
        var3_3 = var19_2.size();
        for (var2_4 = 0; var2_4 < var3_3; ++var2_4) {
            var8_5 = var19_2.get(var2_4);
            if (!i.d(var0.A(), var0.T(), var8_5.A(), var8_5.T())) {
                return false;
            }
            if (!(var8_5 instanceof g)) continue;
            return false;
        }
        var14_6 = null;
        var8_5 = null;
        var10_7 = null;
        var9_8 = null;
        var12_9 = null;
        var11_10 = null;
        for (var2_4 = 0; var2_4 < var3_3; ++var2_4) {
            var20_17 = var19_2.get(var2_4);
            if (!i.d(var0.A(), var0.T(), var20_17.A(), var20_17.T())) {
                f.S1(0, var20_17, (b.b)var1_1, var0.p1, b.a.k);
            }
            var7_11 = var20_17 instanceof h;
            var16_14 = var14_6;
            var15_13 = var10_7;
            if (var7_11) {
                var17_15 = (h)var20_17;
                var13_12 = var10_7;
                if (var17_15.s1() == 0) {
                    var13_12 = var10_7;
                    if (var10_7 == null) {
                        var13_12 = new ArrayList<o>();
                    }
                    var13_12.add((o)var17_15);
                }
                var16_14 = var14_6;
                var15_13 = var13_12;
                if (var17_15.s1() == 1) {
                    var10_7 = var14_6;
                    if (var14_6 == null) {
                        var10_7 = new ArrayList<E>();
                    }
                    var10_7.add(var17_15);
                    var15_13 = var13_12;
                    var16_14 = var10_7;
                }
            }
            var10_7 = var8_5;
            var13_12 = var9_8;
            if (var20_17 instanceof j) {
                if (var20_17 instanceof a) {
                    var17_15 = (a)var20_17;
                    var14_6 = var8_5;
                    if (var17_15.x1() == 0) {
                        var14_6 = var8_5;
                        if (var8_5 == null) {
                            var14_6 = new ArrayList<ArrayList<E>>();
                        }
                        var14_6.add(var17_15);
                    }
                    var10_7 = var14_6;
                    var13_12 = var9_8;
                    if (var17_15.x1() == 1) {
                        var13_12 = var9_8;
                        if (var9_8 == null) {
                            var13_12 = new ArrayList<E>();
                        }
                        var13_12.add((o)var17_15);
                        var10_7 = var14_6;
                    }
                } else {
                    var14_6 = (j)var20_17;
                    var10_7 = var8_5;
                    if (var8_5 == null) {
                        var10_7 = new ArrayList<ArrayList<ArrayList<ArrayList<E>>>>();
                    }
                    var10_7.add(var14_6);
                    var13_12 = var9_8;
                    if (var9_8 == null) {
                        var13_12 = new ArrayList<o>();
                    }
                    var13_12.add((o)var14_6);
                }
            }
            var17_15 = var12_9;
            if (var20_17.O.f == null) {
                var17_15 = var12_9;
                if (var20_17.Q.f == null) {
                    var17_15 = var12_9;
                    if (!var7_11) {
                        var17_15 = var12_9;
                        if (!(var20_17 instanceof a)) {
                            var8_5 = var12_9;
                            if (var12_9 == null) {
                                var8_5 = new ArrayList<e>();
                            }
                            var8_5.add(var20_17);
                            var17_15 = var8_5;
                        }
                    }
                }
            }
            var18_16 = var11_10;
            if (var20_17.P.f == null) {
                var18_16 = var11_10;
                if (var20_17.R.f == null) {
                    var18_16 = var11_10;
                    if (var20_17.S.f == null) {
                        var18_16 = var11_10;
                        if (!var7_11) {
                            var18_16 = var11_10;
                            if (!(var20_17 instanceof a)) {
                                var8_5 = var11_10;
                                if (var11_10 == null) {
                                    var8_5 = new ArrayList<E>();
                                }
                                var8_5.add(var20_17);
                                var18_16 = var8_5;
                            }
                        }
                    }
                }
            }
            var14_6 = var16_14;
            var8_5 = var10_7;
            var10_7 = var15_13;
            var9_8 = var13_12;
            var12_9 = var17_15;
            var11_10 = var18_16;
        }
        var13_12 = new ArrayList<o>();
        if (var14_6 != null) {
            var4_18 = var14_6.size();
            for (var2_4 = 0; var2_4 < var4_18; ++var2_4) {
                var1_1 = var14_6.get(var2_4);
                i.a((h)var1_1, 0, var13_12, null);
            }
        }
        if (var8_5 != null) {
            var4_18 = var8_5.size();
            for (var2_4 = 0; var2_4 < var4_18; ++var2_4) {
                var1_1 = var8_5.get(var2_4);
                var14_6 = (j)var1_1;
                var1_1 = i.a((e)var14_6, 0, var13_12, null);
                var14_6.r1(var13_12, 0, (o)var1_1);
                var1_1.b(var13_12);
            }
        }
        if ((var1_1 = var0.o(d.b.c0)).d() != null) {
            var1_1 = var1_1.d().iterator();
            while (var1_1.hasNext()) {
                i.a(((d)var1_1.next()).d, 0, var13_12, null);
            }
        }
        if ((var1_1 = var0.o(d.b.e0)).d() != null) {
            var1_1 = var1_1.d().iterator();
            while (var1_1.hasNext()) {
                i.a(((d)var1_1.next()).d, 0, var13_12, null);
            }
        }
        if ((var1_1 = var0.o(d.b.h0)).d() != null) {
            var1_1 = var1_1.d().iterator();
            while (var1_1.hasNext()) {
                i.a(var1_1.next().d, 0, var13_12, null);
            }
        }
        if (var12_9 != null) {
            var4_18 = var12_9.size();
            for (var2_4 = 0; var2_4 < var4_18; ++var2_4) {
                var1_1 = var12_9.get(var2_4);
                i.a((e)var1_1, 0, var13_12, null);
            }
        }
        if (var10_7 != null) {
            var4_18 = var10_7.size();
            for (var2_4 = 0; var2_4 < var4_18; ++var2_4) {
                var1_1 = var10_7.get(var2_4);
                i.a((h)var1_1, 1, var13_12, null);
            }
        }
        if (var9_8 != null) {
            var4_18 = var9_8.size();
            for (var2_4 = 0; var2_4 < var4_18; ++var2_4) {
                var1_1 = var9_8.get(var2_4);
                var1_1 = (j)var1_1;
                var8_5 = i.a(var1_1, 1, var13_12, null);
                var1_1.r1(var13_12, 1, (o)var8_5);
                var8_5.b(var13_12);
            }
        }
        if ((var1_1 = var0.o(d.b.d0)).d() != null) {
            var1_1 = var1_1.d().iterator();
            while (var1_1.hasNext()) {
                i.a(((d)var1_1.next()).d, 1, var13_12, null);
            }
        }
        if ((var1_1 = var0.o(d.b.g0)).d() != null) {
            var1_1 = var1_1.d().iterator();
            while (var1_1.hasNext()) {
                i.a(((d)var1_1.next()).d, 1, var13_12, null);
            }
        }
        if ((var1_1 = var0.o(d.b.f0)).d() != null) {
            var1_1 = var1_1.d().iterator();
            while (var1_1.hasNext()) {
                i.a(((d)var1_1.next()).d, 1, var13_12, null);
            }
        }
        if ((var1_1 = var0.o(d.b.h0)).d() != null) {
            var1_1 = var1_1.d().iterator();
            while (var1_1.hasNext()) {
                i.a(var1_1.next().d, 1, var13_12, null);
            }
        }
        if (var11_10 != null) {
            var4_18 = var11_10.size();
            for (var2_4 = 0; var2_4 < var4_18; ++var2_4) {
                var1_1 = var11_10.get(var2_4);
                i.a((e)var1_1, 1, var13_12, null);
            }
        }
        for (var2_4 = 0; var2_4 < var3_3; ++var2_4) {
            var8_5 = var19_2.get(var2_4);
            if (!var8_5.s0()) continue;
            var1_1 = i.b(var13_12, var8_5.I0);
            var8_5 = i.b(var13_12, var8_5.J0);
            if (var1_1 == null || var8_5 == null) continue;
            var1_1.g(0, (o)var8_5);
            var8_5.i(2);
            var13_12.remove(var1_1);
        }
        if (var13_12.size() <= 1) {
            return false;
        }
        if (var0.A() != e.b.c0) ** GOTO lbl-1000
        var6_19 = var13_12.size();
        var1_1 = null;
        var3_3 = 0;
        var2_4 = 0;
        while (var2_4 < var6_19) {
            var8_5 = var13_12.get(var2_4);
            var4_18 = var2_4 + 1;
            if ((var8_5 = (o)var8_5).d() == 1) {
                var2_4 = var4_18;
                continue;
            }
            var8_5.h(false);
            var5_20 = var8_5.f(var0.K1(), 0);
            var2_4 = var4_18;
            if (var5_20 <= var3_3) continue;
            var1_1 = var8_5;
            var3_3 = var5_20;
            var2_4 = var4_18;
        }
        if (var1_1 != null) {
            var0.P0(e.b.q);
            var0.k1(var3_3);
            var1_1.h(true);
            var8_5 = var1_1;
        } else lbl-1000:
        // 2 sources

        {
            var8_5 = null;
        }
        if (var0.T() != e.b.c0) ** GOTO lbl-1000
        var6_19 = var13_12.size();
        var1_1 = null;
        var3_3 = 0;
        var2_4 = 0;
        while (var3_3 < var6_19) {
            var9_8 = var13_12.get(var3_3);
            var4_18 = var3_3 + 1;
            if ((var9_8 = (o)var9_8).d() == 0) {
                var3_3 = var4_18;
                continue;
            }
            var9_8.h(false);
            var5_20 = var9_8.f(var0.K1(), 1);
            var3_3 = var4_18;
            if (var5_20 <= var2_4) continue;
            var1_1 = var9_8;
            var2_4 = var5_20;
            var3_3 = var4_18;
        }
        if (var1_1 != null) {
            var0.g1(e.b.q);
            var0.L0(var2_4);
            var1_1.h(true);
        } else lbl-1000:
        // 2 sources

        {
            var1_1 = null;
        }
        return var8_5 != null || var1_1 != null;
        {
        }
    }

    public static boolean d(e.b b8, e.b b9, e.b b10, e.b b11) {
        e.b b12;
        e.b b13 = e.b.q;
        boolean bl = b10 == b13 || b10 == (b12 = e.b.c0) || b10 == e.b.e0 && b8 != b12;
        boolean bl2 = b11 == b13 || b11 == (b8 = e.b.c0) || b11 == e.b.e0 && b9 != b8;
        return bl || bl2;
        {
        }
    }
}

