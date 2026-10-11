/*
 * Decompiled with CFR 0.152.
 */
package ax.I6;

import android.content.ContentResolver;
import android.provider.Settings;

public class a {
    public float a(ContentResolver contentResolver) {
        return Settings.Global.getFloat((ContentResolver)contentResolver, (String)"animator_duration_scale", (float)1.0f);
    }
}

