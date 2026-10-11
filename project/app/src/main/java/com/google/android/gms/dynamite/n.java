/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import ax.T5.a;
import ax.Z5.a;
import ax.Z5.c;

public final class n
extends a
implements IInterface {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final ax.T5.a B(ax.T5.a a8, String object, int n8, ax.T5.a a9) throws RemoteException {
        Parcel parcel = this.w();
        c.d(parcel, a8);
        parcel.writeString((String)object);
        parcel.writeInt(n8);
        c.d(parcel, a9);
        a8 = this.r(2, parcel);
        object = a.a.w(a8.readStrongBinder());
        a8.recycle();
        return object;
    }

    public final ax.T5.a a2(ax.T5.a a8, String object, int n8, ax.T5.a a9) throws RemoteException {
        Parcel parcel = this.w();
        c.d(parcel, a8);
        parcel.writeString((String)object);
        parcel.writeInt(n8);
        c.d(parcel, a9);
        a8 = this.r(3, parcel);
        object = a.a.w(a8.readStrongBinder());
        a8.recycle();
        return object;
    }
}

