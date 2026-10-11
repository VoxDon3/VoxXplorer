package ax.f1;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import ax.P0.C0912v;
import ax.f1.C2011e;
import ax.f1.InterfaceC2029x;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: ax.f1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2011e implements InterfaceC2029x {
    private final MediaCodec a;
    private final C2019m b;
    private final InterfaceC2031z c;
    private final C2025t d;
    private boolean e;
    private int f;

    /* renamed from: ax.f1.e$b */
    public static final class b implements InterfaceC2029x.b {
        private final ax.q7.u<HandlerThread> b;
        private final ax.q7.u<HandlerThread> c;
        private boolean d;

        public b(final int i) {
            this(new ax.q7.u() { // from class: ax.f1.f
                @Override // ax.q7.u
                public final Object get() {
                    return C2011e.b.c(i);
                }
            }, new ax.q7.u() { // from class: ax.f1.g
                @Override // ax.q7.u
                public final Object get() {
                    return C2011e.b.b(i);
                }
            });
        }

        public static /* synthetic */ HandlerThread b(int i) {
            return new HandlerThread(C2011e.w(i));
        }

        public static /* synthetic */ HandlerThread c(int i) {
            return new HandlerThread(C2011e.v(i));
        }

        private static boolean f(C0912v c0912v) {
            int i = Build.VERSION.SDK_INT;
            if (i < 34) {
                return false;
            }
            return i >= 35 || ax.P0.D.s(c0912v.o);
        }

        @Override // ax.f1.InterfaceC2029x.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C2011e a(InterfaceC2029x.a aVar) throws IOException {
            Exception exc;
            MediaCodec mediaCodec;
            InterfaceC2031z c2016j;
            int i;
            String str = aVar.a.a;
            C2011e c2011e = null;
            try {
                ax.S0.N.a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    if (this.d && f(aVar.c)) {
                        c2016j = new d0(mediaCodec);
                        i = 4;
                    } else {
                        c2016j = new C2016j(mediaCodec, this.c.get());
                        i = 0;
                    }
                    C2011e c2011e2 = new C2011e(mediaCodec, this.b.get(), c2016j, aVar.f);
                    try {
                        ax.S0.N.b();
                        Surface surface = aVar.d;
                        if (surface == null && aVar.a.k && Build.VERSION.SDK_INT >= 35) {
                            i |= 8;
                        }
                        c2011e2.y(aVar.b, surface, aVar.e, i);
                        return c2011e2;
                    } catch (Exception e) {
                        exc = e;
                        c2011e = c2011e2;
                        if (c2011e != null) {
                            c2011e.d();
                            throw exc;
                        }
                        if (mediaCodec == null) {
                            throw exc;
                        }
                        mediaCodec.release();
                        throw exc;
                    }
                } catch (Exception e2) {
                    exc = e2;
                }
            } catch (Exception e3) {
                exc = e3;
                mediaCodec = null;
            }
        }

        public void e(boolean z) {
            this.d = z;
        }

        public b(ax.q7.u<HandlerThread> uVar, ax.q7.u<HandlerThread> uVar2) {
            this.b = uVar;
            this.c = uVar2;
            this.d = false;
        }
    }

    public static /* synthetic */ void r(C2011e c2011e, InterfaceC2029x.d dVar, MediaCodec mediaCodec, long j, long j2) {
        c2011e.getClass();
        dVar.a(c2011e, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String v(int i) {
        return x(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String w(int i) {
        return x(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String x(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        C2025t c2025t;
        this.b.h(this.a);
        ax.S0.N.a("configureCodec");
        this.a.configure(mediaFormat, surface, mediaCrypto, i);
        ax.S0.N.b();
        this.c.start();
        ax.S0.N.a("startCodec");
        this.a.start();
        ax.S0.N.b();
        if (Build.VERSION.SDK_INT >= 35 && (c2025t = this.d) != null) {
            c2025t.b(this.a);
        }
        this.f = 1;
    }

    @Override // ax.f1.InterfaceC2029x
    public void a(Bundle bundle) {
        this.c.a(bundle);
    }

    @Override // ax.f1.InterfaceC2029x
    public void b(int i, int i2, ax.V0.c cVar, long j, int i3) {
        this.c.b(i, i2, cVar, j, i3);
    }

    @Override // ax.f1.InterfaceC2029x
    public void c(int i, int i2, int i3, long j, int i4) {
        this.c.c(i, i2, i3, j, i4);
    }

    @Override // ax.f1.InterfaceC2029x
    public void d() {
        C2025t c2025t;
        C2025t c2025t2;
        try {
            if (this.f == 1) {
                this.c.shutdown();
                this.b.q();
            }
            this.f = 2;
            if (this.e) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.a.stop();
                }
                if (i >= 35 && (c2025t2 = this.d) != null) {
                    c2025t2.d(this.a);
                }
                this.a.release();
                this.e = true;
            } finally {
            }
        } catch (Throwable th) {
            if (!this.e) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.a.stop();
                    }
                    if (i2 >= 35 && (c2025t = this.d) != null) {
                        c2025t.d(this.a);
                    }
                    this.a.release();
                    this.e = true;
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // ax.f1.InterfaceC2029x
    public boolean e() {
        return false;
    }

    @Override // ax.f1.InterfaceC2029x
    public MediaFormat f() {
        return this.b.g();
    }

    @Override // ax.f1.InterfaceC2029x
    public void flush() {
        this.c.flush();
        this.a.flush();
        this.b.e();
        this.a.start();
    }

    @Override // ax.f1.InterfaceC2029x
    public void g() {
        this.a.detachOutputSurface();
    }

    @Override // ax.f1.InterfaceC2029x
    public boolean h(InterfaceC2029x.c cVar) {
        this.b.p(cVar);
        return true;
    }

    @Override // ax.f1.InterfaceC2029x
    public void i(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // ax.f1.InterfaceC2029x
    public int j() {
        this.c.d();
        return this.b.c();
    }

    @Override // ax.f1.InterfaceC2029x
    public void k(final InterfaceC2029x.d dVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: ax.f1.d
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                C2011e.r(C2011e.this, dVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // ax.f1.InterfaceC2029x
    public int l(MediaCodec.BufferInfo bufferInfo) {
        this.c.d();
        return this.b.d(bufferInfo);
    }

    @Override // ax.f1.InterfaceC2029x
    public void m(int i, boolean z) {
        this.a.releaseOutputBuffer(i, z);
    }

    @Override // ax.f1.InterfaceC2029x
    public void n(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // ax.f1.InterfaceC2029x
    public ByteBuffer o(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // ax.f1.InterfaceC2029x
    public void p(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // ax.f1.InterfaceC2029x
    public ByteBuffer q(int i) {
        return this.a.getOutputBuffer(i);
    }

    private C2011e(MediaCodec mediaCodec, HandlerThread handlerThread, InterfaceC2031z interfaceC2031z, C2025t c2025t) {
        this.a = mediaCodec;
        this.b = new C2019m(handlerThread);
        this.c = interfaceC2031z;
        this.d = c2025t;
        this.f = 0;
    }
}
