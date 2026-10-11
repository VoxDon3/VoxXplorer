/*
 * Decompiled with CFR 0.152.
 */
package ax.q2;

import android.annotation.SuppressLint;
import android.util.Log;
import ax.Gb.g;
import ax.Gb.l;
import ax.g2.b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;

public final class a {
    public static final a e = new a(null);
    private static final Map<String, Lock> f = new HashMap<String, Lock>();
    private final boolean a;
    private final File b;
    @SuppressLint(value={"SyntheticAccessor"})
    private final Lock c;
    private FileChannel d;

    public a(String object, File object2, boolean bl) {
        l.f(object, "name");
        l.f(object2, "lockDir");
        this.a = bl;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append(".lck");
        object2 = new File((File)object2, stringBuilder.toString());
        this.b = object2;
        object = e;
        object2 = ((File)object2).getAbsolutePath();
        l.e(object2, "lockFile.absolutePath");
        this.c = ((a)object).b((String)object2);
    }

    public static /* synthetic */ void c(a a8, boolean bl, int n8, Object object) {
        if ((n8 & 1) != 0) {
            bl = a8.a;
        }
        a8.b(bl);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(boolean bl) {
        this.c.lock();
        if (bl) {
            IOException iOException2;
            block4: {
                Object object;
                block3: {
                    try {
                        object = this.b.getParentFile();
                        if (object == null) break block3;
                        ((File)object).mkdirs();
                    }
                    catch (IOException iOException2) {
                        break block4;
                    }
                }
                object = new FileOutputStream(this.b);
                object = ax.g2.b.a((FileOutputStream)object);
                ((FileChannel)object).lock();
                this.d = object;
                return;
            }
            this.d = null;
            Log.w((String)"SupportSQLiteLock", (String)"Unable to grab file lock.", (Throwable)iOException2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        try {
            FileChannel fileChannel = this.d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }
        catch (IOException iOException) {}
        this.c.unlock();
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private final Lock b(String object) {
            Map map = f;
            synchronized (map) {
                try {
                    Object v8;
                    Map map2 = f;
                    Object object2 = v8 = map2.get(object);
                    if (v8 != null) return (Lock)object2;
                    object2 = new Object();
                    map2.put(object, object2);
                    return (Lock)object2;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }
    }
}

