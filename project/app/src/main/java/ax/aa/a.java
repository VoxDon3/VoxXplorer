/*
 * Decompiled with CFR 0.152.
 */
package ax.aa;

import android.graphics.Bitmap;
import java.util.Collection;
import java.util.Comparator;

public class a
implements ax.Z9.a {
    private final ax.Z9.a a;
    private final Comparator<String> b;

    public a(ax.Z9.a a8, Comparator<String> comparator) {
        this.a = a8;
        this.b = comparator;
    }

    @Override
    public Collection<String> a() {
        return this.a.a();
    }

    @Override
    public Bitmap b(String string) {
        return this.a.b(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean c(String string, Bitmap bitmap) {
        ax.Z9.a a8 = this.a;
        synchronized (a8) {
            try {
                String string22;
                block6: {
                    for (String string22 : this.a.a()) {
                        if (this.b.compare(string, string22) != 0) continue;
                        break block6;
                    }
                    string22 = null;
                }
                if (string22 != null) {
                    this.a.b(string22);
                }
                return this.a.c(string, bitmap);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public Bitmap i(String string) {
        return this.a.i(string);
    }
}

