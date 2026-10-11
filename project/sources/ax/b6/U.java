package ax.b6;

import java.util.List;

/* loaded from: classes3.dex */
public final class U extends AbstractC1501A {
    @Override // ax.b6.AbstractC1501A
    public final InterfaceC1658s b(String str, Z2 z2, List<InterfaceC1658s> list) {
        if (str == null || str.isEmpty() || !z2.g(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        InterfaceC1658s c = z2.c(str);
        if (c instanceof AbstractC1619n) {
            return ((AbstractC1619n) c).a(z2, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
