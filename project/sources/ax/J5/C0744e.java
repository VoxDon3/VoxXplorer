package ax.J5;

import android.os.Parcel;
import android.os.Parcelable;
import ax.M5.C0819n;

/* renamed from: ax.J5.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0744e extends ax.N5.a {
    public static final Parcelable.Creator<C0744e> CREATOR = new t();

    @Deprecated
    private final int c0;
    private final long d0;
    private final String q;

    public C0744e(String str, int i, long j) {
        this.q = str;
        this.c0 = i;
        this.d0 = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0744e) {
            C0744e c0744e = (C0744e) obj;
            if (((k() != null && k().equals(c0744e.k())) || (k() == null && c0744e.k() == null)) && y() == c0744e.y()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C0819n.c(k(), Long.valueOf(y()));
    }

    public String k() {
        return this.q;
    }

    public final String toString() {
        C0819n.a d = C0819n.d(this);
        d.a("name", k());
        d.a("version", Long.valueOf(y()));
        return d.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ax.N5.c.a(parcel);
        ax.N5.c.n(parcel, 1, k(), false);
        ax.N5.c.i(parcel, 2, this.c0);
        ax.N5.c.k(parcel, 3, y());
        ax.N5.c.b(parcel, a);
    }

    public long y() {
        long j = this.d0;
        return j == -1 ? this.c0 : j;
    }

    public C0744e(String str, long j) {
        this.q = str;
        this.d0 = j;
        this.c0 = -1;
    }
}
