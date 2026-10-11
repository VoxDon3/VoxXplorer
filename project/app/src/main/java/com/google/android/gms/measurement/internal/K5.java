/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.B.a;
import ax.b6.F6;
import ax.b6.X1;
import ax.b6.Y1;
import ax.b6.g2;
import ax.b6.h2;
import ax.b6.k4;
import ax.f6.E;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.J5;
import com.google.android.gms.measurement.internal.M5;
import com.google.android.gms.measurement.internal.x5;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class K5 {
    private String a;
    private boolean b;
    private g2 c;
    private BitSet d;
    private BitSet e;
    private Map<Integer, Long> f;
    private Map<Integer, List<Long>> g;
    private final J5 h;

    private K5(J5 j52, String string) {
        this.h = j52;
        this.a = string;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new a<Integer, Long>();
        this.g = new a<Integer, List<Long>>();
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    private K5(J5 object3, String object2, g2 g22, BitSet cloneable, BitSet bitSet, Map map, Map map2) {
        this.h = object3;
        this.a = object2;
        this.d = cloneable;
        this.e = bitSet;
        this.f = map;
        this.g = new a<Integer, List<Long>>();
        if (map2 != null) {
            for (Object object3 : map2.keySet()) {
                cloneable = new ArrayList();
                cloneable.add((Long)map2.get(object3));
                this.g.put((Integer)object3, (List<Long>)((Object)cloneable));
            }
        }
        this.b = false;
        this.c = g22;
    }

    /* synthetic */ K5(J5 j52, String string, g2 g22, BitSet bitSet, BitSet bitSet2, Map map, Map map2, E e8) {
        this(j52, string, g22, bitSet, bitSet2, map, map2);
    }

    /* synthetic */ K5(J5 j52, String string, E e8) {
        this(j52, string);
    }

    static /* bridge */ /* synthetic */ BitSet b(K5 k52) {
        return k52.d;
    }

    final X1 a(int n8) {
        Iterator<Integer> iterator;
        ArrayList<k4> arrayList;
        X1.a a8 = X1.O();
        a8.w(n8);
        a8.z(this.b);
        Object object = this.c;
        if (object != null) {
            a8.y((g2)object);
        }
        g2.a a9 = g2.Y().z(x5.O(this.d)).E(x5.O(this.e));
        if (this.f == null) {
            object = null;
        } else {
            arrayList = new ArrayList<k4>(this.f.size());
            iterator = this.f.keySet().iterator();
            while (true) {
                object = arrayList;
                if (!iterator.hasNext()) break;
                object = iterator.next();
                n8 = (Integer)object;
                if ((object = this.f.get(object)) == null) continue;
                arrayList.add((Y1)((k4)Y1.N().w(n8).x((Long)object).q()));
            }
        }
        if (object != null) {
            a9.x((Iterable<? extends Y1>)object);
        }
        if (this.g == null) {
            object = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(this.g.size());
            iterator = this.g.keySet().iterator();
            while (true) {
                object = arrayList;
                if (!iterator.hasNext()) break;
                Object object2 = iterator.next();
                object = h2.O().w((Integer)object2);
                if ((object2 = this.g.get(object2)) != null) {
                    Collections.sort(object2);
                    ((h2.a)object).x((Iterable<? extends Long>)object2);
                }
                arrayList.add((h2)((k4)((k4.b)object).q()));
            }
        }
        a9.C((Iterable<? extends h2>)object);
        a8.x(a9);
        return (X1)((k4)a8.q());
    }

    final void c(M5 m52) {
        long l8;
        int n8 = m52.a();
        Serializable serializable = m52.c;
        if (serializable != null) {
            this.e.set(n8, (Boolean)serializable);
        }
        if ((serializable = m52.d) != null) {
            this.d.set(n8, (Boolean)serializable);
        }
        if (m52.e != null) {
            serializable = this.f.get(n8);
            l8 = m52.e / 1000L;
            if (serializable == null || l8 > (Long)serializable) {
                this.f.put(n8, l8);
            }
        }
        if (m52.f != null) {
            List<Long> list = this.g.get(n8);
            serializable = list;
            if (list == null) {
                serializable = new ArrayList<Long>();
                this.g.put(n8, (List<Long>)((Object)serializable));
            }
            if (m52.j()) {
                serializable.clear();
            }
            if (F6.a() && this.h.d().G(this.a, F.l0) && m52.i()) {
                serializable.clear();
            }
            if (F6.a() && this.h.d().G(this.a, F.l0)) {
                l8 = m52.f / 1000L;
                if (!serializable.contains(l8)) {
                    serializable.add(l8);
                    return;
                }
            } else {
                serializable.add(m52.f / 1000L);
            }
        }
    }
}

