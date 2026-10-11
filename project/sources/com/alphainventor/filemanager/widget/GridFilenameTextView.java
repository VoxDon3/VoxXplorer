package com.voxdon.xplorer.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.x;
import ax.c3.d0;

/* loaded from: classes.dex */
public class GridFilenameTextView extends x {
    private SpannableString h;
    private b i;
    private boolean j;
    private boolean k;
    private boolean l;
    private CharSequence m;
    private String n;
    private boolean o;

    private class b {
        private b() {
        }

        protected CharSequence a(CharSequence charSequence, String str) {
            int length;
            Layout b = b(charSequence);
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf < 0) {
                return charSequence;
            }
            int lineEnd = b.getLineEnd(GridFilenameTextView.this.getMaxLines() - 1);
            int length2 = charSequence.length();
            int i = (length2 - lineEnd) + 1;
            if (i < GridFilenameTextView.this.h.length()) {
                i = GridFilenameTextView.this.h.length();
            }
            String f = d0.f(str);
            if (!TextUtils.isEmpty(f) && (length = length2 - (i + f.length())) >= 0) {
                String trim = TextUtils.substring(charSequence, 0, length).trim();
                String trim2 = TextUtils.substring(charSequence, lastIndexOf + 1, length2).trim();
                while (true) {
                    CharSequence concat = TextUtils.concat(trim, GridFilenameTextView.this.h, trim2);
                    if (c(concat)) {
                        if (!(charSequence instanceof Spanned)) {
                            return concat;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(trim);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(trim2);
                        Spanned spanned = (Spanned) charSequence;
                        TextUtils.copySpansFrom(spanned, 0, trim.length(), null, spannableStringBuilder, 0);
                        TextUtils.copySpansFrom(spanned, length2 - trim2.length(), length2, null, spannableStringBuilder2, 0);
                        return TextUtils.concat(spannableStringBuilder, GridFilenameTextView.this.h, spannableStringBuilder2);
                    }
                    int length3 = trim.length();
                    if (length3 == 0) {
                        break;
                    }
                    trim = trim.substring(0, length3 - 1).trim();
                }
            }
            return charSequence;
        }

        protected Layout b(CharSequence charSequence) {
            return new StaticLayout(charSequence, GridFilenameTextView.this.getPaint(), (GridFilenameTextView.this.getWidth() - GridFilenameTextView.this.getCompoundPaddingLeft()) - GridFilenameTextView.this.getCompoundPaddingRight(), Layout.Alignment.ALIGN_NORMAL, GridFilenameTextView.this.getLineSpacingMultiplier(), GridFilenameTextView.this.getLineSpacingExtra(), false);
        }

        public boolean c(CharSequence charSequence) {
            return b(charSequence).getLineCount() <= GridFilenameTextView.this.getMaxLines();
        }

        public CharSequence d(CharSequence charSequence, String str) {
            return !c(charSequence) ? a(charSequence, str) : charSequence;
        }
    }

    public GridFilenameTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private boolean t(String str) {
        int indexOf;
        return (str == null || str.length() == 0 || (indexOf = str.indexOf(46)) == 0 || indexOf < 0) ? false : true;
    }

    private void u() {
        boolean z;
        if (!t(this.n)) {
            this.k = false;
            this.j = false;
            return;
        }
        int maxLines = getMaxLines();
        CharSequence charSequence = this.m;
        if (maxLines != -1) {
            charSequence = this.i.d(charSequence, this.n);
        }
        if (charSequence.equals(this.m)) {
            z = false;
        } else {
            z = true;
            this.l = true;
            try {
                setText(charSequence);
            } finally {
                this.l = false;
            }
        }
        this.k = false;
        this.j = z;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.o && this.k) {
            u();
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!this.l) {
            this.m = charSequence;
            this.n = charSequence != null ? charSequence.toString() : null;
            this.k = true;
        }
        super.setText(charSequence, bufferType);
    }

    public void setUseFilenameEllipsize(boolean z) {
        this.o = z;
    }

    public GridFilenameTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new SpannableString("...");
        this.k = true;
        this.i = new b();
    }
}
