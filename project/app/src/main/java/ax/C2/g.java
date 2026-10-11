/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import ax.Gb.l;
import ax.l2.b;

public final class g
extends b {
    public static final g c = new g();

    private g() {
        super(12, 13);
    }

    @Override
    public void a(ax.o2.g g8) {
        l.f(g8, "db");
        g8.C("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        g8.C("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}

