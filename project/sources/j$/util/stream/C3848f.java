package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* renamed from: j$.util.stream.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3848f implements BaseStream {
    public final /* synthetic */ InterfaceC3853g a;

    public /* synthetic */ C3848f(InterfaceC3853g interfaceC3853g) {
        this.a = interfaceC3853g;
    }

    public static /* synthetic */ BaseStream j(InterfaceC3853g interfaceC3853g) {
        if (interfaceC3853g == null) {
            return null;
        }
        return interfaceC3853g instanceof C3843e ? ((C3843e) interfaceC3853g).a : interfaceC3853g instanceof C ? B.j((C) interfaceC3853g) : interfaceC3853g instanceof IntStream ? IntStream.Wrapper.convert((IntStream) interfaceC3853g) : interfaceC3853g instanceof InterfaceC3874k0 ? C3869j0.j((InterfaceC3874k0) interfaceC3853g) : interfaceC3853g instanceof Stream ? Stream.Wrapper.convert((Stream) interfaceC3853g) : new C3848f(interfaceC3853g);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC3853g interfaceC3853g = this.a;
        if (obj instanceof C3848f) {
            obj = ((C3848f) obj).a;
        }
        return interfaceC3853g.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return j(this.a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return j(this.a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return j(this.a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return j(this.a.unordered());
    }
}
