package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.r3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3911r3 extends AbstractC3926u3 implements j$.util.S, DoubleConsumer {
    public double f;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.util.function.a.c(this, doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.f(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.v(this, consumer);
    }

    @Override // j$.util.stream.AbstractC3941x3
    public final Spliterator c(Spliterator spliterator) {
        return new C3911r3((j$.util.S) spliterator, this);
    }

    @Override // j$.util.stream.AbstractC3926u3
    public final void e(Object obj) {
        ((DoubleConsumer) obj).accept(this.f);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.f = d;
    }

    @Override // j$.util.stream.AbstractC3926u3
    public final AbstractC3832b3 h(int i) {
        return new Y2(i);
    }
}
