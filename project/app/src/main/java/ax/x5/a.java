/*
 * Decompiled with CFR 0.152.
 */
package ax.x5;

import ax.x5.e;

final class a
extends e {
    private final long b;
    private final int c;
    private final int d;
    private final long e;
    private final int f;

    private a(long l8, int n8, int n9, long l9, int n10) {
        this.b = l8;
        this.c = n8;
        this.d = n9;
        this.e = l9;
        this.f = n10;
    }

    @Override
    int b() {
        return this.d;
    }

    @Override
    long c() {
        return this.e;
    }

    @Override
    int d() {
        return this.c;
    }

    @Override
    int e() {
        return this.f;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof e && this.b == ((e)(object = (e)object)).f() && this.c == ((e)object).d() && this.d == ((e)object).b() && this.e == ((e)object).c() && this.f == ((e)object).e();
    }

    @Override
    long f() {
        return this.b;
    }

    public int hashCode() {
        long l8 = this.b;
        int n8 = (int)(l8 ^ l8 >>> 32);
        int n9 = this.c;
        int n10 = this.d;
        l8 = this.e;
        int n11 = (int)(l8 ^ l8 >>> 32);
        return this.f ^ ((((n8 ^ 0xF4243) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EventStoreConfig{maxStorageSizeInBytes=");
        stringBuilder.append(this.b);
        stringBuilder.append(", loadBatchSize=");
        stringBuilder.append(this.c);
        stringBuilder.append(", criticalSectionEnterTimeoutMs=");
        stringBuilder.append(this.d);
        stringBuilder.append(", eventCleanUpAge=");
        stringBuilder.append(this.e);
        stringBuilder.append(", maxBlobByteSizePerRow=");
        stringBuilder.append(this.f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends e.a {
        private Long a;
        private Integer b;
        private Integer c;
        private Long d;
        private Integer e;

        b() {
        }

        @Override
        e a() {
            Object object = this.a;
            Object object2 = "";
            if (object == null) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("");
                ((StringBuilder)object2).append(" maxStorageSizeInBytes");
                object2 = ((StringBuilder)object2).toString();
            }
            object = object2;
            if (this.b == null) {
                object = new StringBuilder();
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append(" loadBatchSize");
                object = ((StringBuilder)object).toString();
            }
            object2 = object;
            if (this.c == null) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(" criticalSectionEnterTimeoutMs");
                object2 = ((StringBuilder)object2).toString();
            }
            object = object2;
            if (this.d == null) {
                object = new StringBuilder();
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append(" eventCleanUpAge");
                object = ((StringBuilder)object).toString();
            }
            object2 = object;
            if (this.e == null) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(" maxBlobByteSizePerRow");
                object2 = ((StringBuilder)object2).toString();
            }
            if (((String)object2).isEmpty()) {
                return new a(this.a, this.b, this.c, this.d, this.e);
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Missing required properties:");
            ((StringBuilder)object).append((String)object2);
            throw new IllegalStateException(((StringBuilder)object).toString());
        }

        @Override
        e.a b(int n8) {
            this.c = n8;
            return this;
        }

        @Override
        e.a c(long l8) {
            this.d = l8;
            return this;
        }

        @Override
        e.a d(int n8) {
            this.b = n8;
            return this;
        }

        @Override
        e.a e(int n8) {
            this.e = n8;
            return this;
        }

        @Override
        e.a f(long l8) {
            this.a = l8;
            return this;
        }
    }
}

