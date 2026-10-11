package ax.a3;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import ax.u3.C3180B;
import com.voxdon.xplorer.R;

/* renamed from: ax.a3.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC1343B extends Dialog {
    private b a;
    private boolean b;
    private View c;
    private int d;
    private int e;

    /* renamed from: ax.a3.B$a */
    class a implements View.OnLayoutChangeListener {
        final /* synthetic */ FrameLayout a;

        a(FrameLayout frameLayout) {
            this.a = frameLayout;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (i9 == DialogC1343B.this.d && i10 == DialogC1343B.this.e) {
                return;
            }
            DialogC1343B.this.d = i9;
            DialogC1343B.this.e = i10;
            Window window = DialogC1343B.this.getWindow();
            Context context = DialogC1343B.this.getContext();
            if (window == null || context == null) {
                return;
            }
            DialogC1343B dialogC1343B = DialogC1343B.this;
            dialogC1343B.m(dialogC1343B.getContext(), window.getDecorView().getWidth(), window.getDecorView().getHeight(), this.a);
        }
    }

    /* renamed from: ax.a3.B$b */
    public enum b {
        FULLSCREEN_BACKGROUND,
        FULLSCREEN_NO_BACKGROUND,
        FULLSCREEN_FIXED_SIZE,
        FULLSCREEN_MIN_WIDTH
    }

    public DialogC1343B(Context context, b bVar) {
        super(context, i(bVar));
        this.a = bVar;
        this.b = f(bVar);
    }

    private boolean f(b bVar) {
        if (bVar == b.FULLSCREEN_BACKGROUND || bVar == b.FULLSCREEN_NO_BACKGROUND) {
            return true;
        }
        b bVar2 = b.FULLSCREEN_BACKGROUND;
        return false;
    }

    private int g(int i, float f, int i2) {
        return ((int) (((float) i) / f)) <= i2 ? i : (int) (i2 * f);
    }

    private int h(int i, float f, int i2, int i3) {
        int i4 = (int) (i / f);
        return (int) (i * (i4 <= i2 ? 1.0d : i4 >= i3 ? 0.5d : (((i3 - i4) / (i3 - i2)) * 0.5d) + 0.5d));
    }

    private static int i(b bVar) {
        return bVar == b.FULLSCREEN_BACKGROUND ? R.style.FullScreenDialogTheme_Background : (bVar == b.FULLSCREEN_NO_BACKGROUND || bVar == b.FULLSCREEN_FIXED_SIZE) ? R.style.FullScreenDialogTheme_NoBackground : R.style.FullScreenDialogTheme_MinWidth;
    }

    private void j() {
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content_frame);
        frameLayout.setClipToOutline(true);
        frameLayout.addView(this.c);
        frameLayout.getRootView().addOnLayoutChangeListener(new a(frameLayout));
    }

    public static boolean l(Activity activity) {
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        int i2 = (int) (i / f);
        int i3 = displayMetrics.widthPixels;
        int i4 = (int) (i3 / f);
        float f2 = i3 / displayMetrics.xdpi;
        float f3 = i / displayMetrics.ydpi;
        if (i4 > 440 || i2 > 850 || i2 < 480) {
            return f2 < 3.4f && f3 < 6.5f && f3 >= 4.0f;
        }
        return true;
    }

    protected View e() {
        return this.c;
    }

    public boolean k() {
        return this.b;
    }

    protected void m(Context context, int i, int i2, View view) {
        float s = C3180B.s(context);
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        int min2 = Math.min(h(min, s, 480, 800), i);
        int min3 = Math.min(g(max, s, 640), i2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = min2;
        layoutParams.height = min3;
        view.setLayoutParams(layoutParams);
    }

    public void n(View view) {
        this.c = view;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (this.b) {
            setContentView(this.c);
            getWindow().setLayout(-1, -1);
            return;
        }
        b bVar = this.a;
        if (bVar == b.FULLSCREEN_FIXED_SIZE) {
            setContentView(R.layout.dialog_fixed_size);
            j();
            getWindow().setLayout(-1, -1);
        } else if (bVar == b.FULLSCREEN_MIN_WIDTH) {
            setContentView(R.layout.dialog_min_width);
            j();
            getWindow().setLayout(-2, -1);
            getWindow().setGravity(17);
        }
    }
}
