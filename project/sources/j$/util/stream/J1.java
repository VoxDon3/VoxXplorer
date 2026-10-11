package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* loaded from: classes2.dex */
public final class J1 extends AbstractC3919t1 {
    public final /* synthetic */ IntBinaryOperator h;
    public final /* synthetic */ int i;

    @Override // j$.util.stream.AbstractC3919t1
    public final O1 Z() {
        return new I1(this.i, this.h);
    }

    public J1(W2 w2, IntBinaryOperator intBinaryOperator, int i) {
        this.h = intBinaryOperator;
        this.i = i;
    }
}
