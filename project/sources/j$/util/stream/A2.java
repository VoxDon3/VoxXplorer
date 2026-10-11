package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class A2 extends AbstractC3942y {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A2(AbstractC3823a abstractC3823a, int i, int i2) {
        super(abstractC3823a, i, 0);
        this.m = i2;
    }

    @Override // j$.util.stream.AbstractC3823a
    public Spliterator K(AbstractC3823a abstractC3823a, Spliterator spliterator) {
        switch (this.m) {
            case 1:
                return V2.ORDERED.q(abstractC3823a.f) ? J(abstractC3823a, spliterator, new L3(1)).spliterator() : new V3((j$.util.S) abstractC3823a.S(spliterator), 1);
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
                double[] dArr = (double[]) ((InterfaceC3943y0) abstractC3823a.o(spliterator, true, intFunction)).d();
                Arrays.sort(dArr);
                return new Q0(dArr);
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
                return V2.SIZED.q(i) ? new F2(interfaceC3866i2) : new C3940x2(interfaceC3866i2);
            default:
                return new O3(this, interfaceC3866i2);
        }
    }
}
