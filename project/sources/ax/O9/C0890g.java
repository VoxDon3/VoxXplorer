package ax.O9;

import ax.N9.C0857m;
import ax.N9.Q;
import com.microsoft.graph.extensions.DriveItemUploadableProperties;
import java.util.List;

/* renamed from: ax.O9.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0890g extends ax.M9.a {
    public C0890g(String str, ax.M9.f fVar, List<ax.S9.c> list, DriveItemUploadableProperties driveItemUploadableProperties) {
        super(str, fVar, list);
        this.e.put("item", driveItemUploadableProperties);
    }

    public Q a() {
        return s(o());
    }

    public Q s(List<ax.S9.c> list) {
        C0857m c0857m = new C0857m(d(), i(), list);
        if (r("item")) {
            c0857m.i.a = (DriveItemUploadableProperties) q("item");
        }
        return c0857m;
    }
}
