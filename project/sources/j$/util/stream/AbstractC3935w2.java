package j$.util.stream;

import java.util.Comparator;

/* renamed from: j$.util.stream.w2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3935w2 extends AbstractC3846e2 {
    public final Comparator b;
    public boolean c;

    public AbstractC3935w2(InterfaceC3866i2 interfaceC3866i2, Comparator comparator) {
        super(interfaceC3866i2);
        this.b = comparator;
    }

    @Override // j$.util.stream.AbstractC3846e2, j$.util.stream.InterfaceC3866i2
    public final boolean q() {
        this.c = true;
        return false;
    }
}
