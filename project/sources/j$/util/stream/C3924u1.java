package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* renamed from: j$.util.stream.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3924u1 extends AbstractC3919t1 {
    public final /* synthetic */ LongBinaryOperator h;
    public final /* synthetic */ long i;

    @Override // j$.util.stream.AbstractC3919t1
    public final O1 Z() {
        return new M1(this.i, this.h);
    }

    public C3924u1(W2 w2, LongBinaryOperator longBinaryOperator, long j) {
        this.h = longBinaryOperator;
        this.i = j;
    }
}
