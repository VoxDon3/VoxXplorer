package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3888n extends Z1 {
    public static I0 T(AbstractC3823a abstractC3823a, Spliterator spliterator) {
        j$.desugar.sun.nio.fs.m mVar = new j$.desugar.sun.nio.fs.m(25);
        j$.desugar.sun.nio.fs.m mVar2 = new j$.desugar.sun.nio.fs.m(26);
        j$.desugar.sun.nio.fs.m mVar3 = new j$.desugar.sun.nio.fs.m(27);
        Objects.requireNonNull(mVar);
        Objects.requireNonNull(mVar2);
        Objects.requireNonNull(mVar3);
        return new I0((Collection) new C3944y1(W2.REFERENCE, mVar3, mVar2, mVar, 3).c(abstractC3823a, spliterator));
    }

    @Override // j$.util.stream.AbstractC3823a
    public final E0 J(AbstractC3823a abstractC3823a, Spliterator spliterator, IntFunction intFunction) {
        if (V2.DISTINCT.q(abstractC3823a.f)) {
            return abstractC3823a.o(spliterator, false, intFunction);
        }
        if (V2.ORDERED.q(abstractC3823a.f)) {
            return T(abstractC3823a, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        j$.nio.file.w wVar = new j$.nio.file.w(5, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(wVar);
        new O(wVar, false).e(abstractC3823a, spliterator);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new I0(keySet);
    }

    @Override // j$.util.stream.AbstractC3823a
    public final Spliterator K(AbstractC3823a abstractC3823a, Spliterator spliterator) {
        if (V2.DISTINCT.q(abstractC3823a.f)) {
            return abstractC3823a.S(spliterator);
        }
        if (V2.ORDERED.q(abstractC3823a.f)) {
            return T(abstractC3823a, spliterator).spliterator();
        }
        return new C3847e3(abstractC3823a.S(spliterator), new ConcurrentHashMap());
    }

    @Override // j$.util.stream.AbstractC3823a
    public final InterfaceC3866i2 M(int i, InterfaceC3866i2 interfaceC3866i2) {
        Objects.requireNonNull(interfaceC3866i2);
        if (V2.DISTINCT.q(i)) {
            return interfaceC3866i2;
        }
        if (V2.SORTED.q(i)) {
            return new C3878l(interfaceC3866i2);
        }
        return new C3883m(interfaceC3866i2);
    }
}
