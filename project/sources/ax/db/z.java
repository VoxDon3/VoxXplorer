package ax.db;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class z {

    public static final class b {
        private static final z c = z.c(Collections.EMPTY_LIST);
        private final z a;
        private ArrayList<Object> b;

        public z b() {
            ArrayList<Object> arrayList = this.b;
            return arrayList == null ? this.a : z.c(arrayList);
        }

        private b(z zVar) {
            ax.cb.b.b(zVar, "parent");
            this.a = zVar;
            this.b = null;
        }
    }

    z() {
    }

    public static b b() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static z c(List<Object> list) {
        ax.cb.b.c(list.size() <= 32, "Invalid size");
        return new g(DesugarCollections.unmodifiableList(list));
    }

    public abstract List<Object> d();
}
