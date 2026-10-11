.class Lcom/voxdon/xplorer/license/datatypes/ProductCategoryPremiumBasic;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field onetime:Ljava/lang/String;

.field onetime_dc:Ljava/lang/String;

.field yearly:Ljava/lang/String;

.field yearly_dc:Ljava/lang/String;


# direct methods
.method constructor <init>()V
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


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 7

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/license/datatypes/ProductCategoryPremiumBasic;->yearly:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/voxdon/xplorer/license/datatypes/ProductCategoryPremiumBasic;->yearly_dc:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/voxdon/xplorer/license/datatypes/ProductCategoryPremiumBasic;->onetime:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/voxdon/xplorer/license/datatypes/ProductCategoryPremiumBasic;->onetime_dc:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v4, 0x4

    .line 10
    new-array v4, v4, [Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    aput-object v0, v4, v5

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    aput-object v1, v4, v0

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    aput-object v2, v4, v0

    .line 20
    .line 21
    const/4 v0, 0x3

    .line 22
    aput-object v3, v4, v0

    .line 23
    .line 24
    const-string v0, "ProductCategoryPremiumBasic(yearly=%s yearly_dc=%s onetime=%s onetime_dc=%s)"

    .line 25
    .line 26
    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0
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
