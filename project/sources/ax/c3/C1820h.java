package ax.c3;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import ax.u3.AbstractC3199q;
import com.voxdon.xplorer.file.C3596o;
import java.io.File;

/* renamed from: ax.c3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1820h extends AbstractC3199q<Void, Void, Boolean> {
    private Context h;
    private File i;
    private C3596o j;
    private Throwable k;
    private long l;
    private String m;
    private String n;
    private EnumC1837z o;
    private AssetFileDescriptor p;
    private a q;

    /* renamed from: ax.c3.h$a */
    public interface a {
        void a(Throwable th);

        void b(File file);
    }

    public C1820h(Context context, AssetFileDescriptor assetFileDescriptor, W w, EnumC1837z enumC1837z, a aVar) {
        super(AbstractC3199q.e.HIGHER);
        this.h = context;
        if (enumC1837z == EnumC1837z.AUDIO) {
            this.n = "Audio";
        } else if (enumC1837z == EnumC1837z.IMAGE) {
            this.n = "Image";
        } else if (enumC1837z == EnumC1837z.PLAIN_TEXT) {
            this.n = "Text";
        } else {
            this.n = "Unknown";
        }
        if (w != null) {
            this.m = w.a();
        } else {
            this.m = this.n;
        }
        this.o = enumC1837z;
        this.i = x(this.m);
        this.l = assetFileDescriptor.getLength();
        this.p = assetFileDescriptor;
        this.q = aVar;
    }

    private File x(String str) {
        File file = new File(ax.Z2.a.m(this.h, "content-tmp"), this.n);
        file.mkdir();
        ax.Z2.a.f(file, false);
        return new File(file, str);
    }

    @Override // ax.u3.AbstractC3199q
    protected void o() {
        this.j.k0(true);
    }

    @Override // ax.u3.AbstractC3199q
    protected void r() {
        C3596o f = C1835x.f(this.i);
        this.j = f;
        f.n0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|2|(1:4)|6|7|8|(2:10|(6:12|13|14|15|16|(2:18|19)(7:21|22|(1:24)|25|26|(1:30)|31)))|70|13|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00de, code lost:
    
        if (r13.j.Y() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c7, code lost:
    
        r13.j.n(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c5, code lost:
    
        if (r13.j.Y() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0050, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0058, code lost:
    
        r13.k = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x005a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x004c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0055, code lost:
    
        r13.k = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0048, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x004a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x004e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0046, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0052, code lost:
    
        r13.k = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // ax.u3.AbstractC3199q
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean g(java.lang.Void... r14) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.c3.C1820h.g(java.lang.Void[]):java.lang.Boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.u3.AbstractC3199q
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void q(Boolean bool) {
        this.j.k0(true);
        if (this.q != null) {
            if (bool.booleanValue()) {
                this.q.b(this.i);
            } else {
                this.q.a(this.k);
            }
        }
    }
}
