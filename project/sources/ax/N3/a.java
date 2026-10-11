package ax.N3;

import android.content.res.AssetManager;
import android.util.Log;
import ax.N3.b;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class a<T> implements b<T> {
    private final AssetManager c0;
    private T d0;
    private final String q;

    public a(AssetManager assetManager, String str) {
        this.c0 = assetManager;
        this.q = str;
    }

    @Override // ax.N3.b
    public void b() {
        T t = this.d0;
        if (t == null) {
            return;
        }
        try {
            c(t);
        } catch (IOException unused) {
        }
    }

    protected abstract void c(T t) throws IOException;

    @Override // ax.N3.b
    public ax.M3.a d() {
        return ax.M3.a.LOCAL;
    }

    @Override // ax.N3.b
    public void e(ax.J3.g gVar, b.a<? super T> aVar) {
        try {
            T f = f(this.c0, this.q);
            this.d0 = f;
            aVar.f(f);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            aVar.c(e);
        }
    }

    protected abstract T f(AssetManager assetManager, String str) throws IOException;

    @Override // ax.N3.b
    public void cancel() {
    }
}
