package ax.M5;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ax.M5.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0810e extends ax.N5.a {
    public static final Parcelable.Creator<C0810e> CREATOR = new k0();
    private final boolean c0;
    private final boolean d0;
    private final int[] e0;
    private final int f0;
    private final int[] g0;
    private final r q;

    public C0810e(r rVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.q = rVar;
        this.c0 = z;
        this.d0 = z2;
        this.e0 = iArr;
        this.f0 = i;
        this.g0 = iArr2;
    }

    public boolean B() {
        return this.c0;
    }

    public boolean C() {
        return this.d0;
    }

    public final r D() {
        return this.q;
    }

    public int k() {
        return this.f0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ax.N5.c.a(parcel);
        ax.N5.c.m(parcel, 1, this.q, i, false);
        ax.N5.c.c(parcel, 2, B());
        ax.N5.c.c(parcel, 3, C());
        ax.N5.c.j(parcel, 4, y(), false);
        ax.N5.c.i(parcel, 5, k());
        ax.N5.c.j(parcel, 6, z(), false);
        ax.N5.c.b(parcel, a);
    }

    public int[] y() {
        return this.e0;
    }

    public int[] z() {
        return this.g0;
    }
}
