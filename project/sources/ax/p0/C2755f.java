package ax.p0;

import ax.r0.AbstractC2937y;
import ax.r0.K;
import ax.r0.L;
import ax.r0.T;
import ax.r0.a0;
import ax.r0.u0;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okhttp3.HttpUrl;

/* renamed from: ax.p0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2755f extends AbstractC2937y<C2755f, a> implements T {
    private static final C2755f DEFAULT_INSTANCE;
    private static volatile a0<C2755f> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private L<String, C2757h> preferences_ = L.f();

    /* renamed from: ax.p0.f$a */
    public static final class a extends AbstractC2937y.a<C2755f, a> implements T {
        /* synthetic */ a(C2754e c2754e) {
            this();
        }

        public a C(String str, C2757h c2757h) {
            str.getClass();
            c2757h.getClass();
            w();
            ((C2755f) this.c0).L().put(str, c2757h);
            return this;
        }

        private a() {
            super(C2755f.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: ax.p0.f$b */
    private static final class b {
        static final K<String, C2757h> a = K.d(u0.b.l0, HttpUrl.FRAGMENT_ENCODE_SET, u0.b.n0, C2757h.S());
    }

    static {
        C2755f c2755f = new C2755f();
        DEFAULT_INSTANCE = c2755f;
        AbstractC2937y.H(C2755f.class, c2755f);
    }

    private C2755f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, C2757h> L() {
        return N();
    }

    private L<String, C2757h> N() {
        if (!this.preferences_.l()) {
            this.preferences_ = this.preferences_.o();
        }
        return this.preferences_;
    }

    private L<String, C2757h> O() {
        return this.preferences_;
    }

    public static a P() {
        return DEFAULT_INSTANCE.s();
    }

    public static C2755f Q(InputStream inputStream) throws IOException {
        return (C2755f) AbstractC2937y.F(DEFAULT_INSTANCE, inputStream);
    }

    public Map<String, C2757h> M() {
        return DesugarCollections.unmodifiableMap(O());
    }

    @Override // ax.r0.AbstractC2937y
    protected final Object v(AbstractC2937y.f fVar, Object obj, Object obj2) {
        a0 a0Var;
        C2754e c2754e = null;
        switch (C2754e.a[fVar.ordinal()]) {
            case 1:
                return new C2755f();
            case 2:
                return new a(c2754e);
            case 3:
                return AbstractC2937y.E(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<C2755f> a0Var2 = PARSER;
                if (a0Var2 != null) {
                    return a0Var2;
                }
                synchronized (C2755f.class) {
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
