package ax.x0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: ax.x0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3398e implements KeyListener {
    private final KeyListener a;
    private final a b;

    /* renamed from: ax.x0.e$a */
    public static class a {
        public boolean a(Editable editable, int i, KeyEvent keyEvent) {
            return androidx.emoji2.text.e.g(editable, i, keyEvent);
        }
    }

    C3398e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.b.a(editable, i, keyEvent) || this.a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, i, keyEvent);
    }

    C3398e(KeyListener keyListener, a aVar) {
        this.a = keyListener;
        this.b = aVar;
    }
}
