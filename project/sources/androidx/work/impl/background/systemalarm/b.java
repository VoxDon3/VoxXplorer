package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.e;
import ax.B2.i;
import ax.C2.InterfaceC0656e;
import ax.C2.w;
import ax.K2.m;
import ax.K2.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class b implements InterfaceC0656e {
    private static final String e = i.i("CommandHandler");
    private final Context a;
    private final Map<m, d> b = new HashMap();
    private final Object c = new Object();
    private final w d;

    b(Context context, w wVar) {
        this.a = context;
        this.d = wVar;
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent b(Context context, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return s(intent, mVar);
    }

    static Intent c(Context context, m mVar, boolean z) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return s(intent, mVar);
    }

    static Intent d(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    static Intent f(Context context, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return s(intent, mVar);
    }

    static Intent g(Context context, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return s(intent, mVar);
    }

    static Intent h(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    private void i(Intent intent, int i, e eVar) {
        i.e().a(e, "Handling constraints changed " + intent);
        new c(this.a, i, eVar).a();
    }

    private void j(Intent intent, int i, e eVar) {
        synchronized (this.c) {
            try {
                m r = r(intent);
                i e2 = i.e();
                String str = e;
                e2.a(str, "Handing delay met for " + r);
                if (this.b.containsKey(r)) {
                    i.e().a(str, "WorkSpec " + r + " is is already being handled for ACTION_DELAY_MET");
                } else {
                    d dVar = new d(this.a, i, eVar, this.d.d(r));
                    this.b.put(r, dVar);
                    dVar.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void k(Intent intent, int i) {
        m r = r(intent);
        boolean z = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        i.e().a(e, "Handling onExecutionCompleted " + intent + ", " + i);
        e(r, z);
    }

    private void l(Intent intent, int i, e eVar) {
        i.e().a(e, "Handling reschedule " + intent + ", " + i);
        eVar.g().s();
    }

    private void m(Intent intent, int i, e eVar) {
        m r = r(intent);
        i e2 = i.e();
        String str = e;
        e2.a(str, "Handling schedule work for " + r);
        WorkDatabase o = eVar.g().o();
        o.e();
        try {
            v n = o.I().n(r.b());
            if (n == null) {
                i.e().k(str, "Skipping scheduling " + r + " because it's no longer in the DB");
                return;
            }
            if (n.b.h()) {
                i.e().k(str, "Skipping scheduling " + r + "because it is finished.");
                return;
            }
            long a = n.a();
            if (n.f()) {
                i.e().a(str, "Opportunistically setting an alarm for " + r + "at " + a);
                a.c(this.a, o, r, a);
                eVar.f().a().execute(new e.b(eVar, a(this.a), i));
            } else {
                i.e().a(str, "Setting up Alarms for " + r + "at " + a);
                a.c(this.a, o, r, a);
            }
            o.A();
        } finally {
            o.i();
        }
    }

    private void n(Intent intent, e eVar) {
        List<ax.C2.v> c;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i = extras.getInt("KEY_WORKSPEC_GENERATION");
            c = new ArrayList<>(1);
            ax.C2.v b = this.d.b(new m(string, i));
            if (b != null) {
                c.add(b);
            }
        } else {
            c = this.d.c(string);
        }
        for (ax.C2.v vVar : c) {
            i.e().a(e, "Handing stopWork work for " + string);
            eVar.g().x(vVar);
            a.a(this.a, eVar.g().o(), vVar.a());
            eVar.e(vVar.a(), false);
        }
    }

    private static boolean o(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    static m r(Intent intent) {
        return new m(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    private static Intent s(Intent intent, m mVar) {
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_WORKSPEC_GENERATION", mVar.a());
        return intent;
    }

    @Override // ax.C2.InterfaceC0656e
    public void e(m mVar, boolean z) {
        synchronized (this.c) {
            try {
                d remove = this.b.remove(mVar);
                this.d.b(mVar);
                if (remove != null) {
                    remove.h(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean p() {
        boolean z;
        synchronized (this.c) {
            z = !this.b.isEmpty();
        }
        return z;
    }

    void q(Intent intent, int i, e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            i(intent, i, eVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            l(intent, i, eVar);
            return;
        }
        if (!o(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            i.e().c(e, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            m(intent, i, eVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            j(intent, i, eVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            n(intent, eVar);
            return;
        }
        if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            k(intent, i);
            return;
        }
        i.e().k(e, "Ignoring intent " + intent);
    }
}
