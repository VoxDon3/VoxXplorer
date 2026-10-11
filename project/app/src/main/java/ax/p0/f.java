/*
 * Decompiled with CFR 0.152.
 */
package ax.p0;

import ax.p0.e;
import ax.p0.h;
import ax.r0.K;
import ax.r0.L;
import ax.r0.T;
import ax.r0.a0;
import ax.r0.u0;
import ax.r0.y;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public final class f
extends y<f, a>
implements T {
    private static final f DEFAULT_INSTANCE;
    private static volatile a0<f> PARSER;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private L<String, h> preferences_ = L.f();

    static {
        f f8;
        DEFAULT_INSTANCE = f8 = new f();
        y.H(f.class, f8);
    }

    private f() {
    }

    private Map<String, h> L() {
        return this.N();
    }

    private L<String, h> N() {
        if (!this.preferences_.l()) {
            this.preferences_ = this.preferences_.o();
        }
        return this.preferences_;
    }

    private L<String, h> O() {
        return this.preferences_;
    }

    public static a P() {
        return (a)DEFAULT_INSTANCE.s();
    }

    public static f Q(InputStream inputStream) throws IOException {
        return y.F(DEFAULT_INSTANCE, inputStream);
    }

    public Map<String, h> M() {
        return java.util.DesugarCollections.unmodifiableMap(this.O());
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
                synchronized (f.class) {
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
                object = b.a;
                return y.E(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", object});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new f();
    }

    public static final class a
    extends y.a<f, a>
    implements T {
        private a() {
            super(DEFAULT_INSTANCE);
        }

        /* synthetic */ a(e e8) {
            this();
        }

        public a C(String string, h h8) {
            string.getClass();
            h8.getClass();
            this.w();
            ((f)this.c0).L().put(string, h8);
            return this;
        }
    }

    private static final class b {
        static final K<String, h> a = K.d(u0.b.l0, "", u0.b.n0, h.S());
    }
}

