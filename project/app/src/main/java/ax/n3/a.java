/*
 * Decompiled with CFR 0.152.
 */
package ax.n3;

import android.content.Context;
import ax.Ha.c;
import ax.b3.j;
import ax.c3.K;
import ax.c3.x;
import ax.g3.h;
import ax.t3.e;
import com.alphainventor.filemanager.file.n;

public class a
implements ax.u3.c {
    Context a;
    K b;
    boolean c;
    private h d;

    public a(Context context, K k8, h h8) {
        this.a = context;
        this.b = k8;
        this.d = h8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a() {
        synchronized (this) {
            this.c = true;
            return true;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(String var1_1, String var2_7, boolean var3_8) {
        var6_9 = x.e(this.b);
        var6_9.n0();
        var5_10 = var1_1;
        if (var1_1 == null) {
            var5_10 = this.b.e();
        }
        this.c = false;
        var1_1 = var6_9.z((String)var5_10);
        if (var1_1 == null) ** GOTO lbl37
        var4_11 = e.h(this.a, this.b.d(), this.b.b(), var1_1.E(), false);
        if (!var1_1.isDirectory()) ** GOTO lbl-1000
        var5_10 = this.d;
        ** try [egrp 1[TRYBLOCK] [5, 4 : 90->122)] { 
lbl-1000:
        // 1 sources

        {
            catch (j var1_6) {}
        }
lbl15:
        // 1 sources

        finally {
            ** GOTO lbl21
        }
        {
            block12: {
                block11: {
                    catch (Throwable var1_4) {
                        break block11;
                    }
                    catch (j var1_5) {
                        break block12;
                    }
lbl21:
                    // 1 sources

                    var6_9.o((n)var1_1, (String)var2_7, var4_11, var3_8, (h)var5_10, this);
                    if (this.isCancelled()) {
                        this.d.o();
                    }
                    var6_9.k0(false);
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var2_7 = ax.Ha.c.h().c("SEARCH NOT DIRECTORY");
                        var1_1 = new StringBuilder();
                        var1_1.append(this.b.toString());
                        var1_1.append(":");
                        var1_1.append((String)var5_10);
                        var2_7.g(var1_1.toString()).h();
                        var1_1 = new j();
                        throw var1_1;
lbl37:
                        // 1 sources

                        var1_1 = new j();
                        throw var1_1;
                    }
                }
                var6_9.k0(false);
                throw var1_3;
            }
            this.d.i();
            var6_9.k0(false);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean isCancelled() {
        synchronized (this) {
            return this.c;
        }
    }
}

