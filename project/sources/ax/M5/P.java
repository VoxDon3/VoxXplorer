package ax.M5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import ax.J5.C0742c;
import ax.M5.InterfaceC0815j;

/* loaded from: classes3.dex */
public final class P extends ax.N5.a {
    public static final Parcelable.Creator<P> CREATOR = new Q();
    final IBinder c0;
    private final C0742c d0;
    private final boolean e0;
    private final boolean f0;
    final int q;

    P(int i, IBinder iBinder, C0742c c0742c, boolean z, boolean z2) {
        this.q = i;
        this.c0 = iBinder;
        this.d0 = c0742c;
        this.e0 = z;
        this.f0 = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p = (P) obj;
        return this.d0.equals(p.d0) && C0819n.b(y(), p.y());
    }

    public final C0742c k() {
        return this.d0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ax.N5.c.a(parcel);
        ax.N5.c.i(parcel, 1, this.q);
        ax.N5.c.h(parcel, 2, this.c0, false);
        ax.N5.c.m(parcel, 3, this.d0, i, false);
        ax.N5.c.c(parcel, 4, this.e0);
        ax.N5.c.c(parcel, 5, this.f0);
        ax.N5.c.b(parcel, a);
    }

    public final InterfaceC0815j y() {
        IBinder iBinder = this.c0;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC0815j.a.w(iBinder);
    }
}
