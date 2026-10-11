/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import ax.M5.m0;
import ax.M5.o0;
import ax.M5.p;
import ax.M5.p0;
import ax.M5.r0;
import java.io.Serializable;
import java.util.HashMap;

final class q0
implements Handler.Callback {
    final r0 q;

    /* synthetic */ q0(r0 r02, p0 p02) {
        this.q = r02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean handleMessage(Message object) {
        int n8 = object.what;
        if (n8 != 0) {
            if (n8 != 1) {
                return false;
            }
            HashMap hashMap = r0.m(this.q);
            synchronized (hashMap) {
                Throwable throwable2;
                block11: {
                    block9: {
                        Serializable serializable;
                        o0 o02;
                        m0 m02;
                        block10: {
                            try {
                                m02 = (m0)object.obj;
                                o02 = (o0)r0.m(this.q).get(m02);
                                if (o02 == null || o02.a() != 3) break block9;
                                object = String.valueOf(m02);
                                serializable = new StringBuilder();
                                serializable.append("Timeout waiting for ServiceConnection callback ");
                                serializable.append((String)object);
                                object = serializable.toString();
                                serializable = new Exception();
                                Log.e((String)"GmsClientSupervisor", (String)object, (Throwable)serializable);
                                serializable = o02.b();
                                object = serializable;
                                if (serializable != null) break block10;
                                object = m02.a();
                            }
                            catch (Throwable throwable2) {
                                break block11;
                            }
                        }
                        serializable = object;
                        if (object == null) {
                            object = m02.c();
                            p.l(object);
                            serializable = new ComponentName((String)object, "unknown");
                        }
                        o02.onServiceDisconnected((ComponentName)serializable);
                    }
                    return true;
                }
                throw throwable2;
            }
        }
        HashMap hashMap = r0.m(this.q);
        synchronized (hashMap) {
            Throwable throwable3;
            block14: {
                block12: {
                    block13: {
                        try {
                            object = (m0)object.obj;
                            o0 o03 = (o0)r0.m(this.q).get(object);
                            if (o03 == null || !o03.i()) break block12;
                            if (!o03.j()) break block13;
                            o03.g("GmsClientSupervisor");
                        }
                        catch (Throwable throwable3) {
                            break block14;
                        }
                    }
                    r0.m(this.q).remove(object);
                }
                return true;
            }
            throw throwable3;
        }
    }
}

