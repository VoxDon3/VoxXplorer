/*
 * Decompiled with CFR 0.152.
 */
package ax.N3;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import ax.N3.j;
import java.io.FileNotFoundException;
import java.io.IOException;

public class g
extends j<ParcelFileDescriptor> {
    public g(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override
    public Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }

    protected void g(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    protected ParcelFileDescriptor h(Uri uri, ContentResolver object) throws FileNotFoundException {
        if ((object = object.openAssetFileDescriptor(uri, "r")) != null) {
            return object.getParcelFileDescriptor();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("FileDescriptor is null for: ");
        ((StringBuilder)object).append(uri);
        throw new FileNotFoundException(((StringBuilder)object).toString());
    }
}

