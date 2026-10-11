package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ax.M5.C0819n;
import ax.M5.C0821p;
import ax.N5.c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;

/* loaded from: classes3.dex */
public class TokenData extends ax.N5.a implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new a();
    private final String c0;
    private final Long d0;
    private final boolean e0;
    private final boolean f0;
    private final List g0;
    private final String h0;
    final int q;

    TokenData(int i, String str, Long l, boolean z, boolean z2, List list, String str2) {
        this.q = i;
        this.c0 = C0821p.f(str);
        this.d0 = l;
        this.e0 = z;
        this.f0 = z2;
        this.g0 = list;
        this.h0 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.c0, tokenData.c0) && C0819n.b(this.d0, tokenData.d0) && this.e0 == tokenData.e0 && this.f0 == tokenData.f0 && C0819n.b(this.g0, tokenData.g0) && C0819n.b(this.h0, tokenData.h0);
    }

    public final int hashCode() {
        return C0819n.c(this.c0, this.d0, Boolean.valueOf(this.e0), Boolean.valueOf(this.f0), this.g0, this.h0);
    }

    public final String k() {
        return this.c0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.i(parcel, 1, this.q);
        c.n(parcel, 2, this.c0, false);
        c.l(parcel, 3, this.d0, false);
        c.c(parcel, 4, this.e0);
        c.c(parcel, 5, this.f0);
        c.o(parcel, 6, this.g0, false);
        c.n(parcel, 7, this.h0, false);
        c.b(parcel, a);
    }
}
