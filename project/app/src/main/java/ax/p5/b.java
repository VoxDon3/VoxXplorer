/*
 * Decompiled with CFR 0.152.
 */
package ax.p5;

import ax.p5.h;
import ax.p5.i;
import java.util.Arrays;
import java.util.Map;

final class b
extends i {
    private final String a;
    private final Integer b;
    private final h c;
    private final long d;
    private final long e;
    private final Map<String, String> f;
    private final Integer g;
    private final String h;
    private final byte[] i;
    private final byte[] j;

    private b(String string, Integer n8, h h8, long l8, long l9, Map<String, String> map, Integer n9, String string2, byte[] byArray, byte[] byArray2) {
        this.a = string;
        this.b = n8;
        this.c = h8;
        this.d = l8;
        this.e = l9;
        this.f = map;
        this.g = n9;
        this.h = string2;
        this.i = byArray;
        this.j = byArray2;
    }

    @Override
    protected Map<String, String> c() {
        return this.f;
    }

    @Override
    public Integer d() {
        return this.b;
    }

    @Override
    public h e() {
        return this.c;
    }

    public boolean equals(Object object) {
        boolean bl;
        byte[] byArray;
        i i8;
        if (object == this) {
            return true;
        }
        return object instanceof i && this.a.equals((i8 = (i)object).n()) && ((object = this.b) == null ? i8.d() == null : ((Integer)object).equals(i8.d())) && this.c.equals(i8.e()) && this.d == i8.f() && this.e == i8.o() && this.f.equals(i8.c()) && ((object = this.g) == null ? i8.l() == null : ((Integer)object).equals(i8.l())) && ((object = this.h) == null ? i8.m() == null : ((String)object).equals(i8.m())) && Arrays.equals(byArray = this.i, (byte[])(object = (bl = i8 instanceof b) ? (Object)((b)i8).i : (Object)i8.g())) && Arrays.equals(byArray = this.j, (byte[])(object = bl ? (Object)((b)i8).j : (Object)i8.h()));
    }

    @Override
    public long f() {
        return this.d;
    }

    @Override
    public byte[] g() {
        return this.i;
    }

    @Override
    public byte[] h() {
        return this.j;
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        Object object = this.b;
        int n9 = 0;
        int n10 = object == null ? 0 : ((Integer)object).hashCode();
        int n11 = this.c.hashCode();
        long l8 = this.d;
        int n12 = (int)(l8 ^ l8 >>> 32);
        l8 = this.e;
        int n13 = (int)(l8 ^ l8 >>> 32);
        int n14 = this.f.hashCode();
        object = this.g;
        int n15 = object == null ? 0 : ((Integer)object).hashCode();
        object = this.h;
        if (object != null) {
            n9 = ((String)object).hashCode();
        }
        return (((((((((n8 ^ 0xF4243) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ n13) * 1000003 ^ n14) * 1000003 ^ n15) * 1000003 ^ n9) * 1000003 ^ Arrays.hashCode(this.i)) * 1000003 ^ Arrays.hashCode(this.j);
    }

    @Override
    public Integer l() {
        return this.g;
    }

    @Override
    public String m() {
        return this.h;
    }

    @Override
    public String n() {
        return this.a;
    }

    @Override
    public long o() {
        return this.e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EventInternal{transportName=");
        stringBuilder.append(this.a);
        stringBuilder.append(", code=");
        stringBuilder.append(this.b);
        stringBuilder.append(", encodedPayload=");
        stringBuilder.append(this.c);
        stringBuilder.append(", eventMillis=");
        stringBuilder.append(this.d);
        stringBuilder.append(", uptimeMillis=");
        stringBuilder.append(this.e);
        stringBuilder.append(", autoMetadata=");
        stringBuilder.append(this.f);
        stringBuilder.append(", productId=");
        stringBuilder.append(this.g);
        stringBuilder.append(", pseudonymousId=");
        stringBuilder.append(this.h);
        stringBuilder.append(", experimentIdsClear=");
        stringBuilder.append(Arrays.toString(this.i));
        stringBuilder.append(", experimentIdsEncrypted=");
        stringBuilder.append(Arrays.toString(this.j));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends i.a {
        private String a;
        private Integer b;
        private h c;
        private Long d;
        private Long e;
        private Map<String, String> f;
        private Integer g;
        private String h;
        private byte[] i;
        private byte[] j;

        b() {
        }

        @Override
        public i d() {
            CharSequence charSequence = this.a;
            CharSequence charSequence2 = "";
            if (charSequence == null) {
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append("");
                ((StringBuilder)charSequence2).append(" transportName");
                charSequence2 = ((StringBuilder)charSequence2).toString();
            }
            charSequence = charSequence2;
            if (this.c == null) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)charSequence2);
                ((StringBuilder)charSequence).append(" encodedPayload");
                charSequence = ((StringBuilder)charSequence).toString();
            }
            charSequence2 = charSequence;
            if (this.d == null) {
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append((String)charSequence);
                ((StringBuilder)charSequence2).append(" eventMillis");
                charSequence2 = ((StringBuilder)charSequence2).toString();
            }
            charSequence = charSequence2;
            if (this.e == null) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)charSequence2);
                ((StringBuilder)charSequence).append(" uptimeMillis");
                charSequence = ((StringBuilder)charSequence).toString();
            }
            charSequence2 = charSequence;
            if (this.f == null) {
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append((String)charSequence);
                ((StringBuilder)charSequence2).append(" autoMetadata");
                charSequence2 = ((StringBuilder)charSequence2).toString();
            }
            if (((String)charSequence2).isEmpty()) {
                return new b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Missing required properties:");
            ((StringBuilder)charSequence).append((String)charSequence2);
            throw new IllegalStateException(((StringBuilder)charSequence).toString());
        }

        @Override
        protected Map<String, String> e() {
            Map<String, String> map = this.f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override
        protected i.a f(Map<String, String> map) {
            if (map != null) {
                this.f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        @Override
        public i.a g(Integer n8) {
            this.b = n8;
            return this;
        }

        @Override
        public i.a h(h h8) {
            if (h8 != null) {
                this.c = h8;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        @Override
        public i.a i(long l8) {
            this.d = l8;
            return this;
        }

        @Override
        public i.a j(byte[] byArray) {
            this.i = byArray;
            return this;
        }

        @Override
        public i.a k(byte[] byArray) {
            this.j = byArray;
            return this;
        }

        @Override
        public i.a l(Integer n8) {
            this.g = n8;
            return this;
        }

        @Override
        public i.a m(String string) {
            this.h = string;
            return this;
        }

        @Override
        public i.a n(String string) {
            if (string != null) {
                this.a = string;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        @Override
        public i.a o(long l8) {
            this.e = l8;
            return this;
        }
    }
}

