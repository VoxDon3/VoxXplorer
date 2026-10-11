/*
 * Decompiled with CFR 0.152.
 */
package ax.X2;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import ax.X2.F;
import ax.X2.G;
import ax.X2.N;
import ax.X2.O;
import ax.X2.j;
import ax.X2.k;
import ax.X2.n;
import ax.X2.o;
import ax.X2.p;
import ax.X2.w;
import ax.u3.b;
import java.util.HashMap;
import java.util.Map;

@TargetApi(value=30)
public class H {
    public static void a(Context context, StorageManager storageManager, p p8) {
        StorageManager.StorageVolumeCallback storageVolumeCallback = new StorageManager.StorageVolumeCallback(storageManager, p8){
            Map<String, Integer> a;
            final StorageManager b;
            final p c;
            {
                this.b = storageManager;
                this.c = p8;
                this.a = new HashMap<String, Integer>();
            }

            public void onStateChanged(StorageVolume storageVolume) {
                super.onStateChanged(storageVolume);
                Object object = o.d(storageVolume);
                O o8 = w.i(this.b, (N)object);
                int n8 = 0;
                boolean bl = o8 != null ? o8.l() : false;
                if (k.a(storageVolume) != null) {
                    object = k.a(storageVolume);
                } else if (n.a(storageVolume) != null) {
                    object = n.a(storageVolume).getAbsolutePath();
                } else {
                    b.e("no uuid and no path");
                    object = "";
                }
                Integer n9 = this.a.get(object);
                if (n9 != null) {
                    n8 = n9;
                }
                int n10 = O.b(j.a(storageVolume));
                this.a.put((String)object, n10);
                this.c.a(o8, n8, n10, bl);
            }
        };
        p8.b(storageVolumeCallback);
        G.a(storageManager, F.a(context), storageVolumeCallback);
    }
}

