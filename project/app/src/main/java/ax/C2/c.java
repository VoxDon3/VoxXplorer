/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import ax.C2.z;
import ax.Gb.l;
import ax.k2.u;
import ax.o2.g;

public final class c
extends u.b {
    public static final c a = new c();

    private c() {
    }

    private final String e() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
        stringBuilder.append(this.d());
        stringBuilder.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
        return stringBuilder.toString();
    }

    @Override
    public void c(g g8) {
        l.f(g8, "db");
        super.c(g8);
        g8.r();
        try {
            g8.C(this.e());
            g8.Y();
            return;
        }
        finally {
            g8.j0();
        }
    }

    public final long d() {
        return System.currentTimeMillis() - z.a();
    }
}

