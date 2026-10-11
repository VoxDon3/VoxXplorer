package j$.util.stream;

import j$.util.EnumC3808d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class D2 extends Z1 {
    public final boolean m;
    public final Comparator n;

    public D2(AbstractC3826a2 abstractC3826a2) {
        super(abstractC3826a2, V2.q | V2.o, 0);
        this.m = true;
        this.n = EnumC3808d.INSTANCE;
    }

    public D2(AbstractC3826a2 abstractC3826a2, Comparator comparator) {
        super(abstractC3826a2, V2.q | V2.p, 0);
        this.m = false;
        this.n = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.AbstractC3823a
    public final InterfaceC3866i2 M(int i, InterfaceC3866i2 interfaceC3866i2) {
        Objects.requireNonNull(interfaceC3866i2);
        if (V2.SORTED.q(i) && this.m) {
            return interfaceC3866i2;
        }
        boolean q = V2.SIZED.q(i);
        Comparator comparator = this.n;
        if (q) {
            return new I2(interfaceC3866i2, comparator);
        }
        return new E2(interfaceC3866i2, comparator);
    }

    @Override // j$.util.stream.AbstractC3823a
    public final E0 J(AbstractC3823a abstractC3823a, Spliterator spliterator, IntFunction intFunction) {
        if (V2.SORTED.q(abstractC3823a.f) && this.m) {
            return abstractC3823a.o(spliterator, false, intFunction);
        }
        Object[] r = abstractC3823a.o(spliterator, true, intFunction).r(intFunction);
        Arrays.sort(r, this.n);
        return new H0(r);
    }
}
