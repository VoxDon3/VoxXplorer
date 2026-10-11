package ax.D7;

import ax.a8.InterfaceC1430a;

/* loaded from: classes3.dex */
class D<T> implements ax.a8.b<T>, InterfaceC1430a<T> {
    private static final InterfaceC1430a.InterfaceC0254a<Object> c = new InterfaceC1430a.InterfaceC0254a() { // from class: ax.D7.A
        @Override // ax.a8.InterfaceC1430a.InterfaceC0254a
        public final void a(ax.a8.b bVar) {
            D.d(bVar);
        }
    };
    private static final ax.a8.b<Object> d = new ax.a8.b() { // from class: ax.D7.B
        @Override // ax.a8.b
        public final Object get() {
            return D.b();
        }
    };
    private InterfaceC1430a.InterfaceC0254a<T> a;
    private volatile ax.a8.b<T> b;

    private D(InterfaceC1430a.InterfaceC0254a<T> interfaceC0254a, ax.a8.b<T> bVar) {
        this.a = interfaceC0254a;
        this.b = bVar;
    }

    public static /* synthetic */ Object b() {
        return null;
    }

    public static /* synthetic */ void c(InterfaceC1430a.InterfaceC0254a interfaceC0254a, InterfaceC1430a.InterfaceC0254a interfaceC0254a2, ax.a8.b bVar) {
        interfaceC0254a.a(bVar);
        interfaceC0254a2.a(bVar);
    }

    public static /* synthetic */ void d(ax.a8.b bVar) {
    }

    static <T> D<T> e() {
        return new D<>(c, d);
    }

    static <T> D<T> f(ax.a8.b<T> bVar) {
        return new D<>(null, bVar);
    }

    @Override // ax.a8.InterfaceC1430a
    public void a(final InterfaceC1430a.InterfaceC0254a<T> interfaceC0254a) {
        ax.a8.b<T> bVar;
        ax.a8.b<T> bVar2;
        ax.a8.b<T> bVar3 = this.b;
        ax.a8.b<Object> bVar4 = d;
        if (bVar3 != bVar4) {
            interfaceC0254a.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                final InterfaceC1430a.InterfaceC0254a<T> interfaceC0254a2 = this.a;
                this.a = new InterfaceC1430a.InterfaceC0254a() { // from class: ax.D7.C
                    @Override // ax.a8.InterfaceC1430a.InterfaceC0254a
                    public final void a(ax.a8.b bVar5) {
                        D.c(InterfaceC1430a.InterfaceC0254a.this, interfaceC0254a, bVar5);
                    }
                };
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC0254a.a(bVar);
        }
    }

    void g(ax.a8.b<T> bVar) {
        InterfaceC1430a.InterfaceC0254a<T> interfaceC0254a;
        if (this.b != d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC0254a = this.a;
            this.a = null;
            this.b = bVar;
        }
        interfaceC0254a.a(bVar);
    }

    @Override // ax.a8.b
    public T get() {
        return this.b.get();
    }
}
