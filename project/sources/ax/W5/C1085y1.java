package ax.W5;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;

/* renamed from: ax.W5.y1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1085y1 extends I1 {
    C1085y1(int i) {
        super(i, null);
    }

    @Override // ax.W5.I1
    public final void a() {
        if (!k()) {
            for (int i = 0; i < b(); i++) {
                Map.Entry g = g(i);
                if (((D0) g.getKey()).c()) {
                    g.setValue(DesugarCollections.unmodifiableList((List) g.getValue()));
                }
            }
            for (Map.Entry entry : c()) {
                if (((D0) entry.getKey()).c()) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
