.class abstract Lax/o4/g$L;
.super Lax/o4/g$N;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/o4/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "L"
.end annotation


# instance fields
.field c:Ljava/lang/String;

.field d:Ljava/lang/Boolean;

.field e:Lax/o4/g$E;

.field f:Lax/o4/g$E;

.field g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/o4/g$N;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lax/o4/g$L;->c:Ljava/lang/String;

    .line 6
    .line 7
    iput-object v0, p0, Lax/o4/g$L;->d:Ljava/lang/Boolean;

    .line 8
    .line 9
    iput-object v0, p0, Lax/o4/g$L;->e:Lax/o4/g$E;

    .line 10
    .line 11
    iput-object v0, p0, Lax/o4/g$L;->f:Lax/o4/g$E;

    .line 12
    .line 13
    iput-object v0, p0, Lax/o4/g$L;->g:Ljava/util/List;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/o4/g$N;->o()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
