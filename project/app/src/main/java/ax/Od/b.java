/*
 * Decompiled with CFR 0.152.
 */
package ax.Od;

public class b
extends IllegalStateException {
    private Throwable q;

    b(String string, Throwable throwable) {
        super(string);
        this.q = throwable;
    }

    @Override
    public Throwable getCause() {
        return this.q;
    }
}

