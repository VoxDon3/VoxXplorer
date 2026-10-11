/*
 * Decompiled with CFR 0.152.
 */
package ax.x0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class d
implements InputFilter {
    private final TextView a;
    private e.e b;

    d(TextView textView) {
        this.a = textView;
    }

    static void b(Spannable spannable, int n8, int n9) {
        if (n8 >= 0 && n9 >= 0) {
            Selection.setSelection((Spannable)spannable, (int)n8, (int)n9);
            return;
        }
        if (n8 >= 0) {
            Selection.setSelection((Spannable)spannable, (int)n8);
            return;
        }
        if (n9 >= 0) {
            Selection.setSelection((Spannable)spannable, (int)n9);
        }
    }

    e.e a() {
        if (this.b == null) {
            this.b = new a(this.a, this);
        }
        return this.b;
    }

    public CharSequence filter(CharSequence charSequence, int n8, int n9, Spanned object, int n10, int n11) {
        block5: {
            block4: {
                block6: {
                    block3: {
                        if (!this.a.isInEditMode()) break block3;
                        object = charSequence;
                        break block4;
                    }
                    int n12 = e.c().e();
                    if (n12 == 0) break block5;
                    if (n12 == 1) break block6;
                    if (n12 == 3) break block5;
                    object = charSequence;
                    break block4;
                }
                if (n11 == 0 && n10 == 0 && object.length() == 0 && charSequence == this.a.getText()) {
                    return charSequence;
                }
                object = charSequence;
                if (charSequence != null) {
                    if (n8 != 0 || n9 != charSequence.length()) {
                        charSequence = charSequence.subSequence(n8, n9);
                    }
                    object = e.c().q(charSequence, 0, charSequence.length());
                }
            }
            return object;
        }
        e.c().t(this.a());
        return charSequence;
    }

    static class a
    extends e.e
    implements Runnable {
        private final Reference<d> c0;
        private final Reference<TextView> q;

        a(TextView textView, d d8) {
            this.q = new WeakReference<TextView>(textView);
            this.c0 = new WeakReference<d>(d8);
        }

        private boolean c(TextView inputFilterArray, InputFilter inputFilter) {
            if (inputFilter != null && inputFilterArray != null) {
                if ((inputFilterArray = inputFilterArray.getFilters()) == null) {
                    return false;
                }
                for (int i8 = 0; i8 < inputFilterArray.length; ++i8) {
                    if (inputFilterArray[i8] != inputFilter) continue;
                    return true;
                }
            }
            return false;
        }

        @Override
        public void b() {
            super.b();
            TextView textView = this.q.get();
            if (textView != null && (textView = textView.getHandler()) != null) {
                textView.post((Runnable)this);
            }
        }

        @Override
        public void run() {
            CharSequence charSequence;
            CharSequence charSequence2;
            TextView textView = this.q.get();
            if (this.c(textView, this.c0.get()) && textView.isAttachedToWindow() && (charSequence2 = textView.getText()) != (charSequence = e.c().p(charSequence2))) {
                int n8 = Selection.getSelectionStart((CharSequence)charSequence);
                int n9 = Selection.getSelectionEnd((CharSequence)charSequence);
                textView.setText(charSequence);
                if (charSequence instanceof Spannable) {
                    d.b((Spannable)charSequence, n8, n9);
                }
            }
        }
    }
}

