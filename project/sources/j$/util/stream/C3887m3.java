package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.m3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3887m3 extends AbstractC3897o3 implements j$.util.V {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.w(this, consumer);
    }

    @Override // j$.util.stream.AbstractC3907q3
    public final Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new C3887m3((j$.util.V) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.AbstractC3897o3
    public final Object b() {
        return new C3948z0(1);
    }
}
