/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import ax.Y6.c;
import ax.Y6.d;
import ax.a6.G;
import ax.a6.M0;
import ax.a6.p;

public final class G0
implements c {
    private final p a;
    private final M0 b;
    private final G c;
    private final Object d = new Object();
    private final Object e = new Object();
    private boolean f = false;
    private boolean g = false;
    private d h = new d.a().a();

    public G0(p p8, M0 m02, G g8) {
        this.a = p8;
        this.b = m02;
        this.c = g8;
    }

    @Override
    public final boolean a() {
        int n8;
        p p8 = this.a;
        return p8.f() || (n8 = !this.b() ? 0 : p8.a()) == 1 || n8 == 3;
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean b() {
        Object object = this.d;
        synchronized (object) {
            return this.f;
        }
    }
}

