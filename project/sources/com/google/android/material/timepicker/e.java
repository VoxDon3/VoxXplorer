package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();
    private final b c0;
    final int d0;
    int e0;
    int f0;
    int g0;
    int h0;
    private final b q;

    class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i) {
            return new e[i];
        }
    }

    public e() {
        this(0);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int c(int i) {
        return i >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.e0 == eVar.e0 && this.f0 == eVar.f0 && this.d0 == eVar.d0 && this.g0 == eVar.g0;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d0), Integer.valueOf(this.e0), Integer.valueOf(this.f0), Integer.valueOf(this.g0)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e0);
        parcel.writeInt(this.f0);
        parcel.writeInt(this.g0);
        parcel.writeInt(this.d0);
    }

    public e(int i) {
        this(0, 0, 10, i);
    }

    public e(int i, int i2, int i3, int i4) {
        this.e0 = i;
        this.f0 = i2;
        this.g0 = i3;
        this.d0 = i4;
        this.h0 = c(i);
        this.q = new b(59);
        this.c0 = new b(i4 == 1 ? 23 : 12);
    }

    protected e(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
