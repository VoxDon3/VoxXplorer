package ax.i2;

import ax.b0.C1446g;

/* loaded from: classes.dex */
public abstract class p<K> {
    private final int a;

    protected p(int i) {
        boolean z = true;
        if (i != 0 && i != 1) {
            z = false;
        }
        C1446g.a(z);
        this.a = i;
    }

    public abstract K a(int i);

    public abstract int b(K k);

    final boolean c(int i) {
        return i == this.a;
    }
}
