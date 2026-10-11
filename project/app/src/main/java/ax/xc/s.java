/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Gb.g;
import ax.Gb.l;
import ax.tb.c;
import ax.tb.i;
import ax.tb.o;
import ax.xc.C;
import ax.xc.e;
import ax.xc.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

public final class s
extends c<h>
implements RandomAccess {
    public static final a e0 = new a(null);
    private final h[] c0;
    private final int[] d0;

    private s(h[] hArray, int[] nArray) {
        this.c0 = hArray;
        this.d0 = nArray;
    }

    public /* synthetic */ s(h[] hArray, int[] nArray, g g8) {
        this(hArray, nArray);
    }

    @Override
    public int g() {
        return this.c0.length;
    }

    public h l(int n8) {
        return this.c0[n8];
    }

    public final h[] n() {
        return this.c0;
    }

    public final int[] p() {
        return this.d0;
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        private final void a(long l8, e e8, int n8, List<? extends h> list, int n9, int n10, List<Integer> list2) {
            int n11 = n8;
            if (n9 < n10) {
                int n12;
                for (n8 = n9; n8 < n10; ++n8) {
                    if (list.get(n8).G() >= n11) {
                        continue;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                Object object = list.get(n9);
                h h8 = list.get(n10 - 1);
                if (n11 == ((h)object).G()) {
                    n12 = ((Number)list2.get(n9)).intValue();
                    n8 = n9 + 1;
                    object = list.get(n8);
                    n9 = n12;
                } else {
                    n8 = n9;
                    n9 = -1;
                }
                if (((h)object).n(n11) != h8.n(n11)) {
                    byte by;
                    byte by2 = 1;
                    for (n12 = n8 + 1; n12 < n10; ++n12) {
                        by = by2;
                        if (list.get(n12 - 1).n(n11) != list.get(n12).n(n11)) {
                            by = by2 + 1;
                        }
                        by2 = by;
                    }
                    l8 = l8 + this.c(e8) + (long)2 + (long)(by2 * 2);
                    e8.m1(by2);
                    e8.m1(n9);
                    for (n9 = n8; n9 < n10; ++n9) {
                        n12 = list.get(n9).n(n11);
                        if (n9 != n8 && n12 == list.get(n9 - 1).n(n11)) continue;
                        e8.m1(n12 & 0xFF);
                    }
                    object = new e();
                    n9 = n8;
                    while (n9 < n10) {
                        block18: {
                            by = list.get(n9).n(n11);
                            for (n8 = n12 = n9 + 1; n8 < n10; ++n8) {
                                if (by == list.get(n8).n(n11)) {
                                    continue;
                                }
                                break block18;
                            }
                            n8 = n10;
                        }
                        if (n12 == n8 && n11 + 1 == list.get(n9).G()) {
                            e8.m1(((Number)list2.get(n9)).intValue());
                        } else {
                            e8.m1((int)(this.c((e)object) + l8) * -1);
                            this.a(l8, (e)object, n11 + 1, list, n9, n8, list2);
                        }
                        n9 = n8;
                    }
                    e8.M((C)object);
                    return;
                }
                int n13 = Math.min(((h)object).G(), h8.G());
                int n14 = 0;
                for (n12 = n11; n12 < n13 && ((h)object).n(n12) == h8.n(n12); ++n12) {
                    ++n14;
                }
                l8 = l8 + this.c(e8) + (long)2 + (long)n14 + 1L;
                e8.m1(-n14);
                e8.m1(n9);
                n9 = n11 + n14;
                while (n11 < n9) {
                    e8.m1(((h)object).n(n11) & 0xFF);
                    ++n11;
                }
                if (n8 + 1 == n10) {
                    if (n9 == list.get(n8).G()) {
                        e8.m1(((Number)list2.get(n8)).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.");
                }
                object = new e();
                e8.m1((int)(this.c((e)object) + l8) * -1);
                this.a(l8, (e)object, n9, list, n8, n10, list2);
                e8.M((C)object);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        static /* synthetic */ void b(a a8, long l8, e e8, int n8, List list, int n9, int n10, List list2, int n11, Object object) {
            if ((n11 & 1) != 0) {
                l8 = 0L;
            }
            if ((n11 & 4) != 0) {
                n8 = 0;
            }
            if ((n11 & 0x10) != 0) {
                n9 = 0;
            }
            if ((n11 & 0x20) != 0) {
                n10 = list.size();
            }
            a8.a(l8, e8, n8, list, n9, n10, list2);
        }

        private final long c(e e8) {
            return e8.size() / (long)4;
        }

        public final s d(h ... object) {
            Object object2;
            l.f(object, "byteStrings");
            int n8 = ((h[])object).length;
            int n9 = 0;
            if (n8 == 0) {
                return new s(new h[0], new int[]{0, -1}, null);
            }
            Object object3 = i.F(object);
            o.t(object3);
            Object object4 = new ArrayList(((h[])object).length);
            int n10 = ((h[])object).length;
            for (n8 = 0; n8 < n10; ++n8) {
                object2 = object[n8];
                object4.add(-1);
            }
            object4 = object4.toArray(new Integer[0]);
            object4 = o.n(Arrays.copyOf(object4, ((Integer[])object4).length));
            int n11 = ((h[])object).length;
            n10 = 0;
            n8 = 0;
            while (n10 < n11) {
                object4.set(o.i(object3, object[n10], 0, 0, 6, null), n8);
                ++n10;
                ++n8;
            }
            if (object3.get(0).G() > 0) {
                n10 = 0;
                while (n10 < object3.size()) {
                    h h8 = object3.get(n10);
                    n11 = n8 = n10 + 1;
                    while (n11 < object3.size() && ((h)(object2 = object3.get(n11))).H(h8)) {
                        if (((h)object2).G() != h8.G()) {
                            if (((Number)object4.get(n11)).intValue() > ((Number)object4.get(n10)).intValue()) {
                                object3.remove(n11);
                                object4.remove(n11);
                                continue;
                            }
                            ++n11;
                            continue;
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append("duplicate option: ");
                        ((StringBuilder)object).append(object2);
                        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
                    }
                    n10 = n8;
                }
                object2 = new e();
                a.b(this, 0L, (e)object2, 0, object3, 0, 0, (List)object4, 53, null);
                object3 = new int[(int)this.c((e)object2)];
                n8 = n9;
                while (!((e)object2).P()) {
                    object3[n8] = ((e)object2).readInt();
                    ++n8;
                }
                object = Arrays.copyOf(object, ((h[])object).length);
                l.e(object, "copyOf(this, size)");
                return new s((h[])object, (int[])object3, null);
            }
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
    }
}

