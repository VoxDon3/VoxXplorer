package j$.util;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.function.IntConsumer;

/* renamed from: j$.util.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3954v implements IntConsumer {
    private long count;
    private long sum;
    private int min = SubsamplingScaleImageView.TILE_SIZE_AUTO;
    private int max = Integer.MIN_VALUE;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.util.function.a.d(this, intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.count++;
        this.sum += i;
        this.min = Math.min(this.min, i);
        this.max = Math.max(this.max, i);
    }

    public final void b(C3954v c3954v) {
        this.count += c3954v.count;
        this.sum += c3954v.sum;
        this.min = Math.min(this.min, c3954v.min);
        this.max = Math.max(this.max, c3954v.max);
    }

    public final String toString() {
        String simpleName = C3954v.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        Long valueOf2 = Long.valueOf(this.sum);
        Integer valueOf3 = Integer.valueOf(this.min);
        long j = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(j > 0 ? this.sum / j : 0.0d), Integer.valueOf(this.max));
    }
}
