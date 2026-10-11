package ax.W5;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ax.W5.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1030g extends ax.N5.a {
    public static final Parcelable.Creator<C1030g> CREATOR = new C1033h();
    String c0;
    final int q;

    public C1030g() {
        this.q = 1;
    }

    public final C1030g k(String str) {
        this.c0 = str;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ax.N5.c.a(parcel);
        ax.N5.c.i(parcel, 1, this.q);
        ax.N5.c.n(parcel, 2, this.c0, false);
        ax.N5.c.b(parcel, a);
    }

    C1030g(int i, String str) {
        this.q = i;
        this.c0 = str;
    }
}
