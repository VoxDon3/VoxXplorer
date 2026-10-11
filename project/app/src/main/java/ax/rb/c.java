/*
 * Decompiled with CFR 0.152.
 */
package ax.rb;

import ax.qb.e;
import ax.rb.a;
import ax.rb.b;
import ax.rb.d;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

public abstract class c
implements Runnable {
    static int g0;
    static e h0;
    String c0;
    Thread d0;
    d e0;
    protected HashMap f0;
    int q = 0;

    static {
        h0 = e.a();
    }

    public c() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Transport");
        int n8 = g0;
        g0 = n8 + 1;
        stringBuilder.append(n8);
        this.c0 = stringBuilder.toString();
        this.f0 = new HashMap(4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void h() {
        Thread thread = Thread.currentThread();
        while (this.d0 == thread) {
            Exception exception2;
            Object object;
            boolean bl;
            block15: {
                block11: {
                    Throwable throwable2;
                    block14: {
                        block16: {
                            block12: {
                                block13: {
                                    bl = true;
                                    try {
                                        object = this.j();
                                        if (object == null) break block11;
                                        // MONITORENTER : this
                                    }
                                    catch (Exception exception2) {
                                        break block15;
                                    }
                                    try {
                                        object = (b)this.f0.get(object);
                                        if (object != null) break block12;
                                        if (e.c0 < 4) break block13;
                                        h0.println("Invalid key, skipping message");
                                    }
                                    catch (Throwable throwable2) {
                                        break block14;
                                    }
                                }
                                this.g();
                                break block16;
                            }
                            this.e((b)object);
                            ((b)object).c0 = true;
                            this.notifyAll();
                        }
                        // MONITOREXIT : this
                        continue;
                    }
                    // MONITOREXIT : this
                    throw throwable2;
                }
                object = new IOException("end of stream");
                throw object;
            }
            object = exception2.getMessage();
            if (object == null || !((String)object).equals("Read timed out")) {
                bl = false;
            }
            if (!bl && e.c0 >= 3) {
                exception2.printStackTrace(h0);
            }
            try {
                this.b(bl ^ true);
            }
            catch (IOException iOException) {
                iOException.printStackTrace(h0);
            }
        }
    }

    public static int k(InputStream inputStream, byte[] byArray, int n8, int n9) throws IOException {
        int n10;
        int n11;
        for (n10 = 0; n10 < n9 && (n11 = inputStream.read(byArray, n8 + n10, n9 - n10)) > 0; n10 += n11) {
        }
        return n10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(long var1_1) throws d {
        synchronized (this) {
            block25: {
                block26: {
                    block22: {
                        var3_2 = this.q;
                        if (var3_2 == 0) break block22;
                        if (var3_2 != 3) {
                            if (var3_2 != 4) {
                                var5_10 = new StringBuilder();
                                var5_10.append("Invalid state: ");
                                var5_10.append(this.q);
                                var4_3 = new d(var5_10.toString());
                                this.q = 0;
                                throw var4_3;
                            }
                            this.q = 0;
                            var4_6 = new d("Connection in error", this.e0);
                            throw var4_6;
                        }
                        if (var3_2 == 0 || var3_2 == 3 || var3_2 == 4) return;
                        try {
                            if (e.c0 >= 1) {
                                var4_7 = c.h0;
                                var5_12 = new StringBuilder();
                                var5_12.append("Invalid state: ");
                                var5_12.append(this.q);
                                var4_7.println(var5_12.toString());
                            }
                            this.q = 0;
                            this.d0 = null;
                            return;
                        }
                        catch (Throwable var4_8) {}
                    }
                    this.q = 1;
                    this.e0 = null;
                    var4_9 = new Thread((Runnable)this, this.c0);
                    this.d0 = var4_9;
                    var4_9.setDaemon(true);
                    var4_9 = this.d0;
                    ** synchronized (var4_9)
lbl-1000:
                    // 1 sources

                    {
                        this.d0.start();
                        this.d0.wait(var1_1);
                        var3_2 = this.q;
                        if (var3_2 == 1) break block23;
                        if (var3_2 == 2) ** break block24
                        // MONITOREXIT @DISABLED, blocks:[3, 9, 10] lbl46 : MonitorExitStatement: MONITOREXIT : var4_9
                        if (var3_2 == 0 || var3_2 == 3 || var3_2 == 4) return;
                    }
                    if (e.c0 >= 1) {
                        var4_9 = c.h0;
                        var5_13 = new StringBuilder();
                        var5_13.append("Invalid state: ");
                        var5_13.append(this.q);
                        var4_9.println(var5_13.toString());
                    }
                    this.q = 0;
                    this.d0 = null;
                    return;
                    {
                        block23: {
                            try {
                                var5_14 = this.e0;
                                if (var5_14 == null) {
                                    this.q = 3;
                                    return;
                                }
                            }
                            catch (Throwable var5_11) {}
                            break block26;
                            this.q = 4;
                            this.d0 = null;
                            throw var5_14;
                        }
                        this.q = 0;
                        this.d0 = null;
                        var5_15 = new d("Connection timeout");
                        throw var5_15;
                    }
                }
                try {
                    throw var5_11;
                }
                catch (Throwable var4_4) {
                    break block25;
                }
                catch (InterruptedException var4_5) {}
                this.q = 0;
                this.d0 = null;
                var5_16 = new d(var4_5);
                throw var5_16;
            }
            var3_2 = this.q;
            if (var3_2 == 0 || var3_2 == 3 || var3_2 == 4) throw var4_4;
            if (e.c0 >= 1) {
                var5_17 = c.h0;
                var6_18 = new StringBuilder();
                var6_18.append("Invalid state: ");
                var6_18.append(this.q);
                var5_17.println(var6_18.toString());
            }
            this.q = 0;
            this.d0 = null;
            throw var4_4;
            throw var4_8;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(boolean bl) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                block7: {
                    Object var3_3;
                    block8: {
                        try {
                            block13: {
                                block12: {
                                    int n8;
                                    block11: {
                                        block10: {
                                            n8 = this.q;
                                            if (n8 == 0) break block7;
                                            var3_3 = null;
                                            if (n8 == 2) break block10;
                                            if (n8 == 3) break block11;
                                            if (n8 == 4) break block12;
                                            if (e.c0 >= 1) {
                                                e e8 = h0;
                                                StringBuilder stringBuilder = new StringBuilder();
                                                stringBuilder.append("Invalid state: ");
                                                stringBuilder.append(this.q);
                                                e8.println(stringBuilder.toString());
                                            }
                                            this.d0 = null;
                                            this.q = 0;
                                            break block13;
                                        }
                                        bl = true;
                                    }
                                    if ((n8 = this.f0.size()) != 0 && !bl) break block13;
                                    try {
                                        this.d(bl);
                                    }
                                    catch (IOException iOException) {
                                        // empty catch block
                                    }
                                }
                                var3_3 = null;
                                this.d0 = null;
                                this.q = 0;
                            }
                            if (var3_3 != null) break block8;
                        }
                        catch (Throwable throwable2) {
                            break block9;
                        }
                        return;
                    }
                    throw var3_3;
                }
                return;
            }
            throw throwable2;
        }
    }

    protected abstract void c() throws Exception;

    protected abstract void d(boolean var1) throws IOException;

    protected abstract void e(b var1) throws IOException;

    protected abstract void f(a var1) throws IOException;

    protected abstract void g() throws IOException;

    protected abstract void i(a var1) throws IOException;

    protected abstract a j() throws IOException;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void l(a var1_1, b var2_3, long var3_6) throws IOException {
        synchronized (this) {
            block14: {
                try {
                    this.i(var1_1);
                    var2_3.c0 = false;
                }
                catch (Throwable var1_2) {
                    break block14;
                }
                try {
                    this.f0.put(var1_1, var2_3);
                    this.f(var1_1);
                    var2_3.q = System.currentTimeMillis() + var3_6;
                    while (!var2_3.c0) {
                        this.wait(var3_6);
                        var3_6 = var2_3.q - System.currentTimeMillis();
                        if (var3_6 > 0L) continue;
                        var5_7 = new StringBuilder();
                        var5_7.append(this.c0);
                        var5_7.append(" timedout waiting for response to ");
                        var5_7.append(var1_1);
                        var2_3 = new d(var5_7.toString());
                        throw var2_3;
                    }
                }
                catch (Throwable var2_4) {
                    ** GOTO lbl-1000
                }
                catch (InterruptedException var5_8) {
                    ** GOTO lbl-1000
                }
                catch (IOException var2_5) {
                    ** GOTO lbl38
                }
                {
                    this.f0.remove(var1_1);
                    return;
                }
lbl-1000:
                // 1 sources

                {
                    var2_3 = new d(var5_8);
                    throw var2_3;
lbl38:
                    // 1 sources

                    if (e.c0 > 2) {
                        var2_5.printStackTrace(c.h0);
                    }
                    try {
                        this.b(true);
                        throw var2_5;
                    }
                    catch (IOException var5_9) {
                        var5_9.printStackTrace(c.h0);
                    }
                    throw var2_5;
                }
lbl-1000:
                // 1 sources

                {
                    this.f0.remove(var1_1);
                    throw var2_4;
                }
            }
            throw var1_2;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        this.c();
        // MONITORENTER : thread
        if (thread != this.d0) {
            // MONITOREXIT : thread
            return;
        }
        this.q = 2;
        thread.notify();
        // MONITOREXIT : thread
        this.h();
        return;
        catch (Throwable throwable) {
            // MONITORENTER : thread
            if (thread != this.d0) {
                // MONITOREXIT : thread
                return;
            }
            this.q = 2;
            thread.notify();
            // MONITOREXIT : thread
            throw throwable;
        }
        catch (Exception exception) {
            // MONITORENTER : thread
            if (thread == this.d0) {
                d d8;
                this.e0 = d8 = new d(exception);
                this.q = 2;
                thread.notify();
                // MONITOREXIT : thread
                return;
            }
            if (e.c0 < 2) return;
            exception.printStackTrace(h0);
            return;
        }
    }

    public String toString() {
        return this.c0;
    }
}

