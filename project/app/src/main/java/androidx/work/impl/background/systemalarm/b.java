/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemalarm.a;
import androidx.work.impl.background.systemalarm.c;
import androidx.work.impl.background.systemalarm.d;
import androidx.work.impl.background.systemalarm.e;
import ax.B2.i;
import ax.C2.v;
import ax.C2.w;
import ax.K2.m;
import ax.k2.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class b
implements ax.C2.e {
    private static final String e = i.i("CommandHandler");
    private final Context a;
    private final Map<m, d> b;
    private final Object c;
    private final w d;

    b(Context context, w w8) {
        this.a = context;
        this.d = w8;
        this.b = new HashMap<m, d>();
        this.c = new Object();
    }

    static Intent a(Context context) {
        context = new Intent(context, SystemAlarmService.class);
        context.setAction("ACTION_CONSTRAINTS_CHANGED");
        return context;
    }

    static Intent b(Context context, m m8) {
        context = new Intent(context, SystemAlarmService.class);
        context.setAction("ACTION_DELAY_MET");
        return androidx.work.impl.background.systemalarm.b.s((Intent)context, m8);
    }

    static Intent c(Context context, m m8, boolean bl) {
        context = new Intent(context, SystemAlarmService.class);
        context.setAction("ACTION_EXECUTION_COMPLETED");
        context.putExtra("KEY_NEEDS_RESCHEDULE", bl);
        return androidx.work.impl.background.systemalarm.b.s((Intent)context, m8);
    }

    static Intent d(Context context) {
        context = new Intent(context, SystemAlarmService.class);
        context.setAction("ACTION_RESCHEDULE");
        return context;
    }

    static Intent f(Context context, m m8) {
        context = new Intent(context, SystemAlarmService.class);
        context.setAction("ACTION_SCHEDULE_WORK");
        return androidx.work.impl.background.systemalarm.b.s((Intent)context, m8);
    }

    static Intent g(Context context, m m8) {
        context = new Intent(context, SystemAlarmService.class);
        context.setAction("ACTION_STOP_WORK");
        return androidx.work.impl.background.systemalarm.b.s((Intent)context, m8);
    }

    static Intent h(Context context, String string) {
        context = new Intent(context, SystemAlarmService.class);
        context.setAction("ACTION_STOP_WORK");
        context.putExtra("KEY_WORKSPEC_ID", string);
        return context;
    }

    private void i(Intent intent, int n8, e e8) {
        i i8 = i.e();
        String string = e;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Handling constraints changed ");
        stringBuilder.append(intent);
        i8.a(string, stringBuilder.toString());
        new c(this.a, n8, e8).a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void j(Intent object, int n8, e object2) {
        Object object3 = this.c;
        synchronized (object3) {
            Throwable throwable2;
            block5: {
                block4: {
                    Object object4;
                    Object object5;
                    block3: {
                        try {
                            object = androidx.work.impl.background.systemalarm.b.r(object);
                            object5 = i.e();
                            object4 = e;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Handing delay met for ");
                            stringBuilder.append(object);
                            ((i)object5).a((String)object4, stringBuilder.toString());
                            if (this.b.containsKey(object)) break block3;
                            object4 = new d(this.a, n8, (e)object2, this.d.d((m)object));
                            this.b.put((m)object, (d)object4);
                            ((d)object4).g();
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    object2 = i.e();
                    object5 = new StringBuilder();
                    ((StringBuilder)object5).append("WorkSpec ");
                    ((StringBuilder)object5).append(object);
                    ((StringBuilder)object5).append(" is is already being handled for ACTION_DELAY_MET");
                    ((i)object2).a((String)object4, ((StringBuilder)object5).toString());
                }
                return;
            }
            throw throwable2;
        }
    }

    private void k(Intent intent, int n8) {
        m m8 = androidx.work.impl.background.systemalarm.b.r(intent);
        boolean bl = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        i i8 = i.e();
        String string = e;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Handling onExecutionCompleted ");
        stringBuilder.append(intent);
        stringBuilder.append(", ");
        stringBuilder.append(n8);
        i8.a(string, stringBuilder.toString());
        this.e(m8, bl);
    }

    private void l(Intent intent, int n8, e e8) {
        i i8 = i.e();
        String string = e;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Handling reschedule ");
        stringBuilder.append(intent);
        stringBuilder.append(", ");
        stringBuilder.append(n8);
        i8.a(string, stringBuilder.toString());
        e8.g().s();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void m(Intent object, int n8, e object2) {
        Throwable throwable2;
        block8: {
            block7: {
                long l8;
                Object object3;
                Object object4;
                m m8;
                block6: {
                    m8 = androidx.work.impl.background.systemalarm.b.r((Intent)object);
                    object4 = i.e();
                    object3 = e;
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Handling schedule work for ");
                    ((StringBuilder)object).append(m8);
                    ((i)object4).a((String)object3, ((StringBuilder)object).toString());
                    object = ((e)object2).g().o();
                    ((u)object).e();
                    try {
                        object4 = ((WorkDatabase)object).I().n(m8.b());
                        if (object4 == null) {
                            object2 = i.e();
                            object4 = new StringBuilder();
                            ((StringBuilder)object4).append("Skipping scheduling ");
                            ((StringBuilder)object4).append(m8);
                            ((StringBuilder)object4).append(" because it's no longer in the DB");
                            ((i)object2).k((String)object3, ((StringBuilder)object4).toString());
                            ((u)object).i();
                            return;
                        }
                        if (((ax.K2.v)object4).b.h()) {
                            object4 = i.e();
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append("Skipping scheduling ");
                            ((StringBuilder)object2).append(m8);
                            ((StringBuilder)object2).append("because it is finished.");
                            ((i)object4).k((String)object3, ((StringBuilder)object2).toString());
                            ((u)object).i();
                            return;
                        }
                        l8 = ((ax.K2.v)object4).a();
                        boolean bl = ((ax.K2.v)object4).f();
                        if (bl) break block6;
                        object2 = i.e();
                        object4 = new StringBuilder();
                        ((StringBuilder)object4).append("Setting up Alarms for ");
                        ((StringBuilder)object4).append(m8);
                        ((StringBuilder)object4).append("at ");
                        ((StringBuilder)object4).append(l8);
                        ((i)object2).a((String)object3, ((StringBuilder)object4).toString());
                        androidx.work.impl.background.systemalarm.a.c(this.a, (WorkDatabase)object, m8, l8);
                        break block7;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                }
                object4 = i.e();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Opportunistically setting an alarm for ");
                stringBuilder.append(m8);
                stringBuilder.append("at ");
                stringBuilder.append(l8);
                ((i)object4).a((String)object3, stringBuilder.toString());
                androidx.work.impl.background.systemalarm.a.c(this.a, (WorkDatabase)object, m8, l8);
                m8 = androidx.work.impl.background.systemalarm.b.a(this.a);
                object4 = ((e)object2).f().a();
                object3 = new e.b((e)object2, (Intent)m8, n8);
                object4.execute((Runnable)object3);
            }
            ((u)object).A();
            ((u)object).i();
            return;
        }
        ((u)object).i();
        throw throwable2;
    }

    private void n(Intent object, e e8) {
        Object object2;
        Object object3;
        object = object.getExtras();
        String string = object.getString("KEY_WORKSPEC_ID");
        if (object.containsKey("KEY_WORKSPEC_GENERATION")) {
            int n8 = object.getInt("KEY_WORKSPEC_GENERATION");
            object3 = new ArrayList(1);
            object2 = this.d.b(new m(string, n8));
            object = object3;
            if (object2 != null) {
                object3.add(object2);
                object = object3;
            }
        } else {
            object = this.d.c(string);
        }
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = (v)iterator.next();
            i i8 = i.e();
            object3 = e;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Handing stopWork work for ");
            ((StringBuilder)object2).append(string);
            i8.a((String)object3, ((StringBuilder)object2).toString());
            e8.g().x((v)object);
            androidx.work.impl.background.systemalarm.a.a(this.a, e8.g().o(), ((v)object).a());
            e8.e(((v)object).a(), false);
        }
    }

    private static boolean o(Bundle bundle, String ... stringArray) {
        if (bundle != null && !bundle.isEmpty()) {
            int n8 = stringArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                if (bundle.get(stringArray[i8]) != null) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    static m r(Intent intent) {
        return new m(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    private static Intent s(Intent intent, m m8) {
        intent.putExtra("KEY_WORKSPEC_ID", m8.b());
        intent.putExtra("KEY_WORKSPEC_GENERATION", m8.a());
        return intent;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void e(m m8, boolean bl) {
        Object object = this.c;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        d d8 = this.b.remove(m8);
                        this.d.b(m8);
                        if (d8 == null) break block3;
                        d8.h(bl);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    boolean p() {
        Object object = this.c;
        synchronized (object) {
            boolean bl = this.b.isEmpty();
            return bl ^ true;
        }
    }

    void q(Intent object, int n8, e object2) {
        String string = object.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(string)) {
            this.i((Intent)object, n8, (e)object2);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(string)) {
            this.l((Intent)object, n8, (e)object2);
            return;
        }
        if (!androidx.work.impl.background.systemalarm.b.o(object.getExtras(), "KEY_WORKSPEC_ID")) {
            object = i.e();
            object2 = e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid request for ");
            stringBuilder.append(string);
            stringBuilder.append(" , requires ");
            stringBuilder.append("KEY_WORKSPEC_ID");
            stringBuilder.append(" .");
            ((i)object).c((String)object2, stringBuilder.toString());
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(string)) {
            this.m((Intent)object, n8, (e)object2);
            return;
        }
        if ("ACTION_DELAY_MET".equals(string)) {
            this.j((Intent)object, n8, (e)object2);
            return;
        }
        if ("ACTION_STOP_WORK".equals(string)) {
            this.n((Intent)object, (e)object2);
            return;
        }
        if ("ACTION_EXECUTION_COMPLETED".equals(string)) {
            this.k((Intent)object, n8);
            return;
        }
        i i8 = i.e();
        string = e;
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Ignoring intent ");
        ((StringBuilder)object2).append(object);
        i8.k(string, ((StringBuilder)object2).toString());
    }
}

