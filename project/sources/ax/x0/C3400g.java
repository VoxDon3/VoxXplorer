package ax.x0;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.e;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: ax.x0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3400g implements TextWatcher {
    private final EditText a;
    private final boolean b;
    private e.AbstractC0016e c;
    private int d = SubsamplingScaleImageView.TILE_SIZE_AUTO;
    private int e = 0;
    private boolean f = true;
    private int g;
    private int h;

    /* renamed from: ax.x0.g$a */
    static class a extends e.AbstractC0016e implements Runnable {
        private final Reference<EditText> q;

        a(EditText editText) {
            this.q = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.e.AbstractC0016e
        public void b() {
            Handler handler;
            super.b();
            EditText editText = this.q.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C3400g.b(this.q.get(), 1);
        }
    }

    C3400g(EditText editText, boolean z) {
        this.a = editText;
        this.b = z;
    }

    static void b(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.e.c().p(editableText);
            C3397d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        if (this.f) {
            return (this.b || androidx.emoji2.text.e.i()) ? false : true;
        }
        return true;
    }

    e.AbstractC0016e a() {
        if (this.c == null) {
            this.c = new a(this.a);
        }
        return this.c;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (this.a.isInEditMode() || d()) {
            return;
        }
        int i = this.g;
        int i2 = this.h;
        if (i2 > 0) {
            int e = androidx.emoji2.text.e.c().e();
            if (e != 0) {
                if (e == 1) {
                    androidx.emoji2.text.e.c().s(editable, i, i + i2, this.d, this.e);
                    return;
                } else if (e != 3) {
                    return;
                }
            }
            androidx.emoji2.text.e.c().t(a());
        }
    }

    public void c(boolean z) {
        if (this.f != z) {
            if (this.c != null) {
                androidx.emoji2.text.e.c().v(this.c);
            }
            this.f = z;
            if (z) {
                b(this.a, androidx.emoji2.text.e.c().e());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.g = i;
        this.h = i3;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
