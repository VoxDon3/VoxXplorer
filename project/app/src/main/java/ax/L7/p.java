/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;
import java.util.List;

final class p
extends F.e.d.a.b.c {
    private final String a;
    private final String b;
    private final List<F.e.d.a.b.e.b> c;
    private final F.e.d.a.b.c d;
    private final int e;

    private p(String string, String string2, List<F.e.d.a.b.e.b> list, F.e.d.a.b.c c8, int n8) {
        this.a = string;
        this.b = string2;
        this.c = list;
        this.d = c8;
        this.e = n8;
    }

    @Override
    public F.e.d.a.b.c b() {
        return this.d;
    }

    @Override
    public List<F.e.d.a.b.e.b> c() {
        return this.c;
    }

    @Override
    public int d() {
        return this.e;
    }

    @Override
    public String e() {
        return this.b;
    }

    public boolean equals(Object object) {
        Object object2;
        if (object == this) {
            return true;
        }
        return object instanceof F.e.d.a.b.c && this.a.equals(((F.e.d.a.b.c)(object = (F.e.d.a.b.c)object)).f()) && ((object2 = this.b) == null ? ((F.e.d.a.b.c)object).e() == null : ((String)object2).equals(((F.e.d.a.b.c)object).e())) && this.c.equals(((F.e.d.a.b.c)object).c()) && ((object2 = this.d) == null ? ((F.e.d.a.b.c)object).b() == null : object2.equals(((F.e.d.a.b.c)object).b())) && this.e == ((F.e.d.a.b.c)object).d();
    }

    @Override
    public String f() {
        return this.a;
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        Object object = this.b;
        int n9 = 0;
        int n10 = object == null ? 0 : ((String)object).hashCode();
        int n11 = this.c.hashCode();
        object = this.d;
        if (object != null) {
            n9 = object.hashCode();
        }
        return ((((n8 ^ 0xF4243) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n9) * 1000003 ^ this.e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Exception{type=");
        stringBuilder.append(this.a);
        stringBuilder.append(", reason=");
        stringBuilder.append(this.b);
        stringBuilder.append(", frames=");
        stringBuilder.append(this.c);
        stringBuilder.append(", causedBy=");
        stringBuilder.append(this.d);
        stringBuilder.append(", overflowCount=");
        stringBuilder.append(this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.e.d.a.b.c.a {
        private String a;
        private String b;
        private List<F.e.d.a.b.e.b> c;
        private F.e.d.a.b.c d;
        private int e;
        private byte f;

        b() {
        }

        @Override
        public F.e.d.a.b.c a() {
            Object object;
            CharSequence charSequence;
            if (this.f == 1 && (charSequence = this.a) != null && (object = this.c) != null) {
                return new p((String)charSequence, this.b, (List)object, this.d, this.e);
            }
            object = new StringBuilder();
            if (this.a == null) {
                ((StringBuilder)object).append(" type");
            }
            if (this.c == null) {
                ((StringBuilder)object).append(" frames");
            }
            if ((1 & this.f) == 0) {
                ((StringBuilder)object).append(" overflowCount");
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Missing required properties:");
            ((StringBuilder)charSequence).append(object);
            throw new IllegalStateException(((StringBuilder)charSequence).toString());
        }

        @Override
        public F.e.d.a.b.c.a b(F.e.d.a.b.c c8) {
            this.d = c8;
            return this;
        }

        @Override
        public F.e.d.a.b.c.a c(List<F.e.d.a.b.e.b> list) {
            if (list != null) {
                this.c = list;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override
        public F.e.d.a.b.c.a d(int n8) {
            this.e = n8;
            this.f = (byte)(this.f | 1);
            return this;
        }

        @Override
        public F.e.d.a.b.c.a e(String string) {
            this.b = string;
            return this;
        }

        @Override
        public F.e.d.a.b.c.a f(String string) {
            if (string != null) {
                this.a = string;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }
}

