/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import ax.m.j;
import ax.x0.a;

class m {
    private final EditText a;
    private final a b;

    m(EditText editText) {
        this.a = editText;
        this.b = new a(editText, false);
    }

    KeyListener a(KeyListener keyListener) {
        KeyListener keyListener2 = keyListener;
        if (this.b(keyListener)) {
            keyListener2 = this.b.a(keyListener);
        }
        return keyListener2;
    }

    boolean b(KeyListener keyListener) {
        return keyListener instanceof NumberKeyListener ^ true;
    }

    void c(AttributeSet attributeSet, int n8) {
        Throwable throwable2;
        block4: {
            boolean bl;
            block3: {
                attributeSet = this.a.getContext().obtainStyledAttributes(attributeSet, j.g0, n8, 0);
                try {
                    n8 = j.u0;
                    boolean bl2 = attributeSet.hasValue(n8);
                    bl = true;
                    if (!bl2) break block3;
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                bl = attributeSet.getBoolean(n8, true);
            }
            attributeSet.recycle();
            this.e(bl);
            return;
        }
        attributeSet.recycle();
        throw throwable2;
    }

    InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.b.b(inputConnection, editorInfo);
    }

    void e(boolean bl) {
        this.b.c(bl);
    }
}

