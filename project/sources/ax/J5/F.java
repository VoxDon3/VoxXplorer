package ax.J5;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import ax.T5.a;

/* loaded from: classes3.dex */
public final class F extends ax.N5.a {
    public static final Parcelable.Creator<F> CREATOR = new G();
    private final boolean c0;
    private final boolean d0;
    private final Context e0;
    private final boolean f0;
    private final boolean g0;
    private final String q;

    F(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4) {
        this.q = str;
        this.c0 = z;
        this.d0 = z2;
        this.e0 = (Context) ax.T5.b.B(a.AbstractBinderC0196a.w(iBinder));
        this.f0 = z3;
        this.g0 = z4;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, ax.T5.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.q;
        int a = ax.N5.c.a(parcel);
        ax.N5.c.n(parcel, 1, str, false);
        ax.N5.c.c(parcel, 2, this.c0);
        ax.N5.c.c(parcel, 3, this.d0);
        ax.N5.c.h(parcel, 4, ax.T5.b.a2(this.e0), false);
        ax.N5.c.c(parcel, 5, this.f0);
        ax.N5.c.c(parcel, 6, this.g0);
        ax.N5.c.b(parcel, a);
    }
}
