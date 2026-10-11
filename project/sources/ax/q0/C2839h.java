package ax.q0;

import ax.Gb.l;
import ax.n0.C2567a;
import ax.n0.k;
import ax.p0.C2753d;
import ax.p0.C2755f;
import ax.p0.C2756g;
import ax.p0.C2757h;
import ax.q0.AbstractC2835d;
import ax.sb.C3080l;
import ax.sb.t;
import ax.tb.C3139o;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: ax.q0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2839h implements k<AbstractC2835d> {
    public static final C2839h a = new C2839h();
    private static final String b = "preferences_pb";

    /* renamed from: ax.q0.h$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C2757h.b.values().length];
            iArr[C2757h.b.BOOLEAN.ordinal()] = 1;
            iArr[C2757h.b.FLOAT.ordinal()] = 2;
            iArr[C2757h.b.DOUBLE.ordinal()] = 3;
            iArr[C2757h.b.INTEGER.ordinal()] = 4;
            iArr[C2757h.b.LONG.ordinal()] = 5;
            iArr[C2757h.b.STRING.ordinal()] = 6;
            iArr[C2757h.b.STRING_SET.ordinal()] = 7;
            iArr[C2757h.b.VALUE_NOT_SET.ordinal()] = 8;
            a = iArr;
        }
    }

    private C2839h() {
    }

    private final void d(String str, C2757h c2757h, C2832a c2832a) {
        C2757h.b Z = c2757h.Z();
        switch (Z == null ? -1 : a.a[Z.ordinal()]) {
            case SubsamplingScaleImageView.ORIENTATION_USE_EXIF /* -1 */:
                throw new C2567a("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new C3080l();
            case 1:
                c2832a.i(C2837f.a(str), Boolean.valueOf(c2757h.R()));
                return;
            case 2:
                c2832a.i(C2837f.c(str), Float.valueOf(c2757h.U()));
                return;
            case 3:
                c2832a.i(C2837f.b(str), Double.valueOf(c2757h.T()));
                return;
            case 4:
                c2832a.i(C2837f.d(str), Integer.valueOf(c2757h.V()));
                return;
            case 5:
                c2832a.i(C2837f.e(str), Long.valueOf(c2757h.W()));
                return;
            case 6:
                AbstractC2835d.a<String> f = C2837f.f(str);
                String X = c2757h.X();
                l.e(X, "value.string");
                c2832a.i(f, X);
                return;
            case 7:
                AbstractC2835d.a<Set<String>> g = C2837f.g(str);
                List<String> O = c2757h.Y().O();
                l.e(O, "value.stringSet.stringsList");
                c2832a.i(g, C3139o.Y(O));
                return;
            case 8:
                throw new C2567a("Value not set.", null, 2, null);
        }
    }

    private final C2757h g(Object obj) {
        if (obj instanceof Boolean) {
            C2757h g = C2757h.a0().C(((Boolean) obj).booleanValue()).g();
            l.e(g, "newBuilder().setBoolean(value).build()");
            return g;
        }
        if (obj instanceof Float) {
            C2757h g2 = C2757h.a0().E(((Number) obj).floatValue()).g();
            l.e(g2, "newBuilder().setFloat(value).build()");
            return g2;
        }
        if (obj instanceof Double) {
            C2757h g3 = C2757h.a0().D(((Number) obj).doubleValue()).g();
            l.e(g3, "newBuilder().setDouble(value).build()");
            return g3;
        }
        if (obj instanceof Integer) {
            C2757h g4 = C2757h.a0().F(((Number) obj).intValue()).g();
            l.e(g4, "newBuilder().setInteger(value).build()");
            return g4;
        }
        if (obj instanceof Long) {
            C2757h g5 = C2757h.a0().G(((Number) obj).longValue()).g();
            l.e(g5, "newBuilder().setLong(value).build()");
            return g5;
        }
        if (obj instanceof String) {
            C2757h g6 = C2757h.a0().H((String) obj).g();
            l.e(g6, "newBuilder().setString(value).build()");
            return g6;
        }
        if (!(obj instanceof Set)) {
            throw new IllegalStateException(l.m("PreferencesSerializer does not support type: ", obj.getClass().getName()));
        }
        C2757h g7 = C2757h.a0().I(C2756g.P().C((Set) obj)).g();
        l.e(g7, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
        return g7;
    }

    @Override // ax.n0.k
    public Object c(InputStream inputStream, ax.wb.e<? super AbstractC2835d> eVar) throws IOException, C2567a {
        C2755f a2 = C2753d.a.a(inputStream);
        C2832a b2 = C2836e.b(new AbstractC2835d.b[0]);
        Map<String, C2757h> M = a2.M();
        l.e(M, "preferencesProto.preferencesMap");
        for (Map.Entry<String, C2757h> entry : M.entrySet()) {
            String key = entry.getKey();
            C2757h value = entry.getValue();
            C2839h c2839h = a;
            l.e(key, "name");
            l.e(value, "value");
            c2839h.d(key, value, b2);
        }
        return b2.d();
    }

    @Override // ax.n0.k
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC2835d b() {
        return C2836e.a();
    }

    public final String f() {
        return b;
    }

    @Override // ax.n0.k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object a(AbstractC2835d abstractC2835d, OutputStream outputStream, ax.wb.e<? super t> eVar) throws IOException, C2567a {
        Map<AbstractC2835d.a<?>, Object> a2 = abstractC2835d.a();
        C2755f.a P = C2755f.P();
        for (Map.Entry<AbstractC2835d.a<?>, Object> entry : a2.entrySet()) {
            P.C(entry.getKey().a(), g(entry.getValue()));
        }
        P.g().p(outputStream);
        return t.a;
    }
}
