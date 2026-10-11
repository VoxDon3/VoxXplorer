package ax.M5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ax.M5.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0824t extends ax.N5.a {
    public static final Parcelable.Creator<C0824t> CREATOR = new C0828x();
    private List c0;
    private final int q;

    public C0824t(int i, List list) {
        this.q = i;
        this.c0 = list;
    }

    public final int k() {
        return this.q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ax.N5.c.a(parcel);
        ax.N5.c.i(parcel, 1, this.q);
        ax.N5.c.q(parcel, 2, this.c0, false);
        ax.N5.c.b(parcel, a);
    }

    public final List y() {
        return this.c0;
    }

    public final void z(C0818m c0818m) {
        if (this.c0 == null) {
            this.c0 = new ArrayList();
        }
        this.c0.add(c0818m);
    }
}
