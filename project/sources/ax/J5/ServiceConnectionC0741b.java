package ax.J5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import ax.M5.C0821p;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ax.J5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class ServiceConnectionC0741b implements ServiceConnection {
    boolean q = false;
    private final BlockingQueue c0 = new LinkedBlockingQueue();

    @ResultIgnorabilityUnspecified
    public IBinder a() throws InterruptedException {
        C0821p.k("BlockingServiceConnection.getService() called on main thread");
        if (this.q) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.q = true;
        return (IBinder) this.c0.take();
    }

    @ResultIgnorabilityUnspecified
    public IBinder b(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C0821p.k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.q) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.q = true;
        IBinder iBinder = (IBinder) this.c0.poll(j, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.c0.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
