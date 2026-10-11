/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.exoplayer.hls.c;
import androidx.media3.exoplayer.hls.f;
import androidx.media3.exoplayer.hls.l;
import androidx.media3.exoplayer.p0;
import ax.P0.C;
import ax.P0.D;
import ax.P0.P;
import ax.P0.o;
import ax.P0.v;
import ax.P0.x;
import ax.S0.a;
import ax.S0.d0;
import ax.U0.z;
import ax.Y0.Z;
import ax.Z0.I1;
import ax.b1.u;
import ax.b1.w;
import ax.c1.d;
import ax.c1.e;
import ax.c1.j;
import ax.d1.i;
import ax.d1.m;
import ax.i1.C;
import ax.i1.N;
import ax.i1.e0;
import ax.i1.f0;
import ax.i1.q0;
import ax.m1.m;
import ax.r7.I;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

final class g
implements ax.i1.C,
m.b {
    private f0 A0;
    private final m c0;
    private final d d0;
    private final z e0;
    private final w f0;
    private final u.a g0;
    private final ax.m1.m h0;
    private final N.a i0;
    private final ax.m1.b j0;
    private final IdentityHashMap<e0, Integer> k0;
    private final j l0;
    private final ax.i1.j m0;
    private final boolean n0;
    private final int o0;
    private final boolean p0;
    private final e q;
    private final I1 q0;
    private final l.b r0;
    private final long s0;
    private C.a t0;
    private int u0;
    private q0 v0;
    private l[] w0;
    private l[] x0;
    private int[][] y0;
    private int z0;

    public g(e e8, m m8, d d8, z z8, ax.m1.f f8, w w8, u.a a8, ax.m1.m m9, N.a a9, ax.m1.b b8, ax.i1.j j8, boolean bl, int n8, boolean bl2, I1 i12, long l8) {
        this.q = e8;
        this.c0 = m8;
        this.d0 = d8;
        this.e0 = z8;
        this.f0 = w8;
        this.g0 = a8;
        this.h0 = m9;
        this.i0 = a9;
        this.j0 = b8;
        this.m0 = j8;
        this.n0 = bl;
        this.o0 = n8;
        this.p0 = bl2;
        this.q0 = i12;
        this.s0 = l8;
        this.r0 = new b(this);
        this.A0 = j8.empty();
        this.k0 = new IdentityHashMap();
        this.l0 = new j();
        this.w0 = new l[0];
        this.x0 = new l[0];
        this.y0 = new int[0][];
    }

    private static v A(v v8, v object, boolean bl) {
        String string;
        String string2;
        int n8;
        int n9;
        int n10;
        C c8;
        String string3;
        ax.r7.z<x> z8 = ax.r7.z.z();
        int n11 = -1;
        if (object != null) {
            string3 = ((v)object).k;
            c8 = ((v)object).l;
            n10 = ((v)object).G;
            n9 = ((v)object).e;
            n8 = ((v)object).f;
            string2 = ((v)object).d;
            string = ((v)object).b;
            z8 = ((v)object).c;
            object = string3;
        } else {
            object = ax.S0.d0.S(v8.k, 1);
            c8 = v8.l;
            if (bl) {
                n10 = v8.G;
                n9 = v8.e;
                n8 = v8.f;
                string2 = v8.d;
                string = v8.b;
                z8 = v8.c;
            } else {
                n9 = 0;
                string2 = null;
                string = null;
                n10 = -1;
                n8 = 0;
            }
        }
        string3 = D.g((String)object);
        int n12 = bl ? v8.h : -1;
        if (bl) {
            n11 = v8.i;
        }
        return new v.b().j0(v8.a).l0(string).m0(z8).W(v8.n).y0(string3).U((String)object).r0(c8).S(n12).t0(n11).T(n10).A0(n9).w0(n8).n0(string2).P();
    }

    private static Map<String, o> B(List<o> list) {
        ArrayList<o> arrayList = new ArrayList<o>(list);
        HashMap<String, o> hashMap = new HashMap<String, o>();
        int n8 = 0;
        while (n8 < arrayList.size()) {
            o o8 = list.get(n8);
            String string = o8.d0;
            int n9 = ++n8;
            while (n9 < arrayList.size()) {
                o o9 = arrayList.get(n9);
                if (TextUtils.equals((CharSequence)o9.d0, (CharSequence)string)) {
                    o8 = o8.f(o9);
                    arrayList.remove(n9);
                    continue;
                }
                ++n9;
            }
            hashMap.put(string, o8);
        }
        return hashMap;
    }

    private static v C(v v8) {
        String string = ax.S0.d0.S(v8.k, 2);
        String string2 = D.g(string);
        return new v.b().j0(v8.a).l0(v8.b).m0(v8.c).W(v8.n).y0(string2).U(string).r0(v8.l).S(v8.h).t0(v8.i).F0(v8.v).h0(v8.w).f0(v8.z).A0(v8.e).w0(v8.f).P();
    }

    public static /* synthetic */ List i(l l8) {
        return l8.t().d();
    }

    static /* synthetic */ int j(g g8) {
        int n8;
        g8.u0 = n8 = g8.u0 - 1;
        return n8;
    }

    static /* synthetic */ q0 o(g g8, q0 q02) {
        g8.v0 = q02;
        return q02;
    }

    private void u(long l8, List<i.a> list, List<l> list2, List<int[]> list3, Map<String, o> map) {
        ArrayList<Uri> arrayList = new ArrayList<Uri>(list.size());
        ArrayList<v> arrayList2 = new ArrayList<v>(list.size());
        ArrayList<Integer> arrayList3 = new ArrayList<Integer>(list.size());
        HashSet<String> hashSet = new HashSet<String>();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            Object object;
            String string = list.get((int)i8).d;
            if (!hashSet.add(string)) continue;
            arrayList.clear();
            arrayList2.clear();
            arrayList3.clear();
            boolean bl = true;
            for (int i9 = 0; i9 < list.size(); ++i9) {
                boolean bl2 = bl;
                if (j.Objects.equals((Object)string, (Object)list.get((int)i9).d)) {
                    object = list.get(i9);
                    arrayList3.add(i9);
                    arrayList.add(((i.a)object).a);
                    arrayList2.add(((i.a)object).b);
                    bl2 = ax.S0.d0.R(((i.a)object).b.k, 1) == 1;
                    bl2 = bl & bl2;
                }
                bl = bl2;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("audio:");
            ((StringBuilder)object).append(string);
            string = ((StringBuilder)object).toString();
            object = this.z(string, 1, arrayList.toArray(ax.S0.d0.j(new Uri[0])), arrayList2.toArray(new v[0]), null, Collections.EMPTY_LIST, map, l8);
            list3.add(ax.u7.f.o(arrayList3));
            list2.add((l)object);
            if (!this.n0 || !bl) continue;
            ((l)object).h0(new P[]{new P(string, arrayList2.toArray(new v[0]))}, 0, new int[0]);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void w(i var1_1, long var2_2, List<l> var4_3, List<int[]> var5_4, Map<String, o> var6_5) {
        var10_6 = var1_1.e.size();
        var15_7 /* !! */  = new int[var10_6];
        var7_9 = 0;
        var9_10 = 0;
        for (var8_8 = 0; var8_8 < var1_1.e.size(); ++var8_8) {
            var13_11 = var1_1.e.get((int)var8_8).b;
            if (var13_11.w <= 0 && ax.S0.d0.S(var13_11.k, 2) == null) {
                if (ax.S0.d0.S(var13_11.k, 1) != null) {
                    var15_7 /* !! */ [var8_8] = 1;
                    ++var9_10;
                    continue;
                }
                var15_7 /* !! */ [var8_8] = -1;
                continue;
            }
            var15_7 /* !! */ [var8_8] = 2;
            ++var7_9;
        }
        if (var7_9 > 0) {
            var8_8 = 1;
lbl19:
            // 2 sources

            while (true) {
                var9_10 = 0;
                break;
            }
        } else if (var9_10 < var10_6) {
            var7_9 = var10_6 - var9_10;
            var8_8 = 0;
            var9_10 = 1;
        } else {
            var7_9 = var10_6;
            var8_8 = 0;
            ** continue;
        }
        var16_12 = new Uri[var7_9];
        var13_11 = new v[var7_9];
        var14_13 = new int[var7_9];
        var11_14 = 0;
        for (var10_6 = 0; var10_6 < var1_1.e.size(); ++var10_6) {
            block22: {
                block23: {
                    block21: {
                        if (var8_8 == 0) break block21;
                        var12_15 = var11_14;
                        if (var15_7 /* !! */ [var10_6] != 2) break block22;
                    }
                    if (var9_10 == 0) break block23;
                    var12_15 = var11_14;
                    if (var15_7 /* !! */ [var10_6] == 1) break block22;
                }
                var17_16 = var1_1.e.get(var10_6);
                var16_12[var11_14] = var17_16.a;
                var13_11[var11_14] = var17_16.b;
                var14_13[var11_14] = var10_6;
                var12_15 = var11_14 + 1;
            }
            var11_14 = var12_15;
        }
        var15_7 /* !! */  = (int[])var13_11[0].k;
        var11_14 = ax.S0.d0.R((String)var15_7 /* !! */ , 2);
        var10_6 = ax.S0.d0.R((String)var15_7 /* !! */ , 1);
        var9_10 = (var10_6 == 1 || var10_6 == 0 && var1_1.g.isEmpty() != false) && var11_14 <= 1 && var10_6 + var11_14 > 0 ? 1 : 0;
        var8_8 = var8_8 == 0 && var10_6 > 0 ? 1 : 0;
        var6_5 = this.z("main", var8_8, var16_12, var13_11, var1_1.j, var1_1.k, (Map<String, o>)var6_5, var2_2);
        var4_3.add((l)var6_5);
        var5_4.add((int[])var14_13);
        if (this.n0 && var9_10 != 0) {
            var4_3 = new ArrayList<l>();
            if (var11_14 > 0) {
                var5_4 = new v[var7_9];
                for (var8_8 = 0; var8_8 < var7_9; ++var8_8) {
                    var5_4[var8_8] = g.C(var13_11[var8_8]);
                }
                var4_3.add((l)new P("main", (v[])var5_4));
                if (var10_6 > 0 && (var1_1.j != null || var1_1.g.isEmpty())) {
                    var5_4 = new StringBuilder();
                    var5_4.append("main");
                    var5_4.append(":audio");
                    var4_3.add((l)new P(var5_4.toString(), new v[]{g.A(var13_11[0], var1_1.j, false)}));
                }
                if ((var5_4 = var1_1.k) != null) {
                    for (var7_9 = 0; var7_9 < var5_4.size(); ++var7_9) {
                        var1_1 = new StringBuilder();
                        var1_1.append("main");
                        var1_1.append(":cc:");
                        var1_1.append(var7_9);
                        var4_3.add((l)new P(var1_1.toString(), new v[]{this.q.d((v)var5_4.get(var7_9))}));
                    }
                }
            } else {
                var5_4 = new v[var7_9];
                for (var8_8 = 0; var8_8 < var7_9; ++var8_8) {
                    var5_4[var8_8] = g.A(var13_11[var8_8], var1_1.j, true);
                }
                var4_3.add((l)new P("main", (v[])var5_4));
            }
            var1_1 = new StringBuilder();
            var1_1.append("main");
            var1_1.append(":id3");
            var1_1 = new P(var1_1.toString(), new v[]{new v.b().j0("ID3").y0("application/id3").P()});
            var4_3.add((l)var1_1);
            var6_5.h0(var4_3.toArray(new P[0]), 0, new int[]{var4_3.indexOf(var1_1)});
        }
    }

    private void x(long l8) {
        int n8;
        i i8 = a.e(this.c0.h());
        l[] lArray = this.p0 ? g.B(i8.m) : Collections.EMPTY_MAP;
        boolean bl = i8.e.isEmpty();
        List<i.a> list = i8.g;
        List<i.a> list2 = i8.h;
        int n9 = 0;
        this.u0 = 0;
        ArrayList<l> arrayList = new ArrayList<l>();
        ArrayList<int[]> arrayList2 = new ArrayList<int[]>();
        if (!bl) {
            this.w(i8, l8, (List<l>)arrayList, (List<int[]>)arrayList2, (Map<String, o>)lArray);
        }
        this.u(l8, list, (List<l>)arrayList, (List<int[]>)arrayList2, (Map<String, o>)lArray);
        this.z0 = arrayList.size();
        this.y(l8, list2, (List<l>)arrayList, (List<int[]>)arrayList2, (Map<String, o>)lArray);
        this.w0 = arrayList.toArray(new l[0]);
        this.y0 = (int[][])arrayList2.toArray((T[])new int[0][]);
        this.u0 = this.w0.length;
        for (n8 = 0; n8 < this.z0; ++n8) {
            this.w0[n8].q0(true);
        }
        lArray = this.w0;
        int n10 = lArray.length;
        for (n8 = n9; n8 < n10; ++n8) {
            lArray[n8].D();
        }
        this.x0 = this.w0;
    }

    private void y(long l8, List<i.a> list, List<l> list2, List<int[]> list3, Map<String, o> map) {
        int n8 = 1;
        ArrayList<Uri> arrayList = new ArrayList<Uri>(list.size());
        ArrayList<v> arrayList2 = new ArrayList<v>(list.size());
        ArrayList<Integer> arrayList3 = new ArrayList<Integer>(list.size());
        HashSet<String> hashSet = new HashSet<String>();
        for (int i8 = 0; i8 < list.size(); i8 += n8) {
            Object object;
            int n9;
            Object object2 = list.get((int)i8).d;
            if (!hashSet.add((String)object2)) continue;
            arrayList.clear();
            arrayList2.clear();
            arrayList3.clear();
            for (n9 = 0; n9 < list.size(); n9 += n8) {
                if (!j.Objects.equals((Object)object2, (Object)list.get((int)n9).d)) continue;
                object = list.get(n9);
                arrayList3.add(n9);
                arrayList.add(object.a);
                arrayList2.add(object.b);
            }
            object = new StringBuilder();
            object.append("subtitle:");
            object.append((String)object2);
            String string = object.toString();
            object = arrayList2.toArray(new v[0]);
            object2 = this.z(string, 3, arrayList.toArray(ax.S0.d0.j(new Uri[0])), (v[])object, null, (List<v>)ax.r7.z.<v>z(), map, l8);
            list3.add(ax.u7.f.o(arrayList3));
            list2.add((l)object2);
            n9 = ((v[])object).length;
            v[] vArray = new v[n9];
            for (n8 = 0; n8 < n9; ++n8) {
                vArray[n8] = this.q.d(object[n8]);
            }
            object = new P(string, vArray);
            n8 = 1;
            ((l)object2).h0(new P[]{object}, 0, new int[0]);
        }
    }

    private l z(String string, int n8, Uri[] object, v[] vArray, v v8, List<v> list, Map<String, o> map, long l8) {
        object = new c(this.q, this.c0, (Uri[])object, vArray, this.d0, this.e0, this.l0, this.s0, list, this.q0, null);
        return new l(string, n8, this.r0, (c)object, map, this.j0, l8, v8, this.f0, this.g0, this.h0, this.i0, this.o0);
    }

    public void D() {
        this.c0.f(this);
        l[] lArray = this.w0;
        int n8 = lArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            lArray[i8].j0();
        }
        this.t0 = null;
    }

    @Override
    public boolean a(p0 lArray) {
        if (this.v0 == null) {
            lArray = this.w0;
            int n8 = lArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                lArray[i8].D();
            }
            return false;
        }
        return this.A0.a((p0)lArray);
    }

    @Override
    public long b() {
        return this.A0.b();
    }

    @Override
    public boolean c() {
        return this.A0.c();
    }

    @Override
    public long d() {
        return this.A0.d();
    }

    @Override
    public void e(long l8) {
        this.A0.e(l8);
    }

    @Override
    public void f() {
        l[] lArray = this.w0;
        int n8 = lArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            lArray[i8].f0();
        }
        this.t0.i(this);
    }

    @Override
    public long g(ax.l1.D[] object, boolean[] blArray, e0[] e0Array, boolean[] blArray2, long l8) {
        l[] lArray;
        int n8;
        Object object2;
        int n9;
        int[] nArray = new int[((ax.l1.D[])object).length];
        int[] nArray2 = new int[((ax.l1.D[])object).length];
        block0: for (n9 = 0; n9 < ((ax.l1.D[])object).length; ++n9) {
            object2 = e0Array[n9];
            n8 = object2 == null ? -1 : this.k0.get(object2);
            nArray[n9] = n8;
            nArray2[n9] = -1;
            object2 = object[n9];
            if (object2 == null) continue;
            lArray = object2.b();
            for (n8 = 0; n8 < ((l[])(object2 = this.w0)).length; ++n8) {
                if (object2[n8].t().e((P)lArray) == -1) continue;
                nArray2[n9] = n8;
                continue block0;
            }
        }
        this.k0.clear();
        int n10 = ((ax.l1.D[])object).length;
        e0[] e0Array2 = new e0[n10];
        e0[] e0Array3 = new e0[((ax.l1.D[])object).length];
        ax.l1.D[] dArray = new ax.l1.D[((ax.l1.D[])object).length];
        l[] lArray2 = new l[this.w0.length];
        n9 = 0;
        boolean bl = false;
        for (n8 = 0; n8 < this.w0.length; ++n8) {
            boolean bl2;
            int n11;
            int n12;
            for (n12 = 0; n12 < ((ax.l1.D[])object).length; ++n12) {
                n11 = nArray[n12];
                lArray = null;
                object2 = n11 == n8 ? e0Array[n12] : null;
                e0Array3[n12] = object2;
                object2 = lArray;
                if (nArray2[n12] == n8) {
                    object2 = object[n12];
                }
                dArray[n12] = object2;
            }
            object2 = this.w0[n8];
            boolean bl3 = ((l)object2).n0(dArray, blArray, e0Array3, blArray2, l8, bl);
            n11 = 0;
            for (n12 = 0; n12 < ((Object[])object).length; ++n12) {
                int n13;
                lArray = e0Array3[n12];
                if (nArray2[n12] == n8) {
                    a.e(lArray);
                    e0Array2[n12] = lArray;
                    this.k0.put((e0)lArray, n8);
                    n13 = 1;
                } else {
                    n13 = n11;
                    if (nArray[n12] == n8) {
                        bl2 = lArray == null;
                        a.g(bl2);
                        n13 = n11;
                    }
                }
                n11 = n13;
            }
            if (n11 == 0) continue;
            lArray2[n9] = object2;
            n12 = n9 + 1;
            if (n9 == 0) {
                ((l)object2).q0(true);
                if (!bl3 && (lArray = this.x0).length != 0) {
                    n9 = n12;
                    if (object2 == lArray[0]) continue;
                }
                this.l0.b();
                bl = true;
                n9 = n12;
                continue;
            }
            bl2 = n8 < this.z0;
            ((l)object2).q0(bl2);
            n9 = n12;
        }
        System.arraycopy(e0Array2, 0, e0Array, 0, n10);
        object = ax.S0.d0.g1(lArray2, n9);
        this.x0 = object;
        object = ax.r7.z.w(object);
        this.A0 = this.m0.a((List<? extends f0>)object, I.i(object, new f()));
        return l8;
    }

    @Override
    public boolean h(Uri uri, m.c c8, boolean bl) {
        l[] lArray = this.w0;
        int n8 = lArray.length;
        boolean bl2 = true;
        for (int i8 = 0; i8 < n8; ++i8) {
            bl2 &= lArray[i8].e0(uri, c8, bl);
        }
        this.t0.i(this);
        return bl2;
    }

    @Override
    public void l() throws IOException {
        l[] lArray = this.w0;
        int n8 = lArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            lArray[i8].l();
        }
    }

    @Override
    public long m(long l8) {
        l[] lArray = this.x0;
        if (lArray.length > 0) {
            boolean bl = lArray[0].m0(l8, false);
            for (int i8 = 1; i8 < (lArray = this.x0).length; ++i8) {
                lArray[i8].m0(l8, bl);
            }
            if (bl) {
                this.l0.b();
            }
        }
        return l8;
    }

    @Override
    public void n(C.a a8, long l8) {
        this.t0 = a8;
        this.c0.o(this);
        this.x(l8);
    }

    @Override
    public long q(long l8, Z z8) {
        for (l l9 : this.x0) {
            if (!l9.T()) continue;
            return l9.q(l8, z8);
        }
        return l8;
    }

    @Override
    public long s() {
        return -9223372036854775807L;
    }

    @Override
    public q0 t() {
        return a.e(this.v0);
    }

    @Override
    public void v(long l8, boolean bl) {
        l[] lArray = this.x0;
        int n8 = lArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            lArray[i8].v(l8, bl);
        }
    }

    private class b
    implements l.b {
        final g q;

        private b(g g8) {
            this.q = g8;
        }

        public void a(l l8) {
            this.q.t0.i(this.q);
        }

        @Override
        public void h() {
            int n8;
            if (g.j(this.q) > 0) {
                return;
            }
            Object[] objectArray = this.q.w0;
            int n9 = objectArray.length;
            int n10 = 0;
            for (n8 = 0; n8 < n9; ++n8) {
                n10 += objectArray[n8].t().a;
            }
            objectArray = new P[n10];
            l[] lArray = this.q.w0;
            int n11 = lArray.length;
            n10 = 0;
            for (n8 = 0; n8 < n11; ++n8) {
                l l8 = lArray[n8];
                int n12 = l8.t().a;
                n9 = 0;
                while (n9 < n12) {
                    objectArray[n10] = l8.t().c(n9);
                    ++n9;
                    ++n10;
                }
            }
            g.o(this.q, new q0((P[])objectArray));
            this.q.t0.f(this.q);
        }

        @Override
        public void k(Uri uri) {
            this.q.c0.m(uri);
        }
    }
}

