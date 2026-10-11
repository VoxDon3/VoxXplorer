/*
 * Decompiled with CFR 0.152.
 */
package ax.N3;

import android.content.res.AssetManager;
import android.util.Log;
import ax.J3.g;
import ax.N3.b;
import java.io.IOException;

public abstract class a<T>
implements b<T> {
    private final AssetManager c0;
    private T d0;
    private final String q;

    public a(AssetManager assetManager, String string) {
        this.c0 = assetManager;
        this.q = string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b() {
        T t8 = this.d0;
        if (t8 == null) {
            return;
        }
        try {
            this.c(t8);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    protected abstract void c(T var1) throws IOException;

    @Override
    public void cancel() {
    }

    @Override
    public ax.M3.a d() {
        return ax.M3.a.q;
    }

    @Override
    public void e(g g8, b.a<? super T> a8) {
        try {
            g8 = this.f(this.c0, this.q);
            this.d0 = g8;
            a8.f(g8);
            return;
        }
        catch (IOException iOException) {
            if (Log.isLoggable((String)"AssetPathFetcher", (int)3)) {
                Log.d((String)"AssetPathFetcher", (String)"Failed to load data from asset manager", (Throwable)iOException);
            }
            a8.c(iOException);
            return;
        }
    }

    protected abstract T f(AssetManager var1, String var2) throws IOException;
}

