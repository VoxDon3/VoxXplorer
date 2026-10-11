.class Lax/o4/g$f;
.super Lax/o4/g$O;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/o4/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "f"
.end annotation


# static fields
.field static final c0:Lax/o4/g$f;

.field static final d0:Lax/o4/g$f;


# instance fields
.field q:I


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/o4/g$f;

    .line 2
    .line 3
    const/high16 v1, -0x1000000

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lax/o4/g$f;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lax/o4/g$f;->c0:Lax/o4/g$f;

    .line 9
    .line 10
    new-instance v0, Lax/o4/g$f;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {v0, v1}, Lax/o4/g$f;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lax/o4/g$f;->d0:Lax/o4/g$f;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method constructor <init>(I)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/o4/g$O;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lax/o4/g$f;->q:I

    .line 5
    .line 6
    return-void
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
    .line 22
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 4

    .line 1
    iget v0, p0, Lax/o4/g$f;->q:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    new-array v1, v1, [Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    aput-object v0, v1, v2

    .line 12
    .line 13
    const-string v0, "#%08x"

    .line 14
    .line 15
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
    .line 20
    .line 21
.end method
