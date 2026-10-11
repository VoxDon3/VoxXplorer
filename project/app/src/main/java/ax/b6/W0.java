/*
 * Decompiled with CFR 0.152.
 */
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
import ax.M5.p;
import ax.R5.e;
import ax.R5.h;
import ax.b6.H0;
import ax.b6.I0;
import ax.b6.K0;
import ax.b6.Q0;
import ax.b6.V0;
import ax.b6.X0;
import ax.b6.Y0;
import ax.b6.Z0;
import ax.b6.a1;
import ax.b6.b1;
import ax.b6.c1;
import ax.b6.e1;
import ax.b6.f1;
import ax.b6.g1;
import ax.b6.h1;
import ax.b6.i1;
import ax.b6.j1;
import ax.b6.k1;
import ax.b6.l1;
import ax.b6.m1;
import ax.b6.n1;
import ax.b6.o1;
import ax.b6.p1;
import ax.b6.q1;
import ax.b6.r1;
import ax.b6.s1;
import ax.b6.t1;
import ax.b6.v1;
import ax.b6.w0;
import ax.b6.w1;
import ax.b6.x1;
import ax.b6.y1;
import ax.b6.z0;
import ax.b6.z1;
import ax.f6.m;
import ax.f6.t;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public class W0 {
    private static volatile W0 j;
    private final String a;
    protected final e b;
    private final ExecutorService c;
    private final ax.e6.a d;
    private final List<Pair<t, b>> e;
    private int f;
    private boolean g;
    private String h;
    private volatile H0 i;

    private W0(Context context, String object, String string, String string2, Bundle bundle) {
        this.a = object != null && this.G(string, string2) ? object : "FA";
        this.b = ax.R5.h.c();
        w0 w02 = z0.a();
        object = new e1(this);
        boolean bl = true;
        this.c = w02.a((ThreadFactory)object, 1);
        this.d = new ax.e6.a(this);
        this.e = new ArrayList<Pair<t, b>>();
        if (W0.D(context) && !this.L()) {
            this.h = null;
            this.g = true;
            Log.w((String)this.a, (String)"Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!this.G(string, string2)) {
            this.h = "fa";
            if (string != null && string2 != null) {
                Log.v((String)this.a, (String)"Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            } else {
                boolean bl2 = string == null;
                if (string2 != null) {
                    bl = false;
                }
                if (bl2 ^ bl) {
                    Log.w((String)this.a, (String)"Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            }
        } else {
            this.h = string;
        }
        this.l(new V0(this, string, string2, context, bundle));
        context = (Application)context.getApplicationContext();
        if (context == null) {
            Log.w((String)this.a, (String)"Unable to register lifecycle notifications. Application null.");
            return;
        }
        context.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)new c(this));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean D(Context object) {
        block3: {
            try {
                String string = m.a(object);
                m m8 = new m((Context)object, string);
                String string2 = m8.b("google_app_id");
                if (string2 == null) break block3;
                return true;
            }
            catch (IllegalStateException illegalStateException) {
                return false;
            }
        }
        return false;
    }

    private final boolean G(String string, String string2) {
        return string2 != null && string != null && !this.L();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean L() {
        boolean bl = false;
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, this.getClass().getClassLoader());
            return true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return bl;
        }
    }

    static /* bridge */ /* synthetic */ H0 d(W0 w02) {
        return w02.i;
    }

    public static W0 e(Context context) {
        return W0.f(context, null, null, null, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static W0 f(Context context, String string, String string2, String string3, Bundle bundle) {
        p.l(context);
        if (j != null) return j;
        synchronized (W0.class) {
            try {
                W0 w02;
                if (j != null) return j;
                j = w02 = new W0(context, string, string2, string3, bundle);
                return j;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private final void l(a a8) {
        this.c.execute(a8);
    }

    static /* bridge */ /* synthetic */ void m(W0 w02, H0 h02) {
        w02.i = h02;
    }

    private final void r(Exception exception, boolean bl, boolean bl2) {
        this.g |= bl;
        if (bl) {
            Log.w((String)this.a, (String)"Data collection startup failed. No data will be collected.", (Throwable)exception);
            return;
        }
        if (bl2) {
            this.i(5, "Error with data collection. Data lost.", exception, null, null);
        }
        Log.w((String)this.a, (String)"Error with data collection. Data lost.", (Throwable)exception);
    }

    private final void u(String string, String string2, Bundle bundle, boolean bl, boolean bl2, Long l8) {
        this.l(new r1(this, l8, string, string2, bundle, bl, bl2));
    }

    static /* synthetic */ boolean x(W0 w02, String string, String string2) {
        return w02.G(string, string2);
    }

    static /* bridge */ /* synthetic */ String z(W0 w02) {
        return w02.a;
    }

    public final void A(String string) {
        this.l(new g1(this, string));
    }

    public final void B(String string, String string2) {
        this.v(null, string, string2, false);
    }

    public final void C(String string, String string2, Bundle bundle) {
        this.u(string, string2, bundle, true, true, null);
    }

    public final void E(String string) {
        this.l(new f1(this, string));
    }

    public final String H() {
        I0 i02 = new I0();
        this.l(new h1(this, i02));
        return i02.b2(50L);
    }

    public final String I() {
        I0 i02 = new I0();
        this.l(new m1(this, i02));
        return i02.b2(500L);
    }

    public final String J() {
        I0 i02 = new I0();
        this.l(new j1(this, i02));
        return i02.b2(500L);
    }

    public final String K() {
        I0 i02 = new I0();
        this.l(new i1(this, i02));
        return i02.b2(500L);
    }

    public final int a(String object) {
        I0 i02 = new I0();
        this.l(new o1(this, (String)object, i02));
        object = I0.B(i02.w(10000L), Integer.class);
        if (object == null) {
            return 25;
        }
        return (Integer)object;
    }

    public final long b() {
        Object object = new I0();
        this.l(new k1(this, (I0)object));
        object = ((I0)object).a2(500L);
        if (object == null) {
            int n8;
            long l8 = new Random(System.nanoTime() ^ this.b.a()).nextLong();
            this.f = n8 = this.f + 1;
            return l8 + (long)n8;
        }
        return (Long)object;
    }

    protected final H0 c(Context object, boolean bl) {
        try {
            object = K0.asInterface(DynamiteModule.e(object, DynamiteModule.e, "com.google.android.gms.measurement.dynamite").d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            return object;
        }
        catch (DynamiteModule.a a8) {
            this.r(a8, true, false);
            return null;
        }
    }

    public final List<Bundle> g(String object, String object2) {
        I0 i02 = new I0();
        this.l(new Z0(this, (String)object, (String)object2, i02));
        object = object2 = I0.B(i02.w(5000L), List.class);
        if (object2 == null) {
            object = Collections.EMPTY_LIST;
        }
        return object;
    }

    public final Map<String, Object> h(String object, String string2, boolean bl) {
        I0 i02 = new I0();
        this.l(new l1(this, (String)object, string2, bl, i02));
        i02 = i02.w(5000L);
        if (i02 != null && i02.size() != 0) {
            HashMap<String, Object> hashMap = new HashMap<String, Object>(i02.size());
            for (String string2 : i02.keySet()) {
                Object object2 = i02.get(string2);
                if (!(object2 instanceof Double) && !(object2 instanceof Long) && !(object2 instanceof String)) continue;
                hashMap.put(string2, object2);
            }
            return hashMap;
        }
        return Collections.EMPTY_MAP;
    }

    public final void i(int n8, String string, Object object, Object object2, Object object3) {
        this.l(new n1(this, false, 5, string, object, null, null));
    }

    public final void j(Activity activity, String string, String string2) {
        this.l(new b1(this, activity, string, string2));
    }

    public final void k(Bundle bundle) {
        this.l(new X0(this, bundle));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void p(t t8) {
        b b8;
        block8: {
            p.l(t8);
            List<Pair<t, b>> list = this.e;
            // MONITORENTER : list
            for (int i8 = 0; i8 < this.e.size(); ++i8) {
                if (!t8.equals(this.e.get((int)i8).first)) continue;
                Log.w((String)this.a, (String)"OnEventListener already registered.");
                // MONITOREXIT : list
                return;
            }
            b8 = new b(t8);
            List<Pair<t, b>> list2 = this.e;
            Pair pair = new Pair((Object)t8, (Object)b8);
            list2.add((Pair<t, b>)pair);
            // MONITOREXIT : list
            if (this.i == null) break block8;
            try {
                this.i.registerOnMeasurementEventListener(b8);
                return;
            }
            catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException throwable) {
                Log.w((String)this.a, (String)"Failed to register event listener on calling thread. Trying again on the dynamite thread.");
            }
        }
        this.l(new q1(this, b8));
    }

    public final void q(Boolean bl) {
        this.l(new c1(this, bl));
    }

    public final void s(String string, Bundle bundle) {
        this.u(null, string, bundle, false, true, null);
    }

    public final void t(String string, String string2, Bundle bundle) {
        this.l(new a1(this, string, string2, bundle));
    }

    public final void v(String string, String string2, Object object, boolean bl) {
        this.l(new Y0(this, string, string2, object, bl));
    }

    public final void w(boolean bl) {
        this.l(new p1(this, bl));
    }

    public final ax.e6.a y() {
        return this.d;
    }

    abstract class a
    implements Runnable {
        final long c0;
        private final boolean d0;
        private final W0 e0;
        final long q;

        a(W0 w02) {
            this(w02, true);
        }

        a(W0 w02, boolean bl) {
            this.e0 = w02;
            this.q = w02.b.a();
            this.c0 = w02.b.b();
            this.d0 = bl;
        }

        abstract void a() throws RemoteException;

        protected void b() {
        }

        @Override
        public void run() {
            if (this.e0.g) {
                this.b();
                return;
            }
            try {
                this.a();
                return;
            }
            catch (Exception exception) {
                this.e0.r(exception, false, this.d0);
                this.b();
                return;
            }
        }
    }

    static final class b
    extends Q0 {
        private final t e;

        b(t t8) {
            this.e = t8;
        }

        @Override
        public final int a() {
            return System.identityHashCode(this.e);
        }

        @Override
        public final void g1(String string, String string2, Bundle bundle, long l8) {
            this.e.a(string, string2, bundle, l8);
        }
    }

    final class c
    implements Application.ActivityLifecycleCallbacks {
        final W0 a;

        c(W0 w02) {
            this.a = w02;
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            this.a.l(new s1(this, bundle, activity));
        }

        public final void onActivityDestroyed(Activity activity) {
            this.a.l(new y1(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            this.a.l(new x1(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            this.a.l(new t1(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            I0 i02 = new I0();
            this.a.l(new z1(this, activity, i02));
            activity = i02.w(50L);
            if (activity != null) {
                bundle.putAll((Bundle)activity);
            }
        }

        public final void onActivityStarted(Activity activity) {
            this.a.l(new v1(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            this.a.l(new w1(this, activity));
        }
    }
}

