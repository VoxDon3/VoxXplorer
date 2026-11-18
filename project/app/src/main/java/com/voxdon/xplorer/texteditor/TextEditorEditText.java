/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.texteditor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import androidx.appcompat.widget.l;

public class TextEditorEditText
extends l {
    public TextEditorEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getAutofillType() {
        return 0;
    }

    @Override
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new a(this, super.onCreateInputConnection(editorInfo), true);
    }

    class a
    extends InputConnectionWrapper {
        final TextEditorEditText a;

        public a(TextEditorEditText textEditorEditText, InputConnection inputConnection, boolean bl) {
            this.a = textEditorEditText;
            super(inputConnection, bl);
        }

        public boolean deleteSurroundingText(int n8, int n9) {
            if (n8 == 1 && n9 == 0 && this.a.getSelectionStart() == 0) {
                return this.sendKeyEvent(new KeyEvent(0, 67)) && this.sendKeyEvent(new KeyEvent(1, 67));
            }
            if (n8 == 0 && n9 == 1 && this.a.getSelectionStart() == this.a.length()) {
                return this.sendKeyEvent(new KeyEvent(0, 112)) && this.sendKeyEvent(new KeyEvent(1, 112));
            }
            return super.deleteSurroundingText(n8, n9);
        }
    }
}

