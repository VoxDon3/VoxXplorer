/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import ax.b6.Y;
import ax.b6.a0;
import ax.f6.a;
import ax.f6.e;
import com.google.android.gms.measurement.internal.A5;
import com.google.android.gms.measurement.internal.D;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.f;
import com.google.android.gms.measurement.internal.h5;
import java.util.List;

public final class O1
extends Y
implements e {
    O1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override
    public final void A1(E5 e52) throws RemoteException {
        Parcel parcel = this.r();
        a0.d(parcel, e52);
        this.B(6, parcel);
    }

    @Override
    public final List<h5> B1(E5 e52, Bundle object) throws RemoteException {
        Parcel parcel = this.r();
        a0.d(parcel, e52);
        a0.d(parcel, (Parcelable)object);
        e52 = this.w(24, parcel);
        object = e52.createTypedArrayList(h5.CREATOR);
        e52.recycle();
        return object;
    }

    @Override
    public final List<f> F(String string, String object, E5 e52) throws RemoteException {
        Parcel parcel = this.r();
        parcel.writeString(string);
        parcel.writeString((String)object);
        a0.d(parcel, e52);
        string = this.w(16, parcel);
        object = string.createTypedArrayList(f.CREATOR);
        string.recycle();
        return object;
    }

    @Override
    public final void F0(long l8, String string, String string2, String string3) throws RemoteException {
        Parcel parcel = this.r();
        parcel.writeLong(l8);
        parcel.writeString(string);
        parcel.writeString(string2);
        parcel.writeString(string3);
        this.B(10, parcel);
    }

    @Override
    public final void I(E5 e52) throws RemoteException {
        Parcel parcel = this.r();
        a0.d(parcel, e52);
        this.B(18, parcel);
    }

    @Override
    public final void I0(E5 e52) throws RemoteException {
        Parcel parcel = this.r();
        a0.d(parcel, e52);
        this.B(4, parcel);
    }

    @Override
    public final List<f> J0(String string, String object, String string2) throws RemoteException {
        Parcel parcel = this.r();
        parcel.writeString(string);
        parcel.writeString((String)object);
        parcel.writeString(string2);
        string = this.w(17, parcel);
        object = string.createTypedArrayList(f.CREATOR);
        string.recycle();
        return object;
    }

    @Override
    public final void M0(f f8) throws RemoteException {
        Parcel parcel = this.r();
        a0.d(parcel, f8);
        this.B(13, parcel);
    }

    @Override
    public final void N(D d8, String string, String string2) throws RemoteException {
        Parcel parcel = this.r();
        a0.d(parcel, d8);
        parcel.writeString(string);
        parcel.writeString(string2);
        this.B(5, parcel);
    }

    @Override
    public final void P(A5 a52, E5 e52) throws RemoteException {
        Parcel parcel = this.r();
        a0.d(parcel, a52);
        a0.d(parcel, e52);
        this.B(2, parcel);
    }

    @Override
    public final void U1(E5 e52) throws RemoteException {
        Parcel parcel = this.r();
        a0.d(parcel, e52);
        this.B(25, parcel);
    }

    @Override
    public final List<A5> Z(String string, String object, String string2, boolean bl) throws RemoteException {
        Parcel parcel = this.r();
        parcel.writeString(string);
        parcel.writeString((String)object);
        parcel.writeString(string2);
        a0.e(parcel, bl);
        string = this.w(15, parcel);
        object = string.createTypedArrayList(A5.CREATOR);
        string.recycle();
        return object;
    }

    @Override
    public final void f0(E5 e52) throws RemoteException {
        Parcel parcel = this.r();
        a0.d(parcel, e52);
        this.B(20, parcel);
    }

    @Override
    public final void g0(Bundle bundle, E5 e52) throws RemoteException {
        Parcel parcel = this.r();
        a0.d(parcel, (Parcelable)bundle);
        a0.d(parcel, e52);
        this.B(19, parcel);
    }

    @Override
    public final void h0(E5 e52) throws RemoteException {
        Parcel parcel = this.r();
        a0.d(parcel, e52);
        this.B(26, parcel);
    }

    @Override
    public final byte[] h1(D object, String string) throws RemoteException {
        Parcel parcel = this.r();
        a0.d(parcel, (Parcelable)object);
        parcel.writeString(string);
        string = this.w(9, parcel);
        object = string.createByteArray();
        string.recycle();
        return object;
    }

    @Override
    public final a k1(E5 a8) throws RemoteException {
        Parcel parcel = this.r();
        a0.d(parcel, a8);
        parcel = this.w(21, parcel);
        a8 = a0.a(parcel, a.CREATOR);
        parcel.recycle();
        return a8;
    }

    @Override
    public final String p0(E5 object) throws RemoteException {
        Parcel parcel = this.r();
        a0.d(parcel, (Parcelable)object);
        parcel = this.w(11, parcel);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    @Override
    public final List<A5> u1(String object, String string, boolean bl, E5 e52) throws RemoteException {
        Parcel parcel = this.r();
        parcel.writeString((String)object);
        parcel.writeString(string);
        a0.e(parcel, bl);
        a0.d(parcel, e52);
        string = this.w(14, parcel);
        object = string.createTypedArrayList(A5.CREATOR);
        string.recycle();
        return object;
    }

    @Override
    public final void w1(D d8, E5 e52) throws RemoteException {
        Parcel parcel = this.r();
        a0.d(parcel, d8);
        a0.d(parcel, e52);
        this.B(1, parcel);
    }

    @Override
    public final void y0(f f8, E5 e52) throws RemoteException {
        Parcel parcel = this.r();
        a0.d(parcel, f8);
        a0.d(parcel, e52);
        this.B(12, parcel);
    }
}

