package ax.a3;

import android.app.Dialog;
import android.content.Context;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class D extends I {

    public static class a extends Dialog {
        public a(Context context) {
            super(context, R.style.FullScreenTransparentDialogTheme);
            setContentView(R.layout.dialog_fullscreen_progress);
            setCancelable(false);
        }
    }

    @Override // ax.a3.I
    public Dialog g3() {
        return new a(b());
    }
}
