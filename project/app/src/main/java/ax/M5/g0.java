/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import ax.M5.S;
import ax.M5.c;
import ax.M5.p;

public final class g0
extends S {
    public final IBinder g;
    final c h;

    public g0(c c8, int n8, IBinder iBinder, Bundle bundle) {
        this.h = c8;
        super(c8, n8, bundle);
        this.g = iBinder;
    }

    @Override
    protected final void f(ax.J5.c c8) {
        if (ax.M5.c.V(this.h) != null) {
            ax.M5.c.V(this.h).r(c8);
        }
        this.h.L(c8);
    }

    @Override
    protected final boolean g() {
        Object object;
        block4: {
            String string;
            String string2;
            try {
                object = this.g;
                p.l(object);
                string2 = object.getInterfaceDescriptor();
                if (this.h.E().equals(string2)) break block4;
                string = this.h.E();
                object = new StringBuilder();
                object.append("service descriptor mismatch: ");
            }
            catch (RemoteException remoteException) {
                Log.w((String)"GmsClient", (String)"service probably died");
                return false;
            }
            object.append(string);
            object.append(" vs. ");
            object.append(string2);
            Log.w((String)"GmsClient", (String)object.toString());
            return false;
        }
        object = this.h.s(this.g);
        if (object != null && (ax.M5.c.g0(this.h, 2, 4, (IInterface)object) || ax.M5.c.g0(this.h, 3, 4, (IInterface)object))) {
            ax.M5.c.Z(this.h, null);
            object = this.h;
            Bundle bundle = object.x();
            if (ax.M5.c.U((c)object) != null) {
                ax.M5.c.U(this.h).B(bundle);
            }
            return true;
        }
        return false;
    }
}

