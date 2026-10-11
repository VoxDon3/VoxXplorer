/*
 * Decompiled with CFR 0.152.
 */
package ax.Ld;

public class f
extends RuntimeException {
    private Throwable q;

    public f(String string, Throwable throwable) {
        super(string);
        this.q = throwable;
    }

    @Override
    public Throwable getCause() {
        return this.q;
    }
}

