package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import ax.M5.C0821p;
import ax.b6.AbstractC1599k4;
import ax.b6.C1503C;
import ax.b6.C1541e0;
import ax.b6.C1638p2;
import ax.b6.C1646q2;
import ax.b6.C1663s4;
import ax.b6.C7;
import ax.b6.G7;
import ax.b6.I1;
import ax.b6.I7;
import ax.b6.K1;
import ax.b6.L1;
import ax.f6.C2069q;
import ax.f6.EnumC2067o;
import com.google.android.gms.measurement.internal.C3667h3;
import com.google.android.gms.measurement.internal.C3726q2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.q2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3726q2 extends AbstractC3690k5 implements InterfaceC3677j {
    private final Map<String, Map<String, String>> d;
    private final Map<String, Set<String>> e;
    private final Map<String, Map<String, Boolean>> f;
    private final Map<String, Map<String, Boolean>> g;
    private final Map<String, ax.b6.L1> h;
    private final Map<String, Map<String, Integer>> i;
    final ax.B.j<String, C1503C> j;
    final G7 k;
    private final Map<String, String> l;
    private final Map<String, String> m;
    private final Map<String, String> n;

    C3726q2(q5 q5Var) {
        super(q5Var);
        this.d = new ax.B.a();
        this.e = new ax.B.a();
        this.f = new ax.B.a();
        this.g = new ax.B.a();
        this.h = new ax.B.a();
        this.l = new ax.B.a();
        this.m = new ax.B.a();
        this.n = new ax.B.a();
        this.i = new ax.B.a();
        this.j = new C3755v2(this, 20);
        this.k = new C3749u2(this);
    }

    private final ax.b6.L1 A(String str, byte[] bArr) {
        if (bArr == null) {
            return ax.b6.L1.R();
        }
        try {
            ax.b6.L1 l1 = (ax.b6.L1) ((AbstractC1599k4) ((L1.a) x5.G(ax.b6.L1.P(), bArr)).q());
            k().K().c("Parsed config. version, gmp_app_id", l1.e0() ? Long.valueOf(l1.N()) : null, l1.c0() ? l1.T() : null);
            return l1;
        } catch (C1663s4 e) {
            k().L().c("Unable to merge remote config. appId", V1.v(str), e);
            return ax.b6.L1.R();
        } catch (RuntimeException e2) {
            k().L().c("Unable to merge remote config. appId", V1.v(str), e2);
            return ax.b6.L1.R();
        }
    }

    private static C3667h3.a C(I1.e eVar) {
        int i = C3767x2.b[eVar.ordinal()];
        if (i == 1) {
            return C3667h3.a.AD_STORAGE;
        }
        if (i == 2) {
            return C3667h3.a.ANALYTICS_STORAGE;
        }
        if (i == 3) {
            return C3667h3.a.AD_USER_DATA;
        }
        if (i != 4) {
            return null;
        }
        return C3667h3.a.AD_PERSONALIZATION;
    }

    private static Map<String, String> D(ax.b6.L1 l1) {
        ax.B.a aVar = new ax.B.a();
        if (l1 != null) {
            for (ax.b6.O1 o1 : l1.Z()) {
                aVar.put(o1.J(), o1.K());
            }
        }
        return aVar;
    }

    private final void F(String str, L1.a aVar) {
        HashSet hashSet = new HashSet();
        ax.B.a aVar2 = new ax.B.a();
        ax.B.a aVar3 = new ax.B.a();
        ax.B.a aVar4 = new ax.B.a();
        if (aVar != null) {
            Iterator<ax.b6.J1> it = aVar.D().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().J());
            }
            for (int i = 0; i < aVar.w(); i++) {
                K1.a A = aVar.x(i).A();
                if (A.y().isEmpty()) {
                    k().L().a("EventConfig contained null event name");
                } else {
                    String y = A.y();
                    String b = C2069q.b(A.y());
                    if (!TextUtils.isEmpty(b)) {
                        A = A.x(b);
                        aVar.y(i, A);
                    }
                    if (A.C() && A.z()) {
                        aVar2.put(y, Boolean.TRUE);
                    }
                    if (A.D() && A.B()) {
                        aVar3.put(A.y(), Boolean.TRUE);
                    }
                    if (A.E()) {
                        if (A.w() < 2 || A.w() > 65535) {
                            k().L().c("Invalid sampling rate. Event name, sample rate", A.y(), Integer.valueOf(A.w()));
                        } else {
                            aVar4.put(A.y(), Integer.valueOf(A.w()));
                        }
                    }
                }
            }
        }
        this.e.put(str, hashSet);
        this.f.put(str, aVar2);
        this.g.put(str, aVar3);
        this.i.put(str, aVar4);
    }

    private final void G(final String str, ax.b6.L1 l1) {
        if (l1.n() == 0) {
            this.j.e(str);
            return;
        }
        k().K().b("EES programs found", Integer.valueOf(l1.n()));
        C1646q2 c1646q2 = l1.Y().get(0);
        try {
            C1503C c1503c = new C1503C();
            c1503c.c("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.r2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new ax.b6.A5("internal.remoteConfig", new C3773y2(C3726q2.this, str));
                }
            });
            c1503c.c("internal.appMetadata", new Callable() { // from class: ax.f6.l
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final C3726q2 c3726q2 = C3726q2.this;
                    final String str2 = str;
                    return new I7("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.s2
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C3726q2 c3726q22 = C3726q2.this;
                            String str3 = str2;
                            Z1 H0 = c3726q22.q().H0(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put("package_name", str3);
                            hashMap.put("gmp_version", 97001L);
                            if (H0 != null) {
                                String o = H0.o();
                                if (o != null) {
                                    hashMap.put("app_version", o);
                                }
                                hashMap.put("app_version_int", Long.valueOf(H0.U()));
                                hashMap.put("dynamite_version", Long.valueOf(H0.v0()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            c1503c.c("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.t2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new C7(C3726q2.this.k);
                }
            });
            c1503c.b(c1646q2);
            this.j.d(str, c1503c);
            k().K().c("EES program loaded for appId, activities", str, Integer.valueOf(c1646q2.I().n()));
            Iterator<C1638p2> it = c1646q2.I().K().iterator();
            while (it.hasNext()) {
                k().K().b("EES program activity", it.next().J());
            }
        } catch (C1541e0 unused) {
            k().G().b("Failed to load EES program. appId", str);
        }
    }

    private final void h0(String str) {
        u();
        n();
        C0821p.f(str);
        if (this.h.get(str) == null) {
            C3698m J0 = q().J0(str);
            if (J0 != null) {
                L1.a A = A(str, J0.a).A();
                F(str, A);
                this.d.put(str, D((ax.b6.L1) ((AbstractC1599k4) A.q())));
                this.h.put(str, (ax.b6.L1) ((AbstractC1599k4) A.q()));
                G(str, (ax.b6.L1) ((AbstractC1599k4) A.q()));
                this.l.put(str, A.B());
                this.m.put(str, J0.b);
                this.n.put(str, J0.c);
                return;
            }
            this.d.put(str, null);
            this.f.put(str, null);
            this.e.put(str, null);
            this.g.put(str, null);
            this.h.put(str, null);
            this.l.put(str, null);
            this.m.put(str, null);
            this.n.put(str, null);
            this.i.put(str, null);
        }
    }

    static /* synthetic */ C1503C z(C3726q2 c3726q2, String str) {
        c3726q2.u();
        C0821p.f(str);
        if (!c3726q2.X(str)) {
            return null;
        }
        if (!c3726q2.h.containsKey(str) || c3726q2.h.get(str) == null) {
            c3726q2.h0(str);
        } else {
            c3726q2.G(str, c3726q2.h.get(str));
        }
        return c3726q2.j.h().get(str);
    }

    final EnumC2067o B(String str, C3667h3.a aVar) {
        n();
        h0(str);
        ax.b6.I1 J = J(str);
        if (J == null) {
            return EnumC2067o.UNINITIALIZED;
        }
        for (I1.a aVar2 : J.N()) {
            if (C(aVar2.K()) == aVar) {
                int i = C3767x2.c[aVar2.J().ordinal()];
                return i != 1 ? i != 2 ? EnumC2067o.UNINITIALIZED : EnumC2067o.GRANTED : EnumC2067o.DENIED;
            }
        }
        return EnumC2067o.UNINITIALIZED;
    }

    protected final boolean H(String str, byte[] bArr, String str2, String str3) {
        u();
        n();
        C0821p.f(str);
        L1.a A = A(str, bArr).A();
        if (A == null) {
            return false;
        }
        F(str, A);
        G(str, (ax.b6.L1) ((AbstractC1599k4) A.q()));
        this.h.put(str, (ax.b6.L1) ((AbstractC1599k4) A.q()));
        this.l.put(str, A.B());
        this.m.put(str, str2);
        this.n.put(str, str3);
        this.d.put(str, D((ax.b6.L1) ((AbstractC1599k4) A.q())));
        q().a0(str, new ArrayList(A.C()));
        try {
            A.z();
            bArr = ((ax.b6.L1) ((AbstractC1599k4) A.q())).l();
        } catch (RuntimeException e) {
            k().L().c("Unable to serialize reduced-size config. Storing full config instead. appId", V1.v(str), e);
        }
        C3691l q = q();
        C0821p.f(str);
        q.n();
        q.u();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (q.B().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                q.k().G().b("Failed to update remote config (got 0). appId", V1.v(str));
            }
        } catch (SQLiteException e2) {
            q.k().G().c("Error storing remote config. appId", V1.v(str), e2);
        }
        this.h.put(str, (ax.b6.L1) ((AbstractC1599k4) A.q()));
        return true;
    }

    final int I(String str, String str2) {
        Integer num;
        n();
        h0(str);
        Map<String, Integer> map = this.i.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    final ax.b6.I1 J(String str) {
        n();
        h0(str);
        ax.b6.L1 L = L(str);
        if (L == null || !L.b0()) {
            return null;
        }
        return L.O();
    }

    final C3667h3.a K(String str, C3667h3.a aVar) {
        n();
        h0(str);
        ax.b6.I1 J = J(str);
        if (J == null) {
            return null;
        }
        for (I1.c cVar : J.M()) {
            if (aVar == C(cVar.K())) {
                return C(cVar.J());
            }
        }
        return null;
    }

    protected final ax.b6.L1 L(String str) {
        u();
        n();
        C0821p.f(str);
        h0(str);
        return this.h.get(str);
    }

    final boolean M(String str, C3667h3.a aVar) {
        n();
        h0(str);
        ax.b6.I1 J = J(str);
        if (J == null) {
            return false;
        }
        Iterator<I1.a> it = J.L().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            I1.a next = it.next();
            if (aVar == C(next.K())) {
                if (next.J() == I1.d.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean N(String str, String str2) {
        Boolean bool;
        n();
        h0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.g.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected final String O(String str) {
        n();
        return this.n.get(str);
    }

    final boolean P(String str, String str2) {
        Boolean bool;
        n();
        h0(str);
        if (Y(str) && B5.J0(str2)) {
            return true;
        }
        if (a0(str) && B5.L0(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected final String Q(String str) {
        n();
        return this.m.get(str);
    }

    final String R(String str) {
        n();
        h0(str);
        return this.l.get(str);
    }

    final Set<String> S(String str) {
        n();
        h0(str);
        return this.e.get(str);
    }

    final SortedSet<String> T(String str) {
        n();
        h0(str);
        TreeSet treeSet = new TreeSet();
        ax.b6.I1 J = J(str);
        if (J != null) {
            Iterator<I1.f> it = J.K().iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().J());
            }
        }
        return treeSet;
    }

    protected final void U(String str) {
        n();
        this.m.put(str, null);
    }

    final void V(String str) {
        n();
        this.h.remove(str);
    }

    final boolean W(String str) {
        n();
        ax.b6.L1 L = L(str);
        if (L == null) {
            return false;
        }
        return L.a0();
    }

    public final boolean X(String str) {
        ax.b6.L1 l1;
        return (TextUtils.isEmpty(str) || (l1 = this.h.get(str)) == null || l1.n() == 0) ? false : true;
    }

    final boolean Y(String str) {
        return "1".equals(c(str, "measurement.upload.blacklist_internal"));
    }

    final boolean Z(String str) {
        n();
        h0(str);
        ax.b6.I1 J = J(str);
        return J == null || !J.P() || J.O();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    final boolean a0(String str) {
        return "1".equals(c(str, "measurement.upload.blacklist_public"));
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ ax.R5.e b() {
        return super.b();
    }

    final boolean b0(String str) {
        n();
        h0(str);
        return this.e.get(str) != null && this.e.get(str).contains("app_instance_id");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3677j
    public final String c(String str, String str2) {
        n();
        h0(str);
        Map<String, String> map = this.d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    final boolean c0(String str) {
        n();
        h0(str);
        if (this.e.get(str) != null) {
            return this.e.get(str).contains("device_model") || this.e.get(str).contains("device_info");
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3663h d() {
        return super.d();
    }

    final boolean d0(String str) {
        n();
        h0(str);
        return this.e.get(str) != null && this.e.get(str).contains("enhanced_user_id");
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ C3628c e() {
        return super.e();
    }

    final boolean e0(String str) {
        n();
        h0(str);
        return this.e.get(str) != null && this.e.get(str).contains("google_signals");
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3758w f() {
        return super.f();
    }

    final boolean f0(String str) {
        n();
        h0(str);
        if (this.e.get(str) != null) {
            return this.e.get(str).contains("os_version") || this.e.get(str).contains("device_info");
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ R1 g() {
        return super.g();
    }

    final boolean g0(String str) {
        n();
        h0(str);
        return this.e.get(str) != null && this.e.get(str).contains("user_id");
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

    final long y(String str) {
        String c = c(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(c)) {
            return 0L;
        }
        try {
            return Long.parseLong(c);
        } catch (NumberFormatException e) {
            k().L().c("Unable to parse timezone offset. appId", V1.v(str), e);
            return 0L;
        }
    }
}
