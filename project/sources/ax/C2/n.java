package ax.C2;

import ax.l2.AbstractC2464b;

/* loaded from: classes.dex */
public final class n extends AbstractC2464b {
    public static final n c = new n();

    private n() {
        super(8, 9);
    }

    @Override // ax.l2.AbstractC2464b
    public void a(ax.o2.g gVar) {
        ax.Gb.l.f(gVar, "db");
        gVar.C("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
