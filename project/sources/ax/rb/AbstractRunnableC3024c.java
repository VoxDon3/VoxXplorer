package ax.rb;

import ax.qb.C2897e;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/* renamed from: ax.rb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC3024c implements Runnable {
    static int g0;
    static C2897e h0 = C2897e.a();
    String c0;
    Thread d0;
    C3025d e0;
    protected HashMap f0;
    int q = 0;

    public AbstractRunnableC3024c() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transport");
        int i = g0;
        g0 = i + 1;
        sb.append(i);
        this.c0 = sb.toString();
        this.f0 = new HashMap(4);
    }

    private void h() {
        InterfaceC3022a j;
        Thread currentThread = Thread.currentThread();
        while (this.d0 == currentThread) {
            try {
                j = j();
            } catch (Exception e) {
                String message = e.getMessage();
                boolean z = message != null && message.equals("Read timed out");
                boolean z2 = !z;
                if (!z && C2897e.c0 >= 3) {
                    e.printStackTrace(h0);
                }
                try {
                    b(z2);
                } catch (IOException e2) {
                    e2.printStackTrace(h0);
                }
            }
            if (j == null) {
                throw new IOException("end of stream");
            }
            synchronized (this) {
                try {
                    AbstractC3023b abstractC3023b = (AbstractC3023b) this.f0.get(j);
                    if (abstractC3023b == null) {
                        if (C2897e.c0 >= 4) {
                            h0.println("Invalid key, skipping message");
                        }
                        g();
                    } else {
                        e(abstractC3023b);
                        abstractC3023b.c0 = true;
                        notifyAll();
                    }
                } finally {
                }
            }
        }
    }

    public static int k(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read <= 0) {
                break;
            }
            i3 += read;
        }
        return i3;
    }

    public synchronized void a(long j) throws C3025d {
        try {
            try {
                int i = this.q;
                if (i != 0) {
                    if (i != 3) {
                        if (i == 4) {
                            this.q = 0;
                            throw new C3025d("Connection in error", this.e0);
                        }
                        C3025d c3025d = new C3025d("Invalid state: " + this.q);
                        this.q = 0;
                        throw c3025d;
                    }
                    if (i != 0 && i != 3 && i != 4) {
                        if (C2897e.c0 >= 1) {
                            h0.println("Invalid state: " + this.q);
                        }
                        this.q = 0;
                        this.d0 = null;
                    }
                    return;
                }
                this.q = 1;
                this.e0 = null;
                Thread thread = new Thread(this, this.c0);
                this.d0 = thread;
                thread.setDaemon(true);
                synchronized (this.d0) {
                    this.d0.start();
                    this.d0.wait(j);
                    int i2 = this.q;
                    if (i2 == 1) {
                        this.q = 0;
                        this.d0 = null;
                        throw new C3025d("Connection timeout");
                    }
                    if (i2 == 2) {
                        C3025d c3025d2 = this.e0;
                        if (c3025d2 == null) {
                            this.q = 3;
                            return;
                        } else {
                            this.q = 4;
                            this.d0 = null;
                            throw c3025d2;
                        }
                    }
                    if (i2 != 0 && i2 != 3 && i2 != 4) {
                        if (C2897e.c0 >= 1) {
                            h0.println("Invalid state: " + this.q);
                        }
                        this.q = 0;
                        this.d0 = null;
                    }
                }
            } catch (InterruptedException e) {
                this.q = 0;
                this.d0 = null;
                throw new C3025d(e);
            }
        } catch (Throwable th) {
            int i3 = this.q;
            if (i3 != 0 && i3 != 3 && i3 != 4) {
                if (C2897e.c0 >= 1) {
                    h0.println("Invalid state: " + this.q);
                }
                this.q = 0;
                this.d0 = null;
            }
            throw th;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[Catch: all -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0001, B:11:0x0011, B:13:0x0015, B:14:0x0030, B:19:0x0050, B:22:0x0047, B:24:0x0036, B:28:0x0041), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void b(boolean r6) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.q     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L51
            r1 = 2
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == r1) goto L35
            r1 = 3
            if (r0 == r1) goto L36
            r6 = 4
            if (r0 == r6) goto L44
            int r6 = ax.qb.C2897e.c0     // Catch: java.lang.Throwable -> L2e
            if (r6 < r3) goto L30
            ax.qb.e r6 = ax.rb.AbstractRunnableC3024c.h0     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "Invalid state: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L2e
            int r1 = r5.q     // Catch: java.lang.Throwable -> L2e
            r0.append(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2e
            r6.println(r0)     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r6 = move-exception
            goto L53
        L30:
            r5.d0 = r4     // Catch: java.lang.Throwable -> L2e
            r5.q = r2     // Catch: java.lang.Throwable -> L2e
            goto L4c
        L35:
            r6 = 1
        L36:
            java.util.HashMap r0 = r5.f0     // Catch: java.lang.Throwable -> L2e
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L41
            if (r6 != 0) goto L41
            goto L4c
        L41:
            r5.d(r6)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L46
        L44:
            r6 = r4
            goto L47
        L46:
            r6 = move-exception
        L47:
            r5.d0 = r4     // Catch: java.lang.Throwable -> L2e
            r5.q = r2     // Catch: java.lang.Throwable -> L2e
            r4 = r6
        L4c:
            if (r4 != 0) goto L50
            monitor-exit(r5)
            return
        L50:
            throw r4     // Catch: java.lang.Throwable -> L2e
        L51:
            monitor-exit(r5)
            return
        L53:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2e
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.rb.AbstractRunnableC3024c.b(boolean):void");
    }

    protected abstract void c() throws Exception;

    protected abstract void d(boolean z) throws IOException;

    protected abstract void e(AbstractC3023b abstractC3023b) throws IOException;

    protected abstract void f(InterfaceC3022a interfaceC3022a) throws IOException;

    protected abstract void g() throws IOException;

    protected abstract void i(InterfaceC3022a interfaceC3022a) throws IOException;

    protected abstract InterfaceC3022a j() throws IOException;

    public synchronized void l(InterfaceC3022a interfaceC3022a, AbstractC3023b abstractC3023b, long j) throws IOException {
        i(interfaceC3022a);
        abstractC3023b.c0 = false;
        try {
            try {
                try {
                    this.f0.put(interfaceC3022a, abstractC3023b);
                    f(interfaceC3022a);
                    abstractC3023b.q = System.currentTimeMillis() + j;
                    while (!abstractC3023b.c0) {
                        wait(j);
                        j = abstractC3023b.q - System.currentTimeMillis();
                        if (j <= 0) {
                            throw new C3025d(this.c0 + " timedout waiting for response to " + interfaceC3022a);
                        }
                    }
                } catch (InterruptedException e) {
                    throw new C3025d(e);
                }
            } catch (IOException e2) {
                if (C2897e.c0 > 2) {
                    e2.printStackTrace(h0);
                }
                try {
                    b(true);
                } catch (IOException e3) {
                    e3.printStackTrace(h0);
                }
                throw e2;
            }
        } finally {
            this.f0.remove(interfaceC3022a);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Thread currentThread = Thread.currentThread();
        try {
            c();
            synchronized (currentThread) {
                try {
                    if (currentThread != this.d0) {
                        return;
                    }
                    this.q = 2;
                    currentThread.notify();
                    h();
                } finally {
                }
            }
        } catch (Exception e) {
            synchronized (currentThread) {
                try {
                    if (currentThread != this.d0) {
                        if (C2897e.c0 >= 2) {
                            e.printStackTrace(h0);
                        }
                    } else {
                        this.e0 = new C3025d(e);
                        this.q = 2;
                        currentThread.notify();
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            synchronized (currentThread) {
                try {
                    if (currentThread != this.d0) {
                        return;
                    }
                    this.q = 2;
                    currentThread.notify();
                    throw th;
                } finally {
                }
            }
        }
    }

    public String toString() {
        return this.c0;
    }
}
