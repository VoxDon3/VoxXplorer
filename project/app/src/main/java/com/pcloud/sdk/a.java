/*
 * Decompiled with CFR 0.152.
 */
package com.pcloud.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import ax.la.h;
import com.pcloud.sdk.b;
import java.io.Serializable;

public class a
implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>(){

        public a a(Parcel parcel) {
            return new a(parcel);
        }

        public a[] b(int n8) {
            return new a[n8];
        }
    };
    public final h c0;
    public final String d0;
    public final long e0;
    public final long f0;
    public final String g0;
    public final String h0;
    public final String i0;
    public final b q;

    protected a(Parcel parcel) {
        this.q = (b)parcel.readParcelable(b.class.getClassLoader());
        this.c0 = (h)((Object)parcel.readSerializable());
        this.d0 = parcel.readString();
        this.e0 = parcel.readLong();
        this.f0 = parcel.readLong();
        this.g0 = parcel.readString();
        this.h0 = parcel.readString();
        this.i0 = parcel.readString();
    }

    a(b b8, h h8, String string, long l8, long l9, String string2, String string3, String string4) {
        this.q = b8;
        this.c0 = h8;
        this.d0 = string;
        this.e0 = l8;
        this.f0 = l9;
        this.g0 = string2;
        this.h0 = string3;
        this.i0 = string4;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (a)object;
            if (this.e0 != ((a)object).e0) {
                return false;
            }
            if (this.f0 != ((a)object).f0) {
                return false;
            }
            if (!this.q.equals(((a)object).q)) {
                return false;
            }
            if (this.c0 != ((a)object).c0) {
                return false;
            }
            if (!j.Objects.equals((Object)this.d0, (Object)((a)object).d0)) {
                return false;
            }
            if (!j.Objects.equals((Object)this.g0, (Object)((a)object).g0)) {
                return false;
            }
            if (!j.Objects.equals((Object)this.h0, (Object)((a)object).h0)) {
                return false;
            }
            return j.Objects.equals((Object)this.i0, (Object)((a)object).i0);
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.q.hashCode();
        int n9 = ((Object)((Object)this.c0)).hashCode();
        String string = this.d0;
        int n10 = 0;
        int n11 = string != null ? string.hashCode() : 0;
        long l8 = this.e0;
        int n12 = (int)(l8 ^ l8 >>> 32);
        l8 = this.f0;
        int n13 = (int)(l8 ^ l8 >>> 32);
        string = this.g0;
        int n14 = string != null ? string.hashCode() : 0;
        string = this.h0;
        int n15 = string != null ? string.hashCode() : 0;
        string = this.i0;
        if (string != null) {
            n10 = string.hashCode();
        }
        return ((((((n8 * 31 + n9) * 31 + n11) * 31 + n12) * 31 + n13) * 31 + n14) * 31 + n15) * 31 + n10;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AuthorizationData{request=");
        stringBuilder.append(this.q);
        stringBuilder.append(", result=");
        stringBuilder.append((Object)this.c0);
        stringBuilder.append(", token='");
        stringBuilder.append(this.d0);
        stringBuilder.append('\'');
        stringBuilder.append(", userId=");
        stringBuilder.append(this.e0);
        stringBuilder.append(", locationId=");
        stringBuilder.append(this.f0);
        stringBuilder.append(", authCode='");
        stringBuilder.append(this.g0);
        stringBuilder.append('\'');
        stringBuilder.append(", apiHost='");
        stringBuilder.append(this.h0);
        stringBuilder.append('\'');
        stringBuilder.append(", errorMessage='");
        stringBuilder.append(this.i0);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeParcelable((Parcelable)this.q, n8);
        parcel.writeSerializable((Serializable)((Object)this.c0));
        parcel.writeString(this.d0);
        parcel.writeLong(this.e0);
        parcel.writeLong(this.f0);
        parcel.writeString(this.g0);
        parcel.writeString(this.h0);
        parcel.writeString(this.i0);
    }
}

