package ax.u;

import android.content.res.Resources;
import android.widget.SpinnerAdapter;

/* loaded from: classes.dex */
public interface x extends SpinnerAdapter {
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(Resources.Theme theme);
}
