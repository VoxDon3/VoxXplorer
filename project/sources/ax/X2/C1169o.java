package ax.X2;

import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import ax.X2.C1167m;
import java.io.File;

/* renamed from: ax.X2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1169o extends C1167m {

    /* renamed from: ax.X2.o$a */
    private static class a extends C1167m.a {
        a(StorageVolume storageVolume) {
            super(storageVolume);
        }

        @Override // ax.X2.C1167m.a, ax.X2.N
        protected String h() {
            File directory;
            directory = this.i.getDirectory();
            if (directory == null) {
                return null;
            }
            return directory.getAbsolutePath();
        }
    }

    public static N d(StorageVolume storageVolume) {
        if (storageVolume == null) {
            return null;
        }
        return new a(storageVolume);
    }

    @Override // ax.X2.C1167m, ax.X2.C1157c, ax.X2.C1156b, ax.X2.C1155a.InterfaceC0218a
    public N b(StorageManager storageManager, File file) {
        StorageVolume storageVolume;
        try {
            storageVolume = storageManager.getStorageVolume(file);
            return c(storageVolume);
        } catch (SecurityException e) {
            ax.Ha.c.h().f().b("GET STORAGE VOLUME ERROR").l(e).h();
            return null;
        }
    }

    @Override // ax.X2.C1167m
    protected N c(StorageVolume storageVolume) {
        if (storageVolume == null) {
            return null;
        }
        return new a(storageVolume);
    }
}
