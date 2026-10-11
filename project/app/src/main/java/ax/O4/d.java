/*
 * Decompiled with CFR 0.152.
 */
package ax.O4;

import ax.O4.g;
import ax.O4.h;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d
extends g
implements Iterable<c> {
    private final List<String> e0 = new ArrayList<String>();
    private final List<g> f0 = new ArrayList<g>();
    private transient b g0 = new b();

    public static d I(Reader reader) throws IOException {
        return g.s(reader).i();
    }

    public static d J(String string) {
        return g.t(string).i();
    }

    public d B(String string, g g8) {
        if (string != null) {
            if (g8 != null) {
                this.g0.a(string, this.e0.size());
                this.e0.add(string);
                this.f0.add(g8);
                return this;
            }
            throw new NullPointerException("value is null");
        }
        throw new NullPointerException("name is null");
    }

    public d C(String string, String string2) {
        this.B(string, g.y(string2));
        return this;
    }

    public g D(String string) {
        if (string != null) {
            int n8 = this.E(string);
            if (n8 != -1) {
                return this.f0.get(n8);
            }
            return null;
        }
        throw new NullPointerException("name is null");
    }

    int E(String string) {
        int n8 = this.g0.b(string);
        if (n8 != -1 && string.equals(this.e0.get(n8))) {
            return n8;
        }
        return this.e0.lastIndexOf(string);
    }

    public List<String> G() {
        return java.util.DesugarCollections.unmodifiableList(this.e0);
    }

    public d K(String string, long l8) {
        this.M(string, g.x(l8));
        return this;
    }

    public d M(String string, g g8) {
        if (string != null) {
            if (g8 != null) {
                int n8 = this.E(string);
                if (n8 != -1) {
                    this.f0.set(n8, g8);
                    return this;
                }
                this.g0.a(string, this.e0.size());
                this.e0.add(string);
                this.f0.add(g8);
                return this;
            }
            throw new NullPointerException("value is null");
        }
        throw new NullPointerException("name is null");
    }

    public d N(String string, String string2) {
        this.M(string, g.y(string2));
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        object = (d)object;
        return this.e0.equals(((d)object).e0) && this.f0.equals(((d)object).f0);
    }

    @Override
    public int hashCode() {
        return (this.e0.hashCode() + 31) * 31 + this.f0.hashCode();
    }

    @Override
    public d i() {
        return this;
    }

    @Override
    public Iterator<c> iterator() {
        return new Iterator<c>(this, this.e0.iterator(), this.f0.iterator()){
            final Iterator c0;
            final d d0;
            final Iterator q;
            {
                this.d0 = d8;
                this.q = iterator;
                this.c0 = iterator2;
            }

            public c b() {
                return new c((String)this.q.next(), (g)this.c0.next());
            }

            @Override
            public boolean hasNext() {
                return this.q.hasNext();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public boolean q() {
        return true;
    }

    @Override
    protected void z(h h8) throws IOException {
        h8.j(this);
    }

    static class b {
        private final byte[] a = new byte[32];

        private int c(Object object) {
            return object.hashCode() & this.a.length - 1;
        }

        void a(String string, int n8) {
            int n9 = this.c(string);
            if (n8 < 255) {
                this.a[n9] = (byte)(n8 + 1);
                return;
            }
            this.a[n9] = 0;
        }

        int b(Object object) {
            int n8 = this.c(object);
            return (this.a[n8] & 0xFF) - 1;
        }
    }

    public static class c {
        private final String a;
        private final g b;

        c(String string, g g8) {
            this.a = string;
            this.b = g8;
        }

        public String a() {
            return this.a;
        }

        public g b() {
            return this.b;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object == null) {
                return false;
            }
            if (this.getClass() != object.getClass()) {
                return false;
            }
            object = (c)object;
            return this.a.equals(((c)object).a) && this.b.equals(((c)object).b);
        }

        public int hashCode() {
            return (this.a.hashCode() + 31) * 31 + this.b.hashCode();
        }
    }
}

