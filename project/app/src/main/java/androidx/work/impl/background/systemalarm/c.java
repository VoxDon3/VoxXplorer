/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.background.systemalarm.b;
import androidx.work.impl.background.systemalarm.e;
import ax.B2.i;
import ax.K2.v;
import ax.K2.y;
import java.util.ArrayList;

class c {
    private static final String e = i.i("ConstraintsCmdHandler");
    private final Context a;
    private final int b;
    private final e c;
    private final ax.G2.e d;

    c(Context context, int n8, e e8) {
        this.a = context;
        this.b = n8;
        this.c = e8;
        this.d = new ax.G2.e(e8.g().n(), null);
    }

    void a() {
        Object object;
        Object object2 = this.c.g().o().I().f();
        ConstraintProxy.a(this.a, object2);
        this.d.b((Iterable<v>)object2);
        ArrayList<v> arrayList = new ArrayList<v>(object2.size());
        long l8 = System.currentTimeMillis();
        Object object3 = object2.iterator();
        while (object3.hasNext()) {
            object = object3.next();
            object2 = ((v)object).a;
            if (l8 < ((v)object).a() || ((v)object).f() && !this.d.e((String)object2)) continue;
            arrayList.add((v)object);
        }
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            object2 = arrayList.get(i8);
            object3 = (v)object2;
            object2 = ((v)object3).a;
            object3 = androidx.work.impl.background.systemalarm.b.b(this.a, y.a((v)object3));
            i i9 = i.e();
            object = e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Creating a delay_met command for workSpec with id (");
            stringBuilder.append((String)object2);
            stringBuilder.append(")");
            i9.a((String)object, stringBuilder.toString());
            this.c.f().a().execute(new e.b(this.c, (Intent)object3, this.b));
        }
        this.d.a();
    }
}

