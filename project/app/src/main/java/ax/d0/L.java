/*
 * Decompiled with CFR 0.152.
 */
package ax.d0;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

public class L {
    public static void a(AccessibilityRecord accessibilityRecord, int n8) {
        accessibilityRecord.setMaxScrollX(n8);
    }

    public static void b(AccessibilityRecord accessibilityRecord, int n8) {
        accessibilityRecord.setMaxScrollY(n8);
    }

    public static void c(AccessibilityRecord accessibilityRecord, View view, int n8) {
        accessibilityRecord.setSource(view, n8);
    }
}

