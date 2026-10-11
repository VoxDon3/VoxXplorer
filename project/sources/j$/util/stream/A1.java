package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public final class A1 extends AbstractC3919t1 {
    public final /* synthetic */ int h;

    public /* synthetic */ A1(int i) {
        this.h = i;
    }

    @Override // j$.util.stream.AbstractC3919t1
    public final O1 Z() {
        switch (this.h) {
            case 0:
                return new S1();
            case 1:
                return new Q1();
            case 2:
                return new T1();
            default:
                return new R1();
        }
    }

    @Override // j$.util.stream.AbstractC3919t1, j$.util.stream.B3
    public final Object b(AbstractC3823a abstractC3823a, Spliterator spliterator) {
        switch (this.h) {
            case 0:
                if (!V2.SIZED.q(abstractC3823a.f)) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!V2.SIZED.q(abstractC3823a.f)) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!V2.SIZED.q(abstractC3823a.f)) {
                    break;
                } else {
                    break;
                }
            default:
                if (!V2.SIZED.q(abstractC3823a.f)) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.b(abstractC3823a, spliterator);
    }

    @Override // j$.util.stream.AbstractC3919t1, j$.util.stream.B3
    public final Object c(AbstractC3823a abstractC3823a, Spliterator spliterator) {
        switch (this.h) {
            case 0:
                if (!V2.SIZED.q(abstractC3823a.f)) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!V2.SIZED.q(abstractC3823a.f)) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!V2.SIZED.q(abstractC3823a.f)) {
                    break;
                } else {
                    break;
                }
            default:
                if (!V2.SIZED.q(abstractC3823a.f)) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.c(abstractC3823a, spliterator);
    }

    @Override // j$.util.stream.AbstractC3919t1, j$.util.stream.B3
    public final int d() {
        switch (this.h) {
        }
        return V2.r;
    }
}
