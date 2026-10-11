/*
 * Decompiled with CFR 0.152.
 */
package ax.q8;

import ax.D7.e;
import ax.D7.j;
import ax.q8.a;
import ax.q8.c;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

public class b
implements j {
    public static /* synthetic */ Object b(String string, ax.D7.c c8, e e8) {
        try {
            c.b(string);
            string = c8.h().a(e8);
            return string;
        }
        finally {
            c.a();
        }
    }

    @Override
    public List<ax.D7.c<?>> a(ComponentRegistrar c8) {
        ArrayList arrayList = new ArrayList();
        for (ax.D7.c<?> c9 : c8.getComponents()) {
            String string = c9.i();
            c8 = c9;
            if (string != null) {
                c8 = c9.r(new a(string, c9));
            }
            arrayList.add(c8);
        }
        return arrayList;
    }
}

