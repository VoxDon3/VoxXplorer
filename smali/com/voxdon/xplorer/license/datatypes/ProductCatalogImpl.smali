.class public Lcom/voxdon/xplorer/license/datatypes/ProductCatalogImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/Fa/d;
.implements Ljava/io/Serializable;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field public static CATEGORY_PREMIUM_BASIC:Ljava/lang/String; = "premium_basic"

.field private static sProductIdParser:Lax/e3/a;


# instance fields
.field private premiumBasic:Lcom/voxdon/xplorer/license/datatypes/ProductCategoryPremiumBasic;
    .annotation runtime Lax/s8/c;
        value = "premium_basic"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/e3/a;

    .line 2
    .line 3
    const-string v1, "com.voxdon.xplorer"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lax/e3/a;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/voxdon/xplorer/license/datatypes/ProductCatalogImpl;->sProductIdParser:Lax/e3/a;

    .line 9
    .line 10
    return-void
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

.method public static getProductCategoryStatic(Ljava/lang/String;)Ljava/lang/String;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/Ea/a;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/license/datatypes/ProductCatalogImpl;->sProductIdParser:Lax/e3/a;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lax/e3/a;->b(Ljava/lang/String;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "category"

    .line 8
    .line 9
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/lang/String;

    .line 14
    .line 15
    if-eqz p0, :cond_11

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_11
    new-instance p0, Lax/Ea/a;

    .line 19
    .line 20
    const-string v0, "category is null"

    .line 21
    .line 22
    invoke-direct {p0, v0}, Lax/Ea/a;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
    .line 26
    .line 27
    .line 28
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
.end method

.method public static getProductTypeStatic(Ljava/lang/String;)Lax/Da/c;
    .registers 2

    .line 1
    const-string v0, ".onetime"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_b

    .line 8
    .line 9
    sget-object p0, Lax/Da/c;->c0:Lax/Da/c;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_b
    sget-object p0, Lax/Da/c;->d0:Lax/Da/c;

    .line 13
    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static getProductVariationStatic(Ljava/lang/String;)Ljava/lang/String;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/Ea/a;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/license/datatypes/ProductCatalogImpl;->sProductIdParser:Lax/e3/a;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lax/e3/a;->b(Ljava/lang/String;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "variation"

    .line 8
    .line 9
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/lang/String;

    .line 14
    .line 15
    if-eqz p0, :cond_11

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_11
    new-instance p0, Lax/Ea/a;

    .line 19
    .line 20
    const-string v0, "variation is null"

    .line 21
    .line 22
    invoke-direct {p0, v0}, Lax/Ea/a;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
    .line 26
    .line 27
    .line 28
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
.end method


# virtual methods
.method public getPremiumBasicOnetime()Lax/Da/b;
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/license/datatypes/ProductCatalogImpl;->premiumBasic:Lcom/voxdon/xplorer/license/datatypes/ProductCategoryPremiumBasic;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_6
    iget-object v0, v0, Lcom/voxdon/xplorer/license/datatypes/ProductCategoryPremiumBasic;->onetime:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v0, :cond_b

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_b
    sget-object v1, Lcom/voxdon/xplorer/license/datatypes/ProductCatalogImpl;->sProductIdParser:Lax/e3/a;

    .line 13
    .line 14
    sget-object v2, Lcom/voxdon/xplorer/license/datatypes/ProductCatalogImpl;->CATEGORY_PREMIUM_BASIC:Ljava/lang/String;

    .line 15
    .line 16
    const-string v3, "onetime"

    .line 17
    .line 18
    invoke-virtual {v1, v2, v3, v0}, Lax/e3/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Lax/Da/b;

    .line 23
    .line 24
    sget-object v2, Lax/Da/c;->c0:Lax/Da/c;

    .line 25
    .line 26
    invoke-direct {v1, v2, v0}, Lax/Da/b;-><init>(Lax/Da/c;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v1
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

.method public getPremiumBasicOnetimeDiscount()Lax/Da/b;
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/license/datatypes/ProductCatalogImpl;->premiumBasic:Lcom/voxdon/xplorer/license/datatypes/ProductCategoryPremiumBasic;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_6
    iget-object v0, v0, Lcom/voxdon/xplorer/license/datatypes/ProductCategoryPremiumBasic;->onetime_dc:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v0, :cond_b

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_b
    sget-object v1, Lcom/voxdon/xplorer/license/datatypes/ProductCatalogImpl;->sProductIdParser:Lax/e3/a;

    .line 13
    .line 14
    sget-object v2, Lcom/voxdon/xplorer/license/datatypes/ProductCatalogImpl;->CATEGORY_PREMIUM_BASIC:Ljava/lang/String;

    .line 15
    .line 16
    const-string v3, "onetime_dc"

    .line 17
    .line 18
    invoke-virtual {v1, v2, v3, v0}, Lax/e3/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Lax/Da/b;

    .line 23
    .line 24
    sget-object v2, Lax/Da/c;->c0:Lax/Da/c;

    .line 25
    .line 26
    invoke-direct {v1, v2, v0}, Lax/Da/b;-><init>(Lax/Da/c;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v1
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

.method public getPremiumBasicYearly()Lax/Da/b;
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/license/datatypes/ProductCatalogImpl;->premiumBasic:Lcom/voxdon/xplorer/license/datatypes/ProductCategoryPremiumBasic;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_6
    iget-object v0, v0, Lcom/voxdon/xplorer/license/datatypes/ProductCategoryPremiumBasic;->yearly:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v0, :cond_b

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_b
    sget-object v1, Lcom/voxdon/xplorer/license/datatypes/ProductCatalogImpl;->sProductIdParser:Lax/e3/a;

    .line 13
    .line 14
    sget-object v2, Lcom/voxdon/xplorer/license/datatypes/ProductCatalogImpl;->CATEGORY_PREMIUM_BASIC:Ljava/lang/String;

    .line 15
    .line 16
    const-string v3, "yearly"

    .line 17
    .line 18
    invoke-virtual {v1, v2, v3, v0}, Lax/e3/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Lax/Da/b;

    .line 23
    .line 24
    sget-object v2, Lax/Da/c;->d0:Lax/Da/c;

    .line 25
    .line 26
    invoke-direct {v1, v2, v0}, Lax/Da/b;-><init>(Lax/Da/c;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v1
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

.method public getPremiumBasicYearlyDiscount()Lax/Da/b;
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/license/datatypes/ProductCatalogImpl;->premiumBasic:Lcom/voxdon/xplorer/license/datatypes/ProductCategoryPremiumBasic;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_6
    iget-object v0, v0, Lcom/voxdon/xplorer/license/datatypes/ProductCategoryPremiumBasic;->yearly_dc:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v0, :cond_b

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_b
    sget-object v1, Lcom/voxdon/xplorer/license/datatypes/ProductCatalogImpl;->sProductIdParser:Lax/e3/a;

    .line 13
    .line 14
    sget-object v2, Lcom/voxdon/xplorer/license/datatypes/ProductCatalogImpl;->CATEGORY_PREMIUM_BASIC:Ljava/lang/String;

    .line 15
    .line 16
    const-string v3, "yearly_dc"

    .line 17
    .line 18
    invoke-virtual {v1, v2, v3, v0}, Lax/e3/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Lax/Da/b;

    .line 23
    .line 24
    sget-object v2, Lax/Da/c;->d0:Lax/Da/c;

    .line 25
    .line 26
    invoke-direct {v1, v2, v0}, Lax/Da/b;-><init>(Lax/Da/c;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v1
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

.method public getProductCategory(Lax/Da/b;)Ljava/lang/String;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/Ea/b;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object p1, p1, Lax/Da/b;->c0:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/voxdon/xplorer/license/datatypes/ProductCatalogImpl;->getProductCategoryStatic(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1
    :try_end_6
    .catch Lax/Ea/a; {:try_start_0 .. :try_end_6} :catch_7

    .line 7
    return-object p1

    .line 8
    :catch_7
    move-exception p1

    .line 9
    new-instance v0, Lax/Ea/b;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lax/Ea/b;-><init>(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    throw v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public getProductVariation(Lax/Da/b;)Ljava/lang/String;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/Ea/b;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object p1, p1, Lax/Da/b;->c0:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/voxdon/xplorer/license/datatypes/ProductCatalogImpl;->getProductVariationStatic(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1
    :try_end_6
    .catch Lax/Ea/a; {:try_start_0 .. :try_end_6} :catch_7

    .line 7
    return-object p1

    .line 8
    :catch_7
    move-exception p1

    .line 9
    new-instance v0, Lax/Ea/b;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lax/Ea/b;-><init>(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    throw v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/license/datatypes/ProductCatalogImpl;->premiumBasic:Lcom/voxdon/xplorer/license/datatypes/ProductCategoryPremiumBasic;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v0, v1, v2

    .line 8
    .line 9
    const-string v0, "ProductCatalogImpl(premiumBasic=%s)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
