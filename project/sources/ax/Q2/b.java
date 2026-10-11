package ax.Q2;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import ax.J5.C0747h;
import ax.c3.C1832u;
import ax.f3.C2044a;
import ax.i3.C2265a;
import ax.n.AbstractC2564f;
import ax.u3.AbstractC3199q;
import ax.u3.C3189g;
import ax.u3.ExecutorC3201s;
import ax.x7.C3471f;
import com.voxdon.xplorer.ApplicationReporter;
import com.voxdon.xplorer.provider.MyFileProvider;
import com.voxdon.xplorer.receiver.StorageCheckReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class b {
    static boolean e = false;
    static b f;
    static final Object g = new Object();
    private Context a;
    private final AtomicInteger b = new AtomicInteger(0);
    private List<ax.g3.g> c = new ArrayList();
    private boolean d;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.new d().h(new Void[0]);
        }
    }

    class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals("android.intent.action.PACKAGE_ADDED") || action.equals("android.intent.action.PACKAGE_REPLACED") || action.equals("android.intent.action.PACKAGE_REMOVED")) {
                ax.U2.d.F(b.this.a).b0(intent);
                C1832u.a();
                if (b.this.c == null || b.this.c.size() <= 0) {
                    return;
                }
                for (ax.g3.g gVar : b.this.c) {
                    if (gVar != null) {
                        gVar.J(action);
                    }
                }
            }
        }
    }

    class d extends AbstractC3199q<Void, Integer, Boolean> {
        d() {
            super(AbstractC3199q.e.HIGH);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Boolean g(Void[] voidArr) {
            C2265a.h(b.this.a);
            b bVar = b.this;
            bVar.q(bVar.a);
            StorageCheckReceiver.b(b.this.a, false);
            if (MyFileProvider.l() == null) {
                return null;
            }
            MyFileProvider.l().z();
            return null;
        }
    }

    public b(Context context) {
        this.a = context.getApplicationContext();
    }

    public static void f(Context context, boolean z) {
        String str;
        if (n()) {
            return;
        }
        ApplicationReporter.init(context);
        if (context == null) {
            ax.Ha.c.h().f().b("!Check application null context").j().h();
            return;
        }
        Context applicationContext = context.getApplicationContext();
        boolean z2 = applicationContext != null;
        if (z2) {
            str = applicationContext.getClass().getSimpleName();
            k(applicationContext);
            o();
        } else {
            str = "none";
        }
        if (z) {
            ax.Ha.c.h().f().d("!!Application onCreate was not called").g("getApplicationContext:" + z2 + ", className:" + str).j().h();
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

    private void j(Context context) {
        try {
            boolean z = C0747h.o().g(context) == 0;
            this.d = z;
            if (z) {
                C3471f.q(context);
            }
        } catch (Exception unused) {
        }
    }

    public static void k(Context context) {
        synchronized (g) {
            try {
                if (f == null) {
                    ApplicationReporter.init(context);
                    b bVar = new b(context);
                    f = bVar;
                    bVar.l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void l() {
        g.c();
        j(this.a);
        ax.Q2.d.a(this.a);
        AbstractC2564f.J(true);
        C3189g.b(this.a);
        C2044a.d(this.a);
        ax.t3.k.t(this.a);
        ExecutorC3201s.a();
        ax.t3.c.n().t(this.a, this.d);
        ax.t3.j.i(this.a);
        AbstractC2564f.N(1);
        ax.Z2.j.d0(this.a);
        com.voxdon.xplorer.shizuku.c.z(this.a);
        ax.Z2.g.h().i(this.a);
        ax.Q2.a.i().j(this.a);
        p((Application) this.a);
        new Handler().postDelayed(new a(), 1000L);
    }

    public static boolean n() {
        boolean z;
        synchronized (g) {
            z = f != null;
        }
        return z;
    }

    public static void o() {
        e = true;
    }

    private void p(Application application) {
        application.registerActivityLifecycleCallbacks(new C0176b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(Context context) {
        c cVar = new c();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        try {
            context.registerReceiver(cVar, intentFilter);
        } catch (SecurityException e2) {
            e2.printStackTrace();
        }
    }

    public void e(ax.g3.g gVar) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(gVar);
    }

    public Context g() {
        return this.a;
    }

    public boolean m() {
        return this.b.get() > 0;
    }

    public void r(ax.g3.g gVar) {
        List<ax.g3.g> list = this.c;
        if (list != null) {
            list.remove(gVar);
        }
    }

    /* renamed from: ax.Q2.b$b, reason: collision with other inner class name */
    class C0176b implements Application.ActivityLifecycleCallbacks {
        C0176b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            b.this.b.decrementAndGet();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            b.this.b.incrementAndGet();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
