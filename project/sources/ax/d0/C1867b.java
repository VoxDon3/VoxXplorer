package ax.d0;

import android.annotation.SuppressLint;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: ax.d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1867b {
    @SuppressLint({"WrongConstant"})
    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
