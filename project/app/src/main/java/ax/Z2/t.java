/*
 * Decompiled with CFR 0.152.
 */
package ax.Z2;

import android.os.SystemClock;
import ax.b3.j;
import ax.c3.K;
import ax.c3.x;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.o;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Logger;

public class t {
    private static final Logger f = Logger.getLogger("FileManager.TempFileManager");
    private static t g;
    private final ArrayList<b> a = new ArrayList();
    private final HashMap<String, b> b = new HashMap();
    private final Comparator<b> c = new Comparator<b>(this){
        final t q;
        {
            this.q = t8;
        }

        public int a(b b8, b b9) {
            long l8 = b8.a - b9.a - 0L;
            long l9 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (l9 == false) {
                return 0;
            }
            if (l9 < 0) {
                return -1;
            }
            return 1;
        }
    };
    private long d;
    private o e = x.e(K.e);

    t() {
    }

    public static t b() {
        if (g == null) {
            g = new t();
        }
        return g;
    }

    private void d(String string) {
        Iterator<b> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            b b8 = iterator.next();
            if (!string.equals(b8.c.E())) continue;
            iterator.remove();
            this.d -= b8.b;
            break;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a() {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                b b8;
                long l8;
                block8: {
                    try {
                        l8 = this.d;
                        if (l8 >= 300000000L) break block8;
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                    return;
                }
                Collections.sort(this.a, this.c);
                Iterator<b> iterator = this.a.iterator();
                while (iterator.hasNext() && (b8 = iterator.next()).a()) {
                    iterator.remove();
                    this.b.remove(b8.c.E());
                    this.d -= b8.b;
                    try {
                        this.e.P(b8.c);
                    }
                    catch (j j8) {
                        j8.printStackTrace();
                    }
                    if ((l8 = this.d) >= 300000000L) continue;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c(File object) {
        synchronized (this) {
            block8: {
                Throwable throwable2;
                block7: {
                    n n8;
                    block6: {
                        try {
                            n8 = this.e.z(((File)object).getAbsolutePath());
                            boolean bl = n8.n();
                            if (bl) break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                        catch (j j8) {
                            break block8;
                        }
                        return;
                    }
                    object = new b(n8);
                    if (this.b.containsKey(n8.E())) {
                        this.d(n8.E());
                    }
                    this.a.add((b)object);
                    this.b.put(n8.E(), (b)object);
                    this.d += ((b)object).b;
                    break block8;
                }
                throw throwable2;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void e(File file) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block3: {
                    block4: {
                        try {
                            if (file.lastModified() >= System.currentTimeMillis()) break block3;
                            file.setLastModified(System.currentTimeMillis());
                            b b8 = this.b.get(file.getAbsolutePath());
                            if (b8 == null) break block4;
                            b8.b();
                            break block3;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    this.c(file);
                }
                return;
            }
            throw throwable2;
        }
    }

    static class b {
        long a;
        long b;
        n c;

        b(n n8) {
            this.c = n8;
            this.b = n8.p();
            this.b();
        }

        boolean a() {
            return SystemClock.uptimeMillis() - this.a > 300000L;
        }

        void b() {
            this.a = SystemClock.uptimeMillis();
        }
    }
}

