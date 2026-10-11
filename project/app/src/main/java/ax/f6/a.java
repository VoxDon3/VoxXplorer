/*
 * Decompiled with CFR 0.152.
 */
package ax.f6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ax.N5.c;
import ax.f6.b;

public final class a
extends ax.N5.a {
    public static final Parcelable.Creator<a> CREATOR = new b();
    public final Bundle q;

    public a(Bundle bundle) {
        this.q = bundle;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.e(parcel, 1, this.q, false);
        c.b(parcel, n8);
    }
}

