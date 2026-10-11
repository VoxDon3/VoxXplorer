/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.g;
import com.google.android.material.datepicker.t;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class m
implements Comparable<m>,
Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new Parcelable.Creator<m>(){

        public m a(Parcel parcel) {
            return m.j(parcel.readInt(), parcel.readInt());
        }

        public m[] b(int n8) {
            return new m[n8];
        }
    };
    final int c0;
    final int d0;
    final int e0;
    final int f0;
    final long g0;
    private String h0;
    private final Calendar q;

    private m(Calendar calendar) {
        calendar.set(5, 1);
        this.q = calendar = t.f(calendar);
        this.c0 = calendar.get(2);
        this.d0 = calendar.get(1);
        this.e0 = calendar.getMaximum(7);
        this.f0 = calendar.getActualMaximum(5);
        this.g0 = calendar.getTimeInMillis();
    }

    static m B(long l8) {
        Calendar calendar = t.r();
        calendar.setTimeInMillis(l8);
        return new m(calendar);
    }

    static m C() {
        return new m(t.p());
    }

    static m j(int n8, int n9) {
        Calendar calendar = t.r();
        calendar.set(1, n8);
        calendar.set(2, n9);
        return new m(calendar);
    }

    int D(int n8) {
        int n9 = this.q.get(7);
        if (n8 <= 0) {
            n8 = this.q.getFirstDayOfWeek();
        }
        n9 -= n8;
        n8 = n9;
        if (n9 < 0) {
            n8 = n9 + this.e0;
        }
        return n8;
    }

    long E(int n8) {
        Calendar calendar = t.f(this.q);
        calendar.set(5, n8);
        return calendar.getTimeInMillis();
    }

    int F(long l8) {
        Calendar calendar = t.f(this.q);
        calendar.setTimeInMillis(l8);
        return calendar.get(5);
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

    m I(int n8) {
        Calendar calendar = t.f(this.q);
        calendar.add(2, n8);
        return new m(calendar);
    }

    int J(m m8) {
        if (this.q instanceof GregorianCalendar) {
            return (m8.d0 - this.d0) * 12 + (m8.c0 - this.c0);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public int d(m m8) {
        return this.q.compareTo(m8.q);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof m)) {
            return false;
        }
        object = (m)object;
        return this.c0 == ((m)object).c0 && this.d0 == ((m)object).d0;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.c0, this.d0});
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeInt(this.d0);
        parcel.writeInt(this.c0);
    }
}

