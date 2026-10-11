package ax.O9;

import com.microsoft.graph.extensions.Drive;
import java.util.List;

/* loaded from: classes3.dex */
public class m extends ax.P9.b implements D {
    public m(String str, ax.M9.f fVar, List<ax.S9.c> list, Class cls) {
        super(str, fVar, list, cls);
    }

    @Override // ax.O9.D
    public void c(ax.L9.c<Drive> cVar) {
        s(ax.P9.k.GET, cVar, null);
    }

    @Override // ax.O9.D
    public Drive get() throws ax.M9.d {
        return (Drive) r(ax.P9.k.GET, null);
    }
}
