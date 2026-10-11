/*
 * Decompiled with CFR 0.152.
 */
package ax.f4;

import ax.M3.f;
import java.util.ArrayList;
import java.util.List;

public final class b {
    private final List<f> a = new ArrayList<f>();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(f f8) {
        synchronized (this) {
            this.a.add(f8);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<f> b() {
        synchronized (this) {
            return this.a;
        }
    }
}

