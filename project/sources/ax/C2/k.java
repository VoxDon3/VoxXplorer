package ax.C2;

import ax.l2.AbstractC2464b;

/* loaded from: classes.dex */
public final class k extends AbstractC2464b {
    public static final k c = new k();

    private k() {
        super(4, 5);
    }

    @Override // ax.l2.AbstractC2464b
    public void a(ax.o2.g gVar) {
        ax.Gb.l.f(gVar, "db");
        gVar.C("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        gVar.C("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
