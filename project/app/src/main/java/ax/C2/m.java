/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import ax.Gb.l;
import ax.l2.b;
import ax.o2.g;

public final class m
extends b {
    public static final m c = new m();

    private m() {
        super(7, 8);
    }

    @Override
    public void a(g g8) {
        l.f(g8, "db");
        g8.C("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}

