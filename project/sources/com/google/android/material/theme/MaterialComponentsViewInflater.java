package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0573d;
import androidx.appcompat.widget.C0575f;
import androidx.appcompat.widget.C0576g;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.x;
import ax.J6.a;
import ax.n.z;
import ax.v6.d;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.v;

/* loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends z {
    @Override // ax.n.z
    protected C0573d c(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    @Override // ax.n.z
    protected C0575f d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // ax.n.z
    protected C0576g e(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    @Override // ax.n.z
    protected s k(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // ax.n.z
    protected x o(Context context, AttributeSet attributeSet) {
        return new ax.U6.a(context, attributeSet);
    }
}
