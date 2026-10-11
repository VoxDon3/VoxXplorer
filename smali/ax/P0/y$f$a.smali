.class public final Lax/P0/y$f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/P0/y$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/util/UUID;

.field private b:Landroid/net/Uri;

.field private c:Lax/r7/A;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r7/A<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Lax/r7/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r7/z<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private h:[B


# direct methods
.method private constructor <init>()V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-static {}, Lax/r7/A;->k()Lax/r7/A;

    move-result-object v0

    iput-object v0, p0, Lax/P0/y$f$a;->c:Lax/r7/A;

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lax/P0/y$f$a;->e:Z

    .line 6
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    move-result-object v0

    iput-object v0, p0, Lax/P0/y$f$a;->g:Lax/r7/z;

    return-void
.end method

.method synthetic constructor <init>(Lax/P0/y$a;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/P0/y$f$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lax/P0/y$f;)V
    .registers 3

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iget-object v0, p1, Lax/P0/y$f;->a:Ljava/util/UUID;

    iput-object v0, p0, Lax/P0/y$f$a;->a:Ljava/util/UUID;

    .line 9
    iget-object v0, p1, Lax/P0/y$f;->c:Landroid/net/Uri;

    iput-object v0, p0, Lax/P0/y$f$a;->b:Landroid/net/Uri;

    .line 10
    iget-object v0, p1, Lax/P0/y$f;->e:Lax/r7/A;

    iput-object v0, p0, Lax/P0/y$f$a;->c:Lax/r7/A;

    .line 11
    iget-boolean v0, p1, Lax/P0/y$f;->f:Z

    iput-boolean v0, p0, Lax/P0/y$f$a;->d:Z

    .line 12
    iget-boolean v0, p1, Lax/P0/y$f;->g:Z

    iput-boolean v0, p0, Lax/P0/y$f$a;->e:Z

    .line 13
    iget-boolean v0, p1, Lax/P0/y$f;->h:Z

    iput-boolean v0, p0, Lax/P0/y$f$a;->f:Z

    .line 14
    iget-object v0, p1, Lax/P0/y$f;->j:Lax/r7/z;

    iput-object v0, p0, Lax/P0/y$f$a;->g:Lax/r7/z;

    .line 15
    invoke-static {p1}, Lax/P0/y$f;->a(Lax/P0/y$f;)[B

    move-result-object p1

    iput-object p1, p0, Lax/P0/y$f$a;->h:[B

    return-void
.end method

.method synthetic constructor <init>(Lax/P0/y$f;Lax/P0/y$a;)V
    .registers 3

    .line 2
    invoke-direct {p0, p1}, Lax/P0/y$f$a;-><init>(Lax/P0/y$f;)V

    return-void
.end method

.method static synthetic a(Lax/P0/y$f$a;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/P0/y$f$a;->d:Z

    .line 2
    .line 3
    return p0
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
    .line 22
.end method

.method static synthetic b(Lax/P0/y$f$a;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/P0/y$f$a;->e:Z

    .line 2
    .line 3
    return p0
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
    .line 22
.end method

.method static synthetic c(Lax/P0/y$f$a;)Lax/r7/z;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/P0/y$f$a;->g:Lax/r7/z;

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method

.method static synthetic d(Lax/P0/y$f$a;)[B
    .registers 1

    .line 1
    iget-object p0, p0, Lax/P0/y$f$a;->h:[B

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method

.method static synthetic e(Lax/P0/y$f$a;)Landroid/net/Uri;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/P0/y$f$a;->b:Landroid/net/Uri;

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method

.method static synthetic f(Lax/P0/y$f$a;)Ljava/util/UUID;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/P0/y$f$a;->a:Ljava/util/UUID;

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method

.method static synthetic g(Lax/P0/y$f$a;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/P0/y$f$a;->f:Z

    .line 2
    .line 3
    return p0
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
    .line 22
.end method

.method static synthetic h(Lax/P0/y$f$a;)Lax/r7/A;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/P0/y$f$a;->c:Lax/r7/A;

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method


# virtual methods
.method public i()Lax/P0/y$f;
    .registers 3

    .line 1
    new-instance v0, Lax/P0/y$f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lax/P0/y$f;-><init>(Lax/P0/y$f$a;Lax/P0/y$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
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
