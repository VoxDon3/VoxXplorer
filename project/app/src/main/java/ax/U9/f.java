/*
 * Decompiled with CFR 0.152.
 */
package ax.U9;

public class f
extends RuntimeException {
    private final String c0;
    private final String q;

    public f(String string) {
        super(string);
        this.q = "";
        this.c0 = "";
    }

    public f(String string, String string2, String string3) {
        super(string2);
        if (string != null) {
            this.q = string;
            this.c0 = string3;
            return;
        }
        throw new AssertionError();
    }

    public f(String string, Throwable throwable) {
        super(string, throwable);
        this.q = "";
        this.c0 = "";
    }
}

