package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ax.b0.C1441b;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0553a();
    private final m c0;
    private final c d0;
    private m e0;
    private final int f0;
    private final int g0;
    private final int h0;
    private final m q;

    /* renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    class C0553a implements Parcelable.Creator<a> {
        C0553a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a((m) parcel.readParcelable(m.class.getClassLoader()), (m) parcel.readParcelable(m.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (m) parcel.readParcelable(m.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    public interface c extends Parcelable {
        boolean t(long j);
    }

    /* synthetic */ a(m mVar, m mVar2, c cVar, m mVar3, int i, C0553a c0553a) {
        this(mVar, mVar2, cVar, mVar3, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.q.equals(aVar.q) && this.c0.equals(aVar.c0) && C1441b.a(this.e0, aVar.e0) && this.f0 == aVar.f0 && this.d0.equals(aVar.d0);
    }

    m f(m mVar) {
        return mVar.compareTo(this.q) < 0 ? this.q : mVar.compareTo(this.c0) > 0 ? this.c0 : mVar;
    }

    public c g() {
        return this.d0;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.q, this.c0, this.e0, Integer.valueOf(this.f0), this.d0});
    }

    m i() {
        return this.c0;
    }

    int j() {
        return this.f0;
    }

    int k() {
        return this.h0;
    }

    m m() {
        return this.e0;
    }

    m o() {
        return this.q;
    }

    int v() {
        return this.g0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.q, 0);
        parcel.writeParcelable(this.c0, 0);
        parcel.writeParcelable(this.e0, 0);
        parcel.writeParcelable(this.d0, 0);
        parcel.writeInt(this.f0);
    }

    boolean y(long j) {
        if (this.q.E(1) > j) {
            return false;
        }
        m mVar = this.c0;
        return j <= mVar.E(mVar.f0);
    }

    void z(m mVar) {
        this.e0 = mVar;
    }

    private a(m mVar, m mVar2, c cVar, m mVar3, int i) {
        Objects.requireNonNull(mVar, "start cannot be null");
        Objects.requireNonNull(mVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.q = mVar;
        this.c0 = mVar2;
        this.e0 = mVar3;
        this.f0 = i;
        this.d0 = cVar;
        if (mVar3 != null && mVar.compareTo(mVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (mVar3 != null && mVar3.compareTo(mVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > t.r().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.h0 = mVar.J(mVar2) + 1;
        this.g0 = (mVar2.d0 - mVar.d0) + 1;
    }

    public static final class b {
        static final long f = t.a(m.j(1900, 0).g0);
        static final long g = t.a(m.j(2100, 11).g0);
        private long a;
        private long b;
        private Long c;
        private int d;
        private c e;

        public b() {
            this.a = f;
            this.b = g;
            this.e = h.a(Long.MIN_VALUE);
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.e);
            m B = m.B(this.a);
            m B2 = m.B(this.b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.c;
            return new a(B, B2, cVar, l == null ? null : m.B(l.longValue()), this.d, null);
        }

        public b b(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        b(a aVar) {
            this.a = f;
            this.b = g;
            this.e = h.a(Long.MIN_VALUE);
            this.a = aVar.q.g0;
            this.b = aVar.c0.g0;
            this.c = Long.valueOf(aVar.e0.g0);
            this.d = aVar.f0;
            this.e = aVar.d0;
        }
    }
}
