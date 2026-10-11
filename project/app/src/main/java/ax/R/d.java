/*
 * Decompiled with CFR 0.152.
 */
package ax.R;

import android.content.ComponentName;
import android.content.pm.ShortcutInfo;

public final class d {
    public static /* bridge */ /* synthetic */ ShortcutInfo.Builder a(ShortcutInfo.Builder builder, ComponentName componentName) {
        return builder.setActivity(componentName);
    }
}

