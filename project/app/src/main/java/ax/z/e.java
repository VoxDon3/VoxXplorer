/*
 * Decompiled with CFR 0.152.
 */
package ax.z;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import ax.d.b;
import ax.z.c;

public abstract class e
implements ServiceConnection {
    private Context q;

    public abstract void a(ComponentName var1, c var2);

    void b(Context context) {
        this.q = context;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.q != null) {
            this.a(componentName, new c(this, b.a.r(iBinder), componentName, this.q){
                final e d;
                {
                    this.d = e8;
                    super(b8, componentName, context);
                }
            });
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}

