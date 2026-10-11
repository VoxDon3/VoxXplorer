/*
 * Decompiled with CFR 0.152.
 */
package ax.d0;

import android.annotation.SuppressLint;
import android.view.accessibility.AccessibilityEvent;

public final class b {
    @SuppressLint(value={"WrongConstant"})
    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void b(AccessibilityEvent accessibilityEvent, int n8) {
        accessibilityEvent.setContentChangeTypes(n8);
    }
}

