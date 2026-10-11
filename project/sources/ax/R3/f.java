package ax.R3;

import android.content.Context;
import ax.R3.d;
import java.io.File;

/* loaded from: classes.dex */
public final class f extends d {

    class a implements d.a {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        a(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // ax.R3.d.a
        public File a() {
            File cacheDir = this.a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.b != null ? new File(cacheDir, this.b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public f(Context context, String str, int i) {
        super(new a(context, str), i);
    }
}
