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

public final class m
extends a
implements IInterface {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int B() throws RemoteException {
        Parcel parcel = this.r(6, this.w());
        int n8 = parcel.readInt();
        parcel.recycle();
        return n8;
    }

    public final int a2(ax.T5.a a8, String string, boolean bl) throws RemoteException {
        Parcel parcel = this.w();
        c.d(parcel, a8);
        parcel.writeString(string);
        parcel.writeInt(bl ? 1 : 0);
        a8 = this.r(3, parcel);
        int n8 = a8.readInt();
        a8.recycle();
        return n8;
    }

    public final int b2(ax.T5.a a8, String string, boolean bl) throws RemoteException {
        Parcel parcel = this.w();
        c.d(parcel, a8);
        parcel.writeString(string);
        parcel.writeInt(bl ? 1 : 0);
        a8 = this.r(5, parcel);
        int n8 = a8.readInt();
        a8.recycle();
        return n8;
    }

    public final ax.T5.a c2(ax.T5.a a8, String object, int n8) throws RemoteException {
        Parcel parcel = this.w();
        c.d(parcel, a8);
        parcel.writeString((String)object);
        parcel.writeInt(n8);
        a8 = this.r(2, parcel);
        object = a.a.w(a8.readStrongBinder());
        a8.recycle();
        return object;
    }

    public final ax.T5.a d2(ax.T5.a a8, String object, int n8, ax.T5.a a9) throws RemoteException {
        Parcel parcel = this.w();
        c.d(parcel, a8);
        parcel.writeString((String)object);
        parcel.writeInt(n8);
        c.d(parcel, a9);
        a8 = this.r(8, parcel);
        object = a.a.w(a8.readStrongBinder());
        a8.recycle();
        return object;
    }

    public final ax.T5.a e2(ax.T5.a a8, String string, int n8) throws RemoteException {
        Parcel parcel = this.w();
        c.d(parcel, a8);
        parcel.writeString(string);
        parcel.writeInt(n8);
        string = this.r(4, parcel);
        a8 = a.a.w(string.readStrongBinder());
        string.recycle();
        return a8;
    }

    public final ax.T5.a f2(ax.T5.a a8, String string, boolean bl, long l8) throws RemoteException {
        Parcel parcel = this.w();
        c.d(parcel, a8);
        parcel.writeString(string);
        parcel.writeInt(bl ? 1 : 0);
        parcel.writeLong(l8);
        string = this.r(7, parcel);
        a8 = a.a.w(string.readStrongBinder());
        string.recycle();
        return a8;
    }
}

