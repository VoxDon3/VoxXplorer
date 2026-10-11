package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: j$.util.stream.x3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3941x3 {
    public final Spliterator a;
    public final boolean b;
    public final int c;
    public final long d;
    public final AtomicLong e;

    public abstract Spliterator c(Spliterator spliterator);

    public AbstractC3941x3(Spliterator spliterator, long j, long j2) {
        this.a = spliterator;
        this.b = j2 < 0;
        this.d = j2 >= 0 ? j2 : 0L;
        this.c = 128;
        this.e = new AtomicLong(j2 >= 0 ? j + j2 : j);
    }

    public AbstractC3941x3(Spliterator spliterator, AbstractC3941x3 abstractC3941x3) {
        this.a = spliterator;
        this.b = abstractC3941x3.b;
        this.e = abstractC3941x3.e;
        this.d = abstractC3941x3.d;
        this.c = abstractC3941x3.c;
    }

    public final long b(long j) {
        AtomicLong atomicLong;
        long j2;
        boolean z;
        long min;
        do {
            atomicLong = this.e;
            j2 = atomicLong.get();
            z = this.b;
            if (j2 != 0) {
                min = Math.min(j2, j);
                if (min <= 0) {
                    break;
                }
            } else {
                if (z) {
                    return j;
                }
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j2, j2 - min));
        if (z) {
            return Math.max(j - min, 0L);
        }
        long j3 = this.d;
        return j2 > j3 ? Math.max(min - (j2 - j3), 0L) : min;
    }

    public final EnumC3936w3 d() {
        if (this.e.get() > 0) {
            return EnumC3936w3.MAYBE_MORE;
        }
        return this.b ? EnumC3936w3.UNLIMITED : EnumC3936w3.NO_MORE;
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public final Spliterator m12trySplit() {
        Spliterator trySplit;
        if (this.e.get() == 0 || (trySplit = this.a.trySplit()) == null) {
            return null;
        }
        return c(trySplit);
    }

    public final long estimateSize() {
        return this.a.estimateSize();
    }

    public final int characteristics() {
        return this.a.characteristics() & (-16465);
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.b0 m15trySplit() {
        return (j$.util.b0) m12trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.V m13trySplit() {
        return (j$.util.V) m12trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.Y m14trySplit() {
        return (j$.util.Y) m12trySplit();
    }

    public /* bridge */ /* synthetic */ j$.util.S trySplit() {
        return (j$.util.S) m12trySplit();
    }
}
