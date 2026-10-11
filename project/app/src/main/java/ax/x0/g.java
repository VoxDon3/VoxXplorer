/*
 * Decompiled with CFR 0.152.
 */
package ax.x0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.e;
import ax.x0.d;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class g
implements TextWatcher {
    private final EditText a;
    private final boolean b;
    private e.e c;
    private int d = Integer.MAX_VALUE;
    private int e = 0;
    private boolean f;
    private int g;
    private int h;

    g(EditText editText, boolean bl) {
        this.a = editText;
        this.b = bl;
        this.f = true;
    }

    static void b(EditText editText, int n8) {
        if (n8 == 1 && editText != null && editText.isAttachedToWindow()) {
            editText = editText.getEditableText();
            int n9 = Selection.getSelectionStart((CharSequence)editText);
            n8 = Selection.getSelectionEnd((CharSequence)editText);
            androidx.emoji2.text.e.c().p((CharSequence)editText);
            ax.x0.d.b((Spannable)editText, n9, n8);
        }
    }

    private boolean d() {
        return !this.f || !this.b && !androidx.emoji2.text.e.i();
        {
        }
    }

    e.e a() {
        if (this.c == null) {
            this.c = new a(this.a);
        }
        return this.c;
    }

    public void afterTextChanged(Editable editable) {
        block0: {
            block1: {
                int n8;
                int n9;
                block2: {
                    if (this.a.isInEditMode() || this.d()) break block0;
                    n9 = this.g;
                    n8 = this.h;
                    if (n8 <= 0) break block0;
                    int n10 = androidx.emoji2.text.e.c().e();
                    if (n10 == 0) break block1;
                    if (n10 == 1) break block2;
                    if (n10 == 3) break block1;
                    break block0;
                }
                androidx.emoji2.text.e.c().s((CharSequence)editable, n9, n9 + n8, this.d, this.e);
                return;
            }
            androidx.emoji2.text.e.c().t(this.a());
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int n8, int n9, int n10) {
    }

    public void c(boolean bl) {
        if (this.f != bl) {
            if (this.c != null) {
                androidx.emoji2.text.e.c().v(this.c);
            }
            this.f = bl;
            if (bl) {
                ax.x0.g.b(this.a, androidx.emoji2.text.e.c().e());
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int n8, int n9, int n10) {
        this.g = n8;
        this.h = n10;
    }

    static class a
    extends e.e
    implements Runnable {
        private final Reference<EditText> q;

        a(EditText editText) {
            this.q = new WeakReference<EditText>(editText);
        }

        @Override
        public void b() {
            super.b();
            EditText editText = this.q.get();
            if (editText == null || (editText = editText.getHandler()) == null) {
                return;
            }
            editText.post((Runnable)this);
        }

        @Override
        public void run() {
            ax.x0.g.b(this.q.get(), 1);
        }
    }
}

