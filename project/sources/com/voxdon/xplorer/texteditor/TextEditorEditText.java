package com.voxdon.xplorer.texteditor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import androidx.appcompat.widget.C0581l;

/* loaded from: classes.dex */
public class TextEditorEditText extends C0581l {

    class a extends InputConnectionWrapper {
        public a(InputConnection inputConnection, boolean z) {
            super(inputConnection, z);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int i, int i2) {
            return (i == 1 && i2 == 0 && TextEditorEditText.this.getSelectionStart() == 0) ? sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67)) : (i == 0 && i2 == 1 && TextEditorEditText.this.getSelectionStart() == TextEditorEditText.this.length()) ? sendKeyEvent(new KeyEvent(0, 112)) && sendKeyEvent(new KeyEvent(1, 112)) : super.deleteSurroundingText(i, i2);
        }
    }

    public TextEditorEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public int getAutofillType() {
        return 0;
    }

    @Override // androidx.appcompat.widget.C0581l, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new a(super.onCreateInputConnection(editorInfo), true);
    }
}
