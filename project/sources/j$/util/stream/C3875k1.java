package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.k1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3875k1 extends P2 implements C0, InterfaceC3928v0 {
    @Override // j$.util.stream.InterfaceC3928v0, j$.util.stream.InterfaceC3933w0
    public final C0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC3933w0
    public final E0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC3866i2, j$.util.stream.InterfaceC3851f2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        AbstractC3919t1.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ void accept(int i) {
        AbstractC3919t1.k();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.E0
    public final /* synthetic */ E0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC3919t1.v(this, j, j2);
    }

    @Override // j$.util.stream.InterfaceC3861h2
    public final /* synthetic */ void j(Long l) {
        AbstractC3919t1.i(this, l);
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final void l() {
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.E0
    public final /* synthetic */ Object[] r(IntFunction intFunction) {
        return AbstractC3919t1.m(this, intFunction);
    }

    @Override // j$.util.stream.E0
    public final /* synthetic */ int u() {
        return 0;
    }

    @Override // j$.util.stream.E0
    public final /* bridge */ /* synthetic */ E0 b(int i) {
        b(i);
        throw null;
    }

    @Override // j$.util.stream.D0, j$.util.stream.E0
    public final D0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.E0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        AbstractC3919t1.p(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.R2, j$.util.stream.D0
    public final void e(Object obj) {
        super.e((LongConsumer) obj);
    }

    @Override // j$.util.stream.R2, j$.util.stream.D0
    public final void v(int i, Object obj) {
        super.v(i, (long[]) obj);
    }

    @Override // j$.util.stream.P2, j$.util.stream.R2, java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.P2, j$.util.stream.R2, java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final j$.util.b0 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        clear();
        B(j);
    }

    @Override // j$.util.stream.R2, j$.util.stream.D0
    public final Object d() {
        return (long[]) super.d();
    }
}
