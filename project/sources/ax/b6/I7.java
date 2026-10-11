package ax.b6;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class I7 extends AbstractC1619n {
    private final Callable<Object> d0;

    public I7(String str, Callable<Object> callable) {
        super(str);
        this.d0 = callable;
    }

    @Override // ax.b6.AbstractC1619n
    public final InterfaceC1658s a(Z2 z2, List<InterfaceC1658s> list) {
        try {
            return Z3.b(this.d0.call());
        } catch (Exception unused) {
            return InterfaceC1658s.f;
        }
    }
}
