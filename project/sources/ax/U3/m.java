package ax.U3;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface m<Model, Data> {

    public static class a<Data> {
        public final ax.M3.h a;
        public final List<ax.M3.h> b;
        public final ax.N3.b<Data> c;

        public a(ax.M3.h hVar, ax.N3.b<Data> bVar) {
            this(hVar, Collections.EMPTY_LIST, bVar);
        }

        public a(ax.M3.h hVar, List<ax.M3.h> list, ax.N3.b<Data> bVar) {
            this.a = (ax.M3.h) ax.k4.h.d(hVar);
            this.b = (List) ax.k4.h.d(list);
            this.c = (ax.N3.b) ax.k4.h.d(bVar);
        }
    }

    a<Data> a(Model model, int i, int i2, ax.M3.j jVar);

    boolean b(Model model);
}
