package ax.R3;

import ax.R3.a;
import java.io.File;

/* loaded from: classes.dex */
public class d implements a.InterfaceC0183a {
    private final int a;
    private final a b;

    public interface a {
        File a();
    }

    public d(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // ax.R3.a.InterfaceC0183a
    public ax.R3.a g() {
        File a2 = this.b.a();
        if (a2 == null) {
            return null;
        }
        if (a2.mkdirs() || (a2.exists() && a2.isDirectory())) {
            return e.c(a2, this.a);
        }
        return null;
    }
}
