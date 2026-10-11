package com.google.android.gms.measurement.internal;

import ax.b6.AbstractC1599k4;
import ax.b6.C1561g2;
import ax.b6.C1570h2;
import ax.b6.F6;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class K5 {
    private String a;
    private boolean b;
    private C1561g2 c;
    private BitSet d;
    private BitSet e;
    private Map<Integer, Long> f;
    private Map<Integer, List<Long>> g;
    private final /* synthetic */ J5 h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ax.b6.X1$a, ax.b6.k4$b] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v5, types: [ax.b6.g2$a] */
    final ax.b6.X1 a(int i) {
        ArrayList arrayList;
        ?? arrayList2;
        ?? O = ax.b6.X1.O();
        O.w(i);
        O.z(this.b);
        C1561g2 c1561g2 = this.c;
        if (c1561g2 != null) {
            O.y(c1561g2);
        }
        ?? E = C1561g2.Y().z(x5.O(this.d)).E(x5.O(this.e));
        if (this.f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f.size());
            for (Integer num : this.f.keySet()) {
                int intValue = num.intValue();
                Long l = this.f.get(num);
                if (l != null) {
                    arrayList.add((ax.b6.Y1) ((AbstractC1599k4) ax.b6.Y1.N().w(intValue).x(l.longValue()).q()));
                }
            }
        }
        if (arrayList != null) {
            E.x(arrayList);
        }
        if (this.g == null) {
            arrayList2 = Collections.EMPTY_LIST;
        } else {
            arrayList2 = new ArrayList(this.g.size());
            for (Integer num2 : this.g.keySet()) {
                C1570h2.a w = C1570h2.O().w(num2.intValue());
                List<Long> list = this.g.get(num2);
                if (list != null) {
                    Collections.sort(list);
                    w.x(list);
                }
                arrayList2.add((C1570h2) ((AbstractC1599k4) w.q()));
            }
        }
        E.C(arrayList2);
        O.x(E);
        return (ax.b6.X1) ((AbstractC1599k4) O.q());
    }

    final void c(M5 m5) {
        int a = m5.a();
        Boolean bool = m5.c;
        if (bool != null) {
            this.e.set(a, bool.booleanValue());
        }
        Boolean bool2 = m5.d;
        if (bool2 != null) {
            this.d.set(a, bool2.booleanValue());
        }
        if (m5.e != null) {
            Long l = this.f.get(Integer.valueOf(a));
            long longValue = m5.e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f.put(Integer.valueOf(a), Long.valueOf(longValue));
            }
        }
        if (m5.f != null) {
            List<Long> list = this.g.get(Integer.valueOf(a));
            if (list == null) {
                list = new ArrayList<>();
                this.g.put(Integer.valueOf(a), list);
            }
            if (m5.j()) {
                list.clear();
            }
            if (F6.a() && this.h.d().G(this.a, F.l0) && m5.i()) {
                list.clear();
            }
            if (!F6.a() || !this.h.d().G(this.a, F.l0)) {
                list.add(Long.valueOf(m5.f.longValue() / 1000));
                return;
            }
            long longValue2 = m5.f.longValue() / 1000;
            if (list.contains(Long.valueOf(longValue2))) {
                return;
            }
            list.add(Long.valueOf(longValue2));
        }
    }

    private K5(J5 j5, String str) {
        this.h = j5;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new ax.B.a();
        this.g = new ax.B.a();
    }

    private K5(J5 j5, String str, C1561g2 c1561g2, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.h = j5;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = map;
        this.g = new ax.B.a();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.g.put(num, arrayList);
            }
        }
        this.b = false;
        this.c = c1561g2;
    }
}
