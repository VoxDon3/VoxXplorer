package ax.b6;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import ax.T5.a;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class K0 extends BinderC1514b0 implements H0 {
    public K0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static H0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof H0 ? (H0) queryLocalInterface : new J0(iBinder);
    }

    @Override // ax.b6.BinderC1514b0
    protected final boolean r(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        M0 m0 = null;
        M0 m02 = null;
        M0 m03 = null;
        M0 m04 = null;
        N0 n0 = null;
        N0 n02 = null;
        N0 n03 = null;
        M0 m05 = null;
        M0 m06 = null;
        M0 m07 = null;
        M0 m08 = null;
        M0 m09 = null;
        M0 m010 = null;
        S0 s0 = null;
        M0 m011 = null;
        M0 m012 = null;
        M0 m013 = null;
        M0 m014 = null;
        M0 m015 = null;
        switch (i) {
            case 1:
                ax.T5.a w = a.AbstractBinderC0196a.w(parcel.readStrongBinder());
                U0 u0 = (U0) C1505a0.a(parcel, U0.CREATOR);
                long readLong = parcel.readLong();
                C1505a0.f(parcel);
                initialize(w, u0, readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) C1505a0.a(parcel, Bundle.CREATOR);
                boolean h = C1505a0.h(parcel);
                boolean h2 = C1505a0.h(parcel);
                long readLong2 = parcel.readLong();
                C1505a0.f(parcel);
                logEvent(readString, readString2, bundle, h, h2, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) C1505a0.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m0 = queryLocalInterface instanceof M0 ? (M0) queryLocalInterface : new O0(readStrongBinder);
                }
                long readLong3 = parcel.readLong();
                C1505a0.f(parcel);
                logEventAndBundle(readString3, readString4, bundle2, m0, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                ax.T5.a w2 = a.AbstractBinderC0196a.w(parcel.readStrongBinder());
                boolean h3 = C1505a0.h(parcel);
                long readLong4 = parcel.readLong();
                C1505a0.f(parcel);
                setUserProperty(readString5, readString6, w2, h3, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean h4 = C1505a0.h(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m015 = queryLocalInterface2 instanceof M0 ? (M0) queryLocalInterface2 : new O0(readStrongBinder2);
                }
                C1505a0.f(parcel);
                getUserProperties(readString7, readString8, h4, m015);
                break;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m014 = queryLocalInterface3 instanceof M0 ? (M0) queryLocalInterface3 : new O0(readStrongBinder3);
                }
                C1505a0.f(parcel);
                getMaxUserProperties(readString9, m014);
                break;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                C1505a0.f(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) C1505a0.a(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                C1505a0.f(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                break;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) C1505a0.a(parcel, Bundle.CREATOR);
                C1505a0.f(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                break;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m013 = queryLocalInterface4 instanceof M0 ? (M0) queryLocalInterface4 : new O0(readStrongBinder4);
                }
                C1505a0.f(parcel);
                getConditionalUserProperties(readString13, readString14, m013);
                break;
            case 11:
                boolean h5 = C1505a0.h(parcel);
                long readLong7 = parcel.readLong();
                C1505a0.f(parcel);
                setMeasurementEnabled(h5, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                C1505a0.f(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                C1505a0.f(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                C1505a0.f(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                ax.T5.a w3 = a.AbstractBinderC0196a.w(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                C1505a0.f(parcel);
                setCurrentScreen(w3, readString15, readString16, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m012 = queryLocalInterface5 instanceof M0 ? (M0) queryLocalInterface5 : new O0(readStrongBinder5);
                }
                C1505a0.f(parcel);
                getCurrentScreenName(m012);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m011 = queryLocalInterface6 instanceof M0 ? (M0) queryLocalInterface6 : new O0(readStrongBinder6);
                }
                C1505a0.f(parcel);
                getCurrentScreenClass(m011);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    s0 = queryLocalInterface7 instanceof S0 ? (S0) queryLocalInterface7 : new R0(readStrongBinder7);
                }
                C1505a0.f(parcel);
                setInstanceIdProvider(s0);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m010 = queryLocalInterface8 instanceof M0 ? (M0) queryLocalInterface8 : new O0(readStrongBinder8);
                }
                C1505a0.f(parcel);
                getCachedAppInstanceId(m010);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m09 = queryLocalInterface9 instanceof M0 ? (M0) queryLocalInterface9 : new O0(readStrongBinder9);
                }
                C1505a0.f(parcel);
                getAppInstanceId(m09);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m08 = queryLocalInterface10 instanceof M0 ? (M0) queryLocalInterface10 : new O0(readStrongBinder10);
                }
                C1505a0.f(parcel);
                getGmpAppId(m08);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m07 = queryLocalInterface11 instanceof M0 ? (M0) queryLocalInterface11 : new O0(readStrongBinder11);
                }
                C1505a0.f(parcel);
                generateEventId(m07);
                break;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                C1505a0.f(parcel);
                beginAdUnitExposure(readString17, readLong12);
                break;
            case 24:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                C1505a0.f(parcel);
                endAdUnitExposure(readString18, readLong13);
                break;
            case 25:
                ax.T5.a w4 = a.AbstractBinderC0196a.w(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                C1505a0.f(parcel);
                onActivityStarted(w4, readLong14);
                break;
            case 26:
                ax.T5.a w5 = a.AbstractBinderC0196a.w(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                C1505a0.f(parcel);
                onActivityStopped(w5, readLong15);
                break;
            case 27:
                ax.T5.a w6 = a.AbstractBinderC0196a.w(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) C1505a0.a(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                C1505a0.f(parcel);
                onActivityCreated(w6, bundle5, readLong16);
                break;
            case 28:
                ax.T5.a w7 = a.AbstractBinderC0196a.w(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                C1505a0.f(parcel);
                onActivityDestroyed(w7, readLong17);
                break;
            case 29:
                ax.T5.a w8 = a.AbstractBinderC0196a.w(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                C1505a0.f(parcel);
                onActivityPaused(w8, readLong18);
                break;
            case 30:
                ax.T5.a w9 = a.AbstractBinderC0196a.w(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                C1505a0.f(parcel);
                onActivityResumed(w9, readLong19);
                break;
            case 31:
                ax.T5.a w10 = a.AbstractBinderC0196a.w(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m06 = queryLocalInterface12 instanceof M0 ? (M0) queryLocalInterface12 : new O0(readStrongBinder12);
                }
                long readLong20 = parcel.readLong();
                C1505a0.f(parcel);
                onActivitySaveInstanceState(w10, m06, readLong20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) C1505a0.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m05 = queryLocalInterface13 instanceof M0 ? (M0) queryLocalInterface13 : new O0(readStrongBinder13);
                }
                long readLong21 = parcel.readLong();
                C1505a0.f(parcel);
                performAction(bundle6, m05, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                ax.T5.a w11 = a.AbstractBinderC0196a.w(parcel.readStrongBinder());
                ax.T5.a w12 = a.AbstractBinderC0196a.w(parcel.readStrongBinder());
                ax.T5.a w13 = a.AbstractBinderC0196a.w(parcel.readStrongBinder());
                C1505a0.f(parcel);
                logHealthData(readInt, readString19, w11, w12, w13);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    n03 = queryLocalInterface14 instanceof N0 ? (N0) queryLocalInterface14 : new P0(readStrongBinder14);
                }
                C1505a0.f(parcel);
                setEventInterceptor(n03);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    n02 = queryLocalInterface15 instanceof N0 ? (N0) queryLocalInterface15 : new P0(readStrongBinder15);
                }
                C1505a0.f(parcel);
                registerOnMeasurementEventListener(n02);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    n0 = queryLocalInterface16 instanceof N0 ? (N0) queryLocalInterface16 : new P0(readStrongBinder16);
                }
                C1505a0.f(parcel);
                unregisterOnMeasurementEventListener(n0);
                break;
            case 37:
                HashMap b = C1505a0.b(parcel);
                C1505a0.f(parcel);
                initForTests(b);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m04 = queryLocalInterface17 instanceof M0 ? (M0) queryLocalInterface17 : new O0(readStrongBinder17);
                }
                int readInt2 = parcel.readInt();
                C1505a0.f(parcel);
                getTestFlag(m04, readInt2);
                break;
            case 39:
                boolean h6 = C1505a0.h(parcel);
                C1505a0.f(parcel);
                setDataCollectionEnabled(h6);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m03 = queryLocalInterface18 instanceof M0 ? (M0) queryLocalInterface18 : new O0(readStrongBinder18);
                }
                C1505a0.f(parcel);
                isDataCollectionEnabled(m03);
                break;
            case 41:
            case 47:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) C1505a0.a(parcel, Bundle.CREATOR);
                C1505a0.f(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long readLong22 = parcel.readLong();
                C1505a0.f(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) C1505a0.a(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                C1505a0.f(parcel);
                setConsent(bundle8, readLong23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) C1505a0.a(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                C1505a0.f(parcel);
                setConsentThirdParty(bundle9, readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m02 = queryLocalInterface19 instanceof M0 ? (M0) queryLocalInterface19 : new O0(readStrongBinder19);
                }
                C1505a0.f(parcel);
                getSessionId(m02);
                break;
            case 48:
                Intent intent = (Intent) C1505a0.a(parcel, Intent.CREATOR);
                C1505a0.f(parcel);
                setSgtmDebugInfo(intent);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
