/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import ax.S0.a;

public final class p0 {
    public final long a;
    public final float b;
    public final long c;

    private p0(b b8) {
        this.a = b8.a;
        this.b = b8.b;
        this.c = b8.c;
    }

    public b a() {
        return new b(this);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof p0)) {
            return false;
        }
        object = (p0)object;
        return this.a == ((p0)object).a && this.b == ((p0)object).b && this.c == ((p0)object).c;
    }

    public int hashCode() {
        return j.Objects.hash((Object[])new Object[]{this.a, Float.valueOf(this.b), this.c});
    }

    public static final class b {
        private long a;
        private float b;
        private long c;

        public b() {
            this.a = -9223372036854775807L;
            this.b = -3.4028235E38f;
            this.c = -9223372036854775807L;
        }

        private b(p0 p02) {
            this.a = p02.a;
            this.b = p02.b;
            this.c = p02.c;
        }

        public p0 d() {
            return new p0(this);
        }

        public b e(long l8) {
            boolean bl = l8 >= 0L || l8 == -9223372036854775807L;
            ax.S0.a.a(bl);
            this.c = l8;
            return this;
        }

        public b f(long l8) {
            this.a = l8;
            return this;
        }

        public b g(float f8) {
            boolean bl = f8 > 0.0f || f8 == -3.4028235E38f;
            ax.S0.a.a(bl);
            this.b = f8;
            return this;
        }
    }
}

