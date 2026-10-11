/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.P0;
import ax.W5.j1;

public final class L1
extends RuntimeException {
    public L1(j1 j12) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final P0 a() {
        return new P0(this.getMessage());
    }
}

