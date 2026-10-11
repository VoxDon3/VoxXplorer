package ax.C2;

import ax.l2.AbstractC2464b;

/* loaded from: classes.dex */
public final class m extends AbstractC2464b {
    public static final m c = new m();

    private m() {
        super(7, 8);
    }

    @Override // ax.l2.AbstractC2464b
    public void a(ax.o2.g gVar) {
        ax.Gb.l.f(gVar, "db");
        gVar.C("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
