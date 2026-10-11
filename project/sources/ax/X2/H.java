package ax.X2;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import ax.u3.C3184b;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.HttpUrl;

@TargetApi(30)
/* loaded from: classes.dex */
public class H {

    class a extends StorageManager.StorageVolumeCallback {
        Map<String, Integer> a = new HashMap();
        final /* synthetic */ StorageManager b;
        final /* synthetic */ C1170p c;

        a(StorageManager storageManager, C1170p c1170p) {
            this.b = storageManager;
            this.c = c1170p;
        }

        @Override // android.os.storage.StorageManager.StorageVolumeCallback
        public void onStateChanged(StorageVolume storageVolume) {
            String uuid;
            File directory;
            String str;
            File directory2;
            String state;
            super.onStateChanged(storageVolume);
            O i = w.i(this.b, C1169o.d(storageVolume));
            boolean l = i != null ? i.l() : false;
            uuid = storageVolume.getUuid();
            if (uuid != null) {
                str = storageVolume.getUuid();
            } else {
                directory = storageVolume.getDirectory();
                if (directory != null) {
                    directory2 = storageVolume.getDirectory();
                    str = directory2.getAbsolutePath();
                } else {
                    C3184b.e("no uuid and no path");
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
            }
            Integer num = this.a.get(str);
            int intValue = num != null ? num.intValue() : 0;
            state = storageVolume.getState();
            int b = O.b(state);
            this.a.put(str, Integer.valueOf(b));
            this.c.a(i, intValue, b, l);
        }
    }

    public static void a(Context context, StorageManager storageManager, C1170p c1170p) {
        Executor mainExecutor;
        a aVar = new a(storageManager, c1170p);
        c1170p.b(aVar);
        mainExecutor = context.getMainExecutor();
        storageManager.registerStorageVolumeCallback(mainExecutor, aVar);
    }
}
