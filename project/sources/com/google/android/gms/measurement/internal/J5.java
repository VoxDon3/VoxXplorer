package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import ax.M5.C0821p;
import ax.b6.AbstractC1599k4;
import ax.b6.C1561g2;
import ax.b6.C1570h2;
import ax.b6.C1579i2;
import ax.b6.C1618m6;
import ax.b6.F6;
import ax.f6.C2052F;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class J5 extends AbstractC3690k5 {
    private String d;
    private Set<Integer> e;
    private Map<Integer, K5> f;
    private Long g;
    private Long h;

    J5(q5 q5Var) {
        super(q5Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fc, code lost:
    
        r5 = k().L();
        r6 = com.google.android.gms.measurement.internal.V1.v(r13.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010e, code lost:
    
        if (r7.R() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0110, code lost:
    
        r9 = java.lang.Integer.valueOf(r7.n());
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0118, code lost:
    
        r5.c("Invalid property filter ID. appId, id", r6, java.lang.String.valueOf(r9));
        r7 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void B(java.util.List<ax.b6.C1579i2> r14) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.J5.B(java.util.List):void");
    }

    private final void C(List<ax.b6.Z1> list, boolean z) {
        ax.B.a aVar;
        L5 l5;
        C3770y c3770y;
        C2052F c2052f;
        if (list.isEmpty()) {
            return;
        }
        C2052F c2052f2 = null;
        L5 l52 = new L5(this);
        ax.B.a aVar2 = new ax.B.a();
        for (ax.b6.Z1 z1 : list) {
            ax.b6.Z1 a = l52.a(this.d, z1);
            if (a != null) {
                C3691l q = q();
                String str = this.d;
                String e0 = a.e0();
                C3770y G0 = q.G0(str, z1.e0());
                if (G0 == null) {
                    q.k().L().c("Event aggregate wasn't created during raw event logging. appId, event", V1.v(str), q.g().c(e0));
                    l5 = l52;
                    aVar = aVar2;
                    c3770y = new C3770y(str, z1.e0(), 1L, 1L, 1L, z1.b0(), 0L, null, null, null, null);
                } else {
                    aVar = aVar2;
                    l5 = l52;
                    c3770y = new C3770y(G0.a, G0.b, G0.c + 1, G0.d + 1, G0.e + 1, G0.f, G0.g, G0.h, G0.i, G0.j, G0.k);
                }
                q().U(c3770y);
                if (C1618m6.a()) {
                    c2052f = null;
                    if (d().G(null, F.W0) && z) {
                        c2052f2 = null;
                        aVar2 = aVar;
                        l52 = l5;
                    }
                } else {
                    c2052f = null;
                }
                long j = c3770y.c;
                String e02 = a.e0();
                ax.B.a aVar3 = aVar;
                Map<Integer, List<ax.b6.B1>> map = (Map) aVar3.get(e02);
                if (map == null) {
                    map = q().K0(this.d, e02);
                    aVar3.put(e02, map);
                }
                for (Integer num : map.keySet()) {
                    int intValue = num.intValue();
                    if (this.e.contains(num)) {
                        k().K().b("Skipping failed audience ID", num);
                    } else {
                        Iterator<ax.b6.B1> it = map.get(num).iterator();
                        boolean z2 = true;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ax.b6.B1 next = it.next();
                            C3621b c3621b = new C3621b(this, this.d, intValue, next);
                            boolean k = c3621b.k(this.g, this.h, a, j, c3770y, D(intValue, next.N()));
                            if (!k) {
                                this.e.add(num);
                                z2 = k;
                                break;
                            } else {
                                y(num).c(c3621b);
                                z2 = k;
                            }
                        }
                        if (!z2) {
                            this.e.add(num);
                        }
                    }
                }
                C2052F c2052f3 = c2052f;
                aVar2 = aVar3;
                c2052f2 = c2052f3;
                l52 = l5;
            } else {
                aVar2 = aVar2;
                c2052f2 = c2052f2;
            }
        }
    }

    private final boolean D(int i, int i2) {
        BitSet bitSet;
        K5 k5 = this.f.get(Integer.valueOf(i));
        if (k5 == null) {
            return false;
        }
        bitSet = k5.d;
        return bitSet.get(i2);
    }

    private final List<ax.b6.X1> E() {
        ArrayList arrayList = new ArrayList();
        Set<Integer> keySet = this.f.keySet();
        keySet.removeAll(this.e);
        for (Integer num : keySet) {
            int intValue = num.intValue();
            K5 k5 = this.f.get(num);
            C0821p.l(k5);
            ax.b6.X1 a = k5.a(intValue);
            arrayList.add(a);
            C3691l q = q();
            String str = this.d;
            C1561g2 S = a.S();
            q.u();
            q.n();
            C0821p.f(str);
            C0821p.l(S);
            byte[] l = S.l();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", num);
            contentValues.put("current_results", l);
            try {
                if (q.B().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    q.k().G().b("Failed to insert filter results (got -1). appId", V1.v(str));
                }
            } catch (SQLiteException e) {
                q.k().G().c("Error storing filter results. appId", V1.v(str), e);
            }
        }
        return arrayList;
    }

    private final K5 y(Integer num) {
        if (this.f.containsKey(num)) {
            return this.f.get(num);
        }
        K5 k5 = new K5(this, this.d);
        this.f.put(num, k5);
        return k5;
    }

    final List<ax.b6.X1> A(String str, List<ax.b6.Z1> list, List<C1579i2> list2, Long l, Long l2, boolean z) {
        boolean z2;
        HashSet hashSet;
        Map<Integer, C1561g2> map;
        List<ax.b6.B1> list3;
        boolean z3;
        Map<Integer, C1561g2> map2;
        Iterator it;
        C1561g2 c1561g2;
        Iterator<ax.b6.Y1> it2;
        Long l3;
        HashSet hashSet2;
        Map<Integer, List<Integer>> map3;
        Iterator<Integer> it3;
        C0821p.f(str);
        C0821p.l(list);
        C0821p.l(list2);
        this.d = str;
        this.e = new HashSet();
        this.f = new ax.B.a();
        this.g = l;
        this.h = l2;
        Iterator<ax.b6.Z1> it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(it4.next().e0())) {
                z2 = true;
                break;
            }
        }
        boolean z4 = F6.a() && d().G(this.d, F.l0);
        boolean z5 = F6.a() && d().G(this.d, F.k0);
        if (z2) {
            C3691l q = q();
            String str2 = this.d;
            q.u();
            q.n();
            C0821p.f(str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                q.B().update("events", contentValues, "app_id = ?", new String[]{str2});
            } catch (SQLiteException e) {
                q.k().G().c("Error resetting session-scoped event counts. appId", V1.v(str2), e);
            }
        }
        Map<Integer, List<ax.b6.B1>> map4 = Collections.EMPTY_MAP;
        if (z5 && z4) {
            map4 = q().U0(this.d);
        }
        Map<Integer, C1561g2> T0 = q().T0(this.d);
        if (!T0.isEmpty()) {
            HashSet hashSet3 = new HashSet(T0.keySet());
            if (z2) {
                String str3 = this.d;
                Map<Integer, List<Integer>> V0 = q().V0(this.d);
                C0821p.f(str3);
                C0821p.l(T0);
                ax.B.a aVar = new ax.B.a();
                if (!T0.isEmpty()) {
                    Iterator<Integer> it5 = T0.keySet().iterator();
                    while (it5.hasNext()) {
                        Integer next = it5.next();
                        next.intValue();
                        C1561g2 c1561g22 = T0.get(next);
                        List<Integer> list4 = V0.get(next);
                        if (list4 == null || list4.isEmpty()) {
                            hashSet2 = hashSet3;
                            map3 = V0;
                            it3 = it5;
                            aVar.put(next, c1561g22);
                        } else {
                            hashSet2 = hashSet3;
                            List<Long> P = o().P(c1561g22.c0(), list4);
                            if (P.isEmpty()) {
                                hashSet3 = hashSet2;
                            } else {
                                C1561g2.a z6 = c1561g22.A().y().z(P);
                                z6.D().E(o().P(c1561g22.e0(), list4));
                                ArrayList arrayList = new ArrayList();
                                for (ax.b6.Y1 y1 : c1561g22.b0()) {
                                    Map<Integer, List<Integer>> map5 = V0;
                                    Iterator<Integer> it6 = it5;
                                    if (!list4.contains(Integer.valueOf(y1.n()))) {
                                        arrayList.add(y1);
                                    }
                                    V0 = map5;
                                    it5 = it6;
                                }
                                map3 = V0;
                                it3 = it5;
                                z6.w().x(arrayList);
                                ArrayList arrayList2 = new ArrayList();
                                for (C1570h2 c1570h2 : c1561g22.d0()) {
                                    if (!list4.contains(Integer.valueOf(c1570h2.M()))) {
                                        arrayList2.add(c1570h2);
                                    }
                                }
                                z6.B().C(arrayList2);
                                aVar.put(next, (C1561g2) ((AbstractC1599k4) z6.q()));
                            }
                        }
                        hashSet3 = hashSet2;
                        V0 = map3;
                        it5 = it3;
                    }
                }
                hashSet = hashSet3;
                map = aVar;
            } else {
                hashSet = hashSet3;
                map = T0;
            }
            Iterator it7 = hashSet.iterator();
            while (it7.hasNext()) {
                Integer num = (Integer) it7.next();
                num.intValue();
                C1561g2 c1561g23 = map.get(num);
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                C1561g2 c1561g24 = c1561g23;
                ax.B.a aVar2 = new ax.B.a();
                if (c1561g24 != null && c1561g24.n() != 0) {
                    Iterator<ax.b6.Y1> it8 = c1561g24.b0().iterator();
                    while (it8.hasNext()) {
                        ax.b6.Y1 next2 = it8.next();
                        if (next2.Q()) {
                            c1561g2 = c1561g24;
                            Integer valueOf = Integer.valueOf(next2.n());
                            if (next2.P()) {
                                Long valueOf2 = Long.valueOf(next2.M());
                                it2 = it8;
                                l3 = valueOf2;
                            } else {
                                it2 = it8;
                                l3 = null;
                            }
                            aVar2.put(valueOf, l3);
                        } else {
                            c1561g2 = c1561g24;
                            it2 = it8;
                        }
                        it8 = it2;
                        c1561g24 = c1561g2;
                    }
                }
                C1561g2 c1561g25 = c1561g24;
                ax.B.a aVar3 = new ax.B.a();
                if (c1561g25 != null && c1561g25.P() != 0) {
                    Iterator<C1570h2> it9 = c1561g25.d0().iterator();
                    while (it9.hasNext()) {
                        Iterator<C1570h2> it10 = it9;
                        C1570h2 next3 = it9.next();
                        if (!next3.R() || next3.n() <= 0) {
                            map2 = map;
                            it = it7;
                        } else {
                            map2 = map;
                            it = it7;
                            aVar3.put(Integer.valueOf(next3.M()), Long.valueOf(next3.I(next3.n() - 1)));
                        }
                        it9 = it10;
                        map = map2;
                        it7 = it;
                    }
                }
                Map<Integer, C1561g2> map6 = map;
                Iterator it11 = it7;
                if (c1561g25 != null) {
                    int i = 0;
                    while (i < (c1561g25.T() << 6)) {
                        if (x5.f0(c1561g25.e0(), i)) {
                            z3 = z4;
                            k().K().c("Filter already evaluated. audience ID, filter ID", num, Integer.valueOf(i));
                            bitSet2.set(i);
                            if (x5.f0(c1561g25.c0(), i)) {
                                bitSet.set(i);
                                i++;
                                z4 = z3;
                            }
                        } else {
                            z3 = z4;
                        }
                        aVar2.remove(Integer.valueOf(i));
                        i++;
                        z4 = z3;
                    }
                }
                boolean z7 = z4;
                C1561g2 c1561g26 = T0.get(num);
                if (z5 && z7 && (list3 = map4.get(num)) != null && this.h != null && this.g != null) {
                    for (ax.b6.B1 b1 : list3) {
                        int N = b1.N();
                        Map<Integer, List<ax.b6.B1>> map7 = map4;
                        long longValue = this.h.longValue() / 1000;
                        if (b1.U()) {
                            longValue = this.g.longValue() / 1000;
                        }
                        if (aVar2.containsKey(Integer.valueOf(N))) {
                            aVar2.put(Integer.valueOf(N), Long.valueOf(longValue));
                        }
                        if (aVar3.containsKey(Integer.valueOf(N))) {
                            aVar3.put(Integer.valueOf(N), Long.valueOf(longValue));
                        }
                        map4 = map7;
                    }
                }
                this.f.put(num, new K5(this, this.d, c1561g26, bitSet, bitSet2, aVar2, aVar3));
                T0 = T0;
                z4 = z7;
                map4 = map4;
                map = map6;
                it7 = it11;
            }
        }
        if (!C1618m6.a() || !d().G(null, F.W0)) {
            C(list, true);
            B(list2);
            return E();
        }
        C(list, z);
        if (z) {
            return new ArrayList();
        }
        B(list2);
        return E();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3690k5
    protected final boolean x() {
        return false;
    }

    final List<ax.b6.X1> z(String str, List<ax.b6.Z1> list, List<C1579i2> list2, Long l, Long l2) {
        return A(str, list, list2, l, l2, false);
    }
}
