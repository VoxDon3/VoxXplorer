/*
 * Decompiled with CFR 0.152.
 */
package ax.p5;

import ax.n5.g;
import ax.p5.o;
import ax.p5.p;

final class c
extends o {
    private final p a;
    private final String b;
    private final ax.n5.c<?> c;
    private final g<?, byte[]> d;
    private final ax.n5.b e;

    private c(p p8, String string, ax.n5.c<?> c8, g<?, byte[]> g8, ax.n5.b b8) {
        this.a = p8;
        this.b = string;
        this.c = c8;
        this.d = g8;
        this.e = b8;
    }

    @Override
    public ax.n5.b b() {
        return this.e;
    }

    @Override
    ax.n5.c<?> c() {
        return this.c;
    }

    @Override
    g<?, byte[]> e() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof o && this.a.equals(((o)(object = (o)object)).f()) && this.b.equals(((o)object).g()) && this.c.equals(((o)object).c()) && this.d.equals(((o)object).e()) && this.e.equals(((o)object).b());
    }

    @Override
    public p f() {
        return this.a;
    }

    @Override
    public String g() {
        return this.b;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SendRequest{transportContext=");
        stringBuilder.append(this.a);
        stringBuilder.append(", transportName=");
        stringBuilder.append(this.b);
        stringBuilder.append(", event=");
        stringBuilder.append(this.c);
        stringBuilder.append(", transformer=");
        stringBuilder.append(this.d);
        stringBuilder.append(", encoding=");
        stringBuilder.append(this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends o.a {
        private p a;
        private String b;
        private ax.n5.c<?> c;
        private g<?, byte[]> d;
        private ax.n5.b e;

        b() {
        }

        @Override
        public o a() {
            Object object = this.a;
            Object object2 = "";
            if (object == null) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("");
                ((StringBuilder)object2).append(" transportContext");
                object2 = ((StringBuilder)object2).toString();
            }
            object = object2;
            if (this.b == null) {
                object = new StringBuilder();
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append(" transportName");
                object = ((StringBuilder)object).toString();
            }
            object2 = object;
            if (this.c == null) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(" event");
                object2 = ((StringBuilder)object2).toString();
            }
            object = object2;
            if (this.d == null) {
                object = new StringBuilder();
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append(" transformer");
                object = ((StringBuilder)object).toString();
            }
            object2 = object;
            if (this.e == null) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(" encoding");
                object2 = ((StringBuilder)object2).toString();
            }
            if (((String)object2).isEmpty()) {
                return new c(this.a, this.b, this.c, this.d, this.e);
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Missing required properties:");
            ((StringBuilder)object).append((String)object2);
            throw new IllegalStateException(((StringBuilder)object).toString());
        }

        @Override
        o.a b(ax.n5.b b8) {
            if (b8 != null) {
                this.e = b8;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        @Override
        o.a c(ax.n5.c<?> c8) {
            if (c8 != null) {
                this.c = c8;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        @Override
        o.a d(g<?, byte[]> g8) {
            if (g8 != null) {
                this.d = g8;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        @Override
        public o.a e(p p8) {
            if (p8 != null) {
                this.a = p8;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        @Override
        public o.a f(String string) {
            if (string != null) {
                this.b = string;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }
}

