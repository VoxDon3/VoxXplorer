/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.x;
import ax.c3.d0;

public class GridFilenameTextView
extends x {
    private SpannableString h = new SpannableString((CharSequence)"...");
    private b i = new b(this);
    private boolean j;
    private boolean k = true;
    private boolean l;
    private CharSequence m;
    private String n;
    private boolean o;

    public GridFilenameTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public GridFilenameTextView(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8);
    }

    private boolean t(String string) {
        if (string == null) {
            return false;
        }
        if (string.length() == 0) {
            return false;
        }
        int n8 = string.indexOf(46);
        return n8 != 0 && n8 >= 0;
        {
        }
    }

    private void u() {
        boolean bl;
        CharSequence charSequence;
        if (!this.t(this.n)) {
            this.k = false;
            this.j = false;
            return;
        }
        int n8 = this.getMaxLines();
        CharSequence charSequence2 = charSequence = this.m;
        if (n8 != -1) {
            charSequence2 = this.i.d(charSequence, this.n);
        }
        if (!charSequence2.equals(this.m)) {
            bl = true;
            this.l = true;
            try {
                this.setText(charSequence2);
            }
            finally {
                this.l = false;
            }
        } else {
            bl = false;
        }
        this.k = false;
        this.j = bl;
    }

    protected void onDraw(Canvas canvas) {
        if (this.o && this.k) {
            this.u();
        }
        super.onDraw(canvas);
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!this.l) {
            this.m = charSequence;
            String string = charSequence != null ? charSequence.toString() : null;
            this.n = string;
            this.k = true;
        }
        super.setText(charSequence, bufferType);
    }

    public void setUseFilenameEllipsize(boolean bl) {
        this.o = bl;
    }

    private class b {
        final GridFilenameTextView a;

        private b(GridFilenameTextView gridFilenameTextView) {
            this.a = gridFilenameTextView;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        protected CharSequence a(CharSequence charSequence, String string) {
            int n8;
            Object object = this.b(charSequence);
            int n9 = string.lastIndexOf(46);
            if (n9 < 0) {
                return charSequence;
            }
            int n10 = object.getLineEnd(this.a.getMaxLines() - 1);
            int n11 = charSequence.length();
            n10 = n8 = n11 - n10 + 1;
            if (n8 < this.a.h.length()) {
                n10 = this.a.h.length();
            }
            if (TextUtils.isEmpty((CharSequence)(string = d0.f(string))) || (n10 = n11 - (n10 + string.length())) < 0) return charSequence;
            string = TextUtils.substring((CharSequence)charSequence, (int)0, (int)n10).trim();
            object = TextUtils.substring((CharSequence)charSequence, (int)(n9 + 1), (int)n11).trim();
            while (true) {
                CharSequence charSequence2;
                if (this.c(charSequence2 = TextUtils.concat((CharSequence[])new CharSequence[]{string, this.a.h, object}))) {
                    if (!(charSequence instanceof Spanned)) return charSequence2;
                    charSequence2 = new SpannableStringBuilder((CharSequence)string);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)object);
                    charSequence = (Spanned)charSequence;
                    TextUtils.copySpansFrom((Spanned)charSequence, (int)0, (int)string.length(), null, (Spannable)charSequence2, (int)0);
                    TextUtils.copySpansFrom((Spanned)charSequence, (int)(n11 - ((String)object).length()), (int)n11, null, (Spannable)spannableStringBuilder, (int)0);
                    return TextUtils.concat((CharSequence[])new CharSequence[]{charSequence2, this.a.h, spannableStringBuilder});
                }
                n10 = string.length();
                if (n10 == 0) {
                    return charSequence;
                }
                string = string.substring(0, n10 - 1).trim();
            }
        }

        protected Layout b(CharSequence charSequence) {
            float f8 = this.a.getLineSpacingMultiplier();
            float f9 = this.a.getLineSpacingExtra();
            return new StaticLayout(charSequence, this.a.getPaint(), this.a.getWidth() - this.a.getCompoundPaddingLeft() - this.a.getCompoundPaddingRight(), Layout.Alignment.ALIGN_NORMAL, f8, f9, false);
        }

        public boolean c(CharSequence charSequence) {
            return this.b(charSequence).getLineCount() <= this.a.getMaxLines();
        }

        public CharSequence d(CharSequence charSequence, String string) {
            CharSequence charSequence2 = charSequence;
            if (!this.c(charSequence)) {
                charSequence2 = this.a(charSequence, string);
            }
            return charSequence2;
        }
    }
}

