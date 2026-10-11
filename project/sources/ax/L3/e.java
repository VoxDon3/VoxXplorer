package ax.L3;

import android.graphics.Bitmap;
import android.util.Log;
import ax.L3.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public class e implements a {
    private static final String w = "e";
    private int[] a;
    private final int[] b;
    private ByteBuffer c;
    private byte[] d;
    private byte[] e;
    private int f;
    private int g;
    private short[] h;
    private byte[] i;
    private byte[] j;
    private byte[] k;
    private int[] l;
    private int m;
    private c n;
    private a.InterfaceC0118a o;
    private Bitmap p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private boolean v;

    public e(a.InterfaceC0118a interfaceC0118a, c cVar, ByteBuffer byteBuffer, int i) {
        this(interfaceC0118a);
        q(cVar, byteBuffer, i);
    }

    private int a(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.s + i; i9++) {
            byte[] bArr = this.k;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.s + i11; i12++) {
            byte[] bArr2 = this.k;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.a[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0149 A[LOOP:5: B:67:0x0147->B:68:0x0149, LOOP_END] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v40, types: [short] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k(ax.L3.b r29) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.L3.e.k(ax.L3.b):void");
    }

    private Bitmap m() {
        Bitmap a = this.o.a(this.u, this.t, this.v ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        a.setHasAlpha(true);
        return a;
    }

    private int n() {
        int o = o();
        if (o > 0) {
            try {
                if (this.d == null) {
                    this.d = this.o.e(255);
                }
                int i = this.f;
                int i2 = this.g;
                int i3 = i - i2;
                if (i3 >= o) {
                    System.arraycopy(this.e, i2, this.d, 0, o);
                    this.g += o;
                    return o;
                }
                if (this.c.remaining() + i3 < o) {
                    this.r = 1;
                    return o;
                }
                System.arraycopy(this.e, this.g, this.d, 0, i3);
                this.g = this.f;
                p();
                int i4 = o - i3;
                System.arraycopy(this.e, 0, this.d, i3, i4);
                this.g += i4;
                return o;
            } catch (Exception e) {
                Log.w(w, "Error Reading Block", e);
                this.r = 1;
            }
        }
        return o;
    }

    private int o() {
        try {
            p();
            byte[] bArr = this.e;
            int i = this.g;
            this.g = i + 1;
            return bArr[i] & 255;
        } catch (Exception unused) {
            this.r = 1;
            return 0;
        }
    }

    private void p() {
        if (this.f > this.g) {
            return;
        }
        if (this.e == null) {
            this.e = this.o.e(Http2.INITIAL_MAX_FRAME_SIZE);
        }
        this.g = 0;
        int min = Math.min(this.c.remaining(), Http2.INITIAL_MAX_FRAME_SIZE);
        this.f = min;
        this.c.get(this.e, 0, min);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r4.j == r18.h) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Bitmap r(ax.L3.b r18, ax.L3.b r19) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.L3.e.r(ax.L3.b, ax.L3.b):android.graphics.Bitmap");
    }

    @Override // ax.L3.a
    public ByteBuffer b() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0046, B:15:0x005a, B:16:0x0066, B:19:0x006f, B:21:0x0073, B:23:0x007b, B:24:0x0091, B:28:0x0095, B:30:0x0099, B:31:0x00a7, B:34:0x006b, B:36:0x00ad, B:38:0x00b5, B:41:0x0011, B:43:0x0019, B:44:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0046, B:15:0x005a, B:16:0x0066, B:19:0x006f, B:21:0x0073, B:23:0x007b, B:24:0x0091, B:28:0x0095, B:30:0x0099, B:31:0x00a7, B:34:0x006b, B:36:0x00ad, B:38:0x00b5, B:41:0x0011, B:43:0x0019, B:44:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0046, B:15:0x005a, B:16:0x0066, B:19:0x006f, B:21:0x0073, B:23:0x007b, B:24:0x0091, B:28:0x0095, B:30:0x0099, B:31:0x00a7, B:34:0x006b, B:36:0x00ad, B:38:0x00b5, B:41:0x0011, B:43:0x0019, B:44:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0046, B:15:0x005a, B:16:0x0066, B:19:0x006f, B:21:0x0073, B:23:0x007b, B:24:0x0091, B:28:0x0095, B:30:0x0099, B:31:0x00a7, B:34:0x006b, B:36:0x00ad, B:38:0x00b5, B:41:0x0011, B:43:0x0019, B:44:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0046, B:15:0x005a, B:16:0x0066, B:19:0x006f, B:21:0x0073, B:23:0x007b, B:24:0x0091, B:28:0x0095, B:30:0x0099, B:31:0x00a7, B:34:0x006b, B:36:0x00ad, B:38:0x00b5, B:41:0x0011, B:43:0x0019, B:44:0x003b), top: B:2:0x0001 }] */
    @Override // ax.L3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized android.graphics.Bitmap c() {
        /*
            r7 = this;
            monitor-enter(r7)
            ax.L3.c r0 = r7.n     // Catch: java.lang.Throwable -> Le
            int r0 = r0.c     // Catch: java.lang.Throwable -> Le
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L11
            int r0 = r7.m     // Catch: java.lang.Throwable -> Le
            if (r0 >= 0) goto L3d
            goto L11
        Le:
            r0 = move-exception
            goto Lcd
        L11:
            java.lang.String r0 = ax.L3.e.w     // Catch: java.lang.Throwable -> Le
            boolean r3 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L3b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le
            r3.<init>()     // Catch: java.lang.Throwable -> Le
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch: java.lang.Throwable -> Le
            ax.L3.c r4 = r7.n     // Catch: java.lang.Throwable -> Le
            int r4 = r4.c     // Catch: java.lang.Throwable -> Le
            r3.append(r4)     // Catch: java.lang.Throwable -> Le
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch: java.lang.Throwable -> Le
            int r4 = r7.m     // Catch: java.lang.Throwable -> Le
            r3.append(r4)     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Le
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> Le
        L3b:
            r7.r = r2     // Catch: java.lang.Throwable -> Le
        L3d:
            int r0 = r7.r     // Catch: java.lang.Throwable -> Le
            r3 = 0
            if (r0 == r2) goto Lad
            r4 = 2
            if (r0 != r4) goto L46
            goto Lad
        L46:
            r0 = 0
            r7.r = r0     // Catch: java.lang.Throwable -> Le
            ax.L3.c r4 = r7.n     // Catch: java.lang.Throwable -> Le
            java.util.List<ax.L3.b> r4 = r4.e     // Catch: java.lang.Throwable -> Le
            int r5 = r7.m     // Catch: java.lang.Throwable -> Le
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> Le
            ax.L3.b r4 = (ax.L3.b) r4     // Catch: java.lang.Throwable -> Le
            int r5 = r7.m     // Catch: java.lang.Throwable -> Le
            int r5 = r5 - r2
            if (r5 < 0) goto L65
            ax.L3.c r6 = r7.n     // Catch: java.lang.Throwable -> Le
            java.util.List<ax.L3.b> r6 = r6.e     // Catch: java.lang.Throwable -> Le
            java.lang.Object r5 = r6.get(r5)     // Catch: java.lang.Throwable -> Le
            ax.L3.b r5 = (ax.L3.b) r5     // Catch: java.lang.Throwable -> Le
            goto L66
        L65:
            r5 = r3
        L66:
            int[] r6 = r4.k     // Catch: java.lang.Throwable -> Le
            if (r6 == 0) goto L6b
            goto L6f
        L6b:
            ax.L3.c r6 = r7.n     // Catch: java.lang.Throwable -> Le
            int[] r6 = r6.a     // Catch: java.lang.Throwable -> Le
        L6f:
            r7.a = r6     // Catch: java.lang.Throwable -> Le
            if (r6 != 0) goto L95
            java.lang.String r0 = ax.L3.e.w     // Catch: java.lang.Throwable -> Le
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L91
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le
            r1.<init>()     // Catch: java.lang.Throwable -> Le
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch: java.lang.Throwable -> Le
            int r4 = r7.m     // Catch: java.lang.Throwable -> Le
            r1.append(r4)     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Le
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> Le
        L91:
            r7.r = r2     // Catch: java.lang.Throwable -> Le
            monitor-exit(r7)
            return r3
        L95:
            boolean r1 = r4.f     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto La7
            int[] r1 = r7.b     // Catch: java.lang.Throwable -> Le
            int r2 = r6.length     // Catch: java.lang.Throwable -> Le
            java.lang.System.arraycopy(r6, r0, r1, r0, r2)     // Catch: java.lang.Throwable -> Le
            int[] r1 = r7.b     // Catch: java.lang.Throwable -> Le
            r7.a = r1     // Catch: java.lang.Throwable -> Le
            int r2 = r4.h     // Catch: java.lang.Throwable -> Le
            r1[r2] = r0     // Catch: java.lang.Throwable -> Le
        La7:
            android.graphics.Bitmap r0 = r7.r(r4, r5)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r7)
            return r0
        Lad:
            java.lang.String r0 = ax.L3.e.w     // Catch: java.lang.Throwable -> Le
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto Lcb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le
            r1.<init>()     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch: java.lang.Throwable -> Le
            int r2 = r7.r     // Catch: java.lang.Throwable -> Le
            r1.append(r2)     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Le
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> Le
        Lcb:
            monitor-exit(r7)
            return r3
        Lcd:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Le
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.L3.e.c():android.graphics.Bitmap");
    }

    @Override // ax.L3.a
    public void clear() {
        this.n = null;
        byte[] bArr = this.k;
        if (bArr != null) {
            this.o.d(bArr);
        }
        int[] iArr = this.l;
        if (iArr != null) {
            this.o.f(iArr);
        }
        Bitmap bitmap = this.p;
        if (bitmap != null) {
            this.o.c(bitmap);
        }
        this.p = null;
        this.c = null;
        this.v = false;
        byte[] bArr2 = this.d;
        if (bArr2 != null) {
            this.o.d(bArr2);
        }
        byte[] bArr3 = this.e;
        if (bArr3 != null) {
            this.o.d(bArr3);
        }
    }

    @Override // ax.L3.a
    public void d() {
        this.m = (this.m + 1) % this.n.c;
    }

    @Override // ax.L3.a
    public int e() {
        return this.n.c;
    }

    @Override // ax.L3.a
    public int f() {
        int i;
        if (this.n.c <= 0 || (i = this.m) < 0) {
            return 0;
        }
        return l(i);
    }

    @Override // ax.L3.a
    public void g() {
        this.m = -1;
    }

    @Override // ax.L3.a
    public int h() {
        return this.m;
    }

    @Override // ax.L3.a
    public int i() {
        return this.c.limit() + this.k.length + (this.l.length * 4);
    }

    @Override // ax.L3.a
    public int j() {
        int i = this.n.m;
        if (i == -1) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        return i + 1;
    }

    public int l(int i) {
        if (i < 0) {
            return -1;
        }
        c cVar = this.n;
        if (i < cVar.c) {
            return cVar.e.get(i).i;
        }
        return -1;
    }

    public synchronized void q(c cVar, ByteBuffer byteBuffer, int i) {
        try {
            if (i <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
            int highestOneBit = Integer.highestOneBit(i);
            this.r = 0;
            this.n = cVar;
            this.v = false;
            this.m = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.c = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.c.order(ByteOrder.LITTLE_ENDIAN);
            this.q = false;
            Iterator<b> it = cVar.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().g == 3) {
                    this.q = true;
                    break;
                }
            }
            this.s = highestOneBit;
            int i2 = cVar.f;
            this.u = i2 / highestOneBit;
            int i3 = cVar.g;
            this.t = i3 / highestOneBit;
            this.k = this.o.e(i2 * i3);
            this.l = this.o.b(this.u * this.t);
        } catch (Throwable th) {
            throw th;
        }
    }

    public e(a.InterfaceC0118a interfaceC0118a) {
        this.b = new int[256];
        this.f = 0;
        this.g = 0;
        this.o = interfaceC0118a;
        this.n = new c();
    }
}
