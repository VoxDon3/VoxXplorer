/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.util.Log;
import ax.M5.c;
import java.util.ArrayList;

public abstract class d0 {
    private Object a;
    private boolean b;
    final c c;

    public d0(c c8, Object object) {
        this.c = c8;
        this.a = object;
        this.b = false;
    }

    protected abstract void a(Object var1);

    protected abstract void b();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void c() {
        // MONITORENTER : this
        Object object = this.a;
        if (this.b) {
            String string = this.toString();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Callback proxy ");
            stringBuilder.append(string);
            stringBuilder.append(" being reused. This is not safe.");
            Log.w((String)"GmsClient", (String)stringBuilder.toString());
        }
        if (object != null) {
            this.a(object);
        }
        // MONITORENTER : this
        this.b = true;
        // MONITOREXIT : this
        this.e();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        synchronized (this) {
            this.a = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        this.d();
        ArrayList arrayList = ax.M5.c.Y(this.c);
        synchronized (arrayList) {
            ax.M5.c.Y(this.c).remove(this);
            return;
        }
    }
}

