/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import ax.Gb.l;
import ax.l2.b;
import ax.o2.g;

public final class k
extends b {
    public static final k c = new k();

    private k() {
        super(4, 5);
    }

    @Override
    public void a(g g8) {
        l.f(g8, "db");
        g8.C("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        g8.C("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}

