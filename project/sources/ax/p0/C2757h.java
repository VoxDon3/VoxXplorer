package ax.p0;

import ax.p0.C2756g;
import ax.r0.AbstractC2937y;
import ax.r0.T;
import ax.r0.a0;
import okhttp3.HttpUrl;

/* renamed from: ax.p0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2757h extends AbstractC2937y<C2757h, a> implements T {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final C2757h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile a0<C2757h> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    /* renamed from: ax.p0.h$a */
    public static final class a extends AbstractC2937y.a<C2757h, a> implements T {
        /* synthetic */ a(C2754e c2754e) {
            this();
        }

        public a C(boolean z) {
            w();
            ((C2757h) this.c0).b0(z);
            return this;
        }

        public a D(double d) {
            w();
            ((C2757h) this.c0).c0(d);
            return this;
        }

        public a E(float f) {
            w();
            ((C2757h) this.c0).d0(f);
            return this;
        }

        public a F(int i) {
            w();
            ((C2757h) this.c0).e0(i);
            return this;
        }

        public a G(long j) {
            w();
            ((C2757h) this.c0).f0(j);
            return this;
        }

        public a H(String str) {
            w();
            ((C2757h) this.c0).g0(str);
            return this;
        }

        public a I(C2756g.a aVar) {
            w();
            ((C2757h) this.c0).h0(aVar);
            return this;
        }

        private a() {
            super(C2757h.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: ax.p0.h$b */
    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);

        private final int q;

        b(int i) {
            this.q = i;
        }

        public static b d(int i) {
            switch (i) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                default:
                    return null;
            }
        }
    }

    static {
        C2757h c2757h = new C2757h();
        DEFAULT_INSTANCE = c2757h;
        AbstractC2937y.H(C2757h.class, c2757h);
    }

    private C2757h() {
    }

    public static C2757h S() {
        return DEFAULT_INSTANCE;
    }

    public static a a0() {
        return DEFAULT_INSTANCE.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(double d) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(float f) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(int i) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(long j) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(C2756g.a aVar) {
        this.value_ = aVar.g();
        this.valueCase_ = 6;
    }

    public boolean R() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public double T() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float U() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int V() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long W() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String X() {
        return this.valueCase_ == 5 ? (String) this.value_ : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public C2756g Y() {
        return this.valueCase_ == 6 ? (C2756g) this.value_ : C2756g.N();
    }

    public b Z() {
        return b.d(this.valueCase_);
    }

    @Override // ax.r0.AbstractC2937y
    protected final Object v(AbstractC2937y.f fVar, Object obj, Object obj2) {
        a0 a0Var;
        C2754e c2754e = null;
        switch (C2754e.a[fVar.ordinal()]) {
            case 1:
                return new C2757h();
            case 2:
                return new a(c2754e);
            case 3:
                return AbstractC2937y.E(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", C2756g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<C2757h> a0Var2 = PARSER;
                if (a0Var2 != null) {
                    return a0Var2;
                }
                synchronized (C2757h.class) {
                    try {
                        a0Var = PARSER;
                        if (a0Var == null) {
                            a0Var = new AbstractC2937y.b(DEFAULT_INSTANCE);
                            PARSER = a0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return a0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
