package ax.C2;

import ax.l2.AbstractC2464b;

/* loaded from: classes.dex */
public final class i extends AbstractC2464b {
    public static final i c = new i();

    private i() {
        super(1, 2);
    }

    @Override // ax.l2.AbstractC2464b
    public void a(ax.o2.g gVar) {
        ax.Gb.l.f(gVar, "db");
        gVar.C("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        gVar.C("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        gVar.C("DROP TABLE IF EXISTS alarmInfo");
        gVar.C("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
