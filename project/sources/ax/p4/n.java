package ax.p4;

import ax.C4.b;
import ax.p4.C2765b;
import ax.s4.AbstractC3046a;
import ax.t4.AbstractC3100b;
import ax.t4.C3099a;
import ax.w4.C3343c;
import ax.w4.C3344d;
import ax.w4.C3346f;
import ax.z4.C3544a;
import ax.z4.C3545b;
import j$.net.URLEncoder;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class n {
    private static final Random a = new Random();

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends b<T, C2773j> {
        final /* synthetic */ m a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;
        final /* synthetic */ String[] e;
        final /* synthetic */ List f;
        final /* synthetic */ c g;

        a(m mVar, String str, String str2, String str3, String[] strArr, List list, c cVar) {
            this.a = mVar;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = strArr;
            this.f = list;
            this.g = cVar;
        }

        @Override // ax.p4.n.b
        public T a() throws C2773j {
            return (T) n.m(n.x(this.a, this.b, this.c, this.d, this.e, this.f), this.g);
        }
    }

    public static abstract class b<T, E extends Throwable> {
        public abstract T a() throws C2773j, Throwable;
    }

    public static abstract class c<T> {
        public abstract T a(AbstractC3046a.b bVar) throws C2773j;
    }

    public static C2773j A(AbstractC3046a.b bVar) throws t, C2768e {
        return B(bVar, null);
    }

    public static C2773j B(AbstractC3046a.b bVar, String str) throws t, C2768e {
        C2773j rVar;
        String q = q(bVar);
        int d = bVar.d();
        if (d == 400) {
            return new C2766c(q, s(bVar, q));
        }
        if (d != 401) {
            if (d == 403) {
                try {
                    C2765b b2 = new C2765b.a(C3544a.b.b).b(bVar.b());
                    return new C2764a(q, b2.b() != null ? b2.b().toString() : null, (C3544a) b2.a());
                } catch (ax.T4.k e) {
                    throw new C2768e(q, "Bad JSON: " + e.getMessage(), e);
                } catch (IOException e2) {
                    throw new t(e2);
                }
            }
            if (d == 422) {
                try {
                    C2765b b3 = new C2765b.a(b.C0060b.b).b(bVar.b());
                    return new u(q, b3.b() != null ? b3.b().toString() : null, (ax.C4.b) b3.a());
                } catch (ax.T4.k e3) {
                    throw new C2768e(q, "Bad JSON: " + e3.getMessage(), e3);
                } catch (IOException e4) {
                    throw new t(e4);
                }
            }
            if (d != 429) {
                if (d == 500) {
                    return new y(q, null);
                }
                if (d != 503) {
                    return new C2767d(q, "unexpected HTTP status code: " + bVar.d() + ": " + ((String) null), bVar.d());
                }
                String p = p(bVar, "Retry-After");
                if (p != null) {
                    try {
                        if (!p.trim().isEmpty()) {
                            rVar = new x(q, null, Integer.parseInt(p), TimeUnit.SECONDS);
                        }
                    } catch (NumberFormatException unused) {
                        return new C2768e(q, "Invalid value for HTTP header: \"Retry-After\"");
                    }
                }
                return new x(q, null);
            }
            try {
                rVar = new w(q, null, Integer.parseInt(o(bVar, "Retry-After")), TimeUnit.SECONDS);
            } catch (NumberFormatException unused2) {
                return new C2768e(q, "Invalid value for HTTP header: \"Retry-After\"");
            }
        } else {
            String s = s(bVar, q);
            if (s.isEmpty()) {
                return new r(q, s, C3545b.c);
            }
            try {
                rVar = new r(q, s, (C3545b) new C2765b.a(C3545b.C0510b.b).c(s).a());
            } catch (ax.T4.i e5) {
                throw new C2768e(q, "Bad JSON: " + e5.getMessage(), e5);
            }
        }
        return rVar;
    }

    public static List<AbstractC3046a.C0448a> a(List<AbstractC3046a.C0448a> list, String str) {
        if (str == null) {
            throw new NullPointerException("accessToken");
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(new AbstractC3046a.C0448a("Authorization", "Bearer " + str));
        return list;
    }

    public static List<AbstractC3046a.C0448a> b(List<AbstractC3046a.C0448a> list, String str, String str2) {
        if (str == null) {
            throw new NullPointerException("username");
        }
        if (str2 == null) {
            throw new NullPointerException("password");
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        String a2 = C3346f.a(C3346f.g(str + ":" + str2));
        StringBuilder sb = new StringBuilder();
        sb.append("Basic ");
        sb.append(a2);
        list.add(new AbstractC3046a.C0448a("Authorization", sb.toString()));
        return list;
    }

    public static List<AbstractC3046a.C0448a> c(List<AbstractC3046a.C0448a> list, ax.C4.a aVar) {
        if (aVar == null) {
            return list;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(new AbstractC3046a.C0448a("Dropbox-API-Path-Root", aVar.toString()));
        return list;
    }

    public static List<AbstractC3046a.C0448a> d(List<AbstractC3046a.C0448a> list, m mVar, String str) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(h(mVar, str));
        return list;
    }

    public static List<AbstractC3046a.C0448a> e(List<AbstractC3046a.C0448a> list, m mVar) {
        if (mVar.d() == null) {
            return list;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(new AbstractC3046a.C0448a("Dropbox-API-User-Locale", mVar.d()));
        return list;
    }

    public static String f(String str, String str2) {
        try {
            return new URI("https", str, "/" + str2, null).toASCIIString();
        } catch (URISyntaxException e) {
            throw C3344d.a("URI creation failed, host=" + C3346f.f(str) + ", path=" + C3346f.f(str2), e);
        }
    }

    public static String g(String str, String str2, String str3, String[] strArr) {
        return f(str2, str3) + "?" + l(str, strArr);
    }

    public static AbstractC3046a.C0448a h(m mVar, String str) {
        return new AbstractC3046a.C0448a("User-Agent", mVar.a() + " " + str + "/7.0.0");
    }

    private static List<AbstractC3046a.C0448a> i(List<AbstractC3046a.C0448a> list) {
        return list == null ? new ArrayList() : new ArrayList(list);
    }

    public static <T> T j(m mVar, String str, String str2, String str3, String[] strArr, List<AbstractC3046a.C0448a> list, c<T> cVar) throws C2773j {
        return (T) w(mVar.c(), new a(mVar, str, str2, str3, strArr, list, cVar));
    }

    public static String k(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw C3344d.a("UTF-8 should always be supported", e);
        }
    }

    private static String l(String str, String[] strArr) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append("locale=");
            sb.append(k(str));
            str2 = "&";
        } else {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (strArr != null) {
            if (strArr.length % 2 != 0) {
                throw new IllegalArgumentException("'params.length' is " + strArr.length + "; expecting a multiple of two");
            }
            for (int i = 0; i < strArr.length; i += 2) {
                String str3 = strArr[i];
                String str4 = strArr[i + 1];
                if (str3 == null) {
                    throw new IllegalArgumentException("params[" + i + "] is null");
                }
                if (str4 != null) {
                    sb.append(str2);
                    sb.append(k(str3));
                    sb.append("=");
                    sb.append(k(str4));
                    str2 = "&";
                }
            }
        }
        return sb.toString();
    }

    public static <T> T m(AbstractC3046a.b bVar, c<T> cVar) throws C2773j {
        try {
            return cVar.a(bVar);
        } finally {
            if (bVar != null) {
                C3343c.a(bVar.b());
            }
        }
    }

    public static String n(AbstractC3046a.b bVar) {
        return p(bVar, "Content-Type");
    }

    public static String o(AbstractC3046a.b bVar, String str) throws C2768e {
        List<String> list = bVar.c().get(str);
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        throw new C2768e(q(bVar), "missing HTTP header \"" + str + "\"");
    }

    public static String p(AbstractC3046a.b bVar, String str) {
        List<String> list = bVar.c().get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static String q(AbstractC3046a.b bVar) {
        return p(bVar, "X-Dropbox-Request-Id");
    }

    public static byte[] r(AbstractC3046a.b bVar) throws t {
        if (bVar.b() == null) {
            return new byte[0];
        }
        try {
            return C3343c.g(bVar.b(), 4096);
        } catch (IOException e) {
            throw new t(e);
        }
    }

    private static String s(AbstractC3046a.b bVar, String str) throws t, C2768e {
        return t(str, bVar.d(), r(bVar));
    }

    public static String t(String str, int i, byte[] bArr) throws C2768e {
        try {
            return C3346f.i(bArr);
        } catch (CharacterCodingException e) {
            throw new C2768e(str, "Got non-UTF8 response body: " + i + ": " + e.getMessage());
        }
    }

    public static <T> T u(AbstractC3100b<T> abstractC3100b, AbstractC3046a.b bVar) throws C2768e, t {
        try {
            return abstractC3100b.h(bVar.b());
        } catch (C3099a e) {
            throw new C2768e(q(bVar), "error in response JSON: " + e.getMessage(), e);
        } catch (IOException e2) {
            throw new t(e2);
        }
    }

    public static List<AbstractC3046a.C0448a> v(List<AbstractC3046a.C0448a> list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC3046a.C0448a c0448a : list) {
            if ("Authorization".equals(c0448a.a())) {
                arrayList.add(c0448a);
            }
        }
        list.removeAll(arrayList);
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T, E extends java.lang.Throwable> T w(int r8, ax.p4.n.b<T, E> r9) throws ax.p4.C2773j, java.lang.Throwable {
        /*
            r0 = 0
        L1:
            r1 = 0
            java.lang.Object r8 = r9.a()     // Catch: ax.p4.y -> L8 ax.p4.x -> Lb
            return r8
        L8:
            r3 = move-exception
            r4 = r1
            goto L10
        Lb:
            r3 = move-exception
            long r4 = r3.a()
        L10:
            if (r0 >= r8) goto L2e
            java.util.Random r3 = ax.p4.n.a
            r6 = 1000(0x3e8, float:1.401E-42)
            int r3 = r3.nextInt(r6)
            long r6 = (long) r3
            long r4 = r4 + r6
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 <= 0) goto L2b
            java.lang.Thread.sleep(r4)     // Catch: java.lang.InterruptedException -> L24
            goto L2b
        L24:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L2b:
            int r0 = r0 + 1
            goto L1
        L2e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.p4.n.w(int, ax.p4.n$b):java.lang.Object");
    }

    public static AbstractC3046a.b x(m mVar, String str, String str2, String str3, String[] strArr, List<AbstractC3046a.C0448a> list) throws t {
        byte[] g = C3346f.g(l(mVar.d(), strArr));
        List<AbstractC3046a.C0448a> i = i(list);
        i.add(new AbstractC3046a.C0448a("Content-Type", "application/x-www-form-urlencoded; charset=utf-8"));
        return y(mVar, str, str2, str3, g, i);
    }

    public static AbstractC3046a.b y(m mVar, String str, String str2, String str3, byte[] bArr, List<AbstractC3046a.C0448a> list) throws t {
        String f = f(str2, str3);
        List<AbstractC3046a.C0448a> d = d(i(list), mVar, str);
        d.add(new AbstractC3046a.C0448a("Content-Length", Integer.toString(bArr.length)));
        try {
            AbstractC3046a.c a2 = mVar.b().a(f, d);
            try {
                a2.f(bArr);
                return a2.b();
            } finally {
                a2.a();
            }
        } catch (IOException e) {
            throw new t(e);
        }
    }

    public static String[] z(Map<String, String> map) {
        String[] strArr = new String[map.size() * 2];
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            strArr[i] = entry.getKey();
            strArr[i + 1] = entry.getValue();
            i += 2;
        }
        return strArr;
    }
}
