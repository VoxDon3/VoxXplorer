/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.i;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.Audio;
import com.microsoft.graph.extensions.BaseItem;
import com.microsoft.graph.extensions.Deleted;
import com.microsoft.graph.extensions.DriveItem;
import com.microsoft.graph.extensions.DriveItemCollectionPage;
import com.microsoft.graph.extensions.DriveItemVersion;
import com.microsoft.graph.extensions.DriveItemVersionCollectionPage;
import com.microsoft.graph.extensions.File;
import com.microsoft.graph.extensions.FileSystemInfo;
import com.microsoft.graph.extensions.Folder;
import com.microsoft.graph.extensions.GeoCoordinates;
import com.microsoft.graph.extensions.Image;
import com.microsoft.graph.extensions.ListItem;
import com.microsoft.graph.extensions.Package;
import com.microsoft.graph.extensions.Permission;
import com.microsoft.graph.extensions.PermissionCollectionPage;
import com.microsoft.graph.extensions.Photo;
import com.microsoft.graph.extensions.PublicationFacet;
import com.microsoft.graph.extensions.RemoteItem;
import com.microsoft.graph.extensions.Root;
import com.microsoft.graph.extensions.SearchResult;
import com.microsoft.graph.extensions.Shared;
import com.microsoft.graph.extensions.SharepointIds;
import com.microsoft.graph.extensions.SpecialFolder;
import com.microsoft.graph.extensions.ThumbnailSet;
import com.microsoft.graph.extensions.ThumbnailSetCollectionPage;
import com.microsoft.graph.extensions.Video;
import com.microsoft.graph.extensions.Workbook;
import com.microsoft.graph.generated.BaseDriveItemCollectionResponse;
import com.microsoft.graph.generated.BaseDriveItemVersion;
import com.microsoft.graph.generated.BaseDriveItemVersionCollectionResponse;
import com.microsoft.graph.generated.BasePermission;
import com.microsoft.graph.generated.BasePermissionCollectionResponse;
import com.microsoft.graph.generated.BaseThumbnailSet;
import com.microsoft.graph.generated.BaseThumbnailSetCollectionResponse;
import java.util.Arrays;

public class BaseDriveItem
extends BaseItem
implements d {
    @a
    @c(value="package")
    public Package A;
    @a
    @c(value="photo")
    public Photo B;
    @a
    @c(value="publication")
    public PublicationFacet C;
    @a
    @c(value="remoteItem")
    public RemoteItem D;
    @a
    @c(value="root")
    public Root E;
    @a
    @c(value="searchResult")
    public SearchResult F;
    @a
    @c(value="shared")
    public Shared G;
    @a
    @c(value="sharepointIds")
    public SharepointIds H;
    @a
    @c(value="size")
    public Long I;
    @a
    @c(value="specialFolder")
    public SpecialFolder J;
    @a
    @c(value="video")
    public Video K;
    @a
    @c(value="webDavUrl")
    public String L;
    public transient DriveItemCollectionPage M;
    @a
    @c(value="listItem")
    public ListItem N;
    public transient PermissionCollectionPage O;
    public transient ThumbnailSetCollectionPage P;
    public transient DriveItemVersionCollectionPage Q;
    @a
    @c(value="workbook")
    public Workbook R;
    private transient l S;
    private transient e T;
    @a
    @c(value="audio")
    public Audio s;
    @a
    @c(value="cTag")
    public String t;
    @a
    @c(value="deleted")
    public Deleted u;
    @a
    @c(value="file")
    public File v;
    @a
    @c(value="fileSystemInfo")
    public FileSystemInfo w;
    @a
    @c(value="folder")
    public Folder x;
    @a
    @c(value="image")
    public Image y;
    @a
    @c(value="location")
    public GeoCoordinates z;

    @Override
    public void d(e e8, l lArray) {
        Object object;
        int n8;
        Object object2;
        Object[] objectArray;
        l[] lArray2;
        this.T = e8;
        this.S = lArray;
        boolean bl = lArray.x("children");
        int n9 = 0;
        if (bl) {
            lArray2 = new BaseDriveItemCollectionResponse();
            if (lArray.x("children@odata.nextLink")) {
                lArray2.b = lArray.t("children@odata.nextLink").k();
            }
            objectArray = e8.b(lArray.t("children").toString(), l[].class);
            object2 = new DriveItem[objectArray.length];
            for (n8 = 0; n8 < objectArray.length; ++n8) {
                object2[n8] = object = e8.b(objectArray[n8].toString(), DriveItem.class);
                ((BaseDriveItem)object).d(e8, (l)objectArray[n8]);
            }
            lArray2.a = Arrays.asList(object2);
            this.M = new DriveItemCollectionPage((BaseDriveItemCollectionResponse)lArray2, null);
        }
        if (lArray.x("permissions")) {
            lArray2 = new BasePermissionCollectionResponse();
            if (lArray.x("permissions@odata.nextLink")) {
                lArray2.b = lArray.t("permissions@odata.nextLink").k();
            }
            objectArray = e8.b(lArray.t("permissions").toString(), l[].class);
            object = new Permission[objectArray.length];
            for (n8 = 0; n8 < objectArray.length; ++n8) {
                object[n8] = object2 = e8.b(((i)objectArray[n8]).toString(), Permission.class);
                ((BasePermission)object2).d(e8, (l)objectArray[n8]);
            }
            lArray2.a = Arrays.asList(object);
            this.O = new PermissionCollectionPage((BasePermissionCollectionResponse)lArray2, null);
        }
        if (lArray.x("thumbnails")) {
            object2 = new BaseThumbnailSetCollectionResponse();
            if (lArray.x("thumbnails@odata.nextLink")) {
                ((BaseThumbnailSetCollectionResponse)object2).b = lArray.t("thumbnails@odata.nextLink").k();
            }
            lArray2 = e8.b(lArray.t("thumbnails").toString(), l[].class);
            objectArray = new ThumbnailSet[lArray2.length];
            for (n8 = 0; n8 < lArray2.length; ++n8) {
                object = e8.b(lArray2[n8].toString(), ThumbnailSet.class);
                objectArray[n8] = object;
                ((BaseThumbnailSet)object).d(e8, lArray2[n8]);
            }
            ((BaseThumbnailSetCollectionResponse)object2).a = Arrays.asList(objectArray);
            this.P = new ThumbnailSetCollectionPage((BaseThumbnailSetCollectionResponse)object2, null);
        }
        if (lArray.x("versions")) {
            lArray2 = new BaseDriveItemVersionCollectionResponse();
            if (lArray.x("versions@odata.nextLink")) {
                lArray2.b = lArray.t("versions@odata.nextLink").k();
            }
            lArray = e8.b(lArray.t("versions").toString(), l[].class);
            object2 = new DriveItemVersion[lArray.length];
            for (n8 = n9; n8 < lArray.length; ++n8) {
                object2[n8] = object = e8.b(lArray[n8].toString(), DriveItemVersion.class);
                ((BaseDriveItemVersion)object).d(e8, lArray[n8]);
            }
            lArray2.a = Arrays.asList(object2);
            this.Q = new DriveItemVersionCollectionPage((BaseDriveItemVersionCollectionResponse)lArray2, null);
        }
    }

    public l e() {
        return this.S;
    }
}

