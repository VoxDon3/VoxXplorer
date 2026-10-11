package ax.i1;

import ax.r7.AbstractC2991z;
import java.util.List;

/* renamed from: ax.i1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2221k implements InterfaceC2220j {
    @Override // ax.i1.InterfaceC2220j
    public f0 a(List<? extends f0> list, List<List<Integer>> list2) {
        return new C2219i(list, list2);
    }

    @Override // ax.i1.InterfaceC2220j
    public f0 empty() {
        return new C2219i(AbstractC2991z.z(), AbstractC2991z.z());
    }
}
