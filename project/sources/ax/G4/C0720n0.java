package ax.G4;

import ax.G4.EnumC0726q0;
import ax.G4.EnumC0727r0;
import ax.G4.EnumC0729s0;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: ax.G4.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0720n0 {
    protected final String a;
    protected final EnumC0726q0 b;
    protected final EnumC0729s0 c;
    protected final EnumC0727r0 d;

    /* renamed from: ax.G4.n0$a */
    public static class a {
        protected final String a;
        protected EnumC0726q0 b;
        protected EnumC0729s0 c;
        protected EnumC0727r0 d;

        protected a(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Required value for 'path' is null");
            }
            if (!Pattern.matches("(/(.|[\\r\\n])*|id:.*)|(rev:[0-9a-f]{9,})|(ns:[0-9]+(/.*)?)", str)) {
                throw new IllegalArgumentException("String 'path' does not match pattern");
            }
            this.a = str;
            this.b = EnumC0726q0.JPEG;
            this.c = EnumC0729s0.W64H64;
            this.d = EnumC0727r0.STRICT;
        }

        public C0720n0 a() {
            return new C0720n0(this.a, this.b, this.c, this.d);
        }

        public a b(EnumC0726q0 enumC0726q0) {
            if (enumC0726q0 != null) {
                this.b = enumC0726q0;
                return this;
            }
            this.b = EnumC0726q0.JPEG;
            return this;
        }

        public a c(EnumC0729s0 enumC0729s0) {
            if (enumC0729s0 != null) {
                this.c = enumC0729s0;
                return this;
            }
            this.c = EnumC0729s0.W64H64;
            return this;
        }
    }

    /* renamed from: ax.G4.n0$b */
    static class b extends ax.v4.e<C0720n0> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C0720n0 s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
            String str;
            String str2 = null;
            if (z) {
                str = null;
            } else {
                AbstractC3276c.h(jVar);
                str = AbstractC3274a.q(jVar);
            }
            if (str != null) {
                throw new ax.T4.i(jVar, "No subtype found that matches tag: \"" + str + "\"");
            }
            EnumC0726q0 enumC0726q0 = EnumC0726q0.JPEG;
            EnumC0729s0 enumC0729s0 = EnumC0729s0.W64H64;
            EnumC0727r0 enumC0727r0 = EnumC0727r0.STRICT;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("path".equals(g)) {
                    str2 = C3277d.f().a(jVar);
                } else if ("format".equals(g)) {
                    enumC0726q0 = EnumC0726q0.b.b.a(jVar);
                } else if ("size".equals(g)) {
                    enumC0729s0 = EnumC0729s0.b.b.a(jVar);
                } else if ("mode".equals(g)) {
                    enumC0727r0 = EnumC0727r0.b.b.a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (str2 == null) {
                throw new ax.T4.i(jVar, "Required field \"path\" missing.");
            }
            C0720n0 c0720n0 = new C0720n0(str2, enumC0726q0, enumC0729s0, enumC0727r0);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(c0720n0, c0720n0.b());
            return c0720n0;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(C0720n0 c0720n0, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("path");
            C3277d.f().k(c0720n0.a, gVar);
            gVar.o("format");
            EnumC0726q0.b.b.k(c0720n0.b, gVar);
            gVar.o("size");
            EnumC0729s0.b.b.k(c0720n0.c, gVar);
            gVar.o("mode");
            EnumC0727r0.b.b.k(c0720n0.d, gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public C0720n0(String str, EnumC0726q0 enumC0726q0, EnumC0729s0 enumC0729s0, EnumC0727r0 enumC0727r0) {
        if (str == null) {
            throw new IllegalArgumentException("Required value for 'path' is null");
        }
        if (!Pattern.matches("(/(.|[\\r\\n])*|id:.*)|(rev:[0-9a-f]{9,})|(ns:[0-9]+(/.*)?)", str)) {
            throw new IllegalArgumentException("String 'path' does not match pattern");
        }
        this.a = str;
        if (enumC0726q0 == null) {
            throw new IllegalArgumentException("Required value for 'format' is null");
        }
        this.b = enumC0726q0;
        if (enumC0729s0 == null) {
            throw new IllegalArgumentException("Required value for 'size' is null");
        }
        this.c = enumC0729s0;
        if (enumC0727r0 == null) {
            throw new IllegalArgumentException("Required value for 'mode' is null");
        }
        this.d = enumC0727r0;
    }

    public static a a(String str) {
        return new a(str);
    }

    public String b() {
        return b.b.j(this, true);
    }

    public boolean equals(Object obj) {
        EnumC0726q0 enumC0726q0;
        EnumC0726q0 enumC0726q02;
        EnumC0729s0 enumC0729s0;
        EnumC0729s0 enumC0729s02;
        EnumC0727r0 enumC0727r0;
        EnumC0727r0 enumC0727r02;
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        C0720n0 c0720n0 = (C0720n0) obj;
        String str = this.a;
        String str2 = c0720n0.a;
        return (str == str2 || str.equals(str2)) && ((enumC0726q0 = this.b) == (enumC0726q02 = c0720n0.b) || enumC0726q0.equals(enumC0726q02)) && (((enumC0729s0 = this.c) == (enumC0729s02 = c0720n0.c) || enumC0729s0.equals(enumC0729s02)) && ((enumC0727r0 = this.d) == (enumC0727r02 = c0720n0.d) || enumC0727r0.equals(enumC0727r02)));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public String toString() {
        return b.b.j(this, false);
    }
}
