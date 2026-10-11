package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* renamed from: j$.util.stream.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3829b0 extends AbstractC3841d2 {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractC3823a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3829b0(AbstractC3823a abstractC3823a, InterfaceC3866i2 interfaceC3866i2, int i) {
        super(interfaceC3866i2);
        this.b = i;
        this.c = abstractC3823a;
    }

    @Override // j$.util.stream.AbstractC3841d2, j$.util.stream.InterfaceC3866i2
    public void m(long j) {
        switch (this.b) {
            case 4:
                this.a.m(-1L);
                break;
            default:
                super.m(j);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC3861h2, j$.util.stream.InterfaceC3866i2
    public final void accept(long j) {
        switch (this.b) {
            case 0:
                this.a.accept((InterfaceC3866i2) ((LongFunction) ((r) this.c).n).apply(j));
                return;
            case 1:
                ((C3922u) this.c).getClass();
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j);
                throw null;
            case 2:
                ((C3917t) this.c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j);
                throw null;
            case 3:
                ((C3912s) this.c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j);
                throw null;
            case 4:
                ((C3922u) this.c).getClass();
                LongPredicate longPredicate = null;
                longPredicate.test(j);
                throw null;
            default:
                ((LongConsumer) ((C3844e0) this.c).n).accept(j);
                this.a.accept(j);
                return;
        }
    }
}
