/*
 * Decompiled with CFR 0.152.
 */
package ax.H7;

import android.os.Bundle;
import ax.G7.g;
import ax.H7.a;
import ax.H7.b;
import ax.H7.e;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class c
implements b,
a {
    private final e a;
    private final int b;
    private final TimeUnit c;
    private final Object d = new Object();
    private CountDownLatch e;
    private boolean f = false;

    public c(e e8, int n8, TimeUnit timeUnit) {
        this.a = e8;
        this.b = n8;
        this.c = timeUnit;
    }

    @Override
    public void A(String string, Bundle object) {
        object = this.e;
        if (object != null && "_ae".equals(string)) {
            ((CountDownLatch)object).countDown();
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(String string, Bundle bundle) {
        Object object = this.d;
        synchronized (object) {
            Throwable throwable2;
            block7: {
                block6: {
                    g g8 = g.f();
                    Object object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Logging event ");
                    ((StringBuilder)object2).append(string);
                    ((StringBuilder)object2).append(" to Firebase Analytics with params ");
                    ((StringBuilder)object2).append(bundle);
                    g8.i(((StringBuilder)object2).toString());
                    this.e = object2 = new CountDownLatch(1);
                    this.f = false;
                    this.a.a(string, bundle);
                    g.f().i("Awaiting app exception callback from Analytics...");
                    try {
                        block8: {
                            if (this.e.await(this.b, this.c)) {
                                this.f = true;
                                g.f().i("App exception callback received from Analytics listener.");
                                break block6;
                            }
                            break block8;
                            catch (Throwable throwable2) {
                                break block7;
                            }
                        }
                        g.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                    catch (InterruptedException interruptedException) {
                        g.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                    }
                }
                this.e = null;
                return;
            }
            throw throwable2;
        }
    }
}

