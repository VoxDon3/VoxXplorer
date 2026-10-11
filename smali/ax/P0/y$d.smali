.class public Lax/P0/y$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/P0/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/P0/y$d$a;
    }
.end annotation


# static fields
.field public static final i:Lax/P0/y$d;

.field private static final j:Ljava/lang/String;

.field private static final k:Ljava/lang/String;

.field private static final l:Ljava/lang/String;

.field private static final m:Ljava/lang/String;

.field private static final n:Ljava/lang/String;

.field static final o:Ljava/lang/String;

.field static final p:Ljava/lang/String;

.field private static final q:Ljava/lang/String;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/P0/y$d$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/P0/y$d$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lax/P0/y$d$a;->g()Lax/P0/y$d;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lax/P0/y$d;->i:Lax/P0/y$d;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lax/P0/y$d;->j:Ljava/lang/String;

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
    sput-object v0, Lax/P0/y$d;->k:Ljava/lang/String;

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
    sput-object v0, Lax/P0/y$d;->l:Ljava/lang/String;

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
    sput-object v0, Lax/P0/y$d;->m:Ljava/lang/String;

    .line 39
    .line 40
    const/4 v0, 0x4

    .line 41
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lax/P0/y$d;->n:Ljava/lang/String;

    .line 46
    .line 47
    const/4 v0, 0x5

    .line 48
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, Lax/P0/y$d;->o:Ljava/lang/String;

    .line 53
    .line 54
    const/4 v0, 0x6

    .line 55
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Lax/P0/y$d;->p:Ljava/lang/String;

    .line 60
    .line 61
    const/4 v0, 0x7

    .line 62
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sput-object v0, Lax/P0/y$d;->q:Ljava/lang/String;

    .line 67
    .line 68
    return-void
.end method

.method private constructor <init>(Lax/P0/y$d$a;)V
    .registers 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lax/P0/y$d$a;->a(Lax/P0/y$d$a;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lax/S0/d0;->E1(J)J

    move-result-wide v0

    iput-wide v0, p0, Lax/P0/y$d;->a:J

    .line 4
    invoke-static {p1}, Lax/P0/y$d$a;->b(Lax/P0/y$d$a;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lax/S0/d0;->E1(J)J

    move-result-wide v0

    iput-wide v0, p0, Lax/P0/y$d;->c:J

    .line 5
    invoke-static {p1}, Lax/P0/y$d$a;->a(Lax/P0/y$d$a;)J

    move-result-wide v0

    iput-wide v0, p0, Lax/P0/y$d;->b:J

    .line 6
    invoke-static {p1}, Lax/P0/y$d$a;->b(Lax/P0/y$d$a;)J

    move-result-wide v0

    iput-wide v0, p0, Lax/P0/y$d;->d:J

    .line 7
    invoke-static {p1}, Lax/P0/y$d$a;->c(Lax/P0/y$d$a;)Z

    move-result v0

    iput-boolean v0, p0, Lax/P0/y$d;->e:Z

    .line 8
    invoke-static {p1}, Lax/P0/y$d$a;->d(Lax/P0/y$d$a;)Z

    move-result v0

    iput-boolean v0, p0, Lax/P0/y$d;->f:Z

    .line 9
    invoke-static {p1}, Lax/P0/y$d$a;->e(Lax/P0/y$d$a;)Z

    move-result v0

    iput-boolean v0, p0, Lax/P0/y$d;->g:Z

    .line 10
    invoke-static {p1}, Lax/P0/y$d$a;->f(Lax/P0/y$d$a;)Z

    move-result p1

    iput-boolean p1, p0, Lax/P0/y$d;->h:Z

    return-void
.end method

.method synthetic constructor <init>(Lax/P0/y$d$a;Lax/P0/y$a;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lax/P0/y$d;-><init>(Lax/P0/y$d$a;)V

    return-void
.end method


# virtual methods
.method public a()Lax/P0/y$d$a;
    .registers 3

    .line 1
    new-instance v0, Lax/P0/y$d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lax/P0/y$d$a;-><init>(Lax/P0/y$d;Lax/P0/y$a;)V

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

.method public equals(Ljava/lang/Object;)Z
    .registers 9

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    instance-of v1, p1, Lax/P0/y$d;

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
    check-cast p1, Lax/P0/y$d;

    .line 12
    .line 13
    iget-wide v3, p0, Lax/P0/y$d;->b:J

    .line 14
    .line 15
    iget-wide v5, p1, Lax/P0/y$d;->b:J

    .line 16
    .line 17
    cmp-long v1, v3, v5

    .line 18
    .line 19
    if-nez v1, :cond_35

    .line 20
    .line 21
    iget-wide v3, p0, Lax/P0/y$d;->d:J

    .line 22
    .line 23
    iget-wide v5, p1, Lax/P0/y$d;->d:J

    .line 24
    .line 25
    cmp-long v1, v3, v5

    .line 26
    .line 27
    if-nez v1, :cond_35

    .line 28
    .line 29
    iget-boolean v1, p0, Lax/P0/y$d;->e:Z

    .line 30
    .line 31
    iget-boolean v3, p1, Lax/P0/y$d;->e:Z

    .line 32
    .line 33
    if-ne v1, v3, :cond_35

    .line 34
    .line 35
    iget-boolean v1, p0, Lax/P0/y$d;->f:Z

    .line 36
    .line 37
    iget-boolean v3, p1, Lax/P0/y$d;->f:Z

    .line 38
    .line 39
    if-ne v1, v3, :cond_35

    .line 40
    .line 41
    iget-boolean v1, p0, Lax/P0/y$d;->g:Z

    .line 42
    .line 43
    iget-boolean v3, p1, Lax/P0/y$d;->g:Z

    .line 44
    .line 45
    if-ne v1, v3, :cond_35

    .line 46
    .line 47
    iget-boolean v1, p0, Lax/P0/y$d;->h:Z

    .line 48
    .line 49
    iget-boolean p1, p1, Lax/P0/y$d;->h:Z

    .line 50
    .line 51
    if-ne v1, p1, :cond_35

    .line 52
    .line 53
    return v0

    .line 54
    :cond_35
    return v2
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public hashCode()I
    .registers 8

    .line 1
    iget-wide v0, p0, Lax/P0/y$d;->b:J

    .line 2
    .line 3
    const/16 v2, 0x20

    .line 4
    .line 5
    ushr-long v3, v0, v2

    .line 6
    .line 7
    xor-long/2addr v0, v3

    .line 8
    long-to-int v1, v0

    .line 9
    mul-int/lit8 v1, v1, 0x1f

    .line 10
    .line 11
    iget-wide v3, p0, Lax/P0/y$d;->d:J

    .line 12
    .line 13
    ushr-long v5, v3, v2

    .line 14
    .line 15
    xor-long/2addr v3, v5

    .line 16
    long-to-int v0, v3

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-boolean v0, p0, Lax/P0/y$d;->e:Z

    .line 21
    .line 22
    add-int/2addr v1, v0

    .line 23
    mul-int/lit8 v1, v1, 0x1f

    .line 24
    .line 25
    iget-boolean v0, p0, Lax/P0/y$d;->f:Z

    .line 26
    .line 27
    add-int/2addr v1, v0

    .line 28
    mul-int/lit8 v1, v1, 0x1f

    .line 29
    .line 30
    iget-boolean v0, p0, Lax/P0/y$d;->g:Z

    .line 31
    .line 32
    add-int/2addr v1, v0

    .line 33
    mul-int/lit8 v1, v1, 0x1f

    .line 34
    .line 35
    iget-boolean v0, p0, Lax/P0/y$d;->h:Z

    .line 36
    .line 37
    add-int/2addr v1, v0

    .line 38
    return v1
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
