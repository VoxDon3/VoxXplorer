/*
 * Decompiled with CFR 0.152.
 */
package ax.I0;

import ax.Gb.l;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class a {
    private final Map<b<?>, Object> a = new LinkedHashMap();

    public abstract <T> T a(b<T> var1);

    public final Map<b<?>, Object> b() {
        return this.a;
    }

    public static final class a
    extends a {
        public static final a b = new a();

        private a() {
        }

        @Override
        public <T> T a(b<T> b8) {
            l.f(b8, "key");
            return null;
        }
    }

    public static interface b<T> {
    }
}

