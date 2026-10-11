package ax.f1;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import ax.S0.C0968a;
import ax.S0.C0978k;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ax.f1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2016j implements InterfaceC2031z {
    private static final ArrayDeque<b> g = new ArrayDeque<>();
    private static final Object h = new Object();
    private final MediaCodec a;
    private final HandlerThread b;
    private Handler c;
    private final AtomicReference<RuntimeException> d;
    private final C0978k e;
    private boolean f;

    /* renamed from: ax.f1.j$a */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C2016j.this.j(message);
        }
    }

    /* renamed from: ax.f1.j$b */
    private static class b {
        public int a;
        public int b;
        public int c;
        public final MediaCodec.CryptoInfo d = new MediaCodec.CryptoInfo();
        public long e;
        public int f;

        b() {
        }

        public void a(int i, int i2, int i3, long j, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.e = j;
            this.f = i4;
        }
    }

    public C2016j(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new C0978k());
    }

    private void f() throws InterruptedException {
        this.e.d();
        ((Handler) C0968a.e(this.c)).obtainMessage(3).sendToTarget();
        this.e.a();
    }

    private static void g(ax.V0.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f;
        cryptoInfo.numBytesOfClearData = i(cVar.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = i(cVar.e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) C0968a.e(h(cVar.b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) C0968a.e(h(cVar.a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.c;
        if (Build.VERSION.SDK_INT >= 24) {
            C2014h.a();
            cryptoInfo.setPattern(ax.V0.d.a(cVar.g, cVar.h));
        }
    }

    private static byte[] h(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] i(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(android.os.Message r9) {
        /*
            r8 = this;
            int r2 = r9.what
            r3 = 1
            if (r2 == r3) goto L43
            r3 = 2
            if (r2 == r3) goto L2e
            r3 = 3
            r4 = 0
            if (r2 == r3) goto L28
            r3 = 4
            if (r2 == r3) goto L20
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r2 = r8.d
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            int r1 = r9.what
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.<init>(r1)
            ax.f1.C2015i.a(r2, r4, r3)
            goto L57
        L20:
            java.lang.Object r1 = r9.obj
            android.os.Bundle r1 = (android.os.Bundle) r1
            r8.m(r1)
            goto L57
        L28:
            ax.S0.k r1 = r8.e
            r1.f()
            goto L57
        L2e:
            java.lang.Object r1 = r9.obj
            r7 = r1
            ax.f1.j$b r7 = (ax.f1.C2016j.b) r7
            int r1 = r7.a
            int r2 = r7.b
            android.media.MediaCodec$CryptoInfo r3 = r7.d
            long r4 = r7.e
            int r6 = r7.f
            r0 = r8
            r0.l(r1, r2, r3, r4, r6)
        L41:
            r4 = r7
            goto L57
        L43:
            java.lang.Object r0 = r9.obj
            r7 = r0
            ax.f1.j$b r7 = (ax.f1.C2016j.b) r7
            int r1 = r7.a
            int r2 = r7.b
            int r3 = r7.c
            long r4 = r7.e
            int r6 = r7.f
            r0 = r8
            r0.k(r1, r2, r3, r4, r6)
            goto L41
        L57:
            if (r4 == 0) goto L5c
            p(r4)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.f1.C2016j.j(android.os.Message):void");
    }

    private void k(int i, int i2, int i3, long j, int i4) {
        try {
            this.a.queueInputBuffer(i, i2, i3, j, i4);
        } catch (RuntimeException e) {
            C2015i.a(this.d, null, e);
        }
    }

    private void l(int i, int i2, MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
        try {
            synchronized (h) {
                this.a.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
            }
        } catch (RuntimeException e) {
            C2015i.a(this.d, null, e);
        }
    }

    private void m(Bundle bundle) {
        try {
            this.a.setParameters(bundle);
        } catch (RuntimeException e) {
            C2015i.a(this.d, null, e);
        }
    }

    private void n() throws InterruptedException {
        ((Handler) C0968a.e(this.c)).removeCallbacksAndMessages(null);
        f();
    }

    private static b o() {
        ArrayDeque<b> arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void p(b bVar) {
        ArrayDeque<b> arrayDeque = g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    @Override // ax.f1.InterfaceC2031z
    public void a(Bundle bundle) {
        d();
        ((Handler) ax.S0.d0.i(this.c)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // ax.f1.InterfaceC2031z
    public void b(int i, int i2, ax.V0.c cVar, long j, int i3) {
        d();
        b o = o();
        o.a(i, i2, 0, j, i3);
        g(cVar, o.d);
        ((Handler) ax.S0.d0.i(this.c)).obtainMessage(2, o).sendToTarget();
    }

    @Override // ax.f1.InterfaceC2031z
    public void c(int i, int i2, int i3, long j, int i4) {
        d();
        b o = o();
        o.a(i, i2, i3, j, i4);
        ((Handler) ax.S0.d0.i(this.c)).obtainMessage(1, o).sendToTarget();
    }

    @Override // ax.f1.InterfaceC2031z
    public void d() {
        RuntimeException andSet = this.d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    @Override // ax.f1.InterfaceC2031z
    public void flush() {
        if (this.f) {
            try {
                n();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // ax.f1.InterfaceC2031z
    public void shutdown() {
        if (this.f) {
            flush();
            this.b.quit();
        }
        this.f = false;
    }

    @Override // ax.f1.InterfaceC2031z
    public void start() {
        if (this.f) {
            return;
        }
        this.b.start();
        this.c = new a(this.b.getLooper());
        this.f = true;
    }

    C2016j(MediaCodec mediaCodec, HandlerThread handlerThread, C0978k c0978k) {
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = c0978k;
        this.d = new AtomicReference<>();
    }
}
