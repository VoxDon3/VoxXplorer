/*
 * Decompiled with CFR 0.152.
 */
package ax.db;

import ax.db.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class z {
    z() {
    }

    public static b b() {
        return new b(b.c);
    }

    private static z c(List<Object> list) {
        boolean bl = list.size() <= 32;
        ax.cb.b.c(bl, "Invalid size");
        return new g(java.util.DesugarCollections.unmodifiableList(list));
    }

    public abstract List<Object> d();

    public static final class b {
        private static final z c = z.a(Collections.EMPTY_LIST);
        private final z a;
        private ArrayList<Object> b;

        private b(z z8) {
            ax.cb.b.b(z8, "parent");
            this.a = z8;
            this.b = null;
        }

        public z b() {
            ArrayList<Object> arrayList = this.b;
            if (arrayList == null) {
                return this.a;
            }
            return z.c(arrayList);
        }
    }
}

