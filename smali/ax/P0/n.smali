.class public final Lax/P0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/P0/n$b;
    }
.end annotation


# static fields
.field public static final e:Lax/P0/n;

.field private static final f:Ljava/lang/String;

.field private static final g:Ljava/lang/String;

.field private static final h:Ljava/lang/String;

.field private static final i:Ljava/lang/String;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/P0/n$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lax/P0/n$b;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lax/P0/n$b;->e()Lax/P0/n;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lax/P0/n;->e:Lax/P0/n;

    .line 12
    .line 13
    invoke-static {v1}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lax/P0/n;->f:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lax/P0/n;->g:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v0, 0x2

    .line 27
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lax/P0/n;->h:Ljava/lang/String;

    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lax/P0/n;->i:Ljava/lang/String;

    .line 39
    .line 40
    return-void
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

.method private constructor <init>(Lax/P0/n$b;)V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lax/P0/n$b;->a(Lax/P0/n$b;)I

    move-result v0

    iput v0, p0, Lax/P0/n;->a:I

    .line 4
    invoke-static {p1}, Lax/P0/n$b;->b(Lax/P0/n$b;)I

    move-result v0

    iput v0, p0, Lax/P0/n;->b:I

    .line 5
    invoke-static {p1}, Lax/P0/n$b;->c(Lax/P0/n$b;)I

    move-result v0

    iput v0, p0, Lax/P0/n;->c:I

    .line 6
    invoke-static {p1}, Lax/P0/n$b;->d(Lax/P0/n$b;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lax/P0/n;->d:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lax/P0/n$b;Lax/P0/n$a;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lax/P0/n;-><init>(Lax/P0/n$b;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    instance-of v1, p1, Lax/P0/n;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_a

    .line 9
    .line 10
    return v2

    .line 11
    :cond_a
    check-cast p1, Lax/P0/n;

    .line 12
    .line 13
    iget v1, p0, Lax/P0/n;->a:I

    .line 14
    .line 15
    iget v3, p1, Lax/P0/n;->a:I

    .line 16
    .line 17
    if-ne v1, v3, :cond_29

    .line 18
    .line 19
    iget v1, p0, Lax/P0/n;->b:I

    .line 20
    .line 21
    iget v3, p1, Lax/P0/n;->b:I

    .line 22
    .line 23
    if-ne v1, v3, :cond_29

    .line 24
    .line 25
    iget v1, p0, Lax/P0/n;->c:I

    .line 26
    .line 27
    iget v3, p1, Lax/P0/n;->c:I

    .line 28
    .line 29
    if-ne v1, v3, :cond_29

    .line 30
    .line 31
    iget-object v1, p0, Lax/P0/n;->d:Ljava/lang/String;

    .line 32
    .line 33
    iget-object p1, p1, Lax/P0/n;->d:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1, p1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_29

    .line 40
    .line 41
    return v0

    .line 42
    :cond_29
    return v2
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

.method public hashCode()I
    .registers 3

    .line 1
    const/16 v0, 0x20f

    .line 2
    .line 3
    iget v1, p0, Lax/P0/n;->a:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    mul-int/lit8 v0, v0, 0x1f

    .line 7
    .line 8
    iget v1, p0, Lax/P0/n;->b:I

    .line 9
    .line 10
    add-int/2addr v0, v1

    .line 11
    mul-int/lit8 v0, v0, 0x1f

    .line 12
    .line 13
    iget v1, p0, Lax/P0/n;->c:I

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget-object v1, p0, Lax/P0/n;->d:Ljava/lang/String;

    .line 19
    .line 20
    if-nez v1, :cond_17

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    goto :goto_1b

    .line 24
    :cond_17
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    :goto_1b
    add-int/2addr v0, v1

    .line 29
    return v0
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
