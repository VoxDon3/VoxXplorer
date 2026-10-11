/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.x;
import ax.J6.a;
import ax.n.z;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.v;

public class MaterialComponentsViewInflater
extends z {
    @Override
    protected d c(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    @Override
    protected f d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override
    protected g e(Context context, AttributeSet attributeSet) {
        return new ax.v6.d(context, attributeSet);
    }

    @Override
    protected s k(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override
    protected x o(Context context, AttributeSet attributeSet) {
        return new ax.U6.a(context, attributeSet);
    }
}

