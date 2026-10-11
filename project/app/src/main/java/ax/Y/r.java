/*
 * Decompiled with CFR 0.152.
 */
package ax.Y;

import ax.b0.b;

public class r
extends RuntimeException {
    public r() {
        this((String)null);
    }

    public r(String string) {
        super(b.e(string, "The operation has been canceled."));
    }
}

