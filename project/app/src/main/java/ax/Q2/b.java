/*
 * Decompiled with CFR 0.152.
 */
package ax.Q2;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import ax.J5.h;
import ax.Q2.a;
import ax.Q2.g;
import ax.Z2.j;
import ax.c3.u;
import ax.t3.k;
import ax.u3.q;
import ax.u3.s;
import ax.x7.f;
import com.alphainventor.filemanager.ApplicationReporter;
import com.alphainventor.filemanager.provider.MyFileProvider;
import com.alphainventor.filemanager.receiver.StorageCheckReceiver;
import com.alphainventor.filemanager.shizuku.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class b {
    static boolean e = false;
    static b f;
    static final Object g;
    private Context a;
    private final AtomicInteger b = new AtomicInteger(0);
    private List<ax.g3.g> c = new ArrayList<ax.g3.g>();
    private boolean d;

    static {
        g = new Object();
    }

    public b(Context context) {
        this.a = context.getApplicationContext();
    }

    public static void f(Context object, boolean bl) {
        if (!ax.Q2.b.n()) {
            ApplicationReporter.init(object);
            if (object != null) {
                Object object2 = object.getApplicationContext();
                boolean bl2 = object2 != null;
                if (bl2) {
                    object = object2.getClass().getSimpleName();
                    ax.Q2.b.k((Context)object2);
                    ax.Q2.b.o();
                } else {
                    object = "none";
                }
                if (bl) {
                    object2 = ax.Ha.c.h().f().d("!!Application onCreate was not called");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("getApplicationContext:");
                    stringBuilder.append(bl2);
                    stringBuilder.append(", className:");
                    stringBuilder.append((String)object);
                    ((ax.Ha.b)object2).g(stringBuilder.toString()).j().h();
                    return;
                }
            } else {
                ax.Ha.c.h().f().b("!Check application null context").j().h();
            }
        }
    }

    public static b h() {
        if (f == null) {
            ApplicationReporter.init(null);
            ax.Ha.c.h().b("ApplicationHolder not initialized").j().h();
        }
        return f;
    }

    public static boolean i() {
        return e;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void j(Context context) {
        try {
            boolean bl = h.o().g(context) == 0;
            this.d = bl;
            if (!bl) return;
            ax.x7.f.q(context);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void k(Context context) {
        Object object = g;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        b b8;
                        if (f != null) break block3;
                        ApplicationReporter.init(context);
                        f = b8 = new b(context);
                        b8.l();
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

    private void l() {
        ax.Q2.g.c();
        this.j(this.a);
        ax.Q2.d.a(this.a);
        ax.n.f.J(true);
        ax.u3.g.b(this.a);
        ax.f3.a.d(this.a);
        k.t(this.a);
        s.a();
        ax.t3.c.n().t(this.a, this.d);
        ax.t3.j.i(this.a);
        ax.n.f.N(1);
        j.d0(this.a);
        com.alphainventor.filemanager.shizuku.c.z(this.a);
        ax.Z2.g.h().i(this.a);
        ax.Q2.a.i().j(this.a);
        this.p((Application)this.a);
        new Handler().postDelayed(new Runnable(this){
            final b q;
            {
                this.q = b8;
            }

            @Override
            public void run() {
                new d(this.q).h(new Void[0]);
            }
        }, 1000L);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean n() {
        Object object = g;
        synchronized (object) {
            if (f == null) return false;
            return true;
        }
    }

    public static void o() {
        e = true;
    }

    private void p(Application application) {
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks(this){
            final b a;
            {
                this.a = b8;
            }

            public void onActivityCreated(Activity activity, Bundle bundle) {
            }

            public void onActivityDestroyed(Activity activity) {
            }

            public void onActivityPaused(Activity activity) {
                this.a.b.decrementAndGet();
            }

            public void onActivityResumed(Activity activity) {
                this.a.b.incrementAndGet();
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public void onActivityStarted(Activity activity) {
            }

            public void onActivityStopped(Activity activity) {
            }
        });
    }

    private void q(Context context) {
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver(this){
            final b a;
            {
                this.a = b8;
            }

            public void onReceive(Context object, Intent object2) {
                object = object2.getAction();
                if (((String)object).equals("android.intent.action.PACKAGE_ADDED") || ((String)object).equals("android.intent.action.PACKAGE_REPLACED") || ((String)object).equals("android.intent.action.PACKAGE_REMOVED")) {
                    ax.U2.d.F(this.a.a).b0((Intent)object2);
                    u.a();
                    if (this.a.c != null && this.a.c.size() > 0) {
                        for (ax.g3.g g8 : this.a.c) {
                            if (g8 == null) continue;
                            g8.J((String)object);
                        }
                    }
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        try {
            context.registerReceiver(broadcastReceiver, intentFilter);
            return;
        }
        catch (SecurityException securityException) {
            securityException.printStackTrace();
            return;
        }
    }

    public void e(ax.g3.g g8) {
        if (this.c == null) {
            this.c = new ArrayList<ax.g3.g>();
        }
        this.c.add(g8);
    }

    public Context g() {
        return this.a;
    }

    public boolean m() {
        return this.b.get() > 0;
    }

    public void r(ax.g3.g g8) {
        List<ax.g3.g> list = this.c;
        if (list != null) {
            list.remove(g8);
        }
    }

    class d
    extends q<Void, Integer, Boolean> {
        final b h;

        d(b b8) {
            this.h = b8;
            super(q.e.e0);
        }

        protected Boolean w(Void[] object) {
            ax.i3.a.h(this.h.a);
            object = this.h;
            ((b)object).q(((b)object).a);
            StorageCheckReceiver.b(this.h.a, false);
            if (MyFileProvider.l() != null) {
                MyFileProvider.l().z();
            }
            return null;
        }
    }
}

