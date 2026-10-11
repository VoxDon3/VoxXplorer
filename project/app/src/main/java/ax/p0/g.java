/*
 * Decompiled with CFR 0.152.
 */
package ax.p0;

import ax.p0.e;
import ax.r0.A;
import ax.r0.T;
import ax.r0.a0;
import ax.r0.y;
import java.util.List;

public final class g
extends y<g, a>
implements T {
    private static final g DEFAULT_INSTANCE;
    private static volatile a0<g> PARSER;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private A.i<String> strings_ = y.w();

    static {
        g g8;
        DEFAULT_INSTANCE = g8 = new g();
        y.H(g.class, g8);
    }

    private g() {
    }

    private void L(Iterable<String> iterable) {
        this.M();
        ax.r0.a.a(iterable, this.strings_);
    }

    private void M() {
        if (!this.strings_.G0()) {
            this.strings_ = y.C(this.strings_);
        }
    }

    public static g N() {
        return DEFAULT_INSTANCE;
    }

    public static a P() {
        return (a)DEFAULT_INSTANCE.s();
    }

    public List<String> O() {
        return this.strings_;
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
                synchronized (g.class) {
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
                return y.E(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new g();
    }

    public static final class a
    extends y.a<g, a>
    implements T {
        private a() {
            super(DEFAULT_INSTANCE);
        }

        /* synthetic */ a(e e8) {
            this();
        }

        public a C(Iterable<String> iterable) {
            this.w();
            ((g)this.c0).L(iterable);
            return this;
        }
    }
}

