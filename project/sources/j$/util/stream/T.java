package j$.util.stream;

import j$.util.C3956x;
import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.function.ToLongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class T implements BiConsumer, ObjLongConsumer, LongBinaryOperator, ToLongFunction, IntFunction, LongFunction, Supplier, Consumer, BinaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ T(int i) {
        this.a = i;
    }

    private final void accept$j$$util$stream$Node$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Object obj) {
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void s(Object obj) {
        int i = this.a;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 0:
                break;
            case 4:
                break;
        }
        return j$.util.function.a.a(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
        }
        return j$.util.function.a.b(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 12:
                break;
            case 25:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        switch (this.a) {
            case 6:
                return Long.valueOf(j);
            case 14:
                return AbstractC3919t1.G(j);
            case 16:
                return AbstractC3919t1.P(j);
            default:
                return AbstractC3919t1.Q(j);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j, long j2) {
        switch (this.a) {
            case 2:
                return Math.min(j, j2);
            case 10:
                return Math.max(j, j2);
            default:
                return j + j2;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 5:
                return new Long[i];
            case 13:
                return new Object[i];
            case 21:
                return new Object[i];
            case 22:
                return new Integer[i];
            case 23:
                return new Long[i];
            case 24:
                return new Double[i];
            case 27:
                return new Integer[i];
            case 28:
                return new Integer[i];
            default:
                return new Long[i];
        }
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new long[2];
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j) {
        switch (this.a) {
            case 1:
                ((C3956x) obj).accept(j);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
            case 4:
                ((C3956x) obj).b((C3956x) obj2);
                break;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                break;
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 15:
                return new L0((InterfaceC3943y0) obj, (InterfaceC3943y0) obj2);
            case 16:
            case 18:
            default:
                return new P0((E0) obj, (E0) obj2);
            case 17:
                return new M0((A0) obj, (A0) obj2);
            case 19:
                return new N0((C0) obj, (C0) obj2);
        }
    }
}
