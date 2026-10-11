package j$.util;

import java.util.function.Consumer;

/* renamed from: j$.util.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3820p implements Spliterator {
    public final Spliterator a;

    public C3820p(Spliterator spliterator) {
        this.a = spliterator;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return this.a.tryAdvance(new j$.nio.file.p(consumer, 2));
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        this.a.forEachRemaining(new j$.nio.file.p(consumer, 2));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator trySplit = this.a.trySplit();
        if (trySplit == null) {
            return null;
        }
        return new C3820p(trySplit);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.a.characteristics();
    }

    @Override // j$.util.Spliterator
    public final boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.a.getComparator();
    }
}
