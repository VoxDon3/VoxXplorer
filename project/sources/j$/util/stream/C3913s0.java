package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3913s0 extends AbstractC3828b {
    public final j$.nio.file.w j;

    public C3913s0(j$.nio.file.w wVar, AbstractC3823a abstractC3823a, Spliterator spliterator) {
        super(abstractC3823a, spliterator);
        this.j = wVar;
    }

    public C3913s0(C3913s0 c3913s0, Spliterator spliterator) {
        super(c3913s0, spliterator);
        this.j = c3913s0.j;
    }

    @Override // j$.util.stream.AbstractC3838d
    public final AbstractC3838d c(Spliterator spliterator) {
        return new C3913s0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3838d
    public final Object a() {
        AbstractC3823a abstractC3823a = this.a;
        AbstractC3904q0 abstractC3904q0 = (AbstractC3904q0) ((Supplier) this.j.c).get();
        abstractC3823a.Q(this.b, abstractC3904q0);
        boolean z = abstractC3904q0.b;
        if (z == ((EnumC3908r0) this.j.b).b) {
            Boolean valueOf = Boolean.valueOf(z);
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC3828b
    public final Object h() {
        return Boolean.valueOf(!((EnumC3908r0) this.j.b).b);
    }
}
