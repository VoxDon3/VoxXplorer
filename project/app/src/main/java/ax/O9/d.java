/*
 * Decompiled with CFR 0.152.
 */
package ax.O9;

import ax.M9.a;
import ax.M9.f;
import ax.N9.O;
import ax.N9.j;
import ax.O9.c;
import com.microsoft.graph.extensions.ItemReference;
import java.util.List;

public class d
extends a {
    public d(String string, f f8, List<ax.S9.c> list, String string2, ItemReference itemReference) {
        super(string, f8, list);
        this.e.put("name", string2);
        this.e.put("parentReference", itemReference);
    }

    public O a() {
        return this.s(this.o());
    }

    public O s(List<ax.S9.c> object) {
        object = new j(this.d(), this.i(), (List<ax.S9.c>)object);
        if (this.r("name")) {
            ((c)object).i.a = (String)this.q("name");
        }
        if (this.r("parentReference")) {
            ((c)object).i.b = (ItemReference)this.q("parentReference");
        }
        return object;
    }
}

