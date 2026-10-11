/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ax.M5.n;
import ax.M5.p;
import ax.N5.c;
import com.google.android.gms.auth.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;

public class TokenData
extends ax.N5.a
implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new a();
    private final String c0;
    private final Long d0;
    private final boolean e0;
    private final boolean f0;
    private final List g0;
    private final String h0;
    final int q;

    TokenData(int n8, String string, Long l8, boolean bl, boolean bl2, List list, String string2) {
        this.q = n8;
        this.c0 = p.f(string);
        this.d0 = l8;
        this.e0 = bl;
        this.f0 = bl2;
        this.g0 = list;
        this.h0 = string2;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof TokenData)) {
            return false;
        }
        object = (TokenData)object;
        return TextUtils.equals((CharSequence)this.c0, (CharSequence)((TokenData)object).c0) && n.b(this.d0, ((TokenData)object).d0) && this.e0 == ((TokenData)object).e0 && this.f0 == ((TokenData)object).f0 && n.b(this.g0, ((TokenData)object).g0) && n.b(this.h0, ((TokenData)object).h0);
    }

    public final int hashCode() {
        return n.c(this.c0, this.d0, this.e0, this.f0, this.g0, this.h0);
    }

    public final String k() {
        return this.c0;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.i(parcel, 1, this.q);
        c.n(parcel, 2, this.c0, false);
        c.l(parcel, 3, this.d0, false);
        c.c(parcel, 4, this.e0);
        c.c(parcel, 5, this.f0);
        c.o(parcel, 6, this.g0, false);
        c.n(parcel, 7, this.h0, false);
        c.b(parcel, n8);
    }
}

