/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.os.Parcel;
import android.os.Parcelable;
import ax.M5.m;
import ax.M5.x;
import ax.N5.a;
import ax.N5.c;
import java.util.ArrayList;
import java.util.List;

public class t
extends a {
    public static final Parcelable.Creator<t> CREATOR = new x();
    private List c0;
    private final int q;

    public t(int n8, List list) {
        this.q = n8;
        this.c0 = list;
    }

    public final int k() {
        return this.q;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.i(parcel, 1, this.q);
        c.q(parcel, 2, this.c0, false);
        c.b(parcel, n8);
    }

    public final List y() {
        return this.c0;
    }

    public final void z(m m8) {
        if (this.c0 == null) {
            this.c0 = new ArrayList();
        }
        this.c0.add(m8);
    }
}

