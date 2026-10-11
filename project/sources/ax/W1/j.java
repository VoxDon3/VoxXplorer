package ax.W1;

import ax.N1.k;
import ax.S0.C0968a;
import ax.S0.d0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
final class j implements k {
    private final long[] c0;
    private final long[] d0;
    private final List<d> q;

    public j(List<d> list) {
        this.q = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.c0 = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            d dVar = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.c0;
            jArr[i2] = dVar.b;
            jArr[i2 + 1] = dVar.c;
        }
        long[] jArr2 = this.c0;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d0 = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // ax.N1.k
    public int d(long j) {
        int d = d0.d(this.d0, j, false, false);
        if (d < this.d0.length) {
            return d;
        }
        return -1;
    }

    @Override // ax.N1.k
    public long h(int i) {
        C0968a.a(i >= 0);
        C0968a.a(i < this.d0.length);
        return this.d0[i];
    }

    @Override // ax.N1.k
    public List<ax.R0.a> j(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.q.size(); i++) {
            long[] jArr = this.c0;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                d dVar = this.q.get(i);
                ax.R0.a aVar = dVar.a;
                if (aVar.e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(aVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: ax.W1.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compare;
                compare = Long.compare(((d) obj).b, ((d) obj2).b);
                return compare;
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((d) arrayList2.get(i3)).a.a().h((-1) - i3, 1).a());
        }
        return arrayList;
    }

    @Override // ax.N1.k
    public int l() {
        return this.d0.length;
    }
}
