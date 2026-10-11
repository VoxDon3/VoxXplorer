/*
 * Decompiled with CFR 0.152.
 */
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
import ax.ga.b;
import ax.ka.c;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class a
implements b {
    protected final Context a;
    protected final int b;
    protected final int c;

    public a(Context context) {
        this(context, 5000, 20000);
    }

    public a(Context context, int n8, int n9) {
        this.a = context.getApplicationContext();
        this.b = n8;
        this.c = n9;
    }

    @TargetApi(value=8)
    private InputStream j(String string) {
        if ((string = ThumbnailUtils.createVideoThumbnail((String)string, (int)2)) != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            string.compress(Bitmap.CompressFormat.PNG, 0, (OutputStream)byteArrayOutputStream);
            return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        }
        return null;
    }

    private boolean k(Uri object) {
        object = this.a.getContentResolver().getType((Uri)object);
        return object != null && ((String)object).startsWith("video/");
    }

    private boolean l(String string) {
        string = MimeTypeMap.getFileExtensionFromUrl((String)Uri.encode((String)string));
        string = MimeTypeMap.getSingleton().getMimeTypeFromExtension(string);
        return string != null && string.startsWith("video/");
    }

    @Override
    public InputStream a(String string, Object object) throws IOException {
        switch (ax.ga.a$a.a[b.a.l(string).ordinal()]) {
            default: {
                return this.i(string, object);
            }
            case 6: {
                return this.f(string, object);
            }
            case 5: {
                return this.d(string, object);
            }
            case 4: {
                return this.e(string, object);
            }
            case 3: {
                return this.g(string, object);
            }
            case 1: 
            case 2: 
        }
        return this.h(string, object);
    }

    protected HttpURLConnection b(String object, Object object2) throws IOException {
        object = (HttpURLConnection)new URL(Uri.encode((String)object, (String)"@#&=*+-_.,:!?()/~'%")).openConnection();
        ((URLConnection)object).setConnectTimeout(this.b);
        ((URLConnection)object).setReadTimeout(this.c);
        return object;
    }

    @TargetApi(value=14)
    protected InputStream c(Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream((ContentResolver)this.a.getContentResolver(), (Uri)uri, (boolean)true);
    }

    protected InputStream d(String string, Object object) throws IOException {
        string = b.a.h0.j(string);
        return this.a.getAssets().open(string);
    }

    protected InputStream e(String string, Object object) throws FileNotFoundException {
        ContentResolver contentResolver = this.a.getContentResolver();
        object = Uri.parse((String)string);
        if (this.k((Uri)object)) {
            string = MediaStore.Video.Thumbnails.getThumbnail((ContentResolver)contentResolver, (long)Long.valueOf(object.getLastPathSegment()), (int)1, null);
            if (string != null) {
                object = new ByteArrayOutputStream();
                string.compress(Bitmap.CompressFormat.PNG, 0, (OutputStream)object);
                return new ByteArrayInputStream(((ByteArrayOutputStream)object).toByteArray());
            }
        } else if (string.startsWith("content://com.android.contacts/")) {
            return this.c((Uri)object);
        }
        return contentResolver.openInputStream((Uri)object);
    }

    protected InputStream f(String string, Object object) {
        int n8 = Integer.parseInt(b.a.i0.j(string));
        return this.a.getResources().openRawResource(n8);
    }

    protected InputStream g(String string, Object object) throws IOException {
        object = b.a.f0.j(string);
        if (this.l(string)) {
            return this.j((String)object);
        }
        return new ax.ca.a(new BufferedInputStream(new FileInputStream((String)object), 32768), (int)new File((String)object).length());
    }

    protected InputStream h(String object, Object object2) throws IOException {
        object = this.b((String)object, object2);
        for (int i8 = 0; ((HttpURLConnection)object).getResponseCode() / 100 == 3 && i8 < 5; ++i8) {
            object = this.b(((URLConnection)object).getHeaderField("Location"), object2);
        }
        try {
            object2 = ((URLConnection)object).getInputStream();
        }
        catch (IOException iOException) {
            ax.ka.c.c(((HttpURLConnection)object).getErrorStream());
            throw iOException;
        }
        if (this.m((HttpURLConnection)object)) {
            return new ax.ca.a(new BufferedInputStream((InputStream)object2, 32768), ((URLConnection)object).getContentLength());
        }
        ax.ka.c.a((Closeable)object2);
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Image request failed with response code ");
        ((StringBuilder)object2).append(((HttpURLConnection)object).getResponseCode());
        throw new IOException(((StringBuilder)object2).toString());
    }

    protected InputStream i(String string, Object object) throws IOException {
        throw new UnsupportedOperationException(String.format("UIL doesn't support scheme(protocol) by default [%s]. You should implement this support yourself (BaseImageDownloader.getStreamFromOtherSource(...))", string));
    }

    protected boolean m(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getResponseCode() == 200;
    }
}

