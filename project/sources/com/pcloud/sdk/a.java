package com.pcloud.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import ax.la.h;
import j$.util.Objects;

/* loaded from: classes3.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0568a();
    public final h c0;
    public final String d0;
    public final long e0;
    public final long f0;
    public final String g0;
    public final String h0;
    public final String i0;
    public final b q;

    /* renamed from: com.pcloud.sdk.a$a, reason: collision with other inner class name */
    class C0568a implements Parcelable.Creator<a> {
        C0568a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    a(b bVar, h hVar, String str, long j, long j2, String str2, String str3, String str4) {
        this.q = bVar;
        this.c0 = hVar;
        this.d0 = str;
        this.e0 = j;
        this.f0 = j2;
        this.g0 = str2;
        this.h0 = str3;
        this.i0 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.e0 == aVar.e0 && this.f0 == aVar.f0 && this.q.equals(aVar.q) && this.c0 == aVar.c0 && Objects.equals(this.d0, aVar.d0) && Objects.equals(this.g0, aVar.g0) && Objects.equals(this.h0, aVar.h0)) {
            return Objects.equals(this.i0, aVar.i0);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.q.hashCode() * 31) + this.c0.hashCode()) * 31;
        String str = this.d0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j = this.e0;
        int i = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f0;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.g0;
        int hashCode3 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.h0;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.i0;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "AuthorizationData{request=" + this.q + ", result=" + this.c0 + ", token='" + this.d0 + "', userId=" + this.e0 + ", locationId=" + this.f0 + ", authCode='" + this.g0 + "', apiHost='" + this.h0 + "', errorMessage='" + this.i0 + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.q, i);
        parcel.writeSerializable(this.c0);
        parcel.writeString(this.d0);
        parcel.writeLong(this.e0);
        parcel.writeLong(this.f0);
        parcel.writeString(this.g0);
        parcel.writeString(this.h0);
        parcel.writeString(this.i0);
    }

    protected a(Parcel parcel) {
        this.q = (b) parcel.readParcelable(b.class.getClassLoader());
        this.c0 = (h) parcel.readSerializable();
        this.d0 = parcel.readString();
        this.e0 = parcel.readLong();
        this.f0 = parcel.readLong();
        this.g0 = parcel.readString();
        this.h0 = parcel.readString();
        this.i0 = parcel.readString();
    }
}
