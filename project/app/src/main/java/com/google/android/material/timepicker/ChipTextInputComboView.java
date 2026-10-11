/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import ax.F6.v;
import ax.F6.z;
import ax.W6.a;
import ax.k6.g;
import ax.n.i;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.e;

class ChipTextInputComboView
extends FrameLayout
implements Checkable {
    private final Chip a;
    private final TextInputLayout b;
    private final EditText c;
    private TextWatcher d;
    private TextView e;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(Context object, AttributeSet object2, int n8) {
        super((Context)object, (AttributeSet)object2, n8);
        EditText editText;
        object2 = LayoutInflater.from((Context)object);
        object = (Chip)object2.inflate(ax.k6.i.l, (ViewGroup)this, false);
        this.a = object;
        ((Chip)object).setAccessibilityClassName("android.view.View");
        object2 = (TextInputLayout)object2.inflate(ax.k6.i.m, (ViewGroup)this, false);
        this.b = object2;
        this.c = editText = ((TextInputLayout)((Object)object2)).getEditText();
        editText.setVisibility(4);
        b b8 = new b(this);
        this.d = b8;
        editText.addTextChangedListener((TextWatcher)b8);
        this.d();
        this.addView((View)object);
        this.addView((View)object2);
        this.e = (TextView)this.findViewById(g.p);
        editText.setId(View.generateViewId());
        this.e.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    private String c(CharSequence charSequence) {
        return com.google.android.material.timepicker.e.a(this.getResources(), charSequence);
    }

    private void d() {
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList = i.a(this.getContext().getResources().getConfiguration());
            ax.W6.a.a(this.c, localeList);
        }
    }

    public boolean isChecked() {
        return this.a.isChecked();
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.d();
    }

    public void setChecked(boolean bl) {
        this.a.setChecked(bl);
        Object object = this.c;
        int n8 = bl ? 0 : 4;
        object.setVisibility(n8);
        object = this.a;
        n8 = bl ? 8 : 0;
        object.setVisibility(n8);
        if (this.isChecked()) {
            z.k((View)this.c, false);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public void setTag(int n8, Object object) {
        this.a.setTag(n8, object);
    }

    public void toggle() {
        this.a.toggle();
    }

    private class b
    extends v {
        final ChipTextInputComboView a;

        private b(ChipTextInputComboView chipTextInputComboView) {
            this.a = chipTextInputComboView;
        }

        public void afterTextChanged(Editable object) {
            if (TextUtils.isEmpty((CharSequence)object)) {
                this.a.a.setText(this.a.c("00"));
                return;
            }
            String string = this.a.c((CharSequence)object);
            Chip chip = this.a.a;
            object = string;
            if (TextUtils.isEmpty((CharSequence)string)) {
                object = this.a.c("00");
            }
            chip.setText((CharSequence)object);
        }
    }
}

