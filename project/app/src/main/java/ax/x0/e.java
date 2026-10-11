/*
 * Decompiled with CFR 0.152.
 */
package ax.x0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

final class e
implements KeyListener {
    private final KeyListener a;
    private final a b;

    e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    e(KeyListener keyListener, a a8) {
        this.a = keyListener;
        this.b = a8;
    }

    public void clearMetaKeyState(View view, Editable editable, int n8) {
        this.a.clearMetaKeyState(view, editable, n8);
    }

    public int getInputType() {
        return this.a.getInputType();
    }

    public boolean onKeyDown(View view, Editable editable, int n8, KeyEvent keyEvent) {
        return this.b.a(editable, n8, keyEvent) || this.a.onKeyDown(view, editable, n8, keyEvent);
        {
        }
    }

    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    public boolean onKeyUp(View view, Editable editable, int n8, KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, n8, keyEvent);
    }

    public static class a {
        public boolean a(Editable editable, int n8, KeyEvent keyEvent) {
            return androidx.emoji2.text.e.g(editable, n8, keyEvent);
        }
    }
}

