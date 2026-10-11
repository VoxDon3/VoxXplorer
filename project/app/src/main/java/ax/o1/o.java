/*
 * Decompiled with CFR 0.152.
 */
package ax.o1;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import ax.S0.a;
import ax.S0.n;
import ax.S0.p;
import ax.S0.u;

public final class o
extends Surface {
    private static int e0;
    private static boolean f0;
    private final b c0;
    private boolean d0;
    public final boolean q;

    private o(b b8, SurfaceTexture surfaceTexture, boolean bl) {
        super(surfaceTexture);
        this.c0 = b8;
        this.q = bl;
    }

    private static int a(Context object) {
        p.a a82;
        block4: {
            try {
                if (p.m((Context)object)) {
                    boolean bl = p.n();
                    if (bl) {
                        return 1;
                    }
                    return 2;
                }
            }
            catch (p.a a82) {
                break block4;
            }
            return 0;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Failed to determine secure mode due to GL error: ");
        ((StringBuilder)object).append(a82.getMessage());
        u.c("PlaceholderSurface", ((StringBuilder)object).toString());
        return 0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean b(Context context) {
        synchronized (o.class) {
            Throwable throwable2;
            block5: {
                int n8;
                boolean bl;
                block4: {
                    try {
                        boolean bl2 = f0;
                        bl = true;
                        if (bl2) break block4;
                        e0 = o.a(context);
                        f0 = true;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                if ((n8 = e0) == 0) return false;
                return bl;
            }
            throw throwable2;
        }
    }

    public static o c(Context object, boolean bl) {
        int n8 = 0;
        boolean bl2 = !bl || o.b((Context)object);
        a.g(bl2);
        object = new b();
        if (bl) {
            n8 = e0;
        }
        return ((b)((Object)object)).a(n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void release() {
        super.release();
        b b8 = this.c0;
        synchronized (b8) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.d0) break block3;
                        this.c0.c();
                        this.d0 = true;
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

    private static class b
    extends HandlerThread
    implements Handler.Callback {
        private Handler c0;
        private Error d0;
        private RuntimeException e0;
        private o f0;
        private n q;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int n8) throws p.a {
            a.e(this.q);
            this.q.h(n8);
            SurfaceTexture surfaceTexture = this.q.g();
            boolean bl = n8 != 0;
            this.f0 = new o(this, surfaceTexture, bl);
        }

        private void d() {
            a.e(this.q);
            this.q.i();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public o a(int n8) {
            ((Thread)((Object)this)).start();
            this.c0 = new Handler(this.getLooper(), (Handler.Callback)this);
            this.q = new n(this.c0);
            // MONITORENTER : this
            Object object = this.c0;
            int n9 = 0;
            object.obtainMessage(1, n8, 0).sendToTarget();
            n8 = n9;
            while (this.f0 == null && this.e0 == null && (object = this.d0) == null) {
                try {
                    ((Object)((Object)this)).wait();
                }
                catch (InterruptedException interruptedException) {
                    n8 = 1;
                }
            }
            // MONITOREXIT : this
            if (n8 != 0) {
                Thread.currentThread().interrupt();
            }
            if ((object = this.e0) != null) throw object;
            object = this.d0;
            if (object != null) throw object;
            return a.e(this.f0);
        }

        public void c() {
            a.e(this.c0);
            this.c0.sendEmptyMessage(2);
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public boolean handleMessage(Message var1_1) {
            block26: {
                var2_8 = var1_1.what;
                if (var2_8 != 1) {
                    if (var2_8 != 2) {
                        return true;
                    }
                    try {
                        this.d();
                        return true;
                    }
                    catch (Throwable var1_2) {
                        try {
                            u.d("PlaceholderSurface", "Failed to release placeholder surface", var1_2);
                            return true;
                        }
                        finally {
                            this.quit();
                        }
                    }
                }
                try {
                    this.b(var1_1.arg1);
                }
                catch (Throwable var1_4) {
                    break block26;
                }
                catch (Error var1_5) {
                    ** GOTO lbl-1000
                }
                catch (p.a var1_6) {
                    ** GOTO lbl-1000
                }
                catch (RuntimeException var1_7) {
                    ** GOTO lbl-1000
                }
                synchronized (this) {
                    this.notify();
                    return true;
                }
lbl-1000:
                // 1 sources

                {
                    u.d("PlaceholderSurface", "Failed to initialize placeholder surface", var1_5);
                    this.d0 = var1_5;
                }
                synchronized (this) {
                    this.notify();
                    return true;
                }
lbl-1000:
                // 1 sources

                {
                    u.d("PlaceholderSurface", "Failed to initialize placeholder surface", var1_6);
                    var3_9 = new IllegalStateException(var1_6);
                    this.e0 = var3_9;
                }
                synchronized (this) {
                    this.notify();
                    return true;
                }
lbl-1000:
                // 1 sources

                {
                    u.d("PlaceholderSurface", "Failed to initialize placeholder surface", var1_7);
                    this.e0 = var1_7;
                }
                synchronized (this) {
                    this.notify();
                    return true;
                }
            }
            synchronized (this) {
                this.notify();
                throw var1_4;
            }
        }
    }
}

