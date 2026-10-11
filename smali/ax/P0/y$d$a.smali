.class public final Lax/P0/y$d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/P0/y$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:J

.field private b:J

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Z


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, -0x8000000000000000L

    .line 3
    iput-wide v0, p0, Lax/P0/y$d$a;->b:J

    return-void
.end method

.method private constructor <init>(Lax/P0/y$d;)V
    .registers 4

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iget-wide v0, p1, Lax/P0/y$d;->b:J

    iput-wide v0, p0, Lax/P0/y$d$a;->a:J

    .line 6
    iget-wide v0, p1, Lax/P0/y$d;->d:J

    iput-wide v0, p0, Lax/P0/y$d$a;->b:J

    .line 7
    iget-boolean v0, p1, Lax/P0/y$d;->e:Z

    iput-boolean v0, p0, Lax/P0/y$d$a;->c:Z

    .line 8
    iget-boolean v0, p1, Lax/P0/y$d;->f:Z

    iput-boolean v0, p0, Lax/P0/y$d$a;->d:Z

    .line 9
    iget-boolean v0, p1, Lax/P0/y$d;->g:Z

    iput-boolean v0, p0, Lax/P0/y$d$a;->e:Z

    .line 10
    iget-boolean p1, p1, Lax/P0/y$d;->h:Z

    iput-boolean p1, p0, Lax/P0/y$d$a;->f:Z

    return-void
.end method

.method synthetic constructor <init>(Lax/P0/y$d;Lax/P0/y$a;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lax/P0/y$d$a;-><init>(Lax/P0/y$d;)V

    return-void
.end method

.method static synthetic a(Lax/P0/y$d$a;)J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/P0/y$d$a;->a:J

    .line 2
    .line 3
    return-wide v0
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

.method static synthetic b(Lax/P0/y$d$a;)J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/P0/y$d$a;->b:J

    .line 2
    .line 3
    return-wide v0
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

.method static synthetic c(Lax/P0/y$d$a;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/P0/y$d$a;->c:Z

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

.method static synthetic d(Lax/P0/y$d$a;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/P0/y$d$a;->d:Z

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

.method static synthetic e(Lax/P0/y$d$a;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/P0/y$d$a;->e:Z

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

.method static synthetic f(Lax/P0/y$d$a;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/P0/y$d$a;->f:Z

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


# virtual methods
.method public g()Lax/P0/y$d;
    .registers 3

    .line 1
    new-instance v0, Lax/P0/y$d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lax/P0/y$d;-><init>(Lax/P0/y$d$a;Lax/P0/y$a;)V

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

.method public h()Lax/P0/y$e;
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance v0, Lax/P0/y$e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lax/P0/y$e;-><init>(Lax/P0/y$d$a;Lax/P0/y$a;)V

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
