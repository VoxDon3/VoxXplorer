/*
 * Decompiled with CFR 0.152.
 */
package ax.o5;

import ax.o5.p;
import ax.o5.q;
import ax.o5.t;
import ax.o5.w;
import java.util.Arrays;

final class j
extends t {
    private final long a;
    private final Integer b;
    private final p c;
    private final long d;
    private final byte[] e;
    private final String f;
    private final long g;
    private final w h;
    private final q i;

    private j(long l8, Integer n8, p p8, long l9, byte[] byArray, String string, long l10, w w8, q q8) {
        this.a = l8;
        this.b = n8;
        this.c = p8;
        this.d = l9;
        this.e = byArray;
        this.f = string;
        this.g = l10;
        this.h = w8;
        this.i = q8;
    }

    @Override
    public p b() {
        return this.c;
    }

    @Override
    public Integer c() {
        return this.b;
    }

    @Override
    public long d() {
        return this.a;
    }

    @Override
    public long e() {
        return this.d;
    }

    public boolean equals(Object object) {
        byte[] byArray;
        t t8;
        if (object == this) {
            return true;
        }
        return object instanceof t && this.a == (t8 = (t)object).d() && ((object = this.b) == null ? t8.c() == null : ((Integer)object).equals(t8.c())) && ((object = this.c) == null ? t8.b() == null : object.equals(t8.b())) && this.d == t8.e() && Arrays.equals(byArray = this.e, (byte[])(object = t8 instanceof j ? (Object)((j)t8).e : (Object)t8.h())) && ((object = this.f) == null ? t8.i() == null : ((String)object).equals(t8.i())) && this.g == t8.j() && ((object = this.h) == null ? t8.g() == null : object.equals(t8.g())) && ((object = this.i) == null ? t8.f() == null : object.equals(t8.f()));
    }

    @Override
    public q f() {
        return this.i;
    }

    @Override
    public w g() {
        return this.h;
    }

    @Override
    public byte[] h() {
        return this.e;
    }

    public int hashCode() {
        long l8 = this.a;
        int n8 = (int)(l8 ^ l8 >>> 32);
        Object object = this.b;
        int n9 = 0;
        int n10 = object == null ? 0 : ((Integer)object).hashCode();
        object = this.c;
        int n11 = object == null ? 0 : object.hashCode();
        l8 = this.d;
        int n12 = (int)(l8 ^ l8 >>> 32);
        int n13 = Arrays.hashCode(this.e);
        object = this.f;
        int n14 = object == null ? 0 : ((String)object).hashCode();
        l8 = this.g;
        int n15 = (int)(l8 >>> 32 ^ l8);
        object = this.h;
        int n16 = object == null ? 0 : object.hashCode();
        object = this.i;
        if (object != null) {
            n9 = object.hashCode();
        }
        return ((((((((n8 ^ 0xF4243) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ n13) * 1000003 ^ n14) * 1000003 ^ n15) * 1000003 ^ n16) * 1000003 ^ n9;
    }

    @Override
    public String i() {
        return this.f;
    }

    @Override
    public long j() {
        return this.g;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LogEvent{eventTimeMs=");
        stringBuilder.append(this.a);
        stringBuilder.append(", eventCode=");
        stringBuilder.append(this.b);
        stringBuilder.append(", complianceData=");
        stringBuilder.append(this.c);
        stringBuilder.append(", eventUptimeMs=");
        stringBuilder.append(this.d);
        stringBuilder.append(", sourceExtension=");
        stringBuilder.append(Arrays.toString(this.e));
        stringBuilder.append(", sourceExtensionJsonProto3=");
        stringBuilder.append(this.f);
        stringBuilder.append(", timezoneOffsetSeconds=");
        stringBuilder.append(this.g);
        stringBuilder.append(", networkConnectionInfo=");
        stringBuilder.append(this.h);
        stringBuilder.append(", experimentIds=");
        stringBuilder.append(this.i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends t.a {
        private Long a;
        private Integer b;
        private p c;
        private Long d;
        private byte[] e;
        private String f;
        private Long g;
        private w h;
        private q i;

        b() {
        }

        @Override
        public t a() {
            Object object = this.a;
            Object object2 = "";
            if (object == null) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("");
                ((StringBuilder)object2).append(" eventTimeMs");
                object2 = ((StringBuilder)object2).toString();
            }
            object = object2;
            if (this.d == null) {
                object = new StringBuilder();
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append(" eventUptimeMs");
                object = ((StringBuilder)object).toString();
            }
            object2 = object;
            if (this.g == null) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(" timezoneOffsetSeconds");
                object2 = ((StringBuilder)object2).toString();
            }
            if (((String)object2).isEmpty()) {
                return new j(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Missing required properties:");
            ((StringBuilder)object).append((String)object2);
            throw new IllegalStateException(((StringBuilder)object).toString());
        }

        @Override
        public t.a b(p p8) {
            this.c = p8;
            return this;
        }

        @Override
        public t.a c(Integer n8) {
            this.b = n8;
            return this;
        }

        @Override
        public t.a d(long l8) {
            this.a = l8;
            return this;
        }

        @Override
        public t.a e(long l8) {
            this.d = l8;
            return this;
        }

        @Override
        public t.a f(q q8) {
            this.i = q8;
            return this;
        }

        @Override
        public t.a g(w w8) {
            this.h = w8;
            return this;
        }

        @Override
        t.a h(byte[] byArray) {
            this.e = byArray;
            return this;
        }

        @Override
        t.a i(String string) {
            this.f = string;
            return this;
        }

        @Override
        public t.a j(long l8) {
            this.g = l8;
            return this;
        }
    }
}

