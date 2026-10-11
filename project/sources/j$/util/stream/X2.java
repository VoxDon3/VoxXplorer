package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public abstract class X2 implements Spliterator {
    public final boolean a;
    public final AbstractC3823a b;
    public Supplier c;
    public Spliterator d;
    public InterfaceC3866i2 e;
    public BooleanSupplier f;
    public long g;
    public AbstractC3833c h;
    public boolean i;

    public abstract void d();

    public abstract X2 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.com.android.tools.r8.a.m(this, i);
    }

    public X2(AbstractC3823a abstractC3823a, Supplier supplier, boolean z) {
        this.b = abstractC3823a;
        this.c = supplier;
        this.d = null;
        this.a = z;
    }

    public X2(AbstractC3823a abstractC3823a, Spliterator spliterator, boolean z) {
        this.b = abstractC3823a;
        this.c = null;
        this.d = spliterator;
        this.a = z;
    }

    public final void c() {
        if (this.d == null) {
            this.d = (Spliterator) this.c.get();
            this.c = null;
        }
    }

    public final boolean a() {
        AbstractC3833c abstractC3833c = this.h;
        if (abstractC3833c == null) {
            if (this.i) {
                return false;
            }
            c();
            d();
            this.g = 0L;
            this.e.m(this.d.getExactSizeIfKnown());
            return b();
        }
        long j = this.g + 1;
        this.g = j;
        boolean z = j < abstractC3833c.count();
        if (z) {
            return z;
        }
        this.g = 0L;
        this.h.clear();
        return b();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.a || this.h != null || this.i) {
            return null;
        }
        c();
        Spliterator trySplit = this.d.trySplit();
        if (trySplit == null) {
            return null;
        }
        return e(trySplit);
    }

    public final boolean b() {
        while (this.h.count() == 0) {
            if (this.e.q() || !this.f.getAsBoolean()) {
                if (this.i) {
                    return false;
                }
                this.e.l();
                this.i = true;
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (V2.SIZED.q(this.b.f)) {
            return this.d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int i = this.b.f;
        int i2 = i & ((~i) >> 1) & V2.j & V2.f;
        return (i2 & 64) != 0 ? (i2 & (-16449)) | (this.d.characteristics() & 16448) : i2;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (j$.com.android.tools.r8.a.m(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.d);
    }
}
