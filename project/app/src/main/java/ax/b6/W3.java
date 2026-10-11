/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.U4;
import ax.b6.i4;
import ax.b6.k4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class W3 {
    private static volatile W3 b;
    static final W3 c;
    private final Map<a, k4.f<?, ?>> a;

    static {
        c = new W3(true);
    }

    W3() {
        this.a = new HashMap();
    }

    private W3(boolean bl) {
        this.a = Collections.EMPTY_MAP;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static W3 a() {
        W3 w32 = b;
        if (w32 != null) {
            return w32;
        }
        synchronized (W3.class) {
            Throwable throwable2;
            block5: {
                try {
                    w32 = b;
                    if (w32 != null) {
                        return w32;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                b = w32 = i4.b(W3.class);
                return w32;
            }
            throw throwable2;
        }
    }

    public final <ContainingType extends U4> k4.f<ContainingType, ?> b(ContainingType ContainingType, int n8) {
        return this.a.get(new a(ContainingType, n8));
    }

    private static final class a {
        private final Object a;
        private final int b;

        a(Object object, int n8) {
            this.a = object;
            this.b = n8;
        }

        public final boolean equals(Object object) {
            if (!(object instanceof a)) {
                return false;
            }
            object = (a)object;
            return this.a == ((a)object).a && this.b == ((a)object).b;
        }

        public final int hashCode() {
            return System.identityHashCode(this.a) * 65535 + this.b;
        }
    }
}

