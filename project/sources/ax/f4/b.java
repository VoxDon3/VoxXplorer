package ax.f4;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b {
    private final List<ax.M3.f> a = new ArrayList();

    public synchronized void a(ax.M3.f fVar) {
        this.a.add(fVar);
    }

    public synchronized List<ax.M3.f> b() {
        return this.a;
    }
}
