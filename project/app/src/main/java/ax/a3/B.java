/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class B
extends Dialog {
    private b a;
    private boolean b;
    private View c;
    private int d;
    private int e;

    public B(Context context, b b8) {
        super(context, B.i(b8));
        this.a = b8;
        this.b = this.f(b8);
    }

    static /* synthetic */ int b(B b8, int n8) {
        b8.d = n8;
        return n8;
    }

    static /* synthetic */ int d(B b8, int n8) {
        b8.e = n8;
        return n8;
    }

    private boolean f(b b8) {
        if (b8 == ax.a3.B$b.q) {
            return true;
        }
        if (b8 == ax.a3.B$b.c0) {
            return true;
        }
        b8 = ax.a3.B$b.q;
        return false;
    }

    private int g(int n8, float f8, int n9) {
        if ((int)((float)n8 / f8) <= n9) {
            return n8;
        }
        return (int)((float)n9 * f8);
    }

    private int h(int n8, float f8, int n9, int n10) {
        int n11 = (int)((float)n8 / f8);
        double d8 = n11 <= n9 ? 1.0 : (n11 >= n10 ? 0.5 : (double)(n10 - n11) / (double)(n10 - n9) * 0.5 + 0.5);
        return (int)((double)n8 * d8);
    }

    private static int i(b b8) {
        if (b8 == ax.a3.B$b.q) {
            return 2132017507;
        }
        if (b8 == ax.a3.B$b.c0) {
            return 2132017509;
        }
        if (b8 == ax.a3.B$b.d0) {
            return 2132017509;
        }
        return 2132017508;
    }

    private void j() {
        FrameLayout frameLayout = (FrameLayout)this.findViewById(2131362059);
        frameLayout.setClipToOutline(true);
        frameLayout.addView(this.c);
        frameLayout.getRootView().addOnLayoutChangeListener(new View.OnLayoutChangeListener(){
            final FrameLayout a;
            final B b;
            {
                this.b = b8;
                this.a = frameLayout;
            }

            public void onLayoutChange(View view, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
                n8 = n10 - n8;
                n9 = n11 - n9;
                if (n8 != this.b.d || n9 != this.b.e) {
                    B.b(this.b, n8);
                    B.d(this.b, n9);
                    view = this.b.getWindow();
                    Object object = this.b.getContext();
                    if (view != null && object != null) {
                        object = this.b;
                        ((B)((Object)object)).m(object.getContext(), view.getDecorView().getWidth(), view.getDecorView().getHeight(), (View)this.a);
                    }
                }
            }
        });
    }

    public static boolean l(Activity activity) {
        activity = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getMetrics(displayMetrics);
        int n8 = displayMetrics.heightPixels;
        float f8 = n8;
        float f9 = displayMetrics.density;
        int n9 = (int)(f8 / f9);
        int n10 = displayMetrics.widthPixels;
        int n11 = (int)((float)n10 / f9);
        f9 = (float)n10 / displayMetrics.xdpi;
        f8 = (float)n8 / displayMetrics.ydpi;
        if (n11 <= 440 && n9 <= 850 && n9 >= 480) {
            return true;
        }
        return f9 < 3.4f && f8 < 6.5f && f8 >= 4.0f;
    }

    protected View e() {
        return this.c;
    }

    public boolean k() {
        return this.b;
    }

    protected void m(Context context, int n8, int n9, View view) {
        float f8 = ax.u3.B.s(context);
        int n10 = Math.min(n8, n9);
        int n11 = Math.max(n8, n9);
        n8 = Math.min(this.h(n10, f8, 480, 800), n8);
        n9 = Math.min(this.g(n11, f8, 640), n9);
        context = view.getLayoutParams();
        context.width = n8;
        context.height = n9;
        view.setLayoutParams((ViewGroup.LayoutParams)context);
    }

    public void n(View view) {
        this.c = view;
    }

    protected void onCreate(Bundle object) {
        super.onCreate(object);
        this.requestWindowFeature(1);
        if (this.b) {
            this.setContentView(this.c);
            this.getWindow().setLayout(-1, -1);
            return;
        }
        object = this.a;
        if (object == ax.a3.B$b.d0) {
            this.setContentView(2131558508);
            this.j();
            this.getWindow().setLayout(-1, -1);
            return;
        }
        if (object == ax.a3.B$b.e0) {
            this.setContentView(2131558512);
            this.j();
            this.getWindow().setLayout(-2, -1);
            this.getWindow().setGravity(17);
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        public static final /* enum */ b d0;
        public static final /* enum */ b e0;
        private static final b[] f0;
        public static final /* enum */ b q;

        static {
            q = new b();
            c0 = new b();
            d0 = new b();
            e0 = new b();
            f0 = ax.a3.B$b.d();
        }

        private static /* synthetic */ b[] d() {
            return new b[]{q, c0, d0, e0};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])f0.clone();
        }
    }
}

