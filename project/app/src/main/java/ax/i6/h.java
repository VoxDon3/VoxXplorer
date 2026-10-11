/*
 * Decompiled with CFR 0.152.
 */
package ax.i6;

import android.os.Parcel;
import android.os.Parcelable;
import ax.K5.l;
import ax.N5.a;
import ax.N5.c;
import ax.i6.i;
import com.google.android.gms.common.api.Status;
import java.util.List;

public final class h
extends a
implements l {
    public static final Parcelable.Creator<h> CREATOR = new i();
    private final String c0;
    private final List q;

    public h(List list, String string) {
        this.q = list;
        this.c0 = string;
    }

    @Override
    public final Status e() {
        if (this.c0 != null) {
            return Status.g0;
        }
        return Status.k0;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        List list = this.q;
        n8 = c.a(parcel);
        c.o(parcel, 1, list, false);
        c.n(parcel, 2, this.c0, false);
        c.b(parcel, n8);
    }
}

