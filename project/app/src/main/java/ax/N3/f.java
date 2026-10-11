/*
 * Decompiled with CFR 0.152.
 */
package ax.N3;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import ax.N3.a;
import java.io.IOException;

public class f
extends a<ParcelFileDescriptor> {
    public f(AssetManager assetManager, String string) {
        super(assetManager, string);
    }

    @Override
    public Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }

    protected void g(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    protected ParcelFileDescriptor h(AssetManager assetManager, String string) throws IOException {
        return assetManager.openFd(string).getParcelFileDescriptor();
    }
}

