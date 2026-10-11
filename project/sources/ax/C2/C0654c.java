package ax.C2;

import ax.k2.AbstractC2390u;

/* renamed from: ax.C2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0654c extends AbstractC2390u.b {
    public static final C0654c a = new C0654c();

    private C0654c() {
    }

    private final String e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    @Override // ax.k2.AbstractC2390u.b
    public void c(ax.o2.g gVar) {
        ax.Gb.l.f(gVar, "db");
        super.c(gVar);
        gVar.r();
        try {
            gVar.C(e());
            gVar.Y();
        } finally {
            gVar.j0();
        }
    }

    public final long d() {
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        j = z.a;
        return currentTimeMillis - j;
    }
}
