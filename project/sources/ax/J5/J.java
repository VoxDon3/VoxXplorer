package ax.J5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import ax.M5.w0;

/* loaded from: classes3.dex */
public final class J extends ax.N5.a {
    public static final Parcelable.Creator<J> CREATOR = new K();
    private final A c0;
    private final boolean d0;
    private final boolean e0;
    private final String q;

    J(String str, A a, boolean z, boolean z2) {
        this.q = str;
        this.c0 = a;
        this.d0 = z;
        this.e0 = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.q;
        int a = ax.N5.c.a(parcel);
        ax.N5.c.n(parcel, 1, str, false);
        A a2 = this.c0;
        if (a2 == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            a2 = null;
        }
        ax.N5.c.h(parcel, 2, a2, false);
        ax.N5.c.c(parcel, 3, this.d0);
        ax.N5.c.c(parcel, 4, this.e0);
        ax.N5.c.b(parcel, a);
    }

    J(String str, IBinder iBinder, boolean z, boolean z2) {
        this.q = str;
        B b = null;
        if (iBinder != null) {
            try {
                ax.T5.a e = w0.w(iBinder).e();
                byte[] bArr = e == null ? null : (byte[]) ax.T5.b.B(e);
                if (bArr != null) {
                    b = new B(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e2) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e2);
            }
        }
        this.c0 = b;
        this.d0 = z;
        this.e0 = z2;
    }
}
