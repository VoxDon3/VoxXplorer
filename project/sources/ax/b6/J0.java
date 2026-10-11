package ax.b6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class J0 extends Y implements H0 {
    J0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // ax.b6.H0
    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel r = r();
        r.writeString(str);
        r.writeLong(j);
        B(23, r);
    }

    @Override // ax.b6.H0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel r = r();
        r.writeString(str);
        r.writeString(str2);
        C1505a0.d(r, bundle);
        B(9, r);
    }

    @Override // ax.b6.H0
    public final void clearMeasurementEnabled(long j) throws RemoteException {
        Parcel r = r();
        r.writeLong(j);
        B(43, r);
    }

    @Override // ax.b6.H0
    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel r = r();
        r.writeString(str);
        r.writeLong(j);
        B(24, r);
    }

    @Override // ax.b6.H0
    public final void generateEventId(M0 m0) throws RemoteException {
        Parcel r = r();
        C1505a0.c(r, m0);
        B(22, r);
    }

    @Override // ax.b6.H0
    public final void getCachedAppInstanceId(M0 m0) throws RemoteException {
        Parcel r = r();
        C1505a0.c(r, m0);
        B(19, r);
    }

    @Override // ax.b6.H0
    public final void getConditionalUserProperties(String str, String str2, M0 m0) throws RemoteException {
        Parcel r = r();
        r.writeString(str);
        r.writeString(str2);
        C1505a0.c(r, m0);
        B(10, r);
    }

    @Override // ax.b6.H0
    public final void getCurrentScreenClass(M0 m0) throws RemoteException {
        Parcel r = r();
        C1505a0.c(r, m0);
        B(17, r);
    }

    @Override // ax.b6.H0
    public final void getCurrentScreenName(M0 m0) throws RemoteException {
        Parcel r = r();
        C1505a0.c(r, m0);
        B(16, r);
    }

    @Override // ax.b6.H0
    public final void getGmpAppId(M0 m0) throws RemoteException {
        Parcel r = r();
        C1505a0.c(r, m0);
        B(21, r);
    }

    @Override // ax.b6.H0
    public final void getMaxUserProperties(String str, M0 m0) throws RemoteException {
        Parcel r = r();
        r.writeString(str);
        C1505a0.c(r, m0);
        B(6, r);
    }

    @Override // ax.b6.H0
    public final void getUserProperties(String str, String str2, boolean z, M0 m0) throws RemoteException {
        Parcel r = r();
        r.writeString(str);
        r.writeString(str2);
        C1505a0.e(r, z);
        C1505a0.c(r, m0);
        B(5, r);
    }

    @Override // ax.b6.H0
    public final void initialize(ax.T5.a aVar, U0 u0, long j) throws RemoteException {
        Parcel r = r();
        C1505a0.c(r, aVar);
        C1505a0.d(r, u0);
        r.writeLong(j);
        B(1, r);
    }

    @Override // ax.b6.H0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel r = r();
        r.writeString(str);
        r.writeString(str2);
        C1505a0.d(r, bundle);
        C1505a0.e(r, z);
        C1505a0.e(r, z2);
        r.writeLong(j);
        B(2, r);
    }

    @Override // ax.b6.H0
    public final void logHealthData(int i, String str, ax.T5.a aVar, ax.T5.a aVar2, ax.T5.a aVar3) throws RemoteException {
        Parcel r = r();
        r.writeInt(i);
        r.writeString(str);
        C1505a0.c(r, aVar);
        C1505a0.c(r, aVar2);
        C1505a0.c(r, aVar3);
        B(33, r);
    }

    @Override // ax.b6.H0
    public final void onActivityCreated(ax.T5.a aVar, Bundle bundle, long j) throws RemoteException {
        Parcel r = r();
        C1505a0.c(r, aVar);
        C1505a0.d(r, bundle);
        r.writeLong(j);
        B(27, r);
    }

    @Override // ax.b6.H0
    public final void onActivityDestroyed(ax.T5.a aVar, long j) throws RemoteException {
        Parcel r = r();
        C1505a0.c(r, aVar);
        r.writeLong(j);
        B(28, r);
    }

    @Override // ax.b6.H0
    public final void onActivityPaused(ax.T5.a aVar, long j) throws RemoteException {
        Parcel r = r();
        C1505a0.c(r, aVar);
        r.writeLong(j);
        B(29, r);
    }

    @Override // ax.b6.H0
    public final void onActivityResumed(ax.T5.a aVar, long j) throws RemoteException {
        Parcel r = r();
        C1505a0.c(r, aVar);
        r.writeLong(j);
        B(30, r);
    }

    @Override // ax.b6.H0
    public final void onActivitySaveInstanceState(ax.T5.a aVar, M0 m0, long j) throws RemoteException {
        Parcel r = r();
        C1505a0.c(r, aVar);
        C1505a0.c(r, m0);
        r.writeLong(j);
        B(31, r);
    }

    @Override // ax.b6.H0
    public final void onActivityStarted(ax.T5.a aVar, long j) throws RemoteException {
        Parcel r = r();
        C1505a0.c(r, aVar);
        r.writeLong(j);
        B(25, r);
    }

    @Override // ax.b6.H0
    public final void onActivityStopped(ax.T5.a aVar, long j) throws RemoteException {
        Parcel r = r();
        C1505a0.c(r, aVar);
        r.writeLong(j);
        B(26, r);
    }

    @Override // ax.b6.H0
    public final void registerOnMeasurementEventListener(N0 n0) throws RemoteException {
        Parcel r = r();
        C1505a0.c(r, n0);
        B(35, r);
    }

    @Override // ax.b6.H0
    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel r = r();
        C1505a0.d(r, bundle);
        r.writeLong(j);
        B(8, r);
    }

    @Override // ax.b6.H0
    public final void setCurrentScreen(ax.T5.a aVar, String str, String str2, long j) throws RemoteException {
        Parcel r = r();
        C1505a0.c(r, aVar);
        r.writeString(str);
        r.writeString(str2);
        r.writeLong(j);
        B(15, r);
    }

    @Override // ax.b6.H0
    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel r = r();
        C1505a0.e(r, z);
        B(39, r);
    }

    @Override // ax.b6.H0
    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel r = r();
        C1505a0.e(r, z);
        r.writeLong(j);
        B(11, r);
    }

    @Override // ax.b6.H0
    public final void setUserProperty(String str, String str2, ax.T5.a aVar, boolean z, long j) throws RemoteException {
        Parcel r = r();
        r.writeString(str);
        r.writeString(str2);
        C1505a0.c(r, aVar);
        C1505a0.e(r, z);
        r.writeLong(j);
        B(4, r);
    }
}
