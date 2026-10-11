/*
 * Decompiled with CFR 0.152.
 */
package ax.g0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import ax.b0.g;
import ax.g0.b;

@SuppressLint(value={"PrivateConstructorForUtilityClass"})
public final class c {
    private static final String[] a = new String[0];

    public static String[] a(EditorInfo stringArray) {
        String[] stringArray2;
        if (Build.VERSION.SDK_INT >= 25) {
            if ((stringArray = b.a((EditorInfo)stringArray)) != null) {
                return stringArray;
            }
            return a;
        }
        String[] stringArray3 = stringArray.extras;
        if (stringArray3 == null) {
            return a;
        }
        stringArray3 = stringArray2 = stringArray3.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray2 == null) {
            stringArray3 = stringArray.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        if (stringArray3 != null) {
            return stringArray3;
        }
        return a;
    }

    private static boolean b(CharSequence charSequence, int n8, int n9) {
        if (n9 != 0) {
            if (n9 != 1) {
                return false;
            }
            return Character.isHighSurrogate(charSequence.charAt(n8));
        }
        return Character.isLowSurrogate(charSequence.charAt(n8));
    }

    private static boolean c(int n8) {
        return (n8 &= 0xFFF) == 129 || n8 == 225 || n8 == 18;
        {
        }
    }

    public static void d(EditorInfo editorInfo, String[] stringArray) {
        if (Build.VERSION.SDK_INT >= 25) {
            ax.g0.a.a(editorInfo, stringArray);
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", stringArray);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", stringArray);
    }

    public static void e(EditorInfo editorInfo, CharSequence charSequence, int n8) {
        g.g(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            ax.g0.c$a.a(editorInfo, charSequence, n8);
            return;
        }
        int n9 = editorInfo.initialSelStart;
        int n10 = editorInfo.initialSelEnd;
        int n11 = n9 > n10 ? n10 - n8 : n9 - n8;
        n9 = n9 > n10 ? (n9 -= n8) : n10 - n8;
        n10 = charSequence.length();
        if (n8 >= 0 && n11 >= 0 && n9 <= n10) {
            if (c.c(editorInfo.inputType)) {
                c.g(editorInfo, null, 0, 0);
                return;
            }
            if (n10 <= 2048) {
                c.g(editorInfo, charSequence, n11, n9);
                return;
            }
            c.h(editorInfo, charSequence, n11, n9);
            return;
        }
        c.g(editorInfo, null, 0, 0);
    }

    public static void f(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            ax.g0.c$a.a(editorInfo, charSequence, 0);
            return;
        }
        c.e(editorInfo, charSequence, 0);
    }

    private static void g(EditorInfo editorInfo, CharSequence charSequence, int n8, int n9) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        charSequence = charSequence != null ? new SpannableStringBuilder(charSequence) : null;
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", n8);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", n9);
    }

    private static void h(EditorInfo editorInfo, CharSequence charSequence, int n8, int n9) {
        int n10 = n9 - n8;
        int n11 = n10 > 1024 ? 0 : n10;
        int n12 = charSequence.length();
        int n13 = 2048 - n11;
        int n14 = Math.min(n12 - n9, n13 - Math.min(n8, (int)((double)n13 * 0.8)));
        n12 = Math.min(n8, n13 - n14);
        int n15 = n8 - n12;
        n13 = n12;
        n8 = n15;
        if (c.b(charSequence, n15, 0)) {
            n8 = n15 + 1;
            n13 = n12 - 1;
        }
        n12 = n14;
        if (c.b(charSequence, n9 + n14 - 1, 1)) {
            n12 = n14 - 1;
        }
        charSequence = n11 != n10 ? TextUtils.concat((CharSequence[])new CharSequence[]{charSequence.subSequence(n8, n8 + n13), charSequence.subSequence(n9, n12 + n9)}) : charSequence.subSequence(n8, n13 + n11 + n12 + n8);
        c.g(editorInfo, charSequence, n13, n11 + n13);
    }

    private static class a {
        static void a(EditorInfo editorInfo, CharSequence charSequence, int n8) {
            editorInfo.setInitialSurroundingSubText(charSequence, n8);
        }
    }
}

