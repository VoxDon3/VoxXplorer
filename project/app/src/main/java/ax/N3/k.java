/*
 * Decompiled with CFR 0.152.
 */
package ax.N3;

import android.content.res.AssetManager;
import ax.N3.a;
import java.io.IOException;
import java.io.InputStream;

public class k
extends a<InputStream> {
    public k(AssetManager assetManager, String string) {
        super(assetManager, string);
    }

    @Override
    public Class<InputStream> a() {
        return InputStream.class;
    }

    protected void g(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    protected InputStream h(AssetManager assetManager, String string) throws IOException {
        return assetManager.open(string);
    }
}

