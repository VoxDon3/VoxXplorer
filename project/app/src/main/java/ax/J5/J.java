/*
 * Decompiled with CFR 0.152.
 */
package ax.J5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import ax.J5.A;
import ax.J5.B;
import ax.J5.K;
import ax.M5.w0;
import ax.N5.c;
import ax.T5.a;
import ax.T5.b;

public final class J
extends ax.N5.a {
    public static final Parcelable.Creator<J> CREATOR = new K();
    private final A c0;
    private final boolean d0;
    private final boolean e0;
    private final String q;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    J(String object, IBinder iBinder, boolean bl, boolean bl2) {
        block6: {
            this.q = object;
            Object var5_6 = null;
            if (iBinder == null) {
                object = var5_6;
            } else {
                try {
                    object = w0.w(iBinder).e();
                    object = object == null ? null : (Object)((byte[])b.B((a)object));
                }
                catch (RemoteException remoteException) {
                    Log.e((String)"GoogleCertificatesQuery", (String)"Could not unwrap certificate", (Throwable)remoteException);
                    object = var5_6;
                    break block6;
                }
                if (object != null) {
                    object = new B((byte[])object);
                } else {
                    Log.e((String)"GoogleCertificatesQuery", (String)"Could not unwrap certificate");
                    object = var5_6;
                }
            }
        }
        this.c0 = object;
        this.d0 = bl;
        this.e0 = bl2;
    }

    J(String string, A a8, boolean bl, boolean bl2) {
        this.q = string;
        this.c0 = a8;
        this.d0 = bl;
        this.e0 = bl2;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        Object object = this.q;
        n8 = c.a(parcel);
        c.n(parcel, 1, (String)object, false);
        A a8 = this.c0;
        object = a8;
        if (a8 == null) {
            Log.w((String)"GoogleCertificatesQuery", (String)"certificate binder is null");
            object = null;
        }
        c.h(parcel, 2, (IBinder)object, false);
        c.c(parcel, 3, this.d0);
        c.c(parcel, 4, this.e0);
        c.b(parcel, n8);
    }
}

