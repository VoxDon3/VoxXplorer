package ax.O9;

import ax.N9.C0855l;
import com.microsoft.graph.extensions.UploadSession;
import java.util.List;

/* renamed from: ax.O9.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0889f extends ax.P9.b implements v {
    protected final C0855l i;

    public C0889f(String str, ax.M9.f fVar, List<ax.S9.c> list) {
        super(str, fVar, list, UploadSession.class);
        this.i = new C0855l();
    }

    @Override // ax.O9.v
    public UploadSession e() throws ax.M9.d {
        return (UploadSession) r(ax.P9.k.POST, this.i);
    }
}
