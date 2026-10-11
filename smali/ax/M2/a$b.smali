.class abstract Lax/M2/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/M2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lax/M2/a$a;)V
    .registers 2

    .line 2
    invoke-direct {p0}, Lax/M2/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method abstract a(Lax/M2/a;Lax/M2/a$e;Lax/M2/a$e;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/M2/a<",
            "*>;",
            "Lax/M2/a$e;",
            "Lax/M2/a$e;",
            ")Z"
        }
    .end annotation
.end method

.method abstract b(Lax/M2/a;Ljava/lang/Object;Ljava/lang/Object;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/M2/a<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation
.end method

.method abstract c(Lax/M2/a;Lax/M2/a$i;Lax/M2/a$i;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/M2/a<",
            "*>;",
            "Lax/M2/a$i;",
            "Lax/M2/a$i;",
            ")Z"
        }
    .end annotation
.end method

.method abstract d(Lax/M2/a$i;Lax/M2/a$i;)V
.end method

.method abstract e(Lax/M2/a$i;Ljava/lang/Thread;)V
.end method
