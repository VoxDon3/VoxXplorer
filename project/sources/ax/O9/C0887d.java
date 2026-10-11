package ax.O9;

import ax.N9.C0851j;
import ax.N9.O;
import com.microsoft.graph.extensions.ItemReference;
import java.util.List;

/* renamed from: ax.O9.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0887d extends ax.M9.a {
    public C0887d(String str, ax.M9.f fVar, List<ax.S9.c> list, String str2, ItemReference itemReference) {
        super(str, fVar, list);
        this.e.put("name", str2);
        this.e.put("parentReference", itemReference);
    }

    public O a() {
        return s(o());
    }

    public O s(List<ax.S9.c> list) {
        C0851j c0851j = new C0851j(d(), i(), list);
        if (r("name")) {
            c0851j.i.a = (String) q("name");
        }
        if (r("parentReference")) {
            c0851j.i.b = (ItemReference) q("parentReference");
        }
        return c0851j;
    }
}
