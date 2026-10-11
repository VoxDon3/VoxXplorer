package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import ax.T5.a;

/* loaded from: classes3.dex */
public final class m extends ax.Z5.a implements IInterface {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int B() throws RemoteException {
        Parcel r = r(6, w());
        int readInt = r.readInt();
        r.recycle();
        return readInt;
    }

    public final int a2(ax.T5.a aVar, String str, boolean z) throws RemoteException {
        Parcel w = w();
        ax.Z5.c.d(w, aVar);
        w.writeString(str);
        w.writeInt(z ? 1 : 0);
        Parcel r = r(3, w);
        int readInt = r.readInt();
        r.recycle();
        return readInt;
    }

    public final int b2(ax.T5.a aVar, String str, boolean z) throws RemoteException {
        Parcel w = w();
        ax.Z5.c.d(w, aVar);
        w.writeString(str);
        w.writeInt(z ? 1 : 0);
        Parcel r = r(5, w);
        int readInt = r.readInt();
        r.recycle();
        return readInt;
    }

    public final ax.T5.a c2(ax.T5.a aVar, String str, int i) throws RemoteException {
        Parcel w = w();
        ax.Z5.c.d(w, aVar);
        w.writeString(str);
        w.writeInt(i);
        Parcel r = r(2, w);
        ax.T5.a w2 = a.AbstractBinderC0196a.w(r.readStrongBinder());
        r.recycle();
        return w2;
    }

    public final ax.T5.a d2(ax.T5.a aVar, String str, int i, ax.T5.a aVar2) throws RemoteException {
        Parcel w = w();
        ax.Z5.c.d(w, aVar);
        w.writeString(str);
        w.writeInt(i);
        ax.Z5.c.d(w, aVar2);
        Parcel r = r(8, w);
        ax.T5.a w2 = a.AbstractBinderC0196a.w(r.readStrongBinder());
        r.recycle();
        return w2;
    }

    public final ax.T5.a e2(ax.T5.a aVar, String str, int i) throws RemoteException {
        Parcel w = w();
        ax.Z5.c.d(w, aVar);
        w.writeString(str);
        w.writeInt(i);
        Parcel r = r(4, w);
        ax.T5.a w2 = a.AbstractBinderC0196a.w(r.readStrongBinder());
        r.recycle();
        return w2;
    }

    public final ax.T5.a f2(ax.T5.a aVar, String str, boolean z, long j) throws RemoteException {
        Parcel w = w();
        ax.Z5.c.d(w, aVar);
        w.writeString(str);
        w.writeInt(z ? 1 : 0);
        w.writeLong(j);
        Parcel r = r(7, w);
        ax.T5.a w2 = a.AbstractBinderC0196a.w(r.readStrongBinder());
        r.recycle();
        return w2;
    }
}
