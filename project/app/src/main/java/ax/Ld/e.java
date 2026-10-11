/*
 * Decompiled with CFR 0.152.
 */
package ax.Ld;

public class e
extends Exception {
    private Throwable q;

    public e(String string, Throwable throwable) {
        super(string);
        this.q = throwable;
    }

    @Override
    public Throwable getCause() {
        return this.q;
    }
}

