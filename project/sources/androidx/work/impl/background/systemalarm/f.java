package androidx.work.impl.background.systemalarm;

import android.content.Context;
import ax.B2.i;
import ax.C2.t;
import ax.K2.v;
import ax.K2.y;

/* loaded from: classes.dex */
public class f implements t {
    private static final String b = i.i("SystemAlarmScheduler");
    private final Context a;

    public f(Context context) {
        this.a = context.getApplicationContext();
    }

    private void b(v vVar) {
        i.e().a(b, "Scheduling work with workSpecId " + vVar.a);
        this.a.startService(b.f(this.a, y.a(vVar)));
    }

    @Override // ax.C2.t
    public void a(v... vVarArr) {
        for (v vVar : vVarArr) {
            b(vVar);
        }
    }

    @Override // ax.C2.t
    public boolean c() {
        return true;
    }

    @Override // ax.C2.t
    public void d(String str) {
        this.a.startService(b.h(this.a, str));
    }
}
