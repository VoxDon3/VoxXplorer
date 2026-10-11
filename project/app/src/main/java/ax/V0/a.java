/*
 * Decompiled with CFR 0.152.
 */
package ax.V0;

public abstract class a {
    private int q;

    public final void A(int n8) {
        this.q = n8;
    }

    public final void n(int n8) {
        this.q = n8 | this.q;
    }

    public void p() {
        this.q = 0;
    }

    protected final boolean q(int n8) {
        return (this.q & n8) == n8;
    }

    public final boolean r() {
        return this.q(0x10000000);
    }

    public final boolean s() {
        return this.q(4);
    }

    public final boolean t() {
        return this.q(0x8000000);
    }

    public final boolean u() {
        return this.q(1);
    }

    public final boolean w() {
        return this.q(0x20000000);
    }

    public final boolean x() {
        return this.q(0x4000000);
    }
}

