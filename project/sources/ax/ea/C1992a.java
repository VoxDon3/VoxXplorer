package ax.ea;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import ax.ca.e;
import ax.ga.InterfaceC2133b;
import ax.ka.C2417b;
import ax.ka.d;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ax.ea.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1992a implements InterfaceC1993b {
    protected final boolean a;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ax.ea.a$b */
    public static class b {
        public final e a;
        public final C0306a b;

        protected b(e eVar, C0306a c0306a) {
            this.a = eVar;
            this.b = c0306a;
        }
    }

    public C1992a(boolean z) {
        this.a = z;
    }

    private boolean b(String str, String str2) {
        return "image/jpeg".equalsIgnoreCase(str2) && InterfaceC2133b.a.l(str) == InterfaceC2133b.a.FILE;
    }

    @Override // ax.ea.InterfaceC1993b
    public Bitmap a(c cVar) throws IOException {
        InputStream f = f(cVar);
        if (f == null) {
            d.b("No stream for image [%s]", cVar.g());
            return null;
        }
        try {
            b e = e(f, cVar);
            f = h(f, cVar);
            Bitmap decodeStream = BitmapFactory.decodeStream(f, null, g(e.a, cVar));
            if (decodeStream == null) {
                d.b("Image can't be decoded [%s]", cVar.g());
                return decodeStream;
            }
            C0306a c0306a = e.b;
            return c(decodeStream, cVar, c0306a.a, c0306a.b);
        } finally {
            ax.ka.c.a(f);
        }
    }

    protected Bitmap c(Bitmap bitmap, c cVar, int i, boolean z) {
        Matrix matrix = new Matrix();
        ax.ca.d h = cVar.h();
        if (h == ax.ca.d.EXACTLY || h == ax.ca.d.EXACTLY_STRETCHED) {
            e eVar = new e(bitmap.getWidth(), bitmap.getHeight(), i);
            float b2 = C2417b.b(eVar, cVar.j(), cVar.k(), h == ax.ca.d.EXACTLY_STRETCHED);
            if (Float.compare(b2, 1.0f) != 0) {
                matrix.setScale(b2, b2);
                if (this.a) {
                    d.a("Scale subsampled image (%1$s) to %2$s (scale = %3$.5f) [%4$s]", eVar, eVar.c(b2), Float.valueOf(b2), cVar.g());
                }
            }
        }
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
            if (this.a) {
                d.a("Flip image horizontally [%s]", cVar.g());
            }
        }
        if (i != 0) {
            matrix.postRotate(i);
            if (this.a) {
                d.a("Rotate image on %1$d° [%2$s]", Integer.valueOf(i), cVar.g());
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected C0306a d(String str) {
        boolean z = true;
        int i = 0;
        try {
        } catch (IOException unused) {
            d.f("Can't read EXIF tags from file [%s]", str);
        }
        switch (new ExifInterface(InterfaceC2133b.a.FILE.j(str)).getAttributeInt("Orientation", 1)) {
            case 1:
            default:
                z = false;
                break;
            case 2:
                break;
            case 3:
                z = false;
                i = SubsamplingScaleImageView.ORIENTATION_180;
                break;
            case 4:
                i = SubsamplingScaleImageView.ORIENTATION_180;
                break;
            case 5:
                i = SubsamplingScaleImageView.ORIENTATION_270;
                break;
            case 6:
                z = false;
                i = 90;
                break;
            case 7:
                i = 90;
                break;
            case 8:
                z = false;
                i = SubsamplingScaleImageView.ORIENTATION_270;
                break;
        }
        return new C0306a(i, z);
    }

    protected b e(InputStream inputStream, c cVar) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        String i = cVar.i();
        C0306a d = (cVar.l() && b(i, options.outMimeType)) ? d(i) : new C0306a();
        return new b(new e(options.outWidth, options.outHeight, d.a), d);
    }

    protected InputStream f(c cVar) throws IOException {
        return cVar.e().a(cVar.i(), cVar.f());
    }

    protected BitmapFactory.Options g(e eVar, c cVar) {
        int a;
        ax.ca.d h = cVar.h();
        if (h == ax.ca.d.NONE) {
            a = 1;
        } else if (h == ax.ca.d.NONE_SAFE) {
            a = C2417b.c(eVar);
        } else {
            a = C2417b.a(eVar, cVar.j(), cVar.k(), h == ax.ca.d.IN_SAMPLE_POWER_OF_2);
        }
        if (a > 1 && this.a) {
            d.a("Subsample original image (%1$s) to %2$s (scale = %3$d) [%4$s]", eVar, eVar.d(a), Integer.valueOf(a), cVar.g());
        }
        BitmapFactory.Options d = cVar.d();
        d.inSampleSize = a;
        return d;
    }

    protected InputStream h(InputStream inputStream, c cVar) throws IOException {
        if (inputStream.markSupported()) {
            try {
                inputStream.reset();
                return inputStream;
            } catch (IOException unused) {
            }
        }
        ax.ka.c.a(inputStream);
        return f(cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ax.ea.a$a, reason: collision with other inner class name */
    public static class C0306a {
        public final int a;
        public final boolean b;

        protected C0306a() {
            this.a = 0;
            this.b = false;
        }

        protected C0306a(int i, boolean z) {
            this.a = i;
            this.b = z;
        }
    }
}
