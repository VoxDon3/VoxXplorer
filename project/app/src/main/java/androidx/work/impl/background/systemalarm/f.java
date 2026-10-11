/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.b;
import ax.B2.i;
import ax.C2.t;
import ax.K2.v;
import ax.K2.y;

public class f
implements t {
    private static final String b = i.i("SystemAlarmScheduler");
    private final Context a;

    public f(Context context) {
        this.a = context.getApplicationContext();
    }

    private void b(v v8) {
        i i8 = i.e();
        String string = b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Scheduling work with workSpecId ");
        stringBuilder.append(v8.a);
        i8.a(string, stringBuilder.toString());
        v8 = androidx.work.impl.background.systemalarm.b.f(this.a, y.a(v8));
        this.a.startService((Intent)v8);
    }

    @Override
    public void a(v ... vArray) {
        int n8 = vArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            this.b(vArray[i8]);
        }
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public void d(String string) {
        string = androidx.work.impl.background.systemalarm.b.h(this.a, string);
        this.a.startService((Intent)string);
    }
}

