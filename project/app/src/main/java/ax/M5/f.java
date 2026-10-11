/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import ax.J5.e;
import ax.M5.a;
import ax.M5.j;
import ax.M5.l0;
import com.google.android.gms.common.api.Scope;

public class f
extends ax.N5.a {
    public static final Parcelable.Creator<f> CREATOR = new l0();
    static final Scope[] p0 = new Scope[0];
    static final e[] q0 = new e[0];
    final int c0;
    final int d0;
    String e0;
    IBinder f0;
    Scope[] g0;
    Bundle h0;
    Account i0;
    e[] j0;
    e[] k0;
    final boolean l0;
    final int m0;
    boolean n0;
    private final String o0;
    final int q;

    f(int n8, int n9, int n10, String string, IBinder iBinder, Scope[] eArray, Bundle eArray2, Account account, e[] eArray3, e[] eArray4, boolean bl, int n11, boolean bl2, String string2) {
        e[] eArray5 = eArray;
        if (eArray == null) {
            eArray5 = p0;
        }
        eArray = eArray2;
        if (eArray2 == null) {
            eArray = new Bundle();
        }
        eArray2 = eArray3;
        if (eArray3 == null) {
            eArray2 = q0;
        }
        eArray3 = eArray4;
        if (eArray4 == null) {
            eArray3 = q0;
        }
        this.q = n8;
        this.c0 = n9;
        this.d0 = n10;
        this.e0 = "com.google.android.gms".equals(string) ? "com.google.android.gms" : string;
        if (n8 < 2) {
            string = iBinder != null ? a.B(j.a.w(iBinder)) : null;
            this.i0 = string;
        } else {
            this.f0 = iBinder;
            this.i0 = account;
        }
        this.g0 = eArray5;
        this.h0 = eArray;
        this.j0 = eArray2;
        this.k0 = eArray3;
        this.l0 = bl;
        this.m0 = n11;
        this.n0 = bl2;
        this.o0 = string2;
    }

    public final String k() {
        return this.o0;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        ax.M5.l0.a(this, parcel, n8);
    }
}

