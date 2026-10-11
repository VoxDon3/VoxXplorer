/*
 * Decompiled with CFR 0.152.
 */
package ax.M9;

import ax.M9.e;

public class d
extends RuntimeException {
    private final e q;

    public d(String string, Throwable throwable, e e8) {
        super(string, throwable);
        this.q = e8;
    }

    public boolean a(e e8) {
        return this.q == e8;
    }
}

