package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes3.dex */
final class m implements Comparable<m>, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();
    final int c0;
    final int d0;
    final int e0;
    final int f0;
    final long g0;
    private String h0;
    private final Calendar q;

    class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return m.j(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i) {
            return new m[i];
        }
    }

    private m(Calendar calendar) {
        calendar.set(5, 1);
        Calendar f = t.f(calendar);
        this.q = f;
        this.c0 = f.get(2);
        this.d0 = f.get(1);
        this.e0 = f.getMaximum(7);
        this.f0 = f.getActualMaximum(5);
        this.g0 = f.getTimeInMillis();
    }

    static m B(long j) {
        Calendar r = t.r();
        r.setTimeInMillis(j);
        return new m(r);
    }

    static m C() {
        return new m(t.p());
    }

    static m j(int i, int i2) {
        Calendar r = t.r();
        r.set(1, i);
        r.set(2, i2);
        return new m(r);
    }

    int D(int i) {
        int i2 = this.q.get(7);
        if (i <= 0) {
            i = this.q.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + this.e0 : i3;
    }

    long E(int i) {
        Calendar f = t.f(this.q);
        f.set(5, i);
        return f.getTimeInMillis();
    }

    int F(long j) {
        Calendar f = t.f(this.q);
        f.setTimeInMillis(j);
        return f.get(5);
    }

    String G() {
        if (this.h0 == null) {
            this.h0 = g.l(this.q.getTimeInMillis());
        }
        return this.h0;
    }

    long H() {
        return this.q.getTimeInMillis();
    }

    m I(int i) {
        Calendar f = t.f(this.q);
        f.add(2, i);
        return new m(f);
    }

    int J(m mVar) {
        if (this.q instanceof GregorianCalendar) {
            return ((mVar.d0 - this.d0) * 12) + (mVar.c0 - this.c0);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(m mVar) {
        return this.q.compareTo(mVar.q);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.c0 == mVar.c0 && this.d0 == mVar.d0;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c0), Integer.valueOf(this.d0)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.d0);
        parcel.writeInt(this.c0);
    }
}
