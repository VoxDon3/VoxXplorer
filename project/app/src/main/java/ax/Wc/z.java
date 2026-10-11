/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

public class z
extends IllegalStateException {
    private Throwable q;

    public z(String string) {
        super(string);
    }

    public z(String string, Throwable throwable) {
        super(string);
        this.q = throwable;
    }

    @Override
    public Throwable getCause() {
        return this.q;
    }
}

