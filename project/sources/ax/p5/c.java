package ax.p5;

import ax.n5.AbstractC2581c;
import ax.n5.C2580b;
import ax.p5.o;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
final class c extends o {
    private final p a;
    private final String b;
    private final AbstractC2581c<?> c;
    private final ax.n5.g<?, byte[]> d;
    private final C2580b e;

    static final class b extends o.a {
        private p a;
        private String b;
        private AbstractC2581c<?> c;
        private ax.n5.g<?, byte[]> d;
        private C2580b e;

        b() {
        }

        @Override // ax.p5.o.a
        public o a() {
            p pVar = this.a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (pVar == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " transportContext";
            }
            if (this.b == null) {
                str = str + " transportName";
            }
            if (this.c == null) {
                str = str + " event";
            }
            if (this.d == null) {
                str = str + " transformer";
            }
            if (this.e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ax.p5.o.a
        o.a b(C2580b c2580b) {
            if (c2580b == null) {
                throw new NullPointerException("Null encoding");
            }
            this.e = c2580b;
            return this;
        }

        @Override // ax.p5.o.a
        o.a c(AbstractC2581c<?> abstractC2581c) {
            if (abstractC2581c == null) {
                throw new NullPointerException("Null event");
            }
            this.c = abstractC2581c;
            return this;
        }

        @Override // ax.p5.o.a
        o.a d(ax.n5.g<?, byte[]> gVar) {
            if (gVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.d = gVar;
            return this;
        }

        @Override // ax.p5.o.a
        public o.a e(p pVar) {
            if (pVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.a = pVar;
            return this;
        }

        @Override // ax.p5.o.a
        public o.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.b = str;
            return this;
        }
    }

    @Override // ax.p5.o
    public C2580b b() {
        return this.e;
    }

    @Override // ax.p5.o
    AbstractC2581c<?> c() {
        return this.c;
    }

    @Override // ax.p5.o
    ax.n5.g<?, byte[]> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.a.equals(oVar.f()) && this.b.equals(oVar.g()) && this.c.equals(oVar.c()) && this.d.equals(oVar.e()) && this.e.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.p5.o
    public p f() {
        return this.a;
    }

    @Override // ax.p5.o
    public String g() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.d + ", encoding=" + this.e + "}";
    }

    private c(p pVar, String str, AbstractC2581c<?> abstractC2581c, ax.n5.g<?, byte[]> gVar, C2580b c2580b) {
        this.a = pVar;
        this.b = str;
        this.c = abstractC2581c;
        this.d = gVar;
        this.e = c2580b;
    }
}
