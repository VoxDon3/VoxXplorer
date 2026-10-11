.class public final synthetic Lax/K1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q7/f;


# instance fields
.field public final synthetic q:Lax/K1/h;


# direct methods
.method public synthetic constructor <init>(Lax/K1/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/K1/e;->q:Lax/K1/h;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/K1/e;->q:Lax/K1/h;

    check-cast p1, Lax/K1/t;

    invoke-virtual {v0, p1}, Lax/K1/h;->u(Lax/K1/t;)Lax/K1/t;

    move-result-object p1

    return-object p1
.end method
