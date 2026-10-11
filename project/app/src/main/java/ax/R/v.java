/*
 * Decompiled with CFR 0.152.
 */
package ax.R;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;

public final class v {
    public static /* bridge */ /* synthetic */ Intent a(ShortcutManager shortcutManager, ShortcutInfo shortcutInfo) {
        return shortcutManager.createShortcutResultIntent(shortcutInfo);
    }
}

