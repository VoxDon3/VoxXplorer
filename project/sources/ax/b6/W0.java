package ax.b6;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import ax.M5.C0821p;
import ax.e6.C1982a;
import ax.f6.C2065m;
import ax.f6.InterfaceC2072t;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public class W0 {
    private static volatile W0 j;
    private final String a;
    protected final ax.R5.e b;
    private final ExecutorService c;
    private final C1982a d;
    private final List<Pair<InterfaceC2072t, b>> e;
    private int f;
    private boolean g;
    private String h;
    private volatile H0 i;

    abstract class a implements Runnable {
        final long c0;
        private final boolean d0;
        final long q;

        a(W0 w0) {
            this(true);
        }

        abstract void a() throws RemoteException;

        @Override // java.lang.Runnable
        public void run() {
            if (W0.this.g) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e) {
                W0.this.r(e, false, this.d0);
                b();
            }
        }

        a(boolean z) {
            this.q = W0.this.b.a();
            this.c0 = W0.this.b.b();
            this.d0 = z;
        }

        protected void b() {
        }
    }

    static class b extends Q0 {
        private final InterfaceC2072t e;

        b(InterfaceC2072t interfaceC2072t) {
            this.e = interfaceC2072t;
        }

        @Override // ax.b6.N0
        public final int a() {
            return System.identityHashCode(this.e);
        }

        @Override // ax.b6.N0
        public final void g1(String str, String str2, Bundle bundle, long j) {
            this.e.a(str, str2, bundle, j);
        }
    }

    class c implements Application.ActivityLifecycleCallbacks {
        c() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            W0.this.l(new C1660s1(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            W0.this.l(new C1708y1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            W0.this.l(new C1700x1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            W0.this.l(new C1668t1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            I0 i0 = new I0();
            W0.this.l(new C1716z1(this, activity, i0));
            Bundle w = i0.w(50L);
            if (w != null) {
                bundle.putAll(w);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            W0.this.l(new C1684v1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            W0.this.l(new C1692w1(this, activity));
        }
    }

    private W0(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !G(str2, str3)) {
            this.a = "FA";
        } else {
            this.a = str;
        }
        this.b = ax.R5.h.c();
        this.c = C1715z0.a().a(new ThreadFactoryC1542e1(this), 1);
        this.d = new C1982a(this);
        this.e = new ArrayList();
        if (D(context) && !L()) {
            this.h = null;
            this.g = true;
            Log.w(this.a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (G(str2, str3)) {
            this.h = str2;
        } else {
            this.h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.a, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            }
        }
        l(new V0(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new c());
        }
    }

    private static boolean D(Context context) {
        return new C2065m(context, C2065m.a(context)).b("google_app_id") != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean G(String str, String str2) {
        return (str2 == null || str == null || L()) ? false : true;
    }

    private final boolean L() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static W0 e(Context context) {
        return f(context, null, null, null, null);
    }

    public static W0 f(Context context, String str, String str2, String str3, Bundle bundle) {
        C0821p.l(context);
        if (j == null) {
            synchronized (W0.class) {
                try {
                    if (j == null) {
                        j = new W0(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(a aVar) {
        this.c.execute(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(Exception exc, boolean z, boolean z2) {
        W0 w0;
        Exception exc2;
        this.g |= z;
        if (z) {
            Log.w(this.a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            w0 = this;
            exc2 = exc;
            w0.i(5, "Error with data collection. Data lost.", exc2, null, null);
        } else {
            w0 = this;
            exc2 = exc;
        }
        Log.w(w0.a, "Error with data collection. Data lost.", exc2);
    }

    private final void u(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        l(new C1652r1(this, l, str, str2, bundle, z, z2));
    }

    public final void A(String str) {
        l(new C1560g1(this, str));
    }

    public final void B(String str, String str2) {
        v(null, str, str2, false);
    }

    public final void C(String str, String str2, Bundle bundle) {
        u(str, str2, bundle, true, true, null);
    }

    public final void E(String str) {
        l(new C1551f1(this, str));
    }

    public final String H() {
        I0 i0 = new I0();
        l(new C1569h1(this, i0));
        return i0.b2(50L);
    }

    public final String I() {
        I0 i0 = new I0();
        l(new C1613m1(this, i0));
        return i0.b2(500L);
    }

    public final String J() {
        I0 i0 = new I0();
        l(new C1587j1(this, i0));
        return i0.b2(500L);
    }

    public final String K() {
        I0 i0 = new I0();
        l(new C1578i1(this, i0));
        return i0.b2(500L);
    }

    public final int a(String str) {
        I0 i0 = new I0();
        l(new C1629o1(this, str, i0));
        Integer num = (Integer) I0.B(i0.w(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long b() {
        I0 i0 = new I0();
        l(new C1596k1(this, i0));
        Long a2 = i0.a2(500L);
        if (a2 != null) {
            return a2.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.b.a()).nextLong();
        int i = this.f + 1;
        this.f = i;
        return nextLong + i;
    }

    protected final H0 c(Context context, boolean z) {
        try {
            return K0.asInterface(DynamiteModule.e(context, DynamiteModule.e, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e) {
            r(e, true, false);
            return null;
        }
    }

    public final List<Bundle> g(String str, String str2) {
        I0 i0 = new I0();
        l(new Z0(this, str, str2, i0));
        List<Bundle> list = (List) I0.B(i0.w(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final Map<String, Object> h(String str, String str2, boolean z) {
        I0 i0 = new I0();
        l(new C1605l1(this, str, str2, z, i0));
        Bundle w = i0.w(5000L);
        if (w == null || w.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(w.size());
        for (String str3 : w.keySet()) {
            Object obj = w.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void i(int i, String str, Object obj, Object obj2, Object obj3) {
        l(new C1621n1(this, false, 5, str, obj, null, null));
    }

    public final void j(Activity activity, String str, String str2) {
        l(new C1515b1(this, activity, str, str2));
    }

    public final void k(Bundle bundle) {
        l(new X0(this, bundle));
    }

    public final void p(InterfaceC2072t interfaceC2072t) {
        C0821p.l(interfaceC2072t);
        synchronized (this.e) {
            for (int i = 0; i < this.e.size(); i++) {
                try {
                    if (interfaceC2072t.equals(this.e.get(i).first)) {
                        Log.w(this.a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            b bVar = new b(interfaceC2072t);
            this.e.add(new Pair<>(interfaceC2072t, bVar));
            if (this.i != null) {
                try {
                    this.i.registerOnMeasurementEventListener(bVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            l(new C1645q1(this, bVar));
        }
    }

    public final void q(Boolean bool) {
        l(new C1524c1(this, bool));
    }

    public final void s(String str, Bundle bundle) {
        u(null, str, bundle, false, true, null);
    }

    public final void t(String str, String str2, Bundle bundle) {
        l(new C1506a1(this, str, str2, bundle));
    }

    public final void v(String str, String str2, Object obj, boolean z) {
        l(new Y0(this, str, str2, obj, z));
    }

    public final void w(boolean z) {
        l(new C1637p1(this, z));
    }

    public final C1982a y() {
        return this.d;
    }
}
