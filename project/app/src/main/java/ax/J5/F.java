/*
 * Decompiled with CFR 0.152.
 */
package ax.J5;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import ax.J5.G;
import ax.N5.a;
import ax.N5.c;
import ax.T5.a;
import ax.T5.b;

public final class F
extends a {
    public static final Parcelable.Creator<F> CREATOR = new G();
    private final boolean c0;
    private final boolean d0;
    private final Context e0;
    private final boolean f0;
    private final boolean g0;
    private final String q;

    F(String string, boolean bl, boolean bl2, IBinder iBinder, boolean bl3, boolean bl4) {
        this.q = string;
        this.c0 = bl;
        this.d0 = bl2;
        this.e0 = (Context)b.B(a.a.w(iBinder));
        this.f0 = bl3;
        this.g0 = bl4;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        String string = this.q;
        n8 = c.a(parcel);
        c.n(parcel, 1, string, false);
        c.c(parcel, 2, this.c0);
        c.c(parcel, 3, this.d0);
        c.h(parcel, 4, (IBinder)b.a2(this.e0), false);
        c.c(parcel, 5, this.f0);
        c.c(parcel, 6, this.g0);
        c.b(parcel, n8);
    }
}

