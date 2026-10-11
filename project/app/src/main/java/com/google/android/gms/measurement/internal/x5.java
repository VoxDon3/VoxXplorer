/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ax.M5.p;
import ax.N5.b;
import ax.b6.B1;
import ax.b6.C1;
import ax.b6.D1;
import ax.b6.E1;
import ax.b6.F1;
import ax.b6.M6;
import ax.b6.T4;
import ax.b6.U1;
import ax.b6.W1;
import ax.b6.W3;
import ax.b6.X1;
import ax.b6.Y1;
import ax.b6.Z1;
import ax.b6.b2;
import ax.b6.d2;
import ax.b6.e;
import ax.b6.e2;
import ax.b6.g2;
import ax.b6.h2;
import ax.b6.i2;
import ax.b6.k4;
import ax.b6.k7;
import ax.b6.l7;
import ax.b6.r7;
import ax.b6.s4;
import ax.b6.s6;
import ax.f6.q;
import com.google.android.gms.measurement.internal.A;
import com.google.android.gms.measurement.internal.B5;
import com.google.android.gms.measurement.internal.C;
import com.google.android.gms.measurement.internal.D;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.M1;
import com.google.android.gms.measurement.internal.Z1;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.h3;
import com.google.android.gms.measurement.internal.h5;
import com.google.android.gms.measurement.internal.i;
import com.google.android.gms.measurement.internal.k;
import com.google.android.gms.measurement.internal.k5;
import com.google.android.gms.measurement.internal.l5;
import com.google.android.gms.measurement.internal.q5;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class x5
extends k5 {
    x5(q5 q52) {
        super(q52);
    }

    static Bundle B(List<b2> object) {
        Bundle bundle = new Bundle();
        object = object.iterator();
        while (object.hasNext()) {
            b2 b22 = (b2)object.next();
            String string = b22.f0();
            if (b22.i0()) {
                bundle.putDouble(string, b22.I());
                continue;
            }
            if (b22.j0()) {
                bundle.putFloat(string, b22.T());
                continue;
            }
            if (b22.m0()) {
                bundle.putString(string, b22.g0());
                continue;
            }
            if (!b22.k0()) continue;
            bundle.putLong(string, b22.a0());
        }
        return bundle;
    }

    private final Bundle C(Map<String, Object> map, boolean bl) {
        Bundle bundle = new Bundle();
        for (String string : map.keySet()) {
            Object object = map.get(string);
            if (object == null) {
                bundle.putString(string, null);
                continue;
            }
            if (object instanceof Long) {
                bundle.putLong(string, ((Long)object).longValue());
                continue;
            }
            if (object instanceof Double) {
                bundle.putDouble(string, ((Double)object).doubleValue());
                continue;
            }
            if (object instanceof ArrayList) {
                if (!bl) continue;
                ArrayList arrayList = (ArrayList)object;
                ArrayList<Bundle> arrayList2 = new ArrayList<Bundle>();
                int n8 = arrayList.size();
                for (int i8 = 0; i8 < n8; ++i8) {
                    object = arrayList.get(i8);
                    arrayList2.add(this.C((Map)object, false));
                }
                bundle.putParcelableArray(string, arrayList2.toArray(new Parcelable[0]));
                continue;
            }
            bundle.putString(string, object.toString());
        }
        return bundle;
    }

    static b2 F(ax.b6.Z1 object, String string) {
        for (b2 b22 : ((ax.b6.Z1)object).f0()) {
            if (!b22.f0().equals(string)) continue;
            return b22;
        }
        return null;
    }

    static <BuilderT extends T4> BuilderT G(BuilderT BuilderT, byte[] byArray) throws s4 {
        W3 w32 = W3.a();
        if (w32 != null) {
            return (BuilderT)BuilderT.F0(byArray, w32);
        }
        return (BuilderT)BuilderT.W(byArray);
    }

    static Object J(ax.b6.Z1 object, String string, Object object2) {
        if ((object = x5.g0((ax.b6.Z1)object, string)) == null) {
            return object2;
        }
        return object;
    }

    private static String N(boolean bl, boolean bl2, boolean bl3) {
        StringBuilder stringBuilder = new StringBuilder();
        if (bl) {
            stringBuilder.append("Dynamic ");
        }
        if (bl2) {
            stringBuilder.append("Sequence ");
        }
        if (bl3) {
            stringBuilder.append("Session-Scoped ");
        }
        return stringBuilder.toString();
    }

    static List<Long> O(BitSet bitSet) {
        int n8 = (bitSet.length() + 63) / 64;
        ArrayList<Long> arrayList = new ArrayList<Long>(n8);
        for (int i8 = 0; i8 < n8; ++i8) {
            int n9;
            long l8 = 0L;
            for (int i9 = 0; i9 < 64 && (n9 = (i8 << 6) + i9) < bitSet.length(); ++i9) {
                long l9 = l8;
                if (bitSet.get(n9)) {
                    l9 = l8 | 1L << i9;
                }
                l8 = l9;
            }
            arrayList.add(l8);
        }
        return arrayList;
    }

    private static void R(Uri.Builder builder, String string, String string2, Set<String> set) {
        if (!set.contains(string) && !TextUtils.isEmpty((CharSequence)string2)) {
            builder.appendQueryParameter(string, string2);
        }
    }

    private static void S(Uri.Builder builder, String[] stringArray, Bundle bundle, Set<String> set) {
        for (int i8 = 0; i8 < stringArray.length; ++i8) {
            Object object = stringArray[i8].split(",");
            String string = object[0];
            object = object[((String[])object).length - 1];
            if ((string = bundle.getString(string)) == null) continue;
            x5.R(builder, (String)object, string, set);
        }
    }

    static void T(Z1.a a8, String object, Object object2) {
        int n8;
        block8: {
            List<b2> list = a8.M();
            for (n8 = 0; n8 < list.size(); ++n8) {
                if (!((String)object).equals(list.get(n8).f0())) {
                    continue;
                }
                break block8;
            }
            n8 = -1;
        }
        object = b2.c0().C((String)object);
        if (object2 instanceof Long) {
            ((b2.a)object).y((Long)object2);
        } else if (object2 instanceof String) {
            ((b2.a)object).E((String)object2);
        } else if (object2 instanceof Double) {
            ((b2.a)object).x((Double)object2);
        }
        if (n8 >= 0) {
            a8.y(n8, (b2.a)object);
            return;
        }
        a8.C((b2.a)object);
    }

    private static void X(StringBuilder stringBuilder, int n8) {
        for (int i8 = 0; i8 < n8; ++i8) {
            stringBuilder.append("  ");
        }
    }

    private final void Y(StringBuilder stringBuilder, int n8, C1 c12) {
        if (c12 == null) {
            return;
        }
        x5.X(stringBuilder, n8);
        stringBuilder.append("filter {\n");
        if (c12.Q()) {
            x5.b0(stringBuilder, n8, "complement", c12.P());
        }
        if (c12.S()) {
            x5.b0(stringBuilder, n8, "param_name", ((f3)this).g().f(c12.O()));
        }
        if (c12.T()) {
            int n9 = n8 + 1;
            F1 object2 = c12.N();
            if (object2 != null) {
                x5.X(stringBuilder, n9);
                stringBuilder.append("string_filter");
                stringBuilder.append(" {\n");
                if (object2.Q()) {
                    x5.b0(stringBuilder, n9, "match_type", object2.I().name());
                }
                if (object2.P()) {
                    x5.b0(stringBuilder, n9, "expression", object2.L());
                }
                if (object2.O()) {
                    x5.b0(stringBuilder, n9, "case_sensitive", object2.N());
                }
                if (object2.n() > 0) {
                    x5.X(stringBuilder, n8 + 2);
                    stringBuilder.append("expression_list {\n");
                    for (String string : object2.M()) {
                        x5.X(stringBuilder, n8 + 3);
                        stringBuilder.append(string);
                        stringBuilder.append("\n");
                    }
                    stringBuilder.append("}\n");
                }
                x5.X(stringBuilder, n9);
                stringBuilder.append("}\n");
            }
        }
        if (c12.R()) {
            x5.Z(stringBuilder, n8 + 1, "number_filter", c12.M());
        }
        x5.X(stringBuilder, n8);
        stringBuilder.append("}\n");
    }

    private static void Z(StringBuilder stringBuilder, int n8, String string, D1 d12) {
        if (d12 == null) {
            return;
        }
        x5.X(stringBuilder, n8);
        stringBuilder.append(string);
        stringBuilder.append(" {\n");
        if (d12.P()) {
            x5.b0(stringBuilder, n8, "comparison_type", d12.I().name());
        }
        if (d12.R()) {
            x5.b0(stringBuilder, n8, "match_as_float", d12.O());
        }
        if (d12.Q()) {
            x5.b0(stringBuilder, n8, "comparison_value", d12.L());
        }
        if (d12.T()) {
            x5.b0(stringBuilder, n8, "min_comparison_value", d12.N());
        }
        if (d12.S()) {
            x5.b0(stringBuilder, n8, "max_comparison_value", d12.M());
        }
        x5.X(stringBuilder, n8);
        stringBuilder.append("}\n");
    }

    private static void a0(StringBuilder stringBuilder, int n8, String object, g2 object2) {
        Object object3;
        if (object2 == null) {
            return;
        }
        x5.X(stringBuilder, 3);
        stringBuilder.append((String)object);
        stringBuilder.append(" {\n");
        if (((g2)object2).L() != 0) {
            x5.X(stringBuilder, 4);
            stringBuilder.append("results: ");
            object3 = ((g2)object2).c0().iterator();
            n8 = 0;
            while (object3.hasNext()) {
                object = object3.next();
                if (n8 != 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(object);
                ++n8;
            }
            stringBuilder.append('\n');
        }
        if (((g2)object2).T() != 0) {
            x5.X(stringBuilder, 4);
            stringBuilder.append("status: ");
            object = ((g2)object2).e0().iterator();
            n8 = 0;
            while (object.hasNext()) {
                object3 = (Long)object.next();
                if (n8 != 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(object3);
                ++n8;
            }
            stringBuilder.append('\n');
        }
        if (((g2)object2).n() != 0) {
            x5.X(stringBuilder, 4);
            stringBuilder.append("dynamic_filter_timestamps: {");
            object3 = ((g2)object2).b0().iterator();
            n8 = 0;
            while (object3.hasNext()) {
                Y1 y12 = (Y1)object3.next();
                if (n8 != 0) {
                    stringBuilder.append(", ");
                }
                object = y12.Q() ? Integer.valueOf(y12.n()) : null;
                stringBuilder.append(object);
                stringBuilder.append(":");
                object = y12.P() ? Long.valueOf(y12.M()) : null;
                stringBuilder.append(object);
                ++n8;
            }
            stringBuilder.append("}\n");
        }
        if (((g2)object2).P() != 0) {
            x5.X(stringBuilder, 4);
            stringBuilder.append("sequence_filter_timestamps: {");
            object2 = ((g2)object2).d0().iterator();
            n8 = 0;
            while (object2.hasNext()) {
                object3 = (h2)object2.next();
                if (n8 != 0) {
                    stringBuilder.append(", ");
                }
                object = ((h2)object3).R() ? Integer.valueOf(((h2)object3).M()) : null;
                stringBuilder.append(object);
                stringBuilder.append(": [");
                object = ((h2)object3).Q().iterator();
                int n9 = 0;
                while (object.hasNext()) {
                    long l8 = object.next();
                    if (n9 != 0) {
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append(l8);
                    ++n9;
                }
                stringBuilder.append("]");
                ++n8;
            }
            stringBuilder.append("}\n");
        }
        x5.X(stringBuilder, 3);
        stringBuilder.append("}\n");
    }

    private static void b0(StringBuilder stringBuilder, int n8, String string, Object object) {
        if (object == null) {
            return;
        }
        x5.X(stringBuilder, n8 + 1);
        stringBuilder.append(string);
        stringBuilder.append(": ");
        stringBuilder.append(object);
        stringBuilder.append('\n');
    }

    private final void c0(StringBuilder stringBuilder, int n8, List<b2> object) {
        if (object != null) {
            ++n8;
            Iterator<b2> iterator = object.iterator();
            while (iterator.hasNext()) {
                b2 b22 = iterator.next();
                if (b22 == null) continue;
                x5.X(stringBuilder, n8);
                stringBuilder.append("param {\n");
                boolean bl = b22.l0();
                Object var5_6 = null;
                object = bl ? ((f3)this).g().f(b22.f0()) : null;
                x5.b0(stringBuilder, n8, "name", object);
                object = b22.m0() ? b22.g0() : null;
                x5.b0(stringBuilder, n8, "string_value", object);
                object = b22.k0() ? Long.valueOf(b22.a0()) : null;
                x5.b0(stringBuilder, n8, "int_value", object);
                object = var5_6;
                if (b22.i0()) {
                    object = b22.I();
                }
                x5.b0(stringBuilder, n8, "double_value", object);
                if (b22.Y() > 0) {
                    this.c0(stringBuilder, n8, b22.h0());
                }
                x5.X(stringBuilder, n8);
                stringBuilder.append("}\n");
            }
        }
    }

    static boolean e0(D d8, E5 e52) {
        p.l(d8);
        p.l(e52);
        return !TextUtils.isEmpty((CharSequence)e52.c0) || !TextUtils.isEmpty((CharSequence)e52.r0);
    }

    static boolean f0(List<Long> list, int n8) {
        return n8 < list.size() << 6 && (1L << n8 % 64 & list.get(n8 / 64)) != 0L;
    }

    static Object g0(ax.b6.Z1 object, String object2) {
        if ((object = x5.F((ax.b6.Z1)object, (String)object2)) != null) {
            if (((b2)object).m0()) {
                return ((b2)object).g0();
            }
            if (((b2)object).k0()) {
                return ((b2)object).a0();
            }
            if (((b2)object).i0()) {
                return ((b2)object).I();
            }
            if (((b2)object).Y() > 0) {
                object2 = ((b2)object).h0();
                object = new ArrayList();
                Iterator iterator = object2.iterator();
                while (iterator.hasNext()) {
                    b2 b22 = (b2)iterator.next();
                    if (b22 == null) continue;
                    object2 = new Bundle();
                    for (b2 b23 : b22.h0()) {
                        if (b23.m0()) {
                            object2.putString(b23.f0(), b23.g0());
                            continue;
                        }
                        if (b23.k0()) {
                            object2.putLong(b23.f0(), b23.a0());
                            continue;
                        }
                        if (!b23.i0()) continue;
                        object2.putDouble(b23.f0(), b23.I());
                    }
                    if (object2.isEmpty()) continue;
                    object.add(object2);
                }
                return object.toArray(new Bundle[object.size()]);
            }
        }
        return null;
    }

    static boolean h0(String string) {
        return string != null && string.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && string.length() <= 310;
    }

    static int y(e2.a a8, String string) {
        if (a8 == null) {
            return -1;
        }
        for (int i8 = 0; i8 < a8.e0(); ++i8) {
            if (!string.equals(a8.P0(i8).c0())) continue;
            return i8;
        }
        return -1;
    }

    final long A(byte[] byArray) {
        p.l(byArray);
        ((f3)((f3)this).i()).n();
        MessageDigest messageDigest = B5.V0();
        if (messageDigest == null) {
            ((f3)this).k().G().a("Failed to get MD5");
            return 0L;
        }
        return B5.B(messageDigest.digest(byArray));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final <T extends Parcelable> T D(byte[] object, Parcelable.Creator<T> creator) {
        Throwable throwable2222222;
        Parcel parcel;
        block5: {
            if (object == null) {
                return null;
            }
            parcel = Parcel.obtain();
            parcel.unmarshall(object, 0, ((byte[])object).length);
            parcel.setDataPosition(0);
            object = (Parcelable)creator.createFromParcel(parcel);
            {
                catch (Throwable throwable2222222) {
                    break block5;
                }
                catch (b.a a8) {}
                {
                    ((f3)this).k().G().a("Failed to load parcelable from buffer");
                }
                parcel.recycle();
                return null;
            }
            parcel.recycle();
            return (T)object;
        }
        parcel.recycle();
        throw throwable2222222;
    }

    final ax.b6.Z1 E(A a8) {
        Z1.a a9 = ax.b6.Z1.c0().B(a8.e);
        for (Object object : a8.f) {
            b2.a a10 = b2.c0().C((String)object);
            object = a8.f.D((String)object);
            p.l(object);
            this.U(a10, object);
            a9.C(a10);
        }
        return (ax.b6.Z1)((k4)a9.q());
    }

    final D H(e e8) {
        String string;
        Object object;
        Bundle bundle = this.C(e8.g(), true);
        object = bundle.containsKey("_o") && (object = bundle.get("_o")) != null ? object.toString() : "app";
        String string2 = string = q.b(e8.e());
        if (string == null) {
            string2 = e8.e();
        }
        return new D(string2, new C(bundle), (String)object, e8.a());
    }

    @TargetApi(value=30)
    final h5 I(String object, e2.a a8, Z1.a a9, String object2) {
        if (k7.a() && ((f3)this).d().E((String)object, F.A0)) {
            Object object3;
            Object object42;
            long l8 = ((f3)this).b().a();
            Object object5 = ((f3)this).d().C((String)object, F.f0).split(",");
            Set<String> set = new HashSet(((String[])object5).length);
            for (Object object42 : object5) {
                j.Objects.requireNonNull((Object)object42);
                if (((HashSet)set).add((String)object42)) {
                    continue;
                }
                object = new StringBuilder("duplicate element: ");
                ((StringBuilder)object).append(object42);
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            set = java.util.DesugarCollections.unmodifiableSet(set);
            f3 f32 = ((l5)this).t();
            object5 = ((l5)f32).r().R((String)object);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(f32.d().C((String)object, F.Y));
            if (!TextUtils.isEmpty((CharSequence)object5)) {
                object3 = f32.d().C((String)object, F.Z);
                object42 = new StringBuilder();
                ((StringBuilder)object42).append((String)object5);
                ((StringBuilder)object42).append(".");
                ((StringBuilder)object42).append((String)object3);
                builder.authority(((StringBuilder)object42).toString());
            } else {
                builder.authority(f32.d().C((String)object, F.Z));
            }
            builder.path(f32.d().C((String)object, F.a0));
            x5.R(builder, "gmp_app_id", a8.l1(), set);
            x5.R(builder, "gmp_version", "97001", set);
            object5 = a8.i1();
            f32 = ((f3)this).d();
            object3 = F.D0;
            object42 = object5;
            if (((h)f32).E((String)object, (M1<Boolean>)object3)) {
                object42 = object5;
                if (((l5)this).r().b0((String)object)) {
                    object42 = "";
                }
            }
            x5.R(builder, "app_instance_id", (String)object42, set);
            x5.R(builder, "rdid", a8.n1(), set);
            x5.R(builder, "bundle_id", a8.h1(), set);
            object42 = a9.L();
            object5 = q.a((String)object42);
            if (!TextUtils.isEmpty((CharSequence)object5)) {
                object42 = object5;
            }
            x5.R(builder, "app_event_name", (String)object42, set);
            x5.R(builder, "app_version", String.valueOf(a8.R()), set);
            object42 = object5 = a8.m1();
            if (((f3)this).d().E((String)object, (M1<Boolean>)object3)) {
                object42 = object5;
                if (((l5)this).r().f0((String)object)) {
                    object42 = object5;
                    if (!TextUtils.isEmpty((CharSequence)object5)) {
                        int n8 = ((String)object5).indexOf(".");
                        object42 = object5;
                        if (n8 != -1) {
                            object42 = ((String)object5).substring(0, n8);
                        }
                    }
                }
            }
            x5.R(builder, "os_version", (String)object42, set);
            x5.R(builder, "timestamp", String.valueOf(a9.J()), set);
            boolean bl = a8.P();
            object42 = "1";
            if (bl) {
                x5.R(builder, "lat", "1", set);
            }
            x5.R(builder, "privacy_sandbox_version", String.valueOf(a8.w()), set);
            x5.R(builder, "trigger_uri_source", "1", set);
            x5.R(builder, "trigger_uri_timestamp", String.valueOf(l8), set);
            x5.R(builder, "request_uuid", (String)object2, set);
            object2 = a9.M();
            a9 = new Bundle();
            object5 = object2.iterator();
            while (object5.hasNext()) {
                object3 = (b2)object5.next();
                object2 = ((b2)object3).f0();
                if (((b2)object3).i0()) {
                    a9.putString((String)object2, String.valueOf(((b2)object3).I()));
                    continue;
                }
                if (((b2)object3).j0()) {
                    a9.putString((String)object2, String.valueOf(((b2)object3).T()));
                    continue;
                }
                if (((b2)object3).m0()) {
                    a9.putString((String)object2, ((b2)object3).g0());
                    continue;
                }
                if (!((b2)object3).k0()) continue;
                a9.putString((String)object2, String.valueOf(((b2)object3).a0()));
            }
            x5.S(builder, ((f3)this).d().C((String)object, F.e0).split("\\|"), (Bundle)a9, set);
            object2 = a8.N();
            a9 = new Bundle();
            object2 = object2.iterator();
            while (object2.hasNext()) {
                object3 = (i2)object2.next();
                object5 = ((i2)object3).c0();
                if (((i2)object3).e0()) {
                    a9.putString((String)object5, String.valueOf(((i2)object3).I()));
                    continue;
                }
                if (((i2)object3).f0()) {
                    a9.putString((String)object5, String.valueOf(((i2)object3).Q()));
                    continue;
                }
                if (((i2)object3).i0()) {
                    a9.putString((String)object5, ((i2)object3).d0());
                    continue;
                }
                if (!((i2)object3).g0()) continue;
                a9.putString((String)object5, String.valueOf(((i2)object3).X()));
            }
            x5.S(builder, ((f3)this).d().C((String)object, F.d0).split("\\|"), (Bundle)a9, set);
            object = a8.O() ? object42 : "0";
            x5.R(builder, "dma", (String)object, set);
            if (!a8.k1().isEmpty()) {
                x5.R(builder, "dma_cps", a8.k1(), set);
            }
            if (((f3)this).d().t(F.F0) && a8.Q()) {
                object = a8.v0();
                if (!((U1)object).m0().isEmpty()) {
                    x5.R(builder, "dl_gclid", ((U1)object).m0(), set);
                }
                if (!((U1)object).l0().isEmpty()) {
                    x5.R(builder, "dl_gbraid", ((U1)object).l0(), set);
                }
                if (!((U1)object).h0().isEmpty()) {
                    x5.R(builder, "dl_gs", ((U1)object).h0(), set);
                }
                if (((U1)object).I() > 0L) {
                    x5.R(builder, "dl_ss_ts", String.valueOf(((U1)object).I()), set);
                }
                if (!((U1)object).p0().isEmpty()) {
                    x5.R(builder, "mr_gclid", ((U1)object).p0(), set);
                }
                if (!((U1)object).o0().isEmpty()) {
                    x5.R(builder, "mr_gbraid", ((U1)object).o0(), set);
                }
                if (!((U1)object).n0().isEmpty()) {
                    x5.R(builder, "mr_gs", ((U1)object).n0(), set);
                }
                if (((U1)object).O() > 0L) {
                    x5.R(builder, "mr_click_ts", String.valueOf(((U1)object).O()), set);
                }
            }
            return new h5(builder.build().toString(), l8, 1);
        }
        return null;
    }

    final String K(B1 object) {
        if (object == null) {
            return "null";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nevent_filter {\n");
        if (((B1)object).Y()) {
            x5.b0(stringBuilder, 0, "filter_id", ((B1)object).N());
        }
        x5.b0(stringBuilder, 0, "event_name", ((f3)this).g().c(((B1)object).R()));
        String string = x5.N(((B1)object).T(), ((B1)object).U(), ((B1)object).V());
        if (!string.isEmpty()) {
            x5.b0(stringBuilder, 0, "filter_type", string);
        }
        if (((B1)object).X()) {
            x5.Z(stringBuilder, 1, "event_count_filter", ((B1)object).Q());
        }
        if (((B1)object).n() > 0) {
            stringBuilder.append("  filters {\n");
            object = ((B1)object).S().iterator();
            while (object.hasNext()) {
                this.Y(stringBuilder, 2, (C1)object.next());
            }
        }
        x5.X(stringBuilder, 1);
        stringBuilder.append("}\n}\n");
        return stringBuilder.toString();
    }

    final String L(E1 e12) {
        if (e12 == null) {
            return "null";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nproperty_filter {\n");
        if (e12.R()) {
            x5.b0(stringBuilder, 0, "filter_id", e12.n());
        }
        x5.b0(stringBuilder, 0, "property_name", ((f3)this).g().g(e12.N()));
        String string = x5.N(e12.O(), e12.P(), e12.Q());
        if (!string.isEmpty()) {
            x5.b0(stringBuilder, 0, "filter_type", string);
        }
        this.Y(stringBuilder, 1, e12.K());
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }

    final String M(d2 object) {
        if (object == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nbatch {\n");
        if (r7.a() && ((f3)this).d().t(F.t0) && ((d2)object).n() > 0) {
            ((f3)this).i();
            if (B5.H0(((d2)object).I(0).P3()) && ((d2)object).R()) {
                x5.b0(stringBuilder, 0, "UploadSubdomain", ((d2)object).P());
            }
        }
        for (e2 e22 : ((d2)object).Q()) {
            k4 k42;
            if (e22 == null) continue;
            x5.X(stringBuilder, 1);
            stringBuilder.append("bundle {\n");
            if (e22.j1()) {
                x5.b0(stringBuilder, 1, "protocol_version", e22.n2());
            }
            if (l7.a() && ((f3)this).d().E(e22.P3(), F.s0) && e22.m1()) {
                x5.b0(stringBuilder, 1, "session_stitching_token", e22.w0());
            }
            x5.b0(stringBuilder, 1, "platform", e22.u0());
            if (e22.e1()) {
                x5.b0(stringBuilder, 1, "gmp_version", e22.r3());
            }
            if (e22.r1()) {
                x5.b0(stringBuilder, 1, "uploading_gmp_version", e22.J3());
            }
            if (e22.c1()) {
                x5.b0(stringBuilder, 1, "dynamite_version", e22.h3());
            }
            if (e22.W0()) {
                x5.b0(stringBuilder, 1, "config_version", e22.T2());
            }
            x5.b0(stringBuilder, 1, "gmp_app_id", e22.r0());
            x5.b0(stringBuilder, 1, "admob_app_id", e22.O3());
            x5.b0(stringBuilder, 1, "app_id", e22.P3());
            x5.b0(stringBuilder, 1, "app_version", e22.k0());
            if (e22.H0()) {
                x5.b0(stringBuilder, 1, "app_version_major", e22.J0());
            }
            x5.b0(stringBuilder, 1, "firebase_instance_id", e22.q0());
            if (e22.b1()) {
                x5.b0(stringBuilder, 1, "dev_cert_hash", e22.a3());
            }
            x5.b0(stringBuilder, 1, "app_store", e22.j0());
            if (e22.q1()) {
                x5.b0(stringBuilder, 1, "upload_timestamp_millis", e22.G3());
            }
            if (e22.n1()) {
                x5.b0(stringBuilder, 1, "start_timestamp_millis", e22.A3());
            }
            if (e22.d1()) {
                x5.b0(stringBuilder, 1, "end_timestamp_millis", e22.o3());
            }
            if (e22.i1()) {
                x5.b0(stringBuilder, 1, "previous_bundle_start_timestamp_millis", e22.x3());
            }
            if (e22.h1()) {
                x5.b0(stringBuilder, 1, "previous_bundle_end_timestamp_millis", e22.u3());
            }
            x5.b0(stringBuilder, 1, "app_instance_id", e22.i0());
            x5.b0(stringBuilder, 1, "resettable_device_id", e22.v0());
            x5.b0(stringBuilder, 1, "ds_id", e22.p0());
            if (e22.g1()) {
                x5.b0(stringBuilder, 1, "limited_ad_tracking", e22.D0());
            }
            x5.b0(stringBuilder, 1, "os_version", e22.t0());
            x5.b0(stringBuilder, 1, "device_model", e22.o0());
            x5.b0(stringBuilder, 1, "user_default_language", e22.x0());
            if (e22.p1()) {
                x5.b0(stringBuilder, 1, "time_zone_offset_minutes", e22.D2());
            }
            if (e22.V0()) {
                x5.b0(stringBuilder, 1, "bundle_sequential_index", e22.s1());
            }
            if (r7.a()) {
                ((f3)this).i();
                if (B5.H0(e22.P3()) && ((f3)this).d().t(F.t0) && e22.a1()) {
                    x5.b0(stringBuilder, 1, "delivery_index", e22.P1());
                }
            }
            if (e22.l1()) {
                x5.b0(stringBuilder, 1, "service_upload", e22.E0());
            }
            x5.b0(stringBuilder, 1, "health_monitor", e22.s0());
            if (e22.k1()) {
                x5.b0(stringBuilder, 1, "retry_counter", e22.v2());
            }
            if (e22.Y0()) {
                x5.b0(stringBuilder, 1, "consent_signals", e22.m0());
            }
            if (e22.f1()) {
                x5.b0(stringBuilder, 1, "is_dma_region", e22.C0());
            }
            if (e22.Z0()) {
                x5.b0(stringBuilder, 1, "core_platform_services", e22.n0());
            }
            if (e22.X0()) {
                x5.b0(stringBuilder, 1, "consent_diagnostics", e22.l0());
            }
            if (e22.o1()) {
                x5.b0(stringBuilder, 1, "target_os_version", e22.D3());
            }
            if (k7.a() && ((f3)this).d().E(e22.P3(), F.A0)) {
                x5.b0(stringBuilder, 1, "ad_services_version", e22.n());
                if (e22.I0() && (object = e22.L3()) != null) {
                    x5.X(stringBuilder, 2);
                    stringBuilder.append("attribution_eligibility_status {\n");
                    x5.b0(stringBuilder, 2, "eligible", ((W1)object).a0());
                    x5.b0(stringBuilder, 2, "no_access_adservices_attribution_permission", ((W1)object).e0());
                    x5.b0(stringBuilder, 2, "pre_r", ((W1)object).f0());
                    x5.b0(stringBuilder, 2, "r_extensions_too_old", ((W1)object).g0());
                    x5.b0(stringBuilder, 2, "adservices_extension_too_old", ((W1)object).X());
                    x5.b0(stringBuilder, 2, "ad_storage_not_allowed", ((W1)object).T());
                    x5.b0(stringBuilder, 2, "measurement_manager_disabled", ((W1)object).d0());
                    x5.X(stringBuilder, 2);
                    stringBuilder.append("}\n");
                }
            }
            if (M6.a() && ((f3)this).d().t(F.N0) && e22.G0()) {
                x5.b0(stringBuilder, 1, "ad_campaign_info", e22.K3());
            }
            if ((object = e22.A0()) != null) {
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    i2 i22 = (i2)iterator.next();
                    if (i22 == null) continue;
                    x5.X(stringBuilder, 2);
                    stringBuilder.append("user_property {\n");
                    boolean bl = i22.h0();
                    k42 = null;
                    object = bl ? Long.valueOf(i22.Z()) : null;
                    x5.b0(stringBuilder, 2, "set_timestamp_millis", object);
                    x5.b0(stringBuilder, 2, "name", ((f3)this).g().g(i22.c0()));
                    x5.b0(stringBuilder, 2, "string_value", i22.d0());
                    object = i22.g0() ? Long.valueOf(i22.X()) : null;
                    x5.b0(stringBuilder, 2, "int_value", object);
                    object = k42;
                    if (i22.e0()) {
                        object = i22.I();
                    }
                    x5.b0(stringBuilder, 2, "double_value", object);
                    x5.X(stringBuilder, 2);
                    stringBuilder.append("}\n");
                }
            }
            object = e22.y0();
            e22.P3();
            if (object != null) {
                object = object.iterator();
                while (object.hasNext()) {
                    k42 = (X1)object.next();
                    if (k42 == null) continue;
                    x5.X(stringBuilder, 2);
                    stringBuilder.append("audience_membership {\n");
                    if (((X1)k42).V()) {
                        x5.b0(stringBuilder, 2, "audience_id", ((X1)k42).n());
                    }
                    if (((X1)k42).X()) {
                        x5.b0(stringBuilder, 2, "new_audience", ((X1)k42).U());
                    }
                    x5.a0(stringBuilder, 2, "current_data", ((X1)k42).S());
                    if (((X1)k42).Y()) {
                        x5.a0(stringBuilder, 2, "previous_data", ((X1)k42).T());
                    }
                    x5.X(stringBuilder, 2);
                    stringBuilder.append("}\n");
                }
            }
            if ((object = e22.z0()) != null) {
                object = object.iterator();
                while (object.hasNext()) {
                    k42 = (ax.b6.Z1)object.next();
                    if (k42 == null) continue;
                    x5.X(stringBuilder, 2);
                    stringBuilder.append("event {\n");
                    x5.b0(stringBuilder, 2, "name", ((f3)this).g().c(((ax.b6.Z1)k42).e0()));
                    if (((ax.b6.Z1)k42).i0()) {
                        x5.b0(stringBuilder, 2, "timestamp_millis", ((ax.b6.Z1)k42).b0());
                    }
                    if (((ax.b6.Z1)k42).h0()) {
                        x5.b0(stringBuilder, 2, "previous_timestamp_millis", ((ax.b6.Z1)k42).a0());
                    }
                    if (((ax.b6.Z1)k42).g0()) {
                        x5.b0(stringBuilder, 2, "count", ((ax.b6.Z1)k42).n());
                    }
                    if (((ax.b6.Z1)k42).V() != 0) {
                        this.c0(stringBuilder, 2, ((ax.b6.Z1)k42).f0());
                    }
                    x5.X(stringBuilder, 2);
                    stringBuilder.append("}\n");
                }
            }
            x5.X(stringBuilder, 1);
            stringBuilder.append("}\n");
        }
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }

    final List<Long> P(List<Long> list, List<Integer> object) {
        int n8;
        list = new ArrayList<Long>(list);
        object = object.iterator();
        while (object.hasNext()) {
            Integer n9 = (Integer)object.next();
            if (n9 < 0) {
                ((f3)this).k().L().b("Ignoring negative bit index to be cleared", n9);
                continue;
            }
            n8 = n9 / 64;
            if (n8 >= ((ArrayList)list).size()) {
                ((f3)this).k().L().c("Ignoring bit index greater than bitSet size", n9, ((ArrayList)list).size());
                continue;
            }
            ((ArrayList)list).set(n8, (Long)((ArrayList)list).get(n8) & (1L << n9 % 64 ^ 0xFFFFFFFFFFFFFFFFL));
        }
        int n10 = ((ArrayList)list).size();
        n8 = ((ArrayList)list).size() - 1;
        while (n8 >= 0 && (Long)((ArrayList)list).get(n8) == 0L) {
            int n11 = n8 - 1;
            n10 = n8;
            n8 = n11;
        }
        return ((ArrayList)list).subList(0, n10);
    }

    final Map<String, Object> Q(Bundle bundle, boolean bl) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        for (String string : bundle.keySet()) {
            Object object = bundle.get(string);
            boolean bl2 = object instanceof Parcelable[];
            if (!(bl2 || object instanceof ArrayList || object instanceof Bundle)) {
                if (object == null) continue;
                hashMap.put(string, object);
                continue;
            }
            if (!bl) continue;
            ArrayList<Map<String, Object>> arrayList = new ArrayList<Map<String, Object>>();
            if (bl2) {
                for (Parcelable parcelable : (Parcelable[])object) {
                    if (!(parcelable instanceof Bundle)) continue;
                    arrayList.add(this.Q((Bundle)parcelable, false));
                }
            } else if (object instanceof ArrayList) {
                object = (ArrayList)object;
                int n8 = ((ArrayList)object).size();
                int n9 = 0;
                while (n9 < n8) {
                    int n10;
                    Object e8 = ((ArrayList)object).get(n9);
                    n9 = n10 = n9 + 1;
                    if (!(e8 instanceof Bundle)) continue;
                    arrayList.add(this.Q((Bundle)e8, false));
                    n9 = n10;
                }
            } else if (object instanceof Bundle) {
                arrayList.add(this.Q((Bundle)object, false));
            }
            hashMap.put(string, arrayList);
        }
        return hashMap;
    }

    final void U(b2.a a8, Object arrayList) {
        p.l(arrayList);
        a8.H().F().D().G();
        if (arrayList instanceof String) {
            a8.E((String)((Object)arrayList));
            return;
        }
        if (arrayList instanceof Long) {
            a8.y((Long)((Object)arrayList));
            return;
        }
        if (arrayList instanceof Double) {
            a8.x((Double)((Object)arrayList));
            return;
        }
        if (arrayList instanceof Bundle[]) {
            Bundle[] bundleArray = (Bundle[])arrayList;
            arrayList = new ArrayList<b2>();
            for (Bundle bundle : bundleArray) {
                if (bundle == null) continue;
                b2.a a9 = b2.c0();
                for (Object object : bundle.keySet()) {
                    b2.a a10 = b2.c0().C((String)object);
                    if ((object = bundle.get((String)object)) instanceof Long) {
                        a10.y((Long)object);
                    } else if (object instanceof String) {
                        a10.E((String)object);
                    } else {
                        if (!(object instanceof Double)) continue;
                        a10.x((Double)object);
                    }
                    a9.z(a10);
                }
                if (a9.w() <= 0) continue;
                arrayList.add((b2)((k4)a9.q()));
            }
            a8.B(arrayList);
            return;
        }
        ((f3)this).k().G().b("Ignoring invalid (type) event param value", arrayList);
    }

    final void V(e2.a a8) {
        ((f3)this).k().K().a("Checking account type status for ad personalization signals");
        if (this.j0(a8.h1())) {
            Object object;
            block2: {
                ((f3)this).k().F().a("Turning off ad personalization due to account type");
                object = (i2)((k4)i2.a0().z("_npa").C(((f3)this).f().u()).y(1L).q());
                for (int i8 = 0; i8 < a8.e0(); ++i8) {
                    if (!"_npa".equals(a8.P0(i8).c0())) continue;
                    a8.B(i8, (i2)object);
                    break block2;
                }
                a8.I((i2)object);
            }
            object = i.a(a8.j1());
            ((i)object).d(h3.a.f0, k.i0);
            a8.t0(((i)object).toString());
        }
    }

    final void W(i2.a a8, Object object) {
        p.l(object);
        a8.E().B().w();
        if (object instanceof String) {
            a8.D((String)object);
            return;
        }
        if (object instanceof Long) {
            a8.y((Long)object);
            return;
        }
        if (object instanceof Double) {
            a8.x((Double)object);
            return;
        }
        ((f3)this).k().G().b("Ignoring invalid (type) user attribute value", object);
    }

    final boolean d0(long l8, long l9) {
        return l8 == 0L || l9 <= 0L || Math.abs(((f3)this).b().a() - l8) > l9;
        {
        }
    }

    final byte[] i0(byte[] byArray) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            ((OutputStream)gZIPOutputStream).write(byArray);
            ((OutputStream)gZIPOutputStream).close();
            byteArrayOutputStream.close();
            byArray = byteArrayOutputStream.toByteArray();
            return byArray;
        }
        catch (IOException iOException) {
            ((f3)this).k().G().b("Failed to gzip content", iOException);
            throw iOException;
        }
    }

    final boolean j0(String string) {
        if (s6.a() && ((f3)this).d().t(F.P0)) {
            return false;
        }
        p.l(string);
        Z1 z12 = ((l5)this).q().H0(string);
        if (z12 == null) {
            return false;
        }
        return ((f3)this).f().y() && z12.z() && ((l5)this).r().W(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final byte[] k0(byte[] byArray) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byArray = new byte[1024];
            while (true) {
                int n8;
                if ((n8 = ((InputStream)gZIPInputStream).read(byArray)) <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(byArray, 0, n8);
            }
        }
        catch (IOException iOException) {}
        ((f3)this).k().G().b("Failed to ungzip content", iOException);
        throw iOException;
    }

    final List<Integer> l0() {
        Map<String, String> map = F.e(this.b.a());
        if (map != null && !map.isEmpty()) {
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            int n8 = F.Q.a(null);
            for (Map.Entry numberFormatException : map.entrySet()) {
                int n9;
                if (!((String)numberFormatException.getKey()).startsWith("measurement.id.")) continue;
                try {
                    n9 = Integer.parseInt((String)numberFormatException.getValue());
                    if (n9 == 0) continue;
                }
                catch (NumberFormatException numberFormatException2) {
                    ((f3)this).k().L().b("Experiment ID NumberFormatException", numberFormatException2);
                    continue;
                }
                arrayList.add(n9);
                if (arrayList.size() < n8) continue;
                ((f3)this).k().L().b("Too many experiment IDs. Number of IDs", arrayList.size());
                break;
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
        return null;
    }

    @Override
    protected final boolean x() {
        return false;
    }

    final long z(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return 0L;
        }
        return this.A(string.getBytes(Charset.forName("UTF-8")));
    }
}

