/*
 * Decompiled with CFR 0.152.
 */
package ax.N3;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import ax.J3.g;
import ax.M3.a;
import ax.N3.b;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class j<T>
implements b<T> {
    private final ContentResolver c0;
    private T d0;
    private final Uri q;

    public j(ContentResolver contentResolver, Uri uri) {
        this.c0 = contentResolver;
        this.q = uri;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b() {
        T t8 = this.d0;
        if (t8 == null) return;
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
    public a d() {
        return a.q;
    }

    @Override
    public final void e(g g8, b.a<? super T> a8) {
        try {
            g8 = this.f(this.q, this.c0);
            this.d0 = g8;
            a8.f(g8);
            return;
        }
        catch (FileNotFoundException fileNotFoundException) {
            if (Log.isLoggable((String)"LocalUriFetcher", (int)3)) {
                Log.d((String)"LocalUriFetcher", (String)"Failed to open Uri", (Throwable)fileNotFoundException);
            }
            a8.c(fileNotFoundException);
            return;
        }
    }

    protected abstract T f(Uri var1, ContentResolver var2) throws FileNotFoundException;
}

