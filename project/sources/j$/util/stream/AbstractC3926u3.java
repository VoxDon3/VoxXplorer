package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.u3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3926u3 extends AbstractC3941x3 implements j$.util.b0 {
    public abstract void e(Object obj);

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.k(this);
    }

    public abstract AbstractC3832b3 h(int i);

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.com.android.tools.r8.a.m(this, i);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.b0
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        while (d() != EnumC3936w3.NO_MORE && ((j$.util.b0) this.a).tryAdvance(this)) {
            if (b(1L) == 1) {
                e(obj);
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.b0
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        AbstractC3832b3 abstractC3832b3 = null;
        while (true) {
            EnumC3936w3 d = d();
            if (d == EnumC3936w3.NO_MORE) {
                return;
            }
            EnumC3936w3 enumC3936w3 = EnumC3936w3.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (d == enumC3936w3) {
                int i = this.c;
                if (abstractC3832b3 == null) {
                    abstractC3832b3 = h(i);
                } else {
                    abstractC3832b3.b = 0;
                }
                long j = 0;
                while (((j$.util.b0) spliterator).tryAdvance(abstractC3832b3)) {
                    j++;
                    if (j >= i) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                } else {
                    abstractC3832b3.b(obj, b(j));
                }
            } else {
                ((j$.util.b0) spliterator).forEachRemaining(obj);
                return;
            }
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
