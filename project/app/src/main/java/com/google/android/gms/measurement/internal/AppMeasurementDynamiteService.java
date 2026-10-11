/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import ax.M5.p;
import ax.b6.K0;
import ax.b6.M0;
import ax.b6.N0;
import ax.b6.S0;
import ax.b6.U0;
import ax.f6.r;
import ax.f6.t;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.measurement.internal.B5;
import com.google.android.gms.measurement.internal.C;
import com.google.android.gms.measurement.internal.D;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.N4;
import com.google.android.gms.measurement.internal.O3;
import com.google.android.gms.measurement.internal.V2;
import com.google.android.gms.measurement.internal.k3;
import com.google.android.gms.measurement.internal.n4;
import com.google.android.gms.measurement.internal.p3;
import com.google.android.gms.measurement.internal.w2;
import java.util.Map;

@DynamiteApi
public class AppMeasurementDynamiteService
extends K0 {
    E2 e = null;
    private final Map<Integer, t> f = new ax.B.a<Integer, t>();

    private final void B(M0 m02, String string) {
        this.w();
        this.e.L().S(m02, string);
    }

    private final void w() {
        if (this.e != null) {
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    @Override
    public void beginAdUnitExposure(String string, long l8) throws RemoteException {
        this.w();
        this.e.y().z(string, l8);
    }

    @Override
    public void clearConditionalUserProperty(String string, String string2, Bundle bundle) throws RemoteException {
        this.w();
        this.e.H().g0(string, string2, bundle);
    }

    @Override
    public void clearMeasurementEnabled(long l8) throws RemoteException {
        this.w();
        this.e.H().a0(null);
    }

    @Override
    public void endAdUnitExposure(String string, long l8) throws RemoteException {
        this.w();
        this.e.y().D(string, l8);
    }

    @Override
    public void generateEventId(M0 m02) throws RemoteException {
        this.w();
        long l8 = this.e.L().R0();
        this.w();
        this.e.L().Q(m02, l8);
    }

    @Override
    public void getAppInstanceId(M0 m02) throws RemoteException {
        this.w();
        this.e.l().D(new V2(this, m02));
    }

    @Override
    public void getCachedAppInstanceId(M0 m02) throws RemoteException {
        this.w();
        this.B(m02, this.e.H().u0());
    }

    @Override
    public void getConditionalUserProperties(String string, String string2, M0 m02) throws RemoteException {
        this.w();
        this.e.l().D(new N4(this, m02, string, string2));
    }

    @Override
    public void getCurrentScreenClass(M0 m02) throws RemoteException {
        this.w();
        this.B(m02, this.e.H().v0());
    }

    @Override
    public void getCurrentScreenName(M0 m02) throws RemoteException {
        this.w();
        this.B(m02, this.e.H().w0());
    }

    @Override
    public void getGmpAppId(M0 m02) throws RemoteException {
        this.w();
        this.B(m02, this.e.H().x0());
    }

    @Override
    public void getMaxUserProperties(String string, M0 m02) throws RemoteException {
        this.w();
        this.e.H();
        k3.D(string);
        this.w();
        this.e.L().P(m02, 25);
    }

    @Override
    public void getSessionId(M0 m02) throws RemoteException {
        this.w();
        this.e.H().O(m02);
    }

    @Override
    public void getTestFlag(M0 m02, int n8) throws RemoteException {
        this.w();
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            return;
                        }
                        this.e.L().U(m02, this.e.H().q0());
                        return;
                    }
                    this.e.L().P(m02, this.e.H().s0());
                    return;
                }
                B5 b52 = this.e.L();
                double d8 = this.e.H().r0();
                Bundle bundle = new Bundle();
                bundle.putDouble("r", d8);
                try {
                    m02.n(bundle);
                    return;
                }
                catch (RemoteException remoteException) {
                    b52.a.k().L().b("Error returning double value to wrapper", (Object)remoteException);
                    return;
                }
            }
            this.e.L().Q(m02, this.e.H().t0());
            return;
        }
        this.e.L().S(m02, this.e.H().y0());
    }

    @Override
    public void getUserProperties(String string, String string2, boolean bl, M0 m02) throws RemoteException {
        this.w();
        this.e.l().D(new O3(this, m02, string, string2, bl));
    }

    @Override
    public void initForTests(Map map) throws RemoteException {
        this.w();
    }

    @Override
    public void initialize(ax.T5.a a8, U0 u02, long l8) throws RemoteException {
        E2 e22 = this.e;
        if (e22 == null) {
            this.e = E2.c(p.l((Context)ax.T5.b.B(a8)), u02, l8);
            return;
        }
        e22.k().L().a("Attempting to initialize multiple times");
    }

    @Override
    public void isDataCollectionEnabled(M0 m02) throws RemoteException {
        this.w();
        this.e.l().D(new n4(this, m02));
    }

    @Override
    public void logEvent(String string, String string2, Bundle bundle, boolean bl, boolean bl2, long l8) throws RemoteException {
        this.w();
        this.e.H().i0(string, string2, bundle, bl, bl2, l8);
    }

    @Override
    public void logEventAndBundle(String string, String object, Bundle bundle, M0 m02, long l8) throws RemoteException {
        this.w();
        p.f((String)object);
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", "app");
        object = new D((String)object, new C(bundle), "app", l8);
        this.e.l().D(new w2(this, m02, (D)object, string));
    }

    @Override
    public void logHealthData(int n8, String string, ax.T5.a a8, ax.T5.a a9, ax.T5.a a10) throws RemoteException {
        this.w();
        Object var6_6 = null;
        a8 = a8 == null ? null : ax.T5.b.B(a8);
        a9 = a9 == null ? null : ax.T5.b.B(a9);
        a10 = a10 == null ? var6_6 : ax.T5.b.B(a10);
        this.e.k().z(n8, true, false, string, a8, a9, a10);
    }

    @Override
    public void onActivityCreated(ax.T5.a a8, Bundle bundle, long l8) throws RemoteException {
        this.w();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.e.H().o0();
        if (activityLifecycleCallbacks != null) {
            this.e.H().B0();
            activityLifecycleCallbacks.onActivityCreated((Activity)ax.T5.b.B(a8), bundle);
        }
    }

    @Override
    public void onActivityDestroyed(ax.T5.a a8, long l8) throws RemoteException {
        this.w();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.e.H().o0();
        if (activityLifecycleCallbacks != null) {
            this.e.H().B0();
            activityLifecycleCallbacks.onActivityDestroyed((Activity)ax.T5.b.B(a8));
        }
    }

    @Override
    public void onActivityPaused(ax.T5.a a8, long l8) throws RemoteException {
        this.w();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.e.H().o0();
        if (activityLifecycleCallbacks != null) {
            this.e.H().B0();
            activityLifecycleCallbacks.onActivityPaused((Activity)ax.T5.b.B(a8));
        }
    }

    @Override
    public void onActivityResumed(ax.T5.a a8, long l8) throws RemoteException {
        this.w();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.e.H().o0();
        if (activityLifecycleCallbacks != null) {
            this.e.H().B0();
            activityLifecycleCallbacks.onActivityResumed((Activity)ax.T5.b.B(a8));
        }
    }

    @Override
    public void onActivitySaveInstanceState(ax.T5.a a8, M0 m02, long l8) throws RemoteException {
        this.w();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.e.H().o0();
        Bundle bundle = new Bundle();
        if (activityLifecycleCallbacks != null) {
            this.e.H().B0();
            activityLifecycleCallbacks.onActivitySaveInstanceState((Activity)ax.T5.b.B(a8), bundle);
        }
        try {
            m02.n(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.e.k().L().b("Error returning bundle value to wrapper", (Object)remoteException);
            return;
        }
    }

    @Override
    public void onActivityStarted(ax.T5.a a8, long l8) throws RemoteException {
        this.w();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.e.H().o0();
        if (activityLifecycleCallbacks != null) {
            this.e.H().B0();
            activityLifecycleCallbacks.onActivityStarted((Activity)ax.T5.b.B(a8));
        }
    }

    @Override
    public void onActivityStopped(ax.T5.a a8, long l8) throws RemoteException {
        this.w();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.e.H().o0();
        if (activityLifecycleCallbacks != null) {
            this.e.H().B0();
            activityLifecycleCallbacks.onActivityStopped((Activity)ax.T5.b.B(a8));
        }
    }

    @Override
    public void performAction(Bundle bundle, M0 m02, long l8) throws RemoteException {
        this.w();
        m02.n(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void registerOnMeasurementEventListener(N0 n02) throws RemoteException {
        this.w();
        Map<Integer, t> map = this.f;
        synchronized (map) {
            try {
                t t8;
                t t9 = t8 = this.f.get(n02.a());
                if (t8 == null) {
                    t9 = new a(this, n02);
                    this.f.put(n02.a(), t9);
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl10 : MonitorExitStatement: MONITOREXIT : var4_3
                this.e.H().Q(t9);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public void resetAnalyticsData(long l8) throws RemoteException {
        this.w();
        this.e.H().H(l8);
    }

    @Override
    public void setConditionalUserProperty(Bundle bundle, long l8) throws RemoteException {
        this.w();
        if (bundle == null) {
            this.e.k().G().a("Conditional user property must not be null");
            return;
        }
        this.e.H().L0(bundle, l8);
    }

    @Override
    public void setConsent(Bundle bundle, long l8) throws RemoteException {
        this.w();
        this.e.H().V0(bundle, l8);
    }

    @Override
    public void setConsentThirdParty(Bundle bundle, long l8) throws RemoteException {
        this.w();
        this.e.H().a1(bundle, l8);
    }

    @Override
    public void setCurrentScreen(ax.T5.a a8, String string, String string2, long l8) throws RemoteException {
        this.w();
        this.e.I().H((Activity)ax.T5.b.B(a8), string, string2);
    }

    @Override
    public void setDataCollectionEnabled(boolean bl) throws RemoteException {
        this.w();
        this.e.H().Z0(bl);
    }

    @Override
    public void setDefaultEventParameters(Bundle bundle) {
        this.w();
        this.e.H().U0(bundle);
    }

    @Override
    public void setEventInterceptor(N0 object) throws RemoteException {
        this.w();
        object = new b(this, (N0)object);
        if (this.e.l().J()) {
            this.e.H().P((r)object);
            return;
        }
        this.e.l().D(new p3(this, (b)object));
    }

    @Override
    public void setInstanceIdProvider(S0 s02) throws RemoteException {
        this.w();
    }

    @Override
    public void setMeasurementEnabled(boolean bl, long l8) throws RemoteException {
        this.w();
        this.e.H().a0(bl);
    }

    @Override
    public void setMinimumSessionDuration(long l8) throws RemoteException {
        this.w();
    }

    @Override
    public void setSessionTimeoutDuration(long l8) throws RemoteException {
        this.w();
        this.e.H().T0(l8);
    }

    @Override
    public void setSgtmDebugInfo(Intent intent) throws RemoteException {
        this.w();
        this.e.H().J(intent);
    }

    @Override
    public void setUserId(String string, long l8) throws RemoteException {
        this.w();
        this.e.H().c0(string, l8);
    }

    @Override
    public void setUserProperty(String string, String string2, ax.T5.a a8, boolean bl, long l8) throws RemoteException {
        this.w();
        a8 = ax.T5.b.B(a8);
        this.e.H().l0(string, string2, a8, bl, l8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void unregisterOnMeasurementEventListener(N0 n02) throws RemoteException {
        t t8;
        this.w();
        Object object = this.f;
        synchronized (object) {
            t8 = this.f.remove(n02.a());
        }
        object = t8;
        if (t8 == null) {
            object = new a(this, n02);
        }
        this.e.H().M0((t)object);
    }

    final class a
    implements t {
        private N0 a;
        private final AppMeasurementDynamiteService b;

        a(AppMeasurementDynamiteService appMeasurementDynamiteService, N0 n02) {
            this.b = appMeasurementDynamiteService;
            this.a = n02;
        }

        @Override
        public final void a(String string, String object, Bundle bundle, long l8) {
            try {
                this.a.g1(string, (String)object, bundle, l8);
                return;
            }
            catch (RemoteException remoteException) {
                object = this.b.e;
                if (object != null) {
                    ((E2)object).k().L().b("Event listener threw exception", (Object)remoteException);
                }
                return;
            }
        }
    }

    final class b
    implements r {
        private N0 a;
        private final AppMeasurementDynamiteService b;

        b(AppMeasurementDynamiteService appMeasurementDynamiteService, N0 n02) {
            this.b = appMeasurementDynamiteService;
            this.a = n02;
        }

        @Override
        public final void a(String string, String object, Bundle bundle, long l8) {
            try {
                this.a.g1(string, (String)object, bundle, l8);
                return;
            }
            catch (RemoteException remoteException) {
                object = this.b.e;
                if (object != null) {
                    ((E2)object).k().L().b("Event interceptor threw exception", (Object)remoteException);
                }
                return;
            }
        }
    }
}

