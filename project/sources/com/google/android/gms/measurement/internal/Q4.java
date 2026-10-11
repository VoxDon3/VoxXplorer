package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import ax.C5.a;
import j$.util.Objects;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class Q4 extends AbstractC3690k5 {
    private final Map<String, P4> d;
    public final C3694l2 e;
    public final C3694l2 f;
    public final C3694l2 g;
    public final C3694l2 h;
    public final C3694l2 i;

    Q4(q5 q5Var) {
        super(q5Var);
        this.d = new HashMap();
        C3659g2 h = h();
        Objects.requireNonNull(h);
        this.e = new C3694l2(h, "last_delete_stale", 0L);
        C3659g2 h2 = h();
        Objects.requireNonNull(h2);
        this.f = new C3694l2(h2, "backoff", 0L);
        C3659g2 h3 = h();
        Objects.requireNonNull(h3);
        this.g = new C3694l2(h3, "last_upload", 0L);
        C3659g2 h4 = h();
        Objects.requireNonNull(h4);
        this.h = new C3694l2(h4, "last_upload_attempt", 0L);
        C3659g2 h5 = h();
        Objects.requireNonNull(h5);
        this.i = new C3694l2(h5, "midnight_offset", 0L);
    }

    @Deprecated
    private final Pair<String, Boolean> y(String str) {
        P4 p4;
        a.C0061a c0061a;
        n();
        long b = b().b();
        P4 p42 = this.d.get(str);
        if (p42 != null && b < p42.c) {
            return new Pair<>(p42.a, Boolean.valueOf(p42.b));
        }
        ax.C5.a.b(true);
        long B = d().B(str) + b;
        try {
            try {
                c0061a = ax.C5.a.a(a());
            } catch (PackageManager.NameNotFoundException unused) {
                if (p42 != null && b < p42.c + d().z(str, F.c)) {
                    return new Pair<>(p42.a, Boolean.valueOf(p42.b));
                }
                c0061a = null;
            }
        } catch (Exception e) {
            k().F().b("Unable to get advertising id", e);
            p4 = new P4(HttpUrl.FRAGMENT_ENCODE_SET, false, B);
        }
        if (c0061a == null) {
            return new Pair<>("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String a = c0061a.a();
        p4 = a != null ? new P4(a, c0061a.b(), B) : new P4(HttpUrl.FRAGMENT_ENCODE_SET, c0061a.b(), B);
        this.d.put(str, p4);
        ax.C5.a.b(false);
        return new Pair<>(p4.a, Boolean.valueOf(p4.b));
    }

    @Deprecated
    final String A(String str, boolean z) {
        n();
        String str2 = z ? (String) y(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest V0 = B5.V0();
        if (V0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, V0.digest(str2.getBytes())));
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ ax.R5.e b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3663h d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ C3628c e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3758w f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ R1 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3659g2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ B5 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ V1 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ C3779z2 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.C3697l5
    public final /* bridge */ /* synthetic */ x5 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.C3697l5
    public final /* bridge */ /* synthetic */ J5 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.C3697l5
    public final /* bridge */ /* synthetic */ C3691l q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.C3697l5
    public final /* bridge */ /* synthetic */ C3726q2 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.C3697l5
    public final /* bridge */ /* synthetic */ Q4 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.C3697l5
    public final /* bridge */ /* synthetic */ o5 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3690k5
    protected final boolean x() {
        return false;
    }

    final Pair<String, Boolean> z(String str, C3667h3 c3667h3) {
        return c3667h3.A() ? y(str) : new Pair<>(HttpUrl.FRAGMENT_ENCODE_SET, Boolean.FALSE);
    }
}
