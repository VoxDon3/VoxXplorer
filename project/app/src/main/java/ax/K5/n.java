/*
 * Decompiled with CFR 0.152.
 */
package ax.K5;

import ax.J5.e;

public final class n
extends UnsupportedOperationException {
    private final e q;

    public n(e e8) {
        this.q = e8;
    }

    @Override
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.q));
    }
}

