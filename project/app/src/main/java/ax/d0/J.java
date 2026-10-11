/*
 * Decompiled with CFR 0.152.
 */
package ax.d0;

import android.view.accessibility.AccessibilityNodeInfo;
import java.time.Duration;

public final class J {
    public static /* synthetic */ j.Duration a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return j.TimeConversions.convert((Duration)accessibilityNodeInfo.getMinDurationBetweenContentChanges());
    }
}

