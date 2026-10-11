/*
 * Decompiled with CFR 0.152.
 */
package ax.R8;

import ax.L8.d;
import ax.Q8.g;
import ax.Q8.i;
import ax.Q8.m;
import ax.Q8.q;
import ax.Y8.c;
import ax.h9.b;
import java.util.Set;

public class p
extends q {
    private final i e;
    private final a f;
    private final ax.L8.b g;
    private final d h;
    private final byte[] i;
    private final Set<Object> j;

    public p(g g8, long l8, long l9, i i8, a a8, ax.L8.b b8, d d8, byte[] byArray, Set<Object> set) {
        super(41, g8, m.s0, l8, l9);
        this.f = a8;
        this.g = b8;
        this.h = d8;
        this.i = byArray;
        this.j = set;
        this.e = i8;
    }

    @Override
    protected void m(b object) {
        int n8;
        block7: {
            block3: {
                block8: {
                    block4: {
                        block5: {
                            block6: {
                                ((ax.Z8.a)object).s(this.c);
                                ((ax.Z8.a)object).j((byte)this.f.getValue());
                                int n9 = this.f.ordinal();
                                n8 = 104;
                                if (n9 == 0) break block3;
                                if (n9 == 1) break block4;
                                if (n9 == 2) break block5;
                                if (n9 != 3) break block6;
                                ((ax.Z8.a)object).j((byte)0);
                                ((ax.Z8.a)object).u(65536L);
                                ((ax.Z8.a)object).s(0);
                                ((b)object).X();
                                ((ax.Z8.a)object).u(this.i.length);
                                ((ax.Z8.a)object).u(0L);
                                ((ax.Z8.a)object).u(0L);
                                this.e.b((b)object);
                                break block7;
                            }
                            object = new StringBuilder();
                            ((StringBuilder)object).append("Unknown SMB2QueryInfoType: ");
                            ((StringBuilder)object).append(this.f);
                            throw new IllegalStateException(((StringBuilder)object).toString());
                        }
                        ((ax.Z8.a)object).j((byte)0);
                        ((ax.Z8.a)object).u(65536L);
                        ((ax.Z8.a)object).s(0);
                        ((b)object).X();
                        ((ax.Z8.a)object).u(0L);
                        ((ax.Z8.a)object).u(c.a.e(this.j));
                        ((ax.Z8.a)object).u(0L);
                        this.e.b((b)object);
                        break block8;
                    }
                    ((ax.Z8.a)object).j((byte)this.h.getValue());
                    ((ax.Z8.a)object).u(65536L);
                    ((ax.Z8.a)object).s(0);
                    ((b)object).X();
                    ((ax.Z8.a)object).u(0L);
                    ((ax.Z8.a)object).u(0L);
                    ((ax.Z8.a)object).u(0L);
                    this.e.b((b)object);
                }
                n8 = 0;
                break block7;
            }
            ((ax.Z8.a)object).j((byte)this.g.getValue());
            ((ax.Z8.a)object).u(65536L);
            if (this.g == ax.L8.b.q0) {
                ((ax.Z8.a)object).s(0);
                ((b)object).X();
                ((ax.Z8.a)object).u(this.i.length);
            } else {
                ((ax.Z8.a)object).s(0);
                ((b)object).X();
                ((ax.Z8.a)object).u(0L);
                n8 = 0;
            }
            ((ax.Z8.a)object).u(0L);
            ((ax.Z8.a)object).u(0L);
            this.e.b((b)object);
        }
        if (n8 > 0) {
            ((ax.Z8.a)object).o(this.i);
        }
    }

    public static final class a
    extends Enum<a>
    implements c<a> {
        public static final /* enum */ a c0 = new a(1L);
        public static final /* enum */ a d0 = new a(2L);
        public static final /* enum */ a e0 = new a(3L);
        public static final /* enum */ a f0 = new a(4L);
        private static final a[] g0 = ax.R8.p$a.d();
        private long q;

        private a(long l8) {
            this.q = l8;
        }

        private static /* synthetic */ a[] d() {
            return new a[]{c0, d0, e0, f0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])g0.clone();
        }

        @Override
        public long getValue() {
            return this.q;
        }
    }
}

