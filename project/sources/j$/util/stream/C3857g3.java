package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.g3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3857g3 extends X2 implements j$.util.S {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.f(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.v(this, consumer);
    }

    @Override // j$.util.stream.X2
    public final X2 e(Spliterator spliterator) {
        return new C3857g3(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.X2
    public final void d() {
        L2 l2 = new L2();
        this.h = l2;
        Objects.requireNonNull(l2);
        this.e = this.b.R(new C3852f3(l2, 1));
        this.f = new j$.desugar.sun.nio.fs.g(14, this);
    }

    @Override // j$.util.stream.X2, j$.util.Spliterator
    public final j$.util.S trySplit() {
        return (j$.util.S) super.trySplit();
    }

    @Override // j$.util.stream.X2, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.S) super.trySplit();
    }

    @Override // j$.util.stream.X2, j$.util.Spliterator
    public final j$.util.b0 trySplit() {
        return (j$.util.S) super.trySplit();
    }

    @Override // j$.util.b0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        double d;
        Objects.requireNonNull(doubleConsumer);
        boolean a = a();
        if (a) {
            L2 l2 = (L2) this.h;
            long j = this.g;
            int z = l2.z(j);
            if (l2.c == 0 && z == 0) {
                d = ((double[]) l2.e)[(int) j];
            } else {
                d = ((double[][]) l2.f)[z][(int) (j - l2.d[z])];
            }
            doubleConsumer.accept(d);
        }
        return a;
    }

    @Override // j$.util.b0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.h == null && !this.i) {
            Objects.requireNonNull(doubleConsumer);
            c();
            Objects.requireNonNull(doubleConsumer);
            C3852f3 c3852f3 = new C3852f3(doubleConsumer, 0);
            this.b.Q(this.d, c3852f3);
            this.i = true;
            return;
        }
        while (tryAdvance(doubleConsumer)) {
        }
    }
}
