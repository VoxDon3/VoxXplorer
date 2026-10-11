package ax.x0;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import ax.b0.C1446g;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* renamed from: ax.x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3394a {
    private int a = SubsamplingScaleImageView.TILE_SIZE_AUTO;
    private int b = 0;
    private final EditText c;
    private final C3400g d;

    public C3394a(EditText editText, boolean z) {
        C1446g.h(editText, "editText cannot be null");
        this.c = editText;
        C3400g c3400g = new C3400g(editText, z);
        this.d = c3400g;
        editText.addTextChangedListener(c3400g);
        editText.setEditableFactory(C3395b.getInstance());
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof C3398e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C3398e(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return inputConnection instanceof C3396c ? inputConnection : new C3396c(this.c, inputConnection, editorInfo);
    }

    public void c(boolean z) {
        this.d.c(z);
    }
}
