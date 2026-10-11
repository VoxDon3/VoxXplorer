.class public final Lax/P0/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Lax/P0/a0;

.field private static final f:Ljava/lang/String;

.field private static final g:Ljava/lang/String;

.field private static final h:Ljava/lang/String;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final d:F


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/P0/a0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, Lax/P0/a0;-><init>(II)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lax/P0/a0;->e:Lax/P0/a0;

    .line 8
    .line 9
    invoke-static {v1}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lax/P0/a0;->f:Ljava/lang/String;

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lax/P0/a0;->g:Ljava/lang/String;

    .line 21
    .line 22
    const/4 v0, 0x3

    .line 23
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lax/P0/a0;->h:Ljava/lang/String;

    .line 28
    .line 29
    return-void
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

.method public constructor <init>(II)V
    .registers 4

    const/high16 v0, 0x3f800000    # 1.0f

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lax/P0/a0;-><init>(IIF)V

    return-void
.end method

.method public constructor <init>(IIF)V
    .registers 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lax/P0/a0;->a:I

    .line 4
    iput p2, p0, Lax/P0/a0;->b:I

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lax/P0/a0;->c:I

    .line 6
    iput p3, p0, Lax/P0/a0;->d:F

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
    instance-of v1, p1, Lax/P0/a0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_20

    .line 9
    .line 10
    check-cast p1, Lax/P0/a0;

    .line 11
    .line 12
    iget v1, p0, Lax/P0/a0;->a:I

    .line 13
    .line 14
    iget v3, p1, Lax/P0/a0;->a:I

    .line 15
    .line 16
    if-ne v1, v3, :cond_20

    .line 17
    .line 18
    iget v1, p0, Lax/P0/a0;->b:I

    .line 19
    .line 20
    iget v3, p1, Lax/P0/a0;->b:I

    .line 21
    .line 22
    if-ne v1, v3, :cond_20

    .line 23
    .line 24
    iget v1, p0, Lax/P0/a0;->d:F

    .line 25
    .line 26
    iget p1, p1, Lax/P0/a0;->d:F

    .line 27
    .line 28
    cmpl-float p1, v1, p1

    .line 29
    .line 30
    if-nez p1, :cond_20

    .line 31
    .line 32
    return v0

    .line 33
    :cond_20
    return v2
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
.end method

.method public hashCode()I
    .registers 3

    .line 1
    const/16 v0, 0xd9

    .line 2
    .line 3
    iget v1, p0, Lax/P0/a0;->a:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    mul-int/lit8 v0, v0, 0x1f

    .line 7
    .line 8
    iget v1, p0, Lax/P0/a0;->b:I

    .line 9
    .line 10
    add-int/2addr v0, v1

    .line 11
    mul-int/lit8 v0, v0, 0x1f

    .line 12
    .line 13
    iget v1, p0, Lax/P0/a0;->d:F

    .line 14
    .line 15
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v0, v1

    .line 20
    return v0
    .line 21
.end method
