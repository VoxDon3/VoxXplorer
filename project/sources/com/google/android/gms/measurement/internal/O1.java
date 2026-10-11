package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import ax.b6.C1505a0;
import ax.f6.C2053a;
import ax.f6.InterfaceC2057e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class O1 extends ax.b6.Y implements InterfaceC2057e {
    O1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // ax.f6.InterfaceC2057e
    public final void A1(E5 e5) throws RemoteException {
        Parcel r = r();
        C1505a0.d(r, e5);
        B(6, r);
    }

    @Override // ax.f6.InterfaceC2057e
    public final List<C3669h5> B1(E5 e5, Bundle bundle) throws RemoteException {
        Parcel r = r();
        C1505a0.d(r, e5);
        C1505a0.d(r, bundle);
        Parcel w = w(24, r);
        ArrayList createTypedArrayList = w.createTypedArrayList(C3669h5.CREATOR);
        w.recycle();
        return createTypedArrayList;
    }

    @Override // ax.f6.InterfaceC2057e
    public final List<C3649f> F(String str, String str2, E5 e5) throws RemoteException {
        Parcel r = r();
        r.writeString(str);
        r.writeString(str2);
        C1505a0.d(r, e5);
        Parcel w = w(16, r);
        ArrayList createTypedArrayList = w.createTypedArrayList(C3649f.CREATOR);
        w.recycle();
        return createTypedArrayList;
    }

    @Override // ax.f6.InterfaceC2057e
    public final void F0(long j, String str, String str2, String str3) throws RemoteException {
        Parcel r = r();
        r.writeLong(j);
        r.writeString(str);
        r.writeString(str2);
        r.writeString(str3);
        B(10, r);
    }

    @Override // ax.f6.InterfaceC2057e
    public final void I(E5 e5) throws RemoteException {
        Parcel r = r();
        C1505a0.d(r, e5);
        B(18, r);
    }

    @Override // ax.f6.InterfaceC2057e
    public final void I0(E5 e5) throws RemoteException {
        Parcel r = r();
        C1505a0.d(r, e5);
        B(4, r);
    }

    @Override // ax.f6.InterfaceC2057e
    public final List<C3649f> J0(String str, String str2, String str3) throws RemoteException {
        Parcel r = r();
        r.writeString(str);
        r.writeString(str2);
        r.writeString(str3);
        Parcel w = w(17, r);
        ArrayList createTypedArrayList = w.createTypedArrayList(C3649f.CREATOR);
        w.recycle();
        return createTypedArrayList;
    }

    @Override // ax.f6.InterfaceC2057e
    public final void M0(C3649f c3649f) throws RemoteException {
        Parcel r = r();
        C1505a0.d(r, c3649f);
        B(13, r);
    }

    @Override // ax.f6.InterfaceC2057e
    public final void N(D d, String str, String str2) throws RemoteException {
        Parcel r = r();
        C1505a0.d(r, d);
        r.writeString(str);
        r.writeString(str2);
        B(5, r);
    }

    @Override // ax.f6.InterfaceC2057e
    public final void P(A5 a5, E5 e5) throws RemoteException {
        Parcel r = r();
        C1505a0.d(r, a5);
        C1505a0.d(r, e5);
        B(2, r);
    }

    @Override // ax.f6.InterfaceC2057e
    public final void U1(E5 e5) throws RemoteException {
        Parcel r = r();
        C1505a0.d(r, e5);
        B(25, r);
    }

    @Override // ax.f6.InterfaceC2057e
    public final List<A5> Z(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel r = r();
        r.writeString(str);
        r.writeString(str2);
        r.writeString(str3);
        C1505a0.e(r, z);
        Parcel w = w(15, r);
        ArrayList createTypedArrayList = w.createTypedArrayList(A5.CREATOR);
        w.recycle();
        return createTypedArrayList;
    }

    @Override // ax.f6.InterfaceC2057e
    public final void f0(E5 e5) throws RemoteException {
        Parcel r = r();
        C1505a0.d(r, e5);
        B(20, r);
    }

    @Override // ax.f6.InterfaceC2057e
    public final void g0(Bundle bundle, E5 e5) throws RemoteException {
        Parcel r = r();
        C1505a0.d(r, bundle);
        C1505a0.d(r, e5);
        B(19, r);
    }

    @Override // ax.f6.InterfaceC2057e
    public final void h0(E5 e5) throws RemoteException {
        Parcel r = r();
        C1505a0.d(r, e5);
        B(26, r);
    }

    @Override // ax.f6.InterfaceC2057e
    public final byte[] h1(D d, String str) throws RemoteException {
        Parcel r = r();
        C1505a0.d(r, d);
        r.writeString(str);
        Parcel w = w(9, r);
        byte[] createByteArray = w.createByteArray();
        w.recycle();
        return createByteArray;
    }

    @Override // ax.f6.InterfaceC2057e
    public final C2053a k1(E5 e5) throws RemoteException {
        Parcel r = r();
        C1505a0.d(r, e5);
        Parcel w = w(21, r);
        C2053a c2053a = (C2053a) C1505a0.a(w, C2053a.CREATOR);
        w.recycle();
        return c2053a;
    }

    @Override // ax.f6.InterfaceC2057e
    public final String p0(E5 e5) throws RemoteException {
        Parcel r = r();
        C1505a0.d(r, e5);
        Parcel w = w(11, r);
        String readString = w.readString();
        w.recycle();
        return readString;
    }

    @Override // ax.f6.InterfaceC2057e
    public final List<A5> u1(String str, String str2, boolean z, E5 e5) throws RemoteException {
        Parcel r = r();
        r.writeString(str);
        r.writeString(str2);
        C1505a0.e(r, z);
        C1505a0.d(r, e5);
        Parcel w = w(14, r);
        ArrayList createTypedArrayList = w.createTypedArrayList(A5.CREATOR);
        w.recycle();
        return createTypedArrayList;
    }

    @Override // ax.f6.InterfaceC2057e
    public final void w1(D d, E5 e5) throws RemoteException {
        Parcel r = r();
        C1505a0.d(r, d);
        C1505a0.d(r, e5);
        B(1, r);
    }

    @Override // ax.f6.InterfaceC2057e
    public final void y0(C3649f c3649f, E5 e5) throws RemoteException {
        Parcel r = r();
        C1505a0.d(r, c3649f);
        C1505a0.d(r, e5);
        B(12, r);
    }
}
