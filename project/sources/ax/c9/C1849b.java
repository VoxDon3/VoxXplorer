package ax.c9;

import ax.X8.a;
import ax.X8.b;

/* renamed from: ax.c9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1849b<D extends ax.X8.b<?>, P extends ax.X8.a<?>> {
    private final InterfaceC1851d<P, ?> a;
    private final InterfaceC1850c<D> b;
    private final InterfaceC1848a<D> c;

    public C1849b(InterfaceC1851d<P, ?> interfaceC1851d, InterfaceC1850c<D> interfaceC1850c, InterfaceC1848a<D> interfaceC1848a) {
        this.a = interfaceC1851d;
        this.b = interfaceC1850c;
        this.c = interfaceC1848a;
    }

    public InterfaceC1848a<D> a() {
        return this.c;
    }

    public InterfaceC1850c<D> b() {
        return this.b;
    }

    public InterfaceC1851d<P, ?> c() {
        return this.a;
    }
}
