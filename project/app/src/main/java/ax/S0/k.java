/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import ax.S0.h;

public class k {
    private final h a;
    private boolean b;

    public k() {
        this(h.a);
    }

    public k(h h8) {
        this.a = h8;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a() throws InterruptedException {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    while (!this.b) {
                        this.a.e();
                        this.wait();
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
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
    public void b() {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                boolean bl = false;
                try {
                    boolean bl2;
                    while (!(bl2 = this.b)) {
                        try {
                            this.a.e();
                            this.wait();
                        }
                        catch (InterruptedException interruptedException) {
                            bl = true;
                        }
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                if (bl) {
                    Thread.currentThread().interrupt();
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
    public boolean c(long l8) {
        synchronized (this) {
            boolean bl;
            boolean bl2;
            long l9;
            block9: {
                Throwable throwable2;
                block8: {
                    if (l8 <= 0L) {
                        try {
                            return this.b;
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                    }
                    long l10 = this.a.b();
                    l9 = l8 + l10;
                    if (l9 < l10) {
                        this.b();
                        return this.b;
                    }
                    bl2 = false;
                    l8 = l10;
                    break block9;
                }
                throw throwable2;
            }
            while (!(bl = this.b) && l8 < l9) {
                try {
                    this.a.e();
                    this.wait(l9 - l8);
                }
                catch (InterruptedException interruptedException) {
                    bl2 = true;
                }
                l8 = this.a.b();
            }
            if (!bl2) return this.b;
            Thread.currentThread().interrupt();
            return this.b;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean d() {
        synchronized (this) {
            boolean bl = this.b;
            this.b = false;
            return bl;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean e() {
        synchronized (this) {
            return this.b;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean f() {
        synchronized (this) {
            boolean bl = this.b;
            if (bl) {
                return false;
            }
            this.b = true;
            this.notifyAll();
            return true;
        }
    }
}

