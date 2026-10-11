/*
 * Decompiled with CFR 0.152.
 */
package ax.g7;

import ax.g7.a;
import ax.i7.D;
import ax.i7.e;
import ax.i7.f;
import ax.i7.g;
import ax.i7.i;
import ax.i7.m;
import ax.i7.p;
import ax.i7.q;
import ax.i7.s;
import ax.i7.t;
import ax.i7.u;
import ax.m7.k;
import ax.m7.v;
import com.google.api.client.googleapis.GoogleUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class b<T>
extends k {
    private final a e0;
    private final String f0;
    private final String g0;
    private final i h0;
    private m i0 = new m();
    private m j0;
    private int k0 = -1;
    private String l0;
    private boolean m0;
    private boolean n0;
    private Class<T> o0;
    private ax.f7.b p0;
    private ax.f7.a q0;

    protected b(a object, String object2, String charSequence, i i8, Class<T> clazz) {
        this.o0 = v.d(clazz);
        this.e0 = v.d(object);
        this.f0 = v.d(object2);
        this.g0 = v.d(charSequence);
        this.h0 = i8;
        object = ((a)object).a();
        if (object != null) {
            object2 = this.i0;
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append(" ");
            ((StringBuilder)charSequence).append("Google-API-Java-Client");
            ((StringBuilder)charSequence).append("/");
            ((StringBuilder)charSequence).append(GoogleUtils.a);
            ((m)object2).P(((StringBuilder)charSequence).toString());
        } else {
            object2 = this.i0;
            object = new StringBuilder();
            ((StringBuilder)object).append("Google-API-Java-Client/");
            ((StringBuilder)object).append(GoogleUtils.a);
            ((m)object2).P(((StringBuilder)object).toString());
        }
        this.i0.B("X-Goog-Api-Client", b.b);
    }

    private p i(boolean bl) throws IOException {
        boolean bl2;
        Object object;
        block6: {
            block5: {
                object = this.p0;
                boolean bl3 = false;
                bl2 = object == null;
                v.a(bl2);
                if (!bl) break block5;
                bl2 = bl3;
                if (!this.f0.equals("GET")) break block6;
            }
            bl2 = true;
        }
        v.a(bl2);
        object = bl ? "HEAD" : this.f0;
        object = this.o().e().c((String)object, this.j(), this.h0);
        new ax.b7.a().a((p)object);
        ((p)object).x(this.o().d());
        if (this.h0 == null && (this.f0.equals("POST") || this.f0.equals("PUT") || this.f0.equals("PATCH"))) {
            ((p)object).t(new e());
        }
        ((p)object).f().putAll(this.i0);
        if (!this.m0) {
            ((p)object).u(new f());
        }
        ((p)object).B(this.n0);
        ((p)object).A(new u(this, ((p)object).k(), (p)object){
            final u a;
            final p b;
            final b c;
            {
                this.c = b8;
                this.a = u8;
                this.b = p8;
            }

            @Override
            public void a(s s8) throws IOException {
                u u8 = this.a;
                if (u8 != null) {
                    u8.a(s8);
                }
                if (!s8.l() && this.b.m()) {
                    throw this.c.x(s8);
                }
            }
        });
        return object;
    }

    private s n(boolean bl) throws IOException {
        Object object;
        if (this.p0 == null) {
            object = this.i(bl).b();
        } else {
            object = this.j();
            bl = this.o().e().c(this.f0, (g)object, this.h0).m();
            s s8 = this.p0.p(this.i0).o(this.m0).u((g)object);
            s8.g().x(this.o().d());
            object = s8;
            if (bl) {
                if (s8.l()) {
                    object = s8;
                } else {
                    throw this.x(s8);
                }
            }
        }
        this.j0 = ((s)object).f();
        this.k0 = ((s)object).h();
        this.l0 = ((s)object).i();
        return object;
    }

    public T execute() throws IOException {
        return this.m().m(this.o0);
    }

    public g j() {
        return new g(D.c(this.e0.b(), this.g0, this, true));
    }

    protected s k() throws IOException {
        this.y("alt", "media");
        return this.m();
    }

    protected InputStream l() throws IOException {
        return this.k().c();
    }

    public s m() throws IOException {
        return this.n(false);
    }

    public a o() {
        return this.e0;
    }

    public final ax.f7.b r() {
        return this.p0;
    }

    public final m s() {
        return this.i0;
    }

    public final String t() {
        return this.g0;
    }

    protected final void v() {
        q q8 = this.e0.e();
        this.q0 = new ax.f7.a(q8.e(), q8.d());
    }

    protected final void w(ax.i7.b object) {
        q q8 = this.e0.e();
        this.p0 = object = new ax.f7.b((ax.i7.b)object, q8.e(), q8.d());
        ((ax.f7.b)object).q(this.f0);
        object = this.h0;
        if (object != null) {
            this.p0.r((i)object);
        }
    }

    protected IOException x(s s8) {
        return new t(s8);
    }

    public b<T> y(String string, Object object) {
        return (b)super.f(string, object);
    }

    static class b {
        static final String b = new b().toString();
        private final String a;

        b() {
            this(ax.g7.b$b.d(), ax.q7.s.v0.j(), ax.q7.s.x0.j(), GoogleUtils.a);
        }

        b(String string, String string2, String string3, String string4) {
            StringBuilder stringBuilder = new StringBuilder("gl-java/");
            stringBuilder.append(ax.g7.b$b.b(string));
            stringBuilder.append(" gdcl/");
            stringBuilder.append(ax.g7.b$b.b(string4));
            if (string2 != null && string3 != null) {
                stringBuilder.append(" ");
                stringBuilder.append(ax.g7.b$b.a(string2));
                stringBuilder.append("/");
                stringBuilder.append(ax.g7.b$b.b(string3));
            }
            this.a = stringBuilder.toString();
        }

        private static String a(String string) {
            return string.toLowerCase().replaceAll("[^\\w\\d\\-]", "-");
        }

        private static String b(String string) {
            return ax.g7.b$b.c(string, string);
        }

        private static String c(String object, String string) {
            if (object == null) {
                return null;
            }
            object = Pattern.compile("(\\d+\\.\\d+\\.\\d+).*").matcher((CharSequence)object);
            if (((Matcher)object).find()) {
                return ((Matcher)object).group(1);
            }
            return string;
        }

        private static String d() {
            Object object = System.getProperty("java.version");
            if (object == null) {
                return null;
            }
            CharSequence charSequence = ax.g7.b$b.c((String)object, null);
            if (charSequence != null) {
                return charSequence;
            }
            object = Pattern.compile("^(\\d+)[^\\d]?").matcher((CharSequence)object);
            if (((Matcher)object).find()) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(((Matcher)object).group(1));
                ((StringBuilder)charSequence).append(".0.0");
                return ((StringBuilder)charSequence).toString();
            }
            return null;
        }

        public String toString() {
            return this.a;
        }
    }
}

