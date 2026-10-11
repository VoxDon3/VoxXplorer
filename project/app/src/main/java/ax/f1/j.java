/*
 * Decompiled with CFR 0.152.
 */
package ax.f1;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import ax.S0.a;
import ax.S0.d0;
import ax.S0.k;
import ax.V0.c;
import ax.V0.d;
import ax.V0.f;
import ax.f1.h;
import ax.f1.i;
import ax.f1.z;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

class j
implements z {
    private static final ArrayDeque<b> g = new ArrayDeque();
    private static final Object h = new Object();
    private final MediaCodec a;
    private final HandlerThread b;
    private Handler c;
    private final AtomicReference<RuntimeException> d;
    private final k e;
    private boolean f;

    public j(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new k());
    }

    j(MediaCodec mediaCodec, HandlerThread handlerThread, k k8) {
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = k8;
        this.d = new AtomicReference();
    }

    private void f() throws InterruptedException {
        this.e.d();
        ax.S0.a.e(this.c).obtainMessage(3).sendToTarget();
        this.e.a();
    }

    private static void g(c c8, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = c8.f;
        cryptoInfo.numBytesOfClearData = j.i(c8.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = j.i(c8.e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = ax.S0.a.e(j.h(c8.b, cryptoInfo.key));
        cryptoInfo.iv = ax.S0.a.e(j.h(c8.a, cryptoInfo.iv));
        cryptoInfo.mode = c8.c;
        if (Build.VERSION.SDK_INT >= 24) {
            ax.f1.h.a();
            ax.V0.f.a(cryptoInfo, ax.V0.d.a(c8.g, c8.h));
        }
    }

    private static byte[] h(byte[] byArray, byte[] byArray2) {
        if (byArray == null) {
            return byArray2;
        }
        if (byArray2 != null && byArray2.length >= byArray.length) {
            System.arraycopy(byArray, 0, byArray2, 0, byArray.length);
            return byArray2;
        }
        return Arrays.copyOf(byArray, byArray.length);
    }

    private static int[] i(int[] nArray, int[] nArray2) {
        if (nArray == null) {
            return nArray2;
        }
        if (nArray2 != null && nArray2.length >= nArray.length) {
            System.arraycopy(nArray, 0, nArray2, 0, nArray.length);
            return nArray2;
        }
        return Arrays.copyOf(nArray, nArray.length);
    }

    private void j(Message object) {
        int n8 = object.what;
        if (n8 != 1) {
            if (n8 != 2) {
                Object var3_3 = null;
                if (n8 != 3) {
                    if (n8 != 4) {
                        i.a(this.d, null, new IllegalStateException(String.valueOf(object.what)));
                        object = var3_3;
                    } else {
                        this.m((Bundle)object.obj);
                        object = var3_3;
                    }
                } else {
                    this.e.f();
                    object = var3_3;
                }
            } else {
                object = (b)object.obj;
                this.l(object.a, object.b, object.d, object.e, object.f);
            }
        } else {
            object = (b)object.obj;
            this.k(object.a, object.b, object.c, object.e, object.f);
        }
        if (object != null) {
            j.p((b)object);
        }
    }

    private void k(int n8, int n9, int n10, long l8, int n11) {
        try {
            this.a.queueInputBuffer(n8, n9, n10, l8, n11);
            return;
        }
        catch (RuntimeException runtimeException) {
            i.a(this.d, null, runtimeException);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void l(int n8, int n9, MediaCodec.CryptoInfo cryptoInfo, long l8, int n10) {
        try {
            Object object = h;
            synchronized (object) {
            }
        }
        catch (RuntimeException runtimeException) {
            i.a(this.d, null, runtimeException);
            return;
        }
        {
            this.a.queueSecureInputBuffer(n8, n9, cryptoInfo, l8, n10);
            return;
        }
    }

    private void m(Bundle bundle) {
        try {
            this.a.setParameters(bundle);
            return;
        }
        catch (RuntimeException runtimeException) {
            i.a(this.d, null, runtimeException);
            return;
        }
    }

    private void n() throws InterruptedException {
        ax.S0.a.e(this.c).removeCallbacksAndMessages(null);
        this.f();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static b o() {
        ArrayDeque<b> arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (!arrayDeque.isEmpty()) return arrayDeque.removeFirst();
                return new b();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void p(b b8) {
        ArrayDeque<b> arrayDeque = g;
        synchronized (arrayDeque) {
            arrayDeque.add(b8);
            return;
        }
    }

    @Override
    public void a(Bundle bundle) {
        this.d();
        d0.i(this.c).obtainMessage(4, (Object)bundle).sendToTarget();
    }

    @Override
    public void b(int n8, int n9, c c8, long l8, int n10) {
        this.d();
        b b8 = j.o();
        b8.a(n8, n9, 0, l8, n10);
        j.g(c8, b8.d);
        d0.i(this.c).obtainMessage(2, (Object)b8).sendToTarget();
    }

    @Override
    public void c(int n8, int n9, int n10, long l8, int n11) {
        this.d();
        b b8 = j.o();
        b8.a(n8, n9, n10, l8, n11);
        d0.i(this.c).obtainMessage(1, (Object)b8).sendToTarget();
    }

    @Override
    public void d() {
        RuntimeException runtimeException = this.d.getAndSet(null);
        if (runtimeException == null) {
            return;
        }
        throw runtimeException;
    }

    @Override
    public void flush() {
        if (this.f) {
            try {
                this.n();
                return;
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(interruptedException);
            }
        }
    }

    @Override
    public void shutdown() {
        if (this.f) {
            this.flush();
            this.b.quit();
        }
        this.f = false;
    }

    @Override
    public void start() {
        if (!this.f) {
            this.b.start();
            this.c = new Handler(this, this.b.getLooper()){
                final j a;
                {
                    this.a = j8;
                    super(looper);
                }

                public void handleMessage(Message message) {
                    this.a.j(message);
                }
            };
            this.f = true;
        }
    }

    private static class b {
        public int a;
        public int b;
        public int c;
        public final MediaCodec.CryptoInfo d = new MediaCodec.CryptoInfo();
        public long e;
        public int f;

        b() {
        }

        public void a(int n8, int n9, int n10, long l8, int n11) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.e = l8;
            this.f = n11;
        }
    }
}

