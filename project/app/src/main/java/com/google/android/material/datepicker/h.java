/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

public class h
implements a.c {
    public static final Parcelable.Creator<h> CREATOR = new Parcelable.Creator<h>(){

        public h a(Parcel parcel) {
            return new h(parcel.readLong());
        }

        public h[] b(int n8) {
            return new h[n8];
        }
    };
    private final long q;

    private h(long l8) {
        this.q = l8;
    }

    public static h a(long l8) {
        return new h(l8);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof h)) {
            return false;
        }
        object = (h)object;
        return this.q == ((h)object).q;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.q});
    }

    @Override
    public boolean t(long l8) {
        return l8 >= this.q;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeLong(this.q);
    }
}

