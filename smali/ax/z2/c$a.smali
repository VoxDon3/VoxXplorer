.class public final Lax/z2/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/z2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lax/z2/c$a;

.field private static b:Lax/Fb/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/Fb/l<",
            "-",
            "Lax/z2/c;",
            "+",
            "Lax/z2/c;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Lax/z2/d;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 1
    new-instance v0, Lax/z2/c$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/z2/c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/z2/c$a;->a:Lax/z2/c$a;

    .line 7
    .line 8
    sget-object v0, Lax/z2/c$a$a;->q:Lax/z2/c$a$a;

    .line 9
    .line 10
    sput-object v0, Lax/z2/c$a;->b:Lax/Fb/l;

    .line 11
    .line 12
    new-instance v0, Lax/z2/d;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v1}, Lax/z2/d;-><init>(Lax/A2/m;ILax/Gb/g;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lax/z2/c$a;->c:Lax/z2/d;

    .line 20
    .line 21
    return-void
.end method

.method private constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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


# virtual methods
.method public final a()Lax/z2/c;
    .registers 3

    .line 1
    sget-object v0, Lax/z2/c$a;->b:Lax/Fb/l;

    .line 2
    .line 3
    sget-object v1, Lax/z2/c$a;->c:Lax/z2/d;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lax/Fb/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lax/z2/c;

    .line 10
    .line 11
    return-object v0
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
