/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.B;
import ax.r0.S;
import java.util.List;

public class n0
extends RuntimeException {
    private final List<String> q = null;

    public n0(S s8) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public B a() {
        return new B(this.getMessage());
    }
}

