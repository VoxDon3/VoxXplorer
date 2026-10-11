/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.S;
import ax.r0.o;
import ax.r0.y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class p {
    private static boolean b = true;
    private static final Class<?> c = p.c();
    private static volatile p d;
    static final p e;
    private final Map<a, y.e<?, ?>> a;

    static {
        e = new p(true);
    }

    p() {
        this.a = new HashMap();
    }

    p(boolean bl) {
        this.a = Collections.EMPTY_MAP;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static p b() {
        p p8 = d;
        if (p8 != null) {
            return p8;
        }
        synchronized (p.class) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        p p9;
                        p8 = p9 = d;
                        if (p9 == null) {
                            p8 = b ? o.a() : e;
                        }
                        break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    d = p8;
                }
                return p8;
            }
            throw throwable2;
        }
    }

    static Class<?> c() {
        try {
            Class<?> clazz = Class.forName("androidx.datastore.preferences.protobuf.Extension");
            return clazz;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }

    public <ContainingType extends S> y.e<ContainingType, ?> a(ContainingType ContainingType, int n8) {
        return this.a.get(new a(ContainingType, n8));
    }

    private static final class a {
        private final Object a;
        private final int b;

        a(Object object, int n8) {
            this.a = object;
            this.b = n8;
        }

        public boolean equals(Object object) {
            if (!(object instanceof a)) {
                return false;
            }
            object = (a)object;
            return this.a == ((a)object).a && this.b == ((a)object).b;
        }

        public int hashCode() {
            return System.identityHashCode(this.a) * 65535 + this.b;
        }
    }
}

