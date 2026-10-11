package ax.x3;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class v extends androidx.appcompat.view.menu.e {
    public v(Context context) {
        super(context);
    }

    public void g0(CharSequence charSequence) {
        Z(charSequence);
    }

    public void h0(View view, int i, int i2) {
        Context u = u();
        try {
            try {
                androidx.appcompat.view.menu.i iVar = new androidx.appcompat.view.menu.i(u, this);
                iVar.f(view);
                iVar.l(i, i2);
            } catch (RuntimeException unused) {
                clearHeader();
                androidx.appcompat.view.menu.i iVar2 = new androidx.appcompat.view.menu.i(u, this);
                iVar2.f(view);
                iVar2.l(i, i2);
            }
        } catch (RuntimeException e) {
            ax.Ha.c.h().f().b("MENU_POPUP_HELPER").l(e).h();
            Toast.makeText(u, R.string.error, 1).show();
        }
    }
}
