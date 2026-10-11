/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import ax.M5.r;

public final class q {
    private static q b;
    private static final r c;
    private r a;

    static {
        c = new r(0, false, false, 0, 0);
    }

    private q() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static q b() {
        synchronized (q.class) {
            try {
                q q8;
                if (b != null) return b;
                b = q8 = new q();
                return b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public r a() {
        return this.a;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(r var1_1) {
        synchronized (this) {
            block5: {
                block4: {
                    if (var1_1 != null) break block4;
                    try {
                        this.a = q.c;
                        return;
                    }
                    catch (Throwable var1_2) {
                        break block5;
                    }
                }
                var4_3 = this.a;
                if (var4_3 == null || (var2_4 = var4_3.C()) < (var3_5 = var1_1.C())) ** GOTO lbl-1000
                return;
lbl-1000:
                // 1 sources

                {
                    this.a = var1_1;
                    return;
                }
            }
            throw var1_2;
        }
    }
}

