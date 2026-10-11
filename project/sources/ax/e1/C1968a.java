package ax.e1;

import android.content.Context;
import android.graphics.Point;
import ax.P0.C0912v;
import ax.P0.D;
import ax.P0.E;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.V0.i;
import ax.V0.j;
import ax.Y0.V;
import ax.e1.InterfaceC1969b;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: ax.e1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1968a extends j<i, AbstractC1971d, C1970c> implements InterfaceC1969b {
    private final Context o;
    private final int p;

    /* renamed from: ax.e1.a$a, reason: collision with other inner class name */
    class C0293a extends AbstractC1971d {
        C0293a() {
        }

        @Override // androidx.media3.decoder.a
        public void B() {
            C1968a.this.u(this);
        }
    }

    @Deprecated
    /* renamed from: ax.e1.a$b */
    public interface b {
    }

    /* renamed from: ax.e1.a$c */
    public static final class c implements InterfaceC1969b.a {
        private final Context a;
        private int b;

        public c(Context context) {
            this(context, null);
        }

        @Override // ax.e1.InterfaceC1969b.a
        public int b(C0912v c0912v) {
            String str = c0912v.o;
            return (str == null || !D.q(str)) ? V.a(0) : d0.J0(c0912v.o) ? V.a(4) : V.a(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ax.e1.InterfaceC1969b.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C1968a a() {
            return new C1968a(this.a, null, this.b, 0 == true ? 1 : 0);
        }

        private c(Context context, b bVar) {
            this.a = context;
            this.b = -1;
        }
    }

    /* synthetic */ C1968a(Context context, b bVar, int i, C0293a c0293a) {
        this(context, bVar, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.V0.j
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public C1970c l(Throwable th) {
        return new C1970c("Unexpected decode error", th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.V0.j
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public C1970c m(i iVar, AbstractC1971d abstractC1971d, boolean z) {
        ByteBuffer byteBuffer = (ByteBuffer) C0968a.e(iVar.e0);
        C0968a.g(byteBuffer.hasArray());
        C0968a.a(byteBuffer.arrayOffset() == 0);
        try {
            int i = this.p;
            if (i == -1) {
                Context context = this.o;
                if (context != null) {
                    Point V = d0.V(context);
                    int i2 = V.x;
                    int i3 = V.y;
                    C0912v c0912v = iVar.c0;
                    if (c0912v != null) {
                        int i4 = c0912v.N;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                        int i5 = c0912v.O;
                        if (i5 != -1) {
                            i3 *= i5;
                        }
                    }
                    i = (Math.max(i2, i3) * 2) - 1;
                } else {
                    i = 4096;
                }
            }
            abstractC1971d.f0 = ax.U0.c.a(byteBuffer.array(), byteBuffer.remaining(), null, i);
            abstractC1971d.c0 = iVar.g0;
            return null;
        } catch (E e) {
            return new C1970c("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new C1970c(e2);
        }
    }

    @Override // ax.V0.j, ax.V0.g
    public /* bridge */ /* synthetic */ AbstractC1971d a() throws C1970c {
        return (AbstractC1971d) super.a();
    }

    @Override // ax.V0.g
    public String getName() {
        return "BitmapFactoryImageDecoder";
    }

    @Override // ax.V0.j
    protected i j() {
        return new i(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.V0.j
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public AbstractC1971d k() {
        return new C0293a();
    }

    private C1968a(Context context, b bVar, int i) {
        super(new i[1], new AbstractC1971d[1]);
        this.o = context;
        this.p = i;
    }
}
