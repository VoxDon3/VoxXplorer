package ax.ha;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import ax.ca.e;
import ax.ca.h;

/* renamed from: ax.ha.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2177c implements InterfaceC2175a {
    protected final String a;
    protected final e b;
    protected final h c;

    public C2177c(String str, e eVar, h hVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("imageSize must not be null");
        }
        if (hVar == null) {
            throw new IllegalArgumentException("scaleType must not be null");
        }
        this.a = str;
        this.b = eVar;
        this.c = hVar;
    }

    @Override // ax.ha.InterfaceC2175a
    public int a() {
        return TextUtils.isEmpty(this.a) ? super.hashCode() : this.a.hashCode();
    }

    @Override // ax.ha.InterfaceC2175a
    public int f() {
        return this.b.a();
    }

    @Override // ax.ha.InterfaceC2175a
    public boolean g(Drawable drawable) {
        return true;
    }

    @Override // ax.ha.InterfaceC2175a
    public View h() {
        return null;
    }

    @Override // ax.ha.InterfaceC2175a
    public int i() {
        return this.b.b();
    }

    @Override // ax.ha.InterfaceC2175a
    public boolean j() {
        return false;
    }

    @Override // ax.ha.InterfaceC2175a
    public h k() {
        return this.c;
    }

    @Override // ax.ha.InterfaceC2175a
    public boolean l(Bitmap bitmap) {
        return true;
    }
}
