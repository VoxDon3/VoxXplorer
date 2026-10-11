/*
 * Decompiled with CFR 0.152.
 */
package ax.N1;

import ax.N1.k;
import ax.N1.l;
import ax.N1.m;
import ax.N1.p;
import ax.N1.q;
import ax.S0.a;
import ax.V0.i;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public abstract class j
extends ax.V0.j<p, q, m>
implements l {
    private final String o;

    protected j(String string) {
        super((i[])new p[2], (androidx.media3.decoder.a[])new q[2]);
        this.o = string;
        this.x(1024);
    }

    protected final q A() {
        return new q(this){
            final j h0;
            {
                this.h0 = j8;
            }

            @Override
            public void B() {
                this.h0.u(this);
            }
        };
    }

    protected final m B(Throwable throwable) {
        return new m("Unexpected decode error", throwable);
    }

    protected abstract k C(byte[] var1, int var2, boolean var3) throws m;

    protected final m D(p p8, q q8, boolean bl) {
        try {
            Object object = a.e(p8.e0);
            object = this.C(((ByteBuffer)object).array(), ((Buffer)object).limit(), bl);
            q8.C(p8.g0, (k)object, p8.k0);
            q8.e0 = false;
            return null;
        }
        catch (m m8) {
            return m8;
        }
    }

    @Override
    public void e(long l8) {
    }

    @Override
    public final String getName() {
        return this.o;
    }

    protected final p z() {
        return new p();
    }
}

