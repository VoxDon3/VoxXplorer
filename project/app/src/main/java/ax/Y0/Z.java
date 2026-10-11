/*
 * Decompiled with CFR 0.152.
 */
package ax.Y0;

import ax.S0.a;
import ax.S0.d0;

public final class Z {
    public static final Z c;
    public static final Z d;
    public static final Z e;
    public static final Z f;
    public static final Z g;
    public final long a;
    public final long b;

    static {
        Z z8;
        c = z8 = new Z(0L, 0L);
        d = new Z(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new Z(Long.MAX_VALUE, 0L);
        f = new Z(0L, Long.MAX_VALUE);
        g = z8;
    }

    public Z(long l8, long l9) {
        boolean bl = false;
        boolean bl2 = l8 >= 0L;
        ax.S0.a.a(bl2);
        bl2 = bl;
        if (l9 >= 0L) {
            bl2 = true;
        }
        ax.S0.a.a(bl2);
        this.a = l8;
        this.b = l9;
    }

    public long a(long l8, long l9, long l10) {
        long l11;
        block13: {
            block10: {
                boolean bl;
                block12: {
                    block11: {
                        boolean bl2;
                        block9: {
                            long l12 = this.a;
                            if (l12 == 0L && this.b == 0L) {
                                return l8;
                            }
                            l11 = d0.A1(l8, l12, Long.MIN_VALUE);
                            l12 = d0.c(l8, this.b, Long.MAX_VALUE);
                            boolean bl3 = false;
                            bl2 = l11 <= l9 && l9 <= l12;
                            bl = bl3;
                            if (l11 <= l10) {
                                bl = bl3;
                                if (l10 <= l12) {
                                    bl = true;
                                }
                            }
                            if (!bl2 || !bl) break block9;
                            if (Math.abs(l9 - l8) > Math.abs(l10 - l8)) break block10;
                            break block11;
                        }
                        if (!bl2) break block12;
                    }
                    return l9;
                }
                if (!bl) break block13;
            }
            return l10;
        }
        return l11;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && Z.class == object.getClass()) {
            object = (Z)object;
            if (this.a == ((Z)object).a && this.b == ((Z)object).b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (int)this.a * 31 + (int)this.b;
    }
}

