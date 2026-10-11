/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import ax.u.G;

class o {
    static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            view = view.getParent();
            while (view instanceof View) {
                if (view instanceof G) {
                    editorInfo.hintText = ((G)view).a();
                    return inputConnection;
                }
                view = view.getParent();
            }
        }
        return inputConnection;
    }
}

