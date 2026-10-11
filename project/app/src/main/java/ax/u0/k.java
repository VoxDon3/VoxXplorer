/*
 * Decompiled with CFR 0.152.
 */
package ax.u0;

import android.util.AndroidRuntimeException;
import ax.u0.h;
import ax.u0.i;
import ax.u0.l;

public final class k
extends h<k> {
    private l B = null;
    private float C = Float.MAX_VALUE;
    private boolean D = false;

    public <K> k(K k8, i<K> i8) {
        super(k8, i8);
    }

    private void p() {
        l l8 = this.B;
        if (l8 != null) {
            double d8 = l8.b();
            if (!(d8 > (double)this.g)) {
                if (!(d8 < (double)this.h)) {
                    return;
                }
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    @Override
    public void j() {
        this.p();
        this.B.i(this.e());
        super.j();
    }

    @Override
    boolean l(long l8) {
        float f8;
        if (this.D) {
            float f9 = this.C;
            if (f9 != Float.MAX_VALUE) {
                this.B.g(f9);
                this.C = Float.MAX_VALUE;
            }
            this.b = this.B.b();
            this.a = 0.0f;
            this.D = false;
            return true;
        }
        if (this.C != Float.MAX_VALUE) {
            Object object = this.B;
            double d8 = this.b;
            double d9 = this.a;
            object = ((l)object).j(d8, d9, l8 /= 2L);
            this.B.g(this.C);
            this.C = Float.MAX_VALUE;
            object = this.B.j(((h.o)object).a, ((h.o)object).b, l8);
            this.b = ((h.o)object).a;
            this.a = ((h.o)object).b;
        } else {
            h.o o8 = this.B.j(this.b, this.a, l8);
            this.b = o8.a;
            this.a = o8.b;
        }
        this.b = f8 = Math.max(this.b, this.h);
        this.b = f8 = Math.min(f8, this.g);
        if (this.o(f8, this.a)) {
            this.b = this.B.b();
            this.a = 0.0f;
            return true;
        }
        return false;
    }

    public void m(float f8) {
        if (this.f()) {
            this.C = f8;
            return;
        }
        if (this.B == null) {
            this.B = new l(f8);
        }
        this.B.g(f8);
        this.j();
    }

    public boolean n() {
        return this.B.b > 0.0;
    }

    boolean o(float f8, float f9) {
        return this.B.e(f8, f9);
    }

    public k q(l l8) {
        this.B = l8;
        return this;
    }

    public void r() {
        if (this.n()) {
            if (this.c().j()) {
                if (this.f) {
                    this.D = true;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }
}

