package ax.O4;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class d extends g implements Iterable<c> {
    private final List<String> e0 = new ArrayList();
    private final List<g> f0 = new ArrayList();
    private transient b g0 = new b();

    class a implements Iterator<c> {
        final /* synthetic */ Iterator c0;
        final /* synthetic */ Iterator q;

        a(Iterator it, Iterator it2) {
            this.q = it;
            this.c0 = it2;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c next() {
            return new c((String) this.q.next(), (g) this.c0.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.q.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static class b {
        private final byte[] a = new byte[32];

        private int c(Object obj) {
            return obj.hashCode() & (this.a.length - 1);
        }

        void a(String str, int i) {
            int c = c(str);
            if (i < 255) {
                this.a[c] = (byte) (i + 1);
            } else {
                this.a[c] = 0;
            }
        }

        int b(Object obj) {
            return (this.a[c(obj)] & 255) - 1;
        }
    }

    public static class c {
        private final String a;
        private final g b;

        c(String str, g gVar) {
            this.a = str;
            this.b = gVar;
        }

        public String a() {
            return this.a;
        }

        public g b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b.equals(cVar.b);
        }

        public int hashCode() {
            return ((this.a.hashCode() + 31) * 31) + this.b.hashCode();
        }
    }

    public static d I(Reader reader) throws IOException {
        return g.s(reader).i();
    }

    public static d J(String str) {
        return g.t(str).i();
    }

    public d B(String str, g gVar) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        if (gVar == null) {
            throw new NullPointerException("value is null");
        }
        this.g0.a(str, this.e0.size());
        this.e0.add(str);
        this.f0.add(gVar);
        return this;
    }

    public d C(String str, String str2) {
        B(str, g.y(str2));
        return this;
    }

    public g D(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        int E = E(str);
        if (E != -1) {
            return this.f0.get(E);
        }
        return null;
    }

    int E(String str) {
        int b2 = this.g0.b(str);
        return (b2 == -1 || !str.equals(this.e0.get(b2))) ? this.e0.lastIndexOf(str) : b2;
    }

    public List<String> G() {
        return DesugarCollections.unmodifiableList(this.e0);
    }

    public d K(String str, long j) {
        M(str, g.x(j));
        return this;
    }

    public d M(String str, g gVar) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        if (gVar == null) {
            throw new NullPointerException("value is null");
        }
        int E = E(str);
        if (E != -1) {
            this.f0.set(E, gVar);
            return this;
        }
        this.g0.a(str, this.e0.size());
        this.e0.add(str);
        this.f0.add(gVar);
        return this;
    }

    public d N(String str, String str2) {
        M(str, g.y(str2));
        return this;
    }

    @Override // ax.O4.g
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.e0.equals(dVar.e0) && this.f0.equals(dVar.f0);
    }

    @Override // ax.O4.g
    public int hashCode() {
        return ((this.e0.hashCode() + 31) * 31) + this.f0.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        return new a(this.e0.iterator(), this.f0.iterator());
    }

    @Override // ax.O4.g
    public boolean q() {
        return true;
    }

    @Override // ax.O4.g
    protected void z(h hVar) throws IOException {
        hVar.j(this);
    }

    @Override // ax.O4.g
    public d i() {
        return this;
    }
}
