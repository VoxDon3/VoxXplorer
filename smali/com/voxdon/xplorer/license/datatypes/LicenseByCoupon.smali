.class public Lcom/voxdon/xplorer/license/datatypes/LicenseByCoupon;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private couponCode:Ljava/lang/String;

.field private deviceId:Ljava/lang/String;

.field private transient expiryTimeDate:Ljava/util/Date;

.field private expiryTimeMillis:J

.field private productId:Ljava/lang/String;


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
    iget-object v0, p0, Lcom/voxdon/xplorer/license/datatypes/LicenseByCoupon;->productId:Ljava/lang/String;

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
.method public getCouponCode()Ljava/lang/String;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/license/datatypes/LicenseByCoupon;->couponCode:Ljava/lang/String;

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
    const-string v1, "Unexpected null couponCode"

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

.method public getExpiryTime()Ljava/util/Date;
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/license/datatypes/LicenseByCoupon;->expiryTimeDate:Ljava/util/Date;

    .line 2
    .line 3
    if-nez v0, :cond_d

    .line 4
    .line 5
    new-instance v0, Ljava/util/Date;

    .line 6
    .line 7
    iget-wide v1, p0, Lcom/voxdon/xplorer/license/datatypes/LicenseByCoupon;->expiryTimeMillis:J

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/voxdon/xplorer/license/datatypes/LicenseByCoupon;->expiryTimeDate:Ljava/util/Date;

    .line 13
    .line 14
    :cond_d
    iget-object v0, p0, Lcom/voxdon/xplorer/license/datatypes/LicenseByCoupon;->expiryTimeDate:Ljava/util/Date;

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
    .registers 2

    .line 1
    sget-object v0, Lax/Da/a;->f0:Lax/Da/a;

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

.method public getLicenseeId()Ljava/lang/String;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/license/datatypes/LicenseByCoupon;->deviceId:Ljava/lang/String;

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

.method public getProductCategory()Ljava/lang/String;
    .registers 3

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/license/datatypes/LicenseByCoupon;->getProductIdPrivate()Ljava/lang/String;

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
    invoke-direct {p0}, Lcom/voxdon/xplorer/license/datatypes/LicenseByCoupon;->getProductIdPrivate()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/voxdon/xplorer/license/datatypes/LicenseByCoupon;->getProductType()Lax/Da/c;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lax/Da/b;

    .line 10
    .line 11
    invoke-direct {v2, v1, v0}, Lax/Da/b;-><init>(Lax/Da/c;Ljava/lang/String;)V

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
    invoke-direct {p0}, Lcom/voxdon/xplorer/license/datatypes/LicenseByCoupon;->getProductIdPrivate()Ljava/lang/String;

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
    invoke-direct {p0}, Lcom/voxdon/xplorer/license/datatypes/LicenseByCoupon;->getProductIdPrivate()Ljava/lang/String;

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

.method public toString()Ljava/lang/String;
    .registers 7

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/license/datatypes/LicenseByCoupon;->productId:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/voxdon/xplorer/license/datatypes/LicenseByCoupon;->deviceId:Ljava/lang/String;

    .line 4
    .line 5
    iget-wide v2, p0, Lcom/voxdon/xplorer/license/datatypes/LicenseByCoupon;->expiryTimeMillis:J

    .line 6
    .line 7
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, p0, Lcom/voxdon/xplorer/license/datatypes/LicenseByCoupon;->couponCode:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v4, 0x4

    .line 14
    new-array v4, v4, [Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    aput-object v0, v4, v5

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    aput-object v1, v4, v0

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    aput-object v2, v4, v0

    .line 24
    .line 25
    const/4 v0, 0x3

    .line 26
    aput-object v3, v4, v0

    .line 27
    .line 28
    const-string v0, "LicenseByCoupon(productId=%s deviceId=%s expiryTimeMillis=%s couponCode=%s)"

    .line 29
    .line 30
    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0
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
