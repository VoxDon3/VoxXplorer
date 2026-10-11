/*
 * Decompiled with CFR 0.152.
 */
package ax.R;

import android.content.IntentSender;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;

public final class w {
    public static /* bridge */ /* synthetic */ boolean a(ShortcutManager shortcutManager, ShortcutInfo shortcutInfo, IntentSender intentSender) {
        return shortcutManager.requestPinShortcut(shortcutInfo, intentSender);
    }
}

