.class public final Lax/P0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/P0/c$d;,
        Lax/P0/c$e;,
        Lax/P0/c$c;,
        Lax/P0/c$b;
    }
.end annotation


# static fields
.field public static final h:Lax/P0/c;

.field private static final i:Ljava/lang/String;

.field private static final j:Ljava/lang/String;

.field private static final k:Ljava/lang/String;

.field private static final l:Ljava/lang/String;

.field private static final m:Ljava/lang/String;

.field private static final n:Ljava/lang/String;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:Z

.field private g:Lax/P0/c$d;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/P0/c$e;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/P0/c$e;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lax/P0/c$e;->a()Lax/P0/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lax/P0/c;->h:Lax/P0/c;

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
    sput-object v0, Lax/P0/c;->i:Ljava/lang/String;

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
    sput-object v0, Lax/P0/c;->j:Ljava/lang/String;

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
    sput-object v0, Lax/P0/c;->k:Ljava/lang/String;

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
    sput-object v0, Lax/P0/c;->l:Ljava/lang/String;

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
    sput-object v0, Lax/P0/c;->m:Ljava/lang/String;

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
    sput-object v0, Lax/P0/c;->n:Ljava/lang/String;

    .line 53
    .line 54
    return-void
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

.method private constructor <init>(IIIIIZ)V
    .registers 7

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lax/P0/c;->a:I

    .line 4
    iput p2, p0, Lax/P0/c;->b:I

    .line 5
    iput p3, p0, Lax/P0/c;->c:I

    .line 6
    iput p4, p0, Lax/P0/c;->d:I

    .line 7
    iput p5, p0, Lax/P0/c;->e:I

    .line 8
    iput-boolean p6, p0, Lax/P0/c;->f:Z

    return-void
.end method

.method synthetic constructor <init>(IIIIIZLax/P0/c$a;)V
    .registers 8

    .line 1
    invoke-direct/range {p0 .. p6}, Lax/P0/c;-><init>(IIIIIZ)V

    return-void
.end method


# virtual methods
.method public a()Lax/P0/c$d;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/P0/c;->g:Lax/P0/c$d;

    .line 2
    .line 3
    if-nez v0, :cond_c

    .line 4
    .line 5
    new-instance v0, Lax/P0/c$d;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lax/P0/c$d;-><init>(Lax/P0/c;Lax/P0/c$a;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lax/P0/c;->g:Lax/P0/c$d;

    .line 12
    .line 13
    :cond_c
    iget-object v0, p0, Lax/P0/c;->g:Lax/P0/c$d;

    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public b()I
    .registers 3

    .line 1
    iget v0, p0, Lax/P0/c;->b:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_7

    .line 6
    .line 7
    return v1

    .line 8
    :cond_7
    iget v0, p0, Lax/P0/c;->c:I

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_1e

    .line 11
    .line 12
    .line 13
    :pswitch_c
    const/4 v0, 0x3

    .line 14
    return v0

    .line 15
    :pswitch_e
    return v1

    .line 16
    :pswitch_f
    const/16 v0, 0xa

    .line 17
    .line 18
    return v0

    .line 19
    :pswitch_12
    const/4 v0, 0x2

    .line 20
    return v0

    .line 21
    :pswitch_14
    const/4 v0, 0x5

    .line 22
    return v0

    .line 23
    :pswitch_16
    const/4 v0, 0x4

    .line 24
    return v0

    .line 25
    :pswitch_18
    const/16 v0, 0x8

    .line 26
    .line 27
    return v0

    .line 28
    :pswitch_1b
    const/4 v0, 0x0

    .line 29
    return v0

    .line 30
    nop

    .line 31
    :pswitch_data_1e
    .packed-switch 0x2
        :pswitch_1b
        :pswitch_18
        :pswitch_16
        :pswitch_14
        :pswitch_12
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_f
        :pswitch_c
        :pswitch_e
    .end packed-switch
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
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_37

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-class v3, Lax/P0/c;

    .line 13
    .line 14
    if-eq v3, v2, :cond_10

    .line 15
    .line 16
    goto :goto_37

    .line 17
    :cond_10
    check-cast p1, Lax/P0/c;

    .line 18
    .line 19
    iget v2, p0, Lax/P0/c;->a:I

    .line 20
    .line 21
    iget v3, p1, Lax/P0/c;->a:I

    .line 22
    .line 23
    if-ne v2, v3, :cond_37

    .line 24
    .line 25
    iget v2, p0, Lax/P0/c;->b:I

    .line 26
    .line 27
    iget v3, p1, Lax/P0/c;->b:I

    .line 28
    .line 29
    if-ne v2, v3, :cond_37

    .line 30
    .line 31
    iget v2, p0, Lax/P0/c;->c:I

    .line 32
    .line 33
    iget v3, p1, Lax/P0/c;->c:I

    .line 34
    .line 35
    if-ne v2, v3, :cond_37

    .line 36
    .line 37
    iget v2, p0, Lax/P0/c;->d:I

    .line 38
    .line 39
    iget v3, p1, Lax/P0/c;->d:I

    .line 40
    .line 41
    if-ne v2, v3, :cond_37

    .line 42
    .line 43
    iget v2, p0, Lax/P0/c;->e:I

    .line 44
    .line 45
    iget v3, p1, Lax/P0/c;->e:I

    .line 46
    .line 47
    if-ne v2, v3, :cond_37

    .line 48
    .line 49
    iget-boolean v2, p0, Lax/P0/c;->f:Z

    .line 50
    .line 51
    iget-boolean p1, p1, Lax/P0/c;->f:Z

    .line 52
    .line 53
    if-ne v2, p1, :cond_37

    .line 54
    .line 55
    return v0

    .line 56
    :cond_37
    :goto_37
    return v1
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
    iget v1, p0, Lax/P0/c;->a:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    mul-int/lit8 v0, v0, 0x1f

    .line 7
    .line 8
    iget v1, p0, Lax/P0/c;->b:I

    .line 9
    .line 10
    add-int/2addr v0, v1

    .line 11
    mul-int/lit8 v0, v0, 0x1f

    .line 12
    .line 13
    iget v1, p0, Lax/P0/c;->c:I

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget v1, p0, Lax/P0/c;->d:I

    .line 19
    .line 20
    add-int/2addr v0, v1

    .line 21
    mul-int/lit8 v0, v0, 0x1f

    .line 22
    .line 23
    iget v1, p0, Lax/P0/c;->e:I

    .line 24
    .line 25
    add-int/2addr v0, v1

    .line 26
    mul-int/lit8 v0, v0, 0x1f

    .line 27
    .line 28
    iget-boolean v1, p0, Lax/P0/c;->f:Z

    .line 29
    .line 30
    add-int/2addr v0, v1

    .line 31
    return v0
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
