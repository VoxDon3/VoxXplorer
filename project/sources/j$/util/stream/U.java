package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* loaded from: classes2.dex */
public final class U extends AbstractC3836c2 {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractC3823a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(AbstractC3823a abstractC3823a, InterfaceC3866i2 interfaceC3866i2, int i) {
        super(interfaceC3866i2);
        this.b = i;
        this.c = abstractC3823a;
    }

    @Override // j$.util.stream.AbstractC3836c2, j$.util.stream.InterfaceC3866i2
    public void m(long j) {
        switch (this.b) {
            case 5:
                this.a.m(-1L);
                break;
            default:
                super.m(j);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC3856g2, j$.util.stream.InterfaceC3866i2
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept((InterfaceC3866i2) ((IntFunction) ((r) this.c).n).apply(i));
                return;
            case 1:
                ((IntConsumer) ((V) this.c).n).accept(i);
                this.a.accept(i);
                return;
            case 2:
                ((C3917t) this.c).getClass();
                IntUnaryOperator intUnaryOperator = null;
                intUnaryOperator.applyAsInt(i);
                throw null;
            case 3:
                ((C3922u) this.c).getClass();
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i);
                throw null;
            case 4:
                ((C3912s) this.c).getClass();
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i);
                throw null;
            default:
                ((C3917t) this.c).getClass();
                IntPredicate intPredicate = null;
                intPredicate.test(i);
                throw null;
        }
    }
}
