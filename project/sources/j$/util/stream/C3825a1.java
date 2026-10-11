package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.a1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3825a1 extends Z0 implements InterfaceC3923u0 {
    @Override // j$.util.stream.InterfaceC3866i2, j$.util.stream.InterfaceC3851f2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        AbstractC3919t1.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ void accept(long j) {
        AbstractC3919t1.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        p((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.util.function.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC3856g2
    public final /* synthetic */ void p(Integer num) {
        AbstractC3919t1.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC3933w0
    public final /* bridge */ /* synthetic */ E0 a() {
        a();
        return this;
    }

    @Override // j$.util.stream.InterfaceC3923u0, j$.util.stream.InterfaceC3933w0
    public final A0 a() {
        int i = this.b;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        int[] iArr = this.a;
        if (j != iArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(iArr.length)));
        }
        this.b = 0;
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final void accept(int i) {
        int i2 = this.b;
        int[] iArr = this.a;
        if (i2 < iArr.length) {
            this.b = 1 + i2;
            iArr[i2] = i;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final void l() {
        int i = this.b;
        int[] iArr = this.a;
        if (i < iArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(iArr.length)));
        }
    }

    @Override // j$.util.stream.Z0
    public final String toString() {
        int[] iArr = this.a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.b), Arrays.toString(iArr));
    }
}
