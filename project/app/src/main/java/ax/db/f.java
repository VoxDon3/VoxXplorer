/*
 * Decompiled with CFR 0.152.
 */
package ax.db;

import ax.db.p;

@Deprecated
final class f
extends p {
    private final p.b a;
    private final long b;
    private final long c;
    private final long d;

    private f(ax.ab.b b8, p.b b9, long l8, long l9, long l10) {
        this.a = b9;
        this.b = l8;
        this.c = l9;
        this.d = l10;
    }

    @Override
    public long b() {
        return this.d;
    }

    @Override
    public ax.ab.b c() {
        return null;
    }

    @Override
    public long d() {
        return this.b;
    }

    @Override
    public p.b e() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof p) {
            object = (p)object;
            ((p)object).c();
            if (((Object)((Object)this.a)).equals((Object)((p)object).e()) && this.b == ((p)object).d() && this.c == ((p)object).f() && this.d == ((p)object).b()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public long f() {
        return this.c;
    }

    public int hashCode() {
        long l8 = (1000003 * 1000003 ^ ((Object)((Object)this.a)).hashCode()) * 1000003;
        long l9 = this.b;
        l8 = (int)(l8 ^ (l9 ^ l9 >>> 32)) * 1000003;
        l9 = this.c;
        l8 = (int)(l8 ^ (l9 ^ l9 >>> 32)) * 1000003;
        l9 = this.d;
        return (int)(l8 ^ (l9 ^ l9 >>> 32));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NetworkEvent{kernelTimestamp=");
        stringBuilder.append((Object)null);
        stringBuilder.append(", type=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", messageId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", uncompressedMessageSize=");
        stringBuilder.append(this.c);
        stringBuilder.append(", compressedMessageSize=");
        stringBuilder.append(this.d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends p.a {
        private p.b a;
        private Long b;
        private Long c;
        private Long d;

        b() {
        }

        @Override
        public p a() {
            Object object = this.a;
            Object object2 = "";
            if (object == null) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("");
                ((StringBuilder)object2).append(" type");
                object2 = ((StringBuilder)object2).toString();
            }
            object = object2;
            if (this.b == null) {
                object = new StringBuilder();
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append(" messageId");
                object = ((StringBuilder)object).toString();
            }
            object2 = object;
            if (this.c == null) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(" uncompressedMessageSize");
                object2 = ((StringBuilder)object2).toString();
            }
            object = object2;
            if (this.d == null) {
                object = new StringBuilder();
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append(" compressedMessageSize");
                object = ((StringBuilder)object).toString();
            }
            if (((String)object).isEmpty()) {
                return new f(null, this.a, this.b, this.c, this.d);
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Missing required properties:");
            ((StringBuilder)object2).append((String)object);
            throw new IllegalStateException(((StringBuilder)object2).toString());
        }

        @Override
        public p.a b(long l8) {
            this.d = l8;
            return this;
        }

        @Override
        p.a c(long l8) {
            this.b = l8;
            return this;
        }

        @Override
        public p.a d(long l8) {
            this.c = l8;
            return this;
        }

        p.a e(p.b b8) {
            if (b8 != null) {
                this.a = b8;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }
}

