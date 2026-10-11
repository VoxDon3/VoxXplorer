/*
 * Decompiled with CFR 0.152.
 */
package ax.W1;

import ax.N1.k;
import ax.S0.a;
import ax.S0.d0;
import ax.W1.d;
import ax.W1.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class j
implements k {
    private final long[] c0;
    private final long[] d0;
    private final List<d> q;

    public j(List<d> object) {
        this.q = java.util.DesugarCollections.unmodifiableList(new ArrayList<d>((Collection<d>)object));
        this.c0 = new long[object.size() * 2];
        for (int i8 = 0; i8 < object.size(); ++i8) {
            d d8 = object.get(i8);
            int n8 = i8 * 2;
            long[] lArray = this.c0;
            lArray[n8] = d8.b;
            lArray[n8 + 1] = d8.c;
        }
        object = this.c0;
        object = Arrays.copyOf((long[])object, ((Object)object).length);
        this.d0 = (long[])object;
        Arrays.sort((long[])object);
    }

    public static /* synthetic */ int a(d d8, d d9) {
        return Long.compare(d8.b, d9.b);
    }

    @Override
    public int d(long l8) {
        int n8 = ax.S0.d0.d(this.d0, l8, false, false);
        if (n8 < this.d0.length) {
            return n8;
        }
        return -1;
    }

    @Override
    public long h(int n8) {
        boolean bl = false;
        boolean bl2 = n8 >= 0;
        a.a(bl2);
        bl2 = bl;
        if (n8 < this.d0.length) {
            bl2 = true;
        }
        a.a(bl2);
        return this.d0[n8];
    }

    @Override
    public List<ax.R0.a> j(long l8) {
        int n8;
        ArrayList<ax.R0.a> arrayList = new ArrayList<ax.R0.a>();
        ArrayList<long[]> arrayList2 = new ArrayList<long[]>();
        int n9 = 0;
        for (n8 = 0; n8 < this.q.size(); ++n8) {
            Object object = this.c0;
            int n10 = n8 * 2;
            if (object[n10] > l8 || l8 >= object[n10 + 1]) continue;
            object = this.q.get(n8);
            ax.R0.a a8 = object.a;
            if (a8.e == -3.4028235E38f) {
                arrayList2.add((long[])object);
                continue;
            }
            arrayList.add(a8);
        }
        Collections.sort(arrayList2, new i());
        for (n8 = n9; n8 < arrayList2.size(); ++n8) {
            arrayList.add(((d)arrayList2.get((int)n8)).a.a().h(-1 - n8, 1).a());
        }
        return arrayList;
    }

    @Override
    public int l() {
        return this.d0.length;
    }
}

