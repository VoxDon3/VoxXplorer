/*
 * Decompiled with CFR 0.152.
 */
package ax.x0;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.e;

final class c
extends InputConnectionWrapper {
    private final TextView a;
    private final a b;

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a a8) {
        super(inputConnection, false);
        this.a = textView;
        this.b = a8;
        a8.b(editorInfo);
    }

    private Editable a() {
        return this.a.getEditableText();
    }

    public boolean deleteSurroundingText(int n8, int n9) {
        return this.b.a((InputConnection)this, this.a(), n8, n9, false) || super.deleteSurroundingText(n8, n9);
        {
        }
    }

    public boolean deleteSurroundingTextInCodePoints(int n8, int n9) {
        return this.b.a((InputConnection)this, this.a(), n8, n9, true) || super.deleteSurroundingTextInCodePoints(n8, n9);
        {
        }
    }

    public static class a {
        public boolean a(InputConnection inputConnection, Editable editable, int n8, int n9, boolean bl) {
            return e.f(inputConnection, editable, n8, n9, bl);
        }

        public void b(EditorInfo editorInfo) {
            if (e.i()) {
                e.c().w(editorInfo);
            }
        }
    }
}

