package ax.f1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import ax.S0.C0968a;
import ax.f1.InterfaceC2029x;
import java.util.ArrayDeque;

/* renamed from: ax.f1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2019m extends MediaCodec.Callback {
    private final HandlerThread b;
    private Handler c;
    private MediaFormat h;
    private MediaFormat i;
    private MediaCodec.CodecException j;
    private MediaCodec.CryptoException k;
    private long l;
    private boolean m;
    private IllegalStateException n;
    private InterfaceC2029x.c o;
    private final Object a = new Object();
    private final ax.B.e d = new ax.B.e();
    private final ax.B.e e = new ax.B.e();
    private final ArrayDeque<MediaCodec.BufferInfo> f = new ArrayDeque<>();
    private final ArrayDeque<MediaFormat> g = new ArrayDeque<>();

    C2019m(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    private void b(MediaFormat mediaFormat) {
        this.e.a(-2);
        this.g.add(mediaFormat);
    }

    private void f() {
        if (!this.g.isEmpty()) {
            this.i = this.g.getLast();
        }
        this.d.b();
        this.e.b();
        this.f.clear();
        this.g.clear();
    }

    private boolean i() {
        return this.l > 0 || this.m;
    }

    private void j() {
        k();
        m();
        l();
    }

    private void k() {
        IllegalStateException illegalStateException = this.n;
        if (illegalStateException == null) {
            return;
        }
        this.n = null;
        throw illegalStateException;
    }

    private void l() {
        MediaCodec.CryptoException cryptoException = this.k;
        if (cryptoException == null) {
            return;
        }
        this.k = null;
        throw cryptoException;
    }

    private void m() {
        MediaCodec.CodecException codecException = this.j;
        if (codecException == null) {
            return;
        }
        this.j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        synchronized (this.a) {
            try {
                if (this.m) {
                    return;
                }
                long j = this.l - 1;
                this.l = j;
                if (j > 0) {
                    return;
                }
                if (j < 0) {
                    o(new IllegalStateException());
                } else {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void o(IllegalStateException illegalStateException) {
        synchronized (this.a) {
            this.n = illegalStateException;
        }
    }

    public int c() {
        synchronized (this.a) {
            try {
                j();
                int i = -1;
                if (i()) {
                    return -1;
                }
                if (!this.d.d()) {
                    i = this.d.e();
                }
                return i;
            } finally {
            }
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            try {
                j();
                if (i()) {
                    return -1;
                }
                if (this.e.d()) {
                    return -1;
                }
                int e = this.e.e();
                if (e >= 0) {
                    C0968a.i(this.h);
                    MediaCodec.BufferInfo remove = this.f.remove();
                    bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
                } else if (e == -2) {
                    this.h = this.g.remove();
                }
                return e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.a) {
            this.l++;
            ((Handler) ax.S0.d0.i(this.c)).post(new Runnable() { // from class: ax.f1.l
                @Override // java.lang.Runnable
                public final void run() {
                    C2019m.this.n();
                }
            });
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.a) {
            try {
                mediaFormat = this.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        C0968a.g(this.c == null);
        this.b.start();
        Handler handler = new Handler(this.b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.c = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.a) {
            this.k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.a) {
            try {
                this.d.a(i);
                InterfaceC2029x.c cVar = this.o;
                if (cVar != null) {
                    cVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    b(mediaFormat);
                    this.i = null;
                }
                this.e.a(i);
                this.f.add(bufferInfo);
                InterfaceC2029x.c cVar = this.o;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            b(mediaFormat);
            this.i = null;
        }
    }

    public void p(InterfaceC2029x.c cVar) {
        synchronized (this.a) {
            this.o = cVar;
        }
    }

    public void q() {
        synchronized (this.a) {
            this.m = true;
            this.b.quit();
            f();
        }
    }
}
