package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
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
import java.util.Arrays;

/* loaded from: classes3.dex */
public class BaseDriveItem extends BaseItem implements d {

    @InterfaceC3059a
    @InterfaceC3061c("package")
    public Package A;

    @InterfaceC3059a
    @InterfaceC3061c("photo")
    public Photo B;

    @InterfaceC3059a
    @InterfaceC3061c("publication")
    public PublicationFacet C;

    @InterfaceC3059a
    @InterfaceC3061c("remoteItem")
    public RemoteItem D;

    @InterfaceC3059a
    @InterfaceC3061c("root")
    public Root E;

    @InterfaceC3059a
    @InterfaceC3061c("searchResult")
    public SearchResult F;

    @InterfaceC3059a
    @InterfaceC3061c("shared")
    public Shared G;

    @InterfaceC3059a
    @InterfaceC3061c("sharepointIds")
    public SharepointIds H;

    @InterfaceC3059a
    @InterfaceC3061c("size")
    public Long I;

    @InterfaceC3059a
    @InterfaceC3061c("specialFolder")
    public SpecialFolder J;

    @InterfaceC3059a
    @InterfaceC3061c("video")
    public Video K;

    @InterfaceC3059a
    @InterfaceC3061c("webDavUrl")
    public String L;
    public transient DriveItemCollectionPage M;

    @InterfaceC3059a
    @InterfaceC3061c("listItem")
    public ListItem N;
    public transient PermissionCollectionPage O;
    public transient ThumbnailSetCollectionPage P;
    public transient DriveItemVersionCollectionPage Q;

    @InterfaceC3059a
    @InterfaceC3061c("workbook")
    public Workbook R;
    private transient C3003l S;
    private transient e T;

    @InterfaceC3059a
    @InterfaceC3061c("audio")
    public Audio s;

    @InterfaceC3059a
    @InterfaceC3061c("cTag")
    public String t;

    @InterfaceC3059a
    @InterfaceC3061c("deleted")
    public Deleted u;

    @InterfaceC3059a
    @InterfaceC3061c("file")
    public File v;

    @InterfaceC3059a
    @InterfaceC3061c("fileSystemInfo")
    public FileSystemInfo w;

    @InterfaceC3059a
    @InterfaceC3061c("folder")
    public Folder x;

    @InterfaceC3059a
    @InterfaceC3061c("image")
    public Image y;

    @InterfaceC3059a
    @InterfaceC3061c("location")
    public GeoCoordinates z;

    @Override // com.microsoft.graph.generated.BaseBaseItem, com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.T = eVar;
        this.S = c3003l;
        if (c3003l.x("children")) {
            BaseDriveItemCollectionResponse baseDriveItemCollectionResponse = new BaseDriveItemCollectionResponse();
            if (c3003l.x("children@odata.nextLink")) {
                baseDriveItemCollectionResponse.b = c3003l.t("children@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("children").toString(), C3003l[].class);
            DriveItem[] driveItemArr = new DriveItem[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                DriveItem driveItem = (DriveItem) eVar.b(c3003lArr[i].toString(), DriveItem.class);
                driveItemArr[i] = driveItem;
                driveItem.d(eVar, c3003lArr[i]);
            }
            baseDriveItemCollectionResponse.a = Arrays.asList(driveItemArr);
            this.M = new DriveItemCollectionPage(baseDriveItemCollectionResponse, null);
        }
        if (c3003l.x("permissions")) {
            BasePermissionCollectionResponse basePermissionCollectionResponse = new BasePermissionCollectionResponse();
            if (c3003l.x("permissions@odata.nextLink")) {
                basePermissionCollectionResponse.b = c3003l.t("permissions@odata.nextLink").k();
            }
            C3003l[] c3003lArr2 = (C3003l[]) eVar.b(c3003l.t("permissions").toString(), C3003l[].class);
            Permission[] permissionArr = new Permission[c3003lArr2.length];
            for (int i2 = 0; i2 < c3003lArr2.length; i2++) {
                Permission permission = (Permission) eVar.b(c3003lArr2[i2].toString(), Permission.class);
                permissionArr[i2] = permission;
                permission.d(eVar, c3003lArr2[i2]);
            }
            basePermissionCollectionResponse.a = Arrays.asList(permissionArr);
            this.O = new PermissionCollectionPage(basePermissionCollectionResponse, null);
        }
        if (c3003l.x("thumbnails")) {
            BaseThumbnailSetCollectionResponse baseThumbnailSetCollectionResponse = new BaseThumbnailSetCollectionResponse();
            if (c3003l.x("thumbnails@odata.nextLink")) {
                baseThumbnailSetCollectionResponse.b = c3003l.t("thumbnails@odata.nextLink").k();
            }
            C3003l[] c3003lArr3 = (C3003l[]) eVar.b(c3003l.t("thumbnails").toString(), C3003l[].class);
            ThumbnailSet[] thumbnailSetArr = new ThumbnailSet[c3003lArr3.length];
            for (int i3 = 0; i3 < c3003lArr3.length; i3++) {
                ThumbnailSet thumbnailSet = (ThumbnailSet) eVar.b(c3003lArr3[i3].toString(), ThumbnailSet.class);
                thumbnailSetArr[i3] = thumbnailSet;
                thumbnailSet.d(eVar, c3003lArr3[i3]);
            }
            baseThumbnailSetCollectionResponse.a = Arrays.asList(thumbnailSetArr);
            this.P = new ThumbnailSetCollectionPage(baseThumbnailSetCollectionResponse, null);
        }
        if (c3003l.x("versions")) {
            BaseDriveItemVersionCollectionResponse baseDriveItemVersionCollectionResponse = new BaseDriveItemVersionCollectionResponse();
            if (c3003l.x("versions@odata.nextLink")) {
                baseDriveItemVersionCollectionResponse.b = c3003l.t("versions@odata.nextLink").k();
            }
            C3003l[] c3003lArr4 = (C3003l[]) eVar.b(c3003l.t("versions").toString(), C3003l[].class);
            DriveItemVersion[] driveItemVersionArr = new DriveItemVersion[c3003lArr4.length];
            for (int i4 = 0; i4 < c3003lArr4.length; i4++) {
                DriveItemVersion driveItemVersion = (DriveItemVersion) eVar.b(c3003lArr4[i4].toString(), DriveItemVersion.class);
                driveItemVersionArr[i4] = driveItemVersion;
                driveItemVersion.d(eVar, c3003lArr4[i4]);
            }
            baseDriveItemVersionCollectionResponse.a = Arrays.asList(driveItemVersionArr);
            this.Q = new DriveItemVersionCollectionPage(baseDriveItemVersionCollectionResponse, null);
        }
    }

    public C3003l e() {
        return this.S;
    }
}
