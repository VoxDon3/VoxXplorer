/*
 * Decompiled with CFR 0.152.
 */
package ax.Ob;

import ax.Fb.p;
import ax.Gb.l;
import ax.Lb.f;
import ax.Ob.u;
import ax.sb.m;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class e
implements ax.Nb.e<ax.Lb.e> {
    private final CharSequence a;
    private final int b;
    private final int c;
    private final p<CharSequence, Integer, m<Integer, Integer>> d;

    public e(CharSequence charSequence, int n8, int n9, p<? super CharSequence, ? super Integer, m<Integer, Integer>> p8) {
        l.f(charSequence, "input");
        l.f(p8, "getNextMatch");
        this.a = charSequence;
        this.b = n8;
        this.c = n9;
        this.d = p8;
    }

    public static final /* synthetic */ p b(e e8) {
        return e8.d;
    }

    public static final /* synthetic */ int d(e e8) {
        return e8.c;
    }

    @Override
    public Iterator<ax.Lb.e> iterator() {
        return new Iterator<ax.Lb.e>(this){
            private int c0;
            private int d0;
            private ax.Lb.e e0;
            private int f0;
            final e g0;
            private int q;
            {
                int n8;
                this.g0 = e8;
                this.q = -1;
                this.c0 = n8 = f.f(e8.b, 0, e8.a.length());
                this.d0 = n8;
            }

            /*
             * Unable to fully structure code
             */
            private final void b() {
                block6: {
                    var2_1 = this.d0;
                    var1_2 = 0;
                    if (var2_1 < 0) {
                        this.q = 0;
                        this.e0 = null;
                        return;
                    }
                    if (e.d(this.g0) <= 0) break block6;
                    this.f0 = var2_1 = this.f0 + 1;
                    if (var2_1 >= e.d(this.g0)) ** GOTO lbl-1000
                }
                if (this.d0 > e.c(this.g0).length()) lbl-1000:
                // 2 sources

                {
                    this.e0 = new ax.Lb.e(this.c0, u.P(e.c(this.g0)));
                    this.d0 = -1;
                } else {
                    var4_3 = (m)e.b(this.g0).j(e.c(this.g0), this.d0);
                    if (var4_3 == null) {
                        this.e0 = new ax.Lb.e(this.c0, u.P(e.c(this.g0)));
                        this.d0 = -1;
                    } else {
                        var3_4 = ((Number)var4_3.a()).intValue();
                        var2_1 = ((Number)var4_3.b()).intValue();
                        this.e0 = f.l(this.c0, var3_4);
                        this.c0 = var3_4 += var2_1;
                        if (var2_1 == 0) {
                            var1_2 = 1;
                        }
                        this.d0 = var3_4 + var1_2;
                    }
                }
                this.q = 1;
            }

            public ax.Lb.e c() {
                if (this.q == -1) {
                    this.b();
                }
                if (this.q != 0) {
                    ax.Lb.e e8 = this.e0;
                    l.d(e8, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                    this.e0 = null;
                    this.q = -1;
                    return e8;
                }
                throw new NoSuchElementException();
            }

            @Override
            public boolean hasNext() {
                if (this.q == -1) {
                    this.b();
                }
                return this.q == 1;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}

