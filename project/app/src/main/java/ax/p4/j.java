/*
 * Decompiled with CFR 0.152.
 */
package ax.p4;

public class j
extends Exception {
    private final String q;

    public j(String string, String string2) {
        super(string2);
        this.q = string;
    }

    public j(String string, String string2, Throwable throwable) {
        super(string2, throwable);
        this.q = string;
    }

    public j(String string, Throwable throwable) {
        this(null, string, throwable);
    }
}

