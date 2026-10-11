package ax.f6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ax.f6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2054b implements Parcelable.Creator<C2053a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2053a createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            if (ax.N5.b.i(n) != 1) {
                ax.N5.b.t(parcel, n);
            } else {
                bundle = ax.N5.b.a(parcel, n);
            }
        }
        ax.N5.b.h(parcel, u);
        return new C2053a(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2053a[] newArray(int i) {
        return new C2053a[i];
    }
}
