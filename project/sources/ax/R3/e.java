package ax.R3;

import android.util.Log;
import ax.K3.a;
import ax.R3.a;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class e implements a {
    private static e f;
    private final File b;
    private final int c;
    private ax.K3.a e;
    private final c d = new c();
    private final j a = new j();

    protected e(File file, int i) {
        this.b = file;
        this.c = i;
    }

    public static synchronized a c(File file, int i) {
        e eVar;
        synchronized (e.class) {
            try {
                if (f == null) {
                    f = new e(file, i);
                }
                eVar = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    private synchronized ax.K3.a d() throws IOException {
        try {
            if (this.e == null) {
                this.e = ax.K3.a.F(this.b, 1, 1, this.c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.e;
    }

    @Override // ax.R3.a
    public void a(ax.M3.h hVar, a.b bVar) {
        ax.K3.a d;
        this.d.a(hVar);
        try {
            String b = this.a.b(hVar);
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + b + " for for Key: " + hVar);
            }
            try {
                d = d();
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            if (d.v(b) != null) {
                return;
            }
            a.c q = d.q(b);
            if (q == null) {
                throw new IllegalStateException("Had two simultaneous puts for: " + b);
            }
            try {
                if (bVar.a(q.f(0))) {
                    q.e();
                }
                q.b();
            } catch (Throwable th) {
                q.b();
                throw th;
            }
        } finally {
            this.d.b(hVar);
        }
    }

    @Override // ax.R3.a
    public File b(ax.M3.h hVar) {
        String b = this.a.b(hVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + b + " for for Key: " + hVar);
        }
        try {
            a.e v = d().v(b);
            if (v != null) {
                return v.a(0);
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }
}
