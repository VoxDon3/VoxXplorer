package ax.L2;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class k {
    private final WorkDatabase a;

    public k(WorkDatabase workDatabase) {
        ax.Gb.l.f(workDatabase, "workDatabase");
        this.a = workDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer d(k kVar) {
        int d;
        ax.Gb.l.f(kVar, "this$0");
        d = l.d(kVar.a, "next_alarm_manager_id");
        return Integer.valueOf(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer f(k kVar, int i, int i2) {
        int d;
        ax.Gb.l.f(kVar, "this$0");
        d = l.d(kVar.a, "next_job_scheduler_id");
        if (i > d || d > i2) {
            l.e(kVar.a, "next_job_scheduler_id", i + 1);
        } else {
            i = d;
        }
        return Integer.valueOf(i);
    }

    public final int c() {
        Object z = this.a.z(new Callable() { // from class: ax.L2.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer d;
                d = k.d(k.this);
                return d;
            }
        });
        ax.Gb.l.e(z, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) z).intValue();
    }

    public final int e(final int i, final int i2) {
        Object z = this.a.z(new Callable() { // from class: ax.L2.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer f;
                f = k.f(k.this, i, i2);
                return f;
            }
        });
        ax.Gb.l.e(z, "workDatabase.runInTransa…            id\n        })");
        return ((Number) z).intValue();
    }
}
