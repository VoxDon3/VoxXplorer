/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.q1.h;
import ax.u7.f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public final class i {
    private final Map<Long, h> a = new LinkedHashMap<Long, h>();

    public void a(h h8) {
        long[] lArray = h8.e;
        if (lArray.length > 0 && !this.a.containsKey(lArray[0])) {
            this.a.put(h8.e[0], h8);
        }
    }

    public h b() {
        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        ArrayList<long[]> arrayList2 = new ArrayList<long[]>();
        ArrayList<long[]> arrayList3 = new ArrayList<long[]>();
        ArrayList<long[]> arrayList4 = new ArrayList<long[]>();
        for (h h8 : this.a.values()) {
            arrayList.add(h8.b);
            arrayList2.add(h8.c);
            arrayList3.add(h8.d);
            arrayList4.add(h8.e);
        }
        return new h(f.f((int[][])arrayList.toArray((T[])new int[arrayList.size()][])), ax.u7.h.e((long[][])arrayList2.toArray((T[])new long[arrayList2.size()][])), ax.u7.h.e((long[][])arrayList3.toArray((T[])new long[arrayList3.size()][])), ax.u7.h.e((long[][])arrayList4.toArray((T[])new long[arrayList4.size()][])));
    }

    public int c() {
        return this.a.size();
    }
}

