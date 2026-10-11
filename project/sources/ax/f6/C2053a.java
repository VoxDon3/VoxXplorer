package ax.f6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ax.f6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2053a extends ax.N5.a {
    public static final Parcelable.Creator<C2053a> CREATOR = new C2054b();
    public final Bundle q;

    public C2053a(Bundle bundle) {
        this.q = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ax.N5.c.a(parcel);
        ax.N5.c.e(parcel, 1, this.q, false);
        ax.N5.c.b(parcel, a);
    }
}
