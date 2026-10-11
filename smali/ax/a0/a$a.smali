.class public final Lax/a0/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/a0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private b:I

.field private c:Lax/a0/t;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Lax/a0/a;->e(Ljava/util/Locale;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-direct {p0, v0}, Lax/a0/a$a;->c(Z)V

    .line 13
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

.method private static b(Z)Lax/a0/a;
    .registers 1

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    sget-object p0, Lax/a0/a;->h:Lax/a0/a;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_5
    sget-object p0, Lax/a0/a;->g:Lax/a0/a;

    .line 7
    .line 8
    return-object p0
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

.method private c(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/a0/a$a;->a:Z

    .line 2
    .line 3
    sget-object p1, Lax/a0/a;->d:Lax/a0/t;

    .line 4
    .line 5
    iput-object p1, p0, Lax/a0/a$a;->c:Lax/a0/t;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    iput p1, p0, Lax/a0/a$a;->b:I

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
    .line 22
.end method


# virtual methods
.method public a()Lax/a0/a;
    .registers 5

    .line 1
    iget v0, p0, Lax/a0/a$a;->b:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_12

    .line 5
    .line 6
    iget-object v0, p0, Lax/a0/a$a;->c:Lax/a0/t;

    .line 7
    .line 8
    sget-object v1, Lax/a0/a;->d:Lax/a0/t;

    .line 9
    .line 10
    if-ne v0, v1, :cond_12

    .line 11
    .line 12
    iget-boolean v0, p0, Lax/a0/a$a;->a:Z

    .line 13
    .line 14
    invoke-static {v0}, Lax/a0/a$a;->b(Z)Lax/a0/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :cond_12
    new-instance v0, Lax/a0/a;

    .line 20
    .line 21
    iget-boolean v1, p0, Lax/a0/a$a;->a:Z

    .line 22
    .line 23
    iget v2, p0, Lax/a0/a$a;->b:I

    .line 24
    .line 25
    iget-object v3, p0, Lax/a0/a$a;->c:Lax/a0/t;

    .line 26
    .line 27
    invoke-direct {v0, v1, v2, v3}, Lax/a0/a;-><init>(ZILax/a0/t;)V

    .line 28
    .line 29
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
