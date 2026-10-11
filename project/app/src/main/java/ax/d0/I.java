/*
 * Decompiled with CFR 0.152.
 */
package ax.d0;

import android.view.accessibility.AccessibilityNodeInfo;

public final class I {
    public static /* synthetic */ void a(AccessibilityNodeInfo accessibilityNodeInfo, j.Duration duration) {
        accessibilityNodeInfo.setMinDurationBetweenContentChanges(j.TimeConversions.convert((j.Duration)duration));
    }
}

