/*
 * Decompiled with CFR 0.152.
 */
package ax.J5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import ax.M5.p;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class b
implements ServiceConnection {
    private final BlockingQueue c0 = new LinkedBlockingQueue();
    boolean q = false;

    @ResultIgnorabilityUnspecified
    public IBinder a() throws InterruptedException {
        p.k("BlockingServiceConnection.getService() called on main thread");
        if (!this.q) {
            this.q = true;
            return (IBinder)this.c0.take();
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @ResultIgnorabilityUnspecified
    public IBinder b(long l8, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        p.k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.q) {
            this.q = true;
            if ((timeUnit = (IBinder)this.c0.poll(l8, timeUnit)) != null) {
                return timeUnit;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.c0.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}

