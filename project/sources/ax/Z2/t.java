package ax.Z2;

import android.os.SystemClock;
import ax.b3.C1495j;
import ax.c3.C1835x;
import ax.c3.K;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class t {
    private static final Logger f = Logger.getLogger("FileManager.TempFileManager");
    private static t g;
    private long d;
    private final ArrayList<b> a = new ArrayList<>();
    private final HashMap<String, b> b = new HashMap<>();
    private final Comparator<b> c = new a();
    private C3596o e = C1835x.e(K.e);

    class a implements Comparator<b> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            long j = bVar.a - bVar2.a;
            if (j == 0) {
                return 0;
            }
            return j < 0 ? -1 : 1;
        }
    }

    static class b {
        long a;
        long b;
        AbstractC3595n c;

        b(AbstractC3595n abstractC3595n) {
            this.c = abstractC3595n;
            this.b = abstractC3595n.p();
            b();
        }

        boolean a() {
            return SystemClock.uptimeMillis() - this.a > 300000;
        }

        void b() {
            this.a = SystemClock.uptimeMillis();
        }
    }

    t() {
    }

    public static t b() {
        if (g == null) {
            g = new t();
        }
        return g;
    }

    private void d(String str) {
        Iterator<b> it = this.a.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (str.equals(next.c.E())) {
                it.remove();
                this.d -= next.b;
                return;
            }
        }
    }

    public synchronized void a() {
        if (this.d < 300000000) {
            return;
        }
        Collections.sort(this.a, this.c);
        Iterator<b> it = this.a.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (!next.a()) {
                break;
            }
            it.remove();
            this.b.remove(next.c.E());
            this.d -= next.b;
            try {
                this.e.P(next.c);
            } catch (C1495j e) {
                e.printStackTrace();
            }
            if (this.d < 300000000) {
                break;
            }
        }
    }

    public synchronized void c(File file) {
        AbstractC3595n z;
        try {
            z = this.e.z(file.getAbsolutePath());
        } catch (C1495j unused) {
        } catch (Throwable th) {
            throw th;
        }
        if (z.n()) {
            b bVar = new b(z);
            if (this.b.containsKey(z.E())) {
                d(z.E());
            }
            this.a.add(bVar);
            this.b.put(z.E(), bVar);
            this.d += bVar.b;
        }
    }

    public synchronized void e(File file) {
        try {
            if (file.lastModified() < System.currentTimeMillis()) {
                file.setLastModified(System.currentTimeMillis());
                b bVar = this.b.get(file.getAbsolutePath());
                if (bVar != null) {
                    bVar.b();
                } else {
                    c(file);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
