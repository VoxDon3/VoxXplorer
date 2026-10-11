package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import ax.M5.C0821p;
import ax.f6.InterfaceC2070r;
import ax.f6.InterfaceC2072t;
import com.google.android.gms.common.util.DynamiteApi;
import java.util.Map;

@DynamiteApi
/* loaded from: classes3.dex */
public class AppMeasurementDynamiteService extends ax.b6.K0 {
    E2 e = null;
    private final Map<Integer, InterfaceC2072t> f = new ax.B.a();

    class a implements InterfaceC2072t {
        private ax.b6.N0 a;

        a(ax.b6.N0 n0) {
            this.a = n0;
        }

        @Override // ax.f6.InterfaceC2072t
        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.a.g1(str, str2, bundle, j);
            } catch (RemoteException e) {
                E2 e2 = AppMeasurementDynamiteService.this.e;
                if (e2 != null) {
                    e2.k().L().b("Event listener threw exception", e);
                }
            }
        }
    }

    class b implements InterfaceC2070r {
        private ax.b6.N0 a;

        b(ax.b6.N0 n0) {
            this.a = n0;
        }

        @Override // ax.f6.InterfaceC2070r
        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.a.g1(str, str2, bundle, j);
            } catch (RemoteException e) {
                E2 e2 = AppMeasurementDynamiteService.this.e;
                if (e2 != null) {
                    e2.k().L().b("Event interceptor threw exception", e);
                }
            }
        }
    }

    private final void B(ax.b6.M0 m0, String str) {
        w();
        this.e.L().S(m0, str);
    }

    private final void w() {
        if (this.e == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // ax.b6.H0
    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        w();
        this.e.y().z(str, j);
    }

    @Override // ax.b6.H0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        w();
        this.e.H().g0(str, str2, bundle);
    }

    @Override // ax.b6.H0
    public void clearMeasurementEnabled(long j) throws RemoteException {
        w();
        this.e.H().a0(null);
    }

    @Override // ax.b6.H0
    public void endAdUnitExposure(String str, long j) throws RemoteException {
        w();
        this.e.y().D(str, j);
    }

    @Override // ax.b6.H0
    public void generateEventId(ax.b6.M0 m0) throws RemoteException {
        w();
        long R0 = this.e.L().R0();
        w();
        this.e.L().Q(m0, R0);
    }

    @Override // ax.b6.H0
    public void getAppInstanceId(ax.b6.M0 m0) throws RemoteException {
        w();
        this.e.l().D(new V2(this, m0));
    }

    @Override // ax.b6.H0
    public void getCachedAppInstanceId(ax.b6.M0 m0) throws RemoteException {
        w();
        B(m0, this.e.H().u0());
    }

    @Override // ax.b6.H0
    public void getConditionalUserProperties(String str, String str2, ax.b6.M0 m0) throws RemoteException {
        w();
        this.e.l().D(new N4(this, m0, str, str2));
    }

    @Override // ax.b6.H0
    public void getCurrentScreenClass(ax.b6.M0 m0) throws RemoteException {
        w();
        B(m0, this.e.H().v0());
    }

    @Override // ax.b6.H0
    public void getCurrentScreenName(ax.b6.M0 m0) throws RemoteException {
        w();
        B(m0, this.e.H().w0());
    }

    @Override // ax.b6.H0
    public void getGmpAppId(ax.b6.M0 m0) throws RemoteException {
        w();
        B(m0, this.e.H().x0());
    }

    @Override // ax.b6.H0
    public void getMaxUserProperties(String str, ax.b6.M0 m0) throws RemoteException {
        w();
        this.e.H();
        C3688k3.D(str);
        w();
        this.e.L().P(m0, 25);
    }

    @Override // ax.b6.H0
    public void getSessionId(ax.b6.M0 m0) throws RemoteException {
        w();
        this.e.H().O(m0);
    }

    @Override // ax.b6.H0
    public void getTestFlag(ax.b6.M0 m0, int i) throws RemoteException {
        w();
        if (i == 0) {
            this.e.L().S(m0, this.e.H().y0());
            return;
        }
        if (i == 1) {
            this.e.L().Q(m0, this.e.H().t0().longValue());
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.e.L().P(m0, this.e.H().s0().intValue());
                return;
            } else {
                if (i != 4) {
                    return;
                }
                this.e.L().U(m0, this.e.H().q0().booleanValue());
                return;
            }
        }
        B5 L = this.e.L();
        double doubleValue = this.e.H().r0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", doubleValue);
        try {
            m0.n(bundle);
        } catch (RemoteException e) {
            L.a.k().L().b("Error returning double value to wrapper", e);
        }
    }

    @Override // ax.b6.H0
    public void getUserProperties(String str, String str2, boolean z, ax.b6.M0 m0) throws RemoteException {
        w();
        this.e.l().D(new O3(this, m0, str, str2, z));
    }

    @Override // ax.b6.H0
    public void initForTests(Map map) throws RemoteException {
        w();
    }

    @Override // ax.b6.H0
    public void initialize(ax.T5.a aVar, ax.b6.U0 u0, long j) throws RemoteException {
        E2 e2 = this.e;
        if (e2 == null) {
            this.e = E2.c((Context) C0821p.l((Context) ax.T5.b.B(aVar)), u0, Long.valueOf(j));
        } else {
            e2.k().L().a("Attempting to initialize multiple times");
        }
    }

    @Override // ax.b6.H0
    public void isDataCollectionEnabled(ax.b6.M0 m0) throws RemoteException {
        w();
        this.e.l().D(new RunnableC3710n4(this, m0));
    }

    @Override // ax.b6.H0
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        w();
        this.e.H().i0(str, str2, bundle, z, z2, j);
    }

    @Override // ax.b6.H0
    public void logEventAndBundle(String str, String str2, Bundle bundle, ax.b6.M0 m0, long j) throws RemoteException {
        w();
        C0821p.f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.e.l().D(new RunnableC3761w2(this, m0, new D(str2, new C(bundle), "app", j), str));
    }

    @Override // ax.b6.H0
    public void logHealthData(int i, String str, ax.T5.a aVar, ax.T5.a aVar2, ax.T5.a aVar3) throws RemoteException {
        w();
        this.e.k().z(i, true, false, str, aVar == null ? null : ax.T5.b.B(aVar), aVar2 == null ? null : ax.T5.b.B(aVar2), aVar3 != null ? ax.T5.b.B(aVar3) : null);
    }

    @Override // ax.b6.H0
    public void onActivityCreated(ax.T5.a aVar, Bundle bundle, long j) throws RemoteException {
        w();
        Application.ActivityLifecycleCallbacks o0 = this.e.H().o0();
        if (o0 != null) {
            this.e.H().B0();
            o0.onActivityCreated((Activity) ax.T5.b.B(aVar), bundle);
        }
    }

    @Override // ax.b6.H0
    public void onActivityDestroyed(ax.T5.a aVar, long j) throws RemoteException {
        w();
        Application.ActivityLifecycleCallbacks o0 = this.e.H().o0();
        if (o0 != null) {
            this.e.H().B0();
            o0.onActivityDestroyed((Activity) ax.T5.b.B(aVar));
        }
    }

    @Override // ax.b6.H0
    public void onActivityPaused(ax.T5.a aVar, long j) throws RemoteException {
        w();
        Application.ActivityLifecycleCallbacks o0 = this.e.H().o0();
        if (o0 != null) {
            this.e.H().B0();
            o0.onActivityPaused((Activity) ax.T5.b.B(aVar));
        }
    }

    @Override // ax.b6.H0
    public void onActivityResumed(ax.T5.a aVar, long j) throws RemoteException {
        w();
        Application.ActivityLifecycleCallbacks o0 = this.e.H().o0();
        if (o0 != null) {
            this.e.H().B0();
            o0.onActivityResumed((Activity) ax.T5.b.B(aVar));
        }
    }

    @Override // ax.b6.H0
    public void onActivitySaveInstanceState(ax.T5.a aVar, ax.b6.M0 m0, long j) throws RemoteException {
        w();
        Application.ActivityLifecycleCallbacks o0 = this.e.H().o0();
        Bundle bundle = new Bundle();
        if (o0 != null) {
            this.e.H().B0();
            o0.onActivitySaveInstanceState((Activity) ax.T5.b.B(aVar), bundle);
        }
        try {
            m0.n(bundle);
        } catch (RemoteException e) {
            this.e.k().L().b("Error returning bundle value to wrapper", e);
        }
    }

    @Override // ax.b6.H0
    public void onActivityStarted(ax.T5.a aVar, long j) throws RemoteException {
        w();
        Application.ActivityLifecycleCallbacks o0 = this.e.H().o0();
        if (o0 != null) {
            this.e.H().B0();
            o0.onActivityStarted((Activity) ax.T5.b.B(aVar));
        }
    }

    @Override // ax.b6.H0
    public void onActivityStopped(ax.T5.a aVar, long j) throws RemoteException {
        w();
        Application.ActivityLifecycleCallbacks o0 = this.e.H().o0();
        if (o0 != null) {
            this.e.H().B0();
            o0.onActivityStopped((Activity) ax.T5.b.B(aVar));
        }
    }

    @Override // ax.b6.H0
    public void performAction(Bundle bundle, ax.b6.M0 m0, long j) throws RemoteException {
        w();
        m0.n(null);
    }

    @Override // ax.b6.H0
    public void registerOnMeasurementEventListener(ax.b6.N0 n0) throws RemoteException {
        InterfaceC2072t interfaceC2072t;
        w();
        synchronized (this.f) {
            try {
                interfaceC2072t = this.f.get(Integer.valueOf(n0.a()));
                if (interfaceC2072t == null) {
                    interfaceC2072t = new a(n0);
                    this.f.put(Integer.valueOf(n0.a()), interfaceC2072t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e.H().Q(interfaceC2072t);
    }

    @Override // ax.b6.H0
    public void resetAnalyticsData(long j) throws RemoteException {
        w();
        this.e.H().H(j);
    }

    @Override // ax.b6.H0
    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        w();
        if (bundle == null) {
            this.e.k().G().a("Conditional user property must not be null");
        } else {
            this.e.H().L0(bundle, j);
        }
    }

    @Override // ax.b6.H0
    public void setConsent(Bundle bundle, long j) throws RemoteException {
        w();
        this.e.H().V0(bundle, j);
    }

    @Override // ax.b6.H0
    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        w();
        this.e.H().a1(bundle, j);
    }

    @Override // ax.b6.H0
    public void setCurrentScreen(ax.T5.a aVar, String str, String str2, long j) throws RemoteException {
        w();
        this.e.I().H((Activity) ax.T5.b.B(aVar), str, str2);
    }

    @Override // ax.b6.H0
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        w();
        this.e.H().Z0(z);
    }

    @Override // ax.b6.H0
    public void setDefaultEventParameters(Bundle bundle) {
        w();
        this.e.H().U0(bundle);
    }

    @Override // ax.b6.H0
    public void setEventInterceptor(ax.b6.N0 n0) throws RemoteException {
        w();
        b bVar = new b(n0);
        if (this.e.l().J()) {
            this.e.H().P(bVar);
        } else {
            this.e.l().D(new RunnableC3721p3(this, bVar));
        }
    }

    @Override // ax.b6.H0
    public void setInstanceIdProvider(ax.b6.S0 s0) throws RemoteException {
        w();
    }

    @Override // ax.b6.H0
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        w();
        this.e.H().a0(Boolean.valueOf(z));
    }

    @Override // ax.b6.H0
    public void setMinimumSessionDuration(long j) throws RemoteException {
        w();
    }

    @Override // ax.b6.H0
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        w();
        this.e.H().T0(j);
    }

    @Override // ax.b6.H0
    public void setSgtmDebugInfo(Intent intent) throws RemoteException {
        w();
        this.e.H().J(intent);
    }

    @Override // ax.b6.H0
    public void setUserId(String str, long j) throws RemoteException {
        w();
        this.e.H().c0(str, j);
    }

    @Override // ax.b6.H0
    public void setUserProperty(String str, String str2, ax.T5.a aVar, boolean z, long j) throws RemoteException {
        w();
        this.e.H().l0(str, str2, ax.T5.b.B(aVar), z, j);
    }

    @Override // ax.b6.H0
    public void unregisterOnMeasurementEventListener(ax.b6.N0 n0) throws RemoteException {
        InterfaceC2072t remove;
        w();
        synchronized (this.f) {
            remove = this.f.remove(Integer.valueOf(n0.a()));
        }
        if (remove == null) {
            remove = new a(n0);
        }
        this.e.H().M0(remove);
    }
}
