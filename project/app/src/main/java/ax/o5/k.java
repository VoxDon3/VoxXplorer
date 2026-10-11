/*
 * Decompiled with CFR 0.152.
 */
package ax.o5;

import ax.o5.o;
import ax.o5.t;
import ax.o5.u;
import ax.o5.x;
import java.util.List;

final class k
extends u {
    private final long a;
    private final long b;
    private final o c;
    private final Integer d;
    private final String e;
    private final List<t> f;
    private final x g;

    private k(long l8, long l9, o o8, Integer n8, String string, List<t> list, x x8) {
        this.a = l8;
        this.b = l9;
        this.c = o8;
        this.d = n8;
        this.e = string;
        this.f = list;
        this.g = x8;
    }

    @Override
    public o b() {
        return this.c;
    }

    @Override
    public List<t> c() {
        return this.f;
    }

    @Override
    public Integer d() {
        return this.d;
    }

    @Override
    public String e() {
        return this.e;
    }

    public boolean equals(Object object) {
        Object object2;
        if (object == this) {
            return true;
        }
        return object instanceof u && this.a == ((u)(object = (u)object)).g() && this.b == ((u)object).h() && ((object2 = this.c) == null ? ((u)object).b() == null : object2.equals(((u)object).b())) && ((object2 = this.d) == null ? ((u)object).d() == null : ((Integer)object2).equals(((u)object).d())) && ((object2 = this.e) == null ? ((u)object).e() == null : ((String)object2).equals(((u)object).e())) && ((object2 = this.f) == null ? ((u)object).c() == null : object2.equals(((u)object).c())) && ((object2 = this.g) == null ? ((u)object).f() == null : object2.equals((Object)((u)object).f()));
    }

    @Override
    public x f() {
        return this.g;
    }

    @Override
    public long g() {
        return this.a;
    }

    @Override
    public long h() {
        return this.b;
    }

    public int hashCode() {
        long l8 = this.a;
        int n8 = (int)(l8 ^ l8 >>> 32);
        l8 = this.b;
        int n9 = (int)(l8 ^ l8 >>> 32);
        Object object = this.c;
        int n10 = 0;
        int n11 = object == null ? 0 : ((Object)object).hashCode();
        object = this.d;
        int n12 = object == null ? 0 : ((Integer)object).hashCode();
        object = this.e;
        int n13 = object == null ? 0 : ((String)object).hashCode();
        object = this.f;
        int n14 = object == null ? 0 : object.hashCode();
        object = this.g;
        if (object != null) {
            n10 = ((Object)object).hashCode();
        }
        return ((((((n8 ^ 0xF4243) * 1000003 ^ n9) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ n13) * 1000003 ^ n14) * 1000003 ^ n10;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LogRequest{requestTimeMs=");
        stringBuilder.append(this.a);
        stringBuilder.append(", requestUptimeMs=");
        stringBuilder.append(this.b);
        stringBuilder.append(", clientInfo=");
        stringBuilder.append(this.c);
        stringBuilder.append(", logSource=");
        stringBuilder.append(this.d);
        stringBuilder.append(", logSourceName=");
        stringBuilder.append(this.e);
        stringBuilder.append(", logEvents=");
        stringBuilder.append(this.f);
        stringBuilder.append(", qosTier=");
        stringBuilder.append((Object)this.g);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends u.a {
        private Long a;
        private Long b;
        private o c;
        private Integer d;
        private String e;
        private List<t> f;
        private x g;

        b() {
        }

        @Override
        public u a() {
            Object object = this.a;
            CharSequence charSequence = "";
            if (object == null) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("");
                ((StringBuilder)charSequence).append(" requestTimeMs");
                charSequence = ((StringBuilder)charSequence).toString();
            }
            object = charSequence;
            if (this.b == null) {
                object = new StringBuilder();
                ((StringBuilder)object).append((String)charSequence);
                ((StringBuilder)object).append(" requestUptimeMs");
                object = ((StringBuilder)object).toString();
            }
            if (((String)object).isEmpty()) {
                return new k(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Missing required properties:");
            ((StringBuilder)charSequence).append((String)object);
            throw new IllegalStateException(((StringBuilder)charSequence).toString());
        }

        @Override
        public u.a b(o o8) {
            this.c = o8;
            return this;
        }

        @Override
        public u.a c(List<t> list) {
            this.f = list;
            return this;
        }

        @Override
        u.a d(Integer n8) {
            this.d = n8;
            return this;
        }

        @Override
        u.a e(String string) {
            this.e = string;
            return this;
        }

        @Override
        public u.a f(x x8) {
            this.g = x8;
            return this;
        }

        @Override
        public u.a g(long l8) {
            this.a = l8;
            return this;
        }

        @Override
        public u.a h(long l8) {
            this.b = l8;
            return this;
        }
    }
}

