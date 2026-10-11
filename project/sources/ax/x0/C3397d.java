package ax.x0;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: ax.x0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3397d implements InputFilter {
    private final TextView a;
    private e.AbstractC0016e b;

    /* renamed from: ax.x0.d$a */
    static class a extends e.AbstractC0016e implements Runnable {
        private final Reference<C3397d> c0;
        private final Reference<TextView> q;

        a(TextView textView, C3397d c3397d) {
            this.q = new WeakReference(textView);
            this.c0 = new WeakReference(c3397d);
        }

        private boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.e.AbstractC0016e
        public void b() {
            Handler handler;
            super.b();
            TextView textView = this.q.get();
            if (textView == null || (handler = textView.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            CharSequence text;
            CharSequence p;
            TextView textView = this.q.get();
            if (c(textView, this.c0.get()) && textView.isAttachedToWindow() && text != (p = androidx.emoji2.text.e.c().p((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(p);
                int selectionEnd = Selection.getSelectionEnd(p);
                textView.setText(p);
                if (p instanceof Spannable) {
                    C3397d.b((Spannable) p, selectionStart, selectionEnd);
                }
            }
        }
    }

    C3397d(TextView textView) {
        this.a = textView;
    }

    static void b(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    e.AbstractC0016e a() {
        if (this.b == null) {
            this.b = new a(this.a, this);
        }
        return this.b;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.a.isInEditMode()) {
            return charSequence;
        }
        int e = androidx.emoji2.text.e.c().e();
        if (e != 0) {
            if (e == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.a.getText()) {
                    return charSequence;
                }
                if (charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return androidx.emoji2.text.e.c().q(charSequence, 0, charSequence.length());
            }
            if (e != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.e.c().t(a());
        return charSequence;
    }
}
