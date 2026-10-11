/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import ax.Gb.l;
import ax.l2.b;
import ax.o2.g;

public final class n
extends b {
    public static final n c = new n();

    private n() {
        super(8, 9);
    }

    @Override
    public void a(g g8) {
        l.f(g8, "db");
        g8.C("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}

