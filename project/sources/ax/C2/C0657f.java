package ax.C2;

import ax.l2.AbstractC2464b;

/* renamed from: ax.C2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0657f extends AbstractC2464b {
    public static final C0657f c = new C0657f();

    private C0657f() {
        super(11, 12);
    }

    @Override // ax.l2.AbstractC2464b
    public void a(ax.o2.g gVar) {
        ax.Gb.l.f(gVar, "db");
        gVar.C("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
