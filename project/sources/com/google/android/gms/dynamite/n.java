package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import ax.T5.a;

/* loaded from: classes3.dex */
public final class n extends ax.Z5.a implements IInterface {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final ax.T5.a B(ax.T5.a aVar, String str, int i, ax.T5.a aVar2) throws RemoteException {
        Parcel w = w();
        ax.Z5.c.d(w, aVar);
        w.writeString(str);
        w.writeInt(i);
        ax.Z5.c.d(w, aVar2);
        Parcel r = r(2, w);
        ax.T5.a w2 = a.AbstractBinderC0196a.w(r.readStrongBinder());
        r.recycle();
        return w2;
    }

    public final ax.T5.a a2(ax.T5.a aVar, String str, int i, ax.T5.a aVar2) throws RemoteException {
        Parcel w = w();
        ax.Z5.c.d(w, aVar);
        w.writeString(str);
        w.writeInt(i);
        ax.Z5.c.d(w, aVar2);
        Parcel r = r(3, w);
        ax.T5.a w2 = a.AbstractBinderC0196a.w(r.readStrongBinder());
        r.recycle();
        return w2;
    }
}
