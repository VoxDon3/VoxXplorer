package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* renamed from: j$.util.stream.w1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3934w1 extends AbstractC3919t1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ C3934w1(W2 w2, Object obj, int i) {
        this.h = i;
        this.i = obj;
    }

    @Override // j$.util.stream.AbstractC3919t1
    public final O1 Z() {
        switch (this.h) {
            case 0:
                return new N1((LongBinaryOperator) this.i);
            case 1:
                return new C3949z1((DoubleBinaryOperator) this.i);
            case 2:
                return new E1((BinaryOperator) this.i);
            default:
                return new K1((IntBinaryOperator) this.i);
        }
    }
}
