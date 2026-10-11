/*
 * Decompiled with CFR 0.152.
 */
package ax.f1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import ax.B.e;
import ax.S0.a;
import ax.S0.d0;
import ax.f1.k;
import ax.f1.l;
import ax.f1.x;
import java.util.ArrayDeque;

final class m
extends MediaCodec.Callback {
    private final Object a = new Object();
    private final HandlerThread b;
    private Handler c;
    private final e d;
    private final e e;
    private final ArrayDeque<MediaCodec.BufferInfo> f;
    private final ArrayDeque<MediaFormat> g;
    private MediaFormat h;
    private MediaFormat i;
    private MediaCodec.CodecException j;
    private MediaCodec.CryptoException k;
    private long l;
    private boolean m;
    private IllegalStateException n;
    private x.c o;

    m(HandlerThread handlerThread) {
        this.b = handlerThread;
        this.d = new e();
        this.e = new e();
        this.f = new ArrayDeque();
        this.g = new ArrayDeque();
    }

    public static /* synthetic */ void a(m m8) {
        m8.n();
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
        return this.l > 0L || this.m;
        {
        }
    }

    private void j() {
        this.k();
        this.m();
        this.l();
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void n() {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                long l8;
                try {
                    if (this.m) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                this.l = l8 = this.l - 1L;
                if (l8 > 0L) {
                    return;
                }
                if (l8 < 0L) {
                    IllegalStateException illegalStateException = new IllegalStateException();
                    this.o(illegalStateException);
                    return;
                }
                this.f();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void o(IllegalStateException illegalStateException) {
        Object object = this.a;
        synchronized (object) {
            this.n = illegalStateException;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int c() {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                int n8;
                try {
                    this.j();
                    boolean bl = this.i();
                    n8 = -1;
                    if (bl) {
                        return -1;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                if (!this.d.d()) return this.d.e();
                return n8;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int d(MediaCodec.BufferInfo bufferInfo) {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block8: {
                try {
                    this.j();
                    if (this.i()) {
                        return -1;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                if (this.e.d()) {
                    return -1;
                }
                int n8 = this.e.e();
                if (n8 >= 0) {
                    ax.S0.a.i(this.h);
                    MediaCodec.BufferInfo bufferInfo2 = this.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (n8 == -2) {
                    this.h = this.g.remove();
                }
                return n8;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void e() {
        Object object = this.a;
        synchronized (object) {
            ++this.l;
            Handler handler = d0.i(this.c);
            l l8 = new l(this);
            handler.post((Runnable)l8);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public MediaFormat g() {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Object object2;
                try {
                    object2 = this.h;
                    if (object2 != null) {
                        return object2;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object2 = new IllegalStateException();
                throw object2;
            }
            throw throwable2;
        }
    }

    public void h(MediaCodec mediaCodec) {
        boolean bl = this.c == null;
        ax.S0.a.g(bl);
        this.b.start();
        Handler handler = new Handler(this.b.getLooper());
        ax.f1.k.a(mediaCodec, this, handler);
        this.c = handler;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onCryptoError(MediaCodec object, MediaCodec.CryptoException cryptoException) {
        object = this.a;
        synchronized (object) {
            this.k = cryptoException;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onError(MediaCodec object, MediaCodec.CodecException codecException) {
        object = this.a;
        synchronized (object) {
            this.j = codecException;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onInputBufferAvailable(MediaCodec object, int n8) {
        object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        this.d.a(n8);
                        x.c c8 = this.o;
                        if (c8 == null) break block3;
                        c8.b();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onOutputBufferAvailable(MediaCodec object, int n8, MediaCodec.BufferInfo object2) {
        object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        MediaFormat mediaFormat = this.i;
                        if (mediaFormat == null) break block4;
                        this.b(mediaFormat);
                        this.i = null;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                this.e.a(n8);
                this.f.add((MediaCodec.BufferInfo)object2);
                object2 = this.o;
                if (object2 != null) {
                    object2.a();
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onOutputFormatChanged(MediaCodec object, MediaFormat mediaFormat) {
        object = this.a;
        synchronized (object) {
            this.b(mediaFormat);
            this.i = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void p(x.c c8) {
        Object object = this.a;
        synchronized (object) {
            this.o = c8;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void q() {
        Object object = this.a;
        synchronized (object) {
            this.m = true;
            this.b.quit();
            this.f();
            return;
        }
    }
}

