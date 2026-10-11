package com.android.ex.photo;

import android.graphics.drawable.Drawable;
import ax.n.AbstractC2559a;
import com.android.ex.photo.a;

/* loaded from: classes.dex */
public class b implements com.android.ex.photo.a {
    private final AbstractC2559a a;

    private class a implements AbstractC2559a.b {
        private final a.InterfaceC0540a a;

        public a(a.InterfaceC0540a interfaceC0540a) {
            this.a = interfaceC0540a;
        }

        @Override // ax.n.AbstractC2559a.b
        public void a(boolean z) {
            this.a.a(z);
        }
    }

    public b(AbstractC2559a abstractC2559a) {
        this.a = abstractC2559a;
    }

    @Override // com.android.ex.photo.a
    public void a() {
        this.a.y(8, 8);
    }

    @Override // com.android.ex.photo.a
    public void b(boolean z) {
        this.a.x(z);
    }

    @Override // com.android.ex.photo.a
    public void c(a.InterfaceC0540a interfaceC0540a) {
        this.a.g(new a(interfaceC0540a));
    }

    @Override // com.android.ex.photo.a
    public void e(Drawable drawable) {
        this.a.D(drawable);
    }

    @Override // com.android.ex.photo.a
    public void h(CharSequence charSequence) {
        this.a.F(charSequence);
    }

    @Override // com.android.ex.photo.a
    public void setTitle(CharSequence charSequence) {
        this.a.H(charSequence);
    }
}
