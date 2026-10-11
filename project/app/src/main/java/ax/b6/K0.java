/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import ax.T5.a;
import ax.b6.H0;
import ax.b6.J0;
import ax.b6.M0;
import ax.b6.N0;
import ax.b6.O0;
import ax.b6.P0;
import ax.b6.R0;
import ax.b6.S0;
import ax.b6.U0;
import ax.b6.a0;
import ax.b6.b0;
import java.util.Map;

public abstract class K0
extends b0
implements H0 {
    public K0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static H0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (iInterface instanceof H0) {
            return (H0)iInterface;
        }
        return new J0(iBinder);
    }

    @Override
    protected final boolean r(int n8, Parcel parcel, Parcel parcel2, int n9) throws RemoteException {
        Object var20_5 = null;
        Object var21_6 = null;
        Object var19_7 = null;
        Object var16_8 = null;
        Object var27_9 = null;
        String string = null;
        IBinder iBinder = null;
        Object var17_12 = null;
        Object var22_13 = null;
        Object var25_14 = null;
        Object var24_15 = null;
        Object var15_16 = null;
        Object var23_17 = null;
        Object var26_18 = null;
        Object object = null;
        Object var14_20 = null;
        Object object2 = null;
        Object object3 = null;
        Object var18_23 = null;
        switch (n8) {
            default: {
                return false;
            }
            case 48: {
                object3 = (Intent)a0.a(parcel, Intent.CREATOR);
                a0.f(parcel);
                this.setSgtmDebugInfo((Intent)object3);
                break;
            }
            case 46: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var18_23 : ((object = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof M0 ? (M0)object : new O0((IBinder)object3));
                a0.f(parcel);
                this.getSessionId((M0)object3);
                break;
            }
            case 45: {
                object3 = (Bundle)a0.a(parcel, Bundle.CREATOR);
                long l8 = parcel.readLong();
                a0.f(parcel);
                this.setConsentThirdParty((Bundle)object3, l8);
                break;
            }
            case 44: {
                object3 = (Bundle)a0.a(parcel, Bundle.CREATOR);
                long l9 = parcel.readLong();
                a0.f(parcel);
                this.setConsent((Bundle)object3, l9);
                break;
            }
            case 43: {
                long l10 = parcel.readLong();
                a0.f(parcel);
                this.clearMeasurementEnabled(l10);
                break;
            }
            case 42: {
                object3 = (Bundle)a0.a(parcel, Bundle.CREATOR);
                a0.f(parcel);
                this.setDefaultEventParameters((Bundle)object3);
                break;
            }
            case 40: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var20_5 : ((object = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof M0 ? (M0)object : new O0((IBinder)object3));
                a0.f(parcel);
                this.isDataCollectionEnabled((M0)object3);
                break;
            }
            case 39: {
                boolean bl = a0.h(parcel);
                a0.f(parcel);
                this.setDataCollectionEnabled(bl);
                break;
            }
            case 38: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var21_6 : ((object = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof M0 ? (M0)object : new O0((IBinder)object3));
                n8 = parcel.readInt();
                a0.f(parcel);
                this.getTestFlag((M0)object3, n8);
                break;
            }
            case 37: {
                object3 = a0.b(parcel);
                a0.f(parcel);
                this.initForTests((Map)object3);
                break;
            }
            case 36: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var19_7 : ((object = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy")) instanceof N0 ? (N0)object : new P0((IBinder)object3));
                a0.f(parcel);
                this.unregisterOnMeasurementEventListener((N0)object3);
                break;
            }
            case 35: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var16_8 : ((object = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy")) instanceof N0 ? (N0)object : new P0((IBinder)object3));
                a0.f(parcel);
                this.registerOnMeasurementEventListener((N0)object3);
                break;
            }
            case 34: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var27_9 : ((object = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy")) instanceof N0 ? (N0)object : new P0((IBinder)object3));
                a0.f(parcel);
                this.setEventInterceptor((N0)object3);
                break;
            }
            case 33: {
                n8 = parcel.readInt();
                string = parcel.readString();
                object = a.a.w(parcel.readStrongBinder());
                object3 = a.a.w(parcel.readStrongBinder());
                object2 = a.a.w(parcel.readStrongBinder());
                a0.f(parcel);
                this.logHealthData(n8, string, (a)object, (a)object3, (a)object2);
                break;
            }
            case 32: {
                object = (Bundle)a0.a(parcel, Bundle.CREATOR);
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? string : ((object2 = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof M0 ? (M0)object2 : new O0((IBinder)object3));
                long l11 = parcel.readLong();
                a0.f(parcel);
                this.performAction((Bundle)object, (M0)object3, l11);
                break;
            }
            case 31: {
                object = a.a.w(parcel.readStrongBinder());
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? iBinder : ((object2 = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof M0 ? (M0)object2 : new O0((IBinder)object3));
                long l12 = parcel.readLong();
                a0.f(parcel);
                this.onActivitySaveInstanceState((a)object, (M0)object3, l12);
                break;
            }
            case 30: {
                object3 = a.a.w(parcel.readStrongBinder());
                long l13 = parcel.readLong();
                a0.f(parcel);
                this.onActivityResumed((a)object3, l13);
                break;
            }
            case 29: {
                object3 = a.a.w(parcel.readStrongBinder());
                long l14 = parcel.readLong();
                a0.f(parcel);
                this.onActivityPaused((a)object3, l14);
                break;
            }
            case 28: {
                object3 = a.a.w(parcel.readStrongBinder());
                long l15 = parcel.readLong();
                a0.f(parcel);
                this.onActivityDestroyed((a)object3, l15);
                break;
            }
            case 27: {
                object3 = a.a.w(parcel.readStrongBinder());
                object = (Bundle)a0.a(parcel, Bundle.CREATOR);
                long l16 = parcel.readLong();
                a0.f(parcel);
                this.onActivityCreated((a)object3, (Bundle)object, l16);
                break;
            }
            case 26: {
                object3 = a.a.w(parcel.readStrongBinder());
                long l17 = parcel.readLong();
                a0.f(parcel);
                this.onActivityStopped((a)object3, l17);
                break;
            }
            case 25: {
                object3 = a.a.w(parcel.readStrongBinder());
                long l18 = parcel.readLong();
                a0.f(parcel);
                this.onActivityStarted((a)object3, l18);
                break;
            }
            case 24: {
                object3 = parcel.readString();
                long l19 = parcel.readLong();
                a0.f(parcel);
                this.endAdUnitExposure((String)object3, l19);
                break;
            }
            case 23: {
                object3 = parcel.readString();
                long l20 = parcel.readLong();
                a0.f(parcel);
                this.beginAdUnitExposure((String)object3, l20);
                break;
            }
            case 22: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var17_12 : ((object = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof M0 ? (M0)object : new O0((IBinder)object3));
                a0.f(parcel);
                this.generateEventId((M0)object3);
                break;
            }
            case 21: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var22_13 : ((object = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof M0 ? (M0)object : new O0((IBinder)object3));
                a0.f(parcel);
                this.getGmpAppId((M0)object3);
                break;
            }
            case 20: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var25_14 : ((object = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof M0 ? (M0)object : new O0((IBinder)object3));
                a0.f(parcel);
                this.getAppInstanceId((M0)object3);
                break;
            }
            case 19: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var24_15 : ((object = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof M0 ? (M0)object : new O0((IBinder)object3));
                a0.f(parcel);
                this.getCachedAppInstanceId((M0)object3);
                break;
            }
            case 18: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var15_16 : ((object = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider")) instanceof S0 ? (S0)object : new R0((IBinder)object3));
                a0.f(parcel);
                this.setInstanceIdProvider((S0)object3);
                break;
            }
            case 17: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var23_17 : ((object = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof M0 ? (M0)object : new O0((IBinder)object3));
                a0.f(parcel);
                this.getCurrentScreenClass((M0)object3);
                break;
            }
            case 16: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var26_18 : ((object = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof M0 ? (M0)object : new O0((IBinder)object3));
                a0.f(parcel);
                this.getCurrentScreenName((M0)object3);
                break;
            }
            case 15: {
                object = a.a.w(parcel.readStrongBinder());
                object3 = parcel.readString();
                object2 = parcel.readString();
                long l21 = parcel.readLong();
                a0.f(parcel);
                this.setCurrentScreen((a)object, (String)object3, (String)object2, l21);
                break;
            }
            case 14: {
                long l22 = parcel.readLong();
                a0.f(parcel);
                this.setSessionTimeoutDuration(l22);
                break;
            }
            case 13: {
                long l23 = parcel.readLong();
                a0.f(parcel);
                this.setMinimumSessionDuration(l23);
                break;
            }
            case 12: {
                long l24 = parcel.readLong();
                a0.f(parcel);
                this.resetAnalyticsData(l24);
                break;
            }
            case 11: {
                boolean bl = a0.h(parcel);
                long l25 = parcel.readLong();
                a0.f(parcel);
                this.setMeasurementEnabled(bl, l25);
                break;
            }
            case 10: {
                string = parcel.readString();
                object2 = parcel.readString();
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? object : ((object = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof M0 ? (M0)object : new O0((IBinder)object3));
                a0.f(parcel);
                this.getConditionalUserProperties(string, (String)object2, (M0)object3);
                break;
            }
            case 9: {
                object3 = parcel.readString();
                object2 = parcel.readString();
                object = (Bundle)a0.a(parcel, Bundle.CREATOR);
                a0.f(parcel);
                this.clearConditionalUserProperty((String)object3, (String)object2, (Bundle)object);
                break;
            }
            case 8: {
                object3 = (Bundle)a0.a(parcel, Bundle.CREATOR);
                long l26 = parcel.readLong();
                a0.f(parcel);
                this.setConditionalUserProperty((Bundle)object3, l26);
                break;
            }
            case 7: {
                object3 = parcel.readString();
                long l27 = parcel.readLong();
                a0.f(parcel);
                this.setUserId((String)object3, l27);
                break;
            }
            case 6: {
                object = parcel.readString();
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var14_20 : ((object2 = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof M0 ? (M0)object2 : new O0((IBinder)object3));
                a0.f(parcel);
                this.getMaxUserProperties((String)object, (M0)object3);
                break;
            }
            case 5: {
                object = parcel.readString();
                string = parcel.readString();
                boolean bl = a0.h(parcel);
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? object2 : ((object2 = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof M0 ? (M0)object2 : new O0((IBinder)object3));
                a0.f(parcel);
                this.getUserProperties((String)object, string, bl, (M0)object3);
                break;
            }
            case 4: {
                object2 = parcel.readString();
                object = parcel.readString();
                object3 = a.a.w(parcel.readStrongBinder());
                boolean bl = a0.h(parcel);
                long l28 = parcel.readLong();
                a0.f(parcel);
                this.setUserProperty((String)object2, (String)object, (a)object3, bl, l28);
                break;
            }
            case 3: {
                object = parcel.readString();
                string = parcel.readString();
                object2 = (Bundle)a0.a(parcel, Bundle.CREATOR);
                iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    object3 = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    object3 = object3 instanceof M0 ? (M0)object3 : new O0(iBinder);
                }
                long l29 = parcel.readLong();
                a0.f(parcel);
                this.logEventAndBundle((String)object, string, (Bundle)object2, (M0)object3, l29);
                break;
            }
            case 2: {
                object2 = parcel.readString();
                object3 = parcel.readString();
                object = (Bundle)a0.a(parcel, Bundle.CREATOR);
                boolean bl = a0.h(parcel);
                boolean bl2 = a0.h(parcel);
                long l30 = parcel.readLong();
                a0.f(parcel);
                this.logEvent((String)object2, (String)object3, (Bundle)object, bl, bl2, l30);
                break;
            }
            case 1: {
                object3 = a.a.w(parcel.readStrongBinder());
                object = a0.a(parcel, U0.CREATOR);
                long l31 = parcel.readLong();
                a0.f(parcel);
                this.initialize((a)object3, (U0)object, l31);
            }
        }
        parcel2.writeNoException();
        return true;
    }
}

