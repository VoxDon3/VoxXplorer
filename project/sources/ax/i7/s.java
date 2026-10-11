package ax.i7;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class s {
    private InputStream a;
    private final String b;
    private final String c;
    private final o d;
    AbstractC2274A e;
    private final int f;
    private final String g;
    private final p h;
    private final boolean i;
    private int j;
    private boolean k;
    private boolean l;

    s(p pVar, AbstractC2274A abstractC2274A) throws IOException {
        StringBuilder sb;
        this.h = pVar;
        this.i = pVar.l();
        this.j = pVar.d();
        this.k = pVar.s();
        this.e = abstractC2274A;
        this.b = abstractC2274A.c();
        int j = abstractC2274A.j();
        boolean z = false;
        j = j < 0 ? 0 : j;
        this.f = j;
        String i = abstractC2274A.i();
        this.g = i;
        Logger logger = w.a;
        if (this.k && logger.isLoggable(Level.CONFIG)) {
            z = true;
        }
        if (z) {
            sb = new StringBuilder();
            sb.append("-------------- RESPONSE --------------");
            String str = ax.m7.z.a;
            sb.append(str);
            String k = abstractC2274A.k();
            if (k != null) {
                sb.append(k);
            } else {
                sb.append(j);
                if (i != null) {
                    sb.append(' ');
                    sb.append(i);
                }
            }
            sb.append(str);
        } else {
            sb = null;
        }
        pVar.j().l(abstractC2274A, z ? sb : null);
        String e = abstractC2274A.e();
        e = e == null ? pVar.j().n() : e;
        this.c = e;
        this.d = o(e);
        if (z) {
            logger.config(sb.toString());
        }
    }

    private boolean j() throws IOException {
        int h = h();
        if (!g().i().equals("HEAD") && h / 100 != 1 && h != 204 && h != 304) {
            return true;
        }
        k();
        return false;
    }

    private static o o(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new o(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public void a() throws IOException {
        k();
        this.e.a();
    }

    public void b(OutputStream outputStream) throws IOException {
        ax.m7.l.b(c(), outputStream);
    }

    public InputStream c() throws IOException {
        String str;
        if (!this.l) {
            InputStream b = this.e.b();
            if (b != null) {
                try {
                    if (!this.i && (str = this.b) != null) {
                        String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
                        if (!"gzip".equals(lowerCase)) {
                            if ("x-gzip".equals(lowerCase)) {
                            }
                        }
                        b = h.a(new C2280d(b));
                    }
                    Logger logger = w.a;
                    if (this.k) {
                        Level level = Level.CONFIG;
                        if (logger.isLoggable(level)) {
                            b = new ax.m7.p(b, logger, level, this.j);
                        }
                    }
                    if (this.i) {
                        this.a = b;
                    } else {
                        this.a = new BufferedInputStream(b);
                    }
                } catch (EOFException unused) {
                    b.close();
                } catch (Throwable th) {
                    b.close();
                    throw th;
                }
            }
            this.l = true;
        }
        return this.a;
    }

    public Charset d() {
        o oVar = this.d;
        if (oVar != null) {
            if (oVar.e() != null) {
                return this.d.e();
            }
            if ("application".equals(this.d.h()) && "json".equals(this.d.g())) {
                return StandardCharsets.UTF_8;
            }
            if ("text".equals(this.d.h()) && "csv".equals(this.d.g())) {
                return StandardCharsets.UTF_8;
            }
        }
        return StandardCharsets.ISO_8859_1;
    }

    public String e() {
        return this.c;
    }

    public m f() {
        return this.h.j();
    }

    public p g() {
        return this.h;
    }

    public int h() {
        return this.f;
    }

    public String i() {
        return this.g;
    }

    public void k() throws IOException {
        InputStream b;
        AbstractC2274A abstractC2274A = this.e;
        if (abstractC2274A == null || (b = abstractC2274A.b()) == null) {
            return;
        }
        b.close();
    }

    public boolean l() {
        return v.b(this.f);
    }

    public <T> T m(Class<T> cls) throws IOException {
        if (j()) {
            return (T) this.h.h().a(c(), d(), cls);
        }
        return null;
    }

    public String n() throws IOException {
        InputStream c = c();
        if (c == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ax.m7.l.b(c, byteArrayOutputStream);
        return byteArrayOutputStream.toString(d().name());
    }
}
