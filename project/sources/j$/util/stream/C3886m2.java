package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import okhttp3.internal.http2.Http2;

/* renamed from: j$.util.stream.m2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3886m2 extends Z {
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3886m2(AbstractC3824a0 abstractC3824a0, int i, long j, long j2) {
        super(abstractC3824a0, i, 0);
        this.m = j;
        this.n = j2;
    }

    @Override // j$.util.stream.AbstractC3823a
    public final Spliterator K(AbstractC3823a abstractC3823a, Spliterator spliterator) {
        long C = abstractC3823a.C(spliterator);
        long j = this.n;
        if (C > 0 && spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            j$.util.V v = (j$.util.V) abstractC3823a.S(spliterator);
            long j2 = this.m;
            return new C3887m3(v, j2, AbstractC3919t1.A(j2, j));
        }
        if (V2.ORDERED.q(abstractC3823a.f)) {
            return ((E0) new C3915s2(this, abstractC3823a, spliterator, new T(22), this.m, this.n).invoke()).spliterator();
        }
        j$.util.V v2 = (j$.util.V) abstractC3823a.S(spliterator);
        long j3 = this.m;
        if (j3 <= C) {
            long j4 = C - j3;
            if (j >= 0) {
                j4 = Math.min(j, j4);
            }
            j = j4;
            j3 = 0;
        }
        return new C3916s3(v2, j3, j);
    }

    @Override // j$.util.stream.AbstractC3823a
    public final E0 J(AbstractC3823a abstractC3823a, Spliterator spliterator, IntFunction intFunction) {
        long j;
        long j2;
        long C = abstractC3823a.C(spliterator);
        if (C <= 0 || !spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            if (!V2.ORDERED.q(abstractC3823a.f)) {
                j$.util.V v = (j$.util.V) abstractC3823a.S(spliterator);
                long j3 = this.m;
                long j4 = this.n;
                if (j3 <= C) {
                    long j5 = C - j3;
                    j = j4 >= 0 ? Math.min(j4, j5) : j5;
                    j2 = 0;
                } else {
                    j = j4;
                    j2 = j3;
                }
                return AbstractC3919t1.D(this, new C3916s3(v, j2, j), true);
            }
            return (E0) new C3915s2(this, abstractC3823a, spliterator, intFunction, this.m, this.n).invoke();
        }
        AbstractC3823a abstractC3823a2 = abstractC3823a;
        while (abstractC3823a2.e > 0) {
            abstractC3823a2 = abstractC3823a2.b;
        }
        return AbstractC3919t1.D(abstractC3823a, AbstractC3919t1.y(abstractC3823a2.H(), spliterator, this.m, this.n), true);
    }

    @Override // j$.util.stream.AbstractC3823a
    public final InterfaceC3866i2 M(int i, InterfaceC3866i2 interfaceC3866i2) {
        return new C3881l2(this, interfaceC3866i2);
    }
}
