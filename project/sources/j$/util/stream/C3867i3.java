package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.i3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3867i3 extends X2 implements j$.util.V {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.w(this, consumer);
    }

    @Override // j$.util.stream.X2
    public final X2 e(Spliterator spliterator) {
        return new C3867i3(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.X2
    public final void d() {
        N2 n2 = new N2();
        this.h = n2;
        Objects.requireNonNull(n2);
        this.e = this.b.R(new C3862h3(n2, 1));
        this.f = new j$.desugar.sun.nio.fs.g(15, this);
    }

    @Override // j$.util.stream.X2, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.V) super.trySplit();
    }

    @Override // j$.util.stream.X2, j$.util.Spliterator
    public final j$.util.V trySplit() {
        return (j$.util.V) super.trySplit();
    }

    @Override // j$.util.stream.X2, j$.util.Spliterator
    public final j$.util.b0 trySplit() {
        return (j$.util.V) super.trySplit();
    }

    @Override // j$.util.b0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i;
        Objects.requireNonNull(intConsumer);
        boolean a = a();
        if (a) {
            N2 n2 = (N2) this.h;
            long j = this.g;
            int z = n2.z(j);
            if (n2.c == 0 && z == 0) {
                i = ((int[]) n2.e)[(int) j];
            } else {
                i = ((int[][]) n2.f)[z][(int) (j - n2.d[z])];
            }
            intConsumer.accept(i);
        }
        return a;
    }

    @Override // j$.util.b0
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.h == null && !this.i) {
            Objects.requireNonNull(intConsumer);
            c();
            Objects.requireNonNull(intConsumer);
            C3862h3 c3862h3 = new C3862h3(intConsumer, 0);
            this.b.Q(this.d, c3862h3);
            this.i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }
}
