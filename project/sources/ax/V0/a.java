package ax.V0;

/* loaded from: classes.dex */
public abstract class a {
    private int q;

    public final void A(int i) {
        this.q = i;
    }

    public final void n(int i) {
        this.q = i | this.q;
    }

    public void p() {
        this.q = 0;
    }

    protected final boolean q(int i) {
        return (this.q & i) == i;
    }

    public final boolean r() {
        return q(268435456);
    }

    public final boolean s() {
        return q(4);
    }

    public final boolean t() {
        return q(134217728);
    }

    public final boolean u() {
        return q(1);
    }

    public final boolean w() {
        return q(536870912);
    }

    public final boolean x() {
        return q(67108864);
    }
}
