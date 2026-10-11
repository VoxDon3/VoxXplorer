package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3843e implements InterfaceC3853g, AutoCloseable {
    public final /* synthetic */ BaseStream a;

    public /* synthetic */ C3843e(BaseStream baseStream) {
        this.a = baseStream;
    }

    public static /* synthetic */ InterfaceC3853g j(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C3848f ? ((C3848f) baseStream).a : baseStream instanceof DoubleStream ? A.j((DoubleStream) baseStream) : baseStream instanceof java.util.stream.IntStream ? IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream) : baseStream instanceof LongStream ? C3864i0.j((LongStream) baseStream) : baseStream instanceof java.util.stream.Stream ? T2.j((java.util.stream.Stream) baseStream) : new C3843e(baseStream);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.a;
        if (obj instanceof C3843e) {
            obj = ((C3843e) obj).a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final /* synthetic */ InterfaceC3853g onClose(Runnable runnable) {
        return j(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final /* synthetic */ InterfaceC3853g parallel() {
        return j(this.a.parallel());
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final /* synthetic */ InterfaceC3853g sequential() {
        return j(this.a.sequential());
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.c0.a(this.a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final /* synthetic */ InterfaceC3853g unordered() {
        return j(this.a.unordered());
    }
}
