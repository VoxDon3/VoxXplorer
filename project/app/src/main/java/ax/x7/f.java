/*
 * Decompiled with CFR 0.152.
 */
package ax.x7;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import ax.D7.o;
import ax.D7.x;
import ax.E7.m;
import ax.M5.p;
import ax.R5.l;
import ax.Y.v;
import ax.f1.i;
import ax.x7.d;
import ax.x7.e;
import ax.x7.g;
import ax.x7.n;
import ax.x7.o;
import com.google.android.gms.common.api.internal.a;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class f {
    private static final Object k = new Object();
    static final Map<String, f> l = new ax.B.a<String, f>();
    private final Context a;
    private final String b;
    private final n c;
    private final ax.D7.o d;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final AtomicBoolean f = new AtomicBoolean();
    private final x<ax.g8.a> g;
    private final ax.a8.b<ax.Z7.f> h;
    private final List<a> i = new CopyOnWriteArrayList<a>();
    private final List<g> j = new CopyOnWriteArrayList<g>();

    protected f(Context context, String object, n object2) {
        this.a = p.l(context);
        this.b = p.f((String)object);
        this.c = p.l(object2);
        object = FirebaseInitProvider.b();
        ax.q8.c.b("Firebase");
        ax.q8.c.b("ComponentDiscovery");
        List<ax.a8.b<ComponentRegistrar>> list = ax.D7.g.c(context, ComponentDiscoveryService.class).b();
        ax.q8.c.a();
        ax.q8.c.b("Runtime");
        object2 = ax.D7.o.m(m.q).d(list).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(ax.D7.c.q(context, Context.class, new Class[0])).b(ax.D7.c.q(this, f.class, new Class[0])).b(ax.D7.c.q(object2, n.class, new Class[0])).f(new ax.q8.b());
        if (v.a(context) && FirebaseInitProvider.c()) {
            ((o.b)object2).b(ax.D7.c.q(object, o.class, new Class[0]));
        }
        this.d = object = ((o.b)object2).e();
        ax.q8.c.a();
        this.g = new x(new d(this, context));
        this.h = ((ax.D7.o)object).d(ax.Z7.f.class);
        this.g(new e(this));
        ax.q8.c.a();
    }

    public static /* synthetic */ void a(f f8, boolean bl) {
        if (!bl) {
            f8.h.get().g();
            return;
        }
        f8.getClass();
    }

    public static /* synthetic */ ax.g8.a b(f f8, Context context) {
        return new ax.g8.a(context, f8.o(), (ax.Y7.c)f8.d.a(ax.Y7.c.class));
    }

    private void i() {
        p.p(this.f.get() ^ true, "FirebaseApp was deleted");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static f l() {
        Object object = k;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Object object2;
                try {
                    object2 = l.get("[DEFAULT]");
                    if (object2 != null) {
                        ((f)object2).h.get().g();
                        return object2;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Default FirebaseApp is not initialized in this process ");
                ((StringBuilder)object2).append(ax.R5.n.a());
                ((StringBuilder)object2).append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                IllegalStateException illegalStateException = new IllegalStateException(((StringBuilder)object2).toString());
                throw illegalStateException;
            }
            throw throwable2;
        }
    }

    private void p() {
        if (!v.a(this.a)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            stringBuilder.append(this.m());
            Log.i((String)"FirebaseApp", (String)stringBuilder.toString());
            ax.x7.f$c.b(this.a);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Device unlocked: initializing all Firebase APIs for app ");
        stringBuilder.append(this.m());
        Log.i((String)"FirebaseApp", (String)stringBuilder.toString());
        this.d.p(this.u());
        this.h.get().g();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static f q(Context object) {
        Object object2 = k;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                try {
                    if (l.containsKey("[DEFAULT]")) {
                        return ax.x7.f.l();
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                n n8 = n.a(object);
                if (n8 != null) return ax.x7.f.r(object, n8);
                Log.w((String)"FirebaseApp", (String)"Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            throw throwable2;
        }
    }

    public static f r(Context context, n n8) {
        return ax.x7.f.s(context, n8, "[DEFAULT]");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static f s(Context context, n n8, String string) {
        Object object;
        ax.x7.f$b.c(context);
        string = ax.x7.f.v(string);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Object object2 = k;
        synchronized (object2) {
            Map<String, f> map = l;
            boolean bl = map.containsKey(string);
            object = new StringBuilder();
            ((StringBuilder)object).append("FirebaseApp name ");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(" already exists!");
            p.p(bl ^ true, ((StringBuilder)object).toString());
            p.m(context, "Application context cannot be null.");
            object = new f(context, string, n8);
            map.put(string, (f)object);
        }
        super.p();
        return object;
    }

    private static String v(String string) {
        return string.trim();
    }

    private void w(boolean bl) {
        Log.d((String)"FirebaseApp", (String)"Notifying background state change listeners.");
        Iterator<a> iterator = this.i.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(bl);
        }
    }

    public boolean equals(Object object) {
        if (!(object instanceof f)) {
            return false;
        }
        return this.b.equals(((f)object).m());
    }

    public void g(a a8) {
        this.i();
        if (this.e.get() && com.google.android.gms.common.api.internal.a.b().d()) {
            a8.a(true);
        }
        this.i.add(a8);
    }

    public void h(g g8) {
        this.i();
        p.l(g8);
        this.j.add(g8);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public <T> T j(Class<T> clazz) {
        this.i();
        return (T)this.d.a((Class)clazz);
    }

    public Context k() {
        this.i();
        return this.a;
    }

    public String m() {
        this.i();
        return this.b;
    }

    public n n() {
        this.i();
        return this.c;
    }

    public String o() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ax.R5.c.a(this.m().getBytes(Charset.defaultCharset())));
        stringBuilder.append("+");
        stringBuilder.append(ax.R5.c.a(this.n().c().getBytes(Charset.defaultCharset())));
        return stringBuilder.toString();
    }

    public boolean t() {
        this.i();
        return this.g.get().b();
    }

    public String toString() {
        return ax.M5.n.d(this).a("name", this.b).a("options", this.c).toString();
    }

    public boolean u() {
        return "[DEFAULT]".equals(this.m());
    }

    public static interface a {
        public void a(boolean var1);
    }

    @TargetApi(value=14)
    private static class b
    implements a.a {
        private static AtomicReference<b> a = new AtomicReference();

        private b() {
        }

        private static void c(Context object) {
            if (ax.R5.l.a() && object.getApplicationContext() instanceof Application) {
                Application application = (Application)object.getApplicationContext();
                if (a.get() == null && ax.f1.i.a(a, null, object = new b())) {
                    com.google.android.gms.common.api.internal.a.c(application);
                    com.google.android.gms.common.api.internal.a.b().a((a.a)object);
                }
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void a(boolean bl) {
            Object object = k;
            synchronized (object) {
                try {
                    ArrayList<f> arrayList = new ArrayList<f>(l.values());
                    int n8 = arrayList.size();
                    int n9 = 0;
                    while (true) {
                        int n10;
                        if (n9 >= n8) {
                            return;
                        }
                        f f8 = arrayList.get(n9);
                        n9 = n10 = n9 + 1;
                        if (!f8.e.get()) continue;
                        f8.w(bl);
                        n9 = n10;
                    }
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }
    }

    @TargetApi(value=24)
    private static class c
    extends BroadcastReceiver {
        private static AtomicReference<c> b = new AtomicReference();
        private final Context a;

        public c(Context context) {
            this.a = context;
        }

        private static void b(Context context) {
            c c8;
            if (b.get() == null && ax.f1.i.a(b, null, (Object)(c8 = new c(context)))) {
                context.registerReceiver((BroadcastReceiver)c8, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }

        public void c() {
            this.a.unregisterReceiver((BroadcastReceiver)this);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onReceive(Context object, Intent object2) {
            object = k;
            synchronized (object) {
                try {
                    object2 = l.values().iterator();
                    while (true) {
                        if (!object2.hasNext()) {
                            // MONITOREXIT @DISABLED, blocks:[0, 2, 4, 5] lbl7 : MonitorExitStatement: MONITOREXIT : var1_1 /* !! */ 
                            this.c();
                            return;
                        }
                        ((f)object2.next()).p();
                    }
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }
    }
}

