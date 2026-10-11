/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.b;
import androidx.work.impl.background.systemalarm.e;
import ax.B2.i;
import ax.C2.v;
import ax.E2.a;
import ax.G2.c;
import ax.I2.o;
import ax.K2.m;
import ax.L2.E;
import ax.L2.y;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

public class d
implements c,
E.a {
    private static final String m = ax.B2.i.i("DelayMetCommandHandler");
    private final Context a;
    private final int b;
    private final m c;
    private final e d;
    private final ax.G2.e e;
    private final Object f;
    private int g;
    private final Executor h;
    private final Executor i;
    private PowerManager.WakeLock j;
    private boolean k;
    private final v l;

    d(Context object, int n8, e e8, v v8) {
        this.a = object;
        this.b = n8;
        this.d = e8;
        this.c = v8.a();
        this.l = v8;
        object = e8.g().n();
        this.h = e8.f().b();
        this.i = e8.f().a();
        this.e = new ax.G2.e((o)object, this);
        this.k = false;
        this.g = 0;
        this.f = new Object();
    }

    public static /* synthetic */ void c(d d8) {
        d8.j();
    }

    public static /* synthetic */ void d(d d8) {
        d8.i();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void e() {
        Object object = this.f;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        this.e.a();
                        this.d.h().b(this.c);
                        Object object2 = this.j;
                        if (object2 == null || !object2.isHeld()) break block3;
                        i i8 = ax.B2.i.e();
                        String string = m;
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Releasing wakelock ");
                        ((StringBuilder)object2).append(this.j);
                        ((StringBuilder)object2).append("for WorkSpec ");
                        ((StringBuilder)object2).append(this.c);
                        i8.a(string, ((StringBuilder)object2).toString());
                        this.j.release();
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

    private void i() {
        if (this.g == 0) {
            this.g = 1;
            i i8 = ax.B2.i.e();
            String string = m;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onAllConstraintsMet for ");
            stringBuilder.append(this.c);
            i8.a(string, stringBuilder.toString());
            if (this.d.d().n(this.l)) {
                this.d.h().a(this.c, 600000L, this);
                return;
            }
            this.e();
            return;
        }
        i i9 = ax.B2.i.e();
        String string = m;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Already started work for ");
        stringBuilder.append(this.c);
        i9.a(string, stringBuilder.toString());
    }

    private void j() {
        String string = this.c.b();
        if (this.g < 2) {
            this.g = 2;
            Object object = ax.B2.i.e();
            String string2 = m;
            Object object2 = new StringBuilder();
            ((StringBuilder)object2).append("Stopping work for WorkSpec ");
            ((StringBuilder)object2).append(string);
            ((i)object).a(string2, ((StringBuilder)object2).toString());
            object = androidx.work.impl.background.systemalarm.b.g(this.a, this.c);
            this.i.execute(new e.b(this.d, (Intent)object, this.b));
            if (this.d.d().k(this.c.b())) {
                object2 = ax.B2.i.e();
                object = new StringBuilder();
                ((StringBuilder)object).append("WorkSpec ");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(" needs to be rescheduled");
                ((i)object2).a(string2, ((StringBuilder)object).toString());
                string = androidx.work.impl.background.systemalarm.b.f(this.a, this.c);
                this.i.execute(new e.b(this.d, (Intent)string, this.b));
                return;
            }
            object = ax.B2.i.e();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Processor does not have WorkSpec ");
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append(". No need to reschedule");
            ((i)object).a(string2, ((StringBuilder)object2).toString());
            return;
        }
        i i8 = ax.B2.i.e();
        String string3 = m;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Already stopped work for ");
        stringBuilder.append(string);
        i8.a(string3, stringBuilder.toString());
    }

    @Override
    public void a(m m8) {
        i i8 = ax.B2.i.e();
        String string = m;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Exceeded time limits on execution for ");
        stringBuilder.append(m8);
        i8.a(string, stringBuilder.toString());
        this.h.execute(new a(this));
    }

    @Override
    public void b(List<ax.K2.v> list) {
        this.h.execute(new a(this));
    }

    @Override
    public void f(List<ax.K2.v> object) {
        object = object.iterator();
        while (object.hasNext()) {
            if (!ax.K2.y.a((ax.K2.v)object.next()).equals(this.c)) continue;
            this.h.execute(new ax.E2.b(this));
            break;
        }
    }

    void g() {
        boolean bl;
        String string = this.c.b();
        Object object = this.a;
        CharSequence charSequence = new StringBuilder();
        charSequence.append(string);
        charSequence.append(" (");
        charSequence.append(this.b);
        charSequence.append(")");
        this.j = y.b((Context)object, charSequence.toString());
        Object object2 = ax.B2.i.e();
        charSequence = m;
        object = new StringBuilder();
        ((StringBuilder)object).append("Acquiring wakelock ");
        ((StringBuilder)object).append(this.j);
        ((StringBuilder)object).append("for WorkSpec ");
        ((StringBuilder)object).append(string);
        ((i)object2).a((String)charSequence, ((StringBuilder)object).toString());
        this.j.acquire();
        ax.K2.v v8 = this.d.g().o().I().n(string);
        if (v8 == null) {
            this.h.execute(new a(this));
            return;
        }
        this.k = bl = v8.f();
        if (!bl) {
            object = ax.B2.i.e();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("No constraints for ");
            ((StringBuilder)object2).append(string);
            ((i)object).a((String)charSequence, ((StringBuilder)object2).toString());
            this.f(Collections.singletonList(v8));
            return;
        }
        this.e.b(Collections.singletonList(v8));
    }

    void h(boolean bl) {
        i i8 = ax.B2.i.e();
        String string = m;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onExecuted ");
        stringBuilder.append(this.c);
        stringBuilder.append(", ");
        stringBuilder.append(bl);
        i8.a(string, stringBuilder.toString());
        this.e();
        if (bl) {
            string = androidx.work.impl.background.systemalarm.b.f(this.a, this.c);
            this.i.execute(new e.b(this.d, (Intent)string, this.b));
        }
        if (this.k) {
            string = androidx.work.impl.background.systemalarm.b.a(this.a);
            this.i.execute(new e.b(this.d, (Intent)string, this.b));
        }
    }
}

