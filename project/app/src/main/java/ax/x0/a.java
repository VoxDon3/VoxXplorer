/*
 * Decompiled with CFR 0.152.
 */
package ax.x0;

import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import ax.x0.b;
import ax.x0.c;
import ax.x0.e;
import ax.x0.g;

public final class a {
    private int a = Integer.MAX_VALUE;
    private int b = 0;
    private final EditText c;
    private final g d;

    public a(EditText editText, boolean bl) {
        g g8;
        ax.b0.g.h(editText, "editText cannot be null");
        this.c = editText;
        this.d = g8 = new g(editText, bl);
        editText.addTextChangedListener((TextWatcher)g8);
        editText.setEditableFactory(ax.x0.b.getInstance());
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        return new e(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        if (inputConnection instanceof c) {
            return inputConnection;
        }
        return new c((TextView)this.c, inputConnection, editorInfo);
    }

    public void c(boolean bl) {
        this.d.c(bl);
    }
}

