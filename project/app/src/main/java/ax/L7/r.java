/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;
import java.util.List;

final class r
extends F.e.d.a.b.e {
    private final String a;
    private final int b;
    private final List<F.e.d.a.b.e.b> c;

    private r(String string, int n8, List<F.e.d.a.b.e.b> list) {
        this.a = string;
        this.b = n8;
        this.c = list;
    }

    @Override
    public List<F.e.d.a.b.e.b> b() {
        return this.c;
    }

    @Override
    public int c() {
        return this.b;
    }

    @Override
    public String d() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof F.e.d.a.b.e && this.a.equals(((F.e.d.a.b.e)(object = (F.e.d.a.b.e)object)).d()) && this.b == ((F.e.d.a.b.e)object).c() && this.c.equals(((F.e.d.a.b.e)object).b());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Thread{name=");
        stringBuilder.append(this.a);
        stringBuilder.append(", importance=");
        stringBuilder.append(this.b);
        stringBuilder.append(", frames=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.e.d.a.b.e.a {
        private String a;
        private int b;
        private List<F.e.d.a.b.e.b> c;
        private byte d;

        b() {
        }

        @Override
        public F.e.d.a.b.e a() {
            Object object;
            CharSequence charSequence;
            if (this.d == 1 && (charSequence = this.a) != null && (object = this.c) != null) {
                return new r((String)charSequence, this.b, (List)object);
            }
            object = new StringBuilder();
            if (this.a == null) {
                ((StringBuilder)object).append(" name");
            }
            if ((1 & this.d) == 0) {
                ((StringBuilder)object).append(" importance");
            }
            if (this.c == null) {
                ((StringBuilder)object).append(" frames");
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Missing required properties:");
            ((StringBuilder)charSequence).append(object);
            throw new IllegalStateException(((StringBuilder)charSequence).toString());
        }

        @Override
        public F.e.d.a.b.e.a b(List<F.e.d.a.b.e.b> list) {
            if (list != null) {
                this.c = list;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override
        public F.e.d.a.b.e.a c(int n8) {
            this.b = n8;
            this.d = (byte)(this.d | 1);
            return this;
        }

        @Override
        public F.e.d.a.b.e.a d(String string) {
            if (string != null) {
                this.a = string;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }
}

