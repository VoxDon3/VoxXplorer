/*
 * Decompiled with CFR 0.152.
 */
package ax.A6;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import ax.A6.a;
import ax.A6.b;
import ax.F6.z;

public final class c {
    public static boolean a(Context context) {
        return (context = (AccessibilityManager)context.getSystemService("accessibility")) != null && context.isTouchExplorationEnabled();
    }

    public static /* synthetic */ void b(EditText[] editTextArray, View view, boolean bl) {
        int n8 = editTextArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!editTextArray[i8].hasFocus()) continue;
            return;
        }
        z.g(view, false);
    }

    public static /* synthetic */ void c(View view) {
        z.k(view, false);
    }

    public static void d(EditText ... editText) {
        if (((EditText[])editText).length == 0) {
            return;
        }
        a a8 = new a((EditText[])editText);
        int n8 = ((EditText[])editText).length;
        for (int i8 = 0; i8 < n8; ++i8) {
            editText[i8].setOnFocusChangeListener((View.OnFocusChangeListener)a8);
        }
        editText = editText[0];
        editText.postDelayed((Runnable)new b((View)editText), 100L);
    }
}

