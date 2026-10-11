/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import ax.S0.a;
import ax.i1.F;

final class r0 {
    public final F.b a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    r0(F.b b8, long l8, long l9, long l10, long l11, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        boolean bl6 = true;
        boolean bl7 = !bl5 || bl3;
        ax.S0.a.a(bl7);
        bl7 = !bl4 || bl3;
        ax.S0.a.a(bl7);
        bl7 = bl6;
        if (bl2) {
            bl7 = !bl3 && !bl4 && !bl5 ? bl6 : false;
        }
        ax.S0.a.a(bl7);
        this.a = b8;
        this.b = l8;
        this.c = l9;
        this.d = l10;
        this.e = l11;
        this.f = bl;
        this.g = bl2;
        this.h = bl3;
        this.i = bl4;
        this.j = bl5;
    }

    public r0 a(long l8) {
        if (l8 == this.c) {
            return this;
        }
        return new r0(this.a, this.b, l8, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public r0 b(long l8) {
        if (l8 == this.b) {
            return this;
        }
        return new r0(this.a, l8, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && r0.class == object.getClass()) {
            object = (r0)object;
            if (this.b == ((r0)object).b && this.c == ((r0)object).c && this.d == ((r0)object).d && this.e == ((r0)object).e && this.f == ((r0)object).f && this.g == ((r0)object).g && this.h == ((r0)object).h && this.i == ((r0)object).i && this.j == ((r0)object).j && j.Objects.equals((Object)this.a, (Object)((r0)object).a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((527 + this.a.hashCode()) * 31 + (int)this.b) * 31 + (int)this.c) * 31 + (int)this.d) * 31 + (int)this.e) * 31 + this.f) * 31 + this.g) * 31 + this.h) * 31 + this.i) * 31 + this.j;
    }
}

