/*
 * Decompiled with CFR 0.152.
 */
package ax.p0;

import ax.p0.e;
import ax.p0.g;
import ax.r0.T;
import ax.r0.a0;
import ax.r0.y;

public final class h
extends y<h, a>
implements T {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile a0<h> PARSER;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        h h8;
        DEFAULT_INSTANCE = h8 = new h();
        y.H(h.class, h8);
    }

    private h() {
    }

    public static h S() {
        return DEFAULT_INSTANCE;
    }

    public static a a0() {
        return (a)DEFAULT_INSTANCE.s();
    }

    private void b0(boolean bl) {
        this.valueCase_ = 1;
        this.value_ = bl;
    }

    private void c0(double d8) {
        this.valueCase_ = 7;
        this.value_ = d8;
    }

    private void d0(float f8) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f8);
    }

    private void e0(int n8) {
        this.valueCase_ = 3;
        this.value_ = n8;
    }

    private void f0(long l8) {
        this.valueCase_ = 4;
        this.value_ = l8;
    }

    private void g0(String string) {
        string.getClass();
        this.valueCase_ = 5;
        this.value_ = string;
    }

    private void h0(g.a a8) {
        this.value_ = a8.s();
        this.valueCase_ = 6;
    }

    public boolean R() {
        if (this.valueCase_ == 1) {
            return (Boolean)this.value_;
        }
        return false;
    }

    public double T() {
        if (this.valueCase_ == 7) {
            return (Double)this.value_;
        }
        return 0.0;
    }

    public float U() {
        if (this.valueCase_ == 2) {
            return ((Float)this.value_).floatValue();
        }
        return 0.0f;
    }

    public int V() {
        if (this.valueCase_ == 3) {
            return (Integer)this.value_;
        }
        return 0;
    }

    public long W() {
        if (this.valueCase_ == 4) {
            return (Long)this.value_;
        }
        return 0L;
    }

    public String X() {
        if (this.valueCase_ == 5) {
            return (String)this.value_;
        }
        return "";
    }

    public g Y() {
        if (this.valueCase_ == 6) {
            return (g)this.value_;
        }
        return g.N();
    }

    public b Z() {
        return b.d(this.valueCase_);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object v(y.f object, Object a02, Object object2) {
        switch (e.a[((Enum)object).ordinal()]) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 7: {
                return null;
            }
            case 6: {
                return (byte)1;
            }
            case 5: {
                object = PARSER;
                if (object != null) {
                    return object;
                }
                synchronized (h.class) {
                    try {
                        a02 = PARSER;
                        object = a02;
                        if (a02 == null) {
                            PARSER = object = new y.b(DEFAULT_INSTANCE);
                        }
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                return y.E(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", g.class});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new h();
    }

    public static final class a
    extends y.a<h, a>
    implements T {
        private a() {
            super(DEFAULT_INSTANCE);
        }

        /* synthetic */ a(e e8) {
            this();
        }

        public a C(boolean bl) {
            this.w();
            ((h)this.c0).b0(bl);
            return this;
        }

        public a D(double d8) {
            this.w();
            ((h)this.c0).c0(d8);
            return this;
        }

        public a E(float f8) {
            this.w();
            ((h)this.c0).d0(f8);
            return this;
        }

        public a F(int n8) {
            this.w();
            ((h)this.c0).e0(n8);
            return this;
        }

        public a G(long l8) {
            this.w();
            ((h)this.c0).f0(l8);
            return this;
        }

        public a H(String string) {
            this.w();
            ((h)this.c0).g0(string);
            return this;
        }

        public a I(g.a a8) {
            this.w();
            ((h)this.c0).h0(a8);
            return this;
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        public static final /* enum */ b d0;
        public static final /* enum */ b e0;
        public static final /* enum */ b f0;
        public static final /* enum */ b g0;
        public static final /* enum */ b h0;
        public static final /* enum */ b i0;
        public static final /* enum */ b j0;
        private static final b[] k0;
        private final int q;

        static {
            b b8;
            b b9;
            b b10;
            b b11;
            b b12;
            b b13;
            b b14;
            b b15;
            c0 = b15 = new b(1);
            d0 = b14 = new b(2);
            e0 = b13 = new b(3);
            f0 = b12 = new b(4);
            g0 = b11 = new b(5);
            h0 = b10 = new b(6);
            i0 = b9 = new b(7);
            j0 = b8 = new b(0);
            k0 = new b[]{b15, b14, b13, b12, b11, b10, b9, b8};
        }

        private b(int n9) {
            this.q = n9;
        }

        public static b d(int n8) {
            switch (n8) {
                default: {
                    return null;
                }
                case 7: {
                    return i0;
                }
                case 6: {
                    return h0;
                }
                case 5: {
                    return g0;
                }
                case 4: {
                    return f0;
                }
                case 3: {
                    return e0;
                }
                case 2: {
                    return d0;
                }
                case 1: {
                    return c0;
                }
                case 0: 
            }
            return j0;
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])k0.clone();
        }
    }
}

