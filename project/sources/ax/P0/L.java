package ax.P0;

import android.os.Parcel;
import android.os.Parcelable;
import ax.S0.d0;

/* loaded from: classes.dex */
public final class L implements Comparable<L>, Parcelable {
    public static final Parcelable.Creator<L> CREATOR = new a();
    private static final String e0 = d0.G0(0);
    private static final String f0 = d0.G0(1);
    private static final String g0 = d0.G0(2);
    public final int c0;
    public final int d0;
    public final int q;

    class a implements Parcelable.Creator<L> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public L createFromParcel(Parcel parcel) {
            return new L(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public L[] newArray(int i) {
            return new L[i];
        }
    }

    L(Parcel parcel) {
        this.q = parcel.readInt();
        this.c0 = parcel.readInt();
        this.d0 = parcel.readInt();
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(L l) {
        int i = this.q - l.q;
        if (i != 0) {
            return i;
        }
        int i2 = this.c0 - l.c0;
        return i2 == 0 ? this.d0 - l.d0 : i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && L.class == obj.getClass()) {
            L l = (L) obj;
            if (this.q == l.q && this.c0 == l.c0 && this.d0 == l.d0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.q * 31) + this.c0) * 31) + this.d0;
    }

    public String toString() {
        return this.q + "." + this.c0 + "." + this.d0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.q);
        parcel.writeInt(this.c0);
        parcel.writeInt(this.d0);
    }
}
