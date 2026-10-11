package ax.o0;

import ax.Fb.l;
import ax.n0.C2567a;
import ax.n0.InterfaceC2568b;
import ax.wb.e;
import java.io.IOException;

/* renamed from: ax.o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2655b<T> implements InterfaceC2568b<T> {
    private final l<C2567a, T> a;

    /* JADX WARN: Multi-variable type inference failed */
    public C2655b(l<? super C2567a, ? extends T> lVar) {
        ax.Gb.l.f(lVar, "produceNewData");
        this.a = lVar;
    }

    @Override // ax.n0.InterfaceC2568b
    public Object a(C2567a c2567a, e<? super T> eVar) throws IOException {
        return this.a.invoke(c2567a);
    }
}
