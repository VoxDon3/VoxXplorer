package ax.b6;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ax.b6.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1501A {
    final List<Z> a = new ArrayList();

    protected AbstractC1501A() {
    }

    final InterfaceC1658s a(String str) {
        if (!this.a.contains(C1709y2.c(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: " + str);
    }

    public abstract InterfaceC1658s b(String str, Z2 z2, List<InterfaceC1658s> list);
}
