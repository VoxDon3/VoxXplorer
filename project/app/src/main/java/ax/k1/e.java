/*
 * Decompiled with CFR 0.152.
 */
package ax.k1;

import ax.k1.a;
import ax.k1.c;
import ax.k1.d;
import ax.r7.T;
import ax.r7.z;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

final class e
implements a {
    private static final T<ax.N1.e> b = T.d().f(new c()).a(T.d().g().f(new d()));
    private final List<ax.N1.e> a = new ArrayList<ax.N1.e>();

    public static /* synthetic */ Long f(ax.N1.e e8) {
        return e8.c;
    }

    public static /* synthetic */ Long g(ax.N1.e e8) {
        return e8.b;
    }

    @Override
    public long a(long l8) {
        long l9;
        int n8 = 0;
        long l10 = -9223372036854775807L;
        while (true) {
            l9 = l10;
            if (n8 >= this.a.size()) break;
            l9 = this.a.get((int)n8).b;
            long l11 = this.a.get((int)n8).d;
            if (l8 < l9) {
                if (l10 == -9223372036854775807L) break;
                l9 = Math.min(l10, l9);
                break;
            }
            l9 = l10;
            if (l8 < l11) {
                l9 = l10 == -9223372036854775807L ? l11 : Math.min(l10, l11);
            }
            ++n8;
            l10 = l9;
        }
        if (l9 != -9223372036854775807L) {
            return l9;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public boolean b(ax.N1.e e8, long l8) {
        boolean bl = e8.b != -9223372036854775807L;
        ax.S0.a.a(bl);
        bl = e8.c != -9223372036854775807L;
        ax.S0.a.a(bl);
        bl = e8.b <= l8 && l8 < e8.d;
        for (int i8 = this.a.size() - 1; i8 >= 0; --i8) {
            if (e8.b < this.a.get((int)i8).b) continue;
            this.a.add(i8 + 1, e8);
            return bl;
        }
        this.a.add(0, e8);
        return bl;
    }

    @Override
    public z<ax.R0.a> c(long l8) {
        if (!this.a.isEmpty()) {
            Object object = this.a;
            int n8 = 0;
            if (l8 >= object.get((int)0).b) {
                Object object2;
                int n9;
                object = new ArrayList<ax.N1.e>();
                for (n9 = 0; n9 < this.a.size(); ++n9) {
                    object2 = this.a.get(n9);
                    if (l8 >= ((ax.N1.e)object2).b && l8 < ((ax.N1.e)object2).d) {
                        object.add(object2);
                    }
                    if (l8 < ((ax.N1.e)object2).b) break;
                }
                object2 = z.J(b, object);
                object = z.r();
                for (n9 = n8; n9 < ((AbstractCollection)object2).size(); ++n9) {
                    ((z.a)object).j(((ax.N1.e)object2.get((int)n9)).a);
                }
                return ((z.a)object).k();
            }
        }
        return z.z();
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public long d(long l8) {
        if (!this.a.isEmpty()) {
            List<ax.N1.e> list = this.a;
            if (l8 >= list.get((int)0).b) {
                long l9 = this.a.get((int)0).b;
                for (int i8 = 0; i8 < this.a.size(); ++i8) {
                    long l10 = this.a.get((int)i8).b;
                    long l11 = this.a.get((int)i8).d;
                    if (l11 <= l8) {
                        l9 = Math.max(l9, l11);
                        continue;
                    }
                    if (l10 > l8) break;
                    l9 = Math.max(l9, l10);
                }
                return l9;
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public void e(long l8) {
        for (int i8 = 0; i8 < this.a.size(); ++i8) {
            long l9 = l8 - this.a.get((int)i8).b;
            long l10 = l9 == 0L ? 0 : (l9 < 0L ? -1 : 1);
            if (l10 > 0 && l8 > this.a.get((int)i8).d) {
                this.a.remove(i8);
                --i8;
                continue;
            }
            if (l10 < 0) break;
        }
    }
}

