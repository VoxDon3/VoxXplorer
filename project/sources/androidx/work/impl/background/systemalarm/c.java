package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.e;
import ax.B2.i;
import ax.K2.v;
import ax.K2.y;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class c {
    private static final String e = i.i("ConstraintsCmdHandler");
    private final Context a;
    private final int b;
    private final e c;
    private final ax.G2.e d;

    c(Context context, int i, e eVar) {
        this.a = context;
        this.b = i;
        this.c = eVar;
        this.d = new ax.G2.e(eVar.g().n(), (ax.G2.c) null);
    }

    void a() {
        List<v> f = this.c.g().o().I().f();
        ConstraintProxy.a(this.a, f);
        this.d.b(f);
        ArrayList arrayList = new ArrayList(f.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (v vVar : f) {
            String str = vVar.a;
            if (currentTimeMillis >= vVar.a() && (!vVar.f() || this.d.e(str))) {
                arrayList.add(vVar);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            v vVar2 = (v) obj;
            String str2 = vVar2.a;
            Intent b = b.b(this.a, y.a(vVar2));
            i.e().a(e, "Creating a delay_met command for workSpec with id (" + str2 + ")");
            this.c.f().a().execute(new e.b(this.c, b, this.b));
        }
        this.d.a();
    }
}
