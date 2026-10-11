/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.h;
import com.google.android.material.datepicker.m;
import com.google.android.material.datepicker.t;
import java.util.Arrays;

public final class a
implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>(){

        public a a(Parcel parcel) {
            m m8 = (m)parcel.readParcelable(m.class.getClassLoader());
            m m9 = (m)parcel.readParcelable(m.class.getClassLoader());
            m m10 = (m)parcel.readParcelable(m.class.getClassLoader());
            return new a(m8, m9, (c)parcel.readParcelable(c.class.getClassLoader()), m10, parcel.readInt());
        }

        public a[] b(int n8) {
            return new a[n8];
        }
    };
    private final m c0;
    private final c d0;
    private m e0;
    private final int f0;
    private final int g0;
    private final int h0;
    private final m q;

    private a(m m8, m m9, c c8, m m10, int n8) {
        j.Objects.requireNonNull((Object)m8, (String)"start cannot be null");
        j.Objects.requireNonNull((Object)m9, (String)"end cannot be null");
        j.Objects.requireNonNull((Object)c8, (String)"validator cannot be null");
        this.q = m8;
        this.c0 = m9;
        this.e0 = m10;
        this.f0 = n8;
        this.d0 = c8;
        if (m10 != null && m8.d(m10) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (m10 != null && m10.d(m9) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (n8 >= 0 && n8 <= t.r().getMaximum(7)) {
            this.h0 = m8.J(m9) + 1;
            this.g0 = m9.d0 - m8.d0 + 1;
            return;
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        object = (a)object;
        return this.q.equals(((a)object).q) && this.c0.equals(((a)object).c0) && ax.b0.b.a(this.e0, ((a)object).e0) && this.f0 == ((a)object).f0 && this.d0.equals(((a)object).d0);
    }

    m f(m m8) {
        if (m8.d(this.q) < 0) {
            return this.q;
        }
        m m9 = m8;
        if (m8.d(this.c0) > 0) {
            m9 = this.c0;
        }
        return m9;
    }

    public c g() {
        return this.d0;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.q, this.c0, this.e0, this.f0, this.d0});
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

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeParcelable((Parcelable)this.q, 0);
        parcel.writeParcelable((Parcelable)this.c0, 0);
        parcel.writeParcelable((Parcelable)this.e0, 0);
        parcel.writeParcelable((Parcelable)this.d0, 0);
        parcel.writeInt(this.f0);
    }

    boolean y(long l8) {
        m m8;
        return this.q.E(1) <= l8 && l8 <= (m8 = this.c0).E(m8.f0);
    }

    void z(m m8) {
        this.e0 = m8;
    }

    public static final class b {
        static final long f = t.a(m.j((int)1900, (int)0).g0);
        static final long g = t.a(m.j((int)2100, (int)11).g0);
        private long a = f;
        private long b = g;
        private Long c;
        private int d;
        private c e = h.a(Long.MIN_VALUE);

        public b() {
        }

        b(a a8) {
            this.a = ((a)a8).q.g0;
            this.b = ((a)a8).c0.g0;
            this.c = ((a)a8).e0.g0;
            this.d = a8.f0;
            this.e = a8.d0;
        }

        public a a() {
            Object object = new Bundle();
            object.putParcelable("DEEP_COPY_VALIDATOR_KEY", (Parcelable)this.e);
            m m8 = m.B(this.a);
            m m9 = m.B(this.b);
            c c8 = (c)object.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            object = this.c;
            object = object == null ? null : m.B((Long)object);
            return new a(m8, m9, c8, (m)object, this.d);
        }

        public b b(long l8) {
            this.c = l8;
            return this;
        }
    }

    public static interface c
    extends Parcelable {
        public boolean t(long var1);
    }
}

