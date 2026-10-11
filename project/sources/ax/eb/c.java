package ax.eb;

import ax.db.u;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class c {

    private static final class b extends c {
        private static final AbstractC0308c b;
        private final Set<String> a;

        static {
            Map map = Collections.EMPTY_MAP;
            b = AbstractC0308c.a(map, map);
        }

        private b() {
            this.a = new HashSet();
        }

        @Override // ax.eb.c
        public void b(Collection<String> collection) {
            ax.cb.b.b(collection, "spanNames");
            synchronized (this.a) {
                this.a.addAll(collection);
            }
        }
    }

    /* renamed from: ax.eb.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0308c {
        AbstractC0308c() {
        }

        public static AbstractC0308c a(Map<Object, Integer> map, Map<u.a, Integer> map2) {
            return new C1994a(DesugarCollections.unmodifiableMap(new HashMap((Map) ax.cb.b.b(map, "numbersOfLatencySampledSpans"))), DesugarCollections.unmodifiableMap(new HashMap((Map) ax.cb.b.b(map2, "numbersOfErrorSampledSpans"))));
        }

        public abstract Map<u.a, Integer> b();

        public abstract Map<Object, Integer> c();
    }

    protected c() {
    }

    static c a() {
        return new b();
    }

    @Deprecated
    public abstract void b(Collection<String> collection);
}
