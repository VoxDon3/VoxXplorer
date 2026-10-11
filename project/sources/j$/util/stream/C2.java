package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class C2 extends AbstractC3854g0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2(AbstractC3823a abstractC3823a, int i, int i2) {
        super(abstractC3823a, i, 0);
        this.m = i2;
    }

    @Override // j$.util.stream.AbstractC3823a
    public Spliterator K(AbstractC3823a abstractC3823a, Spliterator spliterator) {
        switch (this.m) {
            case 1:
                return V2.ORDERED.q(abstractC3823a.f) ? J(abstractC3823a, spliterator, new T(29)).spliterator() : new X3((j$.util.Y) abstractC3823a.S(spliterator), 1);
            default:
                return super.K(abstractC3823a, spliterator);
        }
    }

    @Override // j$.util.stream.AbstractC3823a
    public final E0 J(AbstractC3823a abstractC3823a, Spliterator spliterator, IntFunction intFunction) {
        switch (this.m) {
            case 0:
                if (V2.SORTED.q(abstractC3823a.f)) {
                    return abstractC3823a.o(spliterator, false, intFunction);
                }
                long[] jArr = (long[]) ((C0) abstractC3823a.o(spliterator, true, intFunction)).d();
                Arrays.sort(jArr);
                return new C3865i1(jArr);
            default:
                return (E0) new U3(this, abstractC3823a, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.AbstractC3823a
    public final InterfaceC3866i2 M(int i, InterfaceC3866i2 interfaceC3866i2) {
        switch (this.m) {
            case 0:
                Objects.requireNonNull(interfaceC3866i2);
                if (V2.SORTED.q(i)) {
                    return interfaceC3866i2;
                }
                return V2.SIZED.q(i) ? new H2(interfaceC3866i2) : new C3950z2(interfaceC3866i2);
            default:
                return new K3(this, interfaceC3866i2);
        }
    }
}
