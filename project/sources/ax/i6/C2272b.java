package ax.i6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: ax.i6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2272b extends ax.N5.a implements ax.K5.l {
    public static final Parcelable.Creator<C2272b> CREATOR = new C2273c();
    private int c0;
    private Intent d0;
    final int q;

    public C2272b() {
        this(2, 0, null);
    }

    @Override // ax.K5.l
    public final Status e() {
        return this.c0 == 0 ? Status.g0 : Status.k0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.q;
        int a = ax.N5.c.a(parcel);
        ax.N5.c.i(parcel, 1, i2);
        ax.N5.c.i(parcel, 2, this.c0);
        ax.N5.c.m(parcel, 3, this.d0, i, false);
        ax.N5.c.b(parcel, a);
    }

    C2272b(int i, int i2, Intent intent) {
        this.q = i;
        this.c0 = i2;
        this.d0 = intent;
    }
}
