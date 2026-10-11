.class public Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/Fa/c;
.implements Ljava/io/Serializable;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private consumptionStateCode:Ljava/lang/Integer;

.field private deviceId:Ljava/lang/String;

.field private transient expiryTimeDate:Ljava/util/Date;

.field private expiryTimeMillis:J

.field private inAppPurchaseDataVerified:Lcom/socialnmobile/commons/inapppurchase/billing/datatypes/InAppPurchaseData;

.field private licenseStateCode:Ljava/lang/Integer;

.field private paymentStateCode:Ljava/lang/Integer;

.field private productId:Ljava/lang/String;

.field private purchaseStateCode:Ljava/lang/Integer;

.field private purchaseTypeCode:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private getProductIdPrivate()Ljava/lang/String;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->productId:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "Unexpected null productId"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public getConsumptionStateCode()Ljava/lang/Integer;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->consumptionStateCode:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getExpiryTime()Ljava/util/Date;
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->expiryTimeDate:Ljava/util/Date;

    .line 2
    .line 3
    if-nez v0, :cond_d

    .line 4
    .line 5
    new-instance v0, Ljava/util/Date;

    .line 6
    .line 7
    iget-wide v1, p0, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->expiryTimeMillis:J

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->expiryTimeDate:Ljava/util/Date;

    .line 13
    .line 14
    :cond_d
    iget-object v0, p0, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->expiryTimeDate:Ljava/util/Date;

    .line 15
    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getLicenseState()Lax/Da/a;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->licenseStateCode:Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_14

    .line 4
    .line 5
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Lax/Da/a;->h(I)Lax/Da/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_c
    .catch Lax/Ea/b; {:try_start_4 .. :try_end_c} :catch_d

    .line 13
    return-object v0

    .line 14
    :catch_d
    move-exception v0

    .line 15
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    throw v1

    .line 21
    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v1, "Unexpected null licenseStateCode"

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public getLicenseeId()Ljava/lang/String;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->deviceId:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "Unexpected null deviceId"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getPaymentStateCode()Ljava/lang/Integer;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->paymentStateCode:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getProductCategory()Ljava/lang/String;
    .registers 3

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->getProductIdPrivate()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_4
    invoke-static {v0}, Lcom/voxdon/xplorer/license/datatypes/ProductCatalogImpl;->getProductCategoryStatic(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0
    :try_end_8
    .catch Lax/Ea/a; {:try_start_4 .. :try_end_8} :catch_9

    .line 9
    return-object v0

    .line 10
    :catch_9
    move-exception v0

    .line 11
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    throw v1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getProductId()Lax/Da/b;
    .registers 4

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->getProductType()Lax/Da/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->getProductIdPrivate()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lax/Da/b;

    .line 10
    .line 11
    invoke-direct {v2, v0, v1}, Lax/Da/b;-><init>(Lax/Da/c;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v2
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getProductType()Lax/Da/c;
    .registers 2

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->getProductIdPrivate()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/voxdon/xplorer/license/datatypes/ProductCatalogImpl;->getProductTypeStatic(Ljava/lang/String;)Lax/Da/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getProductVariation()Ljava/lang/String;
    .registers 3

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->getProductIdPrivate()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_4
    invoke-static {v0}, Lcom/voxdon/xplorer/license/datatypes/ProductCatalogImpl;->getProductVariationStatic(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0
    :try_end_8
    .catch Lax/Ea/a; {:try_start_4 .. :try_end_8} :catch_9

    .line 9
    return-object v0

    .line 10
    :catch_9
    move-exception v0

    .line 11
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    throw v1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getPurchaseStateCode()Ljava/lang/Integer;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->purchaseStateCode:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getPurchaseTypeCode()Ljava/lang/Integer;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->purchaseTypeCode:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getVerifiedPurchaseData()Lcom/socialnmobile/commons/inapppurchase/billing/datatypes/InAppPurchaseData;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->inAppPurchaseDataVerified:Lcom/socialnmobile/commons/inapppurchase/billing/datatypes/InAppPurchaseData;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "Unexpected null inAppPurchaseDataVerified"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public toString()Ljava/lang/String;
    .registers 12

    .line 1
    iget-wide v0, p0, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->expiryTimeMillis:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->productId:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->deviceId:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v3, p0, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->inAppPurchaseDataVerified:Lcom/socialnmobile/commons/inapppurchase/billing/datatypes/InAppPurchaseData;

    .line 12
    .line 13
    iget-object v4, p0, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->licenseStateCode:Ljava/lang/Integer;

    .line 14
    .line 15
    iget-object v5, p0, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->purchaseStateCode:Ljava/lang/Integer;

    .line 16
    .line 17
    iget-object v6, p0, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->purchaseTypeCode:Ljava/lang/Integer;

    .line 18
    .line 19
    iget-object v7, p0, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->paymentStateCode:Ljava/lang/Integer;

    .line 20
    .line 21
    iget-object v8, p0, Lcom/voxdon/xplorer/license/datatypes/LicensePurchasedImpl;->consumptionStateCode:Ljava/lang/Integer;

    .line 22
    .line 23
    const/16 v9, 0x9

    .line 24
    .line 25
    new-array v9, v9, [Ljava/lang/Object;

    .line 26
    .line 27
    const/4 v10, 0x0

    .line 28
    aput-object v0, v9, v10

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    aput-object v1, v9, v0

    .line 32
    .line 33
    const/4 v0, 0x2

    .line 34
    aput-object v2, v9, v0

    .line 35
    .line 36
    const/4 v0, 0x3

    .line 37
    aput-object v3, v9, v0

    .line 38
    .line 39
    const/4 v0, 0x4

    .line 40
    aput-object v4, v9, v0

    .line 41
    .line 42
    const/4 v0, 0x5

    .line 43
    aput-object v5, v9, v0

    .line 44
    .line 45
    const/4 v0, 0x6

    .line 46
    aput-object v6, v9, v0

    .line 47
    .line 48
    const/4 v0, 0x7

    .line 49
    aput-object v7, v9, v0

    .line 50
    .line 51
    const/16 v0, 0x8

    .line 52
    .line 53
    aput-object v8, v9, v0

    .line 54
    .line 55
    const-string v0, "LicensePurchasedImpl(expiryTimeMillis=%s productId=%s deviceId=%s inAppPurchaseDataVerified=%s licenseStateCode=%s purchaseTypeCode=%s purchaseStateCode=%s paymentStateCode=%s consumptionStateCode=%s)"

    .line 56
    .line 57
    invoke-static {v0, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
