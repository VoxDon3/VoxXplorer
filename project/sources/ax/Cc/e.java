package ax.Cc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class e {
    private final boolean a;
    private final List<g> b;

    public e(byte[] bArr) throws IOException {
        this.b = new ArrayList(h.n(bArr, 0, 21));
        this.a = h.d(bArr, 504);
    }

    public List<g> a() {
        return this.b;
    }

    public boolean b() {
        return this.a;
    }
}
