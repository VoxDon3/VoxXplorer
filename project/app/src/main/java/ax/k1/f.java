/*
 * Decompiled with CFR 0.152.
 */
package ax.k1;

import ax.N1.e;
import ax.k1.a;
import ax.r7.F;
import ax.r7.z;
import java.util.ArrayList;

final class f
implements a {
    private final ArrayList<e> a = new ArrayList();

    private int f(long l8) {
        for (int i8 = 0; i8 < this.a.size(); ++i8) {
            if (l8 >= this.a.get((int)i8).b) continue;
            return i8;
        }
        return this.a.size();
    }

    @Override
    public long a(long l8) {
        if (this.a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (l8 < this.a.get((int)0).b) {
            return this.a.get((int)0).b;
        }
        for (int i8 = 1; i8 < this.a.size(); ++i8) {
            e e8 = this.a.get(i8);
            if (l8 >= e8.b) continue;
            long l9 = this.a.get((int)(i8 - 1)).d;
            if (l9 != -9223372036854775807L && l9 > l8 && l9 < e8.b) {
                return l9;
            }
            return e8.b;
        }
        long l10 = F.e(this.a).d;
        if (l10 != -9223372036854775807L && l8 < l10) {
            return l10;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public boolean b(e e8, long l8) {
        long l9;
        boolean bl = e8.b != -9223372036854775807L;
        ax.S0.a.a(bl);
        bl = e8.b <= l8 && ((l9 = e8.d) == -9223372036854775807L || l8 < l9);
        for (int i8 = this.a.size() - 1; i8 >= 0; --i8) {
            if (e8.b >= this.a.get((int)i8).b) {
                this.a.add(i8 + 1, e8);
                return bl;
            }
            if (this.a.get((int)i8).b > l8) continue;
            bl = false;
        }
        this.a.add(0, e8);
        return bl;
    }

    @Override
    public z<ax.R0.a> c(long l8) {
        int n8 = this.f(l8);
        if (n8 == 0) {
            return z.z();
        }
        e e8 = this.a.get(n8 - 1);
        long l9 = e8.d;
        if (l9 != -9223372036854775807L && l8 >= l9) {
            return z.z();
        }
        return e8.a;
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public long d(long l8) {
        if (!this.a.isEmpty() && l8 >= this.a.get((int)0).b) {
            long l9;
            for (int i8 = 1; i8 < this.a.size(); ++i8) {
                l9 = this.a.get((int)i8).b;
                long l10 = l8 - l9;
                long l11 = l10 == 0L ? 0 : (l10 < 0L ? -1 : 1);
                if (l11 == false) {
                    return l9;
                }
                if (l11 >= 0) continue;
                e e8 = this.a.get(i8 - 1);
                l9 = e8.d;
                if (l9 != -9223372036854775807L && l9 <= l8) {
                    return l9;
                }
                return e8.b;
            }
            e e9 = F.e(this.a);
            l9 = e9.d;
            if (l9 != -9223372036854775807L && l8 >= l9) {
                return l9;
            }
            return e9.b;
        }
        return -9223372036854775807L;
    }

    @Override
    public void e(long l8) {
        int n8;
        block5: {
            int n9;
            block4: {
                n9 = this.f(l8);
                if (n9 == 0) {
                    return;
                }
                long l9 = this.a.get((int)(n9 - 1)).d;
                if (l9 == -9223372036854775807L) break block4;
                n8 = n9;
                if (l9 < l8) break block5;
            }
            n8 = n9 - 1;
        }
        this.a.subList(0, n8).clear();
    }
}

