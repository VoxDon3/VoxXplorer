package ax.r3;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import ax.c3.C1835x;
import ax.ga.C2132a;
import ax.u3.C3184b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ax.r3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2945b extends C2132a {
    private static final Bitmap e = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    private Context d;

    public C2945b(Context context) {
        super(context);
        this.d = context.getApplicationContext();
    }

    public static final InputStream n() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        e.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    @Override // ax.ga.C2132a
    protected InputStream i(String str, Object obj) throws IOException {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String path = parse.getPath();
        String query = parse.getQuery();
        ax.Q2.f E = ax.Q2.f.E(scheme);
        if (E == ax.Q2.f.V0) {
            return ax.U2.d.F(this.d).J(parse);
        }
        if (E == ax.Q2.f.q1 || E == ax.Q2.f.r1) {
            C3184b.f();
            return null;
        }
        if (E == null) {
            return super.i(str, obj);
        }
        int parseInt = parse.getHost().isEmpty() ? 0 : Integer.parseInt(parse.getHost());
        if (E == ax.Q2.f.l1 && parseInt == 0) {
            ax.Ha.c.h().f().c("!!APP CACHE SCHEME!!").g("uri:" + str).h();
        }
        return (E == ax.Q2.f.t0 ? C1835x.g(path) : C1835x.d(E, parseInt)).A(scheme, path, query);
    }
}
