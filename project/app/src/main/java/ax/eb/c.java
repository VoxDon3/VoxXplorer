/*
 * Decompiled with CFR 0.152.
 */
package ax.eb;

import ax.db.u;
import ax.eb.a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class c {
    protected c() {
    }

    static c a() {
        return new b();
    }

    @Deprecated
    public abstract void b(Collection<String> var1);

    private static final class b
    extends c {
        private static final c b;
        private final Set<String> a = new HashSet<String>();

        static {
            Map map = Collections.EMPTY_MAP;
            b = c.a(map, map);
        }

        private b() {
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void b(Collection<String> collection) {
            ax.cb.b.b(collection, "spanNames");
            Set<String> set = this.a;
            synchronized (set) {
                this.a.addAll(collection);
                return;
            }
        }
    }

    public static abstract class c {
        c() {
        }

        public static c a(Map<Object, Integer> map, Map<u.a, Integer> map2) {
            return new a(java.util.DesugarCollections.unmodifiableMap(new HashMap<Object, Integer>(ax.cb.b.b(map, "numbersOfLatencySampledSpans"))), java.util.DesugarCollections.unmodifiableMap(new HashMap<u.a, Integer>(ax.cb.b.b(map2, "numbersOfErrorSampledSpans"))));
        }

        public abstract Map<u.a, Integer> b();

        public abstract Map<Object, Integer> c();
    }
}

