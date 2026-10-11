/*
 * Decompiled with CFR 0.152.
 */
package ax.U3;

import ax.M3.j;
import ax.N3.b;
import ax.k4.h;
import java.util.Collections;
import java.util.List;

public interface m<Model, Data> {
    public a<Data> a(Model var1, int var2, int var3, j var4);

    public boolean b(Model var1);

    public static class a<Data> {
        public final ax.M3.h a;
        public final List<ax.M3.h> b;
        public final b<Data> c;

        public a(ax.M3.h h8, b<Data> b8) {
            this(h8, Collections.EMPTY_LIST, b8);
        }

        public a(ax.M3.h h8, List<ax.M3.h> list, b<Data> b8) {
            this.a = h.d(h8);
            this.b = h.d(list);
            this.c = h.d(b8);
        }
    }
}

