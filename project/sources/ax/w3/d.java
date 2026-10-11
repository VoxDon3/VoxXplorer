package ax.w3;

import android.content.Context;
import ax.b0.InterfaceC1440a;
import ax.t3.l;
import ax.u3.AbstractC3199q;

/* loaded from: classes.dex */
public class d extends AbstractC3199q<Void, Integer, Boolean> {
    public static int j = 0;
    public static int k = 1;
    public static int l = 2;
    private Context h;
    private InterfaceC1440a<Integer> i;

    public d(Context context, InterfaceC1440a<Integer> interfaceC1440a) {
        super(AbstractC3199q.e.HIGH);
        this.h = context;
        this.i = interfaceC1440a;
    }

    public static boolean w(Context context, String str) {
        if (ax.P2.a.s(context)) {
            return false;
        }
        return ((l.p(context) && ax.P2.a.r(context)) || !ax.P2.a.q(str) || ax.P2.a.k() == null) ? false : true;
    }

    @Override // ax.u3.AbstractC3199q
    protected void o() {
        this.i.accept(Integer.valueOf(l));
    }

    @Override // ax.u3.AbstractC3199q
    protected void r() {
        super.r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.u3.AbstractC3199q
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Boolean g(Void... voidArr) {
        return Boolean.valueOf(y(this.h));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean y(android.content.Context r8) {
        /*
            r7 = this;
            java.lang.String r0 = ax.P2.a.k()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = ax.P2.a.t(r8, r0)
            if (r2 != 0) goto L15
            boolean r2 = ax.P2.a.p(r8, r0)
            if (r2 != 0) goto L15
            return r1
        L15:
            java.io.File r8 = ax.P2.a.e(r8)
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            r4.<init>()     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            java.lang.String r5 = "https://file-manager-plus-65d18.firebaseapp.com/defaultcodec/"
            r4.append(r5)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            r4.append(r0)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            java.lang.String r0 = "/"
            r4.append(r0)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            java.lang.String r0 = "libffmpeg.exo-v3.so.xz"
            r4.append(r0)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            java.net.URLConnection r0 = r3.openConnection()     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            ax.Jc.a r0 = new ax.Jc.a     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            ax.c3.F.b(r0, r3)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r3.close()     // Catch: java.io.IOException -> L57
        L57:
            r0.close()     // Catch: java.io.IOException -> L5a
        L5a:
            r8 = 1
            return r8
        L5c:
            r8 = move-exception
            r2 = r3
            goto L8b
        L5f:
            r2 = move-exception
            goto L78
        L61:
            r8 = move-exception
            goto L8b
        L63:
            r3 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
            goto L78
        L68:
            r8 = move-exception
            r0 = r3
            goto L8b
        L6b:
            r0 = move-exception
            r6 = r2
            r2 = r0
            r0 = r3
            r3 = r6
            goto L78
        L71:
            r8 = move-exception
            r0 = r2
            goto L8b
        L74:
            r0 = move-exception
            r3 = r2
            r2 = r0
            r0 = r3
        L78:
            r8.delete()     // Catch: java.lang.Throwable -> L5c
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L5c
            if (r3 == 0) goto L85
            r3.close()     // Catch: java.io.IOException -> L84
            goto L85
        L84:
        L85:
            if (r0 == 0) goto L8a
            r0.close()     // Catch: java.io.IOException -> L8a
        L8a:
            return r1
        L8b:
            if (r2 == 0) goto L92
            r2.close()     // Catch: java.io.IOException -> L91
            goto L92
        L91:
        L92:
            if (r0 == 0) goto L97
            r0.close()     // Catch: java.io.IOException -> L97
        L97:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.w3.d.y(android.content.Context):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.u3.AbstractC3199q
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void q(Boolean bool) {
        if (bool.booleanValue()) {
            if (!ax.P2.b.g() || ax.P2.b.a() < 2 || ax.P2.b.a() >= 3) {
                ax.P2.b.l(false);
                ax.P2.a.n(this.h);
            } else {
                ax.P2.b.n(true);
            }
        }
        if (bool.booleanValue()) {
            this.i.accept(Integer.valueOf(j));
        } else {
            this.i.accept(Integer.valueOf(k));
        }
    }
}
