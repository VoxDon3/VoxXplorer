package ax.c1;

import android.util.SparseArray;
import ax.S0.M;

/* loaded from: classes.dex */
public final class j {
    private final SparseArray<M> a = new SparseArray<>();

    public M a(int i) {
        M m = this.a.get(i);
        if (m != null) {
            return m;
        }
        M m2 = new M(9223372036854775806L);
        this.a.put(i, m2);
        return m2;
    }

    public void b() {
        this.a.clear();
    }
}
