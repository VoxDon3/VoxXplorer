package ax.X2;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.DocumentsContract;
import java.io.File;
import java.util.Iterator;
import java.util.List;

@TargetApi(24)
/* loaded from: classes.dex */
public class y {
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
    
        if (r0 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00da, code lost:
    
        if (r0 == null) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0140 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri a(android.content.ContentResolver r7, android.net.Uri r8, android.net.Uri r9, android.net.Uri r10, long r11, long r13) throws ax.b3.C1495j {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.X2.y.a(android.content.ContentResolver, android.net.Uri, android.net.Uri, android.net.Uri, long, long):android.net.Uri");
    }

    public static Intent b(Context context, String str) {
        StorageVolume storageVolume;
        Intent createAccessIntent;
        storageVolume = ((StorageManager) context.getSystemService("storage")).getStorageVolume(new File(str));
        if (storageVolume == null) {
            return null;
        }
        createAccessIntent = storageVolume.createAccessIntent(null);
        return createAccessIntent;
    }

    public static Intent c(Context context, String str) {
        List storageVolumes;
        String uuid;
        Intent createAccessIntent;
        StorageManager storageManager = (StorageManager) context.getSystemService("storage");
        if (storageManager == null) {
            return null;
        }
        storageVolumes = storageManager.getStorageVolumes();
        Iterator it = storageVolumes.iterator();
        while (it.hasNext()) {
            StorageVolume a = C1159e.a(it.next());
            if (str != null) {
                uuid = a.getUuid();
                if (str.equals(uuid)) {
                    createAccessIntent = a.createAccessIntent(null);
                    return createAccessIntent;
                }
            }
        }
        return null;
    }

    private static Uri d(Uri uri, Uri uri2) {
        return DocumentsContract.buildDocumentUriUsingTree(DocumentsContract.buildTreeDocumentUri(uri.getAuthority(), DocumentsContract.getTreeDocumentId(uri)), DocumentsContract.getDocumentId(uri2) + "/" + e(uri));
    }

    private static String e(Uri uri) {
        String documentId = DocumentsContract.getDocumentId(uri);
        return documentId.substring(Math.max(documentId.lastIndexOf("/"), documentId.lastIndexOf(":")));
    }

    public static N f(Context context, String str) {
        return C1155a.a((StorageManager) context.getSystemService("storage"), new File(str));
    }
}
