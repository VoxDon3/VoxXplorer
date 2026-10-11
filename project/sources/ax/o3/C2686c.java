package ax.o3;

import android.net.Uri;
import android.text.TextUtils;
import ax.Ya.a;
import ax.b3.C1495j;
import ax.c3.d0;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* renamed from: ax.o3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2686c extends ax.Ya.a {
    private static final Logger n = ax.Q2.g.a(C2686c.class);
    private final boolean l;
    private com.voxdon.xplorer.service.b m;

    /* renamed from: ax.o3.c$a */
    class a extends a.g {
        a() {
        }

        @Override // ax.Ya.a.g, ax.Ya.a.b
        public void a(a.c cVar) {
            super.a(cVar);
            C2686c.this.m.m(d().size());
        }

        @Override // ax.Ya.a.g, ax.Ya.a.b
        public void c(a.c cVar) {
            super.c(cVar);
            C2686c.this.m.m(d().size());
        }
    }

    public C2686c(com.voxdon.xplorer.service.b bVar, int i) {
        super(i);
        this.l = true;
        s(new a());
        this.m = bVar;
    }

    private static String B(ax.Q2.f fVar, int i, String str) {
        return "/" + fVar.I() + "/" + i + str;
    }

    public static String C(AbstractC3595n abstractC3595n) {
        return B(abstractC3595n.P(), abstractC3595n.L(), abstractC3595n.E());
    }

    private C3596o F(ax.Q2.f fVar, int i) {
        return this.m.g(fVar, i);
    }

    private a.o G(Map<String, String> map, a.m mVar, String str) {
        String trim = str.trim();
        if (trim.indexOf(63) >= 0) {
            trim = trim.substring(0, trim.indexOf(63));
        }
        String str2 = trim;
        ax.Z2.k z = z(str2);
        if (z == null) {
            return E();
        }
        C3596o F = F(z.b(), z.c());
        if (F == null) {
            return D("Internal Error : Invalid Location");
        }
        if (!this.m.j(z.toString())) {
            return A(HttpUrl.FRAGMENT_ENCODE_SET);
        }
        String e = z.e();
        if (TextUtils.isEmpty(e)) {
            ax.Ha.c.h().f().c("HTTP SERVER EMPTY PATH").g("uri:" + str2).h();
            return E();
        }
        if (!d0.B(e)) {
            e = d0.U(e);
        }
        if (!F.a()) {
            String f = d0.f(e);
            boolean i = F.i(0L);
            if (!i) {
                ax.Ha.c.h().f().b("HTTP SERVER NOT CONNECTED").g("loc:" + F.S().I() + ",ext:" + f + ",connected:" + i).h();
            }
        }
        try {
            AbstractC3595n z2 = F.z(e);
            if (z2 == null || !z2.n()) {
                return E();
            }
            if (z2.isDirectory()) {
                return A("No directory listing.");
            }
            a.o H = H(F, str2, map, z2, z2.s());
            return H != null ? H : E();
        } catch (C1495j e2) {
            return D("Internal Error : " + e2.getMessage());
        }
    }

    public static a.o o(a.o.c cVar, String str, String str2) {
        a.o o = ax.Ya.a.o(cVar, str, str2);
        o.b("Accept-Ranges", "bytes");
        return o;
    }

    private static String y(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        String str3 = "/";
        int indexOf = str.indexOf("/");
        if (indexOf < 0) {
            return null;
        }
        String substring = str.substring(0, indexOf);
        int i = indexOf + 1;
        int indexOf2 = str.indexOf("/", i);
        if (indexOf2 < 0) {
            str2 = str.substring(i);
        } else {
            String substring2 = str.substring(i, indexOf2);
            str3 = str.substring(indexOf2);
            str2 = substring2;
        }
        try {
            Integer.parseInt(str2);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(substring);
            builder.authority(str2);
            builder.path(str3);
            return builder.build().toString();
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static ax.Z2.k z(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (!TextUtils.isEmpty(str) && str.length() > 0 && str.startsWith("/")) {
                String y = y(str.substring(1));
                if (y == null) {
                    return null;
                }
                return ax.Z2.k.a(Uri.parse(y));
            }
            ax.Ha.c.h().f().d("INVALID URI 2").g(HttpUrl.FRAGMENT_ENCODE_SET + str).h();
            return null;
        } catch (IllegalArgumentException unused) {
            ax.Ha.c.h().f().d("INVALID URI 3").g(HttpUrl.FRAGMENT_ENCODE_SET + str).h();
            return null;
        }
    }

    protected a.o A(String str) {
        return ax.Ya.a.o(a.o.d.FORBIDDEN, "text/plain", "FORBIDDEN: " + str);
    }

    protected a.o D(String str) {
        return ax.Ya.a.o(a.o.d.INTERNAL_ERROR, "text/plain", "INTERNAL ERROR: " + str);
    }

    protected a.o E() {
        return ax.Ya.a.o(a.o.d.NOT_FOUND, "text/plain", "Error 404, file not found.");
    }

    a.o H(C3596o c3596o, String str, Map<String, String> map, AbstractC3595n abstractC3595n, String str2) {
        long j;
        boolean z;
        String str3;
        a.o n2;
        long parseLong;
        try {
            if (abstractC3595n.c0()) {
                try {
                    c3596o.r(abstractC3595n);
                } catch (C1495j unused) {
                }
            }
            long p = abstractC3595n.p();
            String hexString = Integer.toHexString((abstractC3595n.E() + abstractC3595n.q() + HttpUrl.FRAGMENT_ENCODE_SET + p).hashCode());
            String str4 = map.get("range");
            long j2 = -1;
            if (str4 == null || !str4.startsWith("bytes=")) {
                j = 0;
            } else {
                str4 = str4.substring(6);
                int indexOf = str4.indexOf(45);
                if (indexOf > 0) {
                    try {
                        parseLong = Long.parseLong(str4.substring(0, indexOf));
                        try {
                            j2 = Long.parseLong(str4.substring(indexOf + 1));
                        } catch (NumberFormatException unused2) {
                        }
                    } catch (NumberFormatException unused3) {
                    }
                    j = parseLong;
                }
                parseLong = 0;
                j = parseLong;
            }
            String str5 = map.get("if-range");
            if (str5 != null && !hexString.equals(str5)) {
                z = false;
                String str6 = map.get("if-none-match");
                boolean z2 = str6 == null && ("*".equals(str6) || str6.equals(hexString));
                str3 = str4;
                long j3 = j2;
                if (z || str3 == null || j < 0 || j >= p) {
                    if (!z && str3 != null && j >= p) {
                        n2 = o(a.o.d.RANGE_NOT_SATISFIABLE, "text/plain", HttpUrl.FRAGMENT_ENCODE_SET);
                        n2.b("Content-Range", "bytes */" + p);
                        n2.b("ETag", hexString);
                        n.fine("HTTP response : Range not satisfiable");
                    } else if (str3 != null && z2) {
                        n2 = o(a.o.d.NOT_MODIFIED, str2, HttpUrl.FRAGMENT_ENCODE_SET);
                        n2.b("ETag", hexString);
                        n.fine("HTTP response : Not modified");
                    } else if (z && z2) {
                        n2 = o(a.o.d.NOT_MODIFIED, str2, HttpUrl.FRAGMENT_ENCODE_SET);
                        n2.b("ETag", hexString);
                        n.fine("HTTP response : Not modified");
                    } else {
                        n2 = ax.Ya.a.n(a.o.d.OK, str2, c3596o.J(abstractC3595n, 0L), p);
                        n2.b("Accept-Ranges", "bytes");
                        n2.b("Content-Length", HttpUrl.FRAGMENT_ENCODE_SET + p);
                        n2.b("ETag", hexString);
                    }
                } else if (z2) {
                    n2 = o(a.o.d.NOT_MODIFIED, str2, HttpUrl.FRAGMENT_ENCODE_SET);
                    n2.b("ETag", hexString);
                } else {
                    if (j3 < 0) {
                        j3 = p - 1;
                    }
                    long j4 = j3;
                    long j5 = (j4 - j) + 1;
                    long j6 = j5 < 0 ? 0L : j5;
                    n2 = ax.Ya.a.n(a.o.d.PARTIAL_CONTENT, str2, c3596o.J(abstractC3595n, j), j6);
                    n2.b("Accept-Ranges", "bytes");
                    n2.b("Content-Length", HttpUrl.FRAGMENT_ENCODE_SET + j6);
                    n2.b("Content-Range", "bytes " + j + "-" + j4 + "/" + p);
                    n2.b("ETag", hexString);
                }
                return n2;
            }
            z = true;
            String str62 = map.get("if-none-match");
            if (str62 == null) {
            }
            str3 = str4;
            long j32 = j2;
            if (z) {
            }
            if (!z) {
            }
            if (str3 != null) {
            }
            if (z) {
            }
            n2 = ax.Ya.a.n(a.o.d.OK, str2, c3596o.J(abstractC3595n, 0L), p);
            n2.b("Accept-Ranges", "bytes");
            n2.b("Content-Length", HttpUrl.FRAGMENT_ENCODE_SET + p);
            n2.b("ETag", hexString);
            return n2;
        } catch (C1495j e) {
            return A("Reading file failed : " + e.getMessage());
        }
    }

    @Override // ax.Ya.a
    public a.o q(a.m mVar) {
        Map<String, String> a2 = mVar.a();
        mVar.d();
        return G(DesugarCollections.unmodifiableMap(a2), mVar, mVar.b());
    }
}
