package j$.util.stream;

import java.util.function.Consumer;

/* renamed from: j$.util.stream.e1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3845e1 extends AbstractC3850f1 implements j$.util.Y {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.x(this, consumer);
    }
}
