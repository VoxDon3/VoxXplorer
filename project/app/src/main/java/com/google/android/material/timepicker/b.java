/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

class b
implements InputFilter {
    private int a;

    public b(int n8) {
        this.a = n8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public CharSequence filter(CharSequence charSequence, int n8, int n9, Spanned spanned, int n10, int n11) {
        block3: {
            try {
                StringBuilder stringBuilder = new StringBuilder((CharSequence)spanned);
                stringBuilder.replace(n10, n11, charSequence.subSequence(n8, n9).toString());
                n9 = Integer.parseInt(stringBuilder.toString());
                n8 = this.a;
                if (n9 > n8) break block3;
                return null;
            }
            catch (NumberFormatException numberFormatException) {
                return "";
            }
        }
        return "";
    }
}

