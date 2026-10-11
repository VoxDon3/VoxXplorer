package ax.i6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* loaded from: classes3.dex */
public final class h extends ax.N5.a implements ax.K5.l {
    public static final Parcelable.Creator<h> CREATOR = new i();
    private final String c0;
    private final List q;

    public h(List list, String str) {
        this.q = list;
        this.c0 = str;
    }

    @Override // ax.K5.l
    public final Status e() {
        return this.c0 != null ? Status.g0 : Status.k0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.q;
        int a = ax.N5.c.a(parcel);
        ax.N5.c.o(parcel, 1, list, false);
        ax.N5.c.n(parcel, 2, this.c0, false);
        ax.N5.c.b(parcel, a);
    }
}
