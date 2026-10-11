.class final Lax/K1/b$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/K1/b$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/K1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "j"
.end annotation


# instance fields
.field private final a:Lax/S0/G;

.field private final b:I

.field private final c:I

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(Lax/T0/e$c;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lax/T0/e$c;->b:Lax/S0/G;

    .line 5
    .line 6
    iput-object p1, p0, Lax/K1/b$j;->a:Lax/S0/G;

    .line 7
    .line 8
    const/16 v0, 0xc

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lax/S0/G;->b0(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lax/S0/G;->Q()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    and-int/lit16 v0, v0, 0xff

    .line 18
    .line 19
    iput v0, p0, Lax/K1/b$j;->c:I

    .line 20
    .line 21
    invoke-virtual {p1}, Lax/S0/G;->Q()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iput p1, p0, Lax/K1/b$j;->b:I

    .line 26
    .line 27
    return-void
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


# virtual methods
.method public a()I
    .registers 2

    .line 1
    const/4 v0, -0x1

    .line 2
    return v0
    .line 3
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
.end method

.method public b()I
    .registers 2

    .line 1
    iget v0, p0, Lax/K1/b$j;->b:I

    .line 2
    .line 3
    return v0
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
.end method

.method public c()I
    .registers 3

    .line 1
    iget v0, p0, Lax/K1/b$j;->c:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    if-ne v0, v1, :cond_d

    .line 6
    .line 7
    iget-object v0, p0, Lax/K1/b$j;->a:Lax/S0/G;

    .line 8
    .line 9
    invoke-virtual {v0}, Lax/S0/G;->M()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_d
    const/16 v1, 0x10

    .line 15
    .line 16
    if-ne v0, v1, :cond_18

    .line 17
    .line 18
    iget-object v0, p0, Lax/K1/b$j;->a:Lax/S0/G;

    .line 19
    .line 20
    invoke-virtual {v0}, Lax/S0/G;->U()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    return v0

    .line 25
    :cond_18
    iget v0, p0, Lax/K1/b$j;->d:I

    .line 26
    .line 27
    add-int/lit8 v1, v0, 0x1

    .line 28
    .line 29
    iput v1, p0, Lax/K1/b$j;->d:I

    .line 30
    .line 31
    rem-int/lit8 v0, v0, 0x2

    .line 32
    .line 33
    if-nez v0, :cond_2f

    .line 34
    .line 35
    iget-object v0, p0, Lax/K1/b$j;->a:Lax/S0/G;

    .line 36
    .line 37
    invoke-virtual {v0}, Lax/S0/G;->M()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iput v0, p0, Lax/K1/b$j;->e:I

    .line 42
    .line 43
    and-int/lit16 v0, v0, 0xf0

    .line 44
    .line 45
    shr-int/lit8 v0, v0, 0x4

    .line 46
    .line 47
    return v0

    .line 48
    :cond_2f
    iget v0, p0, Lax/K1/b$j;->e:I

    .line 49
    .line 50
    and-int/lit8 v0, v0, 0xf

    .line 51
    .line 52
    return v0
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
