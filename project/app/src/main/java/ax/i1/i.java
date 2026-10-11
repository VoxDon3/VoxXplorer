/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import androidx.media3.exoplayer.p0;
import ax.i1.f0;
import ax.r7.z;
import java.util.List;

public final class i
implements f0 {
    private long c0;
    private final z<a> q;

    public i(List<? extends f0> list, List<List<Integer>> list2) {
        z.a<a> a8 = z.r();
        int n8 = list.size();
        int n9 = list2.size();
        boolean bl = n8 == n9;
        ax.S0.a.a(bl);
        for (int i8 = 0; i8 < list.size(); ++i8) {
            a8.h(new a(list.get(i8), list2.get(i8)));
        }
        this.q = a8.k();
        this.c0 = -9223372036854775807L;
    }

    @Override
    public boolean a(p0 p02) {
        boolean bl;
        boolean bl2;
        boolean bl3 = false;
        do {
            long l8;
            if ((l8 = this.b()) == Long.MIN_VALUE) {
                return bl3;
            }
            bl2 = false;
            for (int i8 = 0; i8 < this.q.size(); ++i8) {
                boolean bl4;
                block7: {
                    block6: {
                        long l9 = ((a)this.q.get(i8)).b();
                        boolean bl5 = l9 != Long.MIN_VALUE && l9 <= p02.a;
                        if (l9 == l8) break block6;
                        bl4 = bl2;
                        if (!bl5) break block7;
                    }
                    bl4 = bl2 | ((a)this.q.get(i8)).a(p02);
                }
                bl2 = bl4;
            }
            bl3 = bl = bl3 | bl2;
        } while (bl2);
        return bl;
    }

    @Override
    public long b() {
        long l8 = Long.MAX_VALUE;
        for (int i8 = 0; i8 < this.q.size(); ++i8) {
            long l9 = ((a)this.q.get(i8)).b();
            long l10 = l8;
            if (l9 != Long.MIN_VALUE) {
                l10 = Math.min(l8, l9);
            }
            l8 = l10;
        }
        if (l8 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return l8;
    }

    @Override
    public boolean c() {
        for (int i8 = 0; i8 < this.q.size(); ++i8) {
            if (!((a)this.q.get(i8)).c()) continue;
            return true;
        }
        return false;
    }

    @Override
    public long d() {
        long l8;
        long l9 = Long.MAX_VALUE;
        long l10 = Long.MAX_VALUE;
        for (int i8 = 0; i8 < this.q.size(); ++i8) {
            long l11;
            block10: {
                block9: {
                    a a8 = (a)this.q.get(i8);
                    l11 = a8.d();
                    if (a8.f().contains(1) || a8.f().contains(2)) break block9;
                    l8 = l9;
                    if (!a8.f().contains(4)) break block10;
                }
                l8 = l9;
                if (l11 != Long.MIN_VALUE) {
                    l8 = Math.min(l9, l11);
                }
            }
            long l12 = l10;
            if (l11 != Long.MIN_VALUE) {
                l12 = Math.min(l10, l11);
            }
            l9 = l8;
            l10 = l12;
        }
        if (l9 != Long.MAX_VALUE) {
            this.c0 = l9;
            return l9;
        }
        if (l10 != Long.MAX_VALUE) {
            l8 = this.c0;
            if (l8 != -9223372036854775807L) {
                return l8;
            }
            return l10;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public void e(long l8) {
        for (int i8 = 0; i8 < this.q.size(); ++i8) {
            ((a)this.q.get(i8)).e(l8);
        }
    }

    private static final class a
    implements f0 {
        private final z<Integer> c0;
        private final f0 q;

        public a(f0 f02, List<Integer> list) {
            this.q = f02;
            this.c0 = z.u(list);
        }

        @Override
        public boolean a(p0 p02) {
            return this.q.a(p02);
        }

        @Override
        public long b() {
            return this.q.b();
        }

        @Override
        public boolean c() {
            return this.q.c();
        }

        @Override
        public long d() {
            return this.q.d();
        }

        @Override
        public void e(long l8) {
            this.q.e(l8);
        }

        public z<Integer> f() {
            return this.c0;
        }
    }
}

