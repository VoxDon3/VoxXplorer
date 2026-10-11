package ax.X2;

import android.os.Build;
import android.os.storage.StorageManager;
import java.io.File;
import java.util.List;

/* renamed from: ax.X2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1155a {
    static final InterfaceC0218a a;

    /* renamed from: ax.X2.a$a, reason: collision with other inner class name */
    interface InterfaceC0218a {
        List<N> a(StorageManager storageManager);

        N b(StorageManager storageManager, File file);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            a = new C1169o();
            return;
        }
        if (i >= 24) {
            a = new C1167m();
        } else if (i >= 23) {
            a = new C1157c();
        } else {
            a = new C1156b();
        }
    }

    public static N a(StorageManager storageManager, File file) {
        return a.b(storageManager, file);
    }

    public static List<N> b(StorageManager storageManager) {
        return a.a(storageManager);
    }
}
