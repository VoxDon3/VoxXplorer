package ax.x0;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* renamed from: ax.x0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3396c extends InputConnectionWrapper {
    private final TextView a;
    private final a b;

    /* renamed from: ax.x0.c$a */
    public static class a {
        public boolean a(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
            return androidx.emoji2.text.e.f(inputConnection, editable, i, i2, z);
        }

        public void b(EditorInfo editorInfo) {
            if (androidx.emoji2.text.e.i()) {
                androidx.emoji2.text.e.c().w(editorInfo);
            }
        }
    }

    C3396c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    private Editable a() {
        return this.a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        return this.b.a(this, a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return this.b.a(this, a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }

    C3396c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a aVar) {
        super(inputConnection, false);
        this.a = textView;
        this.b = aVar;
        aVar.b(editorInfo);
    }
}
