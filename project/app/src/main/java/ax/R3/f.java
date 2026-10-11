/*
 * Decompiled with CFR 0.152.
 */
package ax.R3;

import android.content.Context;
import ax.R3.d;
import java.io.File;

public final class f
extends d {
    public f(Context context) {
        this(context, "image_manager_disk_cache", 0xFA00000);
    }

    public f(Context context, String string, int n8) {
        super(new d.a(context, string){
            final Context a;
            final String b;
            {
                this.a = context;
                this.b = string;
            }

            @Override
            public File a() {
                File file = this.a.getCacheDir();
                if (file == null) {
                    return null;
                }
                if (this.b != null) {
                    return new File(file, this.b);
                }
                return file;
            }
        }, n8);
    }
}

