package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ax.M5.C0821p;
import ax.N5.b;
import ax.b6.AbstractC1599k4;
import ax.b6.C1516b2;
import ax.b6.C1534d2;
import ax.b6.C1540e;
import ax.b6.C1543e2;
import ax.b6.C1561g2;
import ax.b6.C1570h2;
import ax.b6.C1579i2;
import ax.b6.C1602k7;
import ax.b6.C1663s4;
import ax.b6.C1665s6;
import ax.b6.M6;
import ax.b6.Z1;
import ax.b6.l7;
import ax.b6.r7;
import ax.f6.C2069q;
import com.google.android.gms.measurement.internal.C3667h3;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class x5 extends AbstractC3690k5 {
    x5(q5 q5Var) {
        super(q5Var);
    }

    static Bundle B(List<C1516b2> list) {
        Bundle bundle = new Bundle();
        for (C1516b2 c1516b2 : list) {
            String f0 = c1516b2.f0();
            if (c1516b2.i0()) {
                bundle.putDouble(f0, c1516b2.I());
            } else if (c1516b2.j0()) {
                bundle.putFloat(f0, c1516b2.T());
            } else if (c1516b2.m0()) {
                bundle.putString(f0, c1516b2.g0());
            } else if (c1516b2.k0()) {
                bundle.putLong(f0, c1516b2.a0());
            }
        }
        return bundle;
    }

    private final Bundle C(Map<String, Object> map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(C((Map) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    static C1516b2 F(ax.b6.Z1 z1, String str) {
        for (C1516b2 c1516b2 : z1.f0()) {
            if (c1516b2.f0().equals(str)) {
                return c1516b2;
            }
        }
        return null;
    }

    static <BuilderT extends ax.b6.T4> BuilderT G(BuilderT buildert, byte[] bArr) throws C1663s4 {
        ax.b6.W3 a = ax.b6.W3.a();
        return a != null ? (BuilderT) buildert.F0(bArr, a) : (BuilderT) buildert.W(bArr);
    }

    static Object J(ax.b6.Z1 z1, String str, Object obj) {
        Object g0 = g0(z1, str);
        return g0 == null ? obj : g0;
    }

    private static String N(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    static List<Long> O(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 < bitSet.length()) {
                    if (bitSet.get(i3)) {
                        j |= 1 << i2;
                    }
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    private static void R(Uri.Builder builder, String str, String str2, Set<String> set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    private static void S(Uri.Builder builder, String[] strArr, Bundle bundle, Set<String> set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                R(builder, str3, string, set);
            }
        }
    }

    static void T(Z1.a aVar, String str, Object obj) {
        List<C1516b2> M = aVar.M();
        int i = 0;
        while (true) {
            if (i >= M.size()) {
                i = -1;
                break;
            } else if (str.equals(M.get(i).f0())) {
                break;
            } else {
                i++;
            }
        }
        C1516b2.a C = C1516b2.c0().C(str);
        if (obj instanceof Long) {
            C.y(((Long) obj).longValue());
        } else if (obj instanceof String) {
            C.E((String) obj);
        } else if (obj instanceof Double) {
            C.x(((Double) obj).doubleValue());
        }
        if (i >= 0) {
            aVar.y(i, C);
        } else {
            aVar.C(C);
        }
    }

    private static void X(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private final void Y(StringBuilder sb, int i, ax.b6.C1 c1) {
        if (c1 == null) {
            return;
        }
        X(sb, i);
        sb.append("filter {\n");
        if (c1.Q()) {
            b0(sb, i, "complement", Boolean.valueOf(c1.P()));
        }
        if (c1.S()) {
            b0(sb, i, "param_name", g().f(c1.O()));
        }
        if (c1.T()) {
            int i2 = i + 1;
            ax.b6.F1 N = c1.N();
            if (N != null) {
                X(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (N.Q()) {
                    b0(sb, i2, "match_type", N.I().name());
                }
                if (N.P()) {
                    b0(sb, i2, "expression", N.L());
                }
                if (N.O()) {
                    b0(sb, i2, "case_sensitive", Boolean.valueOf(N.N()));
                }
                if (N.n() > 0) {
                    X(sb, i + 2);
                    sb.append("expression_list {\n");
                    for (String str : N.M()) {
                        X(sb, i + 3);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                X(sb, i2);
                sb.append("}\n");
            }
        }
        if (c1.R()) {
            Z(sb, i + 1, "number_filter", c1.M());
        }
        X(sb, i);
        sb.append("}\n");
    }

    private static void Z(StringBuilder sb, int i, String str, ax.b6.D1 d1) {
        if (d1 == null) {
            return;
        }
        X(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (d1.P()) {
            b0(sb, i, "comparison_type", d1.I().name());
        }
        if (d1.R()) {
            b0(sb, i, "match_as_float", Boolean.valueOf(d1.O()));
        }
        if (d1.Q()) {
            b0(sb, i, "comparison_value", d1.L());
        }
        if (d1.T()) {
            b0(sb, i, "min_comparison_value", d1.N());
        }
        if (d1.S()) {
            b0(sb, i, "max_comparison_value", d1.M());
        }
        X(sb, i);
        sb.append("}\n");
    }

    private static void a0(StringBuilder sb, int i, String str, C1561g2 c1561g2) {
        if (c1561g2 == null) {
            return;
        }
        X(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (c1561g2.L() != 0) {
            X(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l : c1561g2.c0()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (c1561g2.T() != 0) {
            X(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l2 : c1561g2.e0()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (c1561g2.n() != 0) {
            X(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (ax.b6.Y1 y1 : c1561g2.b0()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(y1.Q() ? Integer.valueOf(y1.n()) : null);
                sb.append(":");
                sb.append(y1.P() ? Long.valueOf(y1.M()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (c1561g2.P() != 0) {
            X(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (C1570h2 c1570h2 : c1561g2.d0()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(c1570h2.R() ? Integer.valueOf(c1570h2.M()) : null);
                sb.append(": [");
                Iterator<Long> it = c1570h2.Q().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    long longValue = it.next().longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i10 = i11;
                }
                sb.append("]");
                i8 = i9;
            }
            sb.append("}\n");
        }
        X(sb, 3);
        sb.append("}\n");
    }

    private static void b0(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        X(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private final void c0(StringBuilder sb, int i, List<C1516b2> list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        for (C1516b2 c1516b2 : list) {
            if (c1516b2 != null) {
                X(sb, i2);
                sb.append("param {\n");
                b0(sb, i2, "name", c1516b2.l0() ? g().f(c1516b2.f0()) : null);
                b0(sb, i2, "string_value", c1516b2.m0() ? c1516b2.g0() : null);
                b0(sb, i2, "int_value", c1516b2.k0() ? Long.valueOf(c1516b2.a0()) : null);
                b0(sb, i2, "double_value", c1516b2.i0() ? Double.valueOf(c1516b2.I()) : null);
                if (c1516b2.Y() > 0) {
                    c0(sb, i2, c1516b2.h0());
                }
                X(sb, i2);
                sb.append("}\n");
            }
        }
    }

    static boolean e0(D d, E5 e5) {
        C0821p.l(d);
        C0821p.l(e5);
        return (TextUtils.isEmpty(e5.c0) && TextUtils.isEmpty(e5.r0)) ? false : true;
    }

    static boolean f0(List<Long> list, int i) {
        if (i < (list.size() << 6)) {
            return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
        }
        return false;
    }

    static Object g0(ax.b6.Z1 z1, String str) {
        C1516b2 F = F(z1, str);
        if (F == null) {
            return null;
        }
        if (F.m0()) {
            return F.g0();
        }
        if (F.k0()) {
            return Long.valueOf(F.a0());
        }
        if (F.i0()) {
            return Double.valueOf(F.I());
        }
        if (F.Y() <= 0) {
            return null;
        }
        List<C1516b2> h0 = F.h0();
        ArrayList arrayList = new ArrayList();
        for (C1516b2 c1516b2 : h0) {
            if (c1516b2 != null) {
                Bundle bundle = new Bundle();
                for (C1516b2 c1516b22 : c1516b2.h0()) {
                    if (c1516b22.m0()) {
                        bundle.putString(c1516b22.f0(), c1516b22.g0());
                    } else if (c1516b22.k0()) {
                        bundle.putLong(c1516b22.f0(), c1516b22.a0());
                    } else if (c1516b22.i0()) {
                        bundle.putDouble(c1516b22.f0(), c1516b22.I());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    static boolean h0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static int y(C1543e2.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i = 0; i < aVar.e0(); i++) {
            if (str.equals(aVar.P0(i).c0())) {
                return i;
            }
        }
        return -1;
    }

    final long A(byte[] bArr) {
        C0821p.l(bArr);
        i().n();
        MessageDigest V0 = B5.V0();
        if (V0 != null) {
            return B5.B(V0.digest(bArr));
        }
        k().G().a("Failed to get MD5");
        return 0L;
    }

    final <T extends Parcelable> T D(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (b.a unused) {
            k().G().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    final ax.b6.Z1 E(A a) {
        Z1.a B = ax.b6.Z1.c0().B(a.e);
        Iterator<String> it = a.f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            C1516b2.a C = C1516b2.c0().C(next);
            Object D = a.f.D(next);
            C0821p.l(D);
            U(C, D);
            B.C(C);
        }
        return (ax.b6.Z1) ((AbstractC1599k4) B.q());
    }

    final D H(C1540e c1540e) {
        Object obj;
        Bundle C = C(c1540e.g(), true);
        String obj2 = (!C.containsKey("_o") || (obj = C.get("_o")) == null) ? "app" : obj.toString();
        String b = C2069q.b(c1540e.e());
        if (b == null) {
            b = c1540e.e();
        }
        return new D(b, new C(C), obj2, c1540e.a());
    }

    @TargetApi(30)
    final C3669h5 I(String str, C1543e2.a aVar, Z1.a aVar2, String str2) {
        int indexOf;
        if (!C1602k7.a() || !d().E(str, F.A0)) {
            return null;
        }
        long a = b().a();
        String[] split = d().C(str, F.f0).split(",");
        HashSet hashSet = new HashSet(split.length);
        for (String str3 : split) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        o5 t = t();
        String R = t.r().R(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(t.d().C(str, F.Y));
        if (TextUtils.isEmpty(R)) {
            builder.authority(t.d().C(str, F.Z));
        } else {
            builder.authority(R + "." + t.d().C(str, F.Z));
        }
        builder.path(t.d().C(str, F.a0));
        R(builder, "gmp_app_id", aVar.l1(), unmodifiableSet);
        R(builder, "gmp_version", "97001", unmodifiableSet);
        String i1 = aVar.i1();
        C3663h d = d();
        M1<Boolean> m1 = F.D0;
        if (d.E(str, m1) && r().b0(str)) {
            i1 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        R(builder, "app_instance_id", i1, unmodifiableSet);
        R(builder, "rdid", aVar.n1(), unmodifiableSet);
        R(builder, "bundle_id", aVar.h1(), unmodifiableSet);
        String L = aVar2.L();
        String a2 = C2069q.a(L);
        if (!TextUtils.isEmpty(a2)) {
            L = a2;
        }
        R(builder, "app_event_name", L, unmodifiableSet);
        R(builder, "app_version", String.valueOf(aVar.R()), unmodifiableSet);
        String m12 = aVar.m1();
        if (d().E(str, m1) && r().f0(str) && !TextUtils.isEmpty(m12) && (indexOf = m12.indexOf(".")) != -1) {
            m12 = m12.substring(0, indexOf);
        }
        R(builder, "os_version", m12, unmodifiableSet);
        R(builder, "timestamp", String.valueOf(aVar2.J()), unmodifiableSet);
        if (aVar.P()) {
            R(builder, "lat", "1", unmodifiableSet);
        }
        R(builder, "privacy_sandbox_version", String.valueOf(aVar.w()), unmodifiableSet);
        R(builder, "trigger_uri_source", "1", unmodifiableSet);
        R(builder, "trigger_uri_timestamp", String.valueOf(a), unmodifiableSet);
        R(builder, "request_uuid", str2, unmodifiableSet);
        List<C1516b2> M = aVar2.M();
        Bundle bundle = new Bundle();
        for (C1516b2 c1516b2 : M) {
            String f0 = c1516b2.f0();
            if (c1516b2.i0()) {
                bundle.putString(f0, String.valueOf(c1516b2.I()));
            } else if (c1516b2.j0()) {
                bundle.putString(f0, String.valueOf(c1516b2.T()));
            } else if (c1516b2.m0()) {
                bundle.putString(f0, c1516b2.g0());
            } else if (c1516b2.k0()) {
                bundle.putString(f0, String.valueOf(c1516b2.a0()));
            }
        }
        S(builder, d().C(str, F.e0).split("\\|"), bundle, unmodifiableSet);
        List<C1579i2> N = aVar.N();
        Bundle bundle2 = new Bundle();
        for (C1579i2 c1579i2 : N) {
            String c0 = c1579i2.c0();
            if (c1579i2.e0()) {
                bundle2.putString(c0, String.valueOf(c1579i2.I()));
            } else if (c1579i2.f0()) {
                bundle2.putString(c0, String.valueOf(c1579i2.Q()));
            } else if (c1579i2.i0()) {
                bundle2.putString(c0, c1579i2.d0());
            } else if (c1579i2.g0()) {
                bundle2.putString(c0, String.valueOf(c1579i2.X()));
            }
        }
        S(builder, d().C(str, F.d0).split("\\|"), bundle2, unmodifiableSet);
        R(builder, "dma", aVar.O() ? "1" : "0", unmodifiableSet);
        if (!aVar.k1().isEmpty()) {
            R(builder, "dma_cps", aVar.k1(), unmodifiableSet);
        }
        if (d().t(F.F0) && aVar.Q()) {
            ax.b6.U1 v0 = aVar.v0();
            if (!v0.m0().isEmpty()) {
                R(builder, "dl_gclid", v0.m0(), unmodifiableSet);
            }
            if (!v0.l0().isEmpty()) {
                R(builder, "dl_gbraid", v0.l0(), unmodifiableSet);
            }
            if (!v0.h0().isEmpty()) {
                R(builder, "dl_gs", v0.h0(), unmodifiableSet);
            }
            if (v0.I() > 0) {
                R(builder, "dl_ss_ts", String.valueOf(v0.I()), unmodifiableSet);
            }
            if (!v0.p0().isEmpty()) {
                R(builder, "mr_gclid", v0.p0(), unmodifiableSet);
            }
            if (!v0.o0().isEmpty()) {
                R(builder, "mr_gbraid", v0.o0(), unmodifiableSet);
            }
            if (!v0.n0().isEmpty()) {
                R(builder, "mr_gs", v0.n0(), unmodifiableSet);
            }
            if (v0.O() > 0) {
                R(builder, "mr_click_ts", String.valueOf(v0.O()), unmodifiableSet);
            }
        }
        return new C3669h5(builder.build().toString(), a, 1);
    }

    final String K(ax.b6.B1 b1) {
        if (b1 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (b1.Y()) {
            b0(sb, 0, "filter_id", Integer.valueOf(b1.N()));
        }
        b0(sb, 0, "event_name", g().c(b1.R()));
        String N = N(b1.T(), b1.U(), b1.V());
        if (!N.isEmpty()) {
            b0(sb, 0, "filter_type", N);
        }
        if (b1.X()) {
            Z(sb, 1, "event_count_filter", b1.Q());
        }
        if (b1.n() > 0) {
            sb.append("  filters {\n");
            Iterator<ax.b6.C1> it = b1.S().iterator();
            while (it.hasNext()) {
                Y(sb, 2, it.next());
            }
        }
        X(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    final String L(ax.b6.E1 e1) {
        if (e1 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (e1.R()) {
            b0(sb, 0, "filter_id", Integer.valueOf(e1.n()));
        }
        b0(sb, 0, "property_name", g().g(e1.N()));
        String N = N(e1.O(), e1.P(), e1.Q());
        if (!N.isEmpty()) {
            b0(sb, 0, "filter_type", N);
        }
        Y(sb, 1, e1.K());
        sb.append("}\n");
        return sb.toString();
    }

    final String M(C1534d2 c1534d2) {
        ax.b6.W1 L3;
        if (c1534d2 == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (r7.a() && d().t(F.t0) && c1534d2.n() > 0) {
            i();
            if (B5.H0(c1534d2.I(0).P3()) && c1534d2.R()) {
                b0(sb, 0, "UploadSubdomain", c1534d2.P());
            }
        }
        for (C1543e2 c1543e2 : c1534d2.Q()) {
            if (c1543e2 != null) {
                X(sb, 1);
                sb.append("bundle {\n");
                if (c1543e2.j1()) {
                    b0(sb, 1, "protocol_version", Integer.valueOf(c1543e2.n2()));
                }
                if (l7.a() && d().E(c1543e2.P3(), F.s0) && c1543e2.m1()) {
                    b0(sb, 1, "session_stitching_token", c1543e2.w0());
                }
                b0(sb, 1, "platform", c1543e2.u0());
                if (c1543e2.e1()) {
                    b0(sb, 1, "gmp_version", Long.valueOf(c1543e2.r3()));
                }
                if (c1543e2.r1()) {
                    b0(sb, 1, "uploading_gmp_version", Long.valueOf(c1543e2.J3()));
                }
                if (c1543e2.c1()) {
                    b0(sb, 1, "dynamite_version", Long.valueOf(c1543e2.h3()));
                }
                if (c1543e2.W0()) {
                    b0(sb, 1, "config_version", Long.valueOf(c1543e2.T2()));
                }
                b0(sb, 1, "gmp_app_id", c1543e2.r0());
                b0(sb, 1, "admob_app_id", c1543e2.O3());
                b0(sb, 1, "app_id", c1543e2.P3());
                b0(sb, 1, "app_version", c1543e2.k0());
                if (c1543e2.H0()) {
                    b0(sb, 1, "app_version_major", Integer.valueOf(c1543e2.J0()));
                }
                b0(sb, 1, "firebase_instance_id", c1543e2.q0());
                if (c1543e2.b1()) {
                    b0(sb, 1, "dev_cert_hash", Long.valueOf(c1543e2.a3()));
                }
                b0(sb, 1, "app_store", c1543e2.j0());
                if (c1543e2.q1()) {
                    b0(sb, 1, "upload_timestamp_millis", Long.valueOf(c1543e2.G3()));
                }
                if (c1543e2.n1()) {
                    b0(sb, 1, "start_timestamp_millis", Long.valueOf(c1543e2.A3()));
                }
                if (c1543e2.d1()) {
                    b0(sb, 1, "end_timestamp_millis", Long.valueOf(c1543e2.o3()));
                }
                if (c1543e2.i1()) {
                    b0(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c1543e2.x3()));
                }
                if (c1543e2.h1()) {
                    b0(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c1543e2.u3()));
                }
                b0(sb, 1, "app_instance_id", c1543e2.i0());
                b0(sb, 1, "resettable_device_id", c1543e2.v0());
                b0(sb, 1, "ds_id", c1543e2.p0());
                if (c1543e2.g1()) {
                    b0(sb, 1, "limited_ad_tracking", Boolean.valueOf(c1543e2.D0()));
                }
                b0(sb, 1, "os_version", c1543e2.t0());
                b0(sb, 1, "device_model", c1543e2.o0());
                b0(sb, 1, "user_default_language", c1543e2.x0());
                if (c1543e2.p1()) {
                    b0(sb, 1, "time_zone_offset_minutes", Integer.valueOf(c1543e2.D2()));
                }
                if (c1543e2.V0()) {
                    b0(sb, 1, "bundle_sequential_index", Integer.valueOf(c1543e2.s1()));
                }
                if (r7.a()) {
                    i();
                    if (B5.H0(c1543e2.P3()) && d().t(F.t0) && c1543e2.a1()) {
                        b0(sb, 1, "delivery_index", Integer.valueOf(c1543e2.P1()));
                    }
                }
                if (c1543e2.l1()) {
                    b0(sb, 1, "service_upload", Boolean.valueOf(c1543e2.E0()));
                }
                b0(sb, 1, "health_monitor", c1543e2.s0());
                if (c1543e2.k1()) {
                    b0(sb, 1, "retry_counter", Integer.valueOf(c1543e2.v2()));
                }
                if (c1543e2.Y0()) {
                    b0(sb, 1, "consent_signals", c1543e2.m0());
                }
                if (c1543e2.f1()) {
                    b0(sb, 1, "is_dma_region", Boolean.valueOf(c1543e2.C0()));
                }
                if (c1543e2.Z0()) {
                    b0(sb, 1, "core_platform_services", c1543e2.n0());
                }
                if (c1543e2.X0()) {
                    b0(sb, 1, "consent_diagnostics", c1543e2.l0());
                }
                if (c1543e2.o1()) {
                    b0(sb, 1, "target_os_version", Long.valueOf(c1543e2.D3()));
                }
                if (C1602k7.a() && d().E(c1543e2.P3(), F.A0)) {
                    b0(sb, 1, "ad_services_version", Integer.valueOf(c1543e2.n()));
                    if (c1543e2.I0() && (L3 = c1543e2.L3()) != null) {
                        X(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        b0(sb, 2, "eligible", Boolean.valueOf(L3.a0()));
                        b0(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(L3.e0()));
                        b0(sb, 2, "pre_r", Boolean.valueOf(L3.f0()));
                        b0(sb, 2, "r_extensions_too_old", Boolean.valueOf(L3.g0()));
                        b0(sb, 2, "adservices_extension_too_old", Boolean.valueOf(L3.X()));
                        b0(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(L3.T()));
                        b0(sb, 2, "measurement_manager_disabled", Boolean.valueOf(L3.d0()));
                        X(sb, 2);
                        sb.append("}\n");
                    }
                }
                if (M6.a() && d().t(F.N0) && c1543e2.G0()) {
                    b0(sb, 1, "ad_campaign_info", c1543e2.K3());
                }
                List<C1579i2> A0 = c1543e2.A0();
                if (A0 != null) {
                    for (C1579i2 c1579i2 : A0) {
                        if (c1579i2 != null) {
                            X(sb, 2);
                            sb.append("user_property {\n");
                            b0(sb, 2, "set_timestamp_millis", c1579i2.h0() ? Long.valueOf(c1579i2.Z()) : null);
                            b0(sb, 2, "name", g().g(c1579i2.c0()));
                            b0(sb, 2, "string_value", c1579i2.d0());
                            b0(sb, 2, "int_value", c1579i2.g0() ? Long.valueOf(c1579i2.X()) : null);
                            b0(sb, 2, "double_value", c1579i2.e0() ? Double.valueOf(c1579i2.I()) : null);
                            X(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<ax.b6.X1> y0 = c1543e2.y0();
                c1543e2.P3();
                if (y0 != null) {
                    for (ax.b6.X1 x1 : y0) {
                        if (x1 != null) {
                            X(sb, 2);
                            sb.append("audience_membership {\n");
                            if (x1.V()) {
                                b0(sb, 2, "audience_id", Integer.valueOf(x1.n()));
                            }
                            if (x1.X()) {
                                b0(sb, 2, "new_audience", Boolean.valueOf(x1.U()));
                            }
                            a0(sb, 2, "current_data", x1.S());
                            if (x1.Y()) {
                                a0(sb, 2, "previous_data", x1.T());
                            }
                            X(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<ax.b6.Z1> z0 = c1543e2.z0();
                if (z0 != null) {
                    for (ax.b6.Z1 z1 : z0) {
                        if (z1 != null) {
                            X(sb, 2);
                            sb.append("event {\n");
                            b0(sb, 2, "name", g().c(z1.e0()));
                            if (z1.i0()) {
                                b0(sb, 2, "timestamp_millis", Long.valueOf(z1.b0()));
                            }
                            if (z1.h0()) {
                                b0(sb, 2, "previous_timestamp_millis", Long.valueOf(z1.a0()));
                            }
                            if (z1.g0()) {
                                b0(sb, 2, "count", Integer.valueOf(z1.n()));
                            }
                            if (z1.V() != 0) {
                                c0(sb, 2, z1.f0());
                            }
                            X(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                X(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    final List<Long> P(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                k().L().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    k().L().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(Q((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        r5.add(Q((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r5.add(Q((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.Map<java.lang.String, java.lang.Object> Q(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r12 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = 0
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.Q(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = 0
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            int r7 = r7 + 1
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L5d
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.Q(r8, r6)
            r5.add(r8)
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.Q(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x5.Q(android.os.Bundle, boolean):java.util.Map");
    }

    final void U(C1516b2.a aVar, Object obj) {
        C0821p.l(obj);
        aVar.H().F().D().G();
        if (obj instanceof String) {
            aVar.E((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.y(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            aVar.x(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            k().G().b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                C1516b2.a c0 = C1516b2.c0();
                for (String str : bundle.keySet()) {
                    C1516b2.a C = C1516b2.c0().C(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        C.y(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        C.E((String) obj2);
                    } else if (obj2 instanceof Double) {
                        C.x(((Double) obj2).doubleValue());
                    }
                    c0.z(C);
                }
                if (c0.w() > 0) {
                    arrayList.add((C1516b2) ((AbstractC1599k4) c0.q()));
                }
            }
        }
        aVar.B(arrayList);
    }

    final void V(C1543e2.a aVar) {
        k().K().a("Checking account type status for ad personalization signals");
        if (j0(aVar.h1())) {
            k().F().a("Turning off ad personalization due to account type");
            C1579i2 c1579i2 = (C1579i2) ((AbstractC1599k4) C1579i2.a0().z("_npa").C(f().u()).y(1L).q());
            int i = 0;
            while (true) {
                if (i >= aVar.e0()) {
                    aVar.I(c1579i2);
                    break;
                } else {
                    if ("_npa".equals(aVar.P0(i).c0())) {
                        aVar.B(i, c1579i2);
                        break;
                    }
                    i++;
                }
            }
            C3670i a = C3670i.a(aVar.j1());
            a.d(C3667h3.a.AD_PERSONALIZATION, EnumC3684k.CHILD_ACCOUNT);
            aVar.t0(a.toString());
        }
    }

    final void W(C1579i2.a aVar, Object obj) {
        C0821p.l(obj);
        aVar.E().B().w();
        if (obj instanceof String) {
            aVar.D((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.y(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.x(((Double) obj).doubleValue());
        } else {
            k().G().b("Ignoring invalid (type) user attribute value", obj);
        }
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

    final boolean d0(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(b().a() - j) > j2;
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

    final byte[] i0(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            k().G().b("Failed to gzip content", e);
            throw e;
        }
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    final boolean j0(String str) {
        if (C1665s6.a() && d().t(F.P0)) {
            return false;
        }
        C0821p.l(str);
        Z1 H0 = q().H0(str);
        return H0 != null && f().y() && H0.z() && r().W(str);
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ V1 k() {
        return super.k();
    }

    final byte[] k0(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
        } catch (IOException e) {
            k().G().b("Failed to ungzip content", e);
            throw e;
        }
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ C3779z2 l() {
        return super.l();
    }

    final List<Integer> l0() {
        Map<String, String> e = F.e(this.b.a());
        if (e == null || e.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = F.Q.a(null).intValue();
        for (Map.Entry<String, String> entry : e.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt(entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            k().L().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e2) {
                    k().L().b("Experiment ID NumberFormatException", e2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
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

    final long z(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return A(str.getBytes(Charset.forName("UTF-8")));
    }
}
