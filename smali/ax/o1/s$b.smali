.class public final Lax/o1/s$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/o1/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lax/o1/A;

.field private c:Lax/P0/Z$a;

.field private d:Z

.field private e:Lax/S0/h;

.field private f:Z

.field private g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lax/o1/A;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lax/o1/s$b;->a:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Lax/o1/s$b;->b:Lax/o1/A;

    .line 11
    .line 12
    sget-object p1, Lax/S0/h;->a:Lax/S0/h;

    .line 13
    .line 14
    iput-object p1, p0, Lax/o1/s$b;->e:Lax/S0/h;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
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
.end method

.method static synthetic a(Lax/o1/s$b;)Landroid/content/Context;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/o1/s$b;->a:Landroid/content/Context;

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

.method static synthetic b(Lax/o1/s$b;)Lax/P0/Z$a;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/o1/s$b;->c:Lax/P0/Z$a;

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

.method static synthetic c(Lax/o1/s$b;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/o1/s$b;->d:Z

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

.method static synthetic d(Lax/o1/s$b;)Lax/S0/h;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/o1/s$b;->e:Lax/S0/h;

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

.method static synthetic e(Lax/o1/s$b;)Lax/o1/A;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/o1/s$b;->b:Lax/o1/A;

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
.method public f()Lax/o1/s;
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/o1/s$b;->f:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lax/o1/s$b;->c:Lax/P0/Z$a;

    .line 9
    .line 10
    if-nez v0, :cond_14

    .line 11
    .line 12
    new-instance v0, Lax/o1/s$g;

    .line 13
    .line 14
    iget-boolean v2, p0, Lax/o1/s$b;->g:Z

    .line 15
    .line 16
    invoke-direct {v0, v2}, Lax/o1/s$g;-><init>(Z)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lax/o1/s$b;->c:Lax/P0/Z$a;

    .line 20
    .line 21
    :cond_14
    new-instance v0, Lax/o1/s;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v0, p0, v2}, Lax/o1/s;-><init>(Lax/o1/s$b;Lax/o1/s$a;)V

    .line 25
    .line 26
    .line 27
    iput-boolean v1, p0, Lax/o1/s$b;->f:Z

    .line 28
    .line 29
    return-object v0
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

.method public g(Lax/S0/h;)Lax/o1/s$b;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/o1/s$b;->e:Lax/S0/h;

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

.method public h(Z)Lax/o1/s$b;
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/o1/s$b;->d:Z

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
