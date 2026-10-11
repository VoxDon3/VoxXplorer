/*
 * Decompiled with CFR 0.152.
 */
package ax.X2;

import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import ax.Ha.c;
import ax.X2.N;
import ax.X2.f;
import ax.X2.m;
import ax.X2.n;
import java.io.File;

public class o
extends m {
    public static N d(StorageVolume storageVolume) {
        if (storageVolume == null) {
            return null;
        }
        return new a(storageVolume);
    }

    @Override
    public N b(StorageManager object, File file) {
        try {
            object = this.c(f.a(object, file));
            return object;
        }
        catch (SecurityException securityException) {
            c.h().f().b("GET STORAGE VOLUME ERROR").l(securityException).h();
            return null;
        }
    }

    @Override
    protected N c(StorageVolume storageVolume) {
        if (storageVolume == null) {
            return null;
        }
        return new a(storageVolume);
    }

    private static class a
    extends m.a {
        a(StorageVolume storageVolume) {
            super(storageVolume);
        }

        @Override
        protected String h() {
            File file = n.a(this.i);
            if (file == null) {
                return null;
            }
            return file.getAbsolutePath();
        }
    }
}

