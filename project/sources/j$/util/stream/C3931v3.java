package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.v3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3931v3 extends AbstractC3941x3 implements Spliterator, Consumer {
    public Object f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.k(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.com.android.tools.r8.a.m(this, i);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void s(Object obj) {
        this.f = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (d() != EnumC3936w3.NO_MORE && this.a.tryAdvance(this)) {
            if (b(1L) == 1) {
                consumer.s(this.f);
                this.f = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C3837c3 c3837c3 = null;
        while (true) {
            EnumC3936w3 d = d();
            if (d == EnumC3936w3.NO_MORE) {
                return;
            }
            EnumC3936w3 enumC3936w3 = EnumC3936w3.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (d == enumC3936w3) {
                int i = this.c;
                if (c3837c3 == null) {
                    c3837c3 = new C3837c3(i);
                } else {
                    c3837c3.a = 0;
                }
                long j = 0;
                while (spliterator.tryAdvance(c3837c3)) {
                    j++;
                    if (j >= i) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                }
                long b = b(j);
                for (int i2 = 0; i2 < b; i2++) {
                    consumer.s(c3837c3.b[i2]);
                }
            } else {
                spliterator.forEachRemaining(consumer);
                return;
            }
        }
    }

    @Override // j$.util.stream.AbstractC3941x3
    public final Spliterator c(Spliterator spliterator) {
        return new C3931v3(spliterator, this);
    }
}
