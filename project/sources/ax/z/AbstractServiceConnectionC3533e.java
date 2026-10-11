package ax.z;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import ax.d.InterfaceC1861b;

/* renamed from: ax.z.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceConnectionC3533e implements ServiceConnection {
    private Context q;

    /* renamed from: ax.z.e$a */
    class a extends C3531c {
        a(InterfaceC1861b interfaceC1861b, ComponentName componentName, Context context) {
            super(interfaceC1861b, componentName, context);
        }
    }

    public abstract void a(ComponentName componentName, C3531c c3531c);

    void b(Context context) {
        this.q = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.q == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        a(componentName, new a(InterfaceC1861b.a.r(iBinder), componentName, this.q));
    }
}
