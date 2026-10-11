/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.BaseItem;
import com.microsoft.graph.extensions.DriveItem;
import com.microsoft.graph.extensions.DriveItemCollectionPage;
import com.microsoft.graph.extensions.IdentitySet;
import com.microsoft.graph.extensions.List;
import com.microsoft.graph.extensions.Quota;
import com.microsoft.graph.extensions.SharepointIds;
import com.microsoft.graph.extensions.SystemFacet;
import com.microsoft.graph.generated.BaseDriveItem;
import com.microsoft.graph.generated.BaseDriveItemCollectionResponse;
import java.util.Arrays;

public class BaseDrive
extends BaseItem
implements d {
    public transient DriveItemCollectionPage A;
    private transient l B;
    private transient e C;
    @a
    @c(value="driveType")
    public String s;
    @a
    @c(value="owner")
    public IdentitySet t;
    @a
    @c(value="quota")
    public Quota u;
    @a
    @c(value="sharePointIds")
    public SharepointIds v;
    @a
    @c(value="system")
    public SystemFacet w;
    public transient DriveItemCollectionPage x;
    @a
    @c(value="list")
    public List y;
    @a
    @c(value="root")
    public DriveItem z;

    @Override
    public void d(e e8, l driveItemArray) {
        int n8;
        DriveItem[] driveItemArray2;
        l[] lArray;
        d d8;
        this.C = e8;
        this.B = driveItemArray;
        boolean bl = driveItemArray.x("items");
        int n9 = 0;
        if (bl) {
            d8 = new BaseDriveItemCollectionResponse();
            if (driveItemArray.x("items@odata.nextLink")) {
                ((BaseDriveItemCollectionResponse)d8).b = driveItemArray.t("items@odata.nextLink").k();
            }
            lArray = e8.b(driveItemArray.t("items").toString(), l[].class);
            driveItemArray2 = new DriveItem[lArray.length];
            for (n8 = 0; n8 < lArray.length; ++n8) {
                DriveItem driveItem;
                driveItemArray2[n8] = driveItem = e8.b(lArray[n8].toString(), DriveItem.class);
                driveItem.d(e8, lArray[n8]);
            }
            ((BaseDriveItemCollectionResponse)d8).a = Arrays.asList(driveItemArray2);
            this.x = new DriveItemCollectionPage((BaseDriveItemCollectionResponse)d8, null);
        }
        if (driveItemArray.x("special")) {
            driveItemArray2 = new BaseDriveItemCollectionResponse();
            if (driveItemArray.x("special@odata.nextLink")) {
                driveItemArray2.b = driveItemArray.t("special@odata.nextLink").k();
            }
            lArray = e8.b(driveItemArray.t("special").toString(), l[].class);
            driveItemArray = new DriveItem[lArray.length];
            for (n8 = n9; n8 < lArray.length; ++n8) {
                d8 = e8.b(lArray[n8].toString(), DriveItem.class);
                driveItemArray[n8] = d8;
                ((BaseDriveItem)d8).d(e8, lArray[n8]);
            }
            driveItemArray2.a = Arrays.asList(driveItemArray);
            this.A = new DriveItemCollectionPage((BaseDriveItemCollectionResponse)driveItemArray2, null);
        }
    }
}

