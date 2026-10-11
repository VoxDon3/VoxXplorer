package ax.q1;

import ax.u7.C3218f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: ax.q1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2849i {
    private final Map<Long, C2848h> a = new LinkedHashMap();

    public void a(C2848h c2848h) {
        long[] jArr = c2848h.e;
        if (jArr.length <= 0 || this.a.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        this.a.put(Long.valueOf(c2848h.e[0]), c2848h);
    }

    public C2848h b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C2848h c2848h : this.a.values()) {
            arrayList.add(c2848h.b);
            arrayList2.add(c2848h.c);
            arrayList3.add(c2848h.d);
            arrayList4.add(c2848h.e);
        }
        return new C2848h(C3218f.f((int[][]) arrayList.toArray(new int[arrayList.size()][])), ax.u7.h.e((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), ax.u7.h.e((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), ax.u7.h.e((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public int c() {
        return this.a.size();
    }
}
