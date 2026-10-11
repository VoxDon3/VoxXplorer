/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ax.M5.h;
import ax.M5.m0;
import ax.M5.o0;
import ax.M5.p;
import ax.M5.q0;
import ax.Q5.b;
import ax.Z5.e;
import java.util.HashMap;
import java.util.concurrent.Executor;

final class r0
extends h {
    private final HashMap f = new HashMap();
    private final Context g;
    private volatile Handler h;
    private final q0 i;
    private final b j;
    private final long k;
    private final long l;
    private volatile Executor m;

    r0(Context context, Looper looper, Executor executor) {
        q0 q02;
        this.i = q02 = new q0(this, null);
        this.g = context.getApplicationContext();
        this.h = new e(looper, q02);
        this.j = b.b();
        this.k = 5000L;
        this.l = 300000L;
        this.m = executor;
    }

    static /* bridge */ /* synthetic */ long i(r0 r02) {
        return r02.l;
    }

    static /* bridge */ /* synthetic */ Context j(r0 r02) {
        return r02.g;
    }

    static /* bridge */ /* synthetic */ Handler k(r0 r02) {
        return r02.h;
    }

    static /* bridge */ /* synthetic */ b l(r0 r02) {
        return r02.j;
    }

    static /* bridge */ /* synthetic */ HashMap m(r0 r02) {
        return r02.f;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final void f(m0 object, ServiceConnection object2, String charSequence) {
        p.m(object2, "ServiceConnection must not be null");
        HashMap hashMap = this.f;
        synchronized (hashMap) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        o0 o02 = (o0)this.f.get(object);
                        if (o02 == null) {
                            object = object.toString();
                            charSequence = new StringBuilder();
                            ((StringBuilder)charSequence).append("Nonexistent connection status for service config: ");
                            ((StringBuilder)charSequence).append((String)object);
                            object2 = new IllegalStateException(((StringBuilder)charSequence).toString());
                            throw object2;
                        }
                        if (!o02.h((ServiceConnection)object2)) {
                            object = object.toString();
                            charSequence = new StringBuilder();
                            ((StringBuilder)charSequence).append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                            ((StringBuilder)charSequence).append((String)object);
                            object2 = new IllegalStateException(((StringBuilder)charSequence).toString());
                            throw object2;
                        }
                        o02.f((ServiceConnection)object2, (String)charSequence);
                        if (!o02.i()) break block5;
                        object = this.h.obtainMessage(0, object);
                        this.h.sendMessageDelayed((Message)object, this.k);
                    }
                    catch (Throwable throwable2) {
                        break block6;
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
    @Override
    protected final boolean h(m0 object, ServiceConnection object2, String string, Executor object3) {
        p.m(object2, "ServiceConnection must not be null");
        HashMap hashMap = this.f;
        synchronized (hashMap) {
            Throwable throwable2;
            block9: {
                Executor executor;
                o0 o02;
                block8: {
                    try {
                        o02 = (o0)this.f.get(object);
                        executor = object3;
                        if (object3 != null) break block8;
                        executor = this.m;
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                }
                if (o02 == null) {
                    object3 = new o0(this, (m0)object);
                    ((o0)object3).d((ServiceConnection)object2, (ServiceConnection)object2, string);
                    ((o0)object3).e(string, executor);
                    this.f.put(object, object3);
                    object = object3;
                    return ((o0)object).j();
                }
                this.h.removeMessages(0, object);
                if (o02.h((ServiceConnection)object2)) {
                    string = object.toString();
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    ((StringBuilder)object).append(string);
                    object2 = new IllegalStateException(((StringBuilder)object).toString());
                    throw object2;
                }
                o02.d((ServiceConnection)object2, (ServiceConnection)object2, string);
                int n8 = o02.a();
                if (n8 != 1) {
                    if (n8 != 2) {
                        object = o02;
                        return ((o0)object).j();
                    } else {
                        o02.e(string, executor);
                        object = o02;
                    }
                    return ((o0)object).j();
                }
                object2.onServiceConnected(o02.b(), o02.c());
                object = o02;
                return ((o0)object).j();
            }
            throw throwable2;
        }
    }
}

