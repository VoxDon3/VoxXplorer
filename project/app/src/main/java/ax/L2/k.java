/*
 * Decompiled with CFR 0.152.
 */
package ax.L2;

import androidx.work.impl.WorkDatabase;
import ax.L2.i;
import ax.L2.j;
import ax.L2.l;

public final class k {
    private final WorkDatabase a;

    public k(WorkDatabase workDatabase) {
        ax.Gb.l.f(workDatabase, "workDatabase");
        this.a = workDatabase;
    }

    public static /* synthetic */ Integer a(k k8, int n8, int n9) {
        return k.f(k8, n8, n9);
    }

    public static /* synthetic */ Integer b(k k8) {
        return k.d(k8);
    }

    private static final Integer d(k k8) {
        ax.Gb.l.f(k8, "this$0");
        return l.a(k8.a, "next_alarm_manager_id");
    }

    private static final Integer f(k k8, int n8, int n9) {
        ax.Gb.l.f(k8, "this$0");
        int n10 = l.a(k8.a, "next_job_scheduler_id");
        if (n8 <= n10 && n10 <= n9) {
            n8 = n10;
        } else {
            l.b(k8.a, "next_job_scheduler_id", n8 + 1);
        }
        return n8;
    }

    public final int c() {
        Object v8 = this.a.z(new i(this));
        ax.Gb.l.e(v8, "workDatabase.runInTransa\u2026ANAGER_ID_KEY)\n        })");
        return ((Number)v8).intValue();
    }

    public final int e(int n8, int n9) {
        Object v8 = this.a.z(new j(this, n8, n9));
        ax.Gb.l.e(v8, "workDatabase.runInTransa\u2026            id\n        })");
        return ((Number)v8).intValue();
    }
}

