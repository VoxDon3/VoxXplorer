/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import ax.B2.i;
import ax.B2.o;
import ax.B2.s;
import ax.C2.C;
import ax.C2.r;
import ax.C2.t;
import ax.C2.u;
import ax.C2.v;
import ax.C2.x;
import ax.D2.b;
import ax.F2.l;
import ax.K2.m;
import ax.L2.w;
import ax.N2.c;
import ax.N2.d;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class D
extends s {
    private static final String k = ax.B2.i.i("WorkManagerImpl");
    private static D l = null;
    private static D m = null;
    private static final Object n = new Object();
    private Context a;
    private androidx.work.a b;
    private WorkDatabase c;
    private c d;
    private List<t> e;
    private r f;
    private ax.L2.s g;
    private boolean h;
    private BroadcastReceiver.PendingResult i;
    private final ax.I2.o j;

    public D(Context context, androidx.work.a a8, c c8) {
        this(context, a8, c8, context.getResources().getBoolean(o.a));
    }

    public D(Context context, androidx.work.a a8, c c8, WorkDatabase workDatabase) {
        Context context2 = context.getApplicationContext();
        ax.B2.i.h(new i.a(a8.j()));
        Object object = new ax.I2.o(context2, c8);
        this.j = object;
        object = this.f(context2, a8, (ax.I2.o)object);
        this.q(context, a8, c8, workDatabase, (List<t>)object, new r(context, a8, c8, workDatabase, (List<t>)object));
    }

    public D(Context context, androidx.work.a a8, c c8, boolean bl) {
        this(context, a8, c8, WorkDatabase.C(context.getApplicationContext(), c8.b(), bl));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d(Context object, androidx.work.a a8) {
        Object object2 = n;
        synchronized (object2) {
            Throwable throwable2;
            block6: {
                D d8;
                try {
                    d8 = l;
                    if (d8 != null && m != null) {
                        object = new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                        throw object;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                if (d8 == null) {
                    object = object.getApplicationContext();
                    if (m == null) {
                        d d9 = new d(a8.m());
                        m = d8 = new D((Context)object, a8, d9);
                    }
                    l = m;
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
    @Deprecated
    public static D i() {
        Object object = n;
        synchronized (object) {
            try {
                D d8 = l;
                if (d8 == null) return m;
                return d8;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static D j(Context object) {
        Object object2 = n;
        synchronized (object2) {
            try {
                D d8;
                D d9 = d8 = D.i();
                if (d8 != null) return d9;
                if (!((object = object.getApplicationContext()) instanceof a.c)) {
                    object = new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    throw object;
                }
                D.d(object, ((a.c)object).a());
                return D.j(object);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private void q(Context context, androidx.work.a a8, c c8, WorkDatabase workDatabase, List<t> list, r r8) {
        this.a = context = context.getApplicationContext();
        this.b = a8;
        this.d = c8;
        this.c = workDatabase;
        this.e = list;
        this.f = r8;
        this.g = new ax.L2.s(workDatabase);
        this.h = false;
        if (Build.VERSION.SDK_INT >= 24 && ax.C2.D$a.a(context)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.d.c(new ForceStopRunnable(context, this));
    }

    @Override
    public ax.B2.l b(List<? extends ax.B2.t> list) {
        if (!list.isEmpty()) {
            return new x(this, list).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public ax.B2.l e(UUID object) {
        object = ax.L2.b.b((UUID)object, this);
        this.d.c((Runnable)object);
        return ((ax.L2.b)object).d();
    }

    public List<t> f(Context context, androidx.work.a a8, ax.I2.o o8) {
        return Arrays.asList(u.a(context, this), new b(context, a8, o8, this));
    }

    public Context g() {
        return this.a;
    }

    public androidx.work.a h() {
        return this.b;
    }

    public ax.L2.s k() {
        return this.g;
    }

    public r l() {
        return this.f;
    }

    public List<t> m() {
        return this.e;
    }

    public ax.I2.o n() {
        return this.j;
    }

    public WorkDatabase o() {
        return this.c;
    }

    public c p() {
        return this.d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void r() {
        Object object = n;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        this.h = true;
                        BroadcastReceiver.PendingResult pendingResult = this.i;
                        if (pendingResult == null) break block3;
                        pendingResult.finish();
                        this.i = null;
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

    public void s() {
        if (Build.VERSION.SDK_INT >= 23) {
            ax.F2.l.b(this.g());
        }
        this.o().I().u();
        u.b(this.h(), this.o(), this.m());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void t(BroadcastReceiver.PendingResult pendingResult) {
        Object object = n;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        BroadcastReceiver.PendingResult pendingResult2 = this.i;
                        if (pendingResult2 == null) break block4;
                        pendingResult2.finish();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                this.i = pendingResult;
                if (this.h) {
                    pendingResult.finish();
                    this.i = null;
                }
                return;
            }
            throw throwable2;
        }
    }

    public void u(v v8) {
        this.v(v8, null);
    }

    public void v(v v8, WorkerParameters.a a8) {
        this.d.c(new ax.L2.v(this, v8, a8));
    }

    public void w(m m8) {
        this.d.c(new w(this, new v(m8), true));
    }

    public void x(v v8) {
        this.d.c(new w(this, v8, false));
    }

    static class a {
        static boolean a(Context context) {
            return C.a(context);
        }
    }
}

