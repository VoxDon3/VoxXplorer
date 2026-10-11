package ax.N3;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import ax.N3.b;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class j<T> implements b<T> {
    private final ContentResolver c0;
    private T d0;
    private final Uri q;

    public j(ContentResolver contentResolver, Uri uri) {
        this.c0 = contentResolver;
        this.q = uri;
    }

    @Override // ax.N3.b
    public void b() {
        T t = this.d0;
        if (t != null) {
            try {
                c(t);
            } catch (IOException unused) {
            }
        }
    }

    protected abstract void c(T t) throws IOException;

    @Override // ax.N3.b
    public ax.M3.a d() {
        return ax.M3.a.LOCAL;
    }

    @Override // ax.N3.b
    public final void e(ax.J3.g gVar, b.a<? super T> aVar) {
        try {
            T f = f(this.q, this.c0);
            this.d0 = f;
            aVar.f(f);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            aVar.c(e);
        }
    }

    protected abstract T f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    @Override // ax.N3.b
    public void cancel() {
    }
}
