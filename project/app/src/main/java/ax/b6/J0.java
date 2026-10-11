/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import ax.T5.a;
import ax.b6.H0;
import ax.b6.M0;
import ax.b6.N0;
import ax.b6.U0;
import ax.b6.Y;
import ax.b6.a0;

public final class J0
extends Y
implements H0 {
    J0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override
    public final void beginAdUnitExposure(String string, long l8) throws RemoteException {
        Parcel parcel = this.r();
        parcel.writeString(string);
        parcel.writeLong(l8);
        this.B(23, parcel);
    }

    @Override
    public final void clearConditionalUserProperty(String string, String string2, Bundle bundle) throws RemoteException {
        Parcel parcel = this.r();
        parcel.writeString(string);
        parcel.writeString(string2);
        a0.d(parcel, (Parcelable)bundle);
        this.B(9, parcel);
    }

    @Override
    public final void clearMeasurementEnabled(long l8) throws RemoteException {
        Parcel parcel = this.r();
        parcel.writeLong(l8);
        this.B(43, parcel);
    }

    @Override
    public final void endAdUnitExposure(String string, long l8) throws RemoteException {
        Parcel parcel = this.r();
        parcel.writeString(string);
        parcel.writeLong(l8);
        this.B(24, parcel);
    }

    @Override
    public final void generateEventId(M0 m02) throws RemoteException {
        Parcel parcel = this.r();
        a0.c(parcel, m02);
        this.B(22, parcel);
    }

    @Override
    public final void getCachedAppInstanceId(M0 m02) throws RemoteException {
        Parcel parcel = this.r();
        a0.c(parcel, m02);
        this.B(19, parcel);
    }

    @Override
    public final void getConditionalUserProperties(String string, String string2, M0 m02) throws RemoteException {
        Parcel parcel = this.r();
        parcel.writeString(string);
        parcel.writeString(string2);
        a0.c(parcel, m02);
        this.B(10, parcel);
    }

    @Override
    public final void getCurrentScreenClass(M0 m02) throws RemoteException {
        Parcel parcel = this.r();
        a0.c(parcel, m02);
        this.B(17, parcel);
    }

    @Override
    public final void getCurrentScreenName(M0 m02) throws RemoteException {
        Parcel parcel = this.r();
        a0.c(parcel, m02);
        this.B(16, parcel);
    }

    @Override
    public final void getGmpAppId(M0 m02) throws RemoteException {
        Parcel parcel = this.r();
        a0.c(parcel, m02);
        this.B(21, parcel);
    }

    @Override
    public final void getMaxUserProperties(String string, M0 m02) throws RemoteException {
        Parcel parcel = this.r();
        parcel.writeString(string);
        a0.c(parcel, m02);
        this.B(6, parcel);
    }

    @Override
    public final void getUserProperties(String string, String string2, boolean bl, M0 m02) throws RemoteException {
        Parcel parcel = this.r();
        parcel.writeString(string);
        parcel.writeString(string2);
        a0.e(parcel, bl);
        a0.c(parcel, m02);
        this.B(5, parcel);
    }

    @Override
    public final void initialize(a a8, U0 u02, long l8) throws RemoteException {
        Parcel parcel = this.r();
        a0.c(parcel, a8);
        a0.d(parcel, u02);
        parcel.writeLong(l8);
        this.B(1, parcel);
    }

    @Override
    public final void logEvent(String string, String string2, Bundle bundle, boolean bl, boolean bl2, long l8) throws RemoteException {
        Parcel parcel = this.r();
        parcel.writeString(string);
        parcel.writeString(string2);
        a0.d(parcel, (Parcelable)bundle);
        a0.e(parcel, bl);
        a0.e(parcel, bl2);
        parcel.writeLong(l8);
        this.B(2, parcel);
    }

    @Override
    public final void logHealthData(int n8, String string, a a8, a a9, a a10) throws RemoteException {
        Parcel parcel = this.r();
        parcel.writeInt(n8);
        parcel.writeString(string);
        a0.c(parcel, a8);
        a0.c(parcel, a9);
        a0.c(parcel, a10);
        this.B(33, parcel);
    }

    @Override
    public final void onActivityCreated(a a8, Bundle bundle, long l8) throws RemoteException {
        Parcel parcel = this.r();
        a0.c(parcel, a8);
        a0.d(parcel, (Parcelable)bundle);
        parcel.writeLong(l8);
        this.B(27, parcel);
    }

    @Override
    public final void onActivityDestroyed(a a8, long l8) throws RemoteException {
        Parcel parcel = this.r();
        a0.c(parcel, a8);
        parcel.writeLong(l8);
        this.B(28, parcel);
    }

    @Override
    public final void onActivityPaused(a a8, long l8) throws RemoteException {
        Parcel parcel = this.r();
        a0.c(parcel, a8);
        parcel.writeLong(l8);
        this.B(29, parcel);
    }

    @Override
    public final void onActivityResumed(a a8, long l8) throws RemoteException {
        Parcel parcel = this.r();
        a0.c(parcel, a8);
        parcel.writeLong(l8);
        this.B(30, parcel);
    }

    @Override
    public final void onActivitySaveInstanceState(a a8, M0 m02, long l8) throws RemoteException {
        Parcel parcel = this.r();
        a0.c(parcel, a8);
        a0.c(parcel, m02);
        parcel.writeLong(l8);
        this.B(31, parcel);
    }

    @Override
    public final void onActivityStarted(a a8, long l8) throws RemoteException {
        Parcel parcel = this.r();
        a0.c(parcel, a8);
        parcel.writeLong(l8);
        this.B(25, parcel);
    }

    @Override
    public final void onActivityStopped(a a8, long l8) throws RemoteException {
        Parcel parcel = this.r();
        a0.c(parcel, a8);
        parcel.writeLong(l8);
        this.B(26, parcel);
    }

    @Override
    public final void registerOnMeasurementEventListener(N0 n02) throws RemoteException {
        Parcel parcel = this.r();
        a0.c(parcel, n02);
        this.B(35, parcel);
    }

    @Override
    public final void setConditionalUserProperty(Bundle bundle, long l8) throws RemoteException {
        Parcel parcel = this.r();
        a0.d(parcel, (Parcelable)bundle);
        parcel.writeLong(l8);
        this.B(8, parcel);
    }

    @Override
    public final void setCurrentScreen(a a8, String string, String string2, long l8) throws RemoteException {
        Parcel parcel = this.r();
        a0.c(parcel, a8);
        parcel.writeString(string);
        parcel.writeString(string2);
        parcel.writeLong(l8);
        this.B(15, parcel);
    }

    @Override
    public final void setDataCollectionEnabled(boolean bl) throws RemoteException {
        Parcel parcel = this.r();
        a0.e(parcel, bl);
        this.B(39, parcel);
    }

    @Override
    public final void setMeasurementEnabled(boolean bl, long l8) throws RemoteException {
        Parcel parcel = this.r();
        a0.e(parcel, bl);
        parcel.writeLong(l8);
        this.B(11, parcel);
    }

    @Override
    public final void setUserProperty(String string, String string2, a a8, boolean bl, long l8) throws RemoteException {
        Parcel parcel = this.r();
        parcel.writeString(string);
        parcel.writeString(string2);
        a0.c(parcel, a8);
        a0.e(parcel, bl);
        parcel.writeLong(l8);
        this.B(4, parcel);
    }
}

