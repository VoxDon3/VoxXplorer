package ax.M5;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import ax.J5.C0744e;
import ax.M5.InterfaceC0815j;
import com.google.android.gms.common.api.Scope;

/* renamed from: ax.M5.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0811f extends ax.N5.a {
    public static final Parcelable.Creator<C0811f> CREATOR = new l0();
    static final Scope[] p0 = new Scope[0];
    static final C0744e[] q0 = new C0744e[0];
    final int c0;
    final int d0;
    String e0;
    IBinder f0;
    Scope[] g0;
    Bundle h0;
    Account i0;
    C0744e[] j0;
    C0744e[] k0;
    final boolean l0;
    final int m0;
    boolean n0;
    private final String o0;
    final int q;

    C0811f(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C0744e[] c0744eArr, C0744e[] c0744eArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? p0 : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c0744eArr = c0744eArr == null ? q0 : c0744eArr;
        c0744eArr2 = c0744eArr2 == null ? q0 : c0744eArr2;
        this.q = i;
        this.c0 = i2;
        this.d0 = i3;
        if ("com.google.android.gms".equals(str)) {
            this.e0 = "com.google.android.gms";
        } else {
            this.e0 = str;
        }
        if (i < 2) {
            this.i0 = iBinder != null ? BinderC0806a.B(InterfaceC0815j.a.w(iBinder)) : null;
        } else {
            this.f0 = iBinder;
            this.i0 = account;
        }
        this.g0 = scopeArr;
        this.h0 = bundle;
        this.j0 = c0744eArr;
        this.k0 = c0744eArr2;
        this.l0 = z;
        this.m0 = i4;
        this.n0 = z2;
        this.o0 = str2;
    }

    public final String k() {
        return this.o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        l0.a(this, parcel, i);
    }
}
