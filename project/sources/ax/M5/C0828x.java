package ax.M5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: ax.M5.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0828x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        ArrayList arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            int i2 = ax.N5.b.i(n);
            if (i2 == 1) {
                i = ax.N5.b.p(parcel, n);
            } else if (i2 != 2) {
                ax.N5.b.t(parcel, n);
            } else {
                arrayList = ax.N5.b.g(parcel, n, C0818m.CREATOR);
            }
        }
        ax.N5.b.h(parcel, u);
        return new C0824t(i, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0824t[i];
    }
}
