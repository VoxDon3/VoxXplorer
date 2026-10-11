package ax.p0;

import ax.r0.AbstractC2914a;
import ax.r0.AbstractC2937y;
import ax.r0.C2904A;
import ax.r0.T;
import ax.r0.a0;
import java.util.List;

/* renamed from: ax.p0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2756g extends AbstractC2937y<C2756g, a> implements T {
    private static final C2756g DEFAULT_INSTANCE;
    private static volatile a0<C2756g> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private C2904A.i<String> strings_ = AbstractC2937y.w();

    /* renamed from: ax.p0.g$a */
    public static final class a extends AbstractC2937y.a<C2756g, a> implements T {
        /* synthetic */ a(C2754e c2754e) {
            this();
        }

        public a C(Iterable<String> iterable) {
            w();
            ((C2756g) this.c0).L(iterable);
            return this;
        }

        private a() {
            super(C2756g.DEFAULT_INSTANCE);
        }
    }

    static {
        C2756g c2756g = new C2756g();
        DEFAULT_INSTANCE = c2756g;
        AbstractC2937y.H(C2756g.class, c2756g);
    }

    private C2756g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(Iterable<String> iterable) {
        M();
        AbstractC2914a.a(iterable, this.strings_);
    }

    private void M() {
        if (this.strings_.G0()) {
            return;
        }
        this.strings_ = AbstractC2937y.C(this.strings_);
    }

    public static C2756g N() {
        return DEFAULT_INSTANCE;
    }

    public static a P() {
        return DEFAULT_INSTANCE.s();
    }

    public List<String> O() {
        return this.strings_;
    }

    @Override // ax.r0.AbstractC2937y
    protected final Object v(AbstractC2937y.f fVar, Object obj, Object obj2) {
        a0 a0Var;
        C2754e c2754e = null;
        switch (C2754e.a[fVar.ordinal()]) {
            case 1:
                return new C2756g();
            case 2:
                return new a(c2754e);
            case 3:
                return AbstractC2937y.E(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<C2756g> a0Var2 = PARSER;
                if (a0Var2 != null) {
                    return a0Var2;
                }
                synchronized (C2756g.class) {
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
