/*
 * Decompiled with CFR 0.152.
 */
package ax.X0;

import android.content.Context;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import ax.P0.v;
import ax.P0.z;
import ax.S0.d0;
import ax.V0.i;
import ax.V0.j;
import ax.X0.a;
import ax.X0.c;
import ax.X0.h;
import java.nio.ByteBuffer;

final class b
extends j<i, SimpleDecoderOutputBuffer, c> {
    private final Context o;
    private ax.A9.b p;
    private ax.J9.c q;
    private ax.G9.b r;
    private ax.J9.a s;
    private double[] t;
    private long u;
    private long v;

    static {
        z.a("media3.decoder.midi");
    }

    public b(Context context) throws c {
        this(context, 16, 16);
    }

    public b(Context context, int n8, int n9) throws c {
        super(new i[n8], (androidx.media3.decoder.a[])new SimpleDecoderOutputBuffer[n9]);
        this.o = context;
        this.t = new double[8820];
        this.u = -9223372036854775807L;
        this.A();
    }

    private void A() throws c {
        Object object = ax.A9.a.a();
        this.p = object;
        object.f(false);
        this.q = object = new ax.J9.c();
        ((ax.J9.c)object).p(this.p, 0, 16, 4, h.d(ax.S0.a.e(this.o)));
        this.r = new ax.G9.b(this.q);
        this.s = new ax.J9.a(this.p, 2);
        this.q.c().q(0, this.s.b(), 0);
        this.q.c().q(0, this.s.b(), 1);
        this.p.start();
    }

    public static v D() {
        return d0.l0(4, 2, 44100);
    }

    private void E() throws c {
        this.p.stop();
        this.q.c().i();
        this.A();
    }

    public static /* synthetic */ void y(b b8, androidx.media3.decoder.a a8) {
        b8.u(a8);
    }

    protected c B(Throwable throwable) {
        return new c("Unexpected decode error", throwable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected c C(i object, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, boolean bl) {
        int n8;
        ByteBuffer byteBuffer;
        block14: {
            byteBuffer = ax.S0.a.e(((i)object).e0);
            if (bl) {
                this.u = -9223372036854775807L;
                try {
                    this.E();
                }
                catch (c c8) {
                    return c8;
                }
            }
            if (this.u == -9223372036854775807L) {
                this.v = ((i)object).g0;
            }
            if (bl = this.q(((i)object).g0)) {
                InterruptedException interruptedException2;
                block13: {
                    block12: {
                        try {
                            long l8 = this.u;
                            if (l8 == -9223372036854775807L) break block12;
                            double d8 = ((i)object).g0 - l8;
                            this.p.b(d8 * 1.0E-6);
                        }
                        catch (InterruptedException interruptedException2) {
                            break block13;
                        }
                    }
                    this.u = ((i)object).g0;
                    break block14;
                }
                Thread.currentThread().interrupt();
                throw new IllegalStateException(interruptedException2);
            }
        }
        if (byteBuffer.remaining() > 0) {
            this.r.n(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
        }
        int n9 = this.s.a();
        int n10 = 0;
        bl = bl || n9 == 0;
        ax.S0.a.g(bl);
        if (n9 > this.t.length) {
            this.t = new double[n9 * 125 / 100];
        }
        for (n8 = 0; n8 < n9; n8 += this.s.c(this.t, n8, n9 - n8)) {
        }
        simpleDecoderOutputBuffer.D(this.v, n8 * 4);
        object = ax.S0.a.e(simpleDecoderOutputBuffer.g0);
        while (true) {
            if (n10 >= n8) {
                ((ByteBuffer)object).flip();
                this.v += (long)n8 * 1000000L / 2L / 44100L;
                return null;
            }
            ((ByteBuffer)object).putFloat((float)this.t[n10]);
            ++n10;
        }
    }

    @Override
    public void d() {
        this.p.stop();
        super.d();
    }

    @Override
    public String getName() {
        return "MidiDecoder";
    }

    @Override
    protected i j() {
        return new i(1);
    }

    protected SimpleDecoderOutputBuffer z() {
        return new SimpleDecoderOutputBuffer(new a(this));
    }
}

