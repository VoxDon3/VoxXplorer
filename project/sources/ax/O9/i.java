package ax.O9;

import ax.N9.C0847h;
import ax.N9.C0853k;
import ax.N9.C0859n;
import ax.N9.C0861o;
import ax.N9.C0870t;
import ax.N9.N;
import ax.N9.P;
import ax.N9.S;
import ax.N9.T;
import ax.N9.W;
import ax.N9.Y;
import com.microsoft.graph.extensions.DriveItemUploadableProperties;
import com.microsoft.graph.extensions.ItemReference;
import java.util.List;

/* loaded from: classes3.dex */
public class i extends ax.P9.c implements y {
    public i(String str, ax.M9.f fVar, List<ax.S9.c> list) {
        super(str, fVar, list);
    }

    @Override // ax.O9.y
    public T a() {
        return q(o());
    }

    @Override // ax.O9.y
    public N b() {
        return new C0847h(p("children"), i(), null);
    }

    @Override // ax.O9.y
    public W f(String str) {
        return new ax.N9.r(p("microsoft.graph.search"), i(), null, str);
    }

    @Override // ax.O9.y
    public P j(String str, ItemReference itemReference) {
        return new C0853k(p("microsoft.graph.copy"), i(), null, str, itemReference);
    }

    @Override // ax.O9.y
    public Y k() {
        return new C0870t(p("content"), i(), null);
    }

    @Override // ax.O9.y
    public S m(DriveItemUploadableProperties driveItemUploadableProperties) {
        return new C0859n(p("microsoft.graph.createUploadSession"), i(), null, driveItemUploadableProperties);
    }

    public T q(List<ax.S9.c> list) {
        return new C0861o(d(), i(), list);
    }
}
