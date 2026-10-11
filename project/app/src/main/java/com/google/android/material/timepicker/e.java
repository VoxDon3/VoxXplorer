/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.timepicker.b;
import java.util.Arrays;

class e
implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>(){

        public e a(Parcel parcel) {
            return new e(parcel);
        }

        public e[] b(int n8) {
            return new e[n8];
        }
    };
    private final b c0;
    final int d0;
    int e0;
    int f0;
    int g0;
    int h0;
    private final b q;

    public e() {
        this(0);
    }

    public e(int n8) {
        this(0, 0, 10, n8);
    }

    public e(int n8, int n9, int n10, int n11) {
        this.e0 = n8;
        this.f0 = n9;
        this.g0 = n10;
        this.d0 = n11;
        this.h0 = e.c(n8);
        this.q = new b(59);
        n8 = n11 == 1 ? 23 : 12;
        this.c0 = new b(n8);
    }

    protected e(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return e.b(resources, charSequence, "%02d");
    }

    public static String b(Resources object, CharSequence charSequence, String string) {
        try {
            object = String.format(object.getConfiguration().locale, string, Integer.parseInt(String.valueOf(charSequence)));
            return object;
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    private static int c(int n8) {
        if (n8 >= 12) {
            return 1;
        }
        return 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof e)) {
            return false;
        }
        object = (e)object;
        return this.e0 == ((e)object).e0 && this.f0 == ((e)object).f0 && this.d0 == ((e)object).d0 && this.g0 == ((e)object).g0;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.d0, this.e0, this.f0, this.g0});
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeInt(this.e0);
        parcel.writeInt(this.f0);
        parcel.writeInt(this.g0);
        parcel.writeInt(this.d0);
    }
}

