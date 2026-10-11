package ax.Qb;

/* loaded from: classes3.dex */
public abstract class D0 extends G {
    public abstract D0 Z0();

    protected final String a1() {
        D0 d0;
        D0 c = Y.c();
        if (this == c) {
            return "Dispatchers.Main";
        }
        try {
            d0 = c.Z0();
        } catch (UnsupportedOperationException unused) {
            d0 = null;
        }
        if (this == d0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // ax.Qb.G
    public String toString() {
        String a1 = a1();
        if (a1 != null) {
            return a1;
        }
        return N.a(this) + '@' + N.b(this);
    }
}
