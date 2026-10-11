package ax.q2;

import android.annotation.SuppressLint;
import android.util.Log;
import ax.Gb.g;
import ax.Gb.l;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ax.q2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2865a {
    public static final C0428a e = new C0428a(null);
    private static final Map<String, Lock> f = new HashMap();
    private final boolean a;
    private final File b;

    @SuppressLint({"SyntheticAccessor"})
    private final Lock c;
    private FileChannel d;

    /* renamed from: ax.q2.a$a, reason: collision with other inner class name */
    public static final class C0428a {
        public /* synthetic */ C0428a(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Lock b(String str) {
            Lock lock;
            synchronized (C2865a.f) {
                try {
                    Map map = C2865a.f;
                    Object obj = map.get(str);
                    if (obj == null) {
                        obj = new ReentrantLock();
                        map.put(str, obj);
                    }
                    lock = (Lock) obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lock;
        }

        private C0428a() {
        }
    }

    public C2865a(String str, File file, boolean z) {
        l.f(str, "name");
        l.f(file, "lockDir");
        this.a = z;
        File file2 = new File(file, str + ".lck");
        this.b = file2;
        C0428a c0428a = e;
        String absolutePath = file2.getAbsolutePath();
        l.e(absolutePath, "lockFile.absolutePath");
        this.c = c0428a.b(absolutePath);
    }

    public static /* synthetic */ void c(C2865a c2865a, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c2865a.a;
        }
        c2865a.b(z);
    }

    public final void b(boolean z) {
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        this.c.lock();
        if (z) {
            try {
                File parentFile = this.b.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new FileOutputStream(this.b).getChannel());
                convertMaybeLegacyFileChannelFromLibrary.lock();
                this.d = convertMaybeLegacyFileChannelFromLibrary;
            } catch (IOException e2) {
                this.d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e2);
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.c.unlock();
    }
}
