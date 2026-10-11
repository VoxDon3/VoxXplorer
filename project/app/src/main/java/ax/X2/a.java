/*
 * Decompiled with CFR 0.152.
 */
package ax.X2;

import android.os.Build;
import android.os.storage.StorageManager;
import ax.X2.N;
import ax.X2.b;
import ax.X2.c;
import ax.X2.m;
import ax.X2.o;
import java.io.File;
import java.util.List;

public class a {
    static final a a;

    static {
        int n8 = Build.VERSION.SDK_INT;
        a = n8 >= 30 ? new o() : (n8 >= 24 ? new m() : (n8 >= 23 ? new c() : new b()));
    }

    public static N a(StorageManager storageManager, File file) {
        return a.b(storageManager, file);
    }

    public static List<N> b(StorageManager storageManager) {
        return a.a(storageManager);
    }

    static interface a {
        public List<N> a(StorageManager var1);

        public N b(StorageManager var1, File var2);
    }
}

