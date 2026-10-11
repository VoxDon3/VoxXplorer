/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.SubtitleView;
import androidx.media3.ui.d;
import androidx.media3.ui.x;
import androidx.media3.ui.y;
import ax.P0.A;
import ax.P0.C;
import ax.P0.G;
import ax.P0.H;
import ax.P0.I;
import ax.P0.N;
import ax.P0.T;
import ax.P0.V;
import ax.P0.a;
import ax.P0.a0;
import ax.S0.a;
import ax.S0.d0;
import ax.a2.B;
import ax.a2.D;
import ax.a2.F;
import ax.a2.j;
import ax.a2.k;
import ax.a2.m;
import ax.a2.n;
import ax.a2.o;
import ax.a2.p;
import ax.a2.q;
import ax.a2.r;
import ax.a2.s;
import ax.a2.t;
import ax.a2.v;
import ax.a2.z;
import ax.p1.l;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class PlayerView
extends FrameLayout {
    private boolean A;
    private ax.P0.p<? super ax.P0.F> B;
    private CharSequence C;
    private int D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private final c a;
    private final AspectRatioFrameLayout b;
    private final View c;
    private final View d;
    private final boolean e;
    private final f f;
    private final ImageView g;
    private final ImageView h;
    private final SubtitleView i;
    private final View j;
    private final TextView k;
    private final androidx.media3.ui.d l;
    private final FrameLayout m;
    private final FrameLayout n;
    private final Handler o;
    private final Class<?> p;
    private final Method q;
    private final Object r;
    private H s;
    private boolean t;
    private d u;
    private d.m v;
    private int w;
    private int x;
    private Drawable y;
    private int z;

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PlayerView(Context object, AttributeSet attributeSet, int n8) {
        Object var20_15;
        Object var21_36;
        boolean bl;
        boolean bl2;
        boolean bl3;
        int n9;
        int n10;
        boolean bl4;
        int n11;
        int n12;
        boolean bl5;
        boolean bl6;
        Object object2;
        block36: {
            block34: {
                ViewGroup.LayoutParams layoutParams;
                AspectRatioFrameLayout aspectRatioFrameLayout;
                block33: {
                    block35: {
                        View view;
                        int n13;
                        int n14;
                        int n15;
                        int n16;
                        super((Context)object, attributeSet, n8);
                        object2 = new c(this);
                        this.a = object2;
                        this.o = new Handler(Looper.getMainLooper());
                        if (this.isInEditMode()) {
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e = false;
                            this.f = null;
                            this.g = null;
                            this.h = null;
                            this.i = null;
                            this.j = null;
                            this.k = null;
                            this.l = null;
                            this.m = null;
                            this.n = null;
                            this.p = null;
                            this.q = null;
                            this.r = null;
                            attributeSet = new ImageView((Context)object);
                            if (Build.VERSION.SDK_INT >= 23) {
                                PlayerView.A((Context)object, this.getResources(), (ImageView)attributeSet);
                            } else {
                                PlayerView.z((Context)object, this.getResources(), (ImageView)attributeSet);
                            }
                            this.addView((View)attributeSet);
                            return;
                        }
                        int n17 = ax.a2.B.c;
                        if (attributeSet != null) {
                            TypedArray typedArray = object.getTheme().obtainStyledAttributes(attributeSet, ax.a2.F.c0, n8, 0);
                            try {
                                n8 = ax.a2.F.o0;
                                bl6 = typedArray.hasValue(n8);
                                n16 = typedArray.getColor(n8, 0);
                                n17 = typedArray.getResourceId(ax.a2.F.k0, n17);
                                bl5 = typedArray.getBoolean(ax.a2.F.q0, true);
                                n12 = typedArray.getInt(ax.a2.F.d0, 1);
                                n11 = typedArray.getResourceId(ax.a2.F.f0, 0);
                                n15 = typedArray.getInt(ax.a2.F.i0, 0);
                                bl4 = typedArray.getBoolean(ax.a2.F.r0, true);
                                n10 = typedArray.getInt(ax.a2.F.p0, 1);
                                n14 = typedArray.getInt(ax.a2.F.l0, 0);
                                n8 = typedArray.getInt(ax.a2.F.n0, 5000);
                                n9 = ax.a2.F.h0;
                                bl3 = typedArray.getBoolean(n9, true);
                                bl2 = typedArray.getBoolean(ax.a2.F.e0, true);
                                n9 = typedArray.getInteger(ax.a2.F.m0, 0);
                                this.A = typedArray.getBoolean(ax.a2.F.j0, this.A);
                                bl = typedArray.getBoolean(ax.a2.F.g0, true);
                                n13 = n10;
                                n10 = n15;
                            }
                            finally {
                                typedArray.recycle();
                            }
                        } else {
                            bl4 = true;
                            n14 = 0;
                            bl2 = true;
                            bl3 = true;
                            bl = true;
                            n9 = 0;
                            n11 = 0;
                            n13 = 1;
                            n16 = 0;
                            n10 = 0;
                            n12 = 1;
                            n8 = 5000;
                            bl6 = false;
                            bl5 = true;
                        }
                        LayoutInflater.from((Context)object).inflate(n17, (ViewGroup)this);
                        this.setDescendantFocusability(262144);
                        this.b = aspectRatioFrameLayout = (AspectRatioFrameLayout)this.findViewById(ax.a2.z.i);
                        if (aspectRatioFrameLayout != null) {
                            PlayerView.T(aspectRatioFrameLayout, n14);
                        }
                        this.c = view = this.findViewById(ax.a2.z.N);
                        if (view != null && bl6) {
                            view.setBackgroundColor(n16);
                        }
                        if (aspectRatioFrameLayout == null || n13 == 0) break block34;
                        layoutParams = new ViewGroup.LayoutParams(-1, -1);
                        if (n13 == 2) break block35;
                        if (n13 != 3) {
                            if (n13 != 4) {
                                SurfaceView surfaceView = new SurfaceView((Context)object);
                                if (Build.VERSION.SDK_INT >= 34) {
                                    androidx.media3.ui.PlayerView$b.a(surfaceView);
                                }
                                this.d = surfaceView;
                                break block33;
                            } else {
                                try {
                                    n15 = ax.o1.x.b;
                                    this.d = (View)ax.o1.x.class.getConstructor(Context.class).newInstance(object);
                                }
                                catch (Exception exception) {
                                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", exception);
                                }
                            }
                        } else {
                            try {
                                n15 = ax.p1.l.m;
                                this.d = (View)l.class.getConstructor(Context.class).newInstance(object);
                                bl6 = true;
                            }
                            catch (Exception exception) {
                                throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", exception);
                            }
                        }
                    }
                    this.d = new TextureView((Context)object);
                }
                bl6 = false;
                this.d.setLayoutParams(layoutParams);
                this.d.setOnClickListener((View.OnClickListener)object2);
                this.d.setClickable(false);
                aspectRatioFrameLayout.addView(this.d, 0);
                break block36;
            }
            this.d = null;
            bl6 = false;
        }
        this.e = bl6;
        object2 = Build.VERSION.SDK_INT == 34 ? new f() : null;
        this.f = object2;
        this.m = (FrameLayout)this.findViewById(ax.a2.z.a);
        this.n = (FrameLayout)this.findViewById(ax.a2.z.B);
        this.g = (ImageView)this.findViewById(ax.a2.z.u);
        this.x = n10;
        Class<ExoPlayer> clazz = ExoPlayer.class;
        try {
            object2 = ImageOutput.a;
            object2 = ExoPlayer.class.getMethod("setImageOutput", ImageOutput.class);
            ClassLoader classLoader = ImageOutput.class.getClassLoader();
            k k8 = new k(this);
            Object object3 = Proxy.newProxyInstance(classLoader, new Class[]{ImageOutput.class}, (InvocationHandler)k8);
        }
        catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
            Object var21_35 = null;
            Object var20_14 = null;
            object2 = null;
        }
        this.p = var21_36;
        this.q = object2;
        this.r = var20_15;
        object2 = (ImageView)this.findViewById(ax.a2.z.b);
        this.h = object2;
        if (!bl5 || n12 == 0 || object2 == null) {
            n12 = 0;
        }
        this.w = n12;
        if (n11 != 0) {
            this.y = ax.Q.b.e(this.getContext(), n11);
        }
        object2 = (SubtitleView)this.findViewById(ax.a2.z.Q);
        this.i = object2;
        if (object2 != null) {
            ((SubtitleView)((Object)object2)).e();
            ((SubtitleView)((Object)object2)).f();
        }
        object2 = this.findViewById(ax.a2.z.f);
        this.j = object2;
        if (object2 != null) {
            object2.setVisibility(8);
        }
        this.z = n9;
        object2 = (TextView)this.findViewById(ax.a2.z.n);
        this.k = object2;
        if (object2 != null) {
            object2.setVisibility(8);
        }
        n12 = ax.a2.z.j;
        androidx.media3.ui.d d8 = (androidx.media3.ui.d)this.findViewById(n12);
        object2 = this.findViewById(ax.a2.z.k);
        if (d8 != null) {
            this.l = d8;
        } else if (object2 != null) {
            object = new androidx.media3.ui.d((Context)object, null, 0, attributeSet);
            this.l = object;
            object.setId(n12);
            object.setLayoutParams(object2.getLayoutParams());
            attributeSet = (ViewGroup)object2.getParent();
            n12 = attributeSet.indexOfChild((View)object2);
            attributeSet.removeView((View)object2);
            attributeSet.addView((View)object, n12);
        } else {
            this.l = null;
        }
        object = this.l;
        if (object == null) {
            n8 = 0;
        }
        this.D = n8;
        this.G = bl3;
        this.E = bl2;
        this.F = bl;
        bl6 = bl4 && object != null;
        this.t = bl6;
        if (object != null) {
            ((androidx.media3.ui.d)((Object)object)).f0();
            this.l.Y(this.a);
        }
        if (bl4) {
            this.setClickable(true);
        }
        this.b0();
    }

    private static void A(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(d0.a0(context, resources, ax.a2.x.a));
        imageView.setBackgroundColor(ax.a2.j.a(resources, ax.a2.v.a, null));
    }

    private boolean C() {
        H h8 = this.s;
        return h8 != null && this.r != null && h8.c0(30) && h8.X().c(4);
    }

    private boolean D() {
        H h8 = this.s;
        return h8 != null && h8.c0(30) && h8.X().c(2);
    }

    private void E() {
        this.H();
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setImageResource(17170445);
        }
    }

    private void F() {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.h.setVisibility(4);
        }
    }

    private void H() {
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    @SuppressLint(value={"InlinedApi"})
    private boolean J(int n8) {
        return n8 == 19 || n8 == 270 || n8 == 22 || n8 == 271 || n8 == 20 || n8 == 269 || n8 == 21 || n8 == 268 || n8 == 23;
        {
        }
    }

    private boolean K() {
        ImageView imageView = this.g;
        if (imageView == null) {
            return false;
        }
        return (imageView = imageView.getDrawable()) != null && imageView.getAlpha() != 0;
    }

    private boolean L() {
        H h8 = this.s;
        return h8 != null && h8.c0(16) && this.s.p() && this.s.v();
    }

    private void M(boolean bl) {
        if (!(this.L() && this.F || !this.h0())) {
            boolean bl2 = this.l.k0() && this.l.getShowTimeoutMs() <= 0;
            boolean bl3 = this.U();
            if (bl || bl2 || bl3) {
                this.W(bl3);
            }
        }
    }

    private void O(Bitmap bitmap) {
        this.o.post((Runnable)new ax.a2.l(this, bitmap));
    }

    private boolean R(H object) {
        if (object != null && object.c0(18)) {
            object = object.q0().i;
            if (object == null) {
                return false;
            }
            object = BitmapFactory.decodeByteArray((byte[])object, (int)0, (int)((Object)object).length);
            return this.S((Drawable)new BitmapDrawable(this.getResources(), (Bitmap)object));
        }
        return false;
    }

    private boolean S(Drawable drawable) {
        if (this.h != null && drawable != null) {
            int n8 = drawable.getIntrinsicWidth();
            int n9 = drawable.getIntrinsicHeight();
            if (n8 > 0 && n9 > 0) {
                float f8 = (float)n8 / (float)n9;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.w == 2) {
                    f8 = (float)this.getWidth() / (float)this.getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                this.N(this.b, f8);
                this.h.setScaleType(scaleType);
                this.h.setImageDrawable(drawable);
                this.h.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void T(AspectRatioFrameLayout aspectRatioFrameLayout, int n8) {
        aspectRatioFrameLayout.setResizeMode(n8);
    }

    private boolean U() {
        H h8 = this.s;
        if (h8 == null) {
            return true;
        }
        int n8 = h8.i();
        return !(!this.E || this.s.c0(17) && this.s.h0().q() || n8 != 1 && n8 != 4 && ax.S0.a.e(this.s).v());
    }

    private void W(boolean bl) {
        if (!this.h0()) {
            return;
        }
        androidx.media3.ui.d d8 = this.l;
        int n8 = bl ? 0 : this.D;
        d8.setShowTimeoutMs(n8);
        this.l.v0();
    }

    private void X() {
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.f0();
        }
    }

    private void Y() {
        if (this.h0() && this.s != null) {
            if (!this.l.k0()) {
                this.M(true);
                return;
            }
            if (this.G) {
                this.l.e0();
            }
        }
    }

    private void Z() {
        Object object = this.s;
        object = object != null ? object.F() : a0.e;
        int n8 = ((a0)object).a;
        int n9 = ((a0)object).b;
        float f8 = 0.0f;
        float f9 = n9 != 0 && n8 != 0 ? (float)n8 * ((a0)object).d / (float)n9 : 0.0f;
        object = this.b;
        if (this.e) {
            f9 = f8;
        }
        this.N((AspectRatioFrameLayout)((Object)object), f9);
    }

    public static /* synthetic */ void a(PlayerView playerView, Bitmap bitmap) {
        ((Object)((Object)playerView)).getClass();
        playerView.setImage((Drawable)new BitmapDrawable(playerView.getResources(), bitmap));
        if (!playerView.D()) {
            playerView.X();
            playerView.y();
        }
    }

    /*
     * Exception decompiling
     */
    private void a0() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static /* synthetic */ Object b(PlayerView playerView, Object object, Method method, Object[] objectArray) {
        ((Object)((Object)playerView)).getClass();
        if (method.getName().equals("onImageAvailable")) {
            playerView.O((Bitmap)objectArray[1]);
        }
        return null;
    }

    private void b0() {
        androidx.media3.ui.d d8 = this.l;
        String string = null;
        if (d8 != null && this.t) {
            if (d8.k0()) {
                if (this.G) {
                    string = this.getResources().getString(ax.a2.D.e);
                }
                this.setContentDescription(string);
                return;
            }
            this.setContentDescription(this.getResources().getString(ax.a2.D.l));
            return;
        }
        this.setContentDescription(null);
    }

    private void c0() {
        if (this.L() && this.F) {
            this.G();
            return;
        }
        this.M(false);
    }

    private void d0() {
        Object object = this.k;
        if (object != null) {
            Object object2 = this.C;
            if (object2 != null) {
                object.setText((CharSequence)object2);
                this.k.setVisibility(0);
                return;
            }
            object2 = this.s;
            object2 = object2 != null ? object2.R() : null;
            if (object2 != null && (object = this.B) != null) {
                object2 = (CharSequence)object.a(object2).second;
                this.k.setText((CharSequence)object2);
                this.k.setVisibility(0);
                return;
            }
            this.k.setVisibility(8);
        }
    }

    private void e0(boolean bl) {
        block12: {
            block11: {
                H h8 = this.s;
                boolean bl2 = false;
                boolean bl3 = h8 != null && h8.c0(30) && !h8.X().b();
                if (!(this.A || bl3 && !bl)) {
                    this.F();
                    this.y();
                    this.E();
                }
                if (!bl3) break block11;
                bl = this.D();
                boolean bl4 = this.C();
                if (!bl && !bl4) {
                    this.y();
                    this.E();
                }
                View view = this.c;
                bl3 = bl2;
                if (view != null) {
                    bl3 = bl2;
                    if (view.getVisibility() == 4) {
                        bl3 = bl2;
                        if (this.K()) {
                            bl3 = true;
                        }
                    }
                }
                if (bl4 && !bl && bl3) {
                    this.y();
                    this.X();
                } else if (bl && !bl4 && bl3) {
                    this.E();
                }
                if (bl || bl4 || !this.g0() || !this.R(h8) && !this.S(this.y)) break block12;
            }
            return;
        }
        this.F();
    }

    private void f0() {
        ImageView imageView = this.g;
        if (imageView != null && (imageView = imageView.getDrawable()) != null) {
            int n8 = imageView.getIntrinsicWidth();
            int n9 = imageView.getIntrinsicHeight();
            if (n8 > 0 && n9 > 0) {
                float f8 = (float)n8 / (float)n9;
                imageView = ImageView.ScaleType.FIT_XY;
                if (this.x == 1) {
                    f8 = (float)this.getWidth() / (float)this.getHeight();
                    imageView = ImageView.ScaleType.CENTER_CROP;
                }
                if (this.g.getVisibility() == 0) {
                    this.N(this.b, f8);
                }
                this.g.setScaleType((ImageView.ScaleType)imageView);
            }
        }
    }

    private boolean g0() {
        if (this.w != 0) {
            ax.S0.a.i(this.h);
            return true;
        }
        return false;
    }

    private boolean h0() {
        if (this.t) {
            ax.S0.a.i(this.l);
            return true;
        }
        return false;
    }

    static /* synthetic */ e p(PlayerView playerView) {
        ((Object)((Object)playerView)).getClass();
        return null;
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.g;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        this.f0();
    }

    /*
     * WARNING - void declaration
     */
    private void setImageOutput(H h8) {
        Class<?> clazz = this.p;
        if (clazz != null && clazz.isAssignableFrom(h8.getClass())) {
            Throwable var1_4;
            try {
                ax.S0.a.e(this.q).invoke(h8, ax.S0.a.e(this.r));
                return;
            }
            catch (InvocationTargetException invocationTargetException) {
            }
            catch (IllegalAccessException illegalAccessException) {
                // empty catch block
            }
            throw new RuntimeException((Throwable)var1_4);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void x(H h8) {
        Class<?> clazz = this.p;
        if (clazz != null && clazz.isAssignableFrom(h8.getClass())) {
            Throwable var1_4;
            try {
                ax.S0.a.e(this.q).invoke(h8, new Object[]{null});
                return;
            }
            catch (InvocationTargetException invocationTargetException) {
            }
            catch (IllegalAccessException illegalAccessException) {
                // empty catch block
            }
            throw new RuntimeException((Throwable)var1_4);
        }
    }

    private void y() {
        View view = this.c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void z(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(d0.a0(context, resources, ax.a2.x.a));
        imageView.setBackgroundColor(resources.getColor(ax.a2.v.a));
    }

    public boolean B(KeyEvent keyEvent) {
        return this.h0() && this.l.a0(keyEvent);
    }

    public void G() {
        androidx.media3.ui.d d8 = this.l;
        if (d8 != null) {
            d8.e0();
        }
    }

    public boolean I() {
        androidx.media3.ui.d d8 = this.l;
        return d8 != null && d8.k0();
    }

    protected void N(AspectRatioFrameLayout aspectRatioFrameLayout, float f8) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f8);
        }
    }

    public void P() {
        View view = this.d;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView)view).onPause();
        }
    }

    public void Q() {
        View view = this.d;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView)view).onResume();
        }
    }

    public void V() {
        this.W(this.U());
    }

    protected void dispatchDraw(Canvas object) {
        super.dispatchDraw((Canvas)object);
        if (Build.VERSION.SDK_INT == 34 && (object = this.f) != null && this.H) {
            ((f)object).c();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        H h8 = this.s;
        if (h8 != null && h8.c0(16) && this.s.p()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean bl = this.J(keyEvent.getKeyCode());
        if (bl && this.h0() && !this.l.k0()) {
            this.M(true);
            return true;
        }
        if (!this.B(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            if (bl && this.h0()) {
                this.M(true);
            }
            return false;
        }
        this.M(true);
        return true;
    }

    public List<ax.P0.a> getAdOverlayInfos() {
        ArrayList<ax.P0.a> arrayList = new ArrayList<ax.P0.a>();
        FrameLayout frameLayout = this.n;
        if (frameLayout != null) {
            arrayList.add(new a.a((View)frameLayout, 4).b("Transparent overlay does not impact viewability").a());
        }
        if ((frameLayout = this.l) != null) {
            arrayList.add(new a.a((View)frameLayout, 1).a());
        }
        return ax.r7.z.u(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup)ax.S0.a.j(this.m, "exo_ad_overlay must be present for ad playback");
    }

    public int getArtworkDisplayMode() {
        return this.w;
    }

    public boolean getControllerAutoShow() {
        return this.E;
    }

    public boolean getControllerHideOnTouch() {
        return this.G;
    }

    public int getControllerShowTimeoutMs() {
        return this.D;
    }

    public Drawable getDefaultArtwork() {
        return this.y;
    }

    public int getImageDisplayMode() {
        return this.x;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.n;
    }

    public H getPlayer() {
        return this.s;
    }

    public int getResizeMode() {
        ax.S0.a.i(this.b);
        return this.b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.i;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.w != 0;
    }

    public boolean getUseController() {
        return this.t;
    }

    public View getVideoSurfaceView() {
        return this.d;
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (this.h0() && this.s != null) {
            this.M(true);
            return true;
        }
        return false;
    }

    public boolean performClick() {
        this.Y();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int n8) {
        boolean bl = n8 == 0 || this.h != null;
        ax.S0.a.g(bl);
        if (this.w != n8) {
            this.w = n8;
            this.e0(false);
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b b8) {
        ax.S0.a.i(this.b);
        this.b.setAspectRatioListener(b8);
    }

    public void setControllerAnimationEnabled(boolean bl) {
        ax.S0.a.i(this.l);
        this.l.setAnimationEnabled(bl);
    }

    public void setControllerAutoShow(boolean bl) {
        this.E = bl;
    }

    public void setControllerHideDuringAds(boolean bl) {
        this.F = bl;
    }

    public void setControllerHideOnTouch(boolean bl) {
        ax.S0.a.i(this.l);
        this.G = bl;
        this.b0();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(d.d d8) {
        ax.S0.a.i(this.l);
        this.l.setOnFullScreenModeChangedListener(d8);
    }

    public void setControllerShowTimeoutMs(int n8) {
        ax.S0.a.i(this.l);
        this.D = n8;
        if (this.l.k0()) {
            this.V();
        }
    }

    public void setControllerVisibilityListener(d d8) {
        this.u = d8;
        if (d8 != null) {
            this.setControllerVisibilityListener((d.m)null);
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(d.m m8) {
        ax.S0.a.i(this.l);
        d.m m9 = this.v;
        if (m9 != m8) {
            if (m9 != null) {
                this.l.s0(m9);
            }
            this.v = m8;
            if (m8 != null) {
                this.l.Y(m8);
                this.setControllerVisibilityListener((d)null);
            }
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        boolean bl = this.k != null;
        ax.S0.a.g(bl);
        this.C = charSequence;
        this.d0();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.y != drawable) {
            this.y = drawable;
            this.e0(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean bl) {
        this.H = bl;
    }

    public void setErrorMessageProvider(ax.P0.p<? super ax.P0.F> p8) {
        if (this.B != p8) {
            this.B = p8;
            this.d0();
        }
    }

    public void setFullscreenButtonClickListener(e e8) {
        ax.S0.a.i(this.l);
        this.l.setOnFullScreenModeChangedListener(this.a);
    }

    public void setFullscreenButtonState(boolean bl) {
        ax.S0.a.i(this.l);
        this.l.B0(bl);
    }

    public void setImageDisplayMode(int n8) {
        boolean bl = this.g != null;
        ax.S0.a.g(bl);
        if (this.x != n8) {
            this.x = n8;
            this.f0();
        }
    }

    public void setKeepContentOnPlayerReset(boolean bl) {
        if (this.A != bl) {
            this.A = bl;
            this.e0(false);
        }
    }

    public void setPlayer(H h8) {
        boolean bl = Looper.myLooper() == Looper.getMainLooper();
        ax.S0.a.g(bl);
        bl = h8 == null || h8.i0() == Looper.getMainLooper();
        ax.S0.a.a(bl);
        Object object = this.s;
        if (object == h8) {
            return;
        }
        if (object != null) {
            object.q(this.a);
            if (object.c0(27)) {
                View view = this.d;
                if (view instanceof TextureView) {
                    object.E((TextureView)view);
                } else if (view instanceof SurfaceView) {
                    object.d0((SurfaceView)view);
                }
            }
            this.x((H)object);
        }
        if ((object = this.i) != null) {
            ((SubtitleView)((Object)object)).setCues(null);
        }
        this.s = h8;
        if (this.h0()) {
            this.l.setPlayer(h8);
        }
        this.a0();
        this.d0();
        this.e0(true);
        if (h8 != null) {
            if (h8.c0(27)) {
                object = this.d;
                if (object instanceof TextureView) {
                    h8.o0((TextureView)object);
                } else if (object instanceof SurfaceView) {
                    h8.L((SurfaceView)object);
                }
                if (!h8.c0(30) || h8.X().d(2)) {
                    this.Z();
                }
            }
            if (this.i != null && h8.c0(28)) {
                this.i.setCues(h8.Z().a);
            }
            h8.N(this.a);
            this.setImageOutput(h8);
            this.M(false);
            return;
        }
        this.G();
    }

    public void setRepeatToggleModes(int n8) {
        ax.S0.a.i(this.l);
        this.l.setRepeatToggleModes(n8);
    }

    public void setResizeMode(int n8) {
        ax.S0.a.i(this.b);
        this.b.setResizeMode(n8);
    }

    public void setShowBuffering(int n8) {
        if (this.z != n8) {
            this.z = n8;
            this.a0();
        }
    }

    public void setShowFastForwardButton(boolean bl) {
        ax.S0.a.i(this.l);
        this.l.setShowFastForwardButton(bl);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean bl) {
        ax.S0.a.i(this.l);
        this.l.setShowMultiWindowTimeBar(bl);
    }

    public void setShowNextButton(boolean bl) {
        ax.S0.a.i(this.l);
        this.l.setShowNextButton(bl);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean bl) {
        ax.S0.a.i(this.l);
        this.l.setShowPlayButtonIfPlaybackIsSuppressed(bl);
    }

    public void setShowPreviousButton(boolean bl) {
        ax.S0.a.i(this.l);
        this.l.setShowPreviousButton(bl);
    }

    public void setShowRewindButton(boolean bl) {
        ax.S0.a.i(this.l);
        this.l.setShowRewindButton(bl);
    }

    public void setShowShuffleButton(boolean bl) {
        ax.S0.a.i(this.l);
        this.l.setShowShuffleButton(bl);
    }

    public void setShowSubtitleButton(boolean bl) {
        ax.S0.a.i(this.l);
        this.l.setShowSubtitleButton(bl);
    }

    public void setShowVrButton(boolean bl) {
        ax.S0.a.i(this.l);
        this.l.setShowVrButton(bl);
    }

    public void setShutterBackgroundColor(int n8) {
        View view = this.c;
        if (view != null) {
            view.setBackgroundColor(n8);
        }
    }

    public void setTimeBarScrubbingEnabled(boolean bl) {
        ax.S0.a.i(this.l);
        this.l.setTimeBarScrubbingEnabled(bl);
    }

    @Deprecated
    public void setUseArtwork(boolean bl) {
        this.setArtworkDisplayMode(bl ^ 1);
    }

    public void setUseController(boolean bl) {
        boolean bl2 = true;
        boolean bl3 = !bl || this.l != null;
        ax.S0.a.g(bl3);
        bl3 = bl2;
        if (!bl) {
            bl3 = this.hasOnClickListeners() ? bl2 : false;
        }
        this.setClickable(bl3);
        if (this.t == bl) {
            return;
        }
        this.t = bl;
        if (this.h0()) {
            this.l.setPlayer(this.s);
        } else {
            androidx.media3.ui.d d8 = this.l;
            if (d8 != null) {
                d8.e0();
                this.l.setPlayer(null);
            }
        }
        this.b0();
    }

    public void setVisibility(int n8) {
        super.setVisibility(n8);
        View view = this.d;
        if (view instanceof SurfaceView) {
            view.setVisibility(n8);
        }
    }

    private static class b {
        public static void a(SurfaceView surfaceView) {
            ax.a2.m.a(surfaceView, 2);
        }
    }

    private final class c
    implements H.d,
    View.OnClickListener,
    d.m,
    d.d {
        private final N.b a;
        private Object b;
        final PlayerView c;

        public c(PlayerView playerView) {
            this.c = playerView;
            this.a = new N.b();
        }

        @Override
        public /* synthetic */ void D(int n8) {
            I.r(this, n8);
        }

        @Override
        public /* synthetic */ void E(boolean bl) {
            I.k(this, bl);
        }

        @Override
        public /* synthetic */ void F(int n8) {
            I.v(this, n8);
        }

        @Override
        public void G(boolean bl) {
            PlayerView.p(this.c);
        }

        @Override
        public void H(V object) {
            H h8 = ax.S0.a.e(this.c.s);
            object = h8.c0(17) ? h8.h0() : N.a;
            if (((N)object).q()) {
                this.b = null;
            } else if (h8.c0(30) && !h8.X().b()) {
                this.b = ((N)object).g((int)h8.D(), (N.b)this.a, (boolean)true).b;
            } else {
                Object object2 = this.b;
                if (object2 != null) {
                    int n8 = ((N)object).b(object2);
                    if (n8 != -1) {
                        n8 = ((N)object).f((int)n8, (N.b)this.a).c;
                        if (h8.b0() == n8) {
                            return;
                        }
                    }
                    this.b = null;
                }
            }
            this.c.e0(false);
        }

        @Override
        public /* synthetic */ void I(boolean bl) {
            I.i(this, bl);
        }

        @Override
        public /* synthetic */ void J(ax.P0.F f8) {
            I.t(this, f8);
        }

        @Override
        public void K(int n8) {
            this.c.b0();
            if (this.c.u != null) {
                this.c.u.a(n8);
            }
        }

        @Override
        public /* synthetic */ void L(float f8) {
            I.G(this, f8);
        }

        @Override
        public /* synthetic */ void N(ax.P0.F f8) {
            I.s(this, f8);
        }

        @Override
        public void O(int n8) {
            this.c.a0();
            this.c.d0();
            this.c.c0();
        }

        @Override
        public /* synthetic */ void P(N n8, int n9) {
            I.C(this, n8, n9);
        }

        @Override
        public /* synthetic */ void S(boolean bl) {
            I.z(this, bl);
        }

        @Override
        public /* synthetic */ void U(T t8) {
            I.D(this, t8);
        }

        @Override
        public /* synthetic */ void W(H.b b8) {
            I.c(this, b8);
        }

        @Override
        public /* synthetic */ void Y(int n8, boolean bl) {
            I.g(this, n8, bl);
        }

        @Override
        public /* synthetic */ void Z(boolean bl, int n8) {
            I.u(this, bl, n8);
        }

        @Override
        public void a(a0 a02) {
            if (!a02.equals(a0.e) && this.c.s != null && this.c.s.i() != 1) {
                this.c.Z();
            }
        }

        @Override
        public /* synthetic */ void a0(ax.P0.y y8, int n8) {
            I.l(this, y8, n8);
        }

        @Override
        public void b0() {
            if (this.c.c != null) {
                this.c.c.setVisibility(4);
                if (this.c.C()) {
                    this.c.H();
                    return;
                }
                this.c.E();
            }
        }

        @Override
        public /* synthetic */ void c(int n8) {
            I.b(this, n8);
        }

        @Override
        public /* synthetic */ void c0(H h8, H.c c8) {
            I.h(this, h8, c8);
        }

        @Override
        public /* synthetic */ void e(boolean bl) {
            I.A(this, bl);
        }

        @Override
        public void i0(boolean bl, int n8) {
            this.c.a0();
            this.c.c0();
        }

        @Override
        public /* synthetic */ void j(G g8) {
            I.p(this, g8);
        }

        @Override
        public /* synthetic */ void j0(A a8) {
            I.m(this, a8);
        }

        @Override
        public /* synthetic */ void k0(ax.P0.n n8) {
            I.f(this, n8);
        }

        @Override
        public void o0(int n8, int n9) {
            if (Build.VERSION.SDK_INT == 34 && this.c.d instanceof SurfaceView && this.c.H) {
                ax.S0.a.e(this.c.f).d(this.c.o, (SurfaceView)this.c.d, new n(this.c));
            }
        }

        public void onClick(View view) {
            this.c.Y();
        }

        @Override
        public void p0(H.e e8, H.e e9, int n8) {
            if (this.c.L() && this.c.F) {
                this.c.G();
            }
        }

        @Override
        public /* synthetic */ void r(C c8) {
            I.n(this, c8);
        }

        @Override
        public /* synthetic */ void r0(ax.P0.c c8) {
            I.a(this, c8);
        }

        @Override
        public void s(ax.R0.c c8) {
            if (this.c.i != null) {
                this.c.i.setCues(c8.a);
            }
        }

        public /* synthetic */ void t(List list) {
            I.e(this, list);
        }

        @Override
        public /* synthetic */ void t0(boolean bl) {
            I.j(this, bl);
        }

        @Override
        public /* synthetic */ void v(int n8) {
            I.y(this, n8);
        }
    }

    public static interface d {
        public void a(int var1);
    }

    public static interface e {
    }

    private static final class f {
        SurfaceSyncGroup a;

        private f() {
        }

        public static /* synthetic */ void a(f f8, SurfaceView surfaceView, Runnable runnable2) {
            f8.getClass();
            AttachedSurfaceControl attachedSurfaceControl = ax.a2.r.a(surfaceView);
            if (attachedSurfaceControl == null) {
                return;
            }
            surfaceView = ax.a2.o.a("exo-sync-b-334901521");
            f8.a = surfaceView;
            ax.S0.a.g(ax.a2.s.a((SurfaceSyncGroup)surfaceView, attachedSurfaceControl, new y()));
            runnable2.run();
            ax.a2.t.a(attachedSurfaceControl, ax.a2.p.a());
        }

        public static /* synthetic */ void b() {
        }

        public void c() {
            SurfaceSyncGroup surfaceSyncGroup = this.a;
            if (surfaceSyncGroup != null) {
                ax.a2.q.a(surfaceSyncGroup);
                this.a = null;
            }
        }

        public void d(Handler handler, SurfaceView surfaceView, Runnable runnable2) {
            handler.post((Runnable)new x(this, surfaceView, runnable2));
        }
    }
}

