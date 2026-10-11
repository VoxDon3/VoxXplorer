package ax.X2;

import android.annotation.TargetApi;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.IOException;

@TargetApi(28)
/* loaded from: classes.dex */
public class E {
    public static Drawable a(File file) throws IOException {
        ImageDecoder.Source createSource;
        Drawable decodeDrawable;
        createSource = ImageDecoder.createSource(file);
        decodeDrawable = ImageDecoder.decodeDrawable(createSource);
        if (B.a(decodeDrawable)) {
            C.a(decodeDrawable).setRepeatCount(-1);
        }
        return decodeDrawable;
    }
}
