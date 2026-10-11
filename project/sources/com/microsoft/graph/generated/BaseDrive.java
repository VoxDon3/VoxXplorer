package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.BaseItem;
import com.microsoft.graph.extensions.DriveItem;
import com.microsoft.graph.extensions.DriveItemCollectionPage;
import com.microsoft.graph.extensions.IdentitySet;
import com.microsoft.graph.extensions.List;
import com.microsoft.graph.extensions.Quota;
import com.microsoft.graph.extensions.SharepointIds;
import com.microsoft.graph.extensions.SystemFacet;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class BaseDrive extends BaseItem implements d {
    public transient DriveItemCollectionPage A;
    private transient C3003l B;
    private transient e C;

    @InterfaceC3059a
    @InterfaceC3061c("driveType")
    public String s;

    @InterfaceC3059a
    @InterfaceC3061c("owner")
    public IdentitySet t;

    @InterfaceC3059a
    @InterfaceC3061c("quota")
    public Quota u;

    @InterfaceC3059a
    @InterfaceC3061c("sharePointIds")
    public SharepointIds v;

    @InterfaceC3059a
    @InterfaceC3061c("system")
    public SystemFacet w;
    public transient DriveItemCollectionPage x;

    @InterfaceC3059a
    @InterfaceC3061c("list")
    public List y;

    @InterfaceC3059a
    @InterfaceC3061c("root")
    public DriveItem z;

    @Override // com.microsoft.graph.generated.BaseBaseItem, com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.C = eVar;
        this.B = c3003l;
        if (c3003l.x("items")) {
            BaseDriveItemCollectionResponse baseDriveItemCollectionResponse = new BaseDriveItemCollectionResponse();
            if (c3003l.x("items@odata.nextLink")) {
                baseDriveItemCollectionResponse.b = c3003l.t("items@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("items").toString(), C3003l[].class);
            DriveItem[] driveItemArr = new DriveItem[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                DriveItem driveItem = (DriveItem) eVar.b(c3003lArr[i].toString(), DriveItem.class);
                driveItemArr[i] = driveItem;
                driveItem.d(eVar, c3003lArr[i]);
            }
            baseDriveItemCollectionResponse.a = Arrays.asList(driveItemArr);
            this.x = new DriveItemCollectionPage(baseDriveItemCollectionResponse, null);
        }
        if (c3003l.x("special")) {
            BaseDriveItemCollectionResponse baseDriveItemCollectionResponse2 = new BaseDriveItemCollectionResponse();
            if (c3003l.x("special@odata.nextLink")) {
                baseDriveItemCollectionResponse2.b = c3003l.t("special@odata.nextLink").k();
            }
            C3003l[] c3003lArr2 = (C3003l[]) eVar.b(c3003l.t("special").toString(), C3003l[].class);
            DriveItem[] driveItemArr2 = new DriveItem[c3003lArr2.length];
            for (int i2 = 0; i2 < c3003lArr2.length; i2++) {
                DriveItem driveItem2 = (DriveItem) eVar.b(c3003lArr2[i2].toString(), DriveItem.class);
                driveItemArr2[i2] = driveItem2;
                driveItem2.d(eVar, c3003lArr2[i2]);
            }
            baseDriveItemCollectionResponse2.a = Arrays.asList(driveItemArr2);
            this.A = new DriveItemCollectionPage(baseDriveItemCollectionResponse2, null);
        }
    }
}
