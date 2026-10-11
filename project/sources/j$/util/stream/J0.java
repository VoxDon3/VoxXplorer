package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
public final class J0 extends K0 {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J0(AbstractC3823a abstractC3823a, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator, int i) {
        super(abstractC3823a, spliterator, longFunction, binaryOperator);
        this.k = i;
    }

    @Override // j$.util.stream.K0, j$.util.stream.AbstractC3838d
    public final AbstractC3838d c(Spliterator spliterator) {
        switch (this.k) {
        }
        return new K0(this, spliterator);
    }

    @Override // j$.util.stream.K0, j$.util.stream.AbstractC3838d
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.k) {
        }
        return a();
    }
}
