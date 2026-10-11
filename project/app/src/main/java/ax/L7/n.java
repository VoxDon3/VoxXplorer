/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;
import java.util.List;

final class n
extends F.e.d.a.b {
    private final List<F.e.d.a.b.e> a;
    private final F.e.d.a.b.c b;
    private final F.a c;
    private final F.e.d.a.b.d d;
    private final List<F.e.d.a.b.a> e;

    private n(List<F.e.d.a.b.e> list, F.e.d.a.b.c c8, F.a a8, F.e.d.a.b.d d8, List<F.e.d.a.b.a> list2) {
        this.a = list;
        this.b = c8;
        this.c = a8;
        this.d = d8;
        this.e = list2;
    }

    @Override
    public F.a b() {
        return this.c;
    }

    @Override
    public List<F.e.d.a.b.a> c() {
        return this.e;
    }

    @Override
    public F.e.d.a.b.c d() {
        return this.b;
    }

    @Override
    public F.e.d.a.b.d e() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof F.e.d.a.b) {
            object = (F.e.d.a.b)object;
            List<F.e.d.a.b.e> list = this.a;
            if ((list == null ? ((F.e.d.a.b)object).f() == null : list.equals(((F.e.d.a.b)object).f())) && ((list = this.b) == null ? ((F.e.d.a.b)object).d() == null : ((Object)list).equals(((F.e.d.a.b)object).d())) && ((list = this.c) == null ? ((F.e.d.a.b)object).b() == null : ((Object)list).equals(((F.e.d.a.b)object).b())) && this.d.equals(((F.e.d.a.b)object).e()) && this.e.equals(((F.e.d.a.b)object).c())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<F.e.d.a.b.e> f() {
        return this.a;
    }

    public int hashCode() {
        Object object = this.a;
        int n8 = 0;
        int n9 = object == null ? 0 : object.hashCode();
        object = this.b;
        int n10 = object == null ? 0 : object.hashCode();
        object = this.c;
        if (object != null) {
            n8 = object.hashCode();
        }
        return ((((n9 ^ 0xF4243) * 1000003 ^ n10) * 1000003 ^ n8) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Execution{threads=");
        stringBuilder.append(this.a);
        stringBuilder.append(", exception=");
        stringBuilder.append(this.b);
        stringBuilder.append(", appExitInfo=");
        stringBuilder.append(this.c);
        stringBuilder.append(", signal=");
        stringBuilder.append(this.d);
        stringBuilder.append(", binaries=");
        stringBuilder.append(this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.e.d.a.b.b {
        private List<F.e.d.a.b.e> a;
        private F.e.d.a.b.c b;
        private F.a c;
        private F.e.d.a.b.d d;
        private List<F.e.d.a.b.a> e;

        b() {
        }

        @Override
        public F.e.d.a.b a() {
            Object object;
            Object object2 = this.d;
            if (object2 != null && (object = this.e) != null) {
                return new n(this.a, this.b, this.c, (F.e.d.a.b.d)object2, (List)object);
            }
            object2 = new StringBuilder();
            if (this.d == null) {
                ((StringBuilder)object2).append(" signal");
            }
            if (this.e == null) {
                ((StringBuilder)object2).append(" binaries");
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Missing required properties:");
            ((StringBuilder)object).append(object2);
            throw new IllegalStateException(((StringBuilder)object).toString());
        }

        @Override
        public F.e.d.a.b.b b(F.a a8) {
            this.c = a8;
            return this;
        }

        @Override
        public F.e.d.a.b.b c(List<F.e.d.a.b.a> list) {
            if (list != null) {
                this.e = list;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        @Override
        public F.e.d.a.b.b d(F.e.d.a.b.c c8) {
            this.b = c8;
            return this;
        }

        @Override
        public F.e.d.a.b.b e(F.e.d.a.b.d d8) {
            if (d8 != null) {
                this.d = d8;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        @Override
        public F.e.d.a.b.b f(List<F.e.d.a.b.e> list) {
            this.a = list;
            return this;
        }
    }
}

