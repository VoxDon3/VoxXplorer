package ax.w3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import ax.A3.b;
import ax.C3.b;
import ax.X2.J;
import ax.Z2.t;
import ax.b3.C1486a;
import ax.b3.C1495j;
import ax.c3.C1808A;
import ax.c3.C1809B;
import ax.c3.C1832u;
import ax.c3.EnumC1837z;
import ax.c3.d0;
import ax.p.C2747c;
import ax.r3.C2947d;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3204v;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3605y;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class f extends ax.A3.a {
    private static final Logger v = ax.Q2.g.a(f.class);
    private String q;
    private boolean r;
    private AbstractC3595n s;
    private C3596o t;
    private boolean u;

    private static class a implements b.d {
        protected final AbstractC3595n a;
        protected final C3596o b;

        public a(C3596o c3596o, AbstractC3595n abstractC3595n) {
            this.a = abstractC3595n;
            this.b = c3596o;
        }

        @Override // ax.C3.b.d
        public InputStream createInputStream() throws IOException {
            if (this.b.a()) {
                try {
                    return this.b.J(this.a, 0L);
                } catch (C1495j e) {
                    throw new IOException(e);
                }
            }
            throw new IOException("File operator is not connected : " + this.b.S().I() + HttpUrl.FRAGMENT_ENCODE_SET);
        }
    }

    public static class b extends C2747c implements Animatable {
        boolean b;
        ax.b4.c c;
        int d;
        int e;

        public b(Context context, ax.b4.c cVar) {
            super(cVar);
            this.b = false;
            this.c = cVar;
            int t = C3180B.t(context);
            this.e = d(this.c.getIntrinsicWidth(), 160, t);
            this.d = d(this.c.getIntrinsicHeight(), 160, t);
        }

        private static int d(int i, int i2, int i3) {
            return (i2 == 0 || i3 == 0 || i2 == i3) ? i : ((i * i3) + (i2 >> 1)) / i2;
        }

        public void c() {
            this.b = true;
            this.c.i();
        }

        @Override // ax.p.C2747c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.b) {
                return;
            }
            try {
                super.draw(canvas);
            } catch (NullPointerException e) {
                ax.Ha.c.h().f().d("GifDrawable FrameLoader Null").l(e).h();
            } catch (RuntimeException e2) {
                ax.Ha.c.h().f().d("GifDrawable FrameLoader Too large").l(e2).h();
            }
        }

        @Override // ax.p.C2747c, android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.d;
        }

        @Override // ax.p.C2747c, android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.e;
        }

        @Override // android.graphics.drawable.Animatable
        public boolean isRunning() {
            return this.c.isRunning();
        }

        @Override // android.graphics.drawable.Animatable
        public void start() {
            try {
                this.c.start();
            } catch (NullPointerException unused) {
            }
        }

        @Override // android.graphics.drawable.Animatable
        public void stop() {
            try {
                this.c.stop();
            } catch (NullPointerException unused) {
            }
        }
    }

    public static class c extends C2747c {
        Paint b;
        PictureDrawable c;

        public c(PictureDrawable pictureDrawable) {
            super(pictureDrawable);
            this.c = pictureDrawable;
            this.b = ax.C3.e.b(20);
        }

        @Override // ax.p.C2747c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.c.getPicture() != null) {
                Rect bounds = getBounds();
                canvas.save();
                canvas.clipRect(bounds);
                canvas.translate(bounds.left, bounds.top);
                canvas.drawRect(0.0f, 0.0f, bounds.width(), bounds.height(), this.b);
                canvas.drawPicture(this.c.getPicture());
                canvas.restore();
            }
        }
    }

    public f(Context context, C3596o c3596o, AbstractC3595n abstractC3595n, String str, boolean z, boolean z2) {
        super(context, C3204v.f(AbstractC3199q.e.HIGH), str);
        this.q = str;
        this.r = z;
        this.s = abstractC3595n;
        this.t = c3596o;
        this.u = z2;
        if (J.r()) {
            this.u = false;
        }
    }

    private void Q(com.android.ex.photo.c cVar, AbstractC3595n abstractC3595n) {
        cVar.g = abstractC3595n;
        cVar.l = abstractC3595n.T();
        cVar.m = abstractC3595n.B();
        cVar.i = abstractC3595n.q();
        cVar.n = abstractC3595n.I(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r3 > 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long R(android.net.Uri r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = r1.equals(r0)
            r1 = -1
            if (r0 == 0) goto L22
            java.io.File r0 = new java.io.File
            java.lang.String r8 = r8.getPath()
            r0.<init>(r8)
            long r3 = r0.length()
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L22
            goto L23
        L22:
            r3 = r1
        L23:
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L30
            com.voxdon.xplorer.file.n r8 = r7.s
            if (r8 == 0) goto L30
            long r0 = r8.p()
            return r0
        L30:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.w3.f.R(android.net.Uri):long");
    }

    private File S() {
        AbstractC3595n abstractC3595n = this.s;
        if (abstractC3595n == null || C1809B.H(abstractC3595n) || this.r) {
            return null;
        }
        File N = this.s.N();
        if (C1809B.G(N, this.s)) {
            return N;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void V(com.android.ex.photo.c r9, android.content.Context r10, com.voxdon.xplorer.file.AbstractC3595n r11) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.w3.f.V(com.android.ex.photo.c, android.content.Context, com.voxdon.xplorer.file.n):void");
    }

    @Override // ax.A3.a, ax.c5.AbstractC1843a
    /* renamed from: L */
    public b.a H() {
        Uri parse;
        EnumC1837z g;
        b.a aVar = new b.a();
        Context j = j();
        this.t.n0();
        if (j != null) {
            try {
                String str = this.q;
                if (str != null) {
                    try {
                    } catch (UnsupportedOperationException e) {
                        aVar.e = 1;
                        aVar.h = e;
                    }
                    if (this.r) {
                        File l = C2947d.l(j(), this.q);
                        if (l == null) {
                            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                            aVar.c = createBitmap;
                            createBitmap.eraseColor(0);
                            aVar.e = 0;
                            this.t.k0(false);
                            return aVar;
                        }
                        parse = C1832u.z(l);
                        g = null;
                    } else {
                        parse = Uri.parse(str);
                        g = C1808A.g(d0.k(parse.getPath()));
                    }
                    AbstractC3595n abstractC3595n = this.s;
                    File S = S();
                    if (EnumC1837z.IMAGE == g) {
                        String scheme = parse.getScheme();
                        boolean Z = ax.Q2.f.Z(ax.Q2.f.D(scheme));
                        boolean P = P(this.q);
                        if (!"file".equals(scheme) && ((!Z || P) && abstractC3595n != null)) {
                            if (C1809B.P(abstractC3595n)) {
                                parse = C1832u.z(((C3605y) abstractC3595n).F0());
                            } else if (S != null) {
                                parse = C1832u.z(S);
                            } else {
                                File Z2 = abstractC3595n.Z();
                                if (abstractC3595n.c0()) {
                                    try {
                                        this.t.r(abstractC3595n);
                                    } catch (C1495j unused) {
                                    }
                                }
                                if (C1809B.G(Z2, abstractC3595n)) {
                                    t.b().e(Z2);
                                } else if (this.t.S() != abstractC3595n.P()) {
                                    ax.Ha.c.h().c("IMAGE VIEWER LOCATION ERROR").g(this.t.S().I() + ":" + abstractC3595n.P().I()).h();
                                } else {
                                    try {
                                        this.t.p(abstractC3595n, Z2, null, null);
                                        t.b().c(Z2);
                                        t.b().a();
                                        if (ax.Q2.f.p0(abstractC3595n.P())) {
                                            String S2 = AbstractC3594m.S(abstractC3595n);
                                            if (C2947d.l(j(), S2) == null) {
                                                new C2947d(j(), this.t).w(S2);
                                            }
                                        }
                                    } catch (C1486a | C1495j unused2) {
                                    }
                                }
                                parse = C1832u.z(Z2);
                            }
                        }
                        aVar = T(parse, false);
                    } else if (EnumC1837z.VIDEO == g) {
                        if (S != null) {
                            parse = C1832u.z(S);
                        }
                        aVar = U(parse);
                        aVar.g = true;
                    } else if (this.r) {
                        aVar = T(parse, true);
                    } else {
                        if (S != null) {
                            parse = C1832u.z(S);
                        }
                        aVar = T(parse, false);
                    }
                    this.t.k0(false);
                    return aVar;
                }
            } catch (Throwable th) {
                this.t.k0(false);
                throw th;
            }
        }
        aVar.e = 1;
        this.t.k0(false);
        return aVar;
    }

    @Override // ax.A3.a
    protected void O(Drawable drawable) {
        if (drawable == null || !(drawable instanceof b)) {
            return;
        }
        ((b) drawable).c();
    }

    boolean P(String str) {
        String k = d0.k(str);
        return "gif".equals(k) || "webp".equals(k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x007b, code lost:
    
        if (r9.u != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        if (r9.u != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    ax.A3.b.a T(android.net.Uri r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.w3.f.T(android.net.Uri, boolean):ax.A3.b$a");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0168, code lost:
    
        if (0 == 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0110, code lost:
    
        if (r3 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0112, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0150, code lost:
    
        if (r3 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0180, code lost:
    
        if (0 == 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0174, code lost:
    
        if (0 == 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x015c, code lost:
    
        if (0 == 0) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    ax.A3.b.a U(android.net.Uri r10) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.w3.f.U(android.net.Uri):ax.A3.b$a");
    }
}
