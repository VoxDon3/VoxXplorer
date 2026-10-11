package j$.util;

import java.util.RandomAccess;

/* renamed from: j$.util.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3822s extends C3818n implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    @Override // j$.util.C3818n, java.util.List
    public final java.util.List subList(int i, int i2) {
        return new C3822s(this.b.subList(i, i2));
    }

    private Object writeReplace() {
        return new C3818n(this.b);
    }
}
