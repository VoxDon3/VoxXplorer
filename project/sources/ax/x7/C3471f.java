package ax.x7;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import ax.D7.C0661c;
import ax.D7.C0665g;
import ax.D7.o;
import ax.D7.x;
import ax.M5.C0819n;
import ax.M5.C0821p;
import ax.Y.v;
import ax.f1.C2015i;
import ax.g8.C2130a;
import ax.q8.C2887b;
import ax.q8.C2888c;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C3607a;
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

/* renamed from: ax.x7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3471f {
    private static final Object k = new Object();
    static final Map<String, C3471f> l = new ax.B.a();
    private final Context a;
    private final String b;
    private final n c;
    private final ax.D7.o d;
    private final x<C2130a> g;
    private final ax.a8.b<ax.Z7.f> h;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final AtomicBoolean f = new AtomicBoolean();
    private final List<a> i = new CopyOnWriteArrayList();
    private final List<InterfaceC3472g> j = new CopyOnWriteArrayList();

    /* renamed from: ax.x7.f$a */
    public interface a {
        void a(boolean z);
    }

    @TargetApi(14)
    /* renamed from: ax.x7.f$b */
    private static class b implements ComponentCallbacks2C3607a.InterfaceC0545a {
        private static AtomicReference<b> a = new AtomicReference<>();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (ax.R5.l.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() == null) {
                    b bVar = new b();
                    if (C2015i.a(a, null, bVar)) {
                        ComponentCallbacks2C3607a.c(application);
                        ComponentCallbacks2C3607a.b().a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C3607a.InterfaceC0545a
        public void a(boolean z) {
            synchronized (C3471f.k) {
                try {
                    ArrayList arrayList = new ArrayList(C3471f.l.values());
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        C3471f c3471f = (C3471f) obj;
                        if (c3471f.e.get()) {
                            c3471f.w(z);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @TargetApi(24)
    /* renamed from: ax.x7.f$c */
    private static class c extends BroadcastReceiver {
        private static AtomicReference<c> b = new AtomicReference<>();
        private final Context a;

        public c(Context context) {
            this.a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (b.get() == null) {
                c cVar = new c(context);
                if (C2015i.a(b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C3471f.k) {
                try {
                    Iterator<C3471f> it = C3471f.l.values().iterator();
                    while (it.hasNext()) {
                        it.next().p();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    protected C3471f(final Context context, String str, n nVar) {
        this.a = (Context) C0821p.l(context);
        this.b = C0821p.f(str);
        this.c = (n) C0821p.l(nVar);
        o b2 = FirebaseInitProvider.b();
        C2888c.b("Firebase");
        C2888c.b("ComponentDiscovery");
        List<ax.a8.b<ComponentRegistrar>> b3 = C0665g.c(context, ComponentDiscoveryService.class).b();
        C2888c.a();
        C2888c.b("Runtime");
        o.b f = ax.D7.o.m(ax.E7.m.INSTANCE).d(b3).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(C0661c.q(context, Context.class, new Class[0])).b(C0661c.q(this, C3471f.class, new Class[0])).b(C0661c.q(nVar, n.class, new Class[0])).f(new C2887b());
        if (v.a(context) && FirebaseInitProvider.c()) {
            f.b(C0661c.q(b2, o.class, new Class[0]));
        }
        ax.D7.o e = f.e();
        this.d = e;
        C2888c.a();
        this.g = new x<>(new ax.a8.b() { // from class: ax.x7.d
            @Override // ax.a8.b
            public final Object get() {
                return C3471f.b(C3471f.this, context);
            }
        });
        this.h = e.d(ax.Z7.f.class);
        g(new a() { // from class: ax.x7.e
            @Override // ax.x7.C3471f.a
            public final void a(boolean z) {
                C3471f.a(C3471f.this, z);
            }
        });
        C2888c.a();
    }

    public static /* synthetic */ void a(C3471f c3471f, boolean z) {
        if (z) {
            c3471f.getClass();
        } else {
            c3471f.h.get().g();
        }
    }

    public static /* synthetic */ C2130a b(C3471f c3471f, Context context) {
        return new C2130a(context, c3471f.o(), (ax.Y7.c) c3471f.d.a(ax.Y7.c.class));
    }

    private void i() {
        C0821p.p(!this.f.get(), "FirebaseApp was deleted");
    }

    public static C3471f l() {
        C3471f c3471f;
        synchronized (k) {
            try {
                c3471f = l.get("[DEFAULT]");
                if (c3471f == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ax.R5.n.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                c3471f.h.get().g();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3471f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (!v.a(this.a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m());
            c.b(this.a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m());
        this.d.p(u());
        this.h.get().g();
    }

    public static C3471f q(Context context) {
        synchronized (k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return l();
                }
                n a2 = n.a(context);
                if (a2 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return r(context, a2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C3471f r(Context context, n nVar) {
        return s(context, nVar, "[DEFAULT]");
    }

    public static C3471f s(Context context, n nVar, String str) {
        C3471f c3471f;
        b.c(context);
        String v = v(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            Map<String, C3471f> map = l;
            C0821p.p(!map.containsKey(v), "FirebaseApp name " + v + " already exists!");
            C0821p.m(context, "Application context cannot be null.");
            c3471f = new C3471f(context, v, nVar);
            map.put(v, c3471f);
        }
        c3471f.p();
        return c3471f;
    }

    private static String v(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<a> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().a(z);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3471f) {
            return this.b.equals(((C3471f) obj).m());
        }
        return false;
    }

    public void g(a aVar) {
        i();
        if (this.e.get() && ComponentCallbacks2C3607a.b().d()) {
            aVar.a(true);
        }
        this.i.add(aVar);
    }

    public void h(InterfaceC3472g interfaceC3472g) {
        i();
        C0821p.l(interfaceC3472g);
        this.j.add(interfaceC3472g);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public <T> T j(Class<T> cls) {
        i();
        return (T) this.d.a(cls);
    }

    public Context k() {
        i();
        return this.a;
    }

    public String m() {
        i();
        return this.b;
    }

    public n n() {
        i();
        return this.c;
    }

    public String o() {
        return ax.R5.c.a(m().getBytes(Charset.defaultCharset())) + "+" + ax.R5.c.a(n().c().getBytes(Charset.defaultCharset()));
    }

    public boolean t() {
        i();
        return this.g.get().b();
    }

    public String toString() {
        return C0819n.d(this).a("name", this.b).a("options", this.c).toString();
    }

    public boolean u() {
        return "[DEFAULT]".equals(m());
    }
}
