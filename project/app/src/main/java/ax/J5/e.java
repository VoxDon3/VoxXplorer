/*
 * Decompiled with CFR 0.152.
 */
package ax.J5;

import android.os.Parcel;
import android.os.Parcelable;
import ax.J5.t;
import ax.M5.n;
import ax.N5.a;
import ax.N5.c;

public class e
extends a {
    public static final Parcelable.Creator<e> CREATOR = new t();
    @Deprecated
    private final int c0;
    private final long d0;
    private final String q;

    public e(String string, int n8, long l8) {
        this.q = string;
        this.c0 = n8;
        this.d0 = l8;
    }

    public e(String string, long l8) {
        this.q = string;
        this.d0 = l8;
        this.c0 = -1;
    }

    public final boolean equals(Object object) {
        if (object instanceof e) {
            object = (e)object;
            if ((this.k() != null && this.k().equals(((e)object).k()) || this.k() == null && ((e)object).k() == null) && this.y() == ((e)object).y()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return n.c(this.k(), this.y());
    }

    public String k() {
        return this.q;
    }

    public final String toString() {
        n.a a8 = n.d(this);
        a8.a("name", this.k());
        a8.a("version", this.y());
        return a8.toString();
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.n(parcel, 1, this.k(), false);
        c.i(parcel, 2, this.c0);
        c.k(parcel, 3, this.y());
        c.b(parcel, n8);
    }

    public long y() {
        long l8;
        long l9 = l8 = this.d0;
        if (l8 == -1L) {
            l9 = this.c0;
        }
        return l9;
    }
}

