/*
 * Decompiled with CFR 0.152.
 */
package ax.G7;

import ax.G7.e;
import ax.G7.g;
import ax.G7.k;
import ax.K7.m;
import ax.a8.a;
import ax.a8.b;

public class l {
    private final a<ax.l8.a> a;

    public l(a<ax.l8.a> a8) {
        this.a = a8;
    }

    public static /* synthetic */ void a(e e8, b b8) {
        ((ax.l8.a)b8.get()).a("firebase", e8);
        g.f().b("Registering RemoteConfig Rollouts subscriber");
    }

    public void b(m object) {
        if (object == null) {
            g.f().k("Didn't successfully register with UserMetadata for rollouts listener");
            return;
        }
        object = new e((m)object);
        this.a.a(new k((e)object));
    }
}

