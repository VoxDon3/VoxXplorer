package ax.X0;

import android.content.Context;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import androidx.media3.decoder.a;
import ax.P0.C0912v;
import ax.P0.C0916z;
import ax.S0.C0968a;
import ax.S0.d0;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class b extends ax.V0.j<ax.V0.i, SimpleDecoderOutputBuffer, c> {
    private final Context o;
    private ax.A9.b p;
    private ax.J9.c q;
    private ax.G9.b r;
    private ax.J9.a s;
    private double[] t;
    private long u;
    private long v;

    static {
        C0916z.a("media3.decoder.midi");
    }

    public b(Context context) throws c {
        this(context, 16, 16);
    }

    private void A() throws c {
        ax.A9.b a = ax.A9.a.a();
        this.p = a;
        a.f(false);
        ax.J9.c cVar = new ax.J9.c();
        this.q = cVar;
        cVar.p(this.p, 0, 16, 4, h.d((Context) C0968a.e(this.o)));
        this.r = new ax.G9.b(this.q);
        this.s = new ax.J9.a(this.p, 2);
        this.q.c().q(0, this.s.b(), 0);
        this.q.c().q(0, this.s.b(), 1);
        this.p.start();
    }

    public static C0912v D() {
        return d0.l0(4, 2, 44100);
    }

    private void E() throws c {
        this.p.stop();
        this.q.c().i();
        A();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.V0.j
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public c l(Throwable th) {
        return new c("Unexpected decode error", th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.V0.j
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public c m(ax.V0.i iVar, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, boolean z) {
        ByteBuffer byteBuffer = (ByteBuffer) C0968a.e(iVar.e0);
        if (z) {
            this.u = -9223372036854775807L;
            try {
                E();
            } catch (c e) {
                return e;
            }
        }
        if (this.u == -9223372036854775807L) {
            this.v = iVar.g0;
        }
        boolean q = q(iVar.g0);
        if (q) {
            try {
                if (this.u != -9223372036854775807L) {
                    this.p.b((iVar.g0 - r3) * 1.0E-6d);
                }
                this.u = iVar.g0;
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
        if (byteBuffer.remaining() > 0) {
            this.r.n(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
        }
        int a = this.s.a();
        C0968a.g(q || a == 0);
        if (a > this.t.length) {
            this.t = new double[(a * ax.m.j.L0) / 100];
        }
        int i = 0;
        while (i < a) {
            i += this.s.c(this.t, i, a - i);
        }
        simpleDecoderOutputBuffer.D(this.v, i * 4);
        ByteBuffer byteBuffer2 = (ByteBuffer) C0968a.e(simpleDecoderOutputBuffer.g0);
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer2.putFloat((float) this.t[i2]);
        }
        byteBuffer2.flip();
        this.v += ((i * 1000000) / 2) / 44100;
        return null;
    }

    @Override // ax.V0.j, ax.V0.g
    public void d() {
        this.p.stop();
        super.d();
    }

    @Override // ax.V0.g
    public String getName() {
        return "MidiDecoder";
    }

    @Override // ax.V0.j
    protected ax.V0.i j() {
        return new ax.V0.i(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.V0.j
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public SimpleDecoderOutputBuffer k() {
        return new SimpleDecoderOutputBuffer(new a.InterfaceC0027a() { // from class: ax.X0.a
            @Override // androidx.media3.decoder.a.InterfaceC0027a
            public final void a(androidx.media3.decoder.a aVar) {
                b.this.u((SimpleDecoderOutputBuffer) aVar);
            }
        });
    }

    public b(Context context, int i, int i2) throws c {
        super(new ax.V0.i[i], new SimpleDecoderOutputBuffer[i2]);
        this.o = context;
        this.t = new double[8820];
        this.u = -9223372036854775807L;
        A();
    }
}
