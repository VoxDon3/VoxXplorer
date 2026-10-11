/*
 * Decompiled with CFR 0.152.
 */
package ax.vd;

public class e
extends Exception {
    private Throwable q;

    public e(String string) {
        super(string);
    }

    @Override
    public Throwable getCause() {
        return this.q;
    }
}

