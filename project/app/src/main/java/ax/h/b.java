/*
 * Decompiled with CFR 0.152.
 */
package ax.h;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import ax.h.a;

@SuppressLint(value={"BanParcelableUsage"})
public class b
implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>(){

        public b a(Parcel parcel) {
            return new b(parcel);
        }

        public b[] b(int n8) {
            return new b[n8];
        }
    };
    final Handler c0 = null;
    a d0;
    final boolean q;

    b(Parcel parcel) {
        this.q = false;
        this.d0 = a.a.r(parcel.readStrongBinder());
    }

    protected void a(int n8, Bundle bundle) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(int n8, Bundle bundle) {
        if (this.q) {
            Handler handler = this.c0;
            if (handler != null) {
                handler.post((Runnable)new c(this, n8, bundle));
                return;
            }
            this.a(n8, bundle);
            return;
        }
        a a8 = this.d0;
        if (a8 == null) return;
        try {
            a8.X1(n8, bundle);
            return;
        }
        catch (RemoteException remoteException) {
            return;
        }
    }

    public int describeContents() {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void writeToParcel(Parcel parcel, int n8) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.d0 != null) break block3;
                        b b8 = new b(this);
                        this.d0 = b8;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                parcel.writeStrongBinder(this.d0.asBinder());
                return;
            }
            throw throwable2;
        }
    }

    class b
    extends a.a {
        final b e;

        b(b b8) {
            this.e = b8;
        }

        @Override
        public void X1(int n8, Bundle bundle) {
            b b8 = this.e;
            Handler handler = b8.c0;
            if (handler != null) {
                handler.post((Runnable)new c(b8, n8, bundle));
                return;
            }
            b8.a(n8, bundle);
        }
    }

    class c
    implements Runnable {
        final Bundle c0;
        final b d0;
        final int q;

        c(b b8, int n8, Bundle bundle) {
            this.d0 = b8;
            this.q = n8;
            this.c0 = bundle;
        }

        @Override
        public void run() {
            this.d0.a(this.q, this.c0);
        }
    }
}

