/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import ax.B2.i;
import ax.C2.D;
import ax.C2.r;
import ax.C2.w;
import ax.K2.m;
import ax.L2.E;
import ax.L2.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class e
implements ax.C2.e {
    static final String k = ax.B2.i.i("SystemAlarmDispatcher");
    final Context a;
    final ax.N2.c b;
    private final E c;
    private final r d;
    private final D e;
    final androidx.work.impl.background.systemalarm.b f;
    final List<Intent> g;
    Intent h;
    private c i;
    private w j;

    e(Context context) {
        this(context, null, null);
    }

    e(Context context, r r8, D d8) {
        Context context2;
        this.a = context2 = context.getApplicationContext();
        this.j = new w();
        this.f = new androidx.work.impl.background.systemalarm.b(context2, this.j);
        if (d8 == null) {
            d8 = D.j(context);
        }
        this.e = d8;
        this.c = new E(d8.h().k());
        if (r8 == null) {
            r8 = d8.l();
        }
        this.d = r8;
        this.b = d8.p();
        r8.g(this);
        this.g = new ArrayList<Intent>();
        this.h = null;
    }

    private void b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean i(String string) {
        this.b();
        List<Intent> list = this.g;
        synchronized (list) {
            try {
                Iterator<Intent> iterator = this.g.iterator();
                do {
                    if (iterator.hasNext()) continue;
                    return false;
                } while (!string.equals(iterator.next().getAction()));
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private void k() {
        this.b();
        PowerManager.WakeLock wakeLock = y.b(this.a, "ProcessCommand");
        try {
            wakeLock.acquire();
            ax.N2.c c8 = this.e.p();
            Runnable runnable2 = new Runnable(this){
                final e q;
                {
                    this.q = e8;
                }

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                @Override
                public void run() {
                    Object object;
                    Object object2;
                    Object object3 = this.q.g;
                    synchronized (object3) {
                        object2 = this.q;
                        ((e)object2).h = ((e)object2).g.get(0);
                    }
                    object3 = this.q.h;
                    if (object3 == null) return;
                    object3 = object3.getAction();
                    int n8 = this.q.h.getIntExtra("KEY_START_ID", 0);
                    Object object4 = ax.B2.i.e();
                    CharSequence charSequence = k;
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Processing command ");
                    ((StringBuilder)object2).append(this.q.h);
                    ((StringBuilder)object2).append(", ");
                    ((StringBuilder)object2).append(n8);
                    ((i)object4).a((String)charSequence, ((StringBuilder)object2).toString());
                    object4 = this.q.a;
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append((String)object3);
                    ((StringBuilder)object2).append(" (");
                    ((StringBuilder)object2).append(n8);
                    ((StringBuilder)object2).append(")");
                    object2 = y.b((Context)object4, ((StringBuilder)object2).toString());
                    try {
                        object = ax.B2.i.e();
                        object4 = new StringBuilder();
                        ((StringBuilder)object4).append("Acquiring operation wake lock (");
                        ((StringBuilder)object4).append((String)object3);
                        ((StringBuilder)object4).append(") ");
                        ((StringBuilder)object4).append(object2);
                        ((i)object).a((String)charSequence, ((StringBuilder)object4).toString());
                        object2.acquire();
                        object4 = this.q;
                        ((e)object4).f.q(((e)object4).h, n8, (e)object4);
                    }
                    catch (Throwable throwable) {
                        try {
                            object4 = ax.B2.i.e();
                            charSequence = k;
                            ((i)object4).d((String)charSequence, "Unexpected error in onHandleIntent", throwable);
                        }
                        catch (Throwable throwable2) {
                            object4 = ax.B2.i.e();
                            String string = k;
                            charSequence = new StringBuilder();
                            ((StringBuilder)charSequence).append("Releasing operation wake lock (");
                            ((StringBuilder)charSequence).append((String)object3);
                            ((StringBuilder)charSequence).append(") ");
                            ((StringBuilder)charSequence).append(object2);
                            ((i)object4).a(string, ((StringBuilder)charSequence).toString());
                            object2.release();
                            this.q.b.a().execute(new d(this.q));
                            throw throwable2;
                        }
                        i i8 = ax.B2.i.e();
                        object4 = new StringBuilder();
                        ((StringBuilder)object4).append("Releasing operation wake lock (");
                        ((StringBuilder)object4).append((String)object3);
                        ((StringBuilder)object4).append(") ");
                        ((StringBuilder)object4).append(object2);
                        i8.a((String)charSequence, ((StringBuilder)object4).toString());
                        object2.release();
                        this.q.b.a().execute(new d(this.q));
                        return;
                    }
                    object4 = ax.B2.i.e();
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Releasing operation wake lock (");
                    ((StringBuilder)object).append((String)object3);
                    ((StringBuilder)object).append(") ");
                    ((StringBuilder)object).append(object2);
                    ((i)object4).a((String)charSequence, ((StringBuilder)object).toString());
                    object2.release();
                    this.q.b.a().execute(new d(this.q));
                }
            };
            c8.c(runnable2);
            return;
        }
        finally {
            wakeLock.release();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(Intent intent, int n8) {
        Object object = ax.B2.i.e();
        Object object2 = k;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Adding command ");
        stringBuilder.append(intent);
        stringBuilder.append(" (");
        stringBuilder.append(n8);
        stringBuilder.append(")");
        ((i)object).a((String)object2, stringBuilder.toString());
        this.b();
        object = intent.getAction();
        if (TextUtils.isEmpty((CharSequence)object)) {
            ax.B2.i.e().k((String)object2, "Unknown command. Ignoring");
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(object) && this.i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", n8);
        object2 = this.g;
        synchronized (object2) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        boolean bl = this.g.isEmpty();
                        this.g.add(intent);
                        if (!bl) break block5;
                        this.k();
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                return true;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void c() {
        Object object = ax.B2.i.e();
        Object object2 = k;
        ((i)object).a((String)object2, "Checking if commands are complete.");
        this.b();
        object = this.g;
        synchronized (object) {
            Throwable throwable2;
            block9: {
                Object object3;
                block8: {
                    try {
                        if (this.h == null) break block8;
                        object3 = ax.B2.i.e();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Removing command ");
                        stringBuilder.append(this.h);
                        ((i)object3).a((String)object2, stringBuilder.toString());
                        if (!this.g.remove(0).equals(this.h)) {
                            object2 = new IllegalStateException("Dequeue-d command is not the first.");
                            throw object2;
                        }
                        this.h = null;
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                }
                object3 = this.b.b();
                if (!this.f.p() && this.g.isEmpty() && !object3.u()) {
                    ax.B2.i.e().a((String)object2, "No more commands & intents.");
                    object2 = this.i;
                    if (object2 != null) {
                        object2.a();
                    }
                } else if (!this.g.isEmpty()) {
                    this.k();
                }
                return;
            }
            throw throwable2;
        }
    }

    r d() {
        return this.d;
    }

    @Override
    public void e(m m8, boolean bl) {
        this.b.a().execute(new b(this, androidx.work.impl.background.systemalarm.b.c(this.a, m8, bl), 0));
    }

    ax.N2.c f() {
        return this.b;
    }

    D g() {
        return this.e;
    }

    E h() {
        return this.c;
    }

    void j() {
        ax.B2.i.e().a(k, "Destroying SystemAlarmDispatcher");
        this.d.l(this);
        this.i = null;
    }

    void l(c c8) {
        if (this.i != null) {
            ax.B2.i.e().c(k, "A completion listener for SystemAlarmDispatcher already exists.");
            return;
        }
        this.i = c8;
    }

    static class b
    implements Runnable {
        private final Intent c0;
        private final int d0;
        private final e q;

        b(e e8, Intent intent, int n8) {
            this.q = e8;
            this.c0 = intent;
            this.d0 = n8;
        }

        @Override
        public void run() {
            this.q.a(this.c0, this.d0);
        }
    }

    static interface c {
        public void a();
    }

    static class d
    implements Runnable {
        private final e q;

        d(e e8) {
            this.q = e8;
        }

        @Override
        public void run() {
            this.q.c();
        }
    }
}

