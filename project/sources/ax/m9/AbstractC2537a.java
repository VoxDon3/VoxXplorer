package ax.m9;

import ax.h9.AbstractC2174e;

/* renamed from: ax.m9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2537a implements InterfaceC2539c {
    protected InterfaceC2539c a;

    @Override // ax.m9.InterfaceC2539c
    public void a(AbstractC2174e<?> abstractC2174e) throws ax.c9.e {
        if (b(abstractC2174e)) {
            c(abstractC2174e);
        } else {
            this.a.a(abstractC2174e);
        }
    }

    protected abstract boolean b(AbstractC2174e<?> abstractC2174e);

    protected abstract void c(AbstractC2174e<?> abstractC2174e) throws ax.c9.e;

    public InterfaceC2539c d(InterfaceC2539c interfaceC2539c) {
        this.a = interfaceC2539c;
        return this;
    }
}
