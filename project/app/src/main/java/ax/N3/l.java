/*
 * Decompiled with CFR 0.152.
 */
package ax.N3;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import ax.N3.j;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class l
extends j<InputStream> {
    private static final UriMatcher e0;

    static {
        UriMatcher uriMatcher;
        e0 = uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public l(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    private InputStream i(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int n8 = e0.match(uri);
        if (n8 != 1) {
            if (n8 != 3) {
                if (n8 != 5) {
                    return contentResolver.openInputStream(uri);
                }
            } else {
                return this.j(contentResolver, uri);
            }
        }
        if ((uri = ContactsContract.Contacts.lookupContact((ContentResolver)contentResolver, (Uri)uri)) != null) {
            return this.j(contentResolver, uri);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    @TargetApi(value=14)
    private InputStream j(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream((ContentResolver)contentResolver, (Uri)uri, (boolean)true);
    }

    @Override
    public Class<InputStream> a() {
        return InputStream.class;
    }

    protected void g(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    protected InputStream h(Uri uri, ContentResolver object) throws FileNotFoundException {
        if ((object = this.i(uri, (ContentResolver)object)) != null) {
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("InputStream is null for ");
        ((StringBuilder)object).append(uri);
        throw new FileNotFoundException(((StringBuilder)object).toString());
    }
}

