/*
 * Decompiled with CFR 0.152.
 */
package ax.r3;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import ax.Ha.c;
import ax.Q2.f;
import ax.U2.d;
import ax.c3.x;
import ax.ga.a;
import com.alphainventor.filemanager.file.o;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class b
extends a {
    private static final Bitmap e = Bitmap.createBitmap((int)1, (int)1, (Bitmap.Config)Bitmap.Config.ARGB_8888);
    private Context d;

    public b(Context context) {
        super(context);
        this.d = context.getApplicationContext();
    }

    public static final InputStream n() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        e.compress(Bitmap.CompressFormat.PNG, 0, (OutputStream)byteArrayOutputStream);
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    @Override
    protected InputStream i(String object, Object object2) throws IOException {
        Object object3 = Uri.parse((String)object);
        String string = object3.getScheme();
        String string2 = object3.getPath();
        String string3 = object3.getQuery();
        f f8 = f.E(string);
        if (f8 == f.V0) {
            return ax.U2.d.F(this.d).J((Uri)object3);
        }
        if (f8 != f.q1 && f8 != f.r1) {
            if (f8 != null) {
                int n8 = object3.getHost().isEmpty() ? 0 : Integer.parseInt(object3.getHost());
                if (f8 == f.l1 && n8 == 0) {
                    object3 = ax.Ha.c.h().f().c("!!APP CACHE SCHEME!!");
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("uri:");
                    ((StringBuilder)object2).append((String)object);
                    ((ax.Ha.b)object3).g(((StringBuilder)object2).toString()).h();
                }
                object = f8 == f.t0 ? x.g(string2) : x.d(f8, n8);
                return ((o)object).A(string, string2, string3);
            }
            return super.i((String)object, object2);
        }
        ax.u3.b.f();
        return null;
    }
}

