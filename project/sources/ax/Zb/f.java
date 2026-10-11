package ax.Zb;

import ax.Vb.C;
import ax.Vb.F;
import ax.wb.i;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
final class f extends C<f> {
    private final AtomicReferenceArray f0;

    public f(long j, f fVar, int i) {
        super(j, fVar, i);
        int i2;
        i2 = e.f;
        this.f0 = new AtomicReferenceArray(i2);
    }

    @Override // ax.Vb.C
    public int n() {
        int i;
        i = e.f;
        return i;
    }

    @Override // ax.Vb.C
    public void o(int i, Throwable th, i iVar) {
        F f;
        f = e.e;
        r().set(i, f);
        p();
    }

    public final AtomicReferenceArray r() {
        return this.f0;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.d0 + ", hashCode=" + hashCode() + ']';
    }
}
