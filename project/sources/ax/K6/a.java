package ax.K6;

import android.graphics.Typeface;

/* loaded from: classes3.dex */
public final class a extends g {
    private final Typeface a;
    private final InterfaceC0110a b;
    private boolean c;

    /* renamed from: ax.K6.a$a, reason: collision with other inner class name */
    public interface InterfaceC0110a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0110a interfaceC0110a, Typeface typeface) {
        this.a = typeface;
        this.b = interfaceC0110a;
    }

    private void d(Typeface typeface) {
        if (this.c) {
            return;
        }
        this.b.a(typeface);
    }

    @Override // ax.K6.g
    public void a(int i) {
        d(this.a);
    }

    @Override // ax.K6.g
    public void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public void c() {
        this.c = true;
    }
}
