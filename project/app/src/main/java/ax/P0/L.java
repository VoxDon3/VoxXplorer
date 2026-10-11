/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import android.os.Parcel;
import android.os.Parcelable;
import ax.S0.d0;

public final class L
implements Comparable<L>,
Parcelable {
    public static final Parcelable.Creator<L> CREATOR = new Parcelable.Creator<L>(){

        public L a(Parcel parcel) {
            return new L(parcel);
        }

        public L[] b(int n8) {
            return new L[n8];
        }
    };
    private static final String e0 = ax.S0.d0.G0(0);
    private static final String f0 = ax.S0.d0.G0(1);
    private static final String g0 = ax.S0.d0.G0(2);
    public final int c0;
    public final int d0;
    public final int q;

    L(Parcel parcel) {
        this.q = parcel.readInt();
        this.c0 = parcel.readInt();
        this.d0 = parcel.readInt();
    }

    public int d(L l8) {
        int n8;
        int n9 = n8 = this.q - l8.q;
        if (n8 == 0) {
            n9 = n8 = this.c0 - l8.c0;
            if (n8 == 0) {
                n9 = this.d0 - l8.d0;
            }
        }
        return n9;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && L.class == object.getClass()) {
            object = (L)object;
            if (this.q == ((L)object).q && this.c0 == ((L)object).c0 && this.d0 == ((L)object).d0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.q * 31 + this.c0) * 31 + this.d0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.q);
        stringBuilder.append(".");
        stringBuilder.append(this.c0);
        stringBuilder.append(".");
        stringBuilder.append(this.d0);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeInt(this.q);
        parcel.writeInt(this.c0);
        parcel.writeInt(this.d0);
    }
}

