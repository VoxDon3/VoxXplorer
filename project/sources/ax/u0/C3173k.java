package ax.u0;

import android.util.AndroidRuntimeException;
import ax.u0.AbstractC3170h;

/* renamed from: ax.u0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3173k extends AbstractC3170h<C3173k> {
    private C3174l B;
    private float C;
    private boolean D;

    public <K> C3173k(K k, AbstractC3171i<K> abstractC3171i) {
        super(k, abstractC3171i);
        this.B = null;
        this.C = Float.MAX_VALUE;
        this.D = false;
    }

    private void p() {
        C3174l c3174l = this.B;
        if (c3174l == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double b = c3174l.b();
        if (b > this.g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (b < this.h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    @Override // ax.u0.AbstractC3170h
    public void j() {
        p();
        this.B.i(e());
        super.j();
    }

    @Override // ax.u0.AbstractC3170h
    boolean l(long j) {
        if (this.D) {
            float f = this.C;
            if (f != Float.MAX_VALUE) {
                this.B.g(f);
                this.C = Float.MAX_VALUE;
            }
            this.b = this.B.b();
            this.a = 0.0f;
            this.D = false;
            return true;
        }
        if (this.C != Float.MAX_VALUE) {
            long j2 = j / 2;
            AbstractC3170h.o j3 = this.B.j(this.b, this.a, j2);
            this.B.g(this.C);
            this.C = Float.MAX_VALUE;
            AbstractC3170h.o j4 = this.B.j(j3.a, j3.b, j2);
            this.b = j4.a;
            this.a = j4.b;
        } else {
            AbstractC3170h.o j5 = this.B.j(this.b, this.a, j);
            this.b = j5.a;
            this.a = j5.b;
        }
        float max = Math.max(this.b, this.h);
        this.b = max;
        float min = Math.min(max, this.g);
        this.b = min;
        if (!o(min, this.a)) {
            return false;
        }
        this.b = this.B.b();
        this.a = 0.0f;
        return true;
    }

    public void m(float f) {
        if (f()) {
            this.C = f;
            return;
        }
        if (this.B == null) {
            this.B = new C3174l(f);
        }
        this.B.g(f);
        j();
    }

    public boolean n() {
        return this.B.b > 0.0d;
    }

    boolean o(float f, float f2) {
        return this.B.e(f, f2);
    }

    public C3173k q(C3174l c3174l) {
        this.B = c3174l;
        return this;
    }

    public void r() {
        if (!n()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!c().j()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f) {
            this.D = true;
        }
    }
}
