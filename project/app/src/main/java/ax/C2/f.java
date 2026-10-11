/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import ax.Gb.l;
import ax.l2.b;
import ax.o2.g;

public final class f
extends b {
    public static final f c = new f();

    private f() {
        super(11, 12);
    }

    @Override
    public void a(g g8) {
        l.f(g8, "db");
        g8.C("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}

