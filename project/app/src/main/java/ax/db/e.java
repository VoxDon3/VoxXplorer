/*
 * Decompiled with CFR 0.152.
 */
package ax.db;

import ax.db.o;

final class e
extends o {
    private final o.b a;
    private final long b;
    private final long c;
    private final long d;

    private e(o.b b8, long l8, long l9, long l10) {
        this.a = b8;
        this.b = l8;
        this.c = l9;
        this.d = l10;
    }

    @Override
    public long b() {
        return this.d;
    }

    @Override
    public long c() {
        return this.b;
    }

    @Override
    public o.b d() {
        return this.a;
    }

    @Override
    public long e() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof o && ((Object)((Object)this.a)).equals((Object)((o)(object = (o)object)).d()) && this.b == ((o)object).c() && this.c == ((o)object).e() && this.d == ((o)object).b();
    }

    public int hashCode() {
        long l8 = (((Object)((Object)this.a)).hashCode() ^ 0xF4243) * 1000003;
        long l9 = this.b;
        l9 = (int)(l8 ^ (l9 ^ l9 >>> 32)) * 1000003;
        l8 = this.c;
        l8 = (int)(l9 ^ (l8 ^ l8 >>> 32)) * 1000003;
        l9 = this.d;
        return (int)(l8 ^ (l9 ^ l9 >>> 32));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MessageEvent{type=");
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
    extends o.a {
        private o.b a;
        private Long b;
        private Long c;
        private Long d;

        b() {
        }

        @Override
        public o a() {
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
                return new e(this.a, this.b, this.c, this.d);
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Missing required properties:");
            ((StringBuilder)object2).append((String)object);
            throw new IllegalStateException(((StringBuilder)object2).toString());
        }

        @Override
        public o.a b(long l8) {
            this.d = l8;
            return this;
        }

        @Override
        o.a c(long l8) {
            this.b = l8;
            return this;
        }

        @Override
        public o.a d(long l8) {
            this.c = l8;
            return this;
        }

        o.a e(o.b b8) {
            if (b8 != null) {
                this.a = b8;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }
}

