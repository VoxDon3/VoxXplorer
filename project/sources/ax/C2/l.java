package ax.C2;

import ax.l2.AbstractC2464b;

/* loaded from: classes.dex */
public final class l extends AbstractC2464b {
    public static final l c = new l();

    private l() {
        super(6, 7);
    }

    @Override // ax.l2.AbstractC2464b
    public void a(ax.o2.g gVar) {
        ax.Gb.l.f(gVar, "db");
        gVar.C("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
