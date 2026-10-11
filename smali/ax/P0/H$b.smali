.class public final Lax/P0/H$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/P0/H;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/P0/H$b$a;
    }
.end annotation


# static fields
.field public static final b:Lax/P0/H$b;

.field private static final c:Ljava/lang/String;


# instance fields
.field private final a:Lax/P0/r;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/P0/H$b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/P0/H$b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lax/P0/H$b$a;->e()Lax/P0/H$b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lax/P0/H$b;->b:Lax/P0/H$b;

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
    sput-object v0, Lax/P0/H$b;->c:Ljava/lang/String;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method

.method private constructor <init>(Lax/P0/r;)V
    .registers 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/P0/H$b;->a:Lax/P0/r;

    return-void
.end method

.method synthetic constructor <init>(Lax/P0/r;Lax/P0/H$a;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lax/P0/H$b;-><init>(Lax/P0/r;)V

    return-void
.end method

.method static synthetic a(Lax/P0/H$b;)Lax/P0/r;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/P0/H$b;->a:Lax/P0/r;

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
.method public b(I)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/P0/H$b;->a:Lax/P0/r;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/P0/r;->a(I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method public equals(Ljava/lang/Object;)Z
    .registers 3

    .line 1
    if-ne p0, p1, :cond_4

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_4
    instance-of v0, p1, Lax/P0/H$b;

    .line 6
    .line 7
    if-nez v0, :cond_a

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_a
    check-cast p1, Lax/P0/H$b;

    .line 12
    .line 13
    iget-object v0, p0, Lax/P0/H$b;->a:Lax/P0/r;

    .line 14
    .line 15
    iget-object p1, p1, Lax/P0/H$b;->a:Lax/P0/r;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lax/P0/r;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
    .line 22
.end method

.method public hashCode()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/P0/H$b;->a:Lax/P0/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/P0/r;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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
