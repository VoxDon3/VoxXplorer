/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import ax.Gb.l;
import ax.l2.b;
import ax.o2.g;

public final class i
extends b {
    public static final i c = new i();

    private i() {
        super(1, 2);
    }

    @Override
    public void a(g g8) {
        l.f(g8, "db");
        g8.C("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        g8.C("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        g8.C("DROP TABLE IF EXISTS alarmInfo");
        g8.C("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}

