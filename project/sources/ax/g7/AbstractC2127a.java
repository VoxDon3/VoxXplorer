package ax.g7;

import ax.i7.q;
import ax.i7.r;
import ax.i7.w;
import ax.m7.C2522A;
import ax.m7.t;
import ax.m7.v;
import java.io.IOException;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* renamed from: ax.g7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2127a {
    private static final Logger i = Logger.getLogger(AbstractC2127a.class.getName());
    private final q a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final t f;
    private final boolean g;
    private final boolean h;

    /* renamed from: ax.g7.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0315a {
        final w a;
        r b;
        final t c;
        String d;
        String e;
        String f;
        String g;
        boolean h;
        boolean i;

        protected AbstractC0315a(w wVar, String str, String str2, t tVar, r rVar) {
            this.a = (w) v.d(wVar);
            this.c = tVar;
            c(str);
            d(str2);
            this.b = rVar;
        }

        public AbstractC0315a a(String str) {
            this.g = str;
            return this;
        }

        public AbstractC0315a b(String str) {
            this.f = str;
            return this;
        }

        public AbstractC0315a c(String str) {
            this.d = AbstractC2127a.i(str);
            return this;
        }

        public AbstractC0315a d(String str) {
            this.e = AbstractC2127a.j(str);
            return this;
        }
    }

    protected AbstractC2127a(AbstractC0315a abstractC0315a) {
        abstractC0315a.getClass();
        this.b = i(abstractC0315a.d);
        this.c = j(abstractC0315a.e);
        this.d = abstractC0315a.f;
        if (C2522A.a(abstractC0315a.g)) {
            i.warning("Application name is not set. Call Builder#setApplicationName.");
        }
        this.e = abstractC0315a.g;
        r rVar = abstractC0315a.b;
        this.a = rVar == null ? abstractC0315a.a.c() : abstractC0315a.a.d(rVar);
        this.f = abstractC0315a.c;
        this.g = abstractC0315a.h;
        this.h = abstractC0315a.i;
    }

    static String i(String str) {
        v.e(str, "root URL cannot be null.");
        if (str.endsWith("/")) {
            return str;
        }
        return str + "/";
    }

    static String j(String str) {
        v.e(str, "service path cannot be null");
        if (str.length() == 1) {
            v.b("/".equals(str), "service path must equal \"/\" if it is of length 1.");
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str.length() <= 0) {
            return str;
        }
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        return str.startsWith("/") ? str.substring(1) : str;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.b + this.c;
    }

    public final InterfaceC2129c c() {
        return null;
    }

    public t d() {
        return this.f;
    }

    public final q e() {
        return this.a;
    }

    public final String f() {
        return this.b;
    }

    public final String g() {
        return this.c;
    }

    protected void h(AbstractC2128b<?> abstractC2128b) throws IOException {
        c();
    }
}
