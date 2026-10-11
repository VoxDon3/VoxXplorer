/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;
import java.util.List;

final class m
extends F.e.d.a {
    private final F.e.d.a.b a;
    private final List<F.c> b;
    private final List<F.c> c;
    private final Boolean d;
    private final F.e.d.a.c e;
    private final List<F.e.d.a.c> f;
    private final int g;

    private m(F.e.d.a.b b8, List<F.c> list, List<F.c> list2, Boolean bl, F.e.d.a.c c8, List<F.e.d.a.c> list3, int n8) {
        this.a = b8;
        this.b = list;
        this.c = list2;
        this.d = bl;
        this.e = c8;
        this.f = list3;
        this.g = n8;
    }

    @Override
    public List<F.e.d.a.c> b() {
        return this.f;
    }

    @Override
    public Boolean c() {
        return this.d;
    }

    @Override
    public F.e.d.a.c d() {
        return this.e;
    }

    @Override
    public List<F.c> e() {
        return this.b;
    }

    public boolean equals(Object object) {
        List<F.e.d.a.c> list;
        if (object == this) {
            return true;
        }
        return object instanceof F.e.d.a && this.a.equals(((F.e.d.a)(object = (F.e.d.a)object)).f()) && ((list = this.b) == null ? ((F.e.d.a)object).e() == null : list.equals(((F.e.d.a)object).e())) && ((list = this.c) == null ? ((F.e.d.a)object).g() == null : list.equals(((F.e.d.a)object).g())) && ((list = this.d) == null ? ((F.e.d.a)object).c() == null : ((Boolean)((Object)list)).equals(((F.e.d.a)object).c())) && ((list = this.e) == null ? ((F.e.d.a)object).d() == null : ((Object)list).equals(((F.e.d.a)object).d())) && ((list = this.f) == null ? ((F.e.d.a)object).b() == null : list.equals(((F.e.d.a)object).b())) && this.g == ((F.e.d.a)object).h();
    }

    @Override
    public F.e.d.a.b f() {
        return this.a;
    }

    @Override
    public List<F.c> g() {
        return this.c;
    }

    @Override
    public int h() {
        return this.g;
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        List<F.e.d.a.c> list = this.b;
        int n9 = 0;
        int n10 = list == null ? 0 : list.hashCode();
        list = this.c;
        int n11 = list == null ? 0 : list.hashCode();
        list = this.d;
        int n12 = list == null ? 0 : ((Boolean)((Object)list)).hashCode();
        list = this.e;
        int n13 = list == null ? 0 : ((Object)list).hashCode();
        list = this.f;
        if (list != null) {
            n9 = list.hashCode();
        }
        return ((((((n8 ^ 0xF4243) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ n13) * 1000003 ^ n9) * 1000003 ^ this.g;
    }

    @Override
    public F.e.d.a.a i() {
        return new b(this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Application{execution=");
        stringBuilder.append(this.a);
        stringBuilder.append(", customAttributes=");
        stringBuilder.append(this.b);
        stringBuilder.append(", internalKeys=");
        stringBuilder.append(this.c);
        stringBuilder.append(", background=");
        stringBuilder.append(this.d);
        stringBuilder.append(", currentProcessDetails=");
        stringBuilder.append(this.e);
        stringBuilder.append(", appProcessDetails=");
        stringBuilder.append(this.f);
        stringBuilder.append(", uiOrientation=");
        stringBuilder.append(this.g);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends F.e.d.a.a {
        private F.e.d.a.b a;
        private List<F.c> b;
        private List<F.c> c;
        private Boolean d;
        private F.e.d.a.c e;
        private List<F.e.d.a.c> f;
        private int g;
        private byte h;

        b() {
        }

        private b(F.e.d.a a8) {
            this.a = a8.f();
            this.b = a8.e();
            this.c = a8.g();
            this.d = a8.c();
            this.e = a8.d();
            this.f = a8.b();
            this.g = a8.h();
            this.h = 1;
        }

        @Override
        public F.e.d.a a() {
            Object object;
            if (this.h == 1 && (object = this.a) != null) {
                return new m((F.e.d.a.b)object, this.b, this.c, this.d, this.e, this.f, this.g);
            }
            object = new StringBuilder();
            if (this.a == null) {
                ((StringBuilder)object).append(" execution");
            }
            if ((1 & this.h) == 0) {
                ((StringBuilder)object).append(" uiOrientation");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Missing required properties:");
            stringBuilder.append(object);
            throw new IllegalStateException(stringBuilder.toString());
        }

        @Override
        public F.e.d.a.a b(List<F.e.d.a.c> list) {
            this.f = list;
            return this;
        }

        @Override
        public F.e.d.a.a c(Boolean bl) {
            this.d = bl;
            return this;
        }

        @Override
        public F.e.d.a.a d(F.e.d.a.c c8) {
            this.e = c8;
            return this;
        }

        @Override
        public F.e.d.a.a e(List<F.c> list) {
            this.b = list;
            return this;
        }

        @Override
        public F.e.d.a.a f(F.e.d.a.b b8) {
            if (b8 != null) {
                this.a = b8;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        @Override
        public F.e.d.a.a g(List<F.c> list) {
            this.c = list;
            return this;
        }

        @Override
        public F.e.d.a.a h(int n8) {
            this.g = n8;
            this.h = (byte)(this.h | 1);
            return this;
        }
    }
}

