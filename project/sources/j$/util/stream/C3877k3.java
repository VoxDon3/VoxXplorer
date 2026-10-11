package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.k3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3877k3 extends X2 implements j$.util.Y {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.x(this, consumer);
    }

    @Override // j$.util.stream.X2
    public final X2 e(Spliterator spliterator) {
        return new C3877k3(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.X2
    public final void d() {
        P2 p2 = new P2();
        this.h = p2;
        Objects.requireNonNull(p2);
        this.e = this.b.R(new C3872j3(p2, 1));
        this.f = new j$.desugar.sun.nio.fs.g(16, this);
    }

    @Override // j$.util.stream.X2, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.Y) super.trySplit();
    }

    @Override // j$.util.stream.X2, j$.util.Spliterator
    public final j$.util.Y trySplit() {
        return (j$.util.Y) super.trySplit();
    }

    @Override // j$.util.stream.X2, j$.util.Spliterator
    public final j$.util.b0 trySplit() {
        return (j$.util.Y) super.trySplit();
    }

    @Override // j$.util.b0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        long j;
        Objects.requireNonNull(longConsumer);
        boolean a = a();
        if (a) {
            P2 p2 = (P2) this.h;
            long j2 = this.g;
            int z = p2.z(j2);
            if (p2.c == 0 && z == 0) {
                j = ((long[]) p2.e)[(int) j2];
            } else {
                j = ((long[][]) p2.f)[z][(int) (j2 - p2.d[z])];
            }
            longConsumer.accept(j);
        }
        return a;
    }

    @Override // j$.util.b0
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.h == null && !this.i) {
            Objects.requireNonNull(longConsumer);
            c();
            Objects.requireNonNull(longConsumer);
            C3872j3 c3872j3 = new C3872j3(longConsumer, 0);
            this.b.Q(this.d, c3872j3);
            this.i = true;
            return;
        }
        while (tryAdvance(longConsumer)) {
        }
    }
}
