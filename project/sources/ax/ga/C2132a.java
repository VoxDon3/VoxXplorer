package ax.ga;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import ax.ca.C1852a;
import ax.ga.InterfaceC2133b;
import ax.ka.c;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: ax.ga.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2132a implements InterfaceC2133b {
    protected final Context a;
    protected final int b;
    protected final int c;

    /* renamed from: ax.ga.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0317a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[InterfaceC2133b.a.values().length];
            a = iArr;
            try {
                iArr[InterfaceC2133b.a.HTTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[InterfaceC2133b.a.HTTPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[InterfaceC2133b.a.FILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[InterfaceC2133b.a.CONTENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[InterfaceC2133b.a.ASSETS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[InterfaceC2133b.a.DRAWABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[InterfaceC2133b.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public C2132a(Context context) {
        this(context, 5000, 20000);
    }

    @TargetApi(8)
    private InputStream j(String str) {
        Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(str, 2);
        if (createVideoThumbnail == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createVideoThumbnail.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    private boolean k(Uri uri) {
        String type = this.a.getContentResolver().getType(uri);
        return type != null && type.startsWith("video/");
    }

    private boolean l(String str) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(Uri.encode(str)));
        return mimeTypeFromExtension != null && mimeTypeFromExtension.startsWith("video/");
    }

    @Override // ax.ga.InterfaceC2133b
    public InputStream a(String str, Object obj) throws IOException {
        switch (C0317a.a[InterfaceC2133b.a.l(str).ordinal()]) {
            case 1:
            case 2:
                return h(str, obj);
            case 3:
                return g(str, obj);
            case 4:
                return e(str, obj);
            case 5:
                return d(str, obj);
            case 6:
                return f(str, obj);
            default:
                return i(str, obj);
        }
    }

    protected HttpURLConnection b(String str, Object obj) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(Uri.encode(str, "@#&=*+-_.,:!?()/~'%")).openConnection();
        httpURLConnection.setConnectTimeout(this.b);
        httpURLConnection.setReadTimeout(this.c);
        return httpURLConnection;
    }

    @TargetApi(14)
    protected InputStream c(Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(this.a.getContentResolver(), uri, true);
    }

    protected InputStream d(String str, Object obj) throws IOException {
        return this.a.getAssets().open(InterfaceC2133b.a.ASSETS.j(str));
    }

    protected InputStream e(String str, Object obj) throws FileNotFoundException {
        ContentResolver contentResolver = this.a.getContentResolver();
        Uri parse = Uri.parse(str);
        if (k(parse)) {
            Bitmap thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, Long.valueOf(parse.getLastPathSegment()).longValue(), 1, null);
            if (thumbnail != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                thumbnail.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            }
        } else if (str.startsWith("content://com.android.contacts/")) {
            return c(parse);
        }
        return contentResolver.openInputStream(parse);
    }

    protected InputStream f(String str, Object obj) {
        return this.a.getResources().openRawResource(Integer.parseInt(InterfaceC2133b.a.DRAWABLE.j(str)));
    }

    protected InputStream g(String str, Object obj) throws IOException {
        String j = InterfaceC2133b.a.FILE.j(str);
        return l(str) ? j(j) : new C1852a(new BufferedInputStream(new FileInputStream(j), 32768), (int) new File(j).length());
    }

    protected InputStream h(String str, Object obj) throws IOException {
        HttpURLConnection b = b(str, obj);
        for (int i = 0; b.getResponseCode() / 100 == 3 && i < 5; i++) {
            b = b(b.getHeaderField("Location"), obj);
        }
        try {
            InputStream inputStream = b.getInputStream();
            if (m(b)) {
                return new C1852a(new BufferedInputStream(inputStream, 32768), b.getContentLength());
            }
            c.a(inputStream);
            throw new IOException("Image request failed with response code " + b.getResponseCode());
        } catch (IOException e) {
            c.c(b.getErrorStream());
            throw e;
        }
    }

    protected InputStream i(String str, Object obj) throws IOException {
        throw new UnsupportedOperationException(String.format("UIL doesn't support scheme(protocol) by default [%s]. You should implement this support yourself (BaseImageDownloader.getStreamFromOtherSource(...))", str));
    }

    protected boolean m(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getResponseCode() == 200;
    }

    public C2132a(Context context, int i, int i2) {
        this.a = context.getApplicationContext();
        this.b = i;
        this.c = i2;
    }
}
