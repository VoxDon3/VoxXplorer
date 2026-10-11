/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.Bundle;
import android.util.Log;
import ax.b6.L0;
import java.util.concurrent.atomic.AtomicReference;

public final class I0
extends L0 {
    private final AtomicReference<Bundle> e = new AtomicReference();
    private boolean f;

    public static <T> T B(Bundle object, Class<T> object2) {
        Object object3;
        if (object != null && (object3 = object.get("r")) != null) {
            try {
                object = ((Class)object2).cast(object3);
            }
            catch (ClassCastException classCastException) {
                object2 = ((Class)object2).getCanonicalName();
                String string = object3.getClass().getCanonicalName();
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("Unexpected object type. Expected, Received");
                ((StringBuilder)object3).append(": %s, %s");
                Log.w((String)"AM", (String)String.format(((StringBuilder)object3).toString(), object2, string), (Throwable)classCastException);
                throw classCastException;
            }
            return (T)object;
        }
        return null;
    }

    public final Long a2(long l8) {
        return I0.B(this.w(l8), Long.class);
    }

    public final String b2(long l8) {
        return I0.B(this.w(l8), String.class);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void n(Bundle bundle) {
        AtomicReference<Bundle> atomicReference = this.e;
        synchronized (atomicReference) {
            try {
                this.e.set(bundle);
                this.f = true;
            }
            catch (Throwable throwable) {
                this.e.notify();
                throw throwable;
            }
            try {
                this.e.notify();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Bundle w(long l8) {
        AtomicReference<Bundle> atomicReference = this.e;
        synchronized (atomicReference) {
            try {
                boolean bl = this.f;
                if (bl) return this.e.get();
                try {
                    this.e.wait(l8);
                    return this.e.get();
                }
                catch (InterruptedException interruptedException) {
                    return null;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

